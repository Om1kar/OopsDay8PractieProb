package Oops.PracticeProb;

public class UC1EmployeeAttendence {
    public static void main(String args[]) {
        checkEmpPresentorAbsent();
    }

    static void checkEmpPresentorAbsent() {
        int present = 1;
        int empCheck = (int) Math.floor(Math.random()*10)%2;
        if (empCheck == present) {
            System.out.println("Employee is Present");
        }
        else System.out.println("Employee is Absent");
    }
}


