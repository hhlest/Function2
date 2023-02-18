import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String str = "Hello 2 worlD++";
        Function<String, Integer> fun1 = a -> countLetters(str);
        System.out.println(fun1.apply(str));
    }

    public static Integer countLetters(String str){
        String regex = "[^bcdfghjklmnpqrstvwxz]";
        String strResult = str.toLowerCase().replaceAll(regex, "");
        return strResult.length();
    }
}
