package com.koreait.kjs.level3;

import com.koreait.kjs.Scan;

public class Checker {
	// s:0/ b:0 / o:0
	// 성공하면 flase, 성공 전이면 true

	public static boolean check(int gameCnt, Baseball b, MyBall mb) {

		int S = 0;
		int B = 0;
		

		while (true) {

			for (int i = 0; i < gameCnt; i++) {
				for (int z = 0; z < gameCnt; z++) {
					if (b.get(i) == mb.get(z)) {
						if (i == z) {
							S++;
						} else {
							B++;
						}

					}

				}
				if (S == gameCnt) {
					break;
				}

			}
			
			System.out.printf("S:%d / B:%d / O:%d\n", S, B, (gameCnt - S - B));

		}

	}
}
