import java.util.Objects;
import java.util.Scanner;

public class Cartesian{
public static double calculateLength() {
    Scanner input = new Scanner(System.in);

    //co-ordinates for first line
    System.out.println("Enter the value of x2 ");
    int x2 = input.nextInt();

    System.out.println("Enter the value of y2");
    int y2 = input.nextInt();

    //co-ordinates for second line
    System.out.println("Enter the value of a2 ");
    int a2 = input.nextInt();

    System.out.println("Enter the value of b2");
    int b2 = input.nextInt();

    int x1 = 0;
    int y1 = 0;
    int a1 = 0;
    int b1 = 0;

    //calculation part
    double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    double lengthOfLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
    System.out.println("Length of line is " + lengthOfLine1 + " length of line 2 is: " + lengthOfLine2);


    System.out.println(Objects.equals(lengthOfLine1, lengthOfLine2));
    return lengthOfLine1;
}
        public static void main(String args[]){
        calculateLength();
        }


        }
