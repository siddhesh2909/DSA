import java.util.ArrayList;
import java.util.List;

public class textjustificationleet {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> output = fullJustify(words, maxWidth);

        for (String line : output) {
            System.out.println("\"" + line + "\"");
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;

            // Try to fit as many words as possible into the current line
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }

            int numberOfWords = j - i;
            int totalSpaces = maxWidth - (lineLen - (numberOfWords - 1));
            StringBuilder sb = new StringBuilder();

            // If it's the last line or only one word => left-justified
            if (j == words.length || numberOfWords == 1) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) {
                        sb.append(" ");
                    }
                }
                // Add remaining spaces at the end
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                int spaces = totalSpaces / (numberOfWords - 1);
                int extra = totalSpaces % (numberOfWords - 1);

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k != j - 1) {
                        for (int s = 0; s < spaces; s++) {
                            sb.append(" ");
                        }
                        if (extra-- > 0) {
                            sb.append(" ");
                        }
                    }
                }
            }

            list.add(sb.toString());
            i = j;
        }

        return list;
    }
}
