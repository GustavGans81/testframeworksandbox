package de.franke.testframeworksandbox;

import org.mockito.ArgumentMatcher;

import java.util.Arrays;
import java.util.List;


/**
 * @author  Arnold Franke - franke@synyx.de
 */
public class IsAvenger extends ArgumentMatcher<String> {

    private List avengers = Arrays.asList("Iron Man", "Hulk", "Thor", "Captain America", "Black Widow", "Hawk Eye");

    @Override
    public boolean matches(Object hero) {

        return avengers.contains(hero);
    }
}
