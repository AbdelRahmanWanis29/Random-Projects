public class Hotel {

    String HotelName;
    Room[] Rooms;
    int RentedR = 0;

    public Hotel(String name, int n) {

        this.HotelName = name;
        this.Rooms = new Room[n];

    }

    public double getTotalRentalSales() {

        if (RentedR == 0) {
            return 0.0;
        } else {
            double total = 0.0;
            for (int i = 0; i < RentedR; i++) {
                total += this.Rooms[i].rate * this.Rooms[i].DayR;
            }
            return total;
        }
    }

    public double getAvgDays() {

        double total = 0.0;
        for (int i = 0; i < RentedR; i++) {
            total += this.Rooms[i].DayR;
        }
        return total / RentedR;

    }

    public void addReservation(Room R) {

        if (this.RentedR == this.Rooms.length) {
            System.out.println("Hotel is fully booked.");
        } else {
            this.Rooms[RentedR] = R;
            this.RentedR += 1;
        }

    }

    public void findReservation(Room R) {

        boolean found = false;
        for (int i = 0; i < RentedR; i++) {
            if (Rooms[i].RoomNum == R.RoomNum) {
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Reservation not found!");
        } else {
            System.out.println("Reservation found!");
            System.out.println(R);
        }

    }

    public static void main(String[] args) {

        Hotel Wans = new Hotel("Western Wans", 100);

        System.out.println("");

        Room r1 = new Room(123, "Blake", 123.50, 5, 1);
        Room r2 = new Room(222, "Smith", 144.50, 4, 2);
        Room r3 = new Room(352, "Joe", 155, 7, 2);
        Room r4 = new Room(333, "Jane", 140, 5, 1);
        Room r5 = new Room(260, "Mark", 160, 8, 1);

        Wans.addReservation(r1);
        Wans.addReservation(r2);
        Wans.addReservation(r3);
        Wans.addReservation(r4);

        for (int i = 0; i < Wans.RentedR; i++) {
            System.out.println(Wans.Rooms[i]);
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Average days rented out: " + Wans.getAvgDays());
        System.out.println("");
        System.out.println("Total rental income: " + Wans.getTotalRentalSales());
        System.out.println("");

        Wans.findReservation(r3);
        System.out.println("");
        Wans.findReservation(r5);

    }

}