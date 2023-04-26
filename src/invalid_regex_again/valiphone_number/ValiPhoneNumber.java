package invalid_regex_again.valiphone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiPhoneNumber {
    public static Pattern pattern;
    public static Matcher matcher;
    public static String PATTERN = "^\\((84)\\)-\\((0)+[0-9]{9}\\)+$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra");
        String input = sc.nextLine();
        pattern = Pattern.compile(PATTERN);
        matcher = pattern.matcher(input);
        System.out.println(input + " " + matcher.matches());
    }
}
