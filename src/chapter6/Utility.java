package chapter6;

public class Utility {
    public char getThirdChar(String str) {
        return str.charAt(2);
    }
    

    public String getLastThreeCharString(String str) {
        return str.substring(str.length() - 3);
    }

    public int stringLength(String str) {
        return str.length();
    }

    public String getFirstTwoCharConcat(String str1, String str2) {
        return str1.substring(0, 2) + str2.substring(0, 2);
    }

    public String getMiddleOfString(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String getLongOrShort(String name) {
        if (name.length() < 6)
            return "short";
        else return "long";
    }

    public boolean isStartingWithIM(String str) {
        if (str.substring(0, 2).equalsIgnoreCase("im"))
            return true;
        else
            return false;
    }

    public boolean isEndingWithING(String str) {
        str = str.toLowerCase();
        if (str.substring(str.length() - 3).equals("ing"))
            return true;
        else return false;
    }

    public char getOddEvenChar(String str) {
        if (str.length() % 2 == 0)
            return 'e';
        else return 'o';
    }

    public int getNumForString(String str) {
        if (str.equals("one"))
            return 1;
        else if (str.equals("two"))
            return 2;
        else if (str.equals("three"))
            return 3;
        else return -1;
    }

    public int getAbsValue(int num) {
        return Math.abs(num);
    }

    public String getRicksMessage(String msg) {
        if (msg.equals("say goodbye") || msg.equals("let you down") || msg.equals("desert you"))
            return "never gonna";
        else return "always gonna";
    }

    public String getSparta(int num) {
        if (num == 300)
            return "Sparta!";
        else return "Persia!";
    }

    public int getYourWeightPriceInGold(int pounds) {

        //1800 dollars per ounce
        //1 pound is 16 ounce

        int ounce = pounds * 16;
        int price = ounce * 1800;

        return price;
    }

    public double getMoneyForProf(int hours) {
        //300 dollars per hour
        //over time ...  above 8 hours.  300 * 1.5 per hour

        if (hours > 8) {
            return 300 * 8 + (300 * 1.5) * (hours - 8);
        } else return 300 * hours;
    }

    public int getSum(int N) {
        int sum = 0;
        int number = 0;
        while (number <= N) {
            sum += number;
            number++;
        }
        return sum;
    }

    public int getSumOfSquares(int N) {

        int number = 1;
        int sum = 0;
        while (number <= N) {
            sum += (Math.pow(number, 2));
            number++;
        }
        return sum;
    }


    public int getSumOfOdds(int N) {
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

    public String getShoutingString(String str, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += 'a';
        }
        return str + result;
    }

    public String getRepeatingString(String str, int num) {

        String result = "";
        for (int i = 0; i < num; i++) {
            result += str;
        }
        return result;
    }

    public int getTwoToThePowerOf(int N) {
        int result = 1;
        for (int i = 0; i < N; i++) {
            result *= 2;
        }
        return result;
    }

    public int getNumberOfAs(String str) {

        int i = 0;
        int count = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a')
                count++;


            i++;
        }
        return count;
    }

    public String getRidOfOddIndexChar(String str) {
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

    public String getReverseString( String str)  {


        String result = "";
        int i = 1;
        while(i <= str.length())
        {
            result += str.charAt(str.length()-i);;
            i++;
        }
        return result;
    }
    public String getRepeatingChar( char myChar, int num) {
        String result = "";
        for(int i = 0; i < num; i++)
        {
            result += myChar;
        }
        return result;
    }


}