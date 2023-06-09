package ss18_string_regex.practice;

public class EmailExampleTest {
    private static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.com", "@#gmail.com"};

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String email : validEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email: " + email + " is valid" + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is: " + email + " is valid: " + isvalid);
        }
    }
}
