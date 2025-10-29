package Practice_Questions;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2026;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

// Q4) Write a program to check if a year is a leap year. A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
