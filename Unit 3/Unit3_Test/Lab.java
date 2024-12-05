package Unit3_Test;

public class Lab {
    public static void main(String[] args) {
        System.out.println(removePunctuation("This, is'nt a! value:"));
    }

    public static String removePunctuation(String source)
    {
        return source.replaceAll("\\p{Punct}", "");
    }
}
