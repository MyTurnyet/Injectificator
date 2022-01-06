package dev.paigewatson.injectificator.service;

import dev.paigewatson.injectificator.models.BabyInjectedClass;
import dev.paigewatson.injectificator.models.BaseInjectedClass;
import dev.paigewatson.injectificator.models.ChildInjectedClass;
import dev.paigewatson.injectificator.models.ProblemChildInjectedClass;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Tag("Unit")
 class InjectedClassServiceTests
{
    @Test
    void should_TakeAListOfInjectedChildren()
    {
        final List<BaseInjectedClass> baseInjectedClasses = List.of(new ChildInjectedClass(), new BabyInjectedClass(), new ProblemChildInjectedClass());
        final InjectedClassService service = new InjectedClassService(baseInjectedClasses);
        final String allText = service.getAllText();
        assertThat(allText).isEqualTo("I'm the favorite - i'm the favorite - I'M THE FAVORITE - ");
    }
}
