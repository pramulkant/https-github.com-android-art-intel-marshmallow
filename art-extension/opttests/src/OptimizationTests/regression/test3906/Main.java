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

// Generated by Android Runtime Fuzzer tool (4.1.002). Tue Apr 19 07:10:57 2016
// srand = 8664580244215440654396659822469839046259429540708879897218976612583

package OptimizationTests.regression.test3906;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=71L;
    public static int iFld2=-223;
    public static byte byFld=0;
    public static int iArrFld2[]=new int[N];
    public static volatile Cls OFld=new Cls();

    static {
        init(Main.iArrFld2, 17817);
    }

    public static long lMeth_check_sum = 0;

public static long lMeth(byte by, short s) {

    Cls O1=new Cls();
    int i2=141, i3=-57857, i6=13;

    init(O1.lArrFld, -1563682679L);

    i2 = 96;
    while (--i2 > 0) {
        int i4=-33922;
        for (i3 = 1; i3 < 15; i3++) {
            Main.iArrFld2[i3] = (O1.iFld++);
            Cls.iFld1 = 10312;
        }
        i4 = O1.iFld;
    }
    for (int i5 : Main.iArrFld2) {
        O1 = O1;
        Main.iArrFld2 = (Main.iArrFld2 = (Main.iArrFld2 = (Main.iArrFld2 = Main.iArrFld2)));
        for (i6 = 3; i6 < 83; i6++) {
            Main.iArrFld2[i6 - 1] *= (int)Math.abs(O1.lArrFld[i6 + 1]);
            Cls.iFld1 >>= (int)(O1.lArrFld[i6 + 1] + i3);
            Cls.iFld1 += (i6 + ((O1.iFld--) >>> (Main.iFld2 + i3)));
        }
    }
    long meth_res = by + s + i2 + i3 + O1.iFld + i6 + checkSum(O1.lArrFld) + checkSum(O1);
    lMeth_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] strArr) {

    Cls O=new Cls();
    float fArr[]=new float[N];
    Cls2 O3=new Cls2();
    int i=-158, i1=9, i7=32719, i14=-250;

    init(O.iArrFld1, 61815);
    init(fArr, 1.796F);
    init(O3.OArrFld, new Cls4());

    i = 1;
    do {
        short s1=-22757;
        O.fFld = i;
        try {
            Cls.iArrFld[i] = (i % i);
            i1 = (i % i1);
            i1 = (i1 % O.iArrFld1[i + 1]);
        } catch (ArithmeticException a_e) {}
        try {
            O.iArrFld1[(int)(lMeth(Main.byFld, s1) - (Main.instanceCount -= (long)O.fFld))] =
                (int)(((Main.instanceCount - 2.931F) - (s1 - Main.iFld2)) - (i1--));
            Cls.iArrFld3[i - 1][i] ^= (int)((Cls.instanceCount++) * -17301);
            i7 = 1;
            do {
                byte by1=63;
                O = (O = (O = (Main.OFld = Main.OFld)));
                by1 = (byte)Main.OFld.fFld;
                i1 <<= Cls.iFld1;
                Cls1.lArrFld1[i + 1] = (Cls.instanceCount++);
            } while (++i7 < 84);
            Main.OFld.iFld = Main.OFld.iFld;
            Main.OFld.iFld = Main.OFld.iFld;
            Main.byFld >>= (byte)(i1++);
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            fArr = (fArr = (fArr = (fArr = fArr)));
        }
        Cls.iFld1 += (((i * Cls.instanceCount) + Main.iFld2) - i1);
        O3.OArrFld[i + 1] = (Main.OFld = Main.OFld);
        i1 -= (-225 * ((Main.iFld2 + i) - (++Cls.sFld)));
        Main.OFld.fFld = (i % -1);
        Cls4.instanceCount = (((-(-(Main.iFld2 - i1))) - Cls4.instanceCount) + (-(8 + O.iArrFld1[(-3 >>> 1) % N])));
        for (i14 = i; i14 < 61; ++i14) {
            float f=-65.860F;
            O3.OArrFld[i14 + 1] = (Cls1.OFld1 = Cls1.OFld1);
            Main.iFld2 = Cls.iFld1;
            Main.OFld.iFld = (int)(-f);
            Cls1.instanceCount += (((i14 * i1) + Cls2.instanceCount) - Main.instanceCount);
        }
    } while (++i < 84);

    System.out.println("i O.fFld i1 = " + i + "," + Float.floatToIntBits(O.fFld) + "," + i1);
    System.out.println("i7 Main.OFld.fFld Main.OFld.iFld = " + i7 + "," + Float.floatToIntBits(Main.OFld.fFld) + "," +
        Main.OFld.iFld);
    System.out.println("i14 O.iArrFld1 fArr = " + i14 + "," + checkSum(O.iArrFld1) + "," +
        Double.doubleToLongBits(checkSum(fArr)));
    System.out.println("O3.OArrFld O O3 = " + checkSum(O3.OArrFld) + "," + checkSum(O) + "," + checkSum(O3));
    System.out.println("Cls Cls1 Cls2 = " + Cls.instanceCount + "," + Cls1.instanceCount + "," + Cls2.instanceCount);
    System.out.println("Cls3 Cls4 Cls5 = " + Cls3.instanceCount + "," + Cls4.instanceCount + "," + Cls5.instanceCount);

    System.out.println("Main.instanceCount Main.iFld2 Main.byFld = " + Main.instanceCount + "," + Main.iFld2 + "," +
        Main.byFld);
    System.out.println("Main.iArrFld2 Main.OFld Cls = " + checkSum(Main.iArrFld2) + "," + checkSum(Main.OFld) + "," +
        Cls.instanceCount);
    System.out.println("Cls1 Cls2 Cls3 = " + Cls1.instanceCount + "," + Cls2.instanceCount + "," + Cls3.instanceCount);
    System.out.println("Cls4 Cls5 = " + Cls4.instanceCount + "," + Cls5.instanceCount);

    System.out.println("lMeth_check_sum: " + lMeth_check_sum);
}
}

