import java.util.*;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;

            // Try to fit as many words as possible into the current line
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length(); // 1 for space
                j++;
            }

            int numWords = j - i;
            int totalSpaces = maxWidth - lineLen + (numWords - 1); // reclaim 1 space per word
            StringBuilder sb = new StringBuilder();

            // If it's the last line or only one word in this line => left-justified
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) sb.append(" ");
                }
                int remaining = maxWidth - sb.length();
                while (remaining-- > 0) sb.append(" ");
            } else {
                int spaces = totalSpaces / (numWords - 1);
                int extra = totalSpaces % (numWords - 1);

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) {
                        for (int s = 0; s < spaces; s++) sb.append(" ");
                        if (extra-- > 0) sb.append(" ");
                    }
                }
            }

            result.add(sb.toString());
            i = j;
        }

        return result;
    }

    public static void main(String[] args) {
        TextJustification tj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> output = tj.fullJustify(words, maxWidth);

        for (String line : output) {
            System.out.println("\"" + line + "\"");
        }
    }
}
