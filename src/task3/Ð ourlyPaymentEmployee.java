package task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

class РourlyPaymentEmployee extends Employee  {
    private double hourCoefficient;


    public РourlyPaymentEmployee(int id, String employeeName, double hourCoefficient) {
        super(id);
        this.employeeName = employeeName;
        this.hourCoefficient = hourCoefficient;
        averageMonthlySalary();
    }

    @Override
    public double averageMonthlySalary() {
        averageSalary = round(averageWorkingDayInMounth * 8 * hourCoefficient, 2);
        return averageSalary;
    }

    public  double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}