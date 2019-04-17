package be.tomcools.infrastructure;

import be.tomcools.domain.secundaryport.GetStuff;

import java.util.Random;

public class StuffGetterImpl implements GetStuff {
    @Override
    public String getStuff() {
        return "Random double for you! :-) " + new Random().nextDouble();
    }
}
