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

package OptimizationTests.UnusedLoopRemoval.Invariants_F_02;

public class Main {

    // M: negative (loop is not countable)
    // Test a loop with invariants, which should be hoisted 

    public int loop() {
        float used1 = 1;
        float used2 = 2;
        float used3 = 3;
        float used4 = 4;
        float invar1 = 15;
        float invar2 = 25;
        float invar3 = 35;
        float invar4 = 45;
        
        float i = 123.51f;

        do {
            used1 += invar1 + invar2;
            used2 *= invar2 - invar3;
            used3 /= invar3 * invar4;
            used4 -= invar1 * invar2 - invar3 + invar4;
            i += 0.12345f;
        } while (i < 216.54321f);
        return Float.floatToIntBits(used1 + used2 + used3 + used4);
    }

    public static void main(String[] args) {
        int res = new Main().loop();
        System.out.println(res);
    }
}
