public class UnoCard
{
  public UnoCard(int n, String clr)
  {
    number = n;
    color = clr;
  }
  public String toString()
  {
    return color + number;
  }

 int number;
 String color;
}