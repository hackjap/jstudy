package bridge;

public class Main {
    public static void main(String[] args) {
//        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());

        PrintMorseCode code = new PrintMorseCode(new SoundMFC());

        code.g().a().r().a().m();
    }
}
