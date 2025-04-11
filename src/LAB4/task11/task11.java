package LAB4.task11;

public class task11 {public static void main(String[] args) {
    int max1 = findMax(1, 15, 22, 0, 3, 66, 4);
    int max2 = findMax(0, 4, 2, 17, 100, 34);
    int max3 = findMax(13, 8, 44, 7, 1, 18);
    System.out.println("First maximum is: " + max1);
    System.out.println("Second maximum is: " + max2);
    System.out.println("Third maximum is: " + max3);
}
    public static int findMax(int... numbers){
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
