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

// Generated by Dalvik Fuzzer tool (3.4.001). Tue Dec  9 10:41:24 2014
package OptimizationTests.regression.test1015;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


public static void main(String[] f0) {

    long efz=6080224126771300598L, bg=5226107428135457731L, ge[]=new long[N];
    double u7=-110.799, qz[]=new double[N];
    int n=-41498, f=63858, drc=-7160, dc5=-45655, o1l=9602, z9b[]=new int[N];
    byte e[]=new byte[N];
    float w9f=10.128F;

    init(z9b, -48971);
    init(ge, 4427827566504365353L);
    init(e, (byte)-61);
    init(qz, 98.549);

    n = 1;
    while (++n < 94) {
        f += (z9b[n]--);
        f %= 11850;
        efz >>= z9b[(-19011 >>> 1) % N];
        ge[n] *= n;
        for (drc = 1; drc < 96; ++drc) {
            z9b[n] = (f++);
            w9f *= ((-52361 + (60954 * (drc - dc5))) + (f--));
        }
        efz = (ge[n] + (-(--dc5)));
        efz += (dc5--);
        z9b[n + 1] = (int)((n + (-5806517068106488539L - (43549 - (dc5 >>= n)))) * (z9b[n]++));
        for (byte t5a : e) {
            dc5 = (int)w9f;
            dc5 <<= (int)(dc5 += (int)((drc + drc) - (w9f - u7)));
            z9b[n - 1] <<= (int)((++u7) - (z9b[n + 1] %= ((-(f++)) | 1)));
            qz[n] += efz;
            bg += (((n * drc) + bg) - efz);
            efz = bg;
            bg = n;
            w9f += ((++efz) - (efz <<= (f + 35190)));
            for (o1l = 1; o1l < 20; o1l += 3) {
                efz <<= (t5a - ((3992311143091186284L + (dc5 + f)) + f));
                dc5 = (int)-4932837287451576556L;
                w9f += (((o1l * o1l) + drc) - dc5);
                f = (--z9b[n]);
            }
        }
    }

    System.out.println("n f efz = " + n + "," + f + "," + efz);
    System.out.println("drc w9f dc5 = " + drc + "," + Float.floatToIntBits(w9f) + "," + dc5);
    System.out.println("u7 bg o1l = " + Double.doubleToLongBits(u7) + "," + bg + "," + o1l);
    System.out.println("z9b ge e = " + checkSum(z9b) + "," + checkSum(ge) + "," + checkSum(e));
    System.out.println("qz = " + Double.doubleToLongBits(checkSum(qz)));

}
}