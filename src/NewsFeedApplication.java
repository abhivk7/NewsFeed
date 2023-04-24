import Controllers.FollowController;
import Controllers.PostController;
import Controllers.UserController;
import Model.Post;
import Model.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

public class NewsFeedApplication {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        UserController userController= new UserController();
        FollowController followController = new FollowController();
        PostController postController = new PostController();

        User user1= new User(1,"Abhishek");
        User user2= new User(2,"Divanshu");
        User user3= new User(3,"Nikhanj");
        User user4= new User(4,"Mridul");
        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
        userController.addUser(user4);

        followController.follow(user1,user2);
        followController.follow(user2,user4);
        followController.follow(user4,user1);


        Post post1 = new Post(1, "good inns",Timestamp.from(Instant.now()),user1);
        Post post2 = new Post(2, "well played man",Timestamp.from(Instant.now()),user2);
        Post post3 = new Post(3, "random tweet",Timestamp.from(Instant.now()),user3);

        postController.post(post1);
        postController.post(post2);
        postController.post(post3);




    }
}