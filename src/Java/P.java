package Java;

public class P {
    public LO l;
    P(){
       l=new LO();
    }
    void m() throws Exception {
        int b = 0;
        String a = "abc";
       try{
            System.out.println(Integer.parseInt(a));

            System.out.println("First exception");


        } catch (Exception e) {
        throw new Exception("hhi");
        }

        //l.i();
    }
}
