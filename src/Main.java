import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "Hello 2 worlD++";
        Function<String, String> fun1 = a -> a.toLowerCase().replaceAll("[^bcdfghjklmnpqrstvwxz]", "");
        Function<String, Integer> fun2 = a -> a.length();
        Function<String, Integer> fun3 = fun2.compose(fun1);
        System.out.println(fun3.apply(str));
    }
}
