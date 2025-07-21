package model;

public class Comment {
    private String author;
    private String text;

    public Comment(String author, String comment) {
        this.author = author;
        this.text = comment;
    }

    public String getAuthor() { return author; }

    public String getText() { return text; }

    public void setAuthor(String author) { this.author = author; }

    public void setText(String text) { this.text = text; }
}
