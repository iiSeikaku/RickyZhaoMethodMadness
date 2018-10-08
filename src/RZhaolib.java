
public class RZhaolib {
    public static boolean isPalindrome(String word) {
        String testpalin = "";
        for (int x = word.length(); x > 0; x--) {
            testpalin += word.charAt(x - 1);
        }
        if (testpalin.equals(word)) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }


    public static void fooBarBaz(int num1) {
        String f = "foo";
        String br = "bar";
        String ber = "baz";
        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(f);
            }
            if (i % 3 != 0 && i % 5 == 0) {
                System.out.println(br);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(ber);
            } else {
                System.out.println(i);
            }

        }
    }

    public static String cutOut(String mainstr, String substr) {
        int cutlen = substr.length();
        int place = mainstr.indexOf(substr);
        if (place < 0) {
            System.out.println(mainstr);
            return mainstr;
        } else {
            if (place == 0) {
                System.out.println(mainstr.substring(place+cutlen));
                return mainstr.substring(place + cutlen);
            } else {
                System.out.println(mainstr.substring(0,place)+mainstr.substring(place+cutlen));
                return mainstr.substring(0, place) + mainstr.substring(place + cutlen);
            }
        }
    }

    public static int sumUpTo(int num2) {
        int intsum = 0;
        for (int p = 0; p <= num2; p++) {
            intsum += p;
        }
        System.out.println(intsum);
        return intsum;
    }

    public static void multiplicationTable(int base, int range){
        System.out.println("    " + base);
        System.out.println("    _");
        for (int i = 0; i <= range; i++){
            System.out.println(i + " | " + base*i);
        }
    }

}

