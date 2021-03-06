package chapter6;

public class UtilityStatic {
    public static char getThirdChar(String str) {
        return str.charAt(2);
    }
    

    public static String getLastThreeCharString(String str) {
        return str.substring(str.length() - 3);
    }

    public static int stringLength(String str) {
        return str.length();
    }

    public static String getFirstTwoCharConcat(String str1, String str2) {
        return str1.substring(0, 2) + str2.substring(0, 2);
    }

    public static String getMiddleOfString(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String getLongOrShort(String name) {
        if (name.length() < 6)
            return "short";
        else return "long";
    }

    public static boolean isStartingWithIM(String str) {
        if (str.substring(0, 2).equalsIgnoreCase("im"))
            return true;
        else
            return false;
    }

    public static boolean isEndingWithING(String str) {
        str = str.toLowerCase();
        if (str.substring(str.length() - 3).equals("ing"))
            return true;
        else return false;
    }

    public static char getOddEvenChar(String str) {
        if (str.length() % 2 == 0)
            return 'e';
        else return 'o';
    }

    public static int getNumForString(String str) {
        if (str.equals("one"))
            return 1;
        else if (str.equals("two"))
            return 2;
        else if (str.equals("three"))
            return 3;
        else return -1;
    }

    public static int getAbsValue(int num) {
        return Math.abs(num);
    }

    public static String getRicksMessage(String msg) {
        if (msg.equals("say goodbye") || msg.equals("let you down") || msg.equals("desert you"))
            return "never gonna";
        else return "always gonna";
    }

    public static String getSparta(int num) {
        if (num == 300)
            return "Sparta!";
        else return "Persia!";
    }

    public static int getYourWeightPriceInGold(int pounds) {

        //1800 dollars per ounce
        //1 pound is 16 ounce

        int ounce = pounds * 16;
        int price = ounce * 1800;

        return price;
    }

    public static double getMoneyForProf(int hours) {
        //300 dollars per hour
        //over time ...  above 8 hours.  300 * 1.5 per hour

        if (hours > 8) {
            return 300 * 8 + (300 * 1.5) * (hours - 8);
        } else return 300 * hours;
    }

    public static int getSum(int N) {
        int sum = 0;
        int number = 0;
        while (number <= N) {
            sum += number;
            number++;
        }
        return sum;
    }

    public static int getSumOfSquares(int N) {

        int number = 1;
        int sum = 0;
        while (number <= N) {
            sum += (Math.pow(number, 2));
            number++;
        }
        return sum;
    }


    public static int getSumOfOdds(int N) {
        int sum = 0;
        int number = 1;
        while (number <= N) {
            if (number % 2 != 0) {
                sum += number;
            }

            number++;
        }

        return sum;
    }

    public static String getShoutingString(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += 'a';
        }
        return str + result;
    }

    public static String getRepeatingString(String str, int num) {

        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }

    public static int getTwoToThePowerOf(int N) {
        int result = 1;
        for (int i = 0; i < N; i++) {
            result *= 2;
        }
        return result;
    }

    public static int getNumberOfAs(String str) {

        int i = 0;
        int count = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a')
                count++;


            i++;
        }
        return count;
    }

    public static String getRidOfOddIndexChar(String str) {
        int i = 0;
        String result = "";

        while (i < str.length()) {

            if (i % 2 == 0) {
                result += str.charAt(i);
            }

            i++;
        }
        return result;
    }

    public static String getReverseString( String str)  {


        String result = "";
        int i = 1;
        while(i <= str.length())
        {
            result += str.charAt(str.length()-i);;
            i++;
        }
        return result;
    }
    public static String getRepeatingChar( char myChar, int num) {
        String result = "";
        for(int i = 0; i < num; i++)
        {
            result += myChar;
        }
        return result;
    }


}