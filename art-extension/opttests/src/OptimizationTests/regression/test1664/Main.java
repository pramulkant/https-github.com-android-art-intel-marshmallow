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

// Generated by Dalvik Fuzzer tool (3.5.001). Sun Mar  8 01:26:14 2015
package OptimizationTests.regression.test1664;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static int iFld=-48872;

    public static long iMeth_check_sum = 0;

public static int iMeth() {

    boolean b=false;
    float f1=0.345F, fArr[]=new float[N];
    int i4=-53148, i5=26607, i6=61353, i7=61442;
    long l1=-60L, lArr1[]=new long[N];

    init(lArr1, 2L);
    init(fArr, -1.486F);

    switch ((((--i4) >>> 1) % 1) + 92) {
    case 92:
        i5 = 1;
        while (++i5 < 81) {
            for (i6 = 2; i6 < 78; i6++) {
                for (i7 = i6; i7 > 1; i7--) {
                    b = (i7 <= f1);
                    i4 <<= ((i4--) - -12);
                    l1 = i7;
                }
                i4 = (int)(l1--);
                i4 += i6;
                lArr1[i6 - 1] %= (long)((long)((++fArr[i5]) + ((l1 + i6) + (i4 * i7))) | 1);
                i4 += (18783 + (i6 * i6));
                if (b) break;
            }
        }
        break;
    default:
        fArr[(i6 >>> 1) % N] -= (i5 - (++i4));
    }
    long meth_res = i4 + i5 + i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f1) + l1 + checkSum(lArr1) +
        Double.doubleToLongBits(checkSum(fArr));
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    boolean b1=true;
    float f=125.516F, fArr1[][]=new float[N][N];
    double d=1.64255, d1=-1.94298;
    int i=-11, i2=-180, i3=2, i8=11, i9=83, iArr[]=new int[N];
    long l=-2445774193L, lArr[]=new long[N];
    short s=-29612;

    init(iArr, 11);
    init(lArr, -34145L);
    init(fArr1, 0.128F);

    d = 1;
    do {
        iArr[(int)(d)] -= (int)(s = (short)Long.reverseBytes(i + l));
    } while (++d < 84);
    for (int i1 : iArr) {
        i2 -= (i--);
        lArr[(i2 >>> 1) % N] *= (long)(f++);
        i1 -= ((3 - i1) - -157);
    }
    for (i3 = 85; i3 > 3; i3--) {
        iArr[i3] += (int)(((f - d) - (++l)) - lArr[i3 - 1]);
        i = i3;
        i2 = (int)(((-89 - (i2 + i2)) - (i2 + i3)) * ((-iMeth()) * (d + f)));
        l >>= (lArr[i3 - 1] + lArr[i3]);
    }
    for (iFld = 5; iFld < 94; iFld++) {
        i2 += (int)(65108L + (iFld * iFld));
        if (((i <<= 0) | 12) != (l += ((++i2) * (62133 - (l + s))))) {
            i8 = 1;
            do {
                for (i9 = 2; i9 < 39; ++i9) {
                    fArr1[i9 - 1][iFld] += (l -= (l + (iArr[i8]--)));
                    f *= (((i8 + i3) + (0.265F * (i8 * i9))) * (-45115 - iArr[iFld - 1]));
                    i2 /= (int)((long)((Math.min(i2, i) * (i3 * f)) + (--i)) | 1);
                    f += (float)((-37 - (++f)) + ((59.74469 + (++d1)) - i3));
                    s <<= (short)i9;
                    i -= i2;
                }
                i = i3;
                l <<= s;
            } while (++i8 < 51);
        } else {
            b1 = b1;
        }
    }

    System.out.println("d s i = " + Double.doubleToLongBits(d) + "," + s + "," + i);
    System.out.println("l i2 f = " + l + "," + i2 + "," + Float.floatToIntBits(f));
    System.out.println("i3 i8 i9 = " + i3 + "," + i8 + "," + i9);
    System.out.println("d1 b1 iArr = " + Double.doubleToLongBits(d1) + "," + (b1 ? 1 : 0) + "," + checkSum(iArr));
    System.out.println("lArr fArr1 = " + checkSum(lArr) + "," + Double.doubleToLongBits(checkSum(fArr1)));

    System.out.println("iFld = " + iFld);

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}
