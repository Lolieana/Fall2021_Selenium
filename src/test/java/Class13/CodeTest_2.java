package Class13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest_2 {
        public static void main(String[] args) {

            // Question 1
            int [] testNums = {32, 54, 12, 67, 2, 5};
            System.out.println("Question 1 with input 1 = " + maxvalue(testNums));
            int [] testNums_2 = {5, 4, 3, 1, 2};
            System.out.println("Question 1 with input 2 = " + maxvalue(testNums_2));
            int [] testNums_3 = {90, 34, 12, 4};
            System.out.println("Question 1 with input 3 = " + maxvalue(testNums_3));
            int [] testNums_4 = {-15, -4, -12, -7};
            System.out.println("Question 1 with input 4 = " + maxvalue(testNums_4));

            // Question 2
            System.out.println("Question 2 with input 1 = " + calcFactorial(5));
            System.out.println("Question 2 with input 2 = " + calcFactorial(1));
            System.out.println("Question 2 with input 3 = " + calcFactorial(3));
            System.out.println("Question 2 with input 4 = " + calcFactorial(10));

            // Question 3
            String[] testWords1 = {"happY", "king", "peace", "living standard"};
            String[] testWords2 = {"king kong", "Happy", "PEACE"};
            String[] commonWords1 = getCommonValues(testWords1, testWords2);
            System.out.println("\nQuestion 3 - Test 1: " + Arrays.toString(commonWords1));

            String[] testWords3 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
            String[] testWords4 = {"abcde", "jhuy", "plot", "koli"};
            String[] commonWords2 = getCommonValues(testWords3, testWords4);
            System.out.println("Question 3 - Test 2: " + Arrays.toString(commonWords2));

            // Question 4
            int[] arrayGiven = {3, 5, 1, 4, 2, 7};
            System.out.println("Question 4 Input 1 = " + missingNum(arrayGiven));
            int[] arrayGiven_2 = {2, 5, -1, 0, 6};
            System.out.println("Question 4 Input 2 = " + missingNum(arrayGiven_2));
            int[] arrayGiven_3 = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};
            System.out.println("Question 4 Input 3 = " + missingNum(arrayGiven_3));
            int[] arrayGiven_4 = {-2, -5, -1, -10, -6};
            System.out.println("Question 4 Input 4 = " + missingNum(arrayGiven_4));






        }


    /**
     * Ques-1:
     * Create a method to return a max value from an input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned value -> 67
     *
     * input -> [5, 4, 3, 1, 2]
     * returned value -> 5
     *
     * input -> [90, 34, 12, 4]
     * returned value -> 90
     *
     * input -> [-15, -4, -12, -7]
     * returned value -> -4
     */

    public static int maxvalue (int[] num) {
            int maxV = num[0];
            for (int i = 0; i <= num.length-1; i++) {
                    if (num[i] > maxV ) {
                            maxV = num [i];
                    }
            }
            return maxV;
    }



        /**
         * Ques-2:
         * Create a method to return factorial value of input-int-value
         * points: 20
         */
        /*
         *
         * eg:
         * input -> 5
         * returned value -> (5*4*3*2*1) = 120
         *
         * input -> 1
         * returned value -> (1) = 1
         *
         * input -> 3
         * returned value -> (3*2*1) = 6
         *
         * input -> 10
         * returned value -> (10*9*8*7*6*5*4*3*2*1) = 3628800
         */

        public static int calcFactorial (int num) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
                }
            return factorial;
        }




        /**
         * Ques-3:
         * Create a method to return the common Strings values in two input-String-arrays
         * points: 30
         * Note: two input-String-arrays can be of same size or different size
         */
        /*
         *
         * eg:
         * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * returned value -> [happy, peace]
         *
         * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
         * returned value -> [abcde, koli]
         *
         */


        public static String[] getCommonValues(String[] wordList1, String[] wordList2) {

            List<String> commonValues = new ArrayList<>();

            for (String word1 : wordList1) {
                for (String word2 : wordList2) {
                    if (word1.equalsIgnoreCase(word2)) {
                        commonValues.add(word1);
                    }
                }
            }

            String[] returnList = new String[commonValues.size()];
            for (int i=0; i < commonValues.size(); i++) {
                returnList[i] = commonValues.get(i);
            }

            return returnList;
        }





    /**
     * Ques-4:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * points: 40
     */
        /*
         *
         * eg:
         * 	input -> : {3, 5, 1, 4, 2, 7}
         * 	returned value : 6
         *
         * 	input -> {2, 5, -1, 0, 6}
         * 	returned value : 1
         *
         * 	input -> {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	returned value : 4
         *
         * 	input -> {-2, -5, -1, -10, -6}
         * 	returned value : 1
         *
         */

    public static int missingNum ( int[] searchList) {
        int searchNum = 1;
        boolean numFound = true;
        while (numFound) {
            boolean numInArray = false;
            for (int i = 0; i <= searchList.length - 1; i++) {
                if (searchList[i] == searchNum) {
                    numInArray = true;
                }
            }
            if (numInArray) {
                searchNum++;
            } else {
                numFound = false;
            }
        }


        return searchNum;
    }

        }
