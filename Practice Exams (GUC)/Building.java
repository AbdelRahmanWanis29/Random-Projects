public class Building {

    String BName;
    Apartment[] Apartments;
    int max;

    public Building(String name, int max) {
        this.BName = name;
        this.Apartments = new Apartment[max];
        this.max = max;
    }

    public void AddApartment(Apartment ap) {

        boolean flag = false;
        for (int i = 0; i < this.Apartments.length; i++) {
            if (ap.ApNumber == this.Apartments[i].ApNumber) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("This Apartment already exists in the building!");
        } else {
            if (Apartments[max - 1] != null) {
                System.out.println("Building is full!");
            } else {
                for (int i = 0; i <= this.max; i++) {
                    if (this.Apartments[i] == null) {
                        this.Apartments[i] = ap;
                        break;
                    }
                }
            }
        }
    }

    public Apartment[] GenerateFloor(int flevel) {

        int count = 0;
        for (int i = 0; i < max; i++) {
            if (Apartments[i].floor == flevel) {
                count += 1;
            }
        }

        Apartment[] FLApartments = new Apartment[count];
        int j = 0;

        for (int i = 0; i < max; i++) {
            if (Apartments[i].floor == flevel) {
                FLApartments[j] = Apartments[i];
                j++;
            }
        }

        return FLApartments;
    }

    public String toString() {

        String temp = this.BName + "\n";
        for (int i = 0; i < max; i++) {
            temp = temp + Apartments[i].toString() + "\n";
        }
        return temp;

    }

    public static void main(String[] args) {

        Building Wanis = new Building("City Lights", 50);

        Apartment x1 = new Apartment(8, 4, 3, 3, 4500);
        Apartment x2 = new Apartment(10, 3, 2, 4, 3500);
        Apartment x3 = new Apartment(6, 4, 3, 2, 4500);
        Apartment x4 = new Apartment(18, 5, 3, 6, 5500);

        Wanis.AddApartment(x1);
        Wanis.AddApartment(x2);
        Wanis.AddApartment(x3);
        Wanis.AddApartment(x4);

        System.out.println(Wanis);

        System.out.println("Apartements in Floor 4");

        Apartment[] y = Wanis.GenerateFloor(4);

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

    }

}
