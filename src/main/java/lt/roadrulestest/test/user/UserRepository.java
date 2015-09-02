package lt.roadrulestest.test.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
    User save(User newUser);
    List<User> findAll();
    User findByEmail();
    User findByUsername();
    
}
