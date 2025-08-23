import java.util.*;

public class getAre{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input side of square
        System.out.println("Enter Side of a Square :");
        int side = sc.nextInt();

        // get the square

        int Area = side*side;

        System.out.println("Area of a Square is :"+ Area );

        sc.close();

        
    }
}
