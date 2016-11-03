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

// Generated by Dalvik Fuzzer tool (3.2.001). Fri Apr  4 20:37:29 2014
package OptimizationTests.regression.test184847;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 5000;

    public static long do3[] = new long[N];
    public static int k = 16785;

    static {
        init(do3, 5555491296028641770L);
    }

    public static void main(String[] d) {

        double h7 = -71.302, l3 = -14.450, v4 = 40.4;
        short y78 = 7649, e[] = new short[N];
        long z38 = 2100666398376725130L, wv = 787823565867952223L, ij8 = -7678029088437019613L;
        float ajb = -39.1000F, pdy = 120.313F;
        int m = 49332, o = 27995, gl = 55376, tdo = 8184, ct = 57619, yz7 = 26936, w = 38905, b = -65328, r3n = -25341, op = -41193, t0[] = new int[N], fy[] = new int[N];

        init(t0, -64990);
        init(e, (short) 1053);
        init(fy, 58994);

        for (m = 4200; m > 13; m -= 3) {
            if (((-5074043960622227886L >>> (long) (-h7)) > (--o))
                    || (z38 <= (m - ajb)))
                continue;
            try {
                if (-29808 < t0[m - 1])
                    break;
            } catch (ArithmeticException j) {
                gl %= (int) ((long) (tdo + ((++pdy) * 41976)) | 1);
            }
            gl += (int) 81.12;
            o += (int) ((pdy--) * (--h7));
        }
        for (k = 11; k < 4230; k++) {
            wv = (long) (wv * l3);
            y78 *= (short) (((ij8 + ct) - e[k + 1]) - gl);
            for (yz7 = 1; yz7 < k; ++yz7) {
                do3[(ct >>> 1) % N] += do3[k];
                w -= fy[k];
                v4 -= (wv += b);
                o = (int) ((o << (r3n >> op)) + (++ajb));
            }
        }

        System.out.println("m h7 o = " + m + "," + Double.doubleToLongBits(h7)
                + "," + o);
        System.out.println("z38 ajb gl = " + z38 + ","
                + Float.floatToIntBits(ajb) + "," + gl);
        System.out.println("tdo pdy wv = " + tdo + ","
                + Float.floatToIntBits(pdy) + "," + wv);
        System.out.println("l3 y78 ij8 = " + Double.doubleToLongBits(l3) + ","
                + y78 + "," + ij8);
        System.out.println("ct yz7 w = " + ct + "," + yz7 + "," + w);
        System.out.println("v4 b r3n = " + Double.doubleToLongBits(v4) + ","
                + b + "," + r3n);
        System.out.println("op t0 e = " + op + "," + checkSum(t0) + ","
                + checkSum(e));
        System.out.println("fy = " + checkSum(fy));

        System.out.println("k do3 = " + k + "," + checkSum(do3));
    }
}