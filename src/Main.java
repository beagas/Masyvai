import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("<1 uždavinys>");
//        Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29), kurių reikšmės
//        yra atsitiktiniai skaičiai nuo 5 iki 25. Atsispausdinate, pasižiūrite ką gavote.

        int min = 5;
        int max = 25;

//        String[] number = new String[30];//
//        for (int i = 0; i < number.length; i++) {
//            number[i] = String.valueOf(min + Math.round((Math.random() * (max - min))));
//            System.out.println("number [" + i + "] " + number[i]);
//        }

        System.out.println("<2.a uždavinys>");
//Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;

//        int riba10 = 10;
//        int didesniNei10 = 0;
//        int[] number = new int[30];//
//        for (int i = 0; i < number.length; i++) {
//            number[i] = (int) (min + Math.round((Math.random() * (max - min))));
//            if (number[i] > riba10) {
//                didesniNei10++;
//            }
//        }
//        System.out.println("Numbers bigger than 10: " + didesniNei10);

        System.out.println("<2.b uždavinys>");
//Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.

        int riba10 = 10;
        int didesniNei10 = 0;
        int[] number = new int[30];//
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (min + Math.round((Math.random() * (max - min))));
            System.out.println(number[i]);
            if (number[i] > 5) {
                didesniNei10++;
            }

            Arrays.sort(number);
                }
        System.out.println(number[i]);
        }

System.out.println("<2.b uždavinys>");
















    }
}