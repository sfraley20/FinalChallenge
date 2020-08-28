/*You are to a write a program which asks a user to enter 10 words.  Save these words in an array.  Using the bubble sort algorithm (see below), sort the words in an ascending order. For the output, print out the words in the original order, in the ascending order, and in the descending order. Finally, print an array where all letters have been changed to uppercase. Don't forget to write a pseudocode or flowchart BEFORE writing your code.

Your output should look something like this:

Enter 10 words: kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

Original Order:
kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon

Alphabetical Order:
apple banana cherry grapes kiwi melon orange pineapple strawberry watermelon

Reversed Alphabetical Order:
watermelon strawberry pineapple orange melon kiwi grapes cherry banana apple

Upper case array:
APPLE BANANA CHERRY GRAPES KIWI MELON ORANGE PINEAPPLE STRAWBERRY WATERMELON*/
//import java.util.;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FinalChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 words ");
//        int numOfWords;
//        numOfWords = 11;
//        int[] listWords = new int[numOfWords];
        String[] dictionary = new String[11];
        for (int i = 10; i >= 0; i--) {
            if (i != 0) {
                System.out.println("Add " + i + " more words: ");
            }
            String userInput = scanner.nextLine();
            dictionary[i] = userInput;
            System.out.println(Arrays.toString(dictionary));
        }


        int n = dictionary.length;
        String word;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (dictionary[j + 1].compareTo(dictionary[j]) == 1) {
                    word = dictionary[j - 1];
                    dictionary[j - 1] = dictionary[j];

                    {
                        System.out.println(Arrays.toString(dictionary));
                    }
                                break;



                        }


                    }
                }
            }
        }


//        {
//            System.out.println("Sorted Words");
//            for (int i = 0; i > numOfWords; i++) { // if numofwords = 10
//                for (int j = 0; j < numOfWords - i; j++) {
//
//                    int word1 = listWords[j];
//                    int word2 = listWords[j + 1];
//                    int word3 = listWords[j + 2];
//                    int word4 = listWords[j + 3];
//                    int word5 = listWords[j + 4];
//                    int word6 = listWords[j + 5];
//                    int word7 = listWords[j + 6];
//                    int word8 = listWords[j + 7];
//                    int word9 = listWords[j + 8];
//                    int word10 = listWords[j + 9];
//                    System.out.println(dictionary);
//                }
//
//            }









