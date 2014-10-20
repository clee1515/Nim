public class NimHuman{
  
  public int play (int pieces)
  {
    if (pieces == 12 || pieces == 10 || pieces == 9 || pieces == 6 || pieces == 3)//I made it so the computer will take away the opposite of whatever the human does
    { return 2; }//by doing that, the numbers will always end up the same after the computer's turn. 10-7-4 until the computer wins. 
    if (pieces == 11 || pieces == 8 || pieces == 7 || pieces == 5 || pieces == 4 || pieces == 2) 
    {return 1;} 
    else return 0;
  }
}

