package guru.springframework.didemo.Services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {


    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Service de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer Grubdienst";
    }
}
