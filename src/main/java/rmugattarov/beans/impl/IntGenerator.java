package rmugattarov.beans.impl;

import rmugattarov.beans.api.NumeralProvider;

import java.util.Random;

public class IntGenerator implements NumeralProvider {

    public int getInt() {
        return new Random().nextInt();
    }
}
