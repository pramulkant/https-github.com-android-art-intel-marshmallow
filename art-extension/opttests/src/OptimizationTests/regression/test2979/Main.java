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

// Generated by Android Runtime Fuzzer tool (4.1.001). Tue Dec 15 22:56:51 2015
// srand = 26796780903184281874755454410195681343777992460882965400455483871654

package OptimizationTests.regression.test2979;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=0L;
    public static boolean bFld=false;
    public static byte byFld=-72;

public static void main(String[] strArr) {

    float f=-28.453F, fArr[]=new float[N];
    long l=0L, lArr[]=new long[N];
    double d=43.41488, d1=2.49684;
    int i=118, i1=49222, i2=1, i3=-51, i4=107, iArr[][]=new int[N][N], iArr1[]=new int[N];
    short s=-4298;

    init(fArr, 1.912F);
    init(lArr, 106L);
    init(iArr, -55941);
    init(iArr1, -68);

    if (Main.bFld) {
        for (i = 82; i > 3; i--) {
            fArr[i] *= ((i + Main.instanceCount) * i);
            l = ((long)((i + d) * (i + 14L)) << Math.min(-10 + (lArr[i + 1]--), 39L << (i + l)));
            f = (-((i - -10L) + (i + i)));
            Main.bFld = ((Main.instanceCount + (-i)) <= (--f));
            i1 = (int)(-16791L - (i >>> (l ^ l)));
            i1 = (int)(i1 + ((i1 / 1077810702010906243L) + (l >>> i1)));
            f -= iArr[i + 1][(i1 >>> 1) % N];
        }
    } else {
        for (i2 = 2; i2 < 87; i2++) {
            i3 = 1;
            do {
                short sArr[]=new short[N];
                i1 >>= (int)(((-145 % (Math.abs(i2) | 1)) >> l) + ((s++) + (61292 - sArr[i3 - 1])));
                i1 <<= (int)((i3 - i3) + (-(Main.instanceCount - -89.946F)));
                i1 >>>= (int)(Main.instanceCount - ((i3 * l) + (f - i)));
                iArr[i2 - 1][i3 + 1] -= (++i1);
                iArr[i3 + 1][i3 + 1] -= ((s + i1) * -88);
                i1 = (int)(i1 = (int)(l - (i1 -= (int)15926L)));
            } while (++i3 < i2);
            if ((i4 *= (int)((--i1) + (d1 % ((long)(f) | 1)))) < Main.instanceCount) {
                Main.instanceCount ^= ((iArr1[i2 + 1]++) / ((-(-(iArr[i2 + 1][i2 - 1]++))) | 1));
                fArr[i2 - 1] = 24221;
            } else if (((Main.byFld >> (i4 - -4)) * -14) != i4) {
                i1 = (int)(i4 + (d = (Main.instanceCount + i3)));
                for (float f1 : fArr) {
                    for (d1 = 1; d1 < 52; ++d1) {
                        i4 += (int)((--f1) % 243);
                        if (Main.bFld = (i2 >= ((i2 * f1) * (33103 * (i1--))))) break;
                    }
                }
            }
        }
    }

    System.out.println("i l d = " + i + "," + l + "," + Double.doubleToLongBits(d));
    System.out.println("f i1 i2 = " + Float.floatToIntBits(f) + "," + i1 + "," + i2);
    System.out.println("i3 s i4 = " + i3 + "," + s + "," + i4);
    System.out.println("d1 fArr lArr = " + Double.doubleToLongBits(d1) + "," + Double.doubleToLongBits(checkSum(fArr))
        + "," + checkSum(lArr));
    System.out.println("iArr iArr1 = " + checkSum(iArr) + "," + checkSum(iArr1));

    System.out.println("Main.instanceCount Main.bFld Main.byFld = " + Main.instanceCount + "," + (Main.bFld ? 1 : 0) +
        "," + Main.byFld);
}
}