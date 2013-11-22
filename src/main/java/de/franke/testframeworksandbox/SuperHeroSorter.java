package de.franke.testframeworksandbox;

import java.util.ArrayList;
import java.util.List;


/**
 * @author  Arnold Franke - franke@synyx.de
 */
public class SuperHeroSorter {

    private SuperHeroIdentifier superHeroIdentifier;

    public SuperHeroSorter(SuperHeroIdentifier superHeroIdentifier) {

        this.superHeroIdentifier = superHeroIdentifier;
    }

    public List<String> extractAvengers(List<String> superheroes) {

        List<String> avengers = new ArrayList<String>();

        for (String superhero : superheroes) {
            if (superHeroIdentifier.isAvenger(superhero)) {
                avengers.add(superhero);
            }
        }

        return avengers;
    }
}
