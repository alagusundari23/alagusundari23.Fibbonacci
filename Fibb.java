import java.util.Scanner;

public class Fibb {
  public static void main(String[] args) {
  int num1 = 0;
  int num2 = 1;
  int nextNum;
  int lengthOfSeries;
  System.out.println("enter of series");
  Scanner scan = new Scanner(System.in);
  lengthOfSeries = scan.nextInt();
  scan.close();
  for(int i =0;i<lengthOfSeries;i++) {
  System.out.print(num1 + " ");
  nextNum=num1+num2;
  num1 = num2;
  num2 = nextNum;
  }
 }
}
