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

// Generated by Dalvik Fuzzer tool (2.1.003). Mon Jul 21 05:54:40 2014
package OptimizationTests.regression.test212451;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static void main(String[] vv) {

    long bc[]=new long[N];
    int kp=-41077, w=54419, gw=61594, lbj=41566, t6q=-31065, wf=-29170, n=-11052, q94=-55300, d=-24630, j[]=new int[N],
        g28[]=new int[N], pj[][]=new int[N][N], e[]=new int[N], a[][]=new int[N][N];

    init(j, -33774);
    init(g28, 57769);
    init(pj, -29043);
    init(e, 34734);
    init(a, 42420);
    init(bc, 5205909394264663471L);

    for (kp = 1; kp < 11; ++kp) {
        for (int c: j) {
            j[kp] += (int)(((g28[kp+1]) * (pj[kp][kp+1])) - ((++w) + -23583));
        }
        for (gw = 13; gw > kp; gw--) {
            for (lbj = 4; lbj > kp; --lbj) {
                g28[kp+1] += (int)(lbj + 421503865963788669L);
            }
        }
    }
    for (t6q = 1; t6q > 1; --t6q) {
        wf += (int)(pj[t6q][t6q+1]);
        wf -= (int)(j[t6q]);
    }
    int s1 = 11;
    do {
        for (int tyd: e) {
            for (n = 1; n < 26; ++n) {
                for (q94 = 1; q94 < 3; q94++) {
                    a[n-1][n] += (int)(--d);
                }
            }
            int jc = 11;
            do {
                g28[22] -= (int)(bc[22]);
            } while ( --jc > 0 );
        }
    } while ( --s1 > 0 );

    System.out.println("g28: " + checkSum(g28));
}
}