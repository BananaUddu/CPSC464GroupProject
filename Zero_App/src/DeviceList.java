import java.util.*;
public class DeviceList extends Device {
	
	LinkedList<Device> DeviceList1;
	Device devicePtr;
	
	DeviceList() {
		DeviceList1 = new LinkedList<Device>();
		devicePtr = DeviceList1.getFirst();
	}
	public void RemoveDeviceList(){
		int size = DeviceList1.size();
		for (int i = 0; i < size; i++) {
			DeviceList1.remove(i);
		}
	}
	public void AddDevice() {
		
	}
	public void printDevices() {
	
	}
	public void addProcess() {
			
	}
	public void decrementDevices() {
		
	}
	public void checkStatus() {
		
	}

}
