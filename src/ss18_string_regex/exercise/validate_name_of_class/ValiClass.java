package ss18_string_regex.exercise.validate_name_of_class;

import ss18_string_regex.practice.ValidateEmail;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiClass {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String NAME_OF_CLASS = "^[CAP]+[0-9]{4}+[GHIK]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check");
        String regex = sc.nextLine();
        pattern = Pattern.compile(NAME_OF_CLASS);
        matcher = pattern.matcher(regex);
        System.out.println(regex + " " + matcher.matches());
    }
}
