package main;

import configs.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Fahim", "Demo comment, hello world!");
        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}