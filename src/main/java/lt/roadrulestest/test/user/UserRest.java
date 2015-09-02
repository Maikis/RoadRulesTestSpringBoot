package lt.roadrulestest.test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/user/newUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> saveUser(@RequestBody NewUserDto newUserDetails) {
        
        return null;
    }
}
