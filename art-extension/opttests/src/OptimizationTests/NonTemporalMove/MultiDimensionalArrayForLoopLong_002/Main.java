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

package OptimizationTests.NonTemporalMove.MultiDimensionalArrayForLoopLong_002;


// No non temporal move expected because accessing (aget) outer array in the loop 

public class Main {                                                              
    final int iterations = 133000;

    public long checkSum(long[] tab, int n) {
        long s = 0;
        for (int i = 0; i < n ; i++) {
            s = s + tab[i];
        }
        return s;
    }


    public long testLoop(long[][] tab) {
        for (int i = 0; i < 10; i++) {
            for (int j=0; j < iterations; j++) {
                tab[i][j] = j;
            }
        }
        return checkSum(tab[0], iterations);
    }

    public void test()
    {
        long[][] tab = new long[10][iterations];
        System.out.println(testLoop(tab));
    }

    public static void main(String[] args)
    {
        new Main().test();
    }

}  

