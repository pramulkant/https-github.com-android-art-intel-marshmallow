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

// Generated by Dalvik Fuzzer tool (3.4.001). Sun Nov  9 12:45:40 2014
package OptimizationTests.regression.test847;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static short l = 11084;

    public static void main(String[] n) {

        int u7h = 23746, v = -31358, tm = -47740, o = -3923, tiv = -51141, o3 = 59271, j = 25475, b2x[] = new int[N];
        float z = 87.970F, y2[] = new float[N];
        double pw = -72.604, g4o[][] = new double[N][N];
        long eeh = 8812059503782744983L, h1b[][] = new long[N][N];
        byte f = 7;

        init(g4o, -123.186);
        init(b2x, -15985);
        init(h1b, -397084180429379947L);
        init(y2, 95.506F);

        u7h = 1;
        while (++u7h < 98) {
            v = 1;
            while (++v < 9) {
                f >>= (byte) tm;
                eeh = u7h;
                tm <<= v;
                for (o = u7h; o < 84; ++o) {
                    tm &= (int) (-((tm++) * g4o[o][o + 1]));
                    tm = l;
                    tm *= (int) (-(eeh * (tm--)));
                    b2x[u7h] *= (int) ((18573 * (-(--h1b[u7h][v + 1]))) + (y2[v] *= (tm++)));
                    tm -= (int) ((-(o * eeh)) % ((long) ((-(eeh + pw)) - (tiv - z)) | 1));
                    tm += (o * l);
                    b2x[o] = u7h;
                }
                tm -= (int) (((h1b[v - 1][v - 1]--) * b2x[v - 1]) + (o3 = (int) eeh));
                tiv = (int) (-(pw--));
            }
            j = 1;
            do {
                pw *= b2x[j + 1];
                tiv <<= tiv;
                eeh += (((v - tiv) - (b2x[u7h]--)) + ((tm * -18635) - (o * f)));
                tiv >>>= j;
                pw *= z;
                tiv -= (int) eeh;
            } while ((j += 2) < 72);
            z = tiv;
            eeh = 27433;
            eeh = (long) (b2x[u7h - 1] - ((tm *= (int) -58.567) * eeh));
        }

        System.out.println("u7h v f = " + u7h + "," + v + "," + f);
        System.out.println("tm eeh o = " + tm + "," + eeh + "," + o);
        System.out.println("pw tiv z = " + Double.doubleToLongBits(pw) + ","
                + tiv + "," + Float.floatToIntBits(z));
        System.out.println("o3 j g4o = " + o3 + "," + j + ","
                + Double.doubleToLongBits(checkSum(g4o)));
        System.out.println("b2x h1b y2 = " + checkSum(b2x) + ","
                + checkSum(h1b) + "," + Double.doubleToLongBits(checkSum(y2)));

        System.out.println("l = " + l);
    }
}