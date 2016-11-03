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

// Generated by Dalvik Fuzzer tool (3.5.001). Sat Mar 21 15:41:20 2015
package OptimizationTests.regression.test1757_2;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static int iFld=-1050;

    public static long fMeth_check_sum = 0;

public static float fMeth(int i6, int i7) {

    float f1=121.259F;
    boolean b=true;
    long l1=153L;
    double d1=0.119815;
    int i8=254, i9=-44287, i10=-4, iArr3[]=new int[N];

    init(iArr3, 23174);

    for (iFld = 2; iFld < 87; ++iFld) {
        i7 = (++i6);
        i7 -= (int)((i7 = (int)(-(--l1))) + (++i7));
        for (i8 = 2; i8 < 75; i8++) {
            for (i9 = 1; i9 < 15; i9++) {
                b = b;
                f1 += (i9 + l1);
                f1 += ((i6 * (--i7)) - ((-284456216924921199L / ((--iArr3[i8]) | 1)) - -3L));
            }
            l1 <<= (i9 * l1);
            i10 = 1;
            do {
                i7 += i10;
                i7 += (int)d1;
            } while (++i10 < 59);
        }
    }
    long meth_res = i6 + i7 + l1 + i8 + i9 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i10 + Double.doubleToLongBits(d1)
        + checkSum(iArr3);
    fMeth_check_sum += meth_res;
    return (float)meth_res;
}

public static void main(String[] strArr) {

    float f=1.152F, fArr[][]=new float[N][N];
    byte by=-80;
    long l=63L, lArr[]=new long[N];
    double d=2.117777, dArr[][]=new double[N][N];
    int i=-34944, i1=1, i2=-20634, i3=50542, i4=131, i5=15524, i11=-2, i12=-56708, i13=17088, iArr[]=new int[N],
        iArr1[]=new int[N], iArr2[]=new int[N];

    init(iArr, -8);
    init(iArr1, -3907);
    init(iArr2, 13);
    init(lArr, 3830545589L);
    init(dArr, -1.77147);
    init(fArr, -61.532F);

    i = 1;
    while (++i < 78) {
        iArr[i] = (-i);
        d *= ((--d) * (i1--));
        l >>= (iArr[i + 1]++);
        i1 = (-iArr1[i]);
        i1 = iArr2[i + 1];
        i1 += ((iArr2[i - 1] + i) - i);
        for (i2 = 2; i2 < 42; i2 += 3) {
            f += (i2 - i2);
        }
        l += l;
        i3 += iArr[i + 1];
        iArr[i + 1] = i1;
    }
    for (i4 = 3; i4 < 86; ++i4) {
        lArr[i4 - 1] = (long)(((++iArr[i4]) * (-2.52406 - i)) - (-(i3--)));
        for (i5 = i4; i5 < 51; ++i5) {
            iArr1[i5] <<= (-Math.max(-35050, i5));
        }
        i3 %= ((i4 - (i3--)) | 1);
        i3 += (i4 - l);
        i3 <<= (int)((++i1) + ((f = by) + i2));
        i3 *= (int)fMeth(i11, 40041);
        for (i12 = 1; i12 < 76; ++i12) {
            iArr1[i4] *= (int)(((181L - i5) * (-(--f))) + ((lArr[i4]++) / (i5 | 1)));
            i13 -= (++by);
            i3 *= (int)dArr[i4 + 1][i4];
            fArr[i12 - 1][i4 - 1] = (float)((i3 << 4003396860L) + ((i5 * f) + d));
        }
    }

    System.out.println("i d i1 = " + i + "," + Double.doubleToLongBits(d) + "," + i1);
    System.out.println("l i2 f = " + l + "," + i2 + "," + Float.floatToIntBits(f));
    System.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
    System.out.println("by i11 i12 = " + by + "," + i11 + "," + i12);
    System.out.println("i13 iArr iArr1 = " + i13 + "," + checkSum(iArr) + "," + checkSum(iArr1));
    System.out.println("iArr2 lArr dArr = " + checkSum(iArr2) + "," + checkSum(lArr) + "," +
        Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("fArr = " + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("iFld = " + iFld);

    System.out.println("fMeth_check_sum: " + fMeth_check_sum);
}
}