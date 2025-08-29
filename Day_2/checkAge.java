public class checkAge {
    public static void main(String[] args) {
        int age = 18;

        if (age<=18){
            System.out.println("children");
        }else if (age==18){
            System.err.println("Teenage");
        }else{
            System.err.println("Adult");
        }
    }
}
