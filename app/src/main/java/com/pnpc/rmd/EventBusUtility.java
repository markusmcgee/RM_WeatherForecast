package com.pnpc.rmd;

import com.squareup.otto.Bus;

/**
 * Created by markusmcgee on 4/11/16.
 */
public final class EventBusUtility {

    private static EventBusUtility instance = null;
    private EventBusUtility() { }
    public static Bus getInstance() {
        return new Bus();
    }

}
