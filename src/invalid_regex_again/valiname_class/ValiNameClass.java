package invalid_regex_again.valiname_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiNameClass {
    public static Pattern pattern;
    public static Matcher matcher;
    public static String PATTERN = "^[CAP]+[0-9]{4}+[GHIK]+$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi can kiem tra");
        String input = sc.nextLine();
        pattern = Pattern.compile(PATTERN);
        matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
