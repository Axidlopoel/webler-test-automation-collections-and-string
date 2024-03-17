package hu.webler.string;

public class StringExample {

    public static void main(String[] args) {

        String text = "Hello, World!";

        // hosszát megszámolja
        int length = text.length();
        System.out.println("Szöveg hossza: " + length);

        // karaktert kikérünk adott indexről
        char letter = text.charAt(7);
        System.out.println("Karakter a hetedik indexen: " + letter);

        // ügyes a programozó :)
        int element = letter - 1;
        System.out.println("Ezen a helyen állok a szövegben: " + element); // eredmény 86 ...

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if ('W' == text.charAt(i)) {
                index = i;
            }
        }
        element = index - 1;

        System.out.println(element);

        String subString = text.substring(7, 12);
        System.out.println(subString);

        int firstIndex = text.indexOf("o");
        System.out.println(firstIndex);
        int lastIndex = text.lastIndexOf("l");
        System.out.println(lastIndex);
    }
}