/**
 * Write a description of class RoverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class RoverRunner3 {
   
   public static void main(String[] args)
    {
        // Make a SimpleScanner
        SimpleScanner input = new SimpleScanner();
        
        // Make some Rovers
        Rover r1 = new Rover("Curiosity");
        Rover r2 = new Rover("Spirit");
        Rover r3 = new Rover("Harambe");
        
        // Make a RoverGroup and add Rovers
        RoverGroup group = new RoverGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        
        // Now let's do stuff
        boolean running = true;
        String exitCommand = "quit";
        
        while (running) {
            // Input name
            System.out.print("Enter the name of the Rover to act: ");
            String name = input.readString();
            
            // Select Rover with matching name
            Rover actor = group.find(name);
            
            if (actor != null) {
                // If the rover is found
                System.out.println();
                System.out.println("1: Move");
                System.out.println("2: Toggle Speed Mode");
                System.out.println("3: Rotate Left");
                System.out.println("4: Rotate Right");
                System.out.println("5: Turn Around");
                System.out.println("6: Rotate x Amount of Times");
                System.out.println("7: Take Picture");
                System.out.println("8: Transmit Pictures");
                System.out.println("9: Attack");
                System.out.println("10: Kill");
                System.out.println("11: Repair");
                System.out.println("12: Teleport");
                System.out.println("13: Charge");
                System.out.println("14: Set Name");
                System.out.println();

                System.out.print("Enter a command: ");
                String command = input.readString();
                
                if (command.equals("1")) {
                    actor.move();
                }
                
                else if (command.equals("2")) {
                    actor.toggleSpeedMode();
                }
                
                else if (command.equals("3")) {
                    actor.rotateLeft();
                }
                
                else if (command.equals("4")) {
                    actor.rotateRight();
                }

                else if (command.equals("5")) {
                    actor.turnAround();
                }

                else if (command.equals("6")) {
                    System.out.print("Enter amount of rotations: ");
                    int times = input.readInt();
                    actor.rotate(times);
                }

                else if (command.equals("7")) {
                    actor.takePic();
                }

                else if (command.equals("8")) {
                    actor.transmitPictures();
                }

                else if (command.equals("9")) {
                    System.out.print("Enter the name the target rover: ");
                    String targetName = input.readString();
                    
                    Rover target = group.find(targetName);
                    
                    if (target != null) {
                        actor.attack(target);
                        System.out.println(target);
                    }
                    
                    else {
                        System.out.println("Error: No such target.");
                    }
                }

                else if (command.equals("10")) {
                    System.out.print("Enter the name the target rover: ");
                    String targetName = input.readString();
                    
                    Rover target = group.find(targetName);
                    
                    if (target != null) {
                        actor.kill(target);
                        System.out.println(target);
                    }
                    
                    else {
                        System.out.println("Error: No such target.");
                    }
                }
                
                else if (command.equals("11")) {
                    System.out.print("Enter the name the target rover: ");
                    String targetName = input.readString();
                    
                    Rover target = group.find(targetName);
                    
                    if (target != null) {
                        actor.repair(target);
                        System.out.println(target);
                    }
                    
                    else {
                        System.out.println("Error: No such target.");
                    }
                }

                else if (command.equals("12")) {
                    System.out.print("Enter the x value: ");
                    int x = input.readInt();
                    System.out.print("Enter the y value: ");
                    int y = input.readInt();
                    actor.teleport(x, y);
                }

                else if (command.equals("13")) {
                    System.out.print("Enter how much charge you want: ");
                    int amount = input.readInt();
                    actor.charge(amount);
                }

                else if (command.equals("14")) {
                    System.out.print("Enter desired name: ");
                    String newname = input.readString();
                    actor.setName(newname);
                }

                else {
                    System.out.println("Error: Invalid command.");
                }
                
                System.out.println(actor);
            }
            
            else if (name.equals(exitCommand)) {
                running = false; // set flag to exit loop
            }
            
            else {
                System.out.println("Error: " + name + " doesn't exist.");
            }
            
            // just a blank line
            System.out.println();
        }
        
        System.out.println("Goodbye.");
    }
}