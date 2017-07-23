package src.fourth_edition.reusingclasses;

/**
 * The full process of initialization
 * Created by lbuthman on 5/9/17.
 */

class LightFixture {

    private String brand = printInit("LightFixture generic brand #1");

    LightFixture() {
        System.out.println("LightFixture constructor");
    }

    private static String genericBrand = printInit("LightFixture generic brand #2");

    static String printInit(String s) {
        System.out.println(s);
        return "LightFixture printInit return";
    }
}

class FloorLamp extends LightFixture {

    private String brand = printInit("FloorLamp specific brand #1");

    public FloorLamp() {
        System.out.println("FloorLamp constructor");
    }

    private static String specificBrand = printInit("FloorLamp specific brand #2");

}

class DeskLamp extends LightFixture {

    private String brand = printInit("DeskLamp specific brand #1");

    public DeskLamp() {
        System.out.println("DeskLamp constructor");
    }

    private static String specificBrand = printInit("DeskLamp specific brand #2");
}

public class Ex23 {
    public static void main(String[] args) {

        System.out.println("Lamp constructor.");
        FloorLamp fl = new FloorLamp();
        DeskLamp dl = new DeskLamp();
    }

}
