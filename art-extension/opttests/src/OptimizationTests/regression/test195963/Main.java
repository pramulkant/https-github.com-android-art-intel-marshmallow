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

// Generated by Dalvik Fuzzer tool (3.3.001). Fri May 16 18:52:00 2014
package OptimizationTests.regression.test195963;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 300;


public static void main(String[] ye) {

    boolean pzq=true;
    int ndp=-53539, jb=51860, o=-32128, f=56145, gpl=-18377, xp=-37753, xv[]=new int[N];
    short x=14614;
    double q=29.189, s[][]=new double[N][N];
    long sak=-6127398811601870514L, c[]=new long[N];
    float w=-114.852F, um=96.412F;

    init(xv, -50739);
    init(c, -4556278346856685059L);
    init(s, 10.570);

    for (ndp = 285; ndp > 11; ndp -= 2) {
        jb += (int)(w * ((26984 - (sak / (ndp | 1))) * (20794 - (sak - sak))));
        jb = jb;
        jb -= (int)(-((ndp - jb) - (jb * um)));
        o = ndp;
        while ( --o > 0 ) {
            for (f = 8; f < 180; f++) {
                xv[o + 1] -= (int)q;
            }
            jb -= (int)(-(sak / ((long)(ndp % ((long)w | 1)) | 1)));
            xv[ndp] -= (int)((q++) * (c[ndp] % ((jb--) | 1)));
            jb += (int)(++q);
            jb = gpl;
            q = ((q++) + (46877 - (-(w + w))));
            xv[o - 1] -= (int)(w--);
            xv[o] += (int)(ndp + ((108.491 - sak) + (jb - o)));
        }
    }
    for (xp = 14; xp < 274; ++xp) {
        jb -= (int)(c[xp - 1] -= (long)um);
        gpl -= (int)(((ndp + sak) * (f - f)) - (-(-27523 + (30.466F - (jb++)))));
        jb = (int)((++jb) - (-29314 - s[xp - 1][xp + 1]));
        try {
            um += o;
        }
        catch (NegativeArraySizeException as) {
            jb = (gpl = f);
            if (pzq) {
                gpl *= (int)((-(f + q)) - ((++sak) - (x - ndp)));
                jb -= (int)(q * ((sak = o) + (++gpl)));
                gpl >>= gpl;
            }
        }
    }

    System.out.println("ndp jb w = " + ndp + "," + jb + "," + Float.floatToIntBits(w));
    System.out.println("sak um o = " + sak + "," + Float.floatToIntBits(um) + "," + o);
    System.out.println("f q gpl = " + f + "," + Double.doubleToLongBits(q) + "," + gpl);
    System.out.println("xp x pzq = " + xp + "," + x + "," + pzq);
    System.out.println("xv c s = " + checkSum(xv) + "," + checkSum(c) + "," + Double.doubleToLongBits(checkSum(s)));
    
}
}