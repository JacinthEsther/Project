package guitarApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InventoryTest {
    Inventory inventory;
    @BeforeEach
    public void setInventory(){
        inventory = new Inventory();
    }

    @Test
    public void inventoryCanBeCreatedTest(){
        assertNotNull(inventory);
    }

    @Test
    public void guitarCanBeAddedTest(){
        inventory.addGuitar("012",5000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");

        assertEquals(1, inventory.getGuitars().size());
    }

    @Test
    public void guitarCanBeGottenTest(){
        inventory.addGuitar("012",5000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");
        inventory.addGuitar("034",9000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");
        inventory.addGuitar("050",50000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");
        inventory.addGuitar("098",4000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");

        Guitar guitar = inventory.findGuitarBySerialNumber("050");
        assertEquals("050", guitar.getSerialNumber());

        System.out.println(guitar);
    }

    @Test
    public void guitarCanBeSearchedTest(){
        inventory.addGuitar("012",5000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");
        inventory.addGuitar("034",9000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");
        inventory.addGuitar("050",50000.00,"Fender","Acoustic",
                "Acoustic","wood","Wood");

      //  Guitar guitar =  inventory. searchGuitar();
    }
}
