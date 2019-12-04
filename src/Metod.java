public class Metod {
    //Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода//

    public static void main(String[] args) {

        double Metod = getMetod(5, 3, 6, 4);

        System.out.println("Результат метода равен = " + Metod);
    }

    static double getMetod(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

}


