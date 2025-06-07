package LAB12.task4;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo() {
        return "Magazine: " + title + ", Issue #" + issueNumber + " (" + year + ")";
    }
}
