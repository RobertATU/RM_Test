package ie.atu;

import java.util.ArrayList;

public class EmployeeList {
ArrayList<Employee> emlist = new ArrayList<Employee>();
int arraySize = 0;


public void addEmployee(Employee em){
    if(emlist.contains(em.getName()) && emlist.contains(em.getNumber())){
        throw new IllegalArgumentException("Already exists nothing added");
    }
    else{
        emlist.add(em);
        arraySize++;
    }
}


}
