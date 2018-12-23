package task3;

import java.io.Serializable;

public abstract class Employee implements Serializable {

    public static double averageWorkingDayInMounth = 20.8;

    protected String employeeName;
    private int idEmployee;
    protected double averageSalary;

    public Employee(int id) {
        this.idEmployee = id;
    }

    public abstract double averageMonthlySalary();

    public static double getAverageWorkingDayInMounth() {
        return averageWorkingDayInMounth;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [idEmployee=" + idEmployee + ", name=" + employeeName + ", average salary=" + averageSalary + "]";
    }
}
