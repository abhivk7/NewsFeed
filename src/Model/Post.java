package Model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private int postId;
    private String postMessage;
    private int upvote;
    private int downvote;

    private User user;

    List<Comments> listOfComments;
    Timestamp timneOfPost;

    String timeForUI;

    public Post(int postId, String postMessage, Timestamp timneOfPost,User user) {
        this.postId = postId;
        this.postMessage = postMessage;
        upvote=0;
        downvote=0;
        this.timneOfPost = timneOfPost;
        listOfComments=new ArrayList<>();
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDownvote() {
        return downvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }

    public List<Comments> getListOfComments() {
        return listOfComments;
    }

    public void setListOfComments(List<Comments> listOfComments) {
        this.listOfComments = listOfComments;
    }

    public Timestamp getTimneOfPost() {
        return timneOfPost;
    }

    public void setTimneOfPost(Timestamp timneOfPost) {
        this.timneOfPost = timneOfPost;
    }

    public String getTimeForUI() {
        return timeForUI;
    }

    public void setTimeForUI(String timeForUI) {
        this.timeForUI = timeForUI;
    }
}
