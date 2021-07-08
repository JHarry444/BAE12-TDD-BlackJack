package com.qa;

public class BlackJack {

	private static int bust = 21;

	// refactor -> alt + shift + r
	public int play(int player1, int player2) {
		if (player1 > bust && player2 > bust) {
			return 0;
		} else if (player1 > bust) {
			return player2;
		} else if (player2 > bust) {
			return player1;
		} else {
			return Math.max(player1, player2);
		}
	}

}
