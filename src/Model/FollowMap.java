package Model;

public class FollowMap {


    int followerid;
    int followingid;

    public FollowMap(int followerid, int followingid) {
        this.followerid = followerid;
        this.followingid = followingid;
    }

    public int getFollowerid() {
        return followerid;
    }

    public void setFollowerid(int followerid) {
        this.followerid = followerid;
    }

    public int getFollowingid() {
        return followingid;
    }

    public void setFollowingid(int followingid) {
        this.followingid = followingid;
    }
}
