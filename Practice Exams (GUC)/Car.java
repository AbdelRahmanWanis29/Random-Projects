public class Car {

    static int total;

    String SSIP;
    boolean IsRented;
    double PricePerDay;
    int ID;

    public Car(char c, char t, char trm, char f, double ppd) {

        this.SSIP = "" + c + t + trm + f;
        this.PricePerDay = ppd;
        this.IsRented = false;
        this.ID = total;
        total += 1;

    }

    public String GetTransmission() {
        if (this.SSIP.charAt(2) == 'M') {
            return "Manual Unspecified Drive";
        } else {
            if (this.SSIP.charAt(2) == 'N') {
                return "Manual 4-WD";
            } else {
                return "Manual A-WD";
            }
        }
    }

    public String toString() {
        return ("SSIP: " + this.SSIP + "\n" + "Transmission: " + this.GetTransmission() + "\n" + "Price per day: "
                + this.PricePerDay + "\n" + "ٌRented: " + this.IsRented + "\n" + "ID: " + this.ID);
    }

    public boolean isAvailable() {
        if (this.IsRented == true) {
            return false;
        } else {
            return true;
        }
    }

    public boolean WithinRange(double low, double high) {
        if (this.PricePerDay >= low && this.PricePerDay <= high) {
            return true;
        } else {
            return false;
        }
    }

    public double Calculate(int days) {
        return (days * this.PricePerDay);
    }

}
