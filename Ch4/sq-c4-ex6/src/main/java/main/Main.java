package main;

import configs.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/*
*  Another example where we have multiple beans which qualify as dependencies because they implement the same interface.
* Here we use the @Qualifier annotation to name each bean. Where ever we want that bean injected we then use
* that name via @Qualifier as part of the parameter declaration.
*
* */

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Fahim", "Demo comment, hello world!");
        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}