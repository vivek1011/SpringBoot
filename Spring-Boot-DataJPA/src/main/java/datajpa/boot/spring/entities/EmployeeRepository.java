package datajpa.boot.spring.entities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    /* Spring EL magic :
    "#{#entityName}" would by default go to entity of this repository i.e. Employee
    * */

    @Query("Select u from #{#entityName} u where u.lastName = ?1")
    List<Employee> getCustomEmployees(String lastname);
}
