package ro.unibuc.lab8.map.exercise.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DepartmentService {


    private final Map<String, Set<String>> departments = new HashMap<>();

    public void registerDepartment(String department) {
        if (!departments.containsKey(department)) {
            departments.put(department, new HashSet<>());
        } else {
            System.out.println("Already exists");
        }
    }

    public void addRoles(String department, Set<String> roles) {
        departments.put(department, roles);
    }


    public void display() {
        Iterator<String> iterator = departments.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Set<String> roles = departments.get(key);

            System.out.println("The key is::" + key + " and values are :: " + roles);
        }
    }
}
