package utils;


import org.openqa.selenium.WebDriver;

public class Runner {
    public static void main(String[] args) throws Exception {
        WebDriver driver = (new DriverBase()).getDriver();
        driver.get("https://www.youtube.com");

    }
}