class Cls extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=-218L;
    public float fFld=2.259F;
    public volatile int iFld=64541;
    public static int iFld1=-29918;
    public static short sFld=-1879;
    public static int iArrFld[]=new int[N];
    public volatile int iArrFld1[]=new int[805137];
    public long lArrFld[]=new long[720149];
    public static int iArrFld3[][]=new int[N][N];

    static {
        init(Cls.iArrFld, 2);
        init(Cls.iArrFld3, -96);
    }

}

class Cls1 extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=6L;
    public static long lArrFld1[]=new long[124714];
    public static int iArrFld4[]=new int[717333];
    public static Cls3 OFld1=null;

    static {
        init(Cls1.lArrFld1, 208L);
        init(Cls1.iArrFld4, -49);
    }

}

class Cls2 extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=30360L;
    public byte byFld1=-94;
    public Object OArrFld[]=new Object[N];

    public static long Cls2_check_sum = 0;

public  Cls2() {

    instanceCount++;
    int i8=-904, i10=1, i13=-7, iArr[]=new int[350474];

    init(iArr, 16228);

    i8 = 1;
    do {
        int i9=11;
        i9 += i9;
        Cls.iFld1 = (int)(((Cls1.iArrFld4[i8 - 1] = -179) * (-i8)) * Math.abs(240 + (i8 << -40679L)));
        byFld1 <<= (byte)i8;
        i9 = (--iArr[i8 + 1]);
        for (i10 = 3; i10 < 79; i10++) {
            Cls.sFld += (short)i10;
            Cls1.OFld1 = (Cls1.OFld1 = (Cls1.OFld1 = (Cls1.OFld1 = Cls1.OFld1)));
            for (i13 = i10; i13 < 7; ++i13) {
                i9 -= Cls.iFld1;
                Cls1.OFld1 = (Cls1.OFld1 = (Cls1.OFld1 = (Cls1.OFld1 = Cls1.OFld1)));
                i9 -= (int)(((++Cls2.instanceCount) * (i8 + i10)) / (iArr[i13 + 1] | 1));
            }
        }
    } while (++i8 < 85);
    long meth_res = i8 + i10 + i13 + checkSum(iArr);
    Cls2_check_sum += meth_res;
    return;
}

}

class Cls3 extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=64111L;
    public float fFld1=121.921F;
    public volatile double dFld=0.27203;
    public static long lArrFld2[]=new long[N];
    public int iArrFld6[]=new int[271125];
    public volatile float fArrFld[]=new float[N];

    static {
        init(Cls3.lArrFld2, 1L);
    }

    public static long Cls3_check_sum = 0;

public  Cls3() {

    instanceCount++;
    byte by2=-78;
    int i11=-60, i12=-56103;

    for (i11 = 3; i11 < 79; ++i11) {
        Cls4 O2=new Cls4();
        O2 = O2;
        Cls.iFld1 += (int)(((Cls4.instanceCount + i11) * (Cls.instanceCount * Cls4.instanceCount)) + (++by2));
    }
    i12 = 76;
    do {
        Cls3.lArrFld2 = (Cls3.lArrFld2 = (Cls3.lArrFld2 = Cls3.lArrFld2));
        Cls.iFld1 += (((i12 * Cls.iFld1) + fFld1) - fFld1);
        Cls4.iArrFld5 = (iArrFld6 = int1array(N, (int)-14952));
        Cls.iFld1 += (i12 * i12);
        Cls.iFld1 += (int)((fArrFld[i12 + 1] - (-174 / ((~(long)(15 * dFld)) | 1))) - Cls.iFld1);
        dFld = i11;
    } while (--i12 > 0);
    dFld += (--Cls1.instanceCount);
    Cls.iFld1 = ((Cls.iFld1++) - ((-i11) * (Cls.iFld1 * Cls.iFld1)));
    long meth_res = i11 + by2 + i12;
    Cls3_check_sum += meth_res;
    return;
}

}

class Cls4 extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=-635682053L;
    public static int iArrFld5[]=new int[N];

    static {
        init(Cls4.iArrFld5, 3084);
    }

}

class Cls5 extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=118L;

}

//DEBUG  Cls5 ->  Cls5 Cls2 main Test
//DEBUG  Cls2 ->  Cls2 main Test
//DEBUG  Cls1 ->  Cls1 main Test Cls2
//DEBUG  lMeth ->  lMeth main Test
//DEBUG  Cls4 ->  Cls4 Cls3 Cls2 main Test Cls1
//DEBUG  Test ->  Test
//DEBUG  Cls3 ->  Cls3 Cls2 main Test Cls1
//DEBUG  main ->  main Test
//DEBUG  Cls ->  Cls main Test lMeth Cls2
//DEBUG  Depth = 5
//DEBUG  Classes = 7
//DEBUG  static objects = {Cls: [, Main.OFld], Cls3: [, Cls1.OFld1], }
