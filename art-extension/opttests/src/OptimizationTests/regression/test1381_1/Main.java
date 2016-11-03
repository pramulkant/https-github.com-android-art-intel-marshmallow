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

// Generated by Dalvik Fuzzer tool (3.5.001). Sun Feb  1 03:44:11 2015
package OptimizationTests.regression.test1381_1;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static byte byFld=98;

    public static long iMeth_check_sum = 0;

public static int iMeth(byte by) {

    int i3=-41660, i4=44949, i5=41982, i6=-191, iArr1[]=new int[N];
    float f=55.766F;
    byte byArr[]=new byte[N];
    long l1=7788856170692885215L, lArr1[][]=new long[N][N];
    double d=11.26013;

    init(iArr1, -26);
    init(lArr1, 6L);
    init(byArr, (byte)-13);

    for (i3 = 4; i3 < 90; i3++) {
        l1 *= (long)(((i4 = i3) / ((long)(l1 - f) | 1)) + ((i4 + 120) - i3));
        iArr1[i3] -= (--i4);
        i4 += i3;
    }
    i5 = 77;
    while (--i5 > 0) {
        i4 -= (int)(((by - i5) * (i4 = (int)-161L)) + ((-i5) - i4));
        i4 = i5;
        i6 = 1;
        while (++i6 < 66) {
            lArr1[i6 + 1][i6] *= (iArr1[i5] - i3);
            for (d = 2; d < 48; ++d) {
                byArr[(int)(d)] = (byte)(i4--);
                i4 = i3;
            }
        }
    }
    long meth_res = by + i3 + l1 + i4 + Float.floatToIntBits(f) + i5 + i6 + Double.doubleToLongBits(d) +
        checkSum(iArr1) + checkSum(lArr1) + checkSum(byArr);
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    int i=-54725, i1=8, i2=19022, i7=-26426, i8=-48776, i9=-7, iArr[]=new int[N], iArr2[]=new int[N];
    short s=-24273;
    float f1=0.461F, fArr[]=new float[N];
    long l=3L, l2=0L, lArr[][]=new long[N][N];
    double d1=48.80806;
    boolean b=true, bArr[]=new boolean[N];

    init(lArr, -7001278760293027247L);
    init(iArr, 146);
    init(bArr, true);
    init(iArr2, -44345);
    init(fArr, 0.677F);

    for (i = 2; i < 81; ++i) {
        if ((i2 *= (int)((-(0.97867 + iMeth((byte)(117)))) + iArr2[i + 1])) != (l - ((l--) + (i1 + byFld)))) {
            i1 += i;
        } else if (((i2 >>> (i2 + i2)) + (-19 + Math.abs(9))) <= l) {
            i1 += i;
        } else if (bArr[i + 1]) {
            i1 <<= i1;
            lArr[i - 1][i + 1] *= (((i2 + i2) + (++byFld)) + ((long)(-11208 + (1.9538 * l)) | iArr[i]));
            s *= byFld;
        } else {
            iArr[i + 1] -= ((iArr[i - 1] = iArr2[i + 1]) >>> i);
        }
        i1 += (int)-985471433L;
        i1 *= (int)(((i2 - byFld) - (l = l)) - (i1 &= i));
        l *= (long)(-((f1 + i2) * -190));
    }
    i7 = 1;
    while (++i7 < 77) {
        f1 = (++f1);
        for (i8 = 2; i8 < 56; i8++) {
            l /= (((l2 -= i) - ((i2++) - (--i2))) | 1);
            fArr[i7 - 1] %= (float)((long)(((0.34475 * (4927 + (191L + (byFld * i7)))) - (-62420 - d1)) + i8) | 1);
            iArr[i8 + 1] = (++i1);
            i1 = (int)((-(i8 + i7)) + l2);
        }
        b = (((i1 * -16021) + (l = -54535)) >= ((i8 * 10) & (245 * i)));
        for (i9 = 5; i9 < 91; ++i9) {
            iArr2[i9 - 1] = (iArr[(i >>> 1) % N]++);
            i2 += (int)(i + (d1 - i8));
            lArr[i9][i9 + 1] -= (long)((d1 -= (i2--)) * i2);
            f1 -= ((++i2) + i1);
            l += (long)((iArr2[i9 + 1] / ((long)(l2 - d1) | 1)) + (i2 - (i - i8)));
        }
    }

    System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
    System.out.println("l s f1 = " + l + "," + s + "," + Float.floatToIntBits(f1));
    System.out.println("i7 i8 l2 = " + i7 + "," + i8 + "," + l2);
    System.out.println("d1 b i9 = " + Double.doubleToLongBits(d1) + "," + (b ? 1 : 0) + "," + i9);
    System.out.println("lArr iArr bArr = " + checkSum(lArr) + "," + checkSum(iArr) + "," + checkSum(bArr));
    System.out.println("iArr2 fArr = " + checkSum(iArr2) + "," + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("byFld = " + byFld);

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}