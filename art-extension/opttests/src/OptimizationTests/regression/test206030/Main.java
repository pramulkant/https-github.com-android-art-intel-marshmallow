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

// Generated by Dalvik Fuzzer tool (3.3.001). Sat Jun 21 23:27:08 2014
package OptimizationTests.regression.test206030;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 300;

    public static double cj=99.39;
    public static long i0=8438563225461751164L;
    public static float fde=89.622F;

public static void main(String[] nqd) {

    double s1c=67.131, hw=21.386;
    int eaa=-56066, q=-64467, g1=-60228, fg=1419, s5=-20703, v=-28393, x4=44747, cnk=-39609, zve=-45591, el=64043,
        m[]=new int[N];
    byte x7=-27;
    long j=-417062450580786647L;
    float unl=-75.467F, e=-36.245F, e9[][]=new float[N][N];
    short tks=-27762, r=27993, z=-9056;

    init(m, -6881);
    init(e9, 107.869F);

    for (eaa = 12; eaa < 298; eaa++) {
        m[eaa] &= ((q++) * ((g1--) - 35776));
        fde -= (float)(((s1c + q) + (m[eaa]--)) - (-i0));
        g1 = (int)(((q - eaa) - m[eaa - 1]) - i0);
        tks = (short)g1;
        i0 += (q + ((-1538049088040389617L * (j + g1)) - g1));
        for (fg = 1; fg < 13; fg += 3) {
            r -= x7;
            x7 += (byte)(g1 -= (int)((-(s5 += (int)j)) - -37119));
            s5 = (int)((34762 - (g1 * eaa)) - (fde - (q = -29619)));
            fde = 5954494260665155559L;
        }
        m[eaa] <<= eaa;
        s5 = s5;
    }
    v = 268;
    while ( --v > 0 ) {
        e9[v - 1][v] += q;
        g1 *= (int)((long)(fde * s5) >>> (i0++));
        q = (q++);
    }
    for (x4 = 1; x4 < 235; x4 += 3) {
        hw -= (fde - (--fde));
        for (cnk = 1; cnk < 102; ++cnk) {
            g1 = (-(zve *= (q = el)));
            cj *= (((eaa * unl) - (z + s5)) * ((s5 + v) - (--s5)));
            i0 -= 2560509592918284573L;
        }
        zve /= (((s5--) - fg) | 1);
    }
    g1 *= (int)(eaa + (e + (cnk + cnk)));

    System.out.println("eaa q g1 = " + eaa + "," + q + "," + g1);
    System.out.println("s1c tks j = " + Double.doubleToLongBits(s1c) + "," + tks + "," + j);
    System.out.println("fg r x7 = " + fg + "," + r + "," + x7);
    System.out.println("s5 v x4 = " + s5 + "," + v + "," + x4);
    System.out.println("hw cnk zve = " + Double.doubleToLongBits(hw) + "," + cnk + "," + zve);
    System.out.println("el unl z = " + el + "," + Float.floatToIntBits(unl) + "," + z);
    System.out.println("e m e9 = " + Float.floatToIntBits(e) + "," + checkSum(m) + "," +
        Double.doubleToLongBits(checkSum(e9)));
    
    System.out.println("fde i0 cj = " + Float.floatToIntBits(fde) + "," + i0 + "," + Double.doubleToLongBits(cj));
}
}
