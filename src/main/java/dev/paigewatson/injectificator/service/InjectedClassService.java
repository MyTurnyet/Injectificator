package dev.paigewatson.injectificator.service;

import dev.paigewatson.injectificator.models.BaseInjectedClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InjectedClassService
{
    private final List<BaseInjectedClass> injectedClasses;

    @Autowired
    public InjectedClassService(List<BaseInjectedClass> injectedClasses)
    {
        this.injectedClasses = injectedClasses;
    }

    public String getAllText()
    {
        final StringBuilder builder = new StringBuilder();
        injectedClasses.forEach(baseInjectedClass -> builder.append(baseInjectedClass.print()).append(" - "));
        return builder.toString();
    }
}
