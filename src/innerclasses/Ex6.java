package src.innerclasses;

import src.accesscontrol.CoolData;
import src.controllingexecution.RateCool;

/**
 * Created by lbuthman on 5/20/17.
 */
public class Ex6 extends RateCool {

    public static CoolData totally() {
        RateCool rc = new RateCool();
        CoolData cd = rc.fresh();
        return cd;
    }

    public static void main(String[] args) {

        CoolData cd = totally();
        cd.hot();
        cd.notHot();
    }
}
