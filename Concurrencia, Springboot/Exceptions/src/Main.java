public class Main {
    public static void main(String[] args) {
        // ArithmeticException
        // Debido a que ocurre al momento de compilarse
        exampleArithmeticException();
    }

    private void checkedException(){
        throw new Exception();
    }

    private static void exampleArithmeticException(){
        double number= 10/0;
    }
}