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

// Generated by Dalvik Fuzzer tool (3.4.001). Mon Dec  8 23:09:23 2014
package OptimizationTests.regression.test1007;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static float zh=72.547F;
    public static int qp=-15208;

    public static long zvp_check_sum = 0;

public static int zvp(double u2) {

    long m=4497603867895450310L;
    byte e=-96;
    float z[]=new float[N];
    double oe[]=new double[N];
    int py=-7730, f=36066, g[]=new int[N];

    init(g, 13860);
    init(z, -71.964F);
    init(oe, 114.62);

    for (py = 1; py < 90; ++py) {
        qp += (int)(((-(-66.405 - (e - -4681738414738797610L))) - g[py - 1]) + ((qp - qp) + (qp--)));
        for (f = 4; f < 90; f++) {
            qp >>>= (int)(-40027 ^ (long)((++zh) * (m + u2)));
            try {
                qp = (f % qp);
                qp = (g[py - 1] % g[(60082 >>> 1) % N]);
                qp = (py % -132);
            } catch (ArithmeticException a_e) {}
            qp >>>= g[(qp >>> 1) % N];
            qp += (((f * qp) + f) - m);
            g[py] = (int)(((-35459 - f) + (f % (py | 1))) - ((--qp) - (z[f]--)));
            oe[py + 1] *= m;
            m *= py;
        }
        qp = py;
        qp *= (qp--);
    }
    long meth_res = Double.doubleToLongBits(u2) + py + e + f + m + checkSum(g) + Double.doubleToLongBits(checkSum(z)) +
        Double.doubleToLongBits(checkSum(oe));
    zvp_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] b) {

    short o2z=-31206, fu[]=new short[N];
    boolean i=true;
    byte h=28;
    long j90=-5724754097141519335L;
    float nm[]=new float[N];
    double zie=-35.917, p[]=new double[N];
    int v=-2031, q=-37769, n9w=53455, o=50622, lt=-54304, ly=34499, y71=32550, y=-9033, qm[]=new int[N];

    init(qm, 46499);
    init(p, 91.620);
    init(nm, -126.204F);
    init(fu, (short)-30021);

    for (v = 90; v > 3; v -= 3) {
        j90 -= (long)((q++) - (-(-119.520F * (-2207392989532729587L << q))));
        zh = v;
        for (n9w = 2; n9w < 34; n9w++) {
            if (i) continue;
            q /= (int)((j90--) | 1);
            zh -= (qm[n9w + 1] + (j90 * (n9w - -28490)));
        }
        for (o = 1; o < 67; ++o) {
            q = (int)((j90 * zh) + (o2z + (zie - h)));
        }
        q |= (int)(o + (q = (int)(++p[v])));
        qm[v] += (n9w - o);
        q += ((long)v | (long)zh);
    }
    for (lt = 4; lt < 84; ++lt) {
        q -= (-(q--));
        zh += (float)((ly + (zie--)) * ((long)(zie + o) ^ qm[lt - 1]));
        qm[lt + 1] -= (int)(((--o2z) + (j90 * -37663)) + lt);
        zh -= (nm[lt] = zvp(zie));
        q -= (int)(qm[lt] + ((qm[lt - 1]++) * (lt + zie)));
        j90 = (q++);
        zie *= (((j90 | 47738) - (ly + -1143902941065227000L)) * v);
    }
    for (y71 = 3; y71 < 76; y71++) {
        qp += (int)(j90 - (fu[y71 - 1]--));
        y = 1;
        while ((y += 2) < y71) {
            j90 <<= 23799;
            qp <<= (int)(y71 + ((--zh) + (v * h)));
        }
    }

    System.out.println("v j90 q = " + v + "," + j90 + "," + q);
    System.out.println("n9w i o = " + n9w + "," + (i ? 1 : 0) + "," + o);
    System.out.println("o2z zie h = " + o2z + "," + Double.doubleToLongBits(zie) + "," + h);
    System.out.println("lt ly y71 = " + lt + "," + ly + "," + y71);
    System.out.println("y qm p = " + y + "," + checkSum(qm) + "," + Double.doubleToLongBits(checkSum(p)));
    System.out.println("nm fu = " + Double.doubleToLongBits(checkSum(nm)) + "," + checkSum(fu));

    System.out.println("zh qp = " + Float.floatToIntBits(zh) + "," + qp);

    System.out.println("zvp_check_sum: " + zvp_check_sum);
}
}