package exercises.technology;

public class Laptop extends Computer {

    private int numberOfUSBPorts;

    public Laptop(String abrand,int amemorysize,double adisplaysize,double aweight,int ausbPort){
        super(abrand,amemorysize,adisplaysize,aweight);
        this.numberOfUSBPorts = ausbPort;
    }

    public void addUSBPort(int usbPortNumber){
        if( numberOfUSBPorts + usbPortNumber > 4) {
            throw new IllegalArgumentException("USB Ports cannot be added more than 4");
        }
        numberOfUSBPorts = numberOfUSBPorts + usbPortNumber;
    }

    public int getNumberOfUSBPorts() {
        return numberOfUSBPorts;
    }

    public void setNumberOfUSBPorts(int numberOfUSBPorts) {
        this.numberOfUSBPorts = numberOfUSBPorts;
    }
}