public class RobotDancer extends Robot {

    public RobotDancer() {
        System.out.println("Параметри не ініціалізовані");
    }

    public RobotDancer(int numeration, String str) {
        super(numeration, str);
        setNumeration(numeration);
        setStr(str);
    }

    public RobotDancer(Robot rob) {
        super(rob);
    }

    @Override
    void work (){
        System.out.println("Я " + getStr() + " – я просто танцюю");
        System.out.println("Код: " + getNumeration());
    }
}
