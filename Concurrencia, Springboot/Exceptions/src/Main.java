public class Main {
    public static void main(String[] args) {
        try {
            checkedException();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void checkedException() throws Exception{
            throw new Exception();
    }

    private static void exampleArithmeticException(){
        double number= 10/0;
    }
}