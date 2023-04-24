package Controllers;

import Model.User;
import Services.FollowService;

public class FollowController {

    FollowService followService;

    public FollowController(){
        followService=new FollowService();
    }

    public void follow(User u1,User u2){
        followService.follow(u1,u2);
    }
}
