package main;

import configs.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

/*
*
* This example shows a very basic use of aspects. To ustilize this feature of spring we enable aspects by adding the
* @EnableAspectJAutoProxy to the ProjectConfig class (also marked @Configuration). We then create an aspect class
* (here it's LoggingAspect) which we mark with @Aspect. We then declare a method in the aspect class where we use
* the @Around annotation to specify which methods to intercept and what logic to excute.
*
* */
public class Main {
    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment("Demo comment", "Fahim");

        service.publishComment(comment);
    }
}