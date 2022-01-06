package dev.paigewatson.injectificator.models;

import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BabyInjectedClass extends BaseInjectedClass
{

    @Override
    public String print()
    {
        return super.print().toLowerCase(Locale.ROOT);
    }
}
