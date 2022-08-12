package Oops.CalculateDailyWage;

public class UC2CalculateDailyWagee {
    public static void main(String args []){
       checkEmpPresentorAbsent();
    }

    private static void checkEmpPresentorAbsent() {
        int present = 1;
        int absent = 0;
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int empcheck = (int)Math.floor(Math.random()* 10)%2;
        if (empcheck == present) {
            System.out.println("Employee is Present");
            int dailyWage = empWagePerHour * fullDayHour;
            System.out.println("Daily Wage of Employee is" + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage of Employee is Zero");
        }
    }
}
