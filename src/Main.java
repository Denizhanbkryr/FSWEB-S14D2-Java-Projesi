import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();


        Bed bed = new Bed("wood",5,180,50,5);
        System.out.println(bed.toString("Denizhan"));

        Wall wall1 = new Wall("North");
        wall1.create();
        Wall wall2 = new Wall("East");
        wall2.create();
        Wall wall3 = new Wall("West");
        wall3.create();
        Wall wall4 = new Wall("South");
        wall4.create();


        Bedroom bedroom = new Bedroom("double",wall1, wall2, wall3, wall4, ceiling,
                new Bed("DOUBLE", 2, 2, 2, 2),
                new Lamp(LampType.LAVA, true, 120),
                new Wardrobe(1, 3, 20),
                new Carpet(1, 3, PaintColor.BLUE));

        System.out.println("-----------------------------------");
        System.out.println(bedroom);
        System.out.println("-----------------------------------");

        bedroom.createBedroom();

    }
}