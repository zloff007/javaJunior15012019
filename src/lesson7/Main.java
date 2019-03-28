package lesson7;

public class Main {

//    public static void main(String[] args) {
//        String text = " Текст";
//        text = text + " - Hello";
//       System.out.println(text);
//
//    }

    public static void main(String[] args) {

        String text = "Текст how are you";
        text =  text.replace(" ", "-");
        text = text.replace("o","O");
        System.out.println(text);

       char charAt2 = text.charAt(2);
        System.out.println(charAt2);

        char[] charFromText = text.toCharArray();


    }
}
