import javax.sound.midi.Soundbank;
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
//
        int[] firstList = new int[30];
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = (int)(min + Math.round((Math.random() * (max - min))));
            System.out.println("firstList [" + i + "] " + firstList[i]);
        }

        System.out.println("<2.a uždavinys>");
//Suskaičiuokite kiek masyve yra reikšmių didesnių už 10;

        int riba10 = 10;
        int didesniNei10 = 0;
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = (int) (min + Math.round((Math.random() * (max - min))));
            if (firstList[i] > riba10) {
                didesniNei10++;
            }
        }
        System.out.println("Numbers bigger than 10: " + didesniNei10);

        System.out.println("<2.b uždavinys>");
//Raskite didžiausią masyvo reikšmę ir jos indeksą arba indeksus jeigu yra keli ir atspausdinkite.

        int didziausiasIndeksas = 0;
        boolean first = true;
        for (int t = 0; t < firstList.length; t++) {
            System.out.println(firstList[t]);
            if (firstList[t] > didziausiasIndeksas) {
                didziausiasIndeksas = firstList[t];
            }
            if (firstList[t] < didziausiasIndeksas) {
                continue;
            }
        }
        System.out.println("didziausias indeksas yra: " + didziausiasIndeksas);


//System.out.println("<2.c uždavinys>");
//Suskaičiuokite visų porinių (lyginių) indeksų reikšmių sumą;

        int lyginiuSuma = 0;
        for (int i = 0; i < firstList.length;i += 2) {
            firstList[i] = (int) (min + Math.round((Math.random() * (max - min))));
            System.out.println("firstList [" + i + "] " + firstList[i]);
            lyginiuSuma += firstList[i];
        }
        System.out.println("visu lyginiu indeksu suma: " + lyginiuSuma);

        System.out.println("<2.d uždavinys>");
//Sukurkite naują masyvą, kurio reikšmės yra 1 uždavinio masyvo reikšmes minus tos reikšmės indeksas; PVZ -
//Indeksai   0, 1, 2, 3
//Reiksmes 1, 17, 40, 3
//Rezultatas 1, 16, 38, 0
//
        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = (int)(min + Math.round((Math.random() * (max - min))));
            System.out.println("firstList [" + i + "] " + firstList[i] + " naujas " + (firstList[i] - i));
        }

        System.out.println("<2.e uždavinys>");
//        Papildykite masyvą papildomais 10 elementų su reikšmėmis nuo 5 iki 25,
//        kad bendras masyvas padidėtų iki indekso 39; (tam reikės sukurti naują masyvą,
//        ir baigus jį pildyti priskirti pirmojo kintamąjam)

        for (int i = 0; i < firstList.length; i++) {
            firstList[i] = (int) (min + Math.round((Math.random() * (max - min))));
//            System.out.println(firstList [i]);
        }

        int[] secondList = new int[10];
        for (int p = 0; p < secondList.length; p++) {
            secondList[p] = (int)(min + Math.round((Math.random() * (max - min))));
//            System.out.println(secondList[p]);
        }

        int bendrasIlgis = firstList.length + secondList.length;
        int[]fullList = new int [bendrasIlgis];

        System.arraycopy(firstList, 0, fullList, 0, firstList.length);
        System.arraycopy(secondList, 0, fullList, firstList.length, secondList.length);
        System.out.println(Arrays.toString(fullList));

        System.out.println("<2.f uždavinys>");
// Iš masyvo elementų sukurkite du naujus masyvus.
// Vienas turi būti sudarytas iš neporinių indekso reikšmių, o kitas iš porinių;

        int[] even = Arrays.stream(fullList).filter(x -> x % 2 == 0).sorted().toArray();
        int[] odd = Arrays.stream(fullList).filter(x -> x % 2 != 0).sorted().toArray();

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        System.out.println("<2.g uždavinys>");
////      Pirminio masyvo elementus su poriniais (lyginiais) indeksais
////      padarykite lygius 0 jeigu jie didesni už 15;
//
        for (int g = 0; g < firstList.length; g++) {
            firstList[g] = (int)(min + Math.round((Math.random() * (max - min))));
            System.out.println("firstList [" + g + "] " + firstList[g]);
            if ((firstList [g])%2==0 && (firstList [g])>15){
                firstList [g] = 0;
            }
        }
        System.out.println(Arrays.toString(firstList));

        System.out.println("<2.h uždavinys>");
//        Suraskite pirmą (mažiausią) indeksą, kurio elemento reikšmė didesnė už 10

        didesniNei10 = 0;
        for (int t = 0; t < firstList.length; t++) {
            if (firstList[t] > 10) {
                break;
            }
            System.out.println("Pirmas elementas didesne reiksme" + didesniNei10);
        }










    }
}