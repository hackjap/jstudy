package builder2;

public class Main {

    public static void main(String[] args) {



        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .setStorage("128 ssd")
                .build();

        System.out.println(computer.toString());

    }
}
