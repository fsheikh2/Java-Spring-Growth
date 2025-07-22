package main;

import configs.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/*
* Same as example 2 except this utilizes field injection instead of constructor injection.
* Note the fields cannot be final in this case.
* */

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Fahim", "Demo comment, hello world!");
        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}