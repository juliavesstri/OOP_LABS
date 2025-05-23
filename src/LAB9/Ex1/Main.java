package LAB9.Ex1;

public class Main  public static void main(String[] args) {
    Box<Integer> box1= new Box<>();
    box1.setItem(6);
    System.out.println(box1.getItem());

    Box<String> box2 = new Box<>();
    box2.setItem("La-la-la-la");
    System.out.println(box2.getItem());
}
