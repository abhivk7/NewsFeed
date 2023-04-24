package Services;

import Model.User;
import Repo.UserRepo;

public class UserService {

    UserRepo userRepo;

    public  UserService(){
        userRepo= new UserRepo();
    }

    public void addUser(User user){

        userRepo.addUser(user);
    }
}
