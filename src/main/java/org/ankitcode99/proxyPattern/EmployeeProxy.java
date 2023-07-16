package org.ankitcode99.proxyPattern;

public class EmployeeProxy implements EmployeeDao{

    EmployeService employeService;
    EmployeeProxy() {
            employeService = new EmployeService();
    }
    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")) {
            employeService.create(client, employee);
            return;
        }
        throw new Exception("ERR 403:Unauthorized operation attempt");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeService.delete(client, employeeId);
        }
        throw new Exception("ERR 403:Unauthorized operation attempt");
    }

    @Override
    public Employee get(int employeeId) throws Exception {
        return employeService.get(employeeId);
    }
}
