package builder;


public class ComputerFactory {


    private BluePrint print;

    public void setBlueprint(BluePrint lgGramBlueprint) {
        this.print = lgGramBlueprint;
    }


    public void make() {

        print.setCpu();
        print.setRam();
        print.setStorage();

    }

    public Computer getComputer() {

        return print.getComputer();
    }
}
