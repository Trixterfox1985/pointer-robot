public class RobotCoocker extends Robot{

    public RobotCoocker() {
        System.out.println("Параметри не ініціалізовані");
    }

    public RobotCoocker(int numeration, String str) {
        super(numeration, str);
        setNumeration(numeration);
        setStr(str);
    }

    public RobotCoocker(Robot rob) {
        super(rob);
    }

    @Override
    void work ()
    {
        System.out.println("Я " + getStr() + " – я просто готую");
        System.out.println("Код: " + getNumeration());
    }
}
