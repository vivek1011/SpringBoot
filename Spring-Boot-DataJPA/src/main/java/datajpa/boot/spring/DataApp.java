package datajpa.boot.spring;

import datajpa.boot.spring.ParentChild.Child;
import datajpa.boot.spring.ParentChild.IParentRepository;
import datajpa.boot.spring.ParentChild.Parent;
import datajpa.boot.spring.entities.Employee;
import datajpa.boot.spring.entities.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataApp implements CommandLineRunner{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private IParentRepository parentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DataApp.class , args);
    }

    @Override
    public void run(String... args) throws Exception {

        employeeRepository.save(new Employee("Vivek" , "Bansal" , 12131));

        List<Employee> employees = employeeRepository.getCustomEmployees("Bansal");


        /*
        * How to insert in parent child tables.
        * */
        Parent parent = new Parent("Parent A");
        List<Child> childList = new ArrayList<>();

        childList.add(new Child("Child A",  parent));
        childList.add(new Child("Child B",  parent));

        parent.setChilds(childList);

        parentRepository.save(parent);

    }
}
