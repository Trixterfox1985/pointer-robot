public class CoffeRobot extends Robot {

    public CoffeRobot() {
        System.out.println("Параметри не ініціалізовані");
    }

    public CoffeRobot(int numeration, String str) {
        super(numeration, str);
        setNumeration(numeration);
        setStr(str);
    }

    public CoffeRobot(Robot rob) {
        super(rob);
    }

    @Override
    void work (){
        System.out.println("Я " + getStr() + " – я варю каву");
        System.out.println("Код: " + getNumeration());
    }
}
