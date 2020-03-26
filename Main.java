import java.util.*;

class Main 
{
  public static void main(String[] args)
   {
    ArrayList<UnoCard> players = new ArrayList<UnoCard>();
    ArrayList<UnoCard> computer = new ArrayList<UnoCard>();

    for(int p=0; p<8; p++)
    {
      int num1 = (int)(Math.random()*9)+1;
      int clr = (int)(Math.random()*4);
      
      String color1="";
      if(clr == 0)
      {
        color1="B";
      }
      if(clr == 1)
      {
         color1="Y";
      }
      if(clr == 2)
      {
        color1="G";
      }
      if(clr == 3)
      {
        color1="R";
      }
       UnoCard card=new UnoCard(num1, color1);
       players.add(card);
    }

    for(int p=0; p<7; p++)
    {
      int num1 = (int)(Math.random()*9)+1;
      int clr = (int)(Math.random()*4);
      
      String color1="";
      if(clr == 0)
      {
        color1="B";
      }
      if(clr == 1)
      {
         color1="Y";
      }
      if(clr == 2)
      {
        color1="G";
      }
      if(clr == 3)
      {
       color1="R";
      }
       UnoCard card=new UnoCard(num1, color1);
       computer.add(card);
    }

 System.out.println("My hand");
    for(int p=0; p<players.size(); p++)
    {
      System.out.print(players.get(p)+" ");
    }

  System.out.println("\nComputer hand");
    for(int p=0;p<computer.size();p++)
    {
      System.out.print(computer.get(p)+ " ");
    }
  
  }
}