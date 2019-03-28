package lesson4;

public class MahFunction<vklad> {

    // модификатор доступа (4 вида)
    // статичность static - принадлежность классу, пусто - принадлежность к обьекту
    // возвращаемый тип: void - если ничего не возращает, тип - если возвращает
    // название метода (придумываем)

    public static int summaTrexChisel(int a, int b, int c){
        int summa = a + b + c;
        return summa;


    }

    public static double summaVklad(double vklad, double procent, double year) {
        double summaVklad = (vklad + (vklad / 100 * procent)) * year;
        return summaVklad;
    }

    public static double squareTriangle(double siteTriangle1, double siteTriangle2, double siteTriangle3){
        double semipermeterTriangle = (siteTriangle1 + siteTriangle2 + siteTriangle3) / 2;
        double squareTriangle = Math.sqrt(semipermeterTriangle * (semipermeterTriangle - siteTriangle1) * (semipermeterTriangle - siteTriangle2) * (semipermeterTriangle - siteTriangle3));
        return squareTriangle;
    }
}




