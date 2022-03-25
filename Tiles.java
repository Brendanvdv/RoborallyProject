package amirrobot;

public class Tiles {
    private String Acid = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/acid.png";
    private String Pit = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/pit.png";
    private String Barrel = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/radiation.png";
    private String Laser = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/acid.png";
    private String Floor = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/floor.png";
    private String Health = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/pit.png";
    private String Conveyor = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/acid.png";
    private String Gear = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/acid.png";
    private String Checkpoint = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/robot.png";
    private String Robot = "/Users/amiralimov/Desktop/term 4/Agile Object-Oriented/amirrobot/Resources/robot.png";
    
    public String pullTile(String s) {
	if(s.equals("A")) {
	    return getAcid();
	} else if(s.equals("P")) {
	    return getPit();
	} else if(s.equals("B")) {
	    return getBarrel();
	} else if(s.equals("L")) {
	    return getLaser();
	} else if(s.equals("F")) {
	    return getFloor();
	} else if(s.equals("H")) {
	    return getHealth();
	} else if(s.equals("C")) {
	    return getConveyor();
	} else if(s.equals("G")) {
	    return getGear();
	} else if(s.equals("*")) {
	    return getCheckpoint();
	} else if(s.equals("R")) {
	    return getRobot();
	}
	return s; 
    }
    
    
    
    
    
    
    
    
    
    
    
    public String getAcid() {
	return Acid;
    }
    public void setAcid(String acid) {
	Acid = acid;
    }
    public String getPit() {
	return Pit;
    }
    public void setPit(String pit) {
	Pit = pit;
    }
    public String getBarrel() {
	return Barrel;
    }
    public void setBarrel(String barrel) {
	Barrel = barrel;
    }
    public String getLaser() {
	return Laser;
    }
    public void setLaser(String laser) {
	Laser = laser;
    }
    public String getFloor() {
	return Floor;
    }
    public void setFloor(String floor) {
	Floor = floor;
    }
    public String getHealth() {
	return Health;
    }
    public void setHealth(String health) {
	Health = health;
    }
    public String getConveyor() {
	return Conveyor;
    }
    public void setConveyor(String conveyor) {
	Conveyor = conveyor;
    }
    public String getGear() {
	return Gear;
    }
    public void setGear(String gear) {
	Gear = gear;
    }











    public String getCheckpoint() {
	return Checkpoint;
    }











    public void setCheckpoint(String checkpoint) {
	Checkpoint = checkpoint;
    }











    public String getRobot() {
	return Robot;
    }











    public void setRobot(String robot) {
	Robot = robot;
    }
    

}
