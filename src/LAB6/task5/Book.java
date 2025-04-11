package LAB6.task5;

public class Book { private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title){
        this.title = title;
        this.author = "Unknown";
    }

    public void printInfo(){
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
