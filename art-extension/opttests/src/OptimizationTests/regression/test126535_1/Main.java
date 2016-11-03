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

// Generated by Dalvik Fuzzer tool (2.1.003). Sun Aug  4 07:16:28 2013
package OptimizationTests.regression.test126535_1;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 300;
    public static final int N1 = 299;

    public static long x_check_sum = 0;
    public static long z_check_sum = 0;
    static int statIntField = 3;

    static void statSet(int value) {
        statIntField = value;
    }

    static int statGet() {
        return statIntField;
    }

    public static void x(long m, int a) {

        int xd3 = -49442, ox = -7646, dk = -59671, t9[] = new int[N];
        long wn7[][] = new long[N][N], y[][] = new long[N][N];

        init(wn7, 1087360074630574413L);
        init(t9, 21025);
        init(y, 2562902499962531969L);

        for (xd3 = 1; xd3 < 299; ++xd3) {
            a -= (int) (wn7[xd3][xd3 + 1]);

            for (ox = 1; ox < 299; ++ox) {

                for (dk = 299; dk > 1; --dk) {
                    t9[xd3 + 1] -= (int) (y[xd3 + 1][xd3 + 1]);
                    m = (long) (t9[xd3 + 1]);
                }

            }

        }

        x_check_sum += m + a + xd3 + ox + dk + checkSum(wn7) + checkSum(t9)
                + checkSum(y);
    }

    public static int z() {

        char p[] = new char[N];
        int s7 = 48839, v5q = -32488, b = 36988, sz = -58965, c3 = -19178, y3 = -36024, ji[][] = new int[N][N], x[] = new int[N], pu[] = new int[N], jp[][] = new int[N][N];
        long xei = -1509497163740826917L, fx6[] = new long[N];

        init(p, (char) 18766);
        init(ji, -32790);
        init(x, 50446);
        init(pu, 54298);
        init(fx6, -3956471303206506251L);
        init(jp, 63258);

        // Test Loop Vectorization
        for (s7 = 299; s7 > 1; s7--) {
            p[s7] = (char) (47436);
        }

        for (v5q = 299; v5q > 1; --v5q) {
            xei *= (long) (v5q + ((ji[v5q - 1][v5q]) - s7));
        }

        for (b = 1; b < 299; ++b) {
            statSet((int) (x[b]));

            // Test Loop Vectorization
            for (sz = b; sz < 99; sz += 3) {
                pu[sz - 1] = (int) (p[sz - 1] - fx6[b + 1]);
            }

            for (c3 = 299; c3 > 1; c3--) {
                y3 += (int) (jp[b + 1][b + 1]);
            }

        }

        long meth_res = s7 + v5q + xei + b + sz + c3 + y3 + checkSum(p)
                + checkSum(ji) + checkSum(x) + checkSum(pu) + checkSum(fx6)
                + checkSum(jp);
        z_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] x) {

        int rb = -43677, xd = 44294, oo = -35335, xqq = -50451, f = 65077, a = -14705, dc = 43619, t9 = 28671, rsc = 47090, w2 = 7464, e = 32181, gb = -59863, z3[][] = new int[N][N], y[] = new int[N], t[][] = new int[N][N], nw[] = new int[N], h[] = new int[N], l[] = new int[N], hrh[] = new int[N], sa[] = new int[N];
        short hhc[][] = new short[N][N];
        long f0m[] = new long[N], f3[] = new long[N];

        init(z3, 22520);
        init(y, -30183);
        init(f0m, 1520248257373990978L);
        init(t, 57144);
        init(hhc, (short) 5326);
        init(nw, -62503);
        init(h, 23431);
        init(l, 26562);
        init(hrh, -53912);
        init(sa, 29660);
        init(f3, 2851573944492816443L);

        for (rb = 8; rb > 1; rb--) {
            xd = (int) (oo--);

            for (xqq = 1; xqq > 1; --xqq) {
                z3[xqq + 1][xqq] -= (int) (y[xqq]);
            }

            // Test Loop Vectorization
            for (f = 1; f < rb; f++) {
                y[f + 1] = (int) (34759);
                y[rb - 1] = (int) (f0m[rb - 1]);
            }

            x((long) (t[rb + 1][rb + 1]), (int) (hhc[rb - 1][rb + 1]));

        }

        for (a = 1; a < 4; ++a) {
            xd -= (int) (z());
            nw[a - 1] += (int) (xqq * f);
            oo = (int) (t[a + 1][a]);
        }

        // Test Loop Interchange
        for (dc = 1; dc < 12; ++dc) {
            for (t9 = dc; t9 > 1; --t9) {
                f0m[dc + 1] = (long) (y[t9 + 1]);
            }
        }

        if ((((h[12]) + 14307) + (y[14])) + (l[9]) <= rsc--) {

            // Test Loop Vectorization
            for (w2 = 7; w2 > 1; --w2) {
                hrh[w2 - 1] -= (int) (sa[w2] * f0m[w2 - 1]);
            }

        }

        for (e = 1; e < 11; ++e) {
            gb = (int) ((f3[e + 1]) + (f0m[e - 1]));
        }

        System.out.println("int: " + rb + "," + xd + "," + oo + "," + xqq + ","
                + f + "," + a + "," + dc + "," + t9 + "," + rsc + "," + w2
                + "," + e + "," + gb + "," + checkSum(z3) + "," + checkSum(y)
                + "," + checkSum(t) + "," + checkSum(nw) + "," + checkSum(h)
                + "," + checkSum(l) + "," + checkSum(hrh) + "," + checkSum(sa));
        System.out.println("short: " + checkSum(hhc));
        System.out.println("long: " + checkSum(f0m) + "," + checkSum(f3));

        System.out.println("x_check_sum: " + x_check_sum);
        System.out.println("z_check_sum: " + z_check_sum);
        System.out.println("statIntField: " + statIntField);
    }
}