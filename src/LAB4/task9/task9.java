package LAB4.task9;

public class task9 {public static void main(String[] args) {
    int sumV1 = sum(4, 8, 11);
    int sumV2 = sum(13, 57, 22, 1, 54, 16);
    int sumV3 = sum(1, 2);
    System.out.println("First sum is: " + sumV1);
    System.out.println("Second sum is: " + sumV2);
    System.out.println("Third sum is: " + sumV3);
}
    public static int sum(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
