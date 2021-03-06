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

package OptimizationTests.LoadHoistStoreSink.TwiceTheSameMemoryCouple;

// negative so far, see CAR-2661

public class Main
{
    public static int field = 0;

    public int testLoop()
    {
        int iterations = 50;
        for (int i = 0; i < iterations; i++)
        {
            int a = field;
            field = a + i;
            int b = field;
            field = b + 2 * i;
        }

        return field;
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
