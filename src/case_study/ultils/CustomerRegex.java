package case_study.ultils;

public class CustomerRegex {
//-	Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9.
//-	Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.
//-	Phải đủ 18 tuổi (tính cả ngày + tháng)
//-	CMND phải đủ 9 hoặc 12 số.
//-	Số điện thoại phải bắt đầu từ 0 và đủ 10 số.

    //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
    //                    String email, String customerType, String address
    private static final String REGEX_CUSTOMER_CODE = "^(KH)-[0-9]{4}$";

    public static boolean checkCode(String code) {
        return code.matches(REGEX_CUSTOMER_CODE) ? true : false;
    }

    private static final String REGEX_CUSTOMER_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10}" +
            ")){0,5}$";

    public static boolean checkName(String name) {
        return name.matches(REGEX_CUSTOMER_NAME) ? true : false;
    }

    //2000-12-20
    private static final String REGEX_CUSTOMER_DATEOFBIRTH = "^([1-9]{1}[0-9]{3}(-))((0)[1-9]|(1)[0-2](-))((0)[1-9]" +
            "|(1|2)[0-9]|(3)[0-1])$";

    public static boolean checkDate(String date) {
        return date.matches(REGEX_CUSTOMER_DATEOFBIRTH) ? true : false;
    }

    private static final String REGEX_CUSTOMER_IDENTIFY = "^[0-9]{9,12}$";

    public static boolean checkIdentify(String identify) {
        return identify.matches(REGEX_CUSTOMER_IDENTIFY);
    }

    private static final String REGEX_CUSTOMER_PHONENUMBER = "^[0]{1}[0-9]{9}$";

    public static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_CUSTOMER_PHONENUMBER) ? true : false;
    }
}
