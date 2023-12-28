package week13.Task3;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setFormatter(new UpperCaseFormatter());
        String upperCaseText = textEditor.formatText("This is an example text.");
        System.out.println("Upper Case: " + upperCaseText);

        textEditor.setFormatter(new LowerCaseFormatter());
        String lowerCaseText = textEditor.formatText("This is an example text.");
        System.out.println("Lower Case: " + lowerCaseText);

        textEditor.setFormatter(new CamelCaseFormatter());
        String camelCaseText = textEditor.formatText("This is an example text.");
        System.out.println("Camel Case: " + camelCaseText);
    }
}
