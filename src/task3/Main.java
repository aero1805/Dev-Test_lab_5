package task3;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static final String FILE = "employee.txt";
    private static List<Employee> listFixedRateEmployee = new ArrayList<>();
    private static List<Employee> listРourlyPaymentEmployee = new ArrayList<>();
    private static List<Employee> allEmployee = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.createListFixedRateEmployee();
        main.createListРourlyPaymentEmployee();
        main.mergeAllEmployee();
        System.out.println("-------------------------------All Employee before sort--------------------------------");
        main.printAllEmployee();
        System.out.println("---------------------------------------After sort--------------------------------------");
        main.sortEmployee(allEmployee);
        main.printAllEmployee();
        System.out.println("---------------------------------------First 5 elements--------------------------------");
        main.printFirstFiveItem();
        System.out.println("---------------------------------------Last 3 elements--------------------------------");
        main.printLastThreeItem();
        System.out.println("------------------------------------write to file employee------------------------------");
        main.writeToFileListAllEmployee(allEmployee);
        System.out.println("------------------------------------read from file employee------------------------------");
        main.readFromFileListEmployee("employee.txt");

    }

    private void printFirstFiveItem() {
        for (int i = 0; i < 5; i++) {
            System.out.println(allEmployee.get(i));
        }
    }

    private void printLastThreeItem() {
        for (int i = allEmployee.size() - 1; i > allEmployee.size() - 4; i--) {
            System.out.println(allEmployee.get(i));
        }
    }

    private List<Employee> sortEmployee(List<Employee> list) {
        Collections.sort(list, (lhs, rhs) -> {
            if (lhs.averageMonthlySalary() < rhs.averageMonthlySalary()) {
                return 1;
            } else if (lhs.averageMonthlySalary() > rhs.averageMonthlySalary()) {
                return -1;
            } else {
                return lhs.getEmployeeName().compareTo(rhs.getEmployeeName());
            }
        });
        return list;
    }

    private void printFixedRateEmployee() {
        for (Employee employee : listFixedRateEmployee) {
            System.out.println(employee);
        }
    }

    private void printРourlyPaymentEmployee() {
        for (Employee employee : listРourlyPaymentEmployee) {
            System.out.println(employee);
        }
    }

    private void printAllEmployee() {
        for (Employee employee : allEmployee) {
            System.out.println(employee);
        }
    }

    private void createListFixedRateEmployee() {
        int startId = listРourlyPaymentEmployee.size();
        for (int i = 0; i < 10; i++) {
            listFixedRateEmployee.add(new FixedRateEmployee(startId + i, i + 100, getRandomString()));
        }
    }

    private void createListРourlyPaymentEmployee() {
        int startId = listFixedRateEmployee.size();
        for (int i = 0; i < 10; i++) {
            int coif = 5 + (int) (Math.random() * ((10 - 5) + 1)); // random in range 5 - 10
            listРourlyPaymentEmployee.add(new РourlyPaymentEmployee(startId + i, getRandomString(), coif));
        }
    }

    private void mergeAllEmployee() {
        allEmployee.addAll(listРourlyPaymentEmployee);
        allEmployee.addAll(listFixedRateEmployee);
    }


    private void writeToFileListAllEmployee(List<Employee> list) {
        try {
            if(checkFileFormat(FILE).equals("text/plain")){
                clearFile(FILE);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE, true))) {
                    oos.writeObject(list);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (InvalidFormatting invalidFormatting) {
            System.out.println(invalidFormatting.getMessage());
        }
    }

    private String checkFileFormat(String fileName) throws InvalidFormatting {
        String fileType = "Undetermined";
        final File file = new File(fileName);
        try {
            fileType = Files.probeContentType(file.toPath());
        } catch (IOException c) {
            throw new InvalidFormatting(c.getMessage());
        }
        return fileType;
    }

    private void readFromFileListEmployee(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            employees.stream().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("-------------------------");
            System.out.println("Loading ERROR: " + e.getMessage());

        }
    }

    private void clearFile(String file) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.close();
    }

    private String getRandomString() {
        Random r = new Random(); // just create one and keep it around
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final int N = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        return sb.toString();
    }
}
