import package1.TicTac;
import package2.Days;
import package2.Numbers;

public class Exercisee {
    public static void main(String[] args) {
        System.out.println("Welcome to my first exercise");
        Numbers numbers = new Numbers();
        TicTac ticTac = new TicTac();
        ticTac.printString("fist string", "second string");
        Days days = new Days();
        System.out.println(days.weekDays.length);
        System.out.println(days.weekDays[3]);
        System.out.println(numbers.arrayOfInt[2]);
        System.out.println(ticTac.ticTacGame[2][2]);
    }
}
