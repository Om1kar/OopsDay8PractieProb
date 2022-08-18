package Oops.UC10;

public class EmployeeWage {
    // class constants
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    // instance variables
    int noOfCompanies, index;
    EmpwageCompany[] companies;

    public EmployeeWage(int noOfCompanies) {
        this.noOfCompanies = noOfCompanies;
        companies = new EmpwageCompany[noOfCompanies];
        index = 0;
    }

    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new EmpwageCompany(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
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
        for (EmpwageCompany company : companies) {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(EmpwageCompany companyEmpWage) {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
    }

    public static void main(String args[]) {
        EmployeeWage manageWageMultipleCompanies = new EmployeeWage(3);
        manageWageMultipleCompanies.addCompany("TCS", 7, 25, 110);
        manageWageMultipleCompanies.addCompany("WIPRO", 5, 27, 120);
        manageWageMultipleCompanies.addCompany("INFOSYS", 8, 20, 130);
        manageWageMultipleCompanies.calculateTotalWage();
    }
}
