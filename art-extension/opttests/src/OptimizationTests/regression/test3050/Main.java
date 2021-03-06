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

// Generated by Android Runtime Fuzzer tool (4.1.001). Tue Dec 29 00:24:52 2015
// srand = 267773601082461693553948879783992266998

package OptimizationTests.regression.test3050;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=-7878328450850162656L;
    public static float fFld=1.496F;

public static void main(String[] strArr) {

    double d=83.76478, dArr[]=new double[N];
    int i=-66, i1=-182, i2=7, i3=6, iArr2[]=new int[N];
    short s=-26255;
    boolean b=true, bArr[]=new boolean[N];
    byte by=-45, byArr[]=new byte[N];
    long lArr[]=new long[N];
    float fArr[][]=new float[N][N];

    init(lArr, 2150161225072444943L);
    init(dArr, -71.71433);
    init(bArr, true);
    init(byArr, (byte)25);
    init(iArr2, 107);
    init(fArr, -122.625F);

    d = 1;
    while (++d < 89) {
        i += (int)((i *= i) * (-55633L + (i - s)));
        i1 = 1;
        while (++i1 < 14) {
            i = (++i);
            lArr[(int)(d - 1)] = (i1 + (-(-Main.instanceCount)));
            if (b) {
                i *= (int)Main.instanceCount;
                i2 = 1;
                do {
                    int iArr[]=new int[N];
                    iArr[i2] *= i2;
                    i ^= i2;
                    Main.fFld += (i2 * i2);
                    Main.instanceCount -= (long)dArr[(int)(d + 1)];
                    i *= (int)Main.instanceCount;
                } while ((i2 += 2) < i1);
                Main.instanceCount += (i1 * i1);
                for (i3 = 1; i3 < d; ++i3) {
                    int iArr1[]=new int[N];
                    bArr[(int)(d + 1)] = (!b);
                    i >>= (byArr[i1 + 1]--);
                    lArr[(i >>> 1) % N] |= (++i);
                    i -= i;
                    Main.instanceCount += (14 + (i3 * i3));
                    i = (s++);
                    i = (int)(--Main.fFld);
                    by = (byte)(((s * -98) - (iArr1[i3 - 1]++)) * (i++));
                }
            } else if ((-((i - i) << (i1 >> i1))) < (((fArr[(int)(d - 1)][(int)(d)]--) + (--i)) + d)) {
                iArr2[(int)(d - 1)] -= i;
                i -= (int)(((Main.instanceCount * i1) - i2) * ((11L * (i--)) + (i2 * i)));
            }
        }
    }

    System.out.println("d i s = " + Double.doubleToLongBits(d) + "," + i + "," + s);
    System.out.println("i1 i2 i3 = " + i1 + "," + i2 + "," + i3);
    System.out.println("b by lArr = " + (b ? 1 : 0) + "," + by + "," + checkSum(lArr));
    System.out.println("dArr bArr byArr = " + Double.doubleToLongBits(checkSum(dArr)) + "," + checkSum(bArr) + "," +
        checkSum(byArr));
    System.out.println("iArr2 fArr = " + checkSum(iArr2) + "," + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("Main.instanceCount Main.fFld = " + Main.instanceCount + "," + Float.floatToIntBits(Main.fFld));
}
}
