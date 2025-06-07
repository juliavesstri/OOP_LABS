package LAB12.task4;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean available;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.available = true;
    }

    public void borrowItem() {
        available = false;
    }

    public void returnItem() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public abstract String getInfo();
}

