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

// Generated by Dalvik Fuzzer tool (3.5.001). Tue Apr  7 14:39:22 2015
package OptimizationTests.regression.test1184;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


    public static long iMeth_check_sum = 0;

public static int iMeth(int i2, int i3, int i4) {

    int i6=-8, i7=-114, i8=58975, iArr[]=new int[N];
    long l=7L;
    short s=-25833;
    byte by=-93;
    double d=-62.10490;
    boolean b=false;
    float f=0.920F, fArr[]=new float[N];

    init(iArr, 32);
    init(fArr, -2.76F);

    for (int i5 : iArr) {
        if ((b = ((i3 <= i3) || (!(l <= i5)))) ^ ((--i5) < (i3 + (by - d)))) {
            i3 += (iArr[(i3 >>> 1) % N] + (-(-64023 * (-(i3--)))));
            i3 = (--i4);
            b = false;
            fArr[(i5 >>> 1) % N] = (f / (0 | 1));
        }
    }
    for (i6 = 5; i6 < 91; ++i6) {
        i2 = (int)(d++);
        for (i7 = 1; i7 < 1; i7++) {
            for (i8 = 1; i8 < 18; i8++) {
                l = iArr[i8];
                i2 += (((i8 * s) + l) - f);
            }
        }
    }
    long meth_res = i2 + i3 + i4 + (b ? 1 : 0) + Float.floatToIntBits(f) + l + by + Double.doubleToLongBits(d) + i6 +
        i7 + i8 + s + checkSum(iArr) + Double.doubleToLongBits(checkSum(fArr));
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    long l1=63107L, lArr[]=new long[N];
    int i=-62708, i1=1665, i9=-63340, iArr1[]=new int[N];
    short s1=-8051;
    double d1=15.65964, dArr[]=new double[N];
    float f1=2.227F;

    init(lArr, 4104918741L);
    init(dArr, -1.74393);
    init(iArr1, -1152);

    for (i = 4; i < 88; i++) {
        i1 >>= (int)(lArr[i] - dArr[i]);
        i1 = iMeth(i1, (int)((--iArr1[i - 1]) + (i1 >>> 2311364177880879562L)), (int)((--l1) - l1));
        for (i9 = 1; i9 < 17; i9++) {
            i1 -= ((i1--) * (i1++));
            i1 = i1;
            i1 = (--i1);
            iArr1[i] = (((i9 + i9) + (-4165 - (i + -63761))) + i);
            i1 += (((i9 * i9) + i1) - i);
        }
        i1 >>= (++i1);
        i1 >>= (int)(i << (Double.doubleToRawLongBits(d1) - (i9 - -2929513867570264588L)));
        i1 >>= (int)(Float.floatToRawIntBits((float)(-(d1 + i1))) + l1);
        s1 += (short)(i ^ i1);
        f1 -= (i + i1);
    }

    System.out.println("i i1 l1 = " + i + "," + i1 + "," + l1);
    System.out.println("i9 d1 s1 = " + i9 + "," + Double.doubleToLongBits(d1) + "," + s1);
    System.out.println("f1 lArr dArr = " + Float.floatToIntBits(f1) + "," + checkSum(lArr) + "," +
        Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("iArr1 = " + checkSum(iArr1));


    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}