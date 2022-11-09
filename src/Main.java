public class Main {
    public static void main(String[] args) {
        // Задание 8
        System.out.println("Задание 8");
        var totalHours = 640;
        var hoursPerDay = 8;
        var totalEmloyees = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalHours / hoursPerDay + " человек");
        totalEmloyees = totalEmloyees + 94;
        var totalWorkingHours = totalEmloyees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmloyees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");


    }
}