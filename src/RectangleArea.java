import java.util.Scanner;

public class RectangleArea {
     double sideLength;
     double sideWidth;
     double RectangleArea;

    public void getData ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        sideLength = sc.nextDouble();
        System.out.println("Enter the width of the Rectangle");
         sideWidth = sc.nextDouble();
    }
    public double computerField () {
        RectangleArea = (sideWidth * sideLength) ;
        return RectangleArea;
    }

    public void fileDisplay(){
        System.out.println("The Rectangle area is :" + RectangleArea);
    }
}
