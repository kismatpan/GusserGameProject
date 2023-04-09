//These is my First Project that i'm going to create..
import java.util.*;

//Let's Create Gusser...
class Gusser
{
	int GusserValue;
	int GusserValue()
	{   // Using Scanner for Getting value From Console(Input)
		Scanner scan= new Scanner(System.in);
		System.out.println("Hey,Gusser Please Guess the value");
		GusserValue=scan.nextInt();
		return GusserValue;
	}
}


//Now Create Players 
class Players
{
	int PlayerNum;
	int PlayerNum()
	{   // for getting value from Players  
		Scanner scan=new Scanner(System.in);
		System.out.println("Hii Players,Kindly Guess the value one by one(respectively okk na!)");
		PlayerNum=scan.nextInt();
		return PlayerNum;
	}
}

//Now It's Time For Umpire who will Decide Winner and Runner...!
    class UmpireResult
{
	int ValueFromGusser;
	int GussedValueFromPlayer1 , GussedValueFromPlayer2 ,GussedValueFromPlayer3;
	
	
	void CollectValueFromGusser()
	//For to store value from Gusser requred in Umpire work
	{
		Gusser G=new Gusser();
		ValueFromGusser=G.GusserValue();
		
	}
	 
	void CollectValueFromPlayers()
	//For getting value from Player required in Umpire work
	{
		
		//Created three  player for playing  the game 
    	Players p1= new Players();
    	Players p2= new Players();
    	Players p3= new Players();
    	
    	//Storing the value From pLAYERS 
    	GussedValueFromPlayer1 = p1.PlayerNum();
    	GussedValueFromPlayer2 = p2.PlayerNum();
    	GussedValueFromPlayer3 = p3.PlayerNum();
		
	}
	
	void CompareResult()
	{
		if(ValueFromGusser==GussedValueFromPlayer1)
		{
		   if(ValueFromGusser==GussedValueFromPlayer2 && ValueFromGusser==GussedValueFromPlayer3)
		   {
			   System.out.println("All Player Won the game");
		   }
		   else if (ValueFromGusser==GussedValueFromPlayer2)
		   {
			   System.out.println("Player 1 and Player2 Won the game ");
		   }
		   else if (ValueFromGusser==GussedValueFromPlayer3)
		   {
			   System.out.println("Player 1 and Player 3 Won  the game");
		   }
		   else
           {
			System.out.println("Player 1 won the game ");
		   }
		}
		else if(ValueFromGusser==GussedValueFromPlayer2)
		{ 
		   if (ValueFromGusser==GussedValueFromPlayer3)
		   {
			   System.out.println("Player 2 and Player 3 Won the game ");
		   }
		   else
		   {
			System.out.println("Player 2 Won the game");
		   }
		}
		else if(ValueFromGusser==GussedValueFromPlayer3)
		{
			System.out.println("Player 3 Won the game");
		}
		else
		{
			System.out.println("No one win the game !! game Lost ");
		}
		
	}
}   
    

public class GusserGameProjects {
public static void main(String[] args) {
		
		
		// Now for Testing purpose Compiling Nd Execute
		//Let's Play
		 UmpireResult U= new  UmpireResult();
		 U.CollectValueFromGusser();
		 U.CollectValueFromPlayers();
		 U.CompareResult();
	}
}
