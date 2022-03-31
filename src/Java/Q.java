package Java;

public class Q {


    public static void main(String[] args) {
        for(int i=0;i<5;i++){
          /*  if (i == 3) {

                try {

                } catch (RuntimeException e) {
                    throw new RuntimeException("exception in catch block");
                }
            }*/
        throw new RuntimeException("exception outside catch block");
        }
        System.out.println("second hii");
       // m.p();
    }
}
