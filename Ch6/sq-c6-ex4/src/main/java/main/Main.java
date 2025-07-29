package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {

  /*
  * This example demonstrates how to create our own annotation and use it to setup aspects.
  * */
  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Fahim");

    service.publishComment(comment);
    service.deleteComment(comment);
    service.editComment(comment);
  }
}
