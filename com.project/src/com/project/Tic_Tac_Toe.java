package com.project;

import java.util.Scanner;

public class Tic_Tac_Toe {

	private static char[][] board = new char[3][3];
	private static char currentPlayer = 'x';

	private static void getBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static void getDisplay() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	private static int markPosOnBoard(int pos, char currentPlayer) {
		int n = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (n == pos) {
					if (board[i][j] == 'x' || board[i][j] == 'o') {
						return -1;
					}
					board[i][j] = currentPlayer;
					if (getRow(currentPlayer) || getCol(currentPlayer) || getDig(currentPlayer)) {
						return 1;
					} else {
						return 0;
					}
				}

				n++;
			}
		}

		return -1;
	}

	private static boolean getRow(char currentPlayer) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean getCol(char currentPlayer) {
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
				return true;
			}
		}
		return false;
	}

	private static boolean getDig(char currentPlayer) {
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer
				|| board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
			return true;

		} else {
			return false;
		}
	}

	private static void switchPlayer() {
		currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("======= welcome to the TIC-TAC-TOE ======");
		String cont;
		do {

			getBoard();
			getDisplay();
			System.out.println();
			System.out.println("---------Start the game-----------");
			int chance = 0;
			while (chance <= 9) {
				System.out.println("Player " + currentPlayer + " Move");
				System.out.println("Enter the position number(1-9) : ");
				int pos = sc.nextInt();
				int mark = markPosOnBoard(pos, currentPlayer);
				if (mark == 1) {
					System.out.println(currentPlayer + "Win the Game  ");
					break;
				} else if (mark == -1) {
					System.out.println(currentPlayer + "Position is Marker Enter any");
					continue;
				}
				getDisplay();
				switchPlayer();
				chance++;
			}
			if (chance > 9) {
				System.out.println("Game is Draw");
			}
			System.out.println("\nDo you want to play again? (yes/no):");
			cont = sc.next();
		} while (cont.equalsIgnoreCase("yes"));

	}

}
