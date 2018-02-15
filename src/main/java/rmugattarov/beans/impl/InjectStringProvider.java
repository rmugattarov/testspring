package rmugattarov.beans.impl;

import org.springframework.stereotype.Component;
import rmugattarov.beans.api.NumeralProvider;
import rmugattarov.beans.api.StringProvider;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class InjectStringProvider implements StringProvider {
    @Inject
    private IntGenerator intGenerator;

    public String getString() {
        return "Injected " + intGenerator.getInt();
    }
}
