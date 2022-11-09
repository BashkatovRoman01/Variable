public class Main {
    public static void main(String[] args) {
        // Задание 7
        System.out.println("Задание 7");
        var boxer1   = 78.2;
        System.out.println(boxer1);
        var boxer2   = 82.7;
        System.out.println(boxer2);
        var totalWeigt = boxer1 + boxer2;
        System.out.println(totalWeigt);
        var weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);
        var weightDifference1 = (boxer2 - boxer1) % totalWeigt;
        System.out.println(weightDifference1);
    }
}