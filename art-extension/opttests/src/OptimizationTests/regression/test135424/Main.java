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

// Generated by Dalvik Fuzzer tool (3.1.000). Sun Sep  1 03:04:14 2013
package OptimizationTests.regression.test135424;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static void main(String[] gh) {

        boolean q5r = true, z5 = false;
        int n = -16409, gio = 41923, ys9 = -40563, m2x = 39294, lz = 64376, g = -64556, vy = -63937, nv = -44931, yid = 62213, k = -26524, fq = 3594, uc = 46928, go = -61674, a[] = new int[N], cu[] = new int[N];
        short c = 592;
        byte jn7 = -30;
        long xs8 = -2377489228265862448L, y = 2140497602337219625L, ph[] = new long[N];

        init(a, 18614);
        init(cu, -30420);
        init(ph, 4196321253209251649L);

        n = 19;
        do {
            for (int t : a) {
                // Test integer division optimization
                try {
                    gio = (-2001360242 / n);
                    gio = (ys9 / cu[(gio >>> 1) % N]);
                    lz = (1235915005 / m2x);
                } catch (ArithmeticException a_e) {
                }
            }
            m2x = (gio << (-(m2x * g)));
            for (vy = 1; vy < 20; ++vy) {
                jn7 += (byte) (nv >> (g = (jn7 % ((ys9 >>> 1) + 1))));
                m2x <<= (c + ((yid - k) / (((k = gio) >>> 1) + 1)));
                xs8 += y;
                lz = 24321;
                ph[vy] -= g;
            }
            ys9 >>= yid;
        } while (--n > 0);
        for (fq = 1; fq < 19; ++fq) {
            g -= ((ys9 ^ (c + k)) % (((gio / (((-(nv - k)) >>> 1) + 1)) >>> 1) + 1));
            a[fq + 1] = (int) ((-y) - (n - (-(uc - go))));
            if (q5r = z5)
                continue;
        }

        System.out.println("boolean: " + q5r + "," + z5);
        System.out.println("int: " + n + "," + gio + "," + ys9 + "," + m2x
                + "," + lz + "," + g + "," + vy + "," + nv + "," + yid + ","
                + k + "," + fq + "," + uc + "," + go + "," + checkSum(a) + ","
                + checkSum(cu));
        System.out.println("short: " + c);
        System.out.println("byte: " + jn7);
        System.out.println("long: " + xs8 + "," + y + "," + checkSum(ph));

    }
}
