import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 	{
    public static void main(String[] args) {
            Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

            Pattern pattern1 = Pattern.compile("[Хх]([аоие])х?(?:\1х?) *  | [Аа]х?(?:ах?)+");
            Matcher matcher = pattern1.matcher("Xoxx");
            boolean matches = matcher.matches();
            System.out.println(matches);
        }




}