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

// Test generated by Dalvik Fuzzer on Sun Jun  9 14:12:55 2013
package OptimizationTests.regression.test115069;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

	public static final int N = 100;

	public static void main(String[] args) {
		int x1u = -9637, u = -10046, q6p = 36236, zo = -17432, pu[][] = new int[N][N];
		long a[] = new long[N];

		init(a, 8992618581085543136L);
		init(pu, 1285);

		for (long j0 : a) {
			for (u = 61; u > 1; --u) {
				x1u -= (int) (pu[u][u]);
				int o = 11;
				do {
					q6p += (int) (++zo);
				} while (--o > 0);
			}
		}

		if (q6p == 1027557236 && zo == 48568) {
			System.out.println("TEST PASSED");
		} else {
			System.out.println("TEST FAILED: q6p = " + q6p + " (expected 1027557236), zo = " + zo  + " (expected 48568)");
		}
	}
}