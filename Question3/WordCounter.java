package Question3;

import java.util.List;

public class WordCounter {
    public static int countWords(List<String> words, char c, char d, int len){

        return (int)words.stream().filter(w->w.length()==len).filter(w->w.contains(String.valueOf(c))).filter(w->!w.contains(String.valueOf(d))).count();
    }
    public static void main(String[] args) {
        List<String> wordList = List.of("apple", "banana", "cherry", "date", "kiwi");

        char characterC = 'a';
        char characterD = 'd';
        int length = 6;

        int result = countWords(wordList, characterC, characterD, length);
        System.out.println("Number of words: " + result);
    }
}
