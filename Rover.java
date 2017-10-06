
/**
 * Write a description of class Rover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rover
{
    // fields
    String name;
    int x;
    int y;
    int dir; // 0=North, 1=East, 2=South, 3=West
    int numPics;
    int energy;
    int health;
    boolean isAlive;
    boolean inSpeedMode;
    int memory;
    
    // constructor(s)
    public Rover()
    {
        this.x = (int)(Math.random() * 11 + 1)-1;
        int num = (int)(Math.random() * 4 + 1);
        this.y = (int)(Math.random() * 11 + 1)-1;
        this.dir = ((int)(Math.random() * 4 + 1))-1;
        this.numPics = 0;
        this.energy = 10;
        this.health = 5;
        this.memory = 5;
        this.isAlive = true;
        this.inSpeedMode = false;
    }

    public Rover(String name)
    {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.numPics = 0;
        this.energy = 10;
        this.health = 5;
        this.memory = 5;
        this.isAlive = true;
        this.inSpeedMode = false;
    }
    
    public Rover(int x, int y, int dir)
    {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.numPics = 0;
        this.energy = 10;
        this.health = 5;
        this.isAlive = true;
        this.inSpeedMode = false;
    }
    
    public Rover(String name, int x, int y, int dir)
    {
        this.name = name;
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.numPics = 0;
        this.energy = 10;
        this.health = 5;
        this.memory = 5;
        this.isAlive = true;
        this.inSpeedMode = false;
    }

    
    // methods - stuff the Rover can do    
    private String getDirectionName() {
        if (this.dir == 0) {
            return "north";
        }    
        
        else if (this.dir == 1) {
            String d = Integer.toString(this.dir);
            d = "east";
            return d;
        }    
        
        else if (this.dir == 2) {
            String d = Integer.toString(this.dir);
            d = "south";
            return d;
        }    
        
        else {
            String d = Integer.toString(this.dir);
            d = "west";
            return d;
        }    

    }
    
    public void toggleSpeedMode() {
        if (isAlive) {
            if (inSpeedMode) {
                inSpeedMode = false;
                System.out.println(this.name + " is no longer in speed mode.");
            }  
            
            else {
                inSpeedMode = true;
                System.out.println(this.name + " is now in speed mode.");
            }    
        }
        
        else {
            System.out.println(name + " can't toggle speed mode because it's dead.");
        }
    }    
    
    public void setName(String name) {
        this.name = name;
        System.out.println("The rover's name is now " + name + ".");
    }
    
    public void takePic() {
        
        if (energy >= 1) {
            if (isAlive && numPics < memory) {
                numPics += 1;
                energy -= 1;
                System.out.println(name + " took a picture at [" + x + ", " + y + "] facing " + getDirectionName() + ".");
            }
            
            else if (isAlive && numPics == memory) {
                System.out.println(name + " can't take a picture because its memory is full.");
            }    
            
            else {
                System.out.println(name + " can't take a picture because it's dead.");
            }    
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to take a picture.");
        }    
    }    
    
    public void transmitPictures() {
        if (energy >= 1) {
            if (isAlive && numPics > 0) {
                numPics = 0;
                System.out.println(name + " has transmitted all of its pictures to Earth.");
                energy -= 1;
            }    
            
            else if (!isAlive) {
                System.out.println(name + " can't transmit pictures because it's dead.");
            }    
            
            else {
                System.out.println(name + " doesn't have any pictures to transmit.");
            }    
        }
        else {
            System.out.println(name + " doesn't have enough energy to transmit pictures.");
        }    

    }    
    
    public void move()
    {
        if (isAlive) {
            int speed = 1;
            int consumed = 2;
            if (inSpeedMode) {
                speed = 2;
                consumed = 3;
            }    
            
            if (energy >= consumed) {
                if (dir == 0)
                {
                    y += speed;
                }
                else if (dir == 1)
                {
                    x += speed;
                }
                else if (dir == 2)
                {
                    y -= speed;
                }
                else 
                {
                    x -= speed;
                }
                energy -= consumed;
                System.out.println(name + " moved in direction " + getDirectionName() + ".");
            }
            else {
                System.out.println(name + " doesn't have enough energy to move.");
            }    

        }
        
        else {
            System.out.println(name + " can't move because it's dead.");
        }
    }
    
    public void rotateLeft() 
    {
        if (isAlive && energy >= 1) {
            dir -= 1;
            
            if (dir < 0)
            {
                dir = 3;
            }
            
            energy -= 1;
            System.out.println(name + " turned to the left.");        
        }
        
        else if (!isAlive) {
            System.out.println(name + " can't rotate left because it's dead.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to rotate left.");
        }    

        
    }
    
    public void rotateRight()
    {
        if (isAlive && energy >= 1) {
            dir += 1;
            
            if (dir == 4)
            {
                dir = 0;
            }
            
            energy -= 1;
            System.out.println(name + " turned to the right.");        
        }
        
        else if (!isAlive) {
            System.out.println(name + " can't rotate right because it's dead.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to rotate right.");
        }    


    }
    

    public void rotate(int times) {
        if (isAlive && energy >= 1) {
            if (times < 0) {
                int turns = times * -1;
                for (int i=1; i<=turns; i++) {
                    dir -= 1;
                    if (dir < 0) {
                        dir = 3;
                    }    
                }
            }
            else{
                for (int i=1; i<=times; i++) {
                    dir += 1;
                    if (dir > 3) {
                        dir = 0;
                    }    
                }  
            }
            energy -= 1;
            System.out.println(name + " rotated and is now facing " + getDirectionName() + ".");
        }   
        
        else if (!isAlive) {
            System.out.println(name + " can't rotate because it's dead.");
        }    
        
        else {
            System.out.println(name + " doesn't have enough energy to rotate.");
        }    

    }    

    public void turnAround() 
    {
        if (isAlive && energy >= 1) {
            dir -= 2;
            
            if (dir == -1)
            {
                dir = 3;
            }
            
            else if (dir == -2)
            {
                dir = 2;
            }
            
            energy -= 1;
            System.out.println(name + " turned around.");      
        }
        
        else if (!isAlive) {
            System.out.println(name + " can't turn around because it's dead.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to turn around.");
        }    


    }

    /*
    public void moveTo(int x, int y) {
        if (x > this.x) {
            for (int i=this.dir; i!=1; i++) {
                this.rotate(1);
            }    
            
            for (int i=this.x; i<(x - this.x); i++) {
                this.move();
            }    
        }    
        
        else if (x < this.x) {
            for (int i=this.dir; i!=3; i++) {
                this.rotate(1);
                System.out.println(i);
            }    
            
            for (int i=this.x; i>(x); i-=1) {
                this.move();
            }    
        }    
        
        if (y > this.y) {
            for (int i=this.dir; i!=0; i++) {
                this.rotate(1);
            }    
            
            for (int i=this.x; i<(x - this.x); i++) {
                this.move();
            }    
        }    
        
        else if (y < this.y) {
            for (int i=this.dir; i!=2; i++) {
                this.rotate(1);
            }    
            
            for (int i=this.y; i>(this.y - y); i--) {
                this.move();
            }    
        }    


    }    
*/    
    public void kill(Rover other) {
        if (isAlive && energy >= 8) {
            System.out.println(this.name + " kills " + other.name + " because " + other.name + " stole its breakfast.");
            other.isAlive = false;
            other.health = 0;
            energy -= 8;
        }
        
        else if (!isAlive) {
            System.out.println(name + " can't kill another rover because another rover killed it first.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to kill another rover.");
        }    
    }

    public void attack(Rover other) {
        if (isAlive && energy >= 4 && other.isAlive) {
            if (this.x == other.x) {
                if (other.y <= this.y + 1 && other.y >= this.y -1) {
                    int num = (int)(Math.random() * 4 + 1);
                    if (num == 1) {
                        System.out.println(this.name + " tried to attack " + other.name + " but missed. What a loser.");
                    }
                    
                    else {
                        int crit = (int)(Math.random() * 8 + 1);
                        if (crit == 1) {
                            System.out.println(this.name + " got a critical hit and " + other.name + " took four damage.");
                            other.health -= 4;
                        }
                        else {
                            System.out.println(this.name + " attacked " + other.name + " and dealt two damage.");
                            other.health -= 2;
                        }
                    }
                    
                    energy -= 4;
                    
                    if (other.health <= 0) {
                        other.isAlive = false;
                        System.out.println(other.name + " died.");
                    }
                }
                
                else {
                    System.out.println(other.name + " is too far away from " + this.name + " to be attacked.");
                }
            }
            
            else if (this.y == other.y) {
                if (other.x <= this.x + 1 && other.x >= this.x - 1) {
                    int num = (int)(Math.random() * 4 + 1);
                    if (num == 1) {
                        System.out.println(this.name + " tried to attack " + other.name + " but missed. What a loser.");
                    }
                    
                    else {
                        int crit = (int)(Math.random() * 8 + 1);
                        if (crit == 1) {
                            System.out.println(this.name + " got a critical hit and " + other.name + " took four damage.");
                            other.health -= 4;
                        }
                        else {
                            System.out.println(this.name + " attacked " + other.name + " and dealt two damage.");
                            other.health -= 2;
                        }
                    }
                    
                    energy -= 4;
                    
                    if (other.health <= 0) {
                        other.isAlive = false;
                        System.out.println(other.name + " died.");
                    }
                }
                else {
                    System.out.println(other.name + " is too far away from " + this.name + " to be attacked.");
                }
            }
            
            else {
                System.out.println(this.name + " is too far from " + other.name + " to attack.");
            }
            
        }
        

        else if (!isAlive) {
            System.out.println(name + " can't attack another rover because it's dead.");
        }
        
        else if (other.isAlive == false) {
            System.out.println(name + " can't attack " + other.name + " because " + other.name + " is already dead.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to attack another rover.");
        }    

    }

    public void repair(Rover other) {
        if (energy >= 5) {
            if (isAlive && other.health < 5) {
                System.out.println(this.name + " repairs " + other.name + ". " + other.name + " is back to full health.");
                other.isAlive = true;
                other.health = 5;
                energy -= 5;
            }
            
            else if (isAlive && other.health == 5) {
                System.out.println(this.name + " can't repair " + other.name + " because " + other.name + " is already at full health.");
            }
            
            else {
                System.out.println(this.name + " can't repair " + other.name + " because " + this.name + " is dead.");
            }
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to repair another rover.");
        }    

    }    
    
    public void teleport(int x, int y) {
        if (isAlive && energy >= 8) {
            this.x = x;
            this.y = y;
            energy -= 8;
            System.out.println(name + " magically teleported to (" + x + ", " + y + ").");
        }
        
        else if (!isAlive) {
            System.out.println(name + " can't teleport because it's dead.");
        }
        
        else {
            System.out.println(name + " doesn't have enough energy to teleport.");
        }    

    }
    
    public void charge(int amount) {
        if (isAlive) {
            int maxEnergy = 10;
            if (amount + energy > maxEnergy) {
                energy = 10;
                System.out.println(name + " fully charged its energy.");
            }
            
            else {
                energy = energy + amount;
                System.out.println(name + " charged its energy to " + energy + ".");
            }
        }
        else {
            System.out.println(name + " can't charge its energy because it's dead.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() 
    {
        return "Rover[name=" + name + ", x=" + x + ", y=" + y + ", dir=" + getDirectionName() + ", pics=" + numPics + ", alive=" + isAlive +", speedmode=" + inSpeedMode + ", energy=" + energy + ", health=" + health + "]";
    }
}
