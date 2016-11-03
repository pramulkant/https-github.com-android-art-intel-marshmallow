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

// Generated by Dalvik Fuzzer tool (3.4.001). Thu Nov 27 04:31:28 2014
package OptimizationTests.regression.test943;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


    public static long h_check_sum = 0;
    public static long i_check_sum = 0;

public static void h(int l7, float si, long l7a) {

    double q49=10.811;
    short dj=-17240;
    boolean f=false;
    long m9[]=new long[N];
    int k=32558, os0=-19759, oj=21063, fnv=10580, x9=-8874, w[]=new int[N];

    init(w, 14661);
    init(m9, -2503555021933609560L);

    for (k = 3; k < 88; ++k) {
        l7 = (int)((k - l7a) - (os0 - (os0 * q49)));
        w[k] = (int)(((si * l7a) + (oj * dj)) - ((l7a--) * (k - l7a)));
        m9[k - 1] >>= oj;
        for (fnv = 1; fnv < 5; fnv++) {
            l7a += (((fnv * fnv) + oj) - fnv);
            l7 += (((dj - k) + k) - k);
            m9[fnv - 1] >>= (oj + (m9[k + 1] - l7a));
            l7a -= (l7a + (oj++));
            q49 = k;
            f = ((f = (si != l7a)) ^ (f && (f || f)));
            l7 = (int)((si + (x9 - fnv)) + ((oj - 17022) * (110.932F - oj)));
        }
    }
    h_check_sum += l7 + Float.floatToIntBits(si) + l7a + k + os0 + Double.doubleToLongBits(q49) + oj + dj + fnv + (f ?
        1 : 0) + x9 + checkSum(w) + checkSum(m9);
}

public static void i(byte r, byte ut) {

    double lso=-121.245;
    long ray=-1281659487310904043L, jkn[]=new long[N];
    float hhj=-71.940F;
    int zfz=-42174, ya=-870, f1=50348, h6=-58498, wys[]=new int[N];

    init(wys, -40807);
    init(jkn, -731142003192248288L);

    for (zfz = 4; zfz < 89; ++zfz) {
        ya -= (int)(5767 - (--lso));
        wys[zfz] *= zfz;
        ya *= (int)lso;
        ya -= (int)((--ya) + (62616 + (hhj * 34656)));
        ya += zfz;
        for (f1 = 1; f1 < 21; f1++) {
            ya += f1;
            ya *= (++ya);
            ray -= (h6 + jkn[zfz]);
            ya += (wys[zfz]--);
            h6 = (int)(jkn[zfz - 1] |= ray);
        }
    }
    i_check_sum += r + ut + zfz + ya + Double.doubleToLongBits(lso) + Float.floatToIntBits(hhj) + f1 + ray + h6 +
        checkSum(wys) + checkSum(jkn);
}

public static void main(String[] jbx) {

    double hy=53.901;
    short il=-1465;
    long rn=-1807272374232918732L, gq[]=new long[N];
    byte l=0, fm=45;
    float a=-55.265F, db[][]=new float[N][N];
    int cs9=42971, g=52979, ml=-27898, d=60037, gw=-63502, fn1=57805, v4=8833, jo[]=new int[N];

    init(jo, 13403);
    init(gq, 3614771266584826901L);
    init(db, 121.18F);

    for (cs9 = 3; cs9 < 95; ++cs9) {
        l += (byte)(jo[cs9 - 1] -= (int)((--rn) - (cs9 - 86.782)));
        jo[cs9 - 1] = cs9;
        g += (-15779 + (cs9 * cs9));
        g <<= ((g++) << -31377);
        h(-43087, --a, cs9 - cs9);
        rn <<= jo[(cs9 >>> 1) % N];
        i((byte)(((il--) * g) + ((g << rn) + g)), (byte)(rn - (g++)));
        hy = cs9;
        rn = (g++);
        rn *= (++g);
    }
    for (ml = 4; ml < 78; ml++) {
        for (d = 1; d < 63; ++d) {
            a += (--g);
            g &= (++g);
            g -= (int)(((g - rn) * (-(d + il))) + jo[d]);
            rn += (d - gw);
        }
    }
    for (fn1 = 3; fn1 < 76; fn1++) {
        g += (int)(gq[fn1 + 1] * ((++jo[fn1]) - (--jo[fn1 + 1])));
        jo[fn1 - 1] = (int)rn;
        gw += (33490 + (fn1 * fn1));
        l *= (byte)(--db[fn1][fn1]);
        for (v4 = 1; v4 < 75; ++v4) {
            gq[fn1 + 1] -= (((cs9 - cs9) * (l + d)) - (g--));
        }
        g %= (int)((long)((fm = (byte)(gw + cs9)) - (a - (fn1 + fm))) | 1);
    }

    System.out.println("cs9 l rn = " + cs9 + "," + l + "," + rn);
    System.out.println("g a il = " + g + "," + Float.floatToIntBits(a) + "," + il);
    System.out.println("hy ml d = " + Double.doubleToLongBits(hy) + "," + ml + "," + d);
    System.out.println("gw fn1 v4 = " + gw + "," + fn1 + "," + v4);
    System.out.println("fm jo gq = " + fm + "," + checkSum(jo) + "," + checkSum(gq));
    System.out.println("db = " + Double.doubleToLongBits(checkSum(db)));


    System.out.println("h_check_sum: " + h_check_sum);
    System.out.println("i_check_sum: " + i_check_sum);
}
}