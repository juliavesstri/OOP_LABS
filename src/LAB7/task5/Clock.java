package LAB7.task5;

public class Clock {private int hours;
    private int minutees;
    private int seconds;

    public Clock(int hours, int minutees, int seconds){
        this.hours = hours;
        this.minutees = minutees;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours){
        if (hours >= 0 && hours < 24){
            this.hours = hours;
        }else {
            System.out.println("Hours must be between 0 and 23");
        }
    }

    public int getMinutees() {
        return minutees;
    }

    public void setMinutees(int minutees) {
        if (minutees >=0 && minutees < 60){
            this.minutees = minutees;
        }else {
            System.out.println("Minutees must be between 0 and 59");
        }
    }

    public int getSeconds(){
        return seconds;
    }

    public void setSeconds(int seconds){
        if (seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }else {
            System.out.println("Seconds must be between 0 and 59");
        }
    }

    public void displayTime(){
        System.out.printf("%02d:%02d:%02d\n", hours, minutees, seconds);
    }

    public void tick(){
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutees++;
            if (minutees == 60){
                minutees = 0;
                hours++;
                if (hours ==  24){
                    hours = 0;
                }
            }
        }
    }
}
