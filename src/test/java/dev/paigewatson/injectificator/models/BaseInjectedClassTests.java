package dev.paigewatson.injectificator.models;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.parsing.Problem;

import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Tag("Unit")
 class BaseInjectedClassTests
{

    @Test
    void should_printFromChildClass()
    {
        final BaseInjectedClass injectedClass = new ChildInjectedClass();
        assertThat(injectedClass.print()).isEqualTo("I'm the favorite");
    }

    @Test
    void should_printAllLowerCase_fromBabyClass()
    {

        final BaseInjectedClass injectedClass = new BabyInjectedClass();
        assertThat(injectedClass.print()).isEqualTo("I'm the favorite".toLowerCase(Locale.ROOT));
    }

    @Test
    void should_printAllCaps_fromProblemChildClass()
    {
        final BaseInjectedClass injectedClass = new ProblemChildInjectedClass();
        assertThat(injectedClass.print()).isEqualTo("I'm the favorite".toUpperCase(Locale.ROOT));
    }
}
