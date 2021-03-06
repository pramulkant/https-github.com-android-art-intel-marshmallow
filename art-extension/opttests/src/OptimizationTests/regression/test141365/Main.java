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

// Generated by Dalvik Fuzzer tool (3.1.001). Mon Sep 23 22:43:22 2013

package OptimizationTests.regression.test141365;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static void main(String[] j) {

        boolean op = true, i1f = true, f9p = true, oo = false;
        int li = 43746, mq2 = 33017, rgl = 42819, wkc = 1796, fs = 6714, d = 15030, w = -48461, a4 = 21764, v5 = -60783, q = -56054, ad = 62897, vcu = -55838, o = 52923, ihl[] = new int[N];
        byte qc = 82, a[] = new byte[N];
        short g0 = -23708, uw = 13750;
        double au = -73.934, vp5[] = new double[N], x1;
        long n = 1855549248397531066L, f = 6785431694825344368L, dz = -7464988296532489260L, p8m = 8202024223320549143L, js1 = -9119154313037627475L, h[] = new long[N], n0t[][] = new long[N][N], x[] = new long[N];

        init(vp5, 92.814);
        init(h, -273750330958250840L);
        init(ihl, -33284);
        init(a, (byte) 2);
        init(n0t, 2816044237855619253L);
        init(x, -7353445447077308516L);

        for (li = 1; li < 11; li++) {
            x1 = (((long) ((--g0) * vp5[li - 1]) >>> 1) + 1);
            au /= x1;
            System.out.println(li + ") au: " + au);
            if (i1f = (((-52043 - (-116.630 - (15.221 * (d | w)))) >= (-(1714887063992608667L + (q % ((vcu >>> 1) + 1))))) && ((au <= o) != (f9p = oo)))) {
                for (mq2 = li; mq2 < 5; ++mq2) {
                    n /= ((h[mq2 + 1] >>> 1) + 1);
                }
                rgl *= (int) (((-23837 + (wkc += fs)) - (qc - f)) * (ihl[li] -= (int) (97.128F - (wkc * wkc))));
                for (byte wj : a) {
                    for (d = li; d < 9; ++d) {
                        w = fs;
                        ihl[li + 1] <<= (int) (mq2 - (~(rgl / ((dz >>> 1) + 1))));
                        op = false;
                        qc = (byte) (++a4);
                        f = ((uw - n0t[li][li - 1]) + v5);
                    }
                    w %= (((-(rgl + -14410)) >>> 1) + 1);
                }
                p8m = (((q--) * (56598 << qc)) * (ad = wkc));
            } else {
                x[li + 1] -= (js1--);
            }
        }
    }
}
