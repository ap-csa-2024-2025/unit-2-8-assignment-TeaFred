import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scan.nextInt();
    printRandom3(n);

    System.out.println("Enter the first x-coordinate: ");
    double x1 = scan.nextDouble();
    System.out.println("Enter the first y-coordinate: ");
    double y1 = scan.nextDouble();
    System.out.println("Enter the second x-coordinate: ");
    double x2 = scan.nextDouble();
    System.out.println("Enter the second y-coordinate: ");
    double y2 = scan.nextDouble();
    calcSlope(x1,y1,x2,y2);

    System.out.println("Enter two doubles: ");
    double d1 = scan.nextDouble();
    double d2 = scan.nextDouble();
    roundedDist(d1,d2);
  
  }

  public static void printRandom3(int n)
  {
    int refNum = n+1;
    int num1 = (int)(Math.random() * refNum) + 2;
    int num2 = (int)(Math.random() * refNum) + 2;
    int num3 = (int)(Math.random() * refNum) + 2;
    System.out.println("Random numbers: " + "\n"+ num1 + "\n" + num2 + "\n" +num3);
  }

  public static void calcSlope(double x1, double y1, double x2, double y2)
  {
    System.out.println((y2-y1)/(x2-x1));
  }

  public static void roundedDist(double d1, double d2)
  {
    System.out.println("Distance between d1 and d2 is: " + (int) (Math.abs(d1-d2) + 0.5));
  }
}
