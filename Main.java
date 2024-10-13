import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    printRandom3(6);
  }

  public static void printRandom3(int n)
  {
    int refNum = n+1;
    int num1 = (int)(Math.random() * refNum) + 2;
    int num2 = (int)(Math.random() * refNum) + 2;
    int num3 = (int)(Math.random() * refNum) + 2;
    System.out.println("Random numbers: " + "\n"+ num1 + "\n" + num2 + "\n" +num3);
  }
}
