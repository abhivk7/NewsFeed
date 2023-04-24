package Controllers;

import Model.User;
import Services.UserService;

public class UserController {

    UserService userService;

    public void addUser(User user){

        userService.addUser(user);
    }
}
