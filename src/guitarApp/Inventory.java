package guitarApp;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList <Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, double price, String builder, String model, String type,
                          String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price,
                builder, model, type, backWood, topWood);
        guitars.add(guitar);

    }

    public ArrayList <Guitar> getGuitars() {
        return guitars;
    }

    public Guitar findGuitarBySerialNumber(String serialNumber) {
        for (Guitar guitar: guitars) {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        throw new IllegalArgumentException("Serial Number not available");
    }
}
