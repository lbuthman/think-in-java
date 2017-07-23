package src.fourth_edition.controllingexecution;

import src.fourth_edition.accesscontrol.CoolData;

/**
 * Created by lbuthman on 5/20/17.
 */
public class RateCool {

    protected class Shades implements CoolData {

        public void hot() {
            System.out.println("Shades are cool.");
        }

        public void notHot() {
            System.out.println("But not crescent fresh.");
        }
    }

    public CoolData fresh() {
        return new Shades();
    }
}
