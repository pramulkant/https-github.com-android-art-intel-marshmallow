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

// Generated by Dalvik Fuzzer tool (3.4.001). Mon Sep 29 16:11:03 2014

package OptimizationTests.regression.test3602;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


public static void main(String[] a0) {

    boolean rc=true;
    byte dz=-64, yc[]=new byte[N];
    short s=-11134;
    long nta=1622930612794114061L;
    int i5=-54986, y=47051, o=-22504, kn=-27154, wt[]=new int[N];
    float w=99.9F, b3[]=new float[N];
    double h=-34.896;

    init(wt, 41518);
    init(b3, 86.482F);
    init(yc, (byte)-92);

    i5 = 1;
    while (++i5 < 76) {
        y += (int)(nta + ((y + -77.976) + (nta + -61440)));
        for (o = 1; o < 31; ++o) {
            y = wt[o + 1];
            y += (--wt[i5 + 1]);
            y = (int)(((y + nta) - y) - -7552);
            nta = (((nta + nta) + (nta = 35483)) * i5);
            y *= (int)((--nta) + ((42862 + i5) + h));
            y = (int)w;
            w += nta;
            wt[i5 - 1] *= y;
            rc = rc;
        }
        y -= (~wt[i5 + 1]);
        y = (int)(~((dz & i5) + (nta + s)));
        y >>>= (--y);
        y += -45;
        b3[i5 + 1] += (y--);
        y <<= (7021 + i5);
        wt[i5] = (int)(--nta);
        if (false) break;
    }
    for (kn = 5; kn < 94; ++kn) {
        y = ((++s) - 32021);
        y += (int)((yc[kn + 1] = (byte)(nta * kn)) + (kn + (y + -62446)));
        s &= (short)(-w);
        y = i5;
    }

    System.out.println("i5 y nta = " + i5 + "," + y + "," + nta);
    System.out.println("o h w = " + o + "," + Double.doubleToLongBits(h) + "," + Float.floatToIntBits(w));
    System.out.println("rc dz s = " + (rc ? 1 : 0) + "," + dz + "," + s);
    System.out.println("kn wt b3 = " + kn + "," + checkSum(wt) + "," + Double.doubleToLongBits(checkSum(b3)));
    System.out.println("yc = " + checkSum(yc));

}
}