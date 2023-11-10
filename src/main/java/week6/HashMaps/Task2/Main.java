package week6.HashMaps.Task2;

public class Main {
    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);

        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.Debt("Arto"));
        System.out.println(mattisNote.Debt("Joel"));
    }
}
