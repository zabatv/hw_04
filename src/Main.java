public class Main {
    public static void main(String[] args) {


        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        System.out.println("Задание 1");
        var balance = 0;
        var moth = 0;
        while (balance <= 2459000) {
            moth += 1;
            balance += 15000;
        }
        System.out.println("Месяц " + moth + ",сумма накоплений равна " + balance);


        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        //
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for
        System.out.println("Задание 2");


        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int b = 10; b > 0; b--) {

            System.out.print(b + " ");
        }
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        System.out.println("Задание 3");
        var Year = 12000000 / 1000;
        var human1 = 0;
        var human2 = 0;


        System.out.println(Year);
        for (int i = 0; i < Year; i++) {
        human1 += 17;
        human2 += 8;
        }
        var summ = human1 - human2;
        System.out.println("Год "+ Year + " численность населения составляет " + summ);





    }
}

