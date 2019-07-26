//Створити клас Robot від якого слід унаслідувати CoffeRobot, RobotDancer, RobotCoocker. В Robot є метод work() , в якому слід описати роботу яку виконує кожен з роботів.
//        Для Robot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я Robot – я просто працюю».
//        Для CoffeRobot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я CoffeRobot – я варю каву».
//        Для RobotDancer в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotDancer – я просто танцюю».
//        Для RobotCoocker в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotCoocker – я просто готую».
//        Створити в Main класі екземпляри даних класів і викликати до кожного з них метод work().

import java.util.Objects;

public class Robot {

    private int numeration;
    private String name;

    static {
        System.out.println("Загальний опис робота...");
    }

    public int getNumeration() {
        return numeration;
    }

    public void setNumeration(int numeration) {
        this.numeration = numeration;
    }

    public String getStr() {
        return name;
    }

    public void setStr(String str) {
        name = str;
    }

    public Robot() {
        System.out.println("Параметри не ініціалізовані");
    }

    public Robot(int numeration, String str) {
        this.numeration = numeration;
        name = str;
    }

    public Robot(Robot rob) {
        this.numeration = rob.numeration;
        this.name = rob.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot)) return false;
        Robot robot = (Robot) o;
        return getNumeration() == robot.getNumeration() &&
                getStr().equals(robot.getStr());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeration(), getStr());
    }

    @Override
    public String toString() {
        return "Robot{" +
                "numeration=" + numeration +
                ", name='" + name + '\'' +
                '}';
    }

    void work (){
        System.out.println("Я " + name + " – я просто працюю");
        System.out.println("Код: " + getNumeration());
    }
}
