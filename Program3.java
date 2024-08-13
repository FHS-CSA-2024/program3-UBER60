//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
public static void main(String[] args){
    double width;
    double length;
    double area;
    double perimeter;
    Scanner x = new Scanner(System.in);
    System.out.print("Enter the length: ");
    length = x.nextDouble();
    System.out.println();
    
    System.out.print("Enter the width: ");
    width = x.nextDouble();
    System.out.println();
    
    area = length * width;
    perimeter = 2 * (length + width);
    
    System.out.println("The Length is " + length);
    System.out.println();
    System.out.println("The width is " + width);
    System.out.println();
    System.out.println("The area is " + area);
    System.out.println();
    System.out.println("The perimeter is " + perimeter);
    System.out.println();
}
}



//Paste console output below:
/*
Enter the length: 143

Enter the width: 82

The Length is 143.0

The width is 82.0

The area is 11726.0

The perimeter is 450.0

*/
