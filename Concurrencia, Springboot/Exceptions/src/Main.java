public class Main {
    public static void main(String[] args) throws Exception {
        try {
            checkedTwoExceptions(true);
        } catch (RuntimeException e){
            System.out.println("Runtime Exception");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception Common");
        }
    }
    private static void checkedTwoExceptions(boolean flag) throws Exception {
        if (flag) {
            throw new Exception();
        } else {
            throw new RuntimeException();
        }
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