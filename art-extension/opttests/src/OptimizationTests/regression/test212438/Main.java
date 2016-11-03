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

// Generated by Dalvik Fuzzer tool (2.1.003). Mon Jul 21 05:34:24 2014
package OptimizationTests.regression.test212438;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static long ovi_check_sum = 0;
public static long r6c_check_sum = 0;
static int statIntField = 3;
static void statSet(int value) {statIntField = value;}
static int  statGet() {return statIntField;}

public static void ovi() {

    int mt=59604, f=7065, i=5971, nh3=8332, ydm=64487, e[][]=new int[N][N], d[]=new int[N];

    init(e, 61541);
    init(d, -24731);

    int xk = 11;
    do {
        for (mt = 12; mt > 1; mt--) {
            for (f = mt; f < 1; f++) {
                for (i = 1; i > f; --i) {
                    e[f][i+1] -= (int)(--nh3);
                }
            }
        }
        for (ydm = 14; ydm > 1; --ydm) {
            e[ydm+1][ydm] = (int)(e[ydm-1][ydm-1]);
            int wc = 11;
            do {
                d[ydm+1] += (int)(statGet());
            } while ( --wc > 0 );
        }
    } while ( --xk > 0 );

    ovi_check_sum += mt + f + i + nh3 + ydm + checkSum(e) + checkSum(d);
}

public static void main(String[] dwx) {

    char x8[]=new char[N];
    int b=48115, kb=19827, jg=13207, cb9=-37385, xf=51623, cf=13426, tso=61753, i=-51635, fbj=-63930, dnd=13096,
        ejb=35157, jci=15688, gl[]=new int[N], ke5[]=new int[N], c[][]=new int[N][N], v[]=new int[N], l7[][]=new
        int[N][N], dtq[][]=new int[N][N], s[][]=new int[N][N];
    byte xo[]=new byte[N];
    long so[][]=new long[N][N], hr[][]=new long[N][N], tkm[]=new long[N], q[][]=new long[N][N];

    init(gl, -45837);
    init(ke5, 33953);
    init(c, 1780);
    init(so, -6020336193184804536L);
    init(x8, (char)6881);
    init(hr, -1359332045473443679L);
    init(tkm, 2467035259355545669L);
    init(xo, (byte)79);
    init(v, 58902);
    init(l7, 36044);
    init(dtq, -23470);
    init(q, -4777163101992953121L);
    init(s, -26791);

    for (b = 1; b < 24; b++) {
        gl[b-1] = (int)(45730);
        ke5[b-1] = (int)(b);
    }
    for (kb = 18; kb > 1; kb--) {
        for (jg = 10; jg > kb; --jg) {
            c[jg-1][jg+1] -= (int)(cb9--);
        }
    }
    int vt = 11;
    while ( --vt > 0 ) {
        for (xf = 1; xf < 15; xf += 3) {
            if (xf != 4) {
                ovi();
                so[xf][xf-1] *= (long)(x8[xf]);
                if (c[xf][xf-1] >= (x8[xf-1]) ) {
                    xo[xf] += (byte)(xo[xf]);
                    if (v[xf-1] == ++cf) {
                        int[] g0t;
                        int x = -10;
                        try {
                            tso = (int)(c[xf-1][xf+1]);
                            try {
                                l7[xf][xf+1] = (int)(cb9 % 10921);
                                fbj = (int)(20219 / i);
                                ejb = (int)(dnd % 1664778140);
                                dtq[xf][xf] = (int)(cf % -24165);
                                cf = (int)(jci / fbj);
                            } catch (ArithmeticException a_e) {}
                            g0t = new int[x];
                            if (v[xf+1] > 0) continue;
                        } catch (NegativeArraySizeException r) {
                            q[xf-1][xf+1] -= (long)(s[xf+1][xf]);
                            if (ejb > 0) continue;
                        }
                    }
                }
            }
        }
    }

    System.out.println("char: " + (int)checkSum(x8));
    System.out.println("int: " + b + "," + kb + "," + jg + "," + cb9 + "," + xf + "," + cf + "," + tso + "," + i + ","
        + fbj + "," + dnd + "," + ejb + "," + jci + "," + checkSum(gl) + "," + checkSum(ke5) + "," + checkSum(c) + ","
        + checkSum(v) + "," + checkSum(l7) + "," + checkSum(dtq) + "," + checkSum(s));
    System.out.println("byte: " + checkSum(xo));
    System.out.println("long: " + checkSum(so) + "," + checkSum(hr) + "," + checkSum(tkm) + "," + checkSum(q));

    System.out.println("ovi_check_sum: " + ovi_check_sum);
    System.out.println("r6c_check_sum: " + r6c_check_sum);
    System.out.println("statIntField: " + statIntField);
}
}