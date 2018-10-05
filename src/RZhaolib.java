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
    String foo = "foo";
    String bar = "bar";
    String ber = "baz";
    for (int i = 0; i < num1; i++) {
        if (i % 3 == 0 && i % 5 != 0) {
            System.out.println(foo);
        }
        if (i%3!=0 %% i%5==0){
            System.out.println(bar);
        }
        if (i%3==0 && i%5==0){
            System.out.println(ber);
        }
        else
        {
            System.out.println(i);
        }

    }
}

public static String cutOut(String mainstr, String substr){
        int length = substr.length();
        int place = mainstr.indexOf(substr);
        if (place == -1){
            return mainstr;
        }
        else{
            if(place == 0){
                return (mainstr.substring(length));
                else {
                    return mainstr.substring(0, place) + mainstr.substring(place+substr.length()-1, mainstr.length());
                }
            }
        }

    }


public static int sumUpTo(int num2){
    int intsum = 0;
    for (int p = 0; p <= num2; p++){
        intsum += p;
    }
    return intsum;
}