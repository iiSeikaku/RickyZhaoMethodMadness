
public class RZhaolib {


    /** All System.out.println() were added after creating the methods, with the exception of multiplicationTable method.
     * They were added to automatically display the results when calling the method in testFile.
     */


    /**
     * Checks to see if a word is the same in reverse.
     *
     * @param word This input is reversed using another string, and then compared to see if they are the same.
     * @return Returns true if the reversed string is equal to the input.
     */
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

    /**
     * Replaces multiples of 3 by foo, 5 by bar, both 3 and 5 by baz, all the way to the input.
     *
     * @param num1 All numbers from 1 to this input are checked, and replaced necessary.
     */
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

    /**
     * Cuts out a word the first time it appears in a main string.
     *
     * @param mainstr Main string from which the word is cut.
     * @param substr  The word that is cut from the main string.
     * @return The main string without the substring the first time it appears.
     */
    public static String cutOut(String mainstr, String substr) {
        int cutlen = substr.length();
        int place = mainstr.indexOf(substr);
        if (place < 0) {
            System.out.println(mainstr);
            return mainstr;
        } else {
            if (place == 0) {
                System.out.println(mainstr.substring(place + cutlen));
                return mainstr.substring(place + cutlen);
            } else {
                System.out.println(mainstr.substring(0, place) + mainstr.substring(place + cutlen));
                return mainstr.substring(0, place) + mainstr.substring(place + cutlen);
            }
        }
    }

    /**
     * Adds all integers from 0 to the input together.
     *
     * @param num The amount of numbers added, and the greatest number that is added.
     * @return All the numbers from 0 to input added together.
     */
    public static int sumUpTo(int num) {
        int intsum = 0;
        for (int p = 0; p <= num; p++) {
            intsum += p;
        }
        System.out.println(intsum);
        return intsum;
    }

    /**
     * Multiplies the base with a range of numbers to create a multiplication table for that base.
     *
     * @param base  The number that is multiplied with the others.
     * @param range The numbers starting from 0 that are multiplied with the base.
     */
    public static void multiplicationTable(int base, int range) {
        System.out.println("    " + base);
        System.out.println("    _");
        for (int i = 0; i <= range; i++) {
            System.out.println(i + " | " + base * i);
        }
    }

}

