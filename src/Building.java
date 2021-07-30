public class Building {

    public static void main(String[] args)
    {
        Elevator e = new Elevator();
        e.LoadPassenger(5);
        e.InitialNewFloorRequest(14);
        e.ReportNewStatistic();
    }
}
