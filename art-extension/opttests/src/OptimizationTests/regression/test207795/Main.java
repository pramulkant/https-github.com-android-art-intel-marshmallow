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

// Generated by Dalvik Fuzzer tool (2.1.003). Wed Jun 25 09:58:13 2014
package OptimizationTests.regression.test207795;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static long hwj_check_sum = 0;

public static void hwj(int qc, long qfq, byte nns) {

    int n=-63458, isu=56160, vnz=57168, qx=23343, c[][]=new int[N][N], zb8[][]=new int[N][N];
    long sv8=176310943971697949L, s[]=new long[N], gl[]=new long[N];

    init(s, 1374883736566905382L);
    init(c, -46682);
    init(gl, 86871131488157903L);
    init(zb8, -42561);

    for (n = 1; n > 1; n--) {
        for (isu = n; isu < 4; isu++) {
            s[n] -= (long)(c[n+1][isu+1]);
        }
    }
    int q5k = 11;
    while ( --q5k > 0 ) {
        for (vnz = 14; vnz > 1; --vnz) {
            gl[vnz+1] += (long)(qx--);
            nns *= (byte)((gl[vnz]) + qfq);
            qfq -= (long)((isu / (((gl[vnz+1]) - (zb8[vnz+1][vnz+1]) != 0) ? (gl[vnz+1]) - (zb8[vnz+1][vnz+1]) : 1)) -
                -13910);
            sv8 = (long)(40766 * isu);
        }
    }
    hwj_check_sum += qc + qfq + nns + n + isu + vnz + qx + sv8 + checkSum(s) + checkSum(c) + checkSum(gl) +
        checkSum(zb8);
}

public static void main(String[] lmd) {

    int f=-53879, o=47102, by=-33633, qy=51240, uai[][]=new int[N][N], e[]=new int[N], exp[]=new int[N], p[]=new
        int[N], r[]=new int[N], s9[]=new int[N], a3[]=new int[N];
    long tp=5517712411381188946L;
    char n=54034, lp[]=new char[N];
    short q9r[]=new short[N];

    init(uai, 53293);
    init(e, -8149);
    init(exp, -56825);
    init(p, -35712);
    init(lp, (char)30446);
    init(r, 6058);
    init(q9r, (short)-15621);
    init(s9, -770);
    init(a3, 5630);

    for (f = 2; f > 1; f--) {
        for (o = 7; o > f; o--) {
            uai[o][o-1] -= (int)(e[o]);
        }
    }
    int lmt = 11;
    do {
        int sk8 = 11;
        do {
            int t = 11;
            while ( --t > 0 ) {

                if (e[8] < e[1]) {
                    if (n > 0) break;
                } else {
                    n += (char)(((e[25]) - (exp[22])) - n);
                    tp = 0;
                    switch ((int)tp) {
                        case 1:
                            e[2] -= (int)(e[23]);
                            if (p[2] > 0) break;
                        case 2:
                            if ((exp[2]) * (lp[12]) != exp[2]) {
                                n -= (char)(r[2]);
                                by *= (int)(q9r[16]);
                            }
                            break;
                        default:
                            hwj((int)(a3[11]), (long)(-(a3[20])), (byte)(f * (exp[10])));
                    }
                }
            }
        } while ( --sk8 > 0 );
    } while ( --lmt > 0 );

    System.out.println("int: " + f + "," + o + "," + by + "," + qy + "," + checkSum(uai) + "," + checkSum(e) + "," +
        checkSum(exp) + "," + checkSum(p) + "," + checkSum(r) + "," + checkSum(s9) + "," + checkSum(a3));
    System.out.println("long: " + tp);
    System.out.println("char: " + (int)n + "," + (int)checkSum(lp));
    System.out.println("short: " + checkSum(q9r));

    System.out.println("hwj_check_sum: " + hwj_check_sum);
}
}