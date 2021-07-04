public class Main {
    public static void main (String arg[]) {
        Robot robot = new Robot ();
        CoffeRobot coffeRobot = new CoffeRobot ();
        RobotDancer robotDancer = new RobotDancer ();
        RobotCoocker robotCoocker = new RobotCoocker ();
        System.out.println ( robot.work ());
        System.out.println ( coffeRobot.work () );
        System.out.println ( robotDancer.work () );
        System.out.println ( robotCoocker.work () );
        System.out.println ();

        Robot [] robots = new Robot[4];
        robots [0] = new Robot ();
        robots [1] = new CoffeRobot ();
        robots [2] = new RobotDancer ();
        robots [3] = new RobotCoocker ();

        for ( int i = 0; i < robots.length; i++ ) {
            Robot robo = robots [i];
            System.out.println ( robo.work () );
        }
    }
}
