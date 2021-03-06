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

// Generated by Dalvik Fuzzer tool (3.5.001). Sat Mar  7 23:43:42 2015
package OptimizationTests.regression.test1683;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static short sFld=-30540;
    public static float fFld=-51.530F;

    public static long vMeth_check_sum = 0;

public static void vMeth() {

    int i7=50876, i8=5, i9=0, i10=-9227, i11=-194, iArr1[]=new int[N];
    short s=30104;
    double d1=1.15181, dArr[]=new double[N];
    byte by1=48;
    float f2=0.957F;
    long l1=254L, lArr1[]=new long[N];
    boolean b=false;

    init(iArr1, 126);
    init(lArr1, -132983638L);
    init(dArr, -1.53960);

    f2 = 1;
    do {
        i7 = 7;
        while (--i7 > 0) {
            if (b = (((i7 * i7) + (s + 55254)) == ((-247 + (--d1)) * iArr1[i7 + 1]))) continue;
            //lArr1[i7 + 1] <<= (long)(Double.doubleToRawLongBits(-(35680 - s)) * dArr[i7]);
            lArr1[i7 + 1] <<= (long)((-(35680 - s)) * dArr[i7]);
            i8 = i8;
            for (i9 = 1; i9 < 22; ++i9) {
                l1 += (i9 * i9);
                l1 += (((i9 * l1) + s) - fFld);
                i10 = (int)(-(l1 >>> (long)(85.28804 - (sFld = (short)25))));
            }
            i8 = i11;
            i10 = (int)((iArr1[i7 + 1] += (i10 + by1)) * (-159L - (i8++)));
            try {
                iArr1[(int)(f2 - 1)] = (i11 / 1840042059);
                i10 = (i9 % i7);
                i10 = (i10 / 224);
            } catch (ArithmeticException a_e) {}
        }
    } while (++f2 < 96);
    vMeth_check_sum += Float.floatToIntBits(f2) + i7 + (b ? 1 : 0) + s + Double.doubleToLongBits(d1) + i8 + i9 + l1 +
        i10 + i11 + by1 + checkSum(iArr1) + checkSum(lArr1) + Double.doubleToLongBits(checkSum(dArr));
}

public static void main(String[] strArr) {

    int i=-11, i1=1, i2=3, i3=4, i4=-253, i5=2, i6=6, iArr[]=new int[N];
    short sArr[]=new short[N];
    double d=77.79304;
    byte by=122;
    float f=2.293F, f1=-2.192F, fArr[]=new float[N];
    long l=-124L, lArr[]=new long[N];

    init(lArr, -31L);
    init(iArr, -184);
    init(sArr, (short)-10783);
    init(fArr, 2.201F);

    for (i = 3; i < 98; i++) {
        i1 -= (int)((4427 / ((l + 4) | 1)) + ((i + l) * (41575 * by)));
    }
    for (i2 = 1; i2 < 76; ++i2) {
        i1 += (int)((i + i2) * ((--i1) - (l + i1)));
        i3 = 1;
        while (++i3 < 68) {
            i1 += (int)Long.reverseBytes(lArr[i2 + 1]++);
        }
        i1 += (int)((--l) + ((0.91085 + (iArr[i2]--)) + (i1++)));
        iArr[i2 - 1] = (int)((--by) + ((-196 + (by - -22.653F)) + (f + i3)));
        l = Math.min((int)((i & i1) + (f - i2)), (int)(i1 = (int)(-f)));
        l = (++i1);
        i1 = (sArr[i2 - 1]++);
        f -= (--l);
    }
    for (i4 = 80; i4 > 1; i4--) {
        for (i5 = 1; i5 < 35; i5 += 2) {
            f1 -= (by - 1);
            for (i6 = 1; i6 < 30; ++i6) {
                i1 += i6;
            }
            i1 |= (int)(i + ((i6 - i) / ((long)d | 1)));
            i1 += (int)f1;
        }
        l += (((i4 * i5) + i6) - f);
        i1 += iArr[i4];
        i1 &= (~((-iArr[i4 + 1]) - 191));
        i1 >>>= (int)(((i5 + i3) % ((i1 = (int)l) | 1)) + ((fArr[i4 - 1] = f) + i6));
    }
    i1 = iArr[(i >>> 1) % N];
    vMeth();

    System.out.println("i i1 l = " + i + "," + i1 + "," + l);
    System.out.println("by i2 i3 = " + by + "," + i2 + "," + i3);
    System.out.println("f i4 i5 = " + Float.floatToIntBits(f) + "," + i4 + "," + i5);
    System.out.println("f1 i6 d = " + Float.floatToIntBits(f1) + "," + i6 + "," + Double.doubleToLongBits(d));
    System.out.println("lArr iArr sArr = " + checkSum(lArr) + "," + checkSum(iArr) + "," + checkSum(sArr));
    System.out.println("fArr = " + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("fFld sFld = " + Float.floatToIntBits(fFld) + "," + sFld);

    System.out.println("vMeth_check_sum: " + vMeth_check_sum);
}
}
