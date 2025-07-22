package proxies;

import model.Comment;

public class EmailNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment notification: " + comment.getText());
    }
}
