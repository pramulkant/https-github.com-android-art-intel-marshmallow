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

// Generated by Android Runtime Fuzzer tool (4.1.002). Thu Feb 25 05:02:34 2016
// srand = 108599853629884105526467685442336469431

package OptimizationTests.regression.test3370;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=-10L;
    public static double dFld=0.30256;
    public static boolean bFld=false;

    public static long iMeth_check_sum = 0;

public static int iMeth() {

    int i2=-3, i3=154;

    for (i2 = 4; i2 < 94; i2++) {
        i3 >>= -45321;
    }
    long meth_res = i2 + i3;
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    int i=-1, i1=-123, i4=-59715, i5=145, i6=-45751, iArr[]=new int[N];
    byte by=123;
    long lArr[]=new long[N];
    double dArr[]=new double[N];
    float fArr[]=new float[N];

    init(iArr, 12);
    init(lArr, 11L);
    init(dArr, 127.51155);
    init(fArr, -37.297F);

    for (i = 3; i < 88; ++i) {
        i1 = (Integer.reverseBytes((int)(-4 + (Main.dFld--))) + (i + (-iMeth())));
        iArr[i] += (int)(i & ((i1 - i) - (++lArr[i + 1])));
        i1 >>= (++i1);
        by -= (byte)(i1 = ((i1 - i) * i));
        if (Main.bFld = Main.bFld) break;
        i1 -= (--iArr[(8 >>> 1) % N]);
    }
    i4 = 1;
    do {
        iArr[i4] = (int)(((i >> i4) - (Main.instanceCount + Main.dFld)) + (i1 -= (int)(49234L + (11778 -
            (Main.instanceCount - by)))));
        Main.bFld = ((-(Main.instanceCount * Main.dFld)) < Main.instanceCount);
        Main.instanceCount -= (((i1--) - (i1++)) + ((Main.instanceCount + i4) - (i4 * -28911)));
        by += (byte)i4;
        i5 = 1;
        do {
            i1 *= (int)(-Main.instanceCount);
            i1 *= (++i1);
            for (i6 = 1; i6 < 32; i6++) {
                long l=-5952238858297700124L;
                dArr[i5] *= lArr[i5];
                iArr[(i6 >>> 1) % N] >>>= (i6 - (i1 = (i - i)));
                i1 *= (i1--);
                i1 = (iArr[i5 - 1] - (-(++i1)));
                i1 -= (int)((-(i6 - l)) + ((i5 + Main.instanceCount) - (l + i6)));
                i1 = (-i6);
                fArr[i4 - 1] = (float)(((l + i4) / (iArr[i6] | 1)) + Main.dFld);
                iArr[i5 - 1] -= (--i1);
                i1 = i;
            }
        } while (++i5 < i4);
    } while (++i4 < 96);

    System.out.println("i i1 by = " + i + "," + i1 + "," + by);
    System.out.println("i4 i5 i6 = " + i4 + "," + i5 + "," + i6);
    System.out.println("iArr lArr dArr = " + checkSum(iArr) + "," + checkSum(lArr) + "," +
        Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("fArr = " + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("Main.instanceCount Main.dFld Main.bFld = " + Main.instanceCount + "," +
        Double.doubleToLongBits(Main.dFld) + "," + (Main.bFld ? 1 : 0));

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}