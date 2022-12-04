package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import vars.constants;

import java.io.IOException;

public class DriverBase {

    WebDriver driver;

    public DriverBase() throws IOException {
        constants c = new constants();
        System.setProperty(c.DRIVER_TYPE, c.DRIVER_LOCATION);
        this.driver = new EdgeDriver();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}




