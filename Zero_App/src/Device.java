public class Device {
	
	String logicalName;
	String physicalName;
	boolean status;
	int speed;
	int numProcesses;
	
   public Device(){
	logicalName = null;
	physicalName = null;
	status = false;
	speed = 0;
	numProcesses = 0;
   }
	
   public void initialize(){
   }
   
   public void addProcess(){
   }
   
   public void deleteProcess(){
   }
   
   public void enable(){
      status = false;
   }
   
   public void disable(){
      status = true;
   }
   
   public void update(){
   }
   
   public void printDevice(){
   }
   
   public boolean busy(){
      return status;
   }
   
   public void advanceJobs(){
   }
   
   public void queue(){
   }
   
   public void deviceProcess(){
   }
   
}
