package main;

import configs.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/*
* The purpose of this example is to demo the same comment posting and notification app as in the first
* exmaple but with the use of Spring. Specifically we use sterotype annotations and autowiring to set up
* the CommentService object.
* */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Fahim", "Demo comment, hello world!");
        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}