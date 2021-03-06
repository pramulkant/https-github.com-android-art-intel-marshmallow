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

package OptimizationTests.FormBottomLoops.BottomTested_02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * Simplest cases for loops that are already bottom tested
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

        int[] getArr() {
            return arr;
        }

        int[] modifyAndGetArr() {
            arr[0] = 100;
            return arr;
        }

        int[] zeroAndReturn(int x) {
            arr[x] = 0;
            return arr;
        }


    }

    public int foo(int x) {
        for (int i = 0; i < iterations; i++) {
            x = x + i/2;
        }
         return x;
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

    public int sideEffectFunc(int x) {
        count++;
        return x + count;

    }


    /* Positive: already bottom test loop can have > 2 HPhi instructions at the top of the loop (More than 2 loop phis) */
    public int test13(int n) {
        int testVar = 0;
        int additionalVar1 = 1;
        int additionalVar2 = -1;
        int additionalVar3 = 0;
        int additionalVar4 = 20000;
        int additionalVar5 = -123456;
        int i = 0;
        additionalVar1++;
        do {
            testVar += 5 -  n/2 + i/2;
            additionalVar1 += i%2 + n%3;
            additionalVar2 += i*n;
            additionalVar3 += i - n;
            i++;

        } while (i < iterations);
        additionalVar3--;
        return testVar + additionalVar1 + additionalVar2 - additionalVar3 + additionalVar4 - additionalVar5;
    }

    /* Positive: several assignments of same var inside loop */
    public int test14(int n) {
        int testVar = 0;

        long i = -1L;
        do {
            testVar += 5 + n/2 + i/2;
            testVar -= n*i/100;
            testVar++;
            testVar--;
            i = i + 2L;
        } while (i < iterations);

        return testVar;
    }


    /* Positive: many sotres to class fields, 2 HPhi instructions at the top of the loop */
    public int test15(int n) {
        int testVar = 0;
        int additionalVar1 = 1;
        int additionalVar2 = -1;
        int additionalVar3 = 57;
        int additionalVar4 = 20000;
        int additionalVar5 = -123456;

        MyClass c = new MyClass(100);

        additionalVar1++;
        double i = -1.2345d;
        do {
            testVar += 5 -  n/2 + i/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  (int)i + additionalVar1;
            c.value1 = (int)i%2 + n%3 - additionalVar2;
            c.value2 = (int)i*n + additionalVar3;
            c.value3 = (int)i - n + additionalVar4;
            i *= -1.23456789d;
        } while (i < iterations);
        additionalVar3--;
        return testVar + additionalVar1 + additionalVar2 - additionalVar3 + additionalVar4 - additionalVar5 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    }


    /* Positive: call to function with try-catch in loop header and body*/
    public int test16(int n) {
        int testVar = 0;
        int additionalVar1 = 1;
        int additionalVar2 = -1;
        int additionalVar3 = 57;
        int additionalVar4 = 20000;
        int additionalVar5 = -123456;

        MyClass c = new MyClass(100);

        additionalVar1++;
        int i = 0;
        do {
            testVar += tryDiv(5, (i-1)) -  n/2 + i/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  i + additionalVar1;
            i+=1;

        } while (i < tryDiv(iterations, i+1));
        additionalVar3--;
        return testVar + additionalVar1 + additionalVar2 - additionalVar3 + additionalVar4 - additionalVar5 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    }

    /* Positive: two loops */
    public int test17(int n) {
        int testVar = 0;
        int additionalVar1 = 1;
        int additionalVar2 = -1;
        int additionalVar3 = 57;
        int additionalVar4 = 20000;
        int additionalVar5 = -123456;

        MyClass c = new MyClass(100);

        additionalVar1++;
        int i = -3;
        for (; ; ) {
            testVar += 5 -  n/2 + i/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  i++ + testVar;
            if (i >= iterations) break;

        }
        additionalVar3--;
        i = n;
        do {
            testVar += 3 -  n/2 + (i++)/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  i + additionalVar2;

        } while (i < iterations);
        testVar = testVar - 7;

        return testVar + additionalVar1 + additionalVar2 - additionalVar3 + additionalVar4 - additionalVar5 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    }

    /* Positive: several loops, some of them are inside if-else */
    public int test18(int n) {
        int testVar = 0;
        int additionalVar1 = 1;
        int additionalVar2 = -1;
        int additionalVar3 = 57;
        int additionalVar4 = 20000;
        int additionalVar5 = -123456;

        MyClass c = new MyClass(100);
        MyClass c1 = new MyClass(200);

        additionalVar1++;
        
        int i = 0;
        do {
            testVar += 5 -  n/2 + i/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  i + testVar;
            i++;
        } while  (i < iterations);

        
        additionalVar3 = additionalVar3 + n;
        if (additionalVar3 < 100) {
            i = 0;
            do {
                testVar += 3 -  n/2 + i/2 + additionalVar1 - additionalVar2 + additionalVar3;
                c.value +=  i + additionalVar1;
                if (i++ >= iterations) break;

            } while (true);
        } else {
            i = 1;
            while (true) {
                testVar += 3 -  n/2 + i/2 + additionalVar2 + additionalVar3;
                c.value +=  i + additionalVar1 + foo(i);
                c1.value = c.value;
                if (i++ >= iterations) break;

            }
        }
        testVar = testVar - 7 - c.value;;

        for (int k = foo(n/10)*foo(n/2); ; ) {
            testVar += 5 -  n/2 + k/2 + additionalVar1 - additionalVar2 + additionalVar3 - additionalVar4;
            c.value +=  k + foo(testVar);
            if (k++ >= iterations) break;

        }


        return testVar + additionalVar1 + additionalVar2 - additionalVar3 + additionalVar4 - additionalVar5 + c.arr[0] + c.value2 - c.value3 + c1.value/2;
    }



 
    /* Positive: initial IV value uses function invocation with side effect*/
    public int test19(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

        int i = sideEffectFunc(n);
        do {
            testVar += 5 -  n/2 + i/2 + additionalVar1;
            c.value +=  i + foo(testVar);
             i += count;

        } while (i < iterations);

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    } 

    /* Positive:  IV increment value uses function invocation with side effect*/
    public int test20(int n) {
        int testVar = 0;
        int additionalVar1 = 1;


        MyClass[] cc = new MyClass[iterations];

        int i = sideEffectFunc(n);
        do {
            cc[i] = new MyClass(i);
            cc[i].value = i;
            cc[i].arr[0] = i/2;
            testVar += 5 -  n/2 + i/2 + cc[i].value1;
            i += sideEffectFunc(count);

        } while (i < iterations);

        return testVar + additionalVar1 + cc[n+2].arr[0] + cc[n+2].value2 - cc[n+2].value3 + cc[n+2].value1/2;
    } 

    /* Positive: integer overflow within loop */
    public int test21(int n) {
        int testVar = 3;
        int additionalVar = Integer.MAX_VALUE/2;

        int i = 0;
        do {
            testVar *= (5 +  n/2 + i/3 + additionalVar);
            i++;
        } while ( i < Integer.MAX_VALUE/2);
        return testVar + additionalVar;
    }

/* Positive: unkown number of iteration at compile time, no iterations will occur with n=10*/
    public int test22(int n) {


        int testVar = 0;
        int additionalVar1 = 1;


        MyClass[] cc = new MyClass[iterations];
        cc[0] = new MyClass(100);

        int i = sideEffectFunc(n); 
        do {
            i += sideEffectFunc(count);
            cc[i] = new MyClass(i);
            cc[i].value = i;
            cc[0].value = i - 1;
            cc[i].arr[0] = i/2;
            testVar += 5 -  n/2 + i/2 + cc[i].value1;

        } while (i < n);

        return testVar + additionalVar1 + cc[0].arr[0] + cc[0].value2 - cc[0].value3 + cc[0].value1/2;


    }



    /* Positive:  count down loop */
    public int test23(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

        int i = iterations;
        do {
            int k = i - 1;
            testVar += 5 -  n/2 + k/2 + additionalVar1;
            c.value +=  k + foo(testVar);
            i = k - 2;

        } while ( i >=0);

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
    }

    /* Positive: count down loop */
    public int test24(int n) {
        int testVar = 0;
        int additionalVar1 = 1;

        MyClass c = new MyClass(100);

        for (int i = foo(-n); ; ) {
            testVar += 5 -  n/2 + i/2 + additionalVar1;
            c.value +=  i + foo(testVar);
             i = i - c.arr[1];
            if (!(i >=  -iterations - count -c.arr[2])) break;

        }

        return testVar + additionalVar1 + c.arr[0] + c.value2 - c.value3 + c.value1/2;
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

