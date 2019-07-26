//Створити клас Robot від якого слід унаслідувати CoffeRobot, RobotDancer, RobotCoocker. В Robot є метод work() , в якому слід описати роботу яку виконує кожен з роботів.
//        Для Robot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я Robot – я просто працюю».
//        Для CoffeRobot в методі work() слід написати код, щоб на консоль виводився наступний текст «Я CoffeRobot – я варю каву».
//        Для RobotDancer в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotDancer – я просто танцюю».
//        Для RobotCoocker в методі work() слід написати код, щоб на консоль виводився наступний текст «Я RobotCoocker – я просто готую».
//        Створити в Main класі екземпляри даних класів і викликати до кожного з них метод work().

public class RobotExecute {
    public static void main(String[] args) {

        Robot robot;
        Robot robotCook;
        Robot robotDance;
        Robot robotCoffe;
        RobotDancer robotDance1;
        RobotCoocker robotCook2;

        robot = new Robot(0, "Robot");
        robotCook = new RobotCoocker(1, "RobotCoocker");
        robotDance = new RobotDancer(2, "RobotDancer");
        robotDance1 = new RobotDancer(3, "RobotDancer");
        robotCoffe = new CoffeRobot(4, "CoffeRobot");
        robotCook2 = new RobotCoocker(robot);
        //robotDance1 = new Robot(3, "RobotDancer"); Дане посилання заборонене, бо посилання типу RobotDancer не може посилатися на об"єкт суперкласу Robot

        robot.work();
        robotCook.work();
        robotDance.work();
        robotDance1.work();
        robotCoffe.work();
        robotCook2.work();
    }
}
