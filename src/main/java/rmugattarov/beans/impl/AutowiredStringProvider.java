package rmugattarov.beans.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rmugattarov.beans.api.NumeralProvider;
import rmugattarov.beans.api.StringProvider;

@Component
public class AutowiredStringProvider implements StringProvider {
//    @Autowired
    private NumeralProvider numeralProvider;

    public String getString() {
        return "Autowired " + numeralProvider.getInt();
    }
}
