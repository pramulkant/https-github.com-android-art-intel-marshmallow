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

// Generated by Dalvik Fuzzer tool (2.1.003). Sun Sep  8 03:58:24 2013

package OptimizationTests.regression.test136813_1;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static void main(String[] l8) {

        int ym = -63458, kzp = -55361, xfv = -5783, w2 = -60973, s = -43349, q2 = -51927, v = 11894, qq = 6359, hb = 12992, x = 30663, j = -3282, z[] = new int[N], mt[][] = new int[N][N], n[][] = new int[N][N];
        short h[][] = new short[N][N];
        long cjs[] = new long[N];

        init(z, 13607);
        init(mt, 38549);
        init(cjs, 1433033372525075242L);
        init(n, -42170);
        init(h, (short) -3325);

        for (ym = 18; ym > 1; --ym) {
            kzp += (int) (z[ym - 1]);
            kzp -= (int) (--xfv);
            for (w2 = 1; w2 < 11; ++w2) {
                mt[w2][w2 - 1] -= (int) (s--);
            }
            z[ym - 1] = (int) (33190 + 63261);
        }

        for (q2 = 1; q2 < 12; ++q2) {
            v += (int) (++qq);
        }

        for (hb = 1; hb < 10; hb++) {
            s -= (int) (cjs[hb]);
            qq = (int) (mt[hb][hb - 1]);
            v -= (int) (x--);
        }

        for (j = 1; j < 27; j++) {
            s += (int) (n[j][j]);
            h[j][j + 1] = (short) (z[j]);
        }

        System.out.println("int: " + ym + "," + kzp + "," + xfv + "," + w2
                + "," + s + "," + q2 + "," + v + "," + qq + "," + hb + "," + x
                + "," + j + "," + checkSum(z) + "," + checkSum(mt) + ","
                + checkSum(n));
        System.out.println("short: " + checkSum(h));
        System.out.println("long: " + checkSum(cjs));
    }
}