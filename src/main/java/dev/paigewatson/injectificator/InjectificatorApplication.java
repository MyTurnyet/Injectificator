package dev.paigewatson.injectificator;

import dev.paigewatson.injectificator.service.InjectedClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class InjectificatorApplication
{


    public static void main(String[] args)
    {
        SpringApplication.run(InjectificatorApplication.class, args);
    }

    @Autowired
    public InjectificatorApplication(InjectedClassService service){

        final String allText = service.getAllText();
        System.out.println("\n\n");
        System.out.println(allText);
        System.out.println("\n\n");
    }
}
