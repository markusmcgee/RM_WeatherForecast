package com.pnpc.rmd;

import com.squareup.otto.Bus;

/**
 * Created by markusmcgee on 4/11/16.
 *
 * Otto EventBus singleton to dispatching event messages.
 *
 */

public final class EventBusUtility {

    private static Bus instance = null;
    private EventBusUtility() { }
    public static synchronized Bus getInstance() {
        if (instance == null) {
            instance = new Bus();
        }
        return instance;
    }


}
