package main;

import configs.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

/*
* This example demonstartes how we can not only see what parameters are sent to an aspected/intercepted method
* but how we can also alter what parameters are actually sent to the intercepted method. When this program runs
* we see that the main method sent a Comment object with "Demo comment" to the publishComment method but the aspect
* changed it to "An aspect was here and changed the comment!", which is what the publishComment method acutally
* received. Though from the perspective of the Main method none of that happened.
* */
public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment("Demo comment", "Fahim");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}