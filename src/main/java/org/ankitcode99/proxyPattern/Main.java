package org.ankitcode99.proxyPattern;

public class  Main {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeProxy();
            employeeDao.create("ADMIN",new Employee());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
