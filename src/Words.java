import java.util.Random;

public class Words {

    private String[] randomWords = {"animals","horses","camels","lemon","lecture","extreme","fights","telekom","telephone",
            "pineapple","pie","textbook"};

public String selectedWord;
private Random random = new Random();
private char[] letters;
    public Words(){
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString(){
        StringBuilder word  = new StringBuilder();


        for (char letter : letters){
            word = letter == '\u0000' ? word.append(" - ") : word.append(letter);
        }
        return word.toString();
    }

    public boolean isGuessRight(){
        for (char letter:letters){
            if (letter == '\u0000'){
                return false;
            }
        }
        return true;
    }
    public boolean guess(char letter) {
        boolean guessedRight= false;
        for (int i =0;i<selectedWord.length();i++){
            if (letter==selectedWord.charAt(i)){
                letters[i]=letter;
                guessedRight = true;
            }
        }
        return guessedRight;
    }
}
