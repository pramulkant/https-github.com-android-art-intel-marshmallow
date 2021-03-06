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

// Generated by Dalvik Fuzzer tool (3.3.001). Fri May 16 23:51:03 2014
package OptimizationTests.regression.test196029;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 300;

    public static int d[]=new int[N];

    static {
        init(d, -22216);
    }

public static void main(String[] kyi) {

    boolean ht=true;
    short n=-4300;
    float a=100.832F;
    byte wr=-24;
    long i=-8044666472184659562L, ai=-1799608335689344468L, uei[]=new long[N];
    double gq=52.595;
    int sn=-31009, v=42093, hj=62556, wbq=12898, l=-41320, p=-17279, ikg=-48208, kx4=59039, j=-62080, oz=-57546;

    init(uei, -3516226063603949900L);

    for (int u : d) {
        sn += (d[(v >>> 1) % N]++);
        i += (--v);
        i -= (long)(((-97.928 - (gq--)) + (v - v)) - uei[(u >>> 1) % N]);
    }
    for (hj = 14; hj < 279; hj++) {
        for (wbq = 188; wbq > 2; wbq--) {
            i = 22184;
            for (l = 98; l > 3; --l) {
                d[hj - 1] -= (int)(uei[hj]++);
                i = i;
                sn += (int)a;
                d[wbq + 1] += l;
            }
            sn += (int)(((sn--) + (11 - (ai--))) + (a--));
            v = (int)(((v - gq) * (p - n)) + ((2074 - (sn * v)) - gq));
            i |= (long)(85.655 + (-(a--)));
            gq = (uei[hj]++);
            p = (int)(61074 + (uei[wbq] - (hj - i)));
            ikg -= (int)((++ikg) - gq);
            for (kx4 = wbq; kx4 < 289; kx4++) {
                i -= (long)(((++p) - (j--)) + (gq * (j - hj)));
                ht = ((!(-55.976 != (n++))) && ht);
                v >>= (int)(((oz - a) * (-l)) - (d[wbq - 1] - (-21656 * (kx4 - wr))));
                j = (int)(gq - ikg);
                d[wbq + 1] *= wbq;
                v = (int)(((--i) - (ai - -25503)) + (--i));
            }
        }
    }

    System.out.println("sn v i = " + sn + "," + v + "," + i);
    System.out.println("gq hj wbq = " + Double.doubleToLongBits(gq) + "," + hj + "," + wbq);
    System.out.println("l a ai = " + l + "," + Float.floatToIntBits(a) + "," + ai);
    System.out.println("p n ikg = " + p + "," + n + "," + ikg);
    System.out.println("kx4 j ht = " + kx4 + "," + j + "," + ht);
    System.out.println("oz wr uei = " + oz + "," + wr + "," + checkSum(uei));
    
    System.out.println("d = " + checkSum(d));
}
}
