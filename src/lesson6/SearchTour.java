package lesson6;

public class SearchTour {
    public static void printToursByCountry(String country, String[][] tours) {

        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + " , " + tours[1][2] + " , " + tours[1][3] + " , " + tours[1][4] + " , " + tours[1][5]+ " , " + tours[1][6]);
            }
        }

    }


    public static void printToursByPriceFrom(String priceFrom, String[][] tours) {
        int priceFromNum = Integer.parseInt(priceFrom);
        for (int i = 0; i < tours.length; i++) {
            int priceTour = Integer.parseInt(tours[i][1]);
            if (priceTour < priceFromNum) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + " , " + tours[1][2] + " , " + tours[1][3] + " , " + tours[1][4]+ " , " + tours[1][5]+ " , " + tours[1][6]);
            }
        }

    }

    public static void printToursByDays(String daysFrom, String[][] tours) {
        int daysFromNum = Integer.parseInt(daysFrom);
        for (int i = 0; i < tours.length; i++) {
            int daysNum = Integer.parseInt(tours[i][2]);
            if (daysNum > daysFromNum ) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + " , " + tours[1][2] + " , " + tours[1][3] + " , " + tours[1][4]+ " , " + tours[1][5]+ " , " + tours[1][6]);
            }

        }
    }


    public static void printTypeTours(String typeTours, String[][] tours){
        for (int i = 0; i < tours.length; i++) {
            if (typeTours.equalsIgnoreCase(tours[i][6])) {
                System.out.println(tours[i][0] + ", цена - " + tours[i][1] + " , " + tours[1][2] + " , " + tours[1][3] + " , " + tours[1][4]+ " , " + tours[1][5]+ " , " + tours[1][6]);
            }
        }

    }

}


