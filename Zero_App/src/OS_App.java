import java.util.Scanner;
public class OS_App {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Device deviceNode = new Device();
		DeviceList listDevices = new DeviceList();
		char Continue = 'y';
		while (Continue == 'y') {
			System.out.println("Enter device information:");
			
			//String logicalName = userInput.nextLine();
			//String physicalName = userInput.nextLine();
			//int speed = userInput.nextInt();
			
			//System.out.println(logicalName + physicalName + speed);
			
			
			
			deviceNode.initialize("USB1.0", "AAE:1001./23", 12);
			listDevices.AddDevice(deviceNode);
			deviceNode.initialize("USB12.0", "A2231001./23", 13);
			listDevices.AddDevice(deviceNode);
			deviceNode.initialize("USB8.0", "AAE:10dd23", 14);
			
			listDevices.AddDevice(deviceNode);
			
			System.out.println("Enter another Device? y/n");
			Continue = userInput.next().charAt(0);
		}
		userInput.close();
		listDevices.printDevices();
		
	}

}
