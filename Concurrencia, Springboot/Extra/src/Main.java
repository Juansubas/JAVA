import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        if (args[0].equals("yes")) {
            Arrays.stream(args).forEach(System.out::println);
        }
        String[] argsABC = new String[]{"A", "B", "C"};

        doSomething("A", "B", "C");
    }

    private static void doSomething(String ...args){

    }
}