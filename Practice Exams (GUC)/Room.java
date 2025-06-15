public class Room {

    int RoomNum;
    String GName;
    double rate;
    int DayR;
    int BedN;

    public Room(int Rn, String Gn, double rt, int Dr, int Bn) {
        this.RoomNum = Rn;
        this.GName = Gn;
        this.rate = rt;
        this.DayR = Dr;
        this.BedN = Bn;
    }

    public String toString() {
        return ("Guest's Name: " + this.GName + "\n" + "Room Number: " + this.RoomNum + "\n" + "Room beds: " + this.BedN
                + "\n" + "Rental rate: " + this.rate + "\n" + "Rented for: " + this.DayR + " days");
    }

}
