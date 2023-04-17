package CompanyRoster;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employeeArrayList;

    public Department(String name) {
        this.name = name;
        this.employeeArrayList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public  Double getAverageSalary(){
        return this.employeeArrayList.stream().mapToDouble(e -> e.getSalary())
                .average().getAsDouble();
    }
}
