package Model;

import java.util.ArrayList;
import java.util.List;

public class Comments {

    private int commentId;
    private Post post;
    private int upvote;
    private int downvote;

    List<Reply> listOfReply;

    public Comments(int commentId, Post post) {
        this.commentId = commentId;
        this.post = post;
        upvote=0;
        downvote=0;
        listOfReply= new ArrayList<>();
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
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

    public List<Reply> getListOfReply() {
        return listOfReply;
    }

    public void setListOfReply(List<Reply> listOfReply) {
        this.listOfReply = listOfReply;
    }
}
