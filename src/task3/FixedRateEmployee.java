package task3;

public class FixedRateEmployee extends Employee {
    public FixedRateEmployee(int id, double averageSalary, String employeeName) {
        super(id);
        this.averageSalary = averageSalary;
        this.employeeName = employeeName;
    }

    @Override
    public double averageMonthlySalary() {
        return averageSalary;
    }
}
