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

// Generated by Dalvik Fuzzer tool (3.5.001). Fri Mar 20 11:15:45 2015
package OptimizationTests.regression.test7317;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static int iArrFld[]=new int[N];

    static {
        init(iArrFld, -13);
    }

    public static long lMeth_check_sum = 0;

public static long lMeth(int i2, int i3) {

    int i4=5, i5=-18, i6=-4, i7=14468, i8=-1;
    double d=-14.20999;
    short s=22243;
    byte by1=106;
    boolean b=true;
    long l=-24935L, l1=-2989713535L;

    for (i4 = 4; i4 < 82; ++i4) {
        if (i2 <= (d * (l -= (-(-(i5 / (i2 | 1))))))) break;
        i5 = (int)(l + ((i5 * d) - i2));
        i3 *= i6;
        i6 -= (int)(((s + d) / ((i5++) | 1)) / (((i2 - i3) * l) | 1));
        for (i7 = 1; i7 < 32; i7++) {
            for (i8 = 1; i8 < i7; ++i8) {
                i6 += (i8 * i8);
            }
            iArrFld[i7] *= iArrFld[i4 + 1];
            if (b) continue;
            i2 <<= (int)((i5 *= (int)(l1 - i6)) << (long)((i3 + i6) - (i4 * d)));
            i6 = (++by1);
        }
    }
    long meth_res = i2 + i3 + i4 + Double.doubleToLongBits(d) + l + i5 + i6 + s + i7 + i8 + (b ? 1 : 0) + l1 + by1;
    lMeth_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] strArr) {

    float f=13.485F, f1=-3.116F;
    int i=34389, i1=25194, i9=0, i10=211, i11=113;
    double d1=0.129773, d2=0.95979, d3=1.82945, dArr[]=new double[N];
    short s1=10742;
    long l2=-3344524933L, lArr[]=new long[N];
    byte by=80;

    init(lArr, -12L);
    init(dArr, -2.75021);

    for (i = 2; i < 85; i += 3) {
        by = (byte)-2757531205L;
        i1 = (int)lMeth((int)((-l2) - l2), (int)((i * i) >> 17272L));
        l2 ^= l2;
        i9 = 1;
        do {
            i1 = (int)l2;
            i1 *= (int)(((l2--) * (126.106236 + (f + l2))) - i1);
            i1 += (i9 ^ i);
            s1 >>= (short)(((d1 - 36130) + (++i10)) + ((i - f) * (-(d2 * i9))));
            if (Double.longBitsToDouble(--lArr[i]) < i) continue;
            i1 = (int)((i % ((long)(--f) | 1)) + (d3--));
            f += (i9 - f);
            lArr[i9] = (long)dArr[i9 - 1];
        } while (++i9 < 42);
        f = (float)(s1 -= (short)(d3 = (i10 + 1693029673766701581L)));
        for (f1 = 28; f1 > 1; f1--) {
            i10 += (-51 + (f1 * f1));
            l2 -= (Math.abs(l2--) - i10);
            f += i10;
            lArr[i] *= (i1++);
        }
        iArrFld[i] = (++i1);
        switch (((i % 2) * 5) + 41) {
        case 46:
            i10 = (int)(((i10 * f1) - (i10 >>> i10)) + ((--i10) + (i10 * i10)));
            i11 = 1;
            while (++i11 < 92) {
                i10 += (int)d2;
                i10 = i9;
            }
            break;
        case 50:
            i1 = (int)(f += ((241 + l2) - (i + i10)));
        }
    }

    System.out.println("i by i1 = " + i + "," + by + "," + i1);
    System.out.println("l2 i9 f = " + l2 + "," + i9 + "," + Float.floatToIntBits(f));
    System.out.println("s1 d1 i10 = " + s1 + "," + Double.doubleToLongBits(d1) + "," + i10);
    System.out.println("d2 d3 f1 = " + Double.doubleToLongBits(d2) + "," + Double.doubleToLongBits(d3) + "," +
        Float.floatToIntBits(f1));
    System.out.println("i11 lArr dArr = " + i11 + "," + checkSum(lArr) + "," + Double.doubleToLongBits(checkSum(dArr)));

    System.out.println("iArrFld = " + checkSum(iArrFld));

    System.out.println("lMeth_check_sum: " + lMeth_check_sum);
}
}