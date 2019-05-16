
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Main {

    public static void searchWord(ArrayList<String> sentences, String foundWord){ //Method to search for a certain text

        String lookForWord = foundWord.toLowerCase(); //The desired word to be searched needs to be case-insensitive
        for (int i = 0; i < sentences.size(); i++) {
            int pos = 0;
            String lowerCaseSentence = sentences.get(i).toLowerCase(); //Sentences can pick the desired without case-sensitivity
            if (sentences.get(i).contains(lookForWord)){
                System.out.println("\n" +sentences.get(i)); //Print sentences that contains the desired word
            }

            while (pos != -1) {

                pos = lowerCaseSentence.indexOf(lookForWord, pos); //Array "sentences" will look for the desired word and its location

                if (pos != -1) {
                    pos++; //Just to make computer count like a human

                }
                else{
                    break;
                }
                System.out.println("'" +lookForWord + "'" + " found at position " + pos+ " of the sentence"); //Prints result
            }
        }

    }


    public static void main(String[] args) throws IOException {

        ArrayList<String> sentences = new ArrayList<>(); //All sentences goes here
        FileReader reader = new FileReader("file.txt");
        BufferedReader buffered = new BufferedReader(reader);
        String line; //The string that will read the whole text file
        String sentence; //Stores in substrings that are identified as sentences
        int index = 0; //"Index" looks for periods in text file, and starts at 0 to determine the beginning of a sentence
        ArrayList<Integer> indexes = new ArrayList<>(); //Storing all periods here in order to form sentences in substrings

        while ((line = buffered.readLine()) != null) {
            indexes.add(index); //Stores index = 0 to begin reading sentences
            int length = line.length(); //Reads every line and determines their length

            while (index < length) {//search all periods in each lines
                if ((line.substring(index).indexOf('.') != -1 && !line.substring(index).contains("(e")) && !line.substring(index).contains(".[")) {
                    index += line.substring(index).indexOf('.');
                } else if ((line.substring(index).indexOf('.') != -1 && line.substring(index).contains("(e.g."))) {
                    index += line.substring(index).indexOf(". ");
                } else if ((line.substring(index).indexOf('.') != -1 && line.substring(index).indexOf(']') != -1)) {
                    index += line.substring(index).indexOf(']');
                }

                if (index != -1) { //If found
                    index++;//increases to continue reading next sentence
                    indexes.add(index);

                } else {
                    break;
                }




            }
            for (int i = 0; i < indexes.size() - 1; i++) {// Subtracts to prevent reading out of the array
                sentence = line.substring(indexes.get(i), indexes.get(i + 1)); //Reads all elements in Array "indexes" and determines what is a sentence
                sentences.add(sentence); //Stores into the array that keeps sentences
            }
            index = 0;
            indexes.clear();


        }

        buffered.close();

        for (int i = 0; i<sentences.size(); i++){
            System.out.println(sentences.get(i));
        }

        //Word Searching Tool
        String surfUpWord = "panel";
        System.out.println("\n Searching for: " + surfUpWord);
        searchWord(sentences, surfUpWord);


    }



    }

