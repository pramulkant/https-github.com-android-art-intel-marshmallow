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

package OptimizationTests.NonTemporalMove.AccessArrayElementsInt_001;

//no non-temporal move expected: accessing array within loop

public class Main {                                                                                                                                                   
    final int iterations = 0x40000;

    public long testLoop(int[] tab) {
        int s = 0;
        for (int i = 0; i < iterations; i++) {
            tab[i] = i;
            s = s + tab[i/2]%2;
        }
        return s;
    }

    public void test()
    {
        int[] tab = new int[iterations];
        System.out.println(testLoop(tab));
    }

    public static void main(String[] args)
    {
        new Main().test();
    }

}  

