package vars;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class constants {
    public final String DRIVER_TYPE;
    public final String DRIVER_LOCATION;

    public constants() throws IOException {
        FileReader reader = new FileReader("src/test/resources/config/application.properties");
        Properties p = new Properties();
        p.load(reader);
        this.DRIVER_TYPE = p.getProperty("driver.type");
        this.DRIVER_LOCATION = p.getProperty("driver.location");
    }
}
