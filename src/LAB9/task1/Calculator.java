package LAB9.task1;

public class Calculator { public int add(int a, int b) {
    return a + b;
}


    public double add(double a, double b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Сума двох цілих чисел: " + calc.add(3, 5));
        System.out.println("Сума двох дробових чисел: " + calc.add(2.5, 4.3));
        System.out.println("Сума трьох цілих чисел: " + calc.add(1, 2, 3));
    }
}

