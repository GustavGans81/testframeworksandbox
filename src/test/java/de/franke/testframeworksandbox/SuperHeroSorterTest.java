package de.franke.testframeworksandbox;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;

import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

import static org.mockito.Matchers.argThat;

import static org.mockito.Mockito.when;


/**
 * @author  Arnold Franke - franke@synyx.de
 */
@RunWith(MockitoJUnitRunner.class)
public class SuperHeroSorterTest {

    @Mock
    private SuperHeroIdentifier superHeroIdentifierMock;
    private SuperHeroSorter sut;

    @Before
    public void setUp() {

        sut = new SuperHeroSorter(superHeroIdentifierMock);
    }


    @Test
    public void testExtractAvengers() {

        when(superHeroIdentifierMock.isAvenger(argThat(new IsAvenger()))).thenReturn(true);
        assertThat(sut.extractAvengers(Arrays.asList("Hulk")).size(), is(1));
        assertThat(sut.extractAvengers(Arrays.asList("Spiderman")).size(), is(0));
    }
}
