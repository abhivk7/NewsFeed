package Model;

public class Reply extends Comments{

    private int replyId;
    Comments comments;

    public Reply(int replyId, Comments comments) {
        super(comments.getCommentId(), comments.getPost());
        this.replyId = replyId;
        this.comments = comments;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }
}
