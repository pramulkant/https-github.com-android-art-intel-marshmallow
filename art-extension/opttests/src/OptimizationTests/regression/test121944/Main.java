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

// Generated by Dalvik Fuzzer tool (2.1.003). Mon Jul  8 17:26:34 2013
package OptimizationTests.regression.test121944;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static void main(String[] th6) {

        char q1s[] = new char[N], v[][] = new char[N][N];
        int jju = -63583, xv = 39049, z81 = -43259, oz = 18628, o1d = -43009, u1 = -21040, wh = -64759, ew = 49455, gy = 57952, eso = -5348, f9a = 57237, slv[] = new int[N], mui[][] = new int[N][N], x9[] = new int[N], yv[] = new int[N];
        long mc = 8202713464757065885L, qh[] = new long[N], wx1[][] = new long[N][N];

        init(slv, 9044);
        init(mui, 61680);
        init(q1s, (char) 12209);
        init(v, (char) 3788);
        init(x9, -41553);

        for (xv = 1; xv < 20; ++xv) {
            for (o1d = 1; o1d < 13; ++o1d) {
                mui[o1d + 1][o1d - 1] += (int) (xv + (mui[xv - 1][xv + 1]));
                int b0v = 11;
                while (--b0v > 0) {
                    int ymt = 0;
                    try {
                        mui[o1d - 1][xv] += (int) ((q1s[o1d - 1]) - z81);
                        slv[o1d] = (int) (u1 % ymt);
                        v[o1d][xv - 1] = (char) (x9[o1d - 1]);
                    } catch (ArithmeticException t) {
                    }
                }
            }
        }

        System.out.println("char: " + (int) checkSum(q1s) + ","
                + (int) checkSum(v));
        System.out.println("int: " + jju + "," + xv + "," + z81 + "," + oz
                + "," + o1d + "," + u1 + "," + wh + "," + ew + "," + gy + ","
                + eso + "," + f9a + "," + checkSum(slv) + "," + checkSum(mui)
                + "," + checkSum(x9) + "," + checkSum(yv));
        System.out.println("long: " + mc + "," + checkSum(qh) + ","
                + checkSum(wx1));
    }
}
