
/**
 * Write a description of class RoverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverRunner
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

        r1.rotateRight();
        System.out.println(r1);
        System.out.println();
        
        r2.rotateLeft();
        System.out.println(r2);
        System.out.println();
        
        r2.move();
        System.out.println(r2);
        System.out.println();
        
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r1.takePic();
        System.out.println(r1);
        System.out.println();
        
        r3.move();
        System.out.println(r3);
        System.out.println();
        
        r3.turnAround();
        System.out.println(r3);
        System.out.println();
        
        r3.move();
        System.out.println(r3);
        System.out.println();
        
        r3.setName("Thirdrover");
        System.out.println(r3);
        System.out.println();
        
        r3.rotateLeft();
        System.out.println(r3);
        System.out.println();
        
        r3.turnAround();
        System.out.println(r3);
        System.out.println();
        
        r3.move();
        System.out.println(r3);
        System.out.println();
        
        for(int i=1; i<6; i++) {
            r4.move();
            System.out.println(r4);
            System.out.println();
        }
        
        r4.rotateLeft();
        System.out.println(r4);
        System.out.println();
        
        r4.move();
        System.out.println(r4);
        System.out.println();
        
        r1.setName("Sojourner");
        System.out.println(r1);
        System.out.println();
        
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r4.takePic();
        System.out.println(r4);
        System.out.println();
        
        r1.takePic();
        System.out.println(r1);
        System.out.println();
        
        r2.takePic();
        System.out.println(r2);
        System.out.println();
        
        r1.kill(r3);
        System.out.println(r3);
        System.out.println();
        
        r3.move();
        r3.rotateLeft();
        r3.rotateRight();
        r3.turnAround();
        r3.kill(r2);
        r3.repair(r4);
        r3.takePic();
        r3.transmitPictures();
        r3.rotate(-12345);
        System.out.println(r3);
        System.out.println();
        
        r4.repair(r3);
        r3.move();
        System.out.println(r3);
        System.out.println();
        
        r4.repair(r2);
        r4.move();
        System.out.println(r4);
        System.out.println();
        
        System.out.println(r1);
        r1.move();
        r1.toggleSpeedMode();
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        r1.rotateLeft();
        r1.move();
        r1.toggleSpeedMode();
        r1.move();
        System.out.println(r1);
        System.out.println();
        
        Rover r5 = new Rover();
        System.out.println(r5);
        r5.setName("Random");
        System.out.println(r5);
        System.out.println();
        
        r1.transmitPictures();
        System.out.println(r1);
        System.out.println();
        
        r1.takePic();
        r1.takePic();
        r1.takePic();
        r1.takePic();
        r1.takePic();
        r1.takePic();
        r1.takePic();
        System.out.println(r1);
        System.out.println();
        
        r1.transmitPictures();
        System.out.println(r1);
        System.out.println();
        
        r1.rotate(2);
        System.out.println(r1);
        System.out.println();
        
        r1.rotate(-3);
        System.out.println(r1);
        System.out.println();

        r1.rotate(12);
        System.out.println(r1);
        System.out.println();

        r1.rotate(-13);
        r1.rotate(0);
        System.out.println(r1);
        System.out.println();

        r1.teleport(7, -2);
        System.out.println(r1);
        System.out.println();
        
        
    }
        
}
