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

// Generated by Dalvik Fuzzer tool (3.5.001). Tue Mar 24 19:14:12 2015
package OptimizationTests.regression.test1757_3;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long lFld=2245525923L;

    public static long iMeth_check_sum = 0;

public static int iMeth(int i7, int i8) {

    float f2=-87.217F;
    double d1=79.128698;
    int i9=9, i10=-219, i11=-204, i12=-7, i13=-29, iArr1[]=new int[N];
    short s=-13454;

    init(iArr1, 6);

    i9 = 1;
    do {
        lFld += i7;
    } while (++i9 < 88);
    i10 = 1;
    while (++i10 < 98) {
        i7 = i9;
        i11 += (i10 * i10);
        i11 = (int)(lFld + (lFld + (i8++)));
        i7 -= i7;
        try {
            i7 = (int)(f2--);
            i12 = 1;
            while (++i12 < 57) {
                iArr1[i12 - 1] = (int)(((s - f2) - (-41367L + i10)) * (lFld - (-9 * (d1 - lFld))));
                i7 = (int)(lFld *= (0 * (i8++)));
            }
        }
        catch (ArithmeticException exc) {
            f2 += i10;
        }
        finally {
            i13 += i10;
        }
    }
    long meth_res = i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f2) + i12 + s + Double.doubleToLongBits(d1) + i13 +
        checkSum(iArr1);
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    long l=-29166L;
    float f=1.981F, f1=2.81F;
    double d=-2.85275;
    int i=3, i1=8, i2=-5671, i3=-3, i4=117, i6=-9, iArr[]=new int[N];
    short sArr[]=new short[N];
    boolean b=false, bArr[][]=new boolean[N][N];

    init(iArr, -87);
    init(sArr, (short)3052);
    init(bArr, false);

    for (i = 96; i > 1; i -= 3) {
        for (i1 = 1; i1 < 24; ++i1) {
            for (i2 = 52; i2 > 3; --i2) {
                l = (long)(((i2 + l) + (f = (float)d)) * (Float.floatToRawIntBits(f) + (l | i)));
                try {
                    i3 = (iArr[i1 - 1] % -254);
                    i3 = (i % i);
                    iArr[i] = (i3 / 205);
                } catch (ArithmeticException a_e) {}
                i4 *= (int)((l++) - f);
                i4 += (int)(-l);
                if (b) continue;
                f += (13031 + (i2 * i2));
                sArr[i2 + 1] = (short)(((232 * (i3 + i4)) - (i2 + i)) - ((i3 - l) + i1));
                d -= (i3 >>= (i4++));
            }
            iArr[i] = (int)((long)((i2 + f1) * i3) ^ (long)(f - (-i4)));
            b = (((i4 + i1) - i3) > (++i3));
            i4 = (int)((f1 - i4) - (i4--));
            b = ((!(b = b)) || (bArr[i1][i1] = (b || true)));
        }
        l *= (iArr[i + 1] - i4);
        i3 += (i | l);
        i4 += (((i * i1) + i) - f1);
    }
    for (int i5 : iArr) {
        i3 += (int)(d--);
        d = (((-4213L + (i3 >> i)) - (--i5)) * -85L);
        i6 >>= (i5 + iMeth((int)(-8 - (104 - (d - lFld))), i4 / 27102));
        lFld *= iMeth(iArr[(i5 >>> 1) % N], iArr[(i3 >>> 1) % N]++);
        i3 = i1;
        d += lFld;
    }

    System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
    System.out.println("l f d = " + l + "," + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d));
    System.out.println("i3 i4 b = " + i3 + "," + i4 + "," + (b ? 1 : 0));
    System.out.println("f1 i6 iArr = " + Float.floatToIntBits(f1) + "," + i6 + "," + checkSum(iArr));
    System.out.println("sArr bArr = " + checkSum(sArr) + "," + checkSum(bArr));

    System.out.println("lFld = " + lFld);

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}
