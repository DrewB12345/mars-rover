
/**
 * Write a description of class RoverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverRunner2
{
    public static void main(String[] arrrggggggs)
    {
        Rover r1 = new Rover("Curiosity", 0, 0, 0);
        Rover r2 = new Rover("Spirit", 0, 0, 0);
        Rover r3 = new Rover(0, 0, 0);
        Rover r4 = new Rover("Imbadatnamingthings", 4, 3, 2);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println();
        
        r1.move();
        System.out.println(r1);
        System.out.println();

        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r1.toggleSpeedMode();
        r1.move();
        System.out.println(r1);
        System.out.println();

        r1.toggleSpeedMode();
        r1.move();
        System.out.println(r1);
        System.out.println();

        r1.move();
        r1.takePic();
        r1.transmitPictures();
        r1.rotateLeft();
        r1.rotateRight();
        r1.rotate(6);
        r1.turnAround();
        r1.kill(r2);
        r1.repair(r2);
        r1.teleport(3, -5);
        r1.charge(5);
        r1.rotate(7);
        System.out.println(r1);
        System.out.println();

        r1.charge(3);
        System.out.println(r1);
        System.out.println();
        
        r1.charge(1111);
        System.out.println(r1);
        System.out.println();
    }
        
}
