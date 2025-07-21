package main;

import model.Comment;
import proxies.EmailNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentNotificationProxy = new EmailNotificationProxy();
        var commentRepository = new DBCommentRepository();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment("Fahim", "Demo comment, hello world!");

        commentService.publishComment(comment);
    }
}