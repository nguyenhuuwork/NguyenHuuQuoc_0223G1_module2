package case_study.ultils;

public class EmployeeRegex {
    //String code, String name, String dateOfBirth, boolean gender, String indentity, String phoneNumber,
    //                    String email, String level, String position, double salary
    //-	Mã nhân viên phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9.
    //-	Tên nhân viên phải viết hoa các ký tự đầu của mỗi từ.
    //-	Phải đủ 18 tuổi (tính cả ngày + tháng)
    //-	CMND phải đủ 9 hoặc 12 số.
    //-	Số điện thoại phải bắt đầu từ 0 và đủ 10 số.
    //-	Lương phải lớn hơn 0.
    private static final String REGEX_EMPLOYEE_CODE = "^(NV)-[0-9]{4}$";

    public static boolean checkCode(String code) {
        return code.matches(REGEX_EMPLOYEE_CODE) ? true : false;
    }

    private static final String REGEX_EMPLOYEE_NAME = "^[A-Z]$";

    public static boolean checkName(String name) {
        return name.matches(REGEX_EMPLOYEE_NAME) ? true : false;
    }

    private static final String REGEX_EMPLOYEE_DATEOFBIRTH = "^([1-9]{1}[0-9]{3}(-))((0)[1-9]|(1)[0-2](-))((0)[1-9]" +
            "|(1|2)[0-9]|(3)[0-1])$";

    public static boolean checkDate(String date) {
        return date.matches(REGEX_EMPLOYEE_DATEOFBIRTH) ? true : false;
    }

    private static final String REGEX_EMPLOYEE_IDENTIFY = "^[0-9]{9,12}$";

    public static boolean checkIdentify(String indentify) {
        return indentify.matches(REGEX_EMPLOYEE_IDENTIFY) ? true : false;
    }

    public static final String REGEX_EMPLOYEE_PHONE_NUMBER = "^[0]{1}[0-9]{9}$";

    public static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_EMPLOYEE_PHONE_NUMBER) ? true : false;
    }

    public static final String REGEX_EMPLOYEE_SALARY = "^\\d*(\\.\\d+)?$";

    public static boolean checkSalary(String salary) {
        return salary.matches(REGEX_EMPLOYEE_SALARY) ? true : false;
    }
}