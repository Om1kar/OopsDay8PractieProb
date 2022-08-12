package Oops.UC5;

public class WageForMonth {
    public static void main (String args []) {
        empCheckPresentorAbsent();
        
    }

    private static void empCheckPresentorAbsent() {
        int empWagePerHour=20;
        int fullDayHour=8;
        int halfDayHour=4;
        int partTimeHour=2;
        int workingDaysPerMonth=20;
        int empcheck = (int)Math.floor(Math.random()*10)%3;
        switch (empcheck) {
            case 1: int monthlyWage = empWagePerHour * fullDayHour * workingDaysPerMonth;
                System.out.println("Monthly wage of Employee in full Time is "+monthlyWage);
                break;
            case 2: int partTimeWage = empWagePerHour * partTimeHour * workingDaysPerMonth;
                System.out.println("Monthly Wage od Employee in Part Time is "+partTimeWage);
                break;
            default:
                System.out.println("Employee is Absent so his Monthly Wage is 0");
        }
    }
}
