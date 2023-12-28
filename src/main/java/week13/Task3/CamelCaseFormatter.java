package week13.Task3;

public class CamelCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String[] words = text.split(" ");
        StringBuilder camelCase = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            camelCase.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return camelCase.toString();
    }
}
