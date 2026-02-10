package com.myproject;

public class Cricket {
	static String board;
	
	String gameFormat;
	String player_Name;
	int jersy_No;
	int age;
	int heighest_score;
	
	public static void main(String[] args) {
		board = "BCCI";
		System.out.println("Cricket Team Name is : " + board);
		
		Cricket cap = new Cricket();
		
		cap.gameFormat = "ODI";
		cap.player_Name = "Rohit Sharma";
		cap.jersy_No = 45;
		cap.age = 38;
		cap.heighest_score = 264;
		
		
		System.out.println("Caption");
		System.out.println("Game Format : " +cap.gameFormat);
		System.out.println("Player Name : " +cap.player_Name);
		System.out.println("Jersy Number : " +cap.jersy_No);
		System.out.println("Player Age : " +cap.age);
		System.out.println("Player Highest Score : " +cap.heighest_score);
		
		Cricket vc = new Cricket();
		
		vc.gameFormat = "ODI";
		vc.player_Name = "Shreyas Iyer";
		vc.jersy_No = 96;
		vc.age = 30;
		vc.heighest_score = 128;
		
		System.out.println("Vice Caption");
		System.out.println("Game Format : " +vc.gameFormat);
		System.out.println("Player Name : " +vc.player_Name);
		System.out.println("Jersy Number : " +vc.jersy_No);
		System.out.println("Player Age : " +vc.age);
		System.out.println("Player Highest Score : " +vc.heighest_score);
		
		
		Cricket bat = new Cricket();
		
		bat.gameFormat = "ODI";
		bat.player_Name = "Kl Rahul";
		bat.jersy_No = 01;
		bat.age = 33;
		bat.heighest_score = 112;
		
		System.out.println("Batter");
		System.out.println("Game Format : " +bat.gameFormat);
		System.out.println("Player Name : " +bat.player_Name);
		System.out.println("Jersy Number : " +bat.jersy_No);
		System.out.println("Player Age : " +bat.age);
		System.out.println("Player Highest Score : " +bat.heighest_score);
		
		Cricket b = new Cricket();
		
		b.gameFormat = "ODI";
		b.player_Name = "Subhan Gill";
		b.jersy_No = 77;
		b.age = 26;
		b.heighest_score = 208;
		
		System.out.println("Batter");
		System.out.println("Game Format : " +b.gameFormat);
		System.out.println("Player Name : " +b.player_Name);
		System.out.println("Jersy Number : " +b.jersy_No);
		System.out.println("Player Age : " +b.age);
		System.out.println("Player Highest Score : " +b.heighest_score);
	}

}
