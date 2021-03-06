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

package OptimizationTests.LoadHoistStoreSink.ChangedStaticPointer;

public class Main
{
    public static class A
    {
        public static int value;
    }

    public static class A_1 extends A
    {
        public static int value;
    }

    public int testLoop()
    {
        A x;
        x = new A();
        A_1 y;
        y = new A_1();

        int a0 = 0x7;

        for (int i = 0; i < 10; i++)
        {
            a0 ++;
            if (i % 2 == 0)
            {
                x = y;
            }
            x.value = a0;
        }

        return x.value + y.value;
    }

    public void test()
    {
        System.out.println(testLoop());
    }

    public static void main(String[] args)
    {
        new Main().test();        
    }    
}
