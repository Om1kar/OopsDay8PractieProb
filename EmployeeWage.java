package Oops.UC9;

public class EmployeeWage {
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    private static boolean WIPRO;
    // instance constants
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    // instance variable
    int totalWage;

    EmployeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
    }

    int generateEmployeeType() {
        return (int) (Math.random() * 100) % 3;
    }

    int getWorkingHrs(int empType) {
        switch (empType) {
            case FULL_TIME:
                return 8;

            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    void calculateTotalWage() {
        System.out.println("Computation of total wage of " + COMPANY_NAME + "employee");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n",
                "Day", "Workinghrs", "Wage", "Total working hrs");
        int workingHrs = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {

            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n",
                    day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
    }

    public String toString() {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour: " + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }

    public static void main(String args[]) {
        EmployeeWage TCS = new EmployeeWage("TCS", 7, 25, 110);
        EmployeeWage WIPRO = new EmployeeWage("WIPRO", 5, 27, 120);
        EmployeeWage INFOSYS = new EmployeeWage("INFOSYS", 8, 20, 130);

      TCS.calculateTotalWage();
        System.out.println(TCS);

        WIPRO.calculateTotalWage();
        System.out.println(WIPRO);

        INFOSYS.calculateTotalWage();
        System.out.println(INFOSYS);
    }
}
