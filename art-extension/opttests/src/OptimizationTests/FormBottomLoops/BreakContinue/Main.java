/*
 * Copyright (C) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package OptimizationTests.FormBottomLoops.BreakContinue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 *
 * Simplest cases with break/continue statements 
 *
 **/

public class Main {                                                                                                                                                   
    final int iterations = 1100;

    int count = 0;

    class MyClass {
        int value = 0;
        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int[] arr;
        public MyClass(int x) {
            value = x;
            value1 = x/2;
            value2 = x*3;
            value3 = x%4;
            arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = i*x/2;
            }

        }
        
        int[] zeroAndReturn(int x) {
            arr[x] = 0;
            return arr;
        }


        int bar (int x) {
            return arr[x] > 0 ? x : 0;
        }

    }



    public int tryDiv(int x, int y) {
        int res = 0;
        try {
            res = x/y;
        } catch (Exception e) {
            System.out.println("Exception when dividing " + x + " by " + y);
            res = x/(y+1);
        }
        return res;

    }

    public int foo(int x) {
        for (int i = 0; i < iterations; i++) {
            x = x + i/2;
        }
         return x;
    }



    public int sideEffectFunc(int x) {
        count++;
        return x + count;

    }


    public int randomInt(int min, int max) {
            Random rand = new Random();
            int result = rand.nextInt((max - min) + 1) + min;
                return result;
    }


 
    /* Negative: break inside loop -> too many or too few exits */
    public int test1(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

        for (int i = 0; i < iterations; i++) {
            testVar += 5 -  n/2 + i/2 + additionalVar1;
            if (testVar > 50) {
                c.value +=  i + foo(testVar);
                break;
            } else {
                c.value +=  i - foo(testVar);
            }

        }

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    } 

    /* Positive: 1 continue statement doesn't break opt limitations; if inside loop, count down loop */
    public int test2(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

        for (int i = foo(-n); i >=  -iterations - count -c.arr[2]; i = i - c.arr[1]) {
            testVar += 5 -  n/2 + i/2 + additionalVar1;
             if (testVar > 50) {
                testVar +=  i + foo(testVar);
                continue;
             }
           c.value +=  i + foo(testVar);
           i--;
           testVar++;

        }

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    } 

    /* Negative: labeled continue statement -> Too many or too few exit blocks; if inside loop, i is modified inside if */
    public int test3(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

mylabel:
        for (int j = 0; j < n; j++) {
            testVar += j;
            for (int i = 0; i < iterations; i++) {
                testVar += 5 -  n/2 + i/2 + additionalVar1;
                if (testVar > 50) {
                    c.value +=  i + foo(testVar);
                    i++;
                    testVar += 3;
                    continue mylabel;
                } else {
                    c.value +=  i - foo(testVar);
                    i = i + additionalVar1;
                }
                testVar += c.value;
                testVar--;

            }
        }

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    }

    /* Negative: break inside loop -> too many or too few exits */
    public int test4(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(10*n);
        MyClass c1 = new MyClass(n);

        boolean[] bb = new boolean[n];

        for (int i = 0; i < c.zeroAndReturn(n).length; i++) {
            if (new MyClass(i+1).arr[i/2] > 2) {
                c1 = new MyClass(i++);
            } else {
                c1 = new MyClass(i+2);
                break;
            }
            c1.value +=  i - foo(testVar);
            i = i + additionalVar1;
            bb[i%n] = false;

        }

        return testVar + additionalVar1 + c1.arr[0] + c1.value2 - c1.value3 + c1.value1/2;
    }

    /* Negative:  break inside loop -> too many or too few exits */
    public int test5(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(n);
        MyClass c1 = new MyClass(n);

        boolean[] bb = new boolean[n];

        for (int i = 0; i < c.zeroAndReturn(n-1).length; i++) {
            if (i++ < 3) {
                if (c.arr[i] > 10) {
                    //        c1 = new MyClass(i++);
                    bb[i%n] = true;
                    c1.value++;
                } else {

                        c1.value +=  i - foo(testVar);
                        i = i + additionalVar1;
                        bb[i%n] = false;
                        break;
                    }
                }
            }


        return testVar + additionalVar1 + c1.arr[0] + c1.value2 - c1.value3 + c1.value1/2;
    }

    /* Negative:  complex if condition results in more than 5 basic blocks in the loop: optimization limitation */
    public int test7(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(n);
        MyClass c1 = new MyClass(n);

        boolean[] bb = new boolean[n];

        for (int i = 0; i < c.zeroAndReturn(n-1).length; i++) {
            if (i++ < 3 || sideEffectFunc(i) == 11) {
                if (c.arr[i] > 10) {
                    //        c1 = new MyClass(i++);
                    bb[i%n] = true;
                    c1.value += count;
                } else {

                        c1.value +=  i - foo(testVar);
                        i = i + additionalVar1;
                        bb[i%n] = false;
                        continue;
                    }
                }
            }


        return testVar + additionalVar1 + c1.arr[0] + c1.value2 - c1.value3 + c1.value1/2 + count;
    }


    /* Negative:  break inside loop -> too many or too few exits  */
    public int test6(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(10*n);
        MyClass c1 = new MyClass(n);

        boolean[] bb = new boolean[n];

        int i = 0;
        if (c1.arr[n-1] > 1 ) {
            while(i < c.zeroAndReturn(n).length ) {
                c1 = new MyClass(i++);
                c1.value +=  i - foo(testVar);
                i = i++ + additionalVar1;
                bb[i%n] = (c1.value == foo(i));
                if (i > c.zeroAndReturn(n).length ) break;

            }
        }

        return testVar + additionalVar1 + c1.arr[0] + c1.value2 - c1.value3 + c1.value1/2;
    }



    public void runTests() {
        Class c = new Main().getClass();
        Method[] methods = c.getDeclaredMethods();
        Method tempMethod;
        for (int i = 1; i < methods.length; i++) {
            int j = i;
            while (j > 0 &&  methods[j-1].getName().compareTo(methods[j].getName()) > 0) {
                tempMethod = methods[j];
                methods[j] = methods[j-1];
                methods[j-1] = tempMethod;
                j = j - 1;
            }
        }

        Object[] arr = {null};
        for (Method m: methods){
            if (m.getName().startsWith("test")){
                try {
                    String names[] = c.getPackage().getName().split("\\.");
                    String testName = names[names.length-1];
                    System.out.println("Test "+testName+"; Subtest "+m.getName()+"; Result: "+ m.invoke(this, 10));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    public static void main(String[] args)
    {
        new Main().runTests();
    }


}  

