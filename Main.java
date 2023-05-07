package example;




import java.util.Scanner;

class Tictacto
{
	void draw_Board(char[][] board)
	{
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}
	}
	int check_win(char[][] board,int win1,int win2,String player1,String player2)
	{
		
		for(int i=1;i<4;i++)	
		{
			
				if(board[i][1]==board[i][2]&&board[i][2]==board[i][3]) {
					if(board[i][1]=='X')
						win1++;
					else
						win2++;
			}
		
				if(board[1][i]==board[2][i]&&board[2][i]==board[3][i]) {
					if(board[1][i]=='X')
						win1++;
					else
						win2++;
				}
	
			
				
		
	}

		if(board[1][1]==board[2][2]&&board[2][2]==board[3][3]) {
			if(board[1][1]=='X')
				win1++;
			else
				win2++;
		}
			
	

		if(board[3][1]==board[2][2]&&board[2][2]==board[1][3]) {
			if(board[3][1]=='X')
				win1++;
			else
				win2++;
		}
		
		System.out.println("The score of "+player1+" is "+win1);
		System.out.println("The score of "+player2+" is "+win2);
		if(win1==win2)
			return 0;
		else if(win1>win2)
			return 1;
		else
			return -1;
}
}
public class Main
{

	public static int row,col,win1=0,win2=0,count=0;
	public static void main(String[] args) {
		char[][] board=new char[4][4];
		char symbol;
				
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				board[i][j]='-';
			}
		}
		System.out.println("WELCOME TO TIC TAC TO GAME");
		System.out.println("Enter the size of the board you want to play");
		Scanner s = new Scanner(System.in);
		System.out.println("Hey player 1,"+"\n"+"What's your name??");
		String player1=s.next();
		System.out.println("Hey player 2,"+"\n"+"What's your name??");
		String player2=s.next();

		Tictacto obj=new Tictacto();
		obj.draw_Board(board);
		int flag=1;
		int ch = 1;
		int count=0;

		do
		{
			if(count==9) {
				System.out.println("The game has ended");
				break;
			}
			if(flag==1)
			{
				System.out.println("This is "+player1+"'s turn (X)");
				flag=0;
				symbol='X';
				count++;
			}
			else{
				System.out.println("This is "+player2+"'s turn (O)");
				flag=1;
				symbol='O';
				count++;
			}
			
			
			System.out.println("Enter the postion to place the character");
		
			 row=s.nextInt();
			 col=s.nextInt();
			
			while(row>3 || row<1 ||col<1 ||col>3)
			{
				System.out.println("Enter the correct value for the row and coloumn value to place the character!!");
				System.out.println("Hint!!!\n values for row and coloumn ranges from 1 to 3");
				row=s.nextInt();
				 col=s.nextInt();
				
			}
			 while(board[row][col]=='X' || board[row][col]=='O')
				{
					System.out.println("The position is already occupied !!!"+"\n" +" Enter the row and coloumn value");
					 row=s.nextInt();
					 col=s.nextInt();
				}
			
			
			board[row][col]=symbol;
			obj.draw_Board(board);
			
			
		}while(ch==1);
		
		int res=obj.check_win(board, win1,win2,player1,player2);
		if(res==0)
			System.out.println("OOPS!!!!!!"+"\n"+"The game is a Tie");
		else if(res==1)
			System.out.println("Hurray!!!!"+"\n"+"*********Congragulations*********"+"\n"+player1+" YOU WON");
		else
			System.out.println("Hurray!!!!"+"\n"+"*********Congragulations*********"+"\n"+player2+" YOU WON");
	
	}
}

