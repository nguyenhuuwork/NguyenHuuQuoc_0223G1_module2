package ss5_access_modifier_static_method_static_property.additional_exersice;

public class MyDate {
    private String itemCode;
    private int day;
    private int month;
    private int year;

    public static MyDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public int  Month() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
