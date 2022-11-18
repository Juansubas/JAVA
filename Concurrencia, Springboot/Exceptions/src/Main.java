public class Main {
    public static void main(String[] args) throws Exception {
        try {
            uncheckedTwoExceptions(false);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arihmetic Exception");
        }
    }
    private static void checkedTwoExceptions(boolean flag) throws Exception {
        if (flag) {
            throw new Exception();
        } else {
            throw new RuntimeException();
        }
    }

    private static void uncheckedTwoExceptions(boolean flag) throws Exception {
        if (flag) {
            throw new ArithmeticException();
        } else {
            throw new NullPointerException();
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