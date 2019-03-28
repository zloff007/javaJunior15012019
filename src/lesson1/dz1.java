
package lesson1;

public class dz1 {
    public dz1() {
    }

    public static void main(String[] args) {
        int boxHeight = 8;
        int boxWidth = 7;
        int boxLong = 5;
        int boxvolum = boxHeight * boxWidth * boxLong;
        int cubeSide = 3;
        int cubeVolum = cubeSide * cubeSide * cubeSide;
        int howMuchCube = boxvolum / cubeVolum;
        System.out.println(howMuchCube);


        int siteTriangle1 = 3;
        int siteTriangle2 = 4;
        int siteTriangle3 = 5;

        int semipermeterTriangle = (siteTriangle1 + siteTriangle2 + siteTriangle3) / 2;

        double squareTriangle = Math.sqrt(semipermeterTriangle * (semipermeterTriangle - siteTriangle1) * (semipermeterTriangle - siteTriangle2) * (semipermeterTriangle - siteTriangle3));

        System.out.println(semipermeterTriangle);
    }
}