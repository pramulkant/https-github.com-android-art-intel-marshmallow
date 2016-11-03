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

// Generated by Dalvik Fuzzer tool (3.2.001). Sun Apr 27 01:16:17 2014
package OptimizationTests.regression.test190833;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 500;


public static void main(String[] wj) {

    long cn=1491222428818161795L, xsg=995923806951779934L, pu=-4317371418652291112L, n[][]=new long[N][N];
    int u2t=-9205, o7=36992, m=26807, yr3=-17151, so9=11170, aw=-4726, jv=-4542, h[]=new int[N], td[]=new int[N],
        w[]=new int[N];
    byte ty=49;
    float r7=-103.778F;
    double f5=27.252;

    init(h, -12876);
    init(td, -14715);
    init(w, -1132);
    init(n, -3340977989788036237L);

    for (u2t = 23; u2t < 382; u2t++) {
        try {
            for (o7 = 2; o7 < 258; o7++) {
                r7 *= 2312508767670601L;
                cn -= xsg;
            }
            r7 += (float)((-(-54.67 * (-(cn - m)))) + m);
            h[u2t - 1] = (int)-923385050681678285L;
        }
        catch (NullPointerException hhm) {
            yr3 = u2t;
            while ( --yr3 > 0 ) {
                pu <<= (-((h[u2t - 1]++) + (6188 * (m + so9))));
                pu += (long)((--so9) * (-(u2t * f5)));
            }
            td[u2t] += ty;
            for (aw = 428; aw > 16; aw -= 2) {
                td[u2t - 1] <<= (w[u2t]--);
                jv = (--so9);
                ty = (byte)(n[aw + 1][aw]++);
            }
        }
    }

    System.out.println("u2t o7 r7 = " + u2t + "," + o7 + "," + Float.floatToIntBits(r7));
    System.out.println("cn xsg m = " + cn + "," + xsg + "," + m);
    System.out.println("yr3 pu so9 = " + yr3 + "," + pu + "," + so9);
    System.out.println("f5 ty aw = " + Double.doubleToLongBits(f5) + "," + ty + "," + aw);
    System.out.println("jv h td = " + jv + "," + checkSum(h) + "," + checkSum(td));
    System.out.println("w n = " + checkSum(w) + "," + checkSum(n));
    
}
}