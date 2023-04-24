package Repo;

import Model.FollowMap;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class FollowMapRepo {

    List<FollowMap> followMapList;

    public FollowMapRepo(){
        followMapList=new ArrayList<>();
    }

    public void follow(User u1,User u2){

        followMapList.add(new FollowMap(u1.getUserId(),u2.getUserId()));
    }
}
