package datajpa.boot.spring.ParentChild;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IParentRepository extends JpaRepository<Parent , Integer> {
}
