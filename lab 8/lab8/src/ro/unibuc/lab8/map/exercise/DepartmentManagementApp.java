package ro.unibuc.lab8.map.exercise;


import ro.unibuc.lab8.map.exercise.service.DepartmentService;

import java.util.HashSet;
import java.util.Set;

public class DepartmentManagementApp {
    /**
     * Create a program which manages the departments from a company
     * One department can have multiple different roles opened
     * Ex: IT department can have: Developer, Tester
     */
    public static void main(String[] args) {

        DepartmentService service = new DepartmentService();
        String it = "IT";
        service.registerDepartment(it);
        Set<String> roles = new HashSet<>();
        roles.add("Developer");
        roles.add("Tester");
        service.addRoles(it, roles);
        service.display();
    }

}
