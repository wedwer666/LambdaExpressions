public class CharAtEvenIndex {

    private static void printEvenOddIndices(String[] words){
        for(String word : words){
            boolean even = true;
            StringBuilder oddChars = new StringBuilder();
            for(char c : word.toCharArray()){
                if(even){
                    System.out.print(c);
                }
                even = !even;
            }
            System.out.println(" " + oddChars);
        }
    }
    public static void main(String[] args) {
        printEvenOddIndices(new String[]{"Maria", "has", "an", "apple"});
    }

}
