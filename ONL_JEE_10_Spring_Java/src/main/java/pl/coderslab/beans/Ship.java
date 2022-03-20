package pl.coderslab.beans;

import pl.coderslab.beans.Captain;

public class Ship {

    private Captain captain;

    public Ship(Captain captain) {
        this.captain = captain;
    }

    public Captain getCaptain() {
        return captain;
    }
}
