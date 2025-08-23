import java.util.*;


public class getSum{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pencil Cost :" );
        float Pencil = sc.nextFloat();

        System.out.println("Pen Cost :" );
        float Pen = sc.nextFloat();

        System.out.println("Eraser Cost :" );
        float Eraser = sc.nextFloat();


    float Total =   Pencil + Pen + Eraser ;

    float GST = (Total*18)/100;

    float finalTotal = Total + GST;

    System.out.println("Total Price With GST :"+ finalTotal );

    }
}