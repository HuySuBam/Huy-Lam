import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        String choice;

        do {

            System.out.println("Welcome to the Misinterpreting Translator \n");
            System.out.println("Type in a word and see its translated version");

            word = scan.nextLine();

            String letter = word.substring(word.length() - 1);
            word = word.substring(0, word.length() - 1);

            System.out.println("Translated word: " + letter + word + "ay");


    do {

        System.out.println("\nDo you wish to see the word in English?");
        System.out.println("Please type exactly either 'yes' or 'no'  ");
        choice = scan.nextLine();

    } while (!(choice.equals("yes") || (choice.equals("no"))));

    if(choice.equals("yes")){

        System.out.println(word + letter);
    }

while(choice.equals("no")) {
    do {

        System.out.println("\nThen, do you wish to try another word?");
        System.out.println("Please type exactly either 'Yes' or 'No' ");
        choice = scan.nextLine();

    } while (!(choice.equals("Yes") || choice.equals("No")));
}

while(choice.equals("yes")) {
    do {

        System.out.println("\nDo you want to try another word?");
        System.out.println("Please type exactly either 'Yes' or 'No' ");
        choice = scan.nextLine();

    } while (choice.equals("yes"));
}


    if(choice.equals("No")){

        System.out.println("\nHope you enjoyed this translator");
    }


        } while(word.equals("") || choice.equals("Yes"));
    }
}
