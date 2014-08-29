package org.vaadin.addon.vol3.client;

import java.io.Serializable;

/**
 * Created by mjhosio on 01/07/14.
 */
public class OLDeviceOptions implements Serializable {
    //When set to false, no tiles will be loaded while animating, which improves responsiveness on devices with slow memory. Default is true.
    public boolean loadTilesWhileAnimating=true;
    // When set to false, no tiles will be loaded while interacting, which improves responsiveness on devices with slow memory. Default is true.
    public boolean loadTilesWhileInteracting=true;
}
