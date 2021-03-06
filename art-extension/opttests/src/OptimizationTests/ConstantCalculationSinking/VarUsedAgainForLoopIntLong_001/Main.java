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

package OptimizationTests.ConstantCalculationSinking.VarUsedAgainForLoopIntLong_001;

/**
  *
  * No sinking expected because variable is used again in the loop
  *
  **/

public class Main {                                                                                                                                                   
    final int iterations = 1101;

    public int testLoopAddInt() {
        int testVar = 151;

        for (int i = 0; i < iterations; i++) {
            testVar += 5;
            testVar += 5;
        }

        return testVar;
    }

    public int testLoopSubInt() {
        int testVar = 151;

        for (int i = 0; i < iterations; i++) {
            testVar -= 5;
            testVar -= 5;
        }

        return testVar;
    }

    public long testLoopSubLong() {
        long testVar = 151;

        for (long i = 0; i < iterations; i++) {
            testVar -= 5;
            testVar -= 5;
        }

        return testVar;
    }

    public int testLoopMulInt(int n) {
        int testVar = 1;
        int additionalVar = 1;
        for (int i = 0; i < 9; i++) {
            testVar *= 3;
            testVar *= 3;
            additionalVar += i%2 + i%3 + i%4+ i%5 + i%6 + i%7 + i%8 + i%9 + i%10 + n;
        }

        return testVar + additionalVar;
    }

    public long testLoopMulLong(long n) {
        long testVar = 1;
        long additionalVar = 1;
        for (long i = 0; i < 9; i++) {
            testVar *= 3;
            testVar *= 3;
            additionalVar += i%2 + i%3 + i%4+ i%5 + i%6 + i%7 + i%8 + i%9 + i%10 + n;
        }

        return testVar + additionalVar;
    }

    public int testLoopDivInt() {
        int testVar = 151;

        for (int i = 0; i < iterations; i++) {
            testVar /= 5;
            testVar /= 5;
        }

        return testVar;
    }

    public long testLoopDivLong() {
        long testVar = 151;

        for (long i = 0; i < iterations; i++) {
            testVar /= 5;
            testVar /= 5;
        }

        return testVar;
    }

    public int testLoopRemInt() {
        int testVar = 151;

        for (int i = 0; i < iterations; i++) {
            testVar %= 5;
            testVar %= 5;
        }

        return testVar;
    }

    public long testLoopRemLong() {
        long testVar = 151;

        for (long i = 0; i < iterations; i++) {
            testVar %= 5;
            testVar %= 5;
        }

        return testVar;
    }

    public long testLoopAddLong() {
        long testVar = 151;

        for (long i = 0; i < iterations; i++) {
            testVar += 5;
            testVar += 5;
        }

        return testVar;
    }

    public static void main(String[] args)
    {
         System.out.println(new Main().testLoopAddInt());
System.out.println(new Main().testLoopAddLong());
System.out.println(new Main().testLoopRemLong());
System.out.println(new Main().testLoopRemInt());
System.out.println(new Main().testLoopDivLong());
System.out.println(new Main().testLoopDivInt());
System.out.println(new Main().testLoopMulLong(10));
System.out.println(new Main().testLoopMulInt(10));
System.out.println(new Main().testLoopSubLong());
System.out.println(new Main().testLoopSubInt());
    }

}  

