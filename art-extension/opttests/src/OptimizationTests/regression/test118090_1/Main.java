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

// generated by Dalvik Fuzzer 
package OptimizationTests.regression.test118090_1;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static void main(String[] args) {
        int rr = 47803, c = -11749, i = 5191, zwo = -3449, iti = 44525, nt7 = 11238, ntl = -58880, wc = 42949, a4 = 16465, ng[][] = new int[N][N], dn[] = new int[N], et[] = new int[N], ilv[] = new int[N], v[][] = new int[N][N], z0l[][] = new int[N][N], x8[][] = new int[N][N], u[] = new int[N], ie[][] = new int[N][N];
        long qf = 7197622246861367439L, pu[] = new long[N], qi[] = new long[N], vmm[] = new long[N];

        init(pu, -5682356234130332405L);
        init(ng, -19610);
        init(qi, -6492473577465907058L);
        init(dn, 52204);
        init(et, 50925);
        init(ilv, -43806);
        init(v, 47768);
        init(z0l, 48631);
        init(x8, 7560);
        init(u, -33383);
        init(vmm, 7645126358503838671L);
        init(ie, 54482);

        for (rr = 54; rr > 1; rr--) {
            if (rr > 0) {
                for (i = rr; i < 18; i++) {
                    for (zwo = rr; zwo < 6; zwo++) {
                        for (iti = 1; iti < 10; iti++) {
                            c = (int) ((dn[i - 1]) + ((v[iti + 1][i - 1]) + iti));
                            if (nt7 > 0)
                                break;
                        }

                        int j0a = 11;
                        while (--j0a > 0) {
                            nt7 -= (int) (z0l[zwo][rr + 1]);
                            qf += (long) (((((pu[zwo]) % ((qi[i] != 0) ? qi[i]
                                    : 1)) + ((ilv[rr + 1]) * ((qf) / ((pu[i + 1] != 0) ? pu[i + 1]
                                    : 1)))) + (((ilv[zwo - 1]) * i) % ((qf != 0) ? qf
                                    : 1))) % ((nt7 != 0) ? nt7 : 1));
                        }
                    }
                }
            }
        }

        // System.out.println("c: " + c);

        System.out.println("int: " + rr + "," + c + "," + i + "," + zwo + ","
                + iti + "," + nt7 + "," + ntl + "," + wc + "," + a4 + ","
                + checkSum(ng) + "," + checkSum(dn) + "," + checkSum(et) + ","
                + checkSum(ilv) + "," + checkSum(v) + "," + checkSum(z0l) + ","
                + checkSum(x8) + "," + checkSum(u) + "," + checkSum(ie));

    }
}
