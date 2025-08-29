public class checkAdult{
    public static void main(String[] args){

        int age = 21;

        if(age>=18){
            System.out.println("Adult , vote");
        }
        if (age>13 && age<18){
            System.out.println("true ");
        }
        else{
            System.out.println("not adult");
        }
    }
}