package datajpa.boot.spring.ParentChild;

import javax.persistence.*;

@Entity
public class Child {

    private int id;
    private String childName;
    private Parent parent;

    public Child(String childName, Parent parent) {
        this.childName = childName;
        this.parent = parent;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    /*
    * @JoinColumn indicates that this entity is the owner of relationship
    * In this case is our parent(Object)
    * */

    @ManyToOne
    @JoinColumn(name = "parent_id")
    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
