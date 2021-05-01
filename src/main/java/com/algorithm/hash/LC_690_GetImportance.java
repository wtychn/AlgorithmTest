package com.algorithm.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***
 * @Description: 员工的重要性
 * @level easy
 * @author wtychn
 * @Date 2021/5/1
 */
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class LC_690_GetImportance {
    Map<Integer, Employee> map;
    int res;

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        res = 0;
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        getImport(id);
        return res;
    }

    private void getImport(Integer i) {
        Employee employee = map.get(i);
        res += employee.importance;
        if(employee.subordinates.size() == 0) return;
        for (Integer id : employee.subordinates) {
            getImport(id);
        }
    }
}
