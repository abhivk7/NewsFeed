package Services;

import Model.User;
import Repo.FollowMapRepo;

public class FollowService {

    FollowMapRepo followMapRepo;
    public FollowService(){
        followMapRepo=new FollowMapRepo();
    }
    public void follow(User user1,User user2){

        followMapRepo.follow(user1,user2);
    }
}
