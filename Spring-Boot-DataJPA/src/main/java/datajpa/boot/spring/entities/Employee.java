package datajpa.boot.spring.entities;


import javax.persistence.*;

/**
 * Table name = "employee"
 * */
@Entity(name = "employee")
public class Employee {


    private Integer id;
    private String firstName;
    private String lastName;
    private Integer phone;

    /**
     * Mandatory to provide Empty constructor for @Entity
     * */
    public Employee(){}

    public Employee(String firstName, String lastName, Integer phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
