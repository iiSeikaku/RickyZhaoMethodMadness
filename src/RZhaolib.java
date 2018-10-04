public class RZhaolib {
    public static boolean isPalindrome(String word) {
        String testpalin = "";
        for (int x = word.length(); x > 0; x--) {
            testpalin += word.charAt(x-1);
        }
        if (testpalin.equals(word)) {
            return true;
        }
        else {
            return false;
        }
    }
}


public static void fooBarBaz(int num1){
    String f="foo";
    String br = "bar";
    String bz = "baz";
    for (int i=0; i < num1; i++){
        if (i%3==0 && i%5!=0)
            System.out.println(f);
        else {
            if (i%5=0 && i%3!=0)
        }
    }
}
