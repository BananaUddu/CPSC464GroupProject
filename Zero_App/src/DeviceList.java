import support.*;

public class DeviceList<Device> extends LBList<Device>
{

	protected LLNode<Device> devicePtr = this.front;
	
	protected DeviceList() {
		devicePtr = null;	//pointer to the first device in the list
	}
	public void RemoveDeviceList(){		//should check the status of the device processes before removing the list
		int size = DeviceList1.size();
		for (int i = 0; i < size; i++) {
			DeviceList1.remove(i);
		}
	}
	public void AddDevice(Device newDevice) {	//adds a device to the beginning of Device List
		this.add(newDevice);
		
	}
	
	public void printDevices() {		//prints contents of the device linked list through Device printDevice
		LLNode<Device> device = devicePtr;
		
		do {
			if(device == null)
				break;
			device.printDevice();
			device = device.getNext();
		}while(device != null);
	}
		
	}
	public void addProcess(Device newDevice) {
		// need code from process group to get PCB
		//newDevice.super.getProcess();  	//get the process to obtain the information to add to device queue
		//super.deviceQueue.push(newPro)
	}
	public void decrementDevices() {
		
	}
	public void checkStatus() {
		// If process is complete, advance the jobs.
	}

}
