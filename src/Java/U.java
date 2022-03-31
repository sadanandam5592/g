package Java;

public class U {
    public static void main(String[] args) {
        try{
            A a=new A();
            a.e();

        }catch (RuntimeException e) {
            System.out.println("you got it!");
        }

    }
}
