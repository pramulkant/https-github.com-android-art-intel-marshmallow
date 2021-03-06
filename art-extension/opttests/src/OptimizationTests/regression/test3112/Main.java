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

// Generated by Android Runtime Fuzzer tool (4.1.002). Mon Jan 18 14:01:28 2016
// srand = 188229553824754520526159846186025980631

package OptimizationTests.regression.test3112;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=1773L;
    public static int iFld=6;
    public static float fFld=-57.162F;
    public static long lArrFld[][]=new long[N][N];
    public static double dArrFld[]=new double[N];
    public static byte byArrFld[]=new byte[N];

    static {
        init(Main.lArrFld, 20L);
        init(Main.dArrFld, 11.67904);
        init(Main.byArrFld, (byte)-124);
    }

public static void main(String[] strArr) {

    int i=-195, i1=-199, i2=-64, iArr[]=new int[N];
    double d=-27.106093;

    init(iArr, 43554);

    for (i = 2; i < 95; ++i) {
        Main.instanceCount += (i * i);
        try {
            Main.iFld = (i / i);
            Main.iFld = (-182 % Main.iFld);
            Main.iFld = (Main.iFld / Main.iFld);
        } catch (ArithmeticException a_e) {}
        Main.fFld *= Main.iFld;
        Main.iFld += (int)(Main.instanceCount--);
        Main.instanceCount = (long)(((Main.instanceCount * i) / ((long)(Main.fFld) | 1)) * ((65107 - (Main.iFld -
            Main.iFld)) - (--Main.lArrFld[i - 1][i + 1])));
        Main.instanceCount *= (long)(++Main.fFld);
        Main.instanceCount = (Main.instanceCount - (++Main.iFld));
    }
    i1 = 77;
    do {
        Main.iFld = (int)Main.lArrFld[i1][i1 - 1];
        Main.instanceCount = (++iArr[i1]);
        Main.lArrFld[i1 - 1][i1] <<= ((long)(Main.instanceCount + (Main.dArrFld[i1 + 1]++)) << (long)(d *
            (Main.iFld++)));
        iArr[i1 + 1] -= (int)Main.lArrFld[i1 + 1][i1 + 1];
        i2 = 1;
        do {
            Main.lArrFld[i2 - 1][i1] -= (long)Main.fFld;
            Main.dArrFld[i2] = (Main.lArrFld[i1 + 1][i2 - 1] - Main.byArrFld[i1 + 1]);
            iArr[i2] += (int)5L;
        } while (++i2 < i1);
        Main.iFld += (((i1 * Main.fFld) + i) - Main.fFld);
    } while (--i1 > 0);

    System.out.println("i i1 d = " + i + "," + i1 + "," + Double.doubleToLongBits(d));
    System.out.println("i2 iArr = " + i2 + "," + checkSum(iArr));

    System.out.println("Main.instanceCount Main.iFld Main.fFld = " + Main.instanceCount + "," + Main.iFld + "," +
        Float.floatToIntBits(Main.fFld));
    System.out.println("Main.lArrFld Main.dArrFld Main.byArrFld = " + checkSum(Main.lArrFld) + "," +
        Double.doubleToLongBits(checkSum(Main.dArrFld)) + "," + checkSum(Main.byArrFld));
}
}
