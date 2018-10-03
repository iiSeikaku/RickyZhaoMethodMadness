public class RZhaolib {
    public static boolean isPalindrome(String word) {
        String testpalin = "";
        for (int x = word.length(); x > 0; x--) {
            testpalin += word.charAt(x) + testpalin;
        }
        testpalin.equals(word);
    }
}


