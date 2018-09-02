package datajpa.boot.spring.ParentChild;

import javax.persistence.*;
import java.util.List;


/**
 *
 * Bidirectional relationship exists between Parent and Child classes.
 *
 * */


@Entity
@Table(name = "parent")
public class Parent {

    private int id;
    private String name;
    private List< Child > childs;

    public Parent(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    * mappedby indicates that the owner resides in the other class
    * in this case : private Parent parent;
    * BiDirectional RelationShip
    * */
    @OneToMany(mappedBy = "parent" , cascade = CascadeType.ALL)
    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }
}
