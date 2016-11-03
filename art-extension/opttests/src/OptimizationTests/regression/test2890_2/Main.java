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

// Generated by Android Runtime Fuzzer tool (3.5.002). Wed Nov 18 12:48:06 2015
// srand = 71517646695662889529759374482937205630

package OptimizationTests.regression.test2890_2;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long lFld=-6L;
    public static int iFld=13, iArrFld[]=new int[N];

    static {
        init(iArrFld, -164);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

public static int iMeth(long l, long l1) {

    int i=139, i1=-9088, i2=-6;
    float f=-64.356F;
    double d=56.110027;
    long lArr[]=new long[N];

    init(lArr, -1551052290L);

    i = 1;
    do {
        for (i1 = 1; i1 < 15; i1++) {
            i2 -= iArrFld[i1 + 1];
            l1 += i2;
            i2 >>= (int)lArr[i1 - 1];
            i2 = (++iArrFld[(i1 >>> 1) % N]);
        }
        i2 -= (int)(((long)(f * l1) >> l) + (i1 * (d - i1)));
        i2 *= -157;
        i2 %= (int)(i1 | 1);
        i2 = (int)(i - ((-58.581F + (i - i1)) - l));
        i2 <<= (int)((f--) * iArrFld[(i1 >>> 1) % N]);
        if ((i2++) >= iArrFld[i - 1]) continue;
    } while ((i += 3) < 92);
    long meth_res = l + l1 + i + i1 + i2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + checkSum(lArr);
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static long lMeth() {

    double d2=-11.111108, d3=1.47365;
    int i8=5, i9=198;
    float f2=-78.734F;
    short s=-26324;
    long lArr2[]=new long[N];

    init(lArr2, -3353428449L);

    for (d2 = 2; d2 < 96; ++d2) {
        lFld = (iArrFld[(int)(d2)]++);
        iFld -= (int)lArr2[(int)(d2 - 1)];
        for (i8 = 1; i8 < 37; ++i8) {
            f2 %= (i8 | 1);
            lFld += i8;
            for (i9 = 1; i9 < 6; ++i9) {
                d3 = Math.min((int)((-911 ^ (5 * s)) + (12 - f2)), iFld++);
                iFld = (Math.min(iFld, iFld--) & i8);
                try {
                    iFld = (i9 % iArrFld[i8]);
                    iFld = (iFld % -1728570286);
                    iFld = (i8 / iFld);
                } catch (ArithmeticException a_e) {}
                d3 += ((iFld--) - (++iArrFld[(int)(d2)]));
                iFld += (i9 * i9);
            }
        }
    }
    long meth_res = Double.doubleToLongBits(d2) + i8 + Float.floatToIntBits(f2) + i9 + Double.doubleToLongBits(d3) + s
        + checkSum(lArr2);
    lMeth_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] strArr) {

    int i3=-19824, i4=-1, i5=1, i6=8762, i7=-219;
    double d1=-2.58610;
    float f1=-2.823F, fArr[]=new float[N];
    byte by=127;
    boolean b=false, bArr[]=new boolean[N];
    short sArr[][]=new short[N][N];
    long lArr1[]=new long[N];

    init(fArr, 78.956F);
    init(sArr, (short)-19221);
    init(bArr, true);
    init(lArr1, 2985L);

    iMeth(lFld, lFld--);
    for (i3 = 82; i3 > 5; --i3) {
        for (i4 = i3; i4 > 1; --i4) {
            fArr[i3] *= ((-38142 * (i4 * i4)) + Short.reverseBytes((short)(sArr[i3][i3] *= (short)lFld)));
            iFld = (iFld--);
            iFld >>= (iArrFld[i3]++);
            lFld = (long)((iArrFld[i4] += (int)Math.abs(d1)) + (iFld--));
            lFld = (iFld *= (iFld++));
            iFld = (int)((-i4) - (--lFld));
            lFld ^= (((iArrFld[i4 - 1]++) + (i3 - lFld)) + (++iFld));
            bArr[i3 + 1] = bArr[i3];
            if (b) {
                f1 *= (iFld--);
                lFld -= (long)105.4577;
                iArrFld[i3 + 1] >>= (int)(sArr[i3 - 1][i4] = (short)(i5 + (i3 + lFld)));
            } else if (b) {
                by <<= (byte)(--i5);
                lArr1[i3] += (i3 - iFld);
            }
            i6 = 1;
            while (++i6 < i3) {
                i5 = iFld;
                d1 = iFld;
                f1 -= (++i5);
                i5 = (int)((iArrFld[i3 - 1]++) + ((long)(lFld - 0.1014F) | (-iArrFld[i4])));
                lFld += (((i6 * lFld) + i5) - i4);
            }
        }
        i5 += (((i3 * iFld) + i7) - i5);
        i5 = (int)lMeth();
    }

    System.out.println("i3 i4 d1 = " + i3 + "," + i4 + "," + Double.doubleToLongBits(d1));
    System.out.println("f1 i5 by = " + Float.floatToIntBits(f1) + "," + i5 + "," + by);
    System.out.println("b i6 i7 = " + (b ? 1 : 0) + "," + i6 + "," + i7);
    System.out.println("fArr sArr bArr = " + Double.doubleToLongBits(checkSum(fArr)) + "," + checkSum(sArr) + "," +
        checkSum(bArr));
    System.out.println("lArr1 = " + checkSum(lArr1));

    System.out.println("lFld iFld iArrFld = " + lFld + "," + iFld + "," + checkSum(iArrFld));

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
    System.out.println("lMeth_check_sum: " + lMeth_check_sum);
}
}