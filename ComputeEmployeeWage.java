package Oops.UC7;

public class ComputeEmployeeWage {
    public static void main(String args []) {
        EmployeeWage();
    }
        static void EmployeeWage() {
        int empWagePerHour=20;
        int fullDayHour=8;
        int halfDayHour=4;
        int fullTime=1;
        int partTimeHour=2;
        int empcheck=(int)Math.floor(Math.random()*10)%3;
        if (empcheck==fullTime) {
            System.out.println("Employee is Present");
            int dailyWage=empWagePerHour * fullDayHour;
            System.out.println("Daily Wage of Employee in full time is "+dailyWage);
            
        } else if (empcheck==partTimeHour) {
            int partTime=empWagePerHour * partTimeHour;
            System.out.println("Daily Wage of Employee in part time is "+partTime);
            
        }
        else {
            System.out.println("Employee is Absent");
            System.out.println("So his daily Wage is 0");
        }
        }
}
