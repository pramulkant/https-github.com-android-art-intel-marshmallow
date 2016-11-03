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

// Generated by Dalvik Fuzzer tool (3.4.001). Thu Sep  4 04:54:42 2014
package OptimizationTests.regression.test875;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static float asf=-116.938F;

public static void main(String[] k) {

    int vh=31974, a8x=26401, zis=-64095, yo=-21839, fg=42503, qs=55110, uog=-52270, a[]=new int[N];
    float j=39.68F, ezo[]=new float[N];
    long h=191726605287617767L, h7=6621329581383818355L, t[]=new long[N];
    double rw0=-23.810;
    short vrb=17324, y[]=new short[N];

    init(ezo, 42.646F);
    init(a, -897);
    init(t, -1997412795328808625L);
    init(y, (short)917);

    for (vh = 84; vh > 2; vh--) {
        a8x = (int)((++ezo[vh - 1]) * ((vh + vh) * a[vh]));
        j += a[vh + 1];
        for (zis = 2; zis < 38; ++zis) {
            j = a8x;
            a8x = a[zis];
            yo = ((--a[zis]) + (a[zis]--));
        }
        for (fg = 1; fg < 52; fg++) {
            yo *= (int)(h--);
            a8x += ((long)fg ^ (long)yo);
            yo += (int)t[fg - 1];
            j = ((h * (vh * a8x)) + (++h));
            h = (yo += (int)(h <<= (fg * vrb)));
            try {
                a8x = (168 % yo);
                yo = (222 % a[vh]);
                yo = (vh / -250);
            } catch (ArithmeticException a_e) {}
            yo |= (int)(((-(yo + zis)) + (t[fg - 1] /= (zis | 1))) + a8x);
            a[vh] = zis;
        }
        for (asf = vh; asf < vh; ++asf) {
            h += (long)(((asf * asf) + rw0) + ((46.864 + (zis % (zis | 1))) - (48213 * (a8x + j))));
            h += (long)(asf + vh);
            for (qs = 1; qs < 9; qs++) {
                yo += (qs * vrb);
                h7 -= (a[qs] = (a[vh]--));
                y[(int)(asf + 1)] += (short)(-a[vh + 1]);
            }
            h = ((t[(int)(asf + 1)] * zis) * ((-(--t[vh - 1])) + (uog *= vrb)));
        }
        yo -= (int)asf;
    }

    System.out.println("vh a8x j = " + vh + "," + a8x + "," + Float.floatToIntBits(j));
    System.out.println("zis yo fg = " + zis + "," + yo + "," + fg);
    System.out.println("h vrb rw0 = " + h + "," + vrb + "," + Double.doubleToLongBits(rw0));
    System.out.println("qs h7 uog = " + qs + "," + h7 + "," + uog);
    System.out.println("ezo a t = " + Double.doubleToLongBits(checkSum(ezo)) + "," + checkSum(a) + "," + checkSum(t));
    System.out.println("y = " + checkSum(y));

    System.out.println("asf = " + Float.floatToIntBits(asf));
}
}