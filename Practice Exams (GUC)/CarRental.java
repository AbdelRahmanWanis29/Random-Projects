public class CarRental {

    String Name;
    Car[] CarList;
    int MaxCars;
    int NumCars;

    public CarRental(String name, int max) {
        this.Name = name;
        this.MaxCars = max;
        this.CarList = new Car[max];
    }

    public CarRental(String name, Car[] array) {

        this.Name = name;
        this.MaxCars = array.length;
        this.CarList = new Car[array.length];
        this.NumCars = array.length;

        for (int i = 0; i < array.length; i++) {

            this.CarList[i] = new Car(array[i].SSIP.charAt(0), array[i].SSIP.charAt(1), array[i].SSIP.charAt(2),
                    array[i].SSIP.charAt(3), array[i].PricePerDay);
        }
    }

    public void Delete(String cat) {
        // deletes all the cars with the given category
        char Cat;
        if (cat.equals("Mini")) {
            Cat = 'M';
        } else {
            if (cat.equals("Mini_Elite")) {
                Cat = 'N';
            } else {
                Cat = 'E';
            }
        }
        for (int i = 0; i < this.MaxCars; i++) {
            if (this.CarList[i].SSIP.charAt(0) == Cat) {
                this.CarList[i] = null;
                this.NumCars = this.NumCars - 1;
            }
        }
    }

    public void Add(Car C) {
        // adds a car to the first empty space in the array (if there is space)
        if (this.NumCars >= this.MaxCars) {
            System.out.println("No Space to add car!");
            return;
        } else {
            for (int i = 0; i < this.MaxCars; i++) {
                if (this.CarList[i] == null) {
                    this.CarList[i] = C;
                    this.NumCars += 1;
                    return;
                }
            }
        }
    }

    public void AvailableToRent(String type) {
        // rents the first found car with the given type
        char T = type.charAt(0);
        for (int i = 0; i < this.MaxCars; i++) {
            if (this.CarList[i] != null) {
                if ((this.CarList[i].isAvailable() == true) && this.CarList[i].SSIP.charAt(1) == T) {
                    this.CarList[i].IsRented = true;
                    return;
                }
            }
        }
    }

    public void AvalableWithinRange(double low, double high) {
        // displays all the cars that are available to rent within the given price range
        for (int i = 0; i < this.MaxCars; i++) {
            if (this.CarList[i] != null) {
                if ((this.CarList[i].WithinRange(low, high) == true) && this.CarList[i].isAvailable() == true) {
                    System.out.println(this.CarList[i]);
                }
            }
        }
    }

    public String toString() {
        String text = "" + this.Name + "\n\n";
        for (int i = 0; i < this.MaxCars; i++) {
            if (this.CarList[i] != null) {
                text = text + this.CarList[i] + "\n";
            }
        }
        return text;
    }

    public static void main(String[] args) {
        // main method that tests the class

        Car[] list = new Car[] {
                new Car('M', 'B', 'M', 'R', 400),
                new Car('N', 'C', 'N', 'N', 1400),
                new Car('E', 'D', 'C', 'D', 800)
        };

        CarRental avis = new CarRental("AVIS", list);
        System.out.println(avis);
        CarRental alamo = new CarRental("ALAMO", avis.CarList);
        System.out.println(alamo);

        alamo.Add(new Car('M', 'B', 'N', 'N', 2000));
        System.out.println(alamo);
        alamo.Delete("Mini");
        System.out.println(alamo);

    }

}
