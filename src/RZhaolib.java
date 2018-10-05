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



public static void fooBarBaz(int num1) {
    String f = "foo";
    String br = "bar";
    String ber = "baz";
    for (int i = 0; i < num1; i++) {
        if (i % 3 == 0 && i % 5 != 0) {
            System.out.println(f);
        }
        if (i%3!=0 %% i%5==0){
            System.out.println(br);
        }
        if (i%3==0 && i%5==0){
            System.out.println(ber)
        }
        else
        {
            System.out.println(i);
        }

    }
}

public static String cutOut(String mainstr, String substr){
        int cutlen = substr.length();
    int indexOf(substr);
    }
}

public static int sumUpTo(int num2){
    int intsum = 0;
    for (int p = 0; p <= num2; p++){
        intsum += p;
    }
    return intsum;
}