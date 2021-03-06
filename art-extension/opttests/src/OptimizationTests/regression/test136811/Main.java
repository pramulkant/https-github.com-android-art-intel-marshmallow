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

// Generated by Dalvik Fuzzer tool (2.1.003). Sun Sep  8 02:41:01 2013

package OptimizationTests.regression.test136811;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static long d33_check_sum = 0;

    public static int d33(int n1, int vi, int nq, long y, long i3) {

        int mw = -8357, g = -6738, p = 42962, j = -35726, h = 51860, yr = -18488, qnw[][] = new int[N][N], tv[] = new int[N];
        long i[] = new long[N];

        init(qnw, -24723);
        init(i, -6481271790853754252L);
        init(tv, -16290);

        int k = 11;
        while (--k > 0) {
            for (mw = 17; mw > 1; mw--) {
                for (g = mw; g < 8; g += 2) {
                    qnw[mw][mw - 1] = (int) (qnw[mw - 1][mw - 1]);
                }
            }
            for (p = 26; p > 1; p--) {
                if (i[p - 1] > 0) {
                    return (int) (n1 + vi + nq + y + i3 + mw + g + p
                            + checkSum(qnw) + checkSum(i));
                }
                y -= (long) (j--);
            }
            for (int zj : tv) {
                for (h = 1; h < 1; h += 3) {
                    yr -= (int) (qnw[h][h - 1]);
                }
            }
        }

        long meth_res = n1 + vi + nq + y + i3 + mw + g + p + j + h + yr
                + checkSum(qnw) + checkSum(i) + checkSum(tv);
        d33_check_sum += meth_res;
        return (int) meth_res;
    }

    public static void main(String[] sg) {

        char psl[] = new char[N], e80[][] = new char[N][N];
        int ixo = 14070, zfu = 13512, z3m = -30333, t = 59798, jiv = -22888, oc = 33799, rt = 38299, na = -44311, f[] = new int[N], ix[] = new int[N], ld[] = new int[N], tjq[] = new int[N], k[][] = new int[N][N], n3j[] = new int[N], tff[][] = new int[N][N];
        long z[][] = new long[N][N], hnk[][] = new long[N][N], gd[][] = new long[N][N], w[][] = new long[N][N], b9[][] = new long[N][N], ub[][] = new long[N][N], ur[][] = new long[N][N];

        init(f, -57045);
        init(ix, -34649);
        init(ld, 35663);
        init(psl, (char) 20943);
        init(z, -2767015924454761534L);
        init(e80, (char) 4695);
        init(hnk, -1131199811992481883L);
        init(gd, 482593233671998133L);
        init(tjq, 40103);
        init(w, -5125220473113738320L);
        init(k, 11920);
        init(n3j, 6368);
        init(tff, -36265);
        init(b9, -8535217001797101911L);
        init(ub, 894887129719166414L);
        init(ur, 8318431544269070600L);

        int m = 11;
        do {
            if ((f[20]) * 31125 <= f[7]) {
                if ((ix[19]) - (ld[26]) < (psl[14]) + (ixo++)) {
                    for (zfu = 1; zfu < 1; zfu++) {
                        if (z3m-- >= f[zfu]) {
                            int p = 11;
                            while (--p > 0) {
                                z[zfu + 1][zfu] += (long) (e80[zfu + 1][zfu - 1]);
                                z3m += (int) (e80[zfu + 1][zfu]);
                            }
                            for (t = 5; t > 1; --t) {
                                for (jiv = 1; jiv < 2; ++jiv) {
                                    e80[zfu][zfu] = (char) (((oc++) + (zfu - (psl[zfu]))) * (zfu + jiv));
                                }
                            }
                            if ((hnk[zfu - 1][zfu]) - 27279 != gd[zfu + 1][zfu]) {
                                if (-((z[zfu][zfu + 1]) - z3m) != tjq[zfu - 1]) {
                                    w[zfu - 1][zfu - 1] = (long) (tjq[zfu + 1]);
                                    rt *= (int) (d33(
                                            (int) (k[zfu - 1][zfu - 1]),
                                            (int) (ix[zfu]),
                                            (int) (((n3j[zfu]) * (tff[zfu][zfu])) + (na++)),
                                            (long) (b9[zfu - 1][zfu - 1]),
                                            (long) (psl[zfu])));
                                    ub[zfu][zfu] += (long) (ur[zfu][zfu]);
                                }
                            }
                        }
                    }
                }
            }
        } while (--m > 0);

        System.out.println("char: " + (int) checkSum(psl) + ","
                + (int) checkSum(e80));
        System.out.println("int: " + ixo + "," + zfu + "," + z3m + "," + t
                + "," + jiv + "," + oc + "," + rt + "," + na + ","
                + checkSum(f) + "," + checkSum(ix) + "," + checkSum(ld) + ","
                + checkSum(tjq) + "," + checkSum(k) + "," + checkSum(n3j) + ","
                + checkSum(tff));
        System.out.println("long: " + checkSum(z) + "," + checkSum(hnk) + ","
                + checkSum(gd) + "," + checkSum(w) + "," + checkSum(b9) + ","
                + checkSum(ub) + "," + checkSum(ur));

        System.out.println("d33_check_sum: " + d33_check_sum);
    }
}
