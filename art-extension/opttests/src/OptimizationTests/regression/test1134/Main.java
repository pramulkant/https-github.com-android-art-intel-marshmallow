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

// Generated by Dalvik Fuzzer tool (3.5.001). Sat Jan 10 01:07:04 2015
package OptimizationTests.regression.test1134;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static byte byArrFld[]=new byte[N];

    static {
        init(byArrFld, (byte)-108);
    }

public static void main(String[] strArr) {

    long l=-5197848901671116190L, lArr[]=new long[N];
    boolean b=true, bArr[]=new boolean[N];
    byte by=-32;
    short s=-10550, sArr[]=new short[N];
    float f=0.48F;
    double d=0.45404, dArr[]=new double[N];
    int i=14, i1=-8, i2=8, i3=-3, i4=-28133, i5=56135, i6=-49253, iArr[]=new int[N];

    init(iArr, -2303);
    init(dArr, -14.40835);
    init(bArr, true);
    init(lArr, 6L);
    init(sArr, (short)31073);

    for (i = 4; i < 95; i++) {
        for (i1 = 3; i1 < 78; ++i1) {
            i2 += ((long)i1 | (long)i2);
            b = (b = ((i2--) > (0 - (-20209 + (i1 - i)))));
            i2 += (int)(Double.longBitsToDouble(i + i) + iArr[i + 1]);
            i2 += (int)(((f * l) + dArr[i1 + 1]) * (i2++));
            i2 = (++iArr[i1 + 1]);
            for (i3 = 1; i3 < i; i3++) {
                i2 -= i1;
                l = l;
                bArr[(i4 >>> 1) % N] = (i3 >= ((i - i3) >> (i2 -= 2)));
                i4 = (int)(l++);
                f -= (-Short.reverseBytes((short)(i1 + i1)));
                l = (lArr[i1 + 1] + i2);
                i2 = (int)(((l - -5) + (++i4)) - (s--));
            }
            i2 *= (iArr[i - 1]++);
            for (d = i1; d < 70; d++) {
                l = i4;
                i4 <<= (++i5);
                byArrFld[i1] >>= (byte)((Float.floatToRawIntBits(f) + (f++)) - i);
            }
            try {
                for (i6 = 1; i6 < i1; i6++) {
                    i2 += (int)lArr[i];
                    sArr[i1 - 1] = (short)Math.max((int)((l * i4) + (i5 + -59)), (int)((i5 - f) + by));
                    if (bArr[i6]) break;
                }
            }
            catch (NegativeArraySizeException exc) {
                iArr[i1 + 1] >>= (int)((i1 * f) - (41L + by));
            }
            catch (NullPointerException exc1) {
                f -= ((lArr[i1 + 1] % ((i6 / (i | 1)) | 1)) - l);
            }
            finally {
                i2 = (-(byArrFld[(i4 >>> 1) % N] - i2));
            }
        }
    }

    System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
    System.out.println("b f l = " + (b ? 1 : 0) + "," + Float.floatToIntBits(f) + "," + l);
    System.out.println("i3 i4 s = " + i3 + "," + i4 + "," + s);
    System.out.println("d i5 i6 = " + Double.doubleToLongBits(d) + "," + i5 + "," + i6);
    System.out.println("by iArr dArr = " + by + "," + checkSum(iArr) + "," + Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("bArr lArr sArr = " + checkSum(bArr) + "," + checkSum(lArr) + "," + checkSum(sArr));

    System.out.println("byArrFld = " + checkSum(byArrFld));
}
}