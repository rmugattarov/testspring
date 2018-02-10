package rmugattarov.beans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import rmugattarov.beans.api.NumeralProvider;
import rmugattarov.beans.api.StringProvider;

public class AutowiredStringProvider implements StringProvider {
    @Autowired
    @Qualifier("intProvider")
    private NumeralProvider numeralProvider;

    public String getString() {
        return "Autowired " + numeralProvider.getInt();
    }
}
