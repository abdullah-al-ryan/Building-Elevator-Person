public class Elevator {
    public int currentFloor,requestedFloor;
    public int totalFloor;
    Person per = new Person();

    public void LoadPassenger(int currentFloor)
    {
        this.currentFloor=currentFloor;
         totalFloor=totalFloor+currentFloor;
        System.out.println("Calling from floor: "+currentFloor);
    }
    public void InitialNewFloorRequest(int requestedFloor)
    {
        this.requestedFloor=requestedFloor;
        per.NewFloorRequest();
        totalFloor=totalFloor+requestedFloor;
        System.out.println("Go to floor: "+requestedFloor);
    }

    public void ReportNewStatistic()
    {
        System.out.println("Total floor count= "+totalFloor);
    }
}
