
public class RZhaolib {


    /** All System.out.println() were added after creating the methods, with the exception of multiplicationTable method.
     * They were added to automatically display the results when calling the method in testFile.
     */


    /** Created isPalindrome by reversing the input string, and initially I tried to return false by checking
     * to see if each character of the created string was the same as the input string.
     * Later settled for .equals to return true or false, much simpler.
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

    /** tested foobarbaz and realized that it wasnt printing out the last number.
     *  Changed the condition from i<num1 to i<=num1
     *  Issues also arose because the first if under the for loop I put %% instead of &&
     *  Wasn't able to spot it for a long amount of time.
     *  Using these if statements under a for loop, it checks to see whether the numbers are remainders of either
     *  3, 5, or both and then prints out foo, bar, and baz, respectively.
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

    /** First I determined that I needed to set a variable to determine the length of the substring.
     *  Another variable would be used to determine where the substring was located.
     *  After that, if the substring didn't show up it would just return the mainstring. If the index was 0, it would
     *  return the main string from 0 + the length of the substring. If it was past 0, the code would return the
     *  main string from 0 to the index, then add another substring from index + length to the end of the string.
     */
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

    /** This one I just used a for loop to keep adding on to the created variable intsum using increasing value p,
     * until p is equal to the number.
     */
    public static int sumUpTo(int num) {
        int intsum = 0;
        for (int p = 0; p <= num; p++) {
            intsum += p;
        }
        System.out.println(intsum);
        return intsum;
    }

    /** This was the last method created. Knowing that System.out.println() in the for loop would print out the numbers
     * in a straight line after testing, I edited the characters inside the parentheses of println() until I had something
     * that resembled a table. After that, I added System.out.println before the for loop to make it look more like a table.
     */
    public static void multiplicationTable(int base, int range){
        System.out.println("    " + base);
        System.out.println("    _");
        for (int i = 0; i <= range; i++){
            System.out.println(i + " | " + base*i);
        }
    }

    /** This prints out a snail. I made it while procrastinating, and thought you might like it.
     * The snail is a throwback to my middle school days, back when I used to doodle snails on the desk in social studies.
     * I didn't know how to get the \ alone, it would come up with an illegal escape character in string literal.
     * Also didn't know that the \\ only showed the first one, but I but by the time I finished I didn't want to change it anymore.
     */
    public static int drawSnail(int num){
        if (num==1){
            System.out.println("         ___________                 ");
            System.out.println("       //           \\               ");
            System.out.println("      ||   _-----_   ||  - __ -      ");
            System.out.println("      ||  ||  --     || _|    |      ");
            System.out.println("       \\_ \\__/___-//  /       /    ");
            System.out.println("       /__________________  /        ");
        }
        return 5;
    }
}

