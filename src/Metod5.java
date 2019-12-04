//Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;//
public class Metod5 {
    public static void main(String[] args) {
        SayHello("GB");

    }

    private static void SayHello(String name){

        System.out.println("Привет," + name);
    }

}
