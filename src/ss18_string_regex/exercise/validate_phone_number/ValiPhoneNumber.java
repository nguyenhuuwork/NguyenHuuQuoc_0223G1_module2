package ss18_string_regex.exercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiPhoneNumber {
    public static Pattern pattern;
    public static Matcher matcher;
    //(84)-(0905451778)
    public static final String NUMBER_CHECK = "^\\((84)\\)-\\((0)[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check");
        String input = sc.nextLine();
        pattern = Pattern.compile(NUMBER_CHECK);
        matcher = pattern.matcher(input);
        System.out.println(input + " " + matcher.matches());

    }
}
