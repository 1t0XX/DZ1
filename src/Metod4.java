//Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;//

public class Metod4 {

    public static void main(String[] args) {
        System.out.println(isNegative(-19));
    }

    public static boolean isNegative(int a) {
        return (a < 0);
    }
}
