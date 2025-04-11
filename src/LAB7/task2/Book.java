package LAB7.task2;

public class Book {private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        if(price < 0){
            System.out.println("Price cannot be negative");
            return;
        }else
            this.price = price;
    }


    public void displayInfo(){
        System.out.printf("Title: %s, Author: %s, Price: %d\n", title, author, price);
    }
}
