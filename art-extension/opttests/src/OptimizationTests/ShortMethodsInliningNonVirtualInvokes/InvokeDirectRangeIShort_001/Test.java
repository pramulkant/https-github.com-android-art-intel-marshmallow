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

package OptimizationTests.ShortMethodsInliningNonVirtualInvokes.InvokeDirectRangeIShort_001;
class Test {
    short thingies = -32768;

    private short getThingies(short s1, short s2, short s3, short s4, short s5, short s6) {
        return thingies;
    }

    private void setThingies(short newThingies, short s1, short s2, short s3, short s4, short s5, short s6) {
        thingies = newThingies;
    }

    public short gimme(short s1, short s2, short s3, short s4, short s5, short s6) {
       return (short)(getThingies(s1, s2, s3, s4, s5, s6) + 1);
    }

    public void hereyouare(short newThingies, short s1, short s2, short s3, short s4, short s5, short s6) {
        setThingies((short)(newThingies - 1), s1, s2, s3, s4, s5, s6);
    }
}

