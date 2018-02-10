package rmugattarov.beans.impl;

import org.springframework.stereotype.Component;
import rmugattarov.beans.api.NumeralProvider;

import java.util.Random;

@Component
public class IntGenerator implements NumeralProvider {
    public int getInt() {
        return new Random().nextInt();
    }
}
