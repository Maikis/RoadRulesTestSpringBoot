package lt.roadrulestest.test.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    
    @Autowired
    UserRepository userRepo;
    
    UserDetailErrors saveNewUser(NewUserDto newUserDetails) {
        UserDetailErrors errors = new UserDetailErrors();
        
        if (userRepo.findByEmail() != null) {
            errors.setWrongEmail(true);
        }
        if (userRepo.findByUsername() != null) {
            errors.setWrongUsername(true);
        }
        return null;
    }
}
