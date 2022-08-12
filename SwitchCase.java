package Oops.UC4;

public class SwitchCase {
    public static void main(String args []) {
     empCheckPresentorAbsent();

    }
    static void empCheckPresentorAbsent() {
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int halfDayHour = 4;
        int partTimeHour = 2;
        int fullTime = 1;
        int empcheck = (int)Math.floor(Math.random()*10)%3;
        switch (empcheck) {
            case 1: int dailyWage = empWagePerHour * fullDayHour;
                System.out.println("Daily Wage of Employee in Full Time is " +dailyWage);
                break;
            case 2: int partTimeWage = empWagePerHour * partTimeHour;
                System.out.println("Daily Wage of Employee in Part Time is " +partTimeWage);
            default:
                System.out.println("As Employee is Absent so his Daily Wage is 0");
        }
    }
}

