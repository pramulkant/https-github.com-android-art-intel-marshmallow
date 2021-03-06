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

// Generated by Dalvik Fuzzer tool. Mon Jul  1 04:37:01 2013
package OptimizationTests.regression.test120140;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static void main(String[] o) {

        char en8 = 63122, akx[] = new char[N];
        int xs = -45348, g = -46663, lr6 = -1649, l = -4276, yf = -28631, mgr = -39131, na = 57287, s = -11988, y[] = new int[N], m3b[] = new int[N], xaq[][] = new int[N][N], t[][] = new int[N][N], f[][] = new int[N][N], do9[] = new int[N], bsu[][] = new int[N][N], z2[][] = new int[N][N], z7[][] = new int[N][N], hmq[][] = new int[N][N];
        double x4m = -101.167, g4f[] = new double[N], sgn[][] = new double[N][N];
        long p[] = new long[N];

        init(akx, (char) 45182);
        init(do9, 62372);
        init(p, -5190361287031062554L);

        for (g = 1; g < 4; g++) {
            int e = 11;
            do {
                for (long oaz : p) {
                    if (x4m + lr6 == p[g + 1]) {
                        if (lr6 > 0)
                            break;
                        do9[g] = (int) (l * ((akx[g + 1]) - (do9[g + 1])));
                        lr6 *= (int) (++mgr);
                    }
                }
            } while (--e > 0);
        }

        System.out.println("int: " + xs + "," + g + "," + lr6 + "," + l + ","
                + yf + "," + mgr + "," + na + "," + s + "," + checkSum(y) + ","
                + checkSum(m3b) + "," + checkSum(xaq) + "," + checkSum(t) + ","
                + checkSum(f) + "," + checkSum(do9) + "," + checkSum(bsu) + ","
                + checkSum(z2) + "," + checkSum(z7) + "," + checkSum(hmq));
        System.out.println("double: " + x4m + "," + checkSum(g4f) + ","
                + checkSum(sgn));
        System.out.println("long: " + checkSum(p));

    }
}
