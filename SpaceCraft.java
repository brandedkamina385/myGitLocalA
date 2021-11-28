
public class SpaceCraft {
    //Initialize values
    final int GRAVITY = 9;
    int altitude;
    int fuel;
// made changes
    int velocity;
    int time;

    int burnRate;
    
    public void init(){
    	altitude = 1000;
        velocity = 70;
        time = 0;
        fuel = 500;
//wed2f2q323qf
        burnRate = 0;
      
        displayValues();	
    }
    
    
    public void setBurnRate(int br){
    	burnRate = br;
    }
public int getBurnRate(){
    	return burnRate;
    }
    
    public void calcNewValues() throws Exception{
else{
            //Calculate new application state
            time = time + 1;
            fuel = fuel - burnRate;
            if(altitude <= 0){
            	altitude = 0;
            }
    	if(altitude <= 0){
        	System.out.println("#The game is over.");
        } else if(burnRate > fuel){
        	throw new Exception("#Sorry, you don't have that much fuel.");
altitude = altitude - velocity;
            velocity = ((velocity + GRAVITY) * 10 -
                    burnRate * 2) / 10;
        } 
        }
    }

public int getAltitude() {
		return altitude;
	}
    
    public void displayValues(){
    	System.out.println("Altitude: " + altitude);
        System.out.println("Fuel remaining: " + fuel);
        System.out.println("Current Velocity: " + velocity);
        System.out.println("Time elapsed: " + time);
    }

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public int getFuel() {

		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}


public int getAltitude() {
		return altitude;
	}
    
}
