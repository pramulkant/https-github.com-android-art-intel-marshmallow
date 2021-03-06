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

// Generated by Dalvik Fuzzer tool (3.5.001). Sat Mar 21 17:19:48 2015
package OptimizationTests.regression.test1758;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


public static void main(String[] strArr) {

    float fArr[]=new float[N];
    long l=-1867305310L, lArr[][]=new long[N][N];
    double d=-117.1173;
    int i=0, i1=117, i2=207, i3=-16665, i4=11, i5=-45, iArr[]=new int[N];
    boolean b=true;

    init(iArr, -12);
    init(lArr, -105L);
    init(fArr, -108.959F);

    for (i = 4; i < 95; i += 3) {
        b = b;
        iArr[i + 1] -= (int)(i + d);
        l *= -142;
        i1 = (i1++);
        i1 <<= (i1++);
        i1 += i;
        l = (l++);
    }
    i2 = 80;
    while (--i2 > 0) {
        i1 &= (++i1);
        i1 |= (int)lArr[i2 - 1][(i2 >>> 1) % N];
        i1 = ((i1 + (i1 *= 3)) + i);
        i1 = i2;
        i1 = 21123;
        d = ((l++) * i3);
        i4 = 1;
        do {
            for (i5 = 1; i5 < 2; i5++) {
                i3 *= i1;
                if (b) break;
                i3 = i5;
                i1 <<= i1;
                i1 = (int)(l - (l + fArr[i4]));
                i3 += iArr[i2];
            }
        } while (++i4 < 55);
    }
    b = (b = b);
    i3 += (int)(((i3++) - (l - l)) + (i - (++i3)));

    System.out.println("i b d = " + i + "," + (b ? 1 : 0) + "," + Double.doubleToLongBits(d));
    System.out.println("l i1 i2 = " + l + "," + i1 + "," + i2);
    System.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
    System.out.println("iArr lArr fArr = " + checkSum(iArr) + "," + checkSum(lArr) + "," +
        Double.doubleToLongBits(checkSum(fArr)));

}
}
