

public class printEvenOddIndexes {
    public static void main(String[] strings) {
        for (String word : strings) {

            for (int i = 0; i < word.length(); i += 2) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" even index");

            for (int i = 1; i < word.length(); i += 2) {
                System.out.print(word.charAt(i));
            }

            System.out.println();
        }
    }
    }
