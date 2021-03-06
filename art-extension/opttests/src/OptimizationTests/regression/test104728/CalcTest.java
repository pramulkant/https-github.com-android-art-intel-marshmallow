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

package OptimizationTests.regression.test104728;

public class CalcTest {
	int depth = 10;
	long sample;
	public static void main(String[] args) {
		new CalcTest().test();
	}

	public void test() {
		sample = 1L;
		for (int i = 0; i < depth;) {
			sample *= ++i;
		}
		if (sample != 3628800) {
			System.out.println("TEST FAILED: sample = " + sample);
		}
		sample = 1L;
		for (int i = 0; i < depth;) {
			sample *= ++i;
		}
		if (sample != 3628800) {
			System.out.println("TEST FAILED: sample = " + sample);
		}
		sample = 1L;
		for (int i = 0; i < depth;) {
			sample *= ++i;
		}
		if (sample != 3628800) {
			System.out.println("TEST FAILED: sample = " + sample);
		}
		sample = 1L;
		for (int i = 0; i < depth;) {
			sample *= ++i;
		}
		if (sample != 3628800) {
			System.out.println("TEST FAILED: sample = " + sample);
		}
		sample = 1L;
		for (int i = 0; i < depth;) {
			sample *= ++i;
		}
		if (sample != 3628800) {
			System.out.println("TEST FAILED: sample = " + sample);
		} else {
			System.out.println("TEST PASSED");
		}
	}
}
