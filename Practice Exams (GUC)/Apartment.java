public class Apartment {

    int ApNumber;
    int BDNumber;
    int BTNumber;
    int floor;
    int rent;

    public Apartment(int ap, int bd, int bt, int fl, int rn) {
        this.ApNumber = ap;
        this.BDNumber = bd;
        this.BTNumber = bt;
        this.floor = fl;
        this.rent = rn;
    }

    public String toString() {
        return ("Apartment Number: " + this.ApNumber + "\n" + "Number of Bedrooms: " + this.BDNumber + "\n"
                + "Number of Bathrooms: " + this.BTNumber + "\n" + "Floor Number: " + this.floor + "\n"
                + "Rent Amount: " + this.rent + " EGP");
    }

}
