import java.util.*;

public class getAverage{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // input of three numbers 

        System.out.println("Enter A :");
        int A = sc.nextInt();

        System.out.println("Enter B :");
        int B = sc.nextInt();

        System.out.println("Enter C :");
        int C = sc.nextInt();

        // get Average 

        double average = (A+B+C)/3.0;

        System.out.println("Average is :"+ average);

        sc.close();

    }
}