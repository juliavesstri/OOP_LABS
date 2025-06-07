package LAB12.task4;

public class DVD extends LibraryItem {
    private int duration; // in minutes

    public DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return "DVD: " + title + " (" + year + "), Duration: " + duration + " mins";
    }
}

