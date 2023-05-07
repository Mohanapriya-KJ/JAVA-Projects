package game2;
import java.util.Scanner;
import java.lang.Math;

public class RockPaperSiscssor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] item_list= {"Rock","Paper","Scissor"};
		Scanner sc=new Scanner(System.in);
		int your_score=0;
		int comp_score=0;
		
		while(true)
		{
			System.out.println("Enter your choice: \n [Rock,Paper,Scissor]");
			System.out.println("NOTE:THE FIRST LETTER SHOULD BE CAPITAL AND THE REST ARE SMALL LETTERS ");
			String your_ch=sc.next();
			int random_index=(int)(Math.random()*item_list.length);
			String comp_ch=item_list[random_index];
			System.out.println(""+your_ch+","+comp_ch);
			if(your_ch.equals(comp_ch))
			{
				System.out.println("Match is a Tie!!!!!");
				your_score++;
				comp_score++;
			}
			else if(your_ch.equals("Rock"))
			{
				if(comp_ch.equals("Paper")) {
					System.out.println("Paper covers the rock!!!\nThe computer win");
					comp_score++;
				}
				else {
					System.out.println("Rock smashes scissor!!!\nYou Win");
					your_score++;
				}
			}
			else if(your_ch.equals("Paper"))
			{
				if(comp_ch.equals("Scissor")) {
					System.out.println("Scissor cuts the paper!!!\nThe computer win");
					comp_score++;
				}
				else {
					System.out.println("Paper covers the Rock!!!\nYou Win");
					your_score++;
				}
			}
			else if(your_ch.equals("Scissor"))
			{
				if(comp_ch.equals("Rock")) {
					System.out.println("Rock smashes the Scissor!!!\nThe computer win");
					comp_score++;
				}
				else {
					System.out.println("Scissor cuts the paper!!!\nYou Win");
					your_score++;
				}
			}
			System.out.println("Do you want to play AGAIN?????????\nEnter\n(0)NO\t(1)YES");
			Scanner i=new Scanner(System.in);
			int n=i.nextInt();
			if(n==0)
			{
				System.out.println("thankyou for playing!\nYour score is "+your_score+"\nComputer score is "+comp_score);
				break;
			}
				
		}
		System.out.println();
		if(your_score>=comp_score)
			System.out.println("HURRAY!!!! YOU WON......\nCONGRAGULATIONS");
		else
			System.out.println("THE COMPUTER WON!!!!!\nBETTER LUCK NEXT TIME");

	}

}
