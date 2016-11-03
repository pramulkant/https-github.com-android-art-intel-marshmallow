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

// Generated by Dalvik Fuzzer tool (2.1.003). Mon Aug  4 21:12:46 2014
package OptimizationTests.regression.test215179;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static long a_check_sum = 0;
static int statIntField = 3;
static void statSet(int value) {statIntField = value;}

public static long a(int god, int ty0, long la) {

    char n[]=new char[N];
    int wpa=-3906, wh=-25120, zpe=-26793, k=13260, tz=50829, djj[][]=new int[N][N], vvu[][]=new int[N][N];
    short b2f[][]=new short[N][N];
    long o[]=new long[N];

    init(n, (char)14701);
    init(djj, -24690);
    init(b2f, (short)20142);
    init(vvu, 22785);
    init(o, -8649537932730284867L);

    int p = 11;
    do {
        for (wpa = 12; wpa > 1; wpa--) {
            for (wh = wpa; wh < 7; ++wh) {
                for (zpe = wpa; zpe < wh; ++zpe) {
                    n[zpe+1] = (char)((djj[wh][wpa]) + 12938);
                }
            }
            for (k = 1; k < 5; k++) {
                ty0 *= (int)(b2f[k+1][k]);
                if (tz > 0) break;
                vvu[wpa+1][wpa-1] = (int)(o[k+1]);
            }
        }
    } while ( --p > 0 );

    long meth_res = god + ty0 + la + wpa + wh + zpe + k + tz + checkSum(n) + checkSum(djj) + checkSum(b2f) +
        checkSum(vvu) + checkSum(o);
    a_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] og) {

    char thw[]=new char[N];
    int r=-21890, m=30846, w=46165, fs=557, w4=57802, ey=-40240, hca=11811, b=49055, hn=-51197, kd1[]=new int[N],
        mk[]=new int[N], s[][]=new int[N][N], cq[]=new int[N], w9[]=new int[N], k5f[][]=new int[N][N];
    long y[][]=new long[N][N], ak[][]=new long[N][N], l[]=new long[N];

    init(thw, (char)14727);
    init(y, -5449747909190485667L);
    init(kd1, -61179);
    init(mk, -40640);
    init(s, 56150);
    init(ak, 3281898793356659304L);
    init(l, 8352135576519778186L);
    init(cq, -38310);
    init(w9, -42401);
    init(k5f, -25092);

    for (r = 1; r < 7; r++) {
        thw[r] = (char)(r - r);
        for (m = 1; m < 0; ++m) {
            y[r-1][m] = (long)(y[r][m+1]);
        }
        kd1[r+1] = (int)(mk[r-1]);
        w = (int)((s[r+1][r]) + (a((int)(ak[r][r]), (int)(y[r][r-1]), (long)(y[r-1][r+1]))));
    }
    for (long x8: l) {
        for (fs = 1; fs < 18; fs++) {
            cq[fs-1] *= (int)(-mk[fs]);
        }
        int vse = 11;
        do {
            for (w4 = 1; w4 < 14; w4++) {
                w9[w4+1] *= (int)(ey++);
            }
            for (hca = 6; hca > 1; --hca) {
                for (b = 6; b > hca; b--) {
                    k5f[hca][b] = (int)(mk[b-1]);
                }
            }
        } while ( --vse > 0 );
    }
    for (hn = 1; hn < 12; ++hn) {
        statSet((int)(cq[hn-1]));

    }

    System.out.println("int: " + r + "," + m + "," + w + "," + fs + "," + w4 + "," + ey + "," + hca + "," + b + "," +
        hn + "," + checkSum(kd1) + "," + checkSum(mk) + "," + checkSum(s) + "," + checkSum(cq) + "," + checkSum(w9) +
        "," + checkSum(k5f));
}
}