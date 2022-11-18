public class Main {
    public static void main(String[] args) throws Exception {
        try {
            checkedException();
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw new Exception();
        }
            System.out.println("Hello");

    }

    //Checked Exceptions
    private static void checkedException() throws Exception{
            throw new Exception();
    }

    //Uncheked Exceptions
    private static void exampleArithmeticException(){
        double number= 10/0;
    }
}