package LAB6.task3;

public class Animal {private String name;
    private String sound;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

    public void makeSound(){
        System.out.println(name + " makes sound: " + sound);
    }
}
