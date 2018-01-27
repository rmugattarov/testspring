package rmugattarov.beans.impl;

import rmugattarov.beans.api.NumeralProvider;
import rmugattarov.beans.api.StringProvider;

public class HelloStringProvider implements StringProvider {
    private NumeralProvider numeralProvider;

    public HelloStringProvider(NumeralProvider numeralProvider){

        this.numeralProvider = numeralProvider;
    }
    public String getString() {
        return "Hello " + numeralProvider.getInt();
    }
}
