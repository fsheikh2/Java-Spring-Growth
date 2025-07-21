package main;

import model.Comment;
import proxies.EmailNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

/*
* The purpose of this exercise is to show a demo of an app which posts users comments and sends an
* email notification to the commenter. This is done without the use of Spring.
* */

public class Main {
    public static void main(String[] args) {
        var commentNotificationProxy = new EmailNotificationProxy();
        var commentRepository = new DBCommentRepository();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment("Fahim", "Demo comment, hello world!");

        commentService.publishComment(comment);
    }
}