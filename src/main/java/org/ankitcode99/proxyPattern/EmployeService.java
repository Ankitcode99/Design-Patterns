package org.ankitcode99.proxyPattern;

public class EmployeService implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("New employee created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Employee record deleted");
    }

    @Override
    public Employee get(int employeeId) throws Exception {
        System.out.println("Retrieving employee data");;
        return new Employee();
    }
}
