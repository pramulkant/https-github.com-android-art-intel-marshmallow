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

// Generated by Dalvik Fuzzer tool (3.5.001). Mon Apr 20 05:30:44 2015
package OptimizationTests.regression.test1209;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


    public static long vMeth_check_sum = 0;

public static void vMeth(double d2, int i6) {

    int i7=-10, i8=-1, i9=-52058, i10=51996, iArr1[]=new int[N];
    boolean b=true;
    byte by1=81;
    float f1=-2.815F;
    long l2=274737931L;

    init(iArr1, 14207);

    for (i7 = 6; i7 < 98; i7++) {
        i6 = (int)d2;
        for (i8 = 61; i8 > i7; i8--) {
            i6 += -3;
            l2 += (((i8 * f1) + i7) - i6);
            iArr1[i8 + 1] <<= (++i6);
            b = b;
            for (i9 = 2; i9 < 50; i9++) {
                d2 = (Float.floatToRawIntBits(f1) % (i9 | 1));
            }
            i6 += (int)(i6 - 366017035L);
            by1 *= (byte)((d2++) - ((i10 += i7) - (i9 * i10)));
        }
        i10 += (i7 * i7);
    }
    vMeth_check_sum += Double.doubleToLongBits(d2) + i6 + i7 + i8 + l2 + Float.floatToIntBits(f1) + (b ? 1 : 0) + i9 +
        by1 + i10 + checkSum(iArr1);
}

public static void main(String[] strArr) {

    int i=218, i1=-6, i2=8289, i3=-9, i4=-10, i5=20786, iArr[]=new int[N];
    byte by=57, byArr[]=new byte[N];
    float f=2.950F;
    short s=17204;
    long l=-1823354959518625188L, l1=-102L;
    double d=-1.94543, d1=-36.46127;

    init(iArr, -2);
    init(byArr, (byte)112);

    for (i = 4; i < 95; i++) {
        d -= (((-46 + (l ^ l)) + (58087 % ((l += i) | 1))) - (iArr[i - 1] + (i1++)));
        l = (iArr[i] - (-iArr[i + 1]));
        iArr[i] = (int)(i1 + (Double.longBitsToDouble(l) + Math.max(-12, i)));
    }
    switch ((((i1 * s) >>> 1) % 2) + 7) {
    case 7:
        for (i2 = 3; i2 < 80; i2++) {
            i1 = (int)((i1++) / ((-(i1 / (l | 1))) | 1));
            i1 -= (int)Math.min((++i1) * l, (--iArr[i2 + 1]) - (-(i - by)));
            l += i2;
        }
        i3 = 83;
        do {
            for (d1 = 1; d1 < i3; d1++) {
                i1 += i;
                i1 += (int)(s -= (short)(i1 - -1.567F));
                f -= (((-(l * i4)) * (i2 - l)) << (i1--));
                for (i5 = 2; i5 < 38; i5++) {
                    i1 -= (int)(((l * i) + (i5 - l)) + ((-(i - i2)) + (++i4)));
                    i1 *= ((-(-(-(++i1)))) >>> -3);
                    i4 = i4;
                    iArr[i3 - 1] <<= (i1--);
                    i4 = ((i1--) + i3);
                }
                i1 += (int)((i4 &= (by--)) - ((203 * (i2 * i1)) >> (l1--)));
                i4 -= (++i4);
                l1 += by;
            }
        } while (--i3 > 0);
        byArr[(i1 >>> 1) % N] = (byte)i3;
        break;
    case 8:
        vMeth(d1, iArr[(i5 >>> 1) % N]);
        break;
    }

    System.out.println("i d l = " + i + "," + Double.doubleToLongBits(d) + "," + l);
    System.out.println("i1 s i2 = " + i1 + "," + s + "," + i2);
    System.out.println("by i3 d1 = " + by + "," + i3 + "," + Double.doubleToLongBits(d1));
    System.out.println("f i4 i5 = " + Float.floatToIntBits(f) + "," + i4 + "," + i5);
    System.out.println("l1 iArr byArr = " + l1 + "," + checkSum(iArr) + "," + checkSum(byArr));


    System.out.println("vMeth_check_sum: " + vMeth_check_sum);
}
}