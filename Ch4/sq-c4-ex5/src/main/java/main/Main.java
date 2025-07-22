package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/*
* This example continues developing the same app but shows one way to handle the situation when we have
* more than one bean which fulfills a "contract", i.e. implements an interface, in the spring context.
* Specifically we mark the bean we want to use as @Primary.
* */
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Fahim", "Demo comment, hello world!");
        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}