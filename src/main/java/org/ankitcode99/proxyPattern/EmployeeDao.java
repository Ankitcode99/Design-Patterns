package org.ankitcode99.proxyPattern;

public interface EmployeeDao {
    public void create(String client, Employee employee) throws Exception;

    public void delete(String client,int employeeId) throws Exception;

    public Employee get(int employeeId) throws Exception;
}
