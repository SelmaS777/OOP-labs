package week13.Task4;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDeviceImpl();
        NewDevice newDevice = new NewDeviceImpl();

        newDevice.operateNewFunction();

        NewDevice adapter = new DeviceAdapter(oldDevice);
        adapter.operateNewFunction();
    }
}
