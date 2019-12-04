// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное//
// число передачи или отрицательное (Замечание: ноль считаем положительным числом.);//

public class Metod3 {

    public static void main(String[] args) {
        System.out.println(getPositiveOrNegative(-5));
        System.out.println(getPositiveOrNegative(2));
        System.out.println(getPositiveOrNegative(0));
    }

    private static String getPositiveOrNegative(int number){
        return (number >=0) ? "Число положительное" : "Число отрицательное";
    }

}
