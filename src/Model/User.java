package Model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String userName;

    List<Post> listOfPosts;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        listOfPosts=new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Post> getListOfPosts() {
        return listOfPosts;
    }

    public void setListOfPosts(List<Post> listOfPosts) {
        this.listOfPosts = listOfPosts;
    }
}
