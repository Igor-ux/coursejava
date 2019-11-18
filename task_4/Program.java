package task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


     class Program {
         static int getWordCount(String text, String word) {
             if (word.equals("") || text.equals("")) throw new IllegalArgumentException("Invalid input");

             text = text.toLowerCase();
             word = word.toLowerCase();

             int wordCount = 0;
             Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

             while (matcher.find()) {
                 wordCount++;
             }
             return wordCount;

         }
}
