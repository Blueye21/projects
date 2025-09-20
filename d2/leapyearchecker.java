public class leapyearchecker {
    public static void main(String[] args) {
        int year = 2025;
        checkLeapYear(year);
    }
    
    public static void checkLeapYear(int year) {
        System.out.println(
            (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) 
                ? year + " is leap year"
                : year + " is not a leap year");
    }
}