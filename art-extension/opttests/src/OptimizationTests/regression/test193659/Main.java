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

// Generated by Dalvik Fuzzer tool (3.3.001). Fri May  9 00:04:06 2014
package OptimizationTests.regression.test193659;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 300;

    public static long cxr=-2919217656353220789L;

public static void main(String[] b) {

    int s=1201, ab=-64991, htp=62180, ih8=-61982, d=37320, hw=14840, fu0=-56877, qmo[]=new int[N];
    short isk=3255, xy[]=new short[N];
    float m=15.304F;
    byte mf2=109, y=101;
    double ti2=-96.30;
    long zb=3606321032759476465L, knz=2012598502629464947L, qdy[]=new long[N];

    init(qmo, -46684);
    init(xy, (short)18018);
    init(qdy, -8798926221290021499L);

    for (s = 231; s > 6; s -= 2) {
        if (m > ((isk++) | s)) {
            zb += (long)(m - ((zb * s) - (-23800 ^ (long)(knz - m))));
        }
        for (ab = 165; ab > 10; ab -= 3) {
            for (htp = 5; htp < 153; htp++) {
                zb = (-(zb -= (ab + s)));
            }
            for (ih8 = 1; ih8 < 24; ih8++) {
                knz += (long)ti2;
                d += ab;
            }
            d *= -20093;
            d &= (--d);
            d = (int)(zb = (-(knz++)));
            qmo[s + 1] *= (--d);
            d = (d--);
            zb &= s;
            mf2 += (byte)(((d = (int)-1362592194849749421L) % ((knz - isk) | 1)) + ((d = (int)m) - (++zb)));
            for (hw = 9; hw < 162; ++hw) {
                qmo[ab + 1] = ab;
                cxr -= (long)(m - (d++));
                ti2 += hw;
                d >>= xy[s - 1];
                qmo[ab - 1] = (int)(((cxr + cxr) + (y - s)) + qmo[s]);
                cxr += 15067;
                qmo[hw] += (int)(((ti2 * m) * zb) * (qdy[s + 1] - (50.709 - knz)));
            }
        }
        fu0 <<= hw;
    }

    System.out.println("s zb m = " + s + "," + zb + "," + Float.floatToIntBits(m));
    System.out.println("knz isk ab = " + knz + "," + isk + "," + ab);
    System.out.println("htp ih8 ti2 = " + htp + "," + ih8 + "," + Double.doubleToLongBits(ti2));
    System.out.println("d mf2 hw = " + d + "," + mf2 + "," + hw);
    System.out.println("y fu0 qmo = " + y + "," + fu0 + "," + checkSum(qmo));
    System.out.println("xy qdy = " + checkSum(xy) + "," + checkSum(qdy));
    
    System.out.println("cxr = " + cxr);
}
}
