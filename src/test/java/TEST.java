public class TEST {



        int a = 5;
        int b = 5;

    public static void main(String[] args) {


        TEST test = new TEST();
        TEST test1 = new TEST();
        String a = test.toString();
        int b = test.hashCode();
        int a1 = test1.hashCode();
        int b2 = test1.hashCode();

        System.out.println(a + " " + a1);


        if (test.equals(a)) {

            System.out.println("is true");
        }else{

            System.out.println("not true");
        }
    }

}
