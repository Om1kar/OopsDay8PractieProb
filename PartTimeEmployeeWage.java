package Oops.UC3;

public class PartTimeEmployeeWage {
    public static void main(String args []){
        checkEmpPresentorAbsent();
    }

    private static void checkEmpPresentorAbsent() {
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int halfDayHour = 4;
        int partTimeHour = 2;
        int fullTime = 1;
        int empcheck = (int)Math.floor(Math.random()* 10)%3;
        if (empcheck == fullTime) {
            System.out.println("Employee is Present");
            int dailyWage = empWagePerHour * fullDayHour;
            System.out.println("Daily Wage of Employee is"+dailyWage);
            System.out.println("Daily Wage of Employee in Full Time is" + dailyWage);
        } else if (empcheck == partTimeHour) {
            int partTimeWage = empWagePerHour * halfDayHour;
            System.out.println("Daily Wage of Employee in Part Time is" + partTimeWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee is Absent so Daily Wage is 0");

        }

    }
}
