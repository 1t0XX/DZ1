//Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;//

public class Metod2 {
    public static void main(String[] args) {

        System.out.println(CheckSumNumb(5, 6));
        System.out.println(CheckSumNumb(10, 11));
    }

   private static boolean CheckSumNumb(int  a, int b) {
            return (a+ b)>= 10 && (a+b) <= 20;

    }



}
