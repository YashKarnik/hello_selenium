package stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverBase;

import java.io.IOException;
import java.time.Duration;


public class Youtube {
    WebDriver driver = null;

    @Given("I am logged into youtube")
    public void i_am_logged_into_youtube() throws IOException {
        this.driver = (new DriverBase()).getDriver();
        this.driver.get("https://www.youtube.com?themeRefresh=0");
    }

    @When("User searches for video")
    public void user_searches_for_video() {
        WebElement searchBar = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
        searchBar.sendKeys("ABCDE");
        searchBar.sendKeys(Keys.RETURN);
    }

    @When("Clicks on first video")
    public void clicks_on_first_video() {
        WebElement firstVideo = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//ytd-video-renderer")))
                .findElement(By.xpath("//a[@id='video-title']"));
        firstVideo.click();
    }

    @Then("User should have video title")
    public void user_should_have_video_title() {
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[1]/h1/yt-formatted-string")));
//        super-title
//        this.driver.close();
//        Assert.assertEquals(title, "abcdefg");

        System.out.println(title.getTagName());
        System.out.println(title.getAttribute("innerHTML"));
        System.out.println(title);

//        title.getScreenshotAs()
        System.out.println("ABCDEFGHIJ");

//        System.out.println("abcdefghi");


    }

}
