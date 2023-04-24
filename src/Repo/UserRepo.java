package Repo;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    List<User> listofusers;

    public UserRepo(){

        listofusers= new ArrayList<>();
    }

    public User getUserById(int id){

        for(User user: listofusers){

            if(user.getUserId()==id) return user;
        }
        return null;
    }
    public void addUser(User user){

        listofusers.add(user);
    }
}
