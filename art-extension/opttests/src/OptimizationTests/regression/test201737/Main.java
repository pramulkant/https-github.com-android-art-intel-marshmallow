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

// Generated by Dalvik Fuzzer tool (2.1.003). Fri Jun  6 15:15:33 2014
package OptimizationTests.regression.test201737;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static long mv_check_sum = 0;

public static int mv(long r6y, int nu, int mta, long izx, long b2) {

    int x=9028, mx=24841, p=23748, pz8=39658, hc=-41345, p9=35591, jn=50091, iuu[]=new int[N], ppg[][]=new int[N][N],
        cz4[][]=new int[N][N], ay[][]=new int[N][N], qz[][]=new int[N][N];
    long h[]=new long[N], v69[]=new long[N];

    init(h, -4680619455595139839L);
    init(iuu, -40975);
    init(ppg, 54463);
    init(v69, 5436711974347735956L);
    init(cz4, 61939);
    init(ay, -8941);
    init(qz, 47002);


    // Test Loop Interchange
    for (x = 1; x < 17; x++) {
        for (mx = x; mx > 1; --mx) {
            h[mx+1] = (long)(iuu[mx-1]);
        }
    }


    // Test Loop Interchange
    for (p = 1; p < 6; p++) {
        for (pz8 = 1; pz8 < p; ++pz8) {
            ppg[pz8-1][pz8+1] = (int)(++hc);
        }
    }

    // Enhanced For statement
    for (long m5: v69) {

        for (p9 = 1; p9 > 1; p9--) {
            cz4[p9][p9-1] = (int)(--jn);
            mta -= (int)(ay[p9-1][p9-1]);
            qz[p9][p9] -= (int)((qz[p9][p9+1]) + 49403);
        }

    }

    long meth_res = r6y + nu + mta + izx + b2 + x + mx + p + pz8 + hc + p9 + jn + checkSum(h) + checkSum(iuu) +
        checkSum(ppg) + checkSum(v69) + checkSum(cz4) + checkSum(ay) + checkSum(qz);
    mv_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] q) {

    int ci=7928, pg=-10397, yud=-17890, cx=-16785, kkw=-50122, uc[][]=new int[N][N], e[]=new int[N], s[]=new int[N],
        tef[]=new int[N], k8[][]=new int[N][N], c[][]=new int[N][N];
    short f=-16143, q0[][]=new short[N][N], cex[][]=new short[N][N];
    long az[]=new long[N];
    byte z=109;

    init(uc, 55360);
    init(e, 40853);
    init(q0, (short)14782);
    init(cex, (short)12040);
    init(az, 7245071523507025263L);
    init(s, -812);
    init(tef, 43944);
    init(k8, -23147);
    init(c, 25618);

    int pxg = 11;
    while ( --pxg > 0 ) {
        int a = 11;
        while ( --a > 0 ) {

            for (ci = 11; ci > 1; --ci) {
                uc[ci+1][ci+1] += (int)((++pg) + ((uc[ci-1][ci-1]) - (mv((long)(uc[ci][ci+1]), (int)(uc[ci+1][ci-1]),
                    (int)(pg), (long)(pg), (long)(e[ci])))));

                // Test integer division optimization
                try {
                    q0[ci][ci+1] = (short)(pg / pg);
                    pg = (int)(cex[ci][ci] / az[ci]);
                    q0[ci-1][ci] = (short)(pg / uc[ci][ci+1]);
                    f = (short)(pg / e[ci-1]);
                    z = (byte)(pg % pg);
                } catch (ArithmeticException a_e) {}

                yud += (int)(s[ci]);
            }

            if (pg > 0) break;

            pg -= (int)(tef[21]);
        }

    }


    // Test Loop Interchange
    for (cx = 23; cx > 1; --cx) {
        for (kkw = 1; kkw < 0; kkw++) {
            k8[kkw-1][kkw] = (int)(c[kkw-1][cx+1]);
        }
    }


    System.out.println("int: " + ci + "," + pg + "," + yud + "," + cx + "," + kkw + "," + checkSum(uc) + "," +
        checkSum(e) + "," + checkSum(s) + "," + checkSum(tef) + "," + checkSum(k8) + "," + checkSum(c));
    System.out.println("short: " + f + "," + checkSum(q0) + "," + checkSum(cex));
    System.out.println("long: " + checkSum(az));
    System.out.println("byte: " + z);

    System.out.println("mv_check_sum: " + mv_check_sum);
}
}
