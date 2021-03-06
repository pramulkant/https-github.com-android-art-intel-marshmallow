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

package OptimizationTests.NonTemporalMove.LoopBoundsInt_001;


// No non temporal move because non-constant bound

public class Main {                                                                                                                                                   

    final int iterations = 0x40000;

    public long checkSum(int[] tab, int n) {
        long s = 0;
        for (int i = 0; i < n ; i++) {
            s = s + tab[i];
        }
        return s;
    }


    public long testLoop(int[] tab, int n) {
        if (n == iterations) {
            for (int i = 0; (i < n) ; i++) {
                tab[i] = i;
            }
        }
        return checkSum(tab, n);
    }

    public void test()
    {
        int[] tab = new int [iterations];
        System.out.println(testLoop(tab, iterations));
    }

    public static void main(String[] args)
    {
        new Main().test();
    }

}  

