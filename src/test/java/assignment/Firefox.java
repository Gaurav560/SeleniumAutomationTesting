package assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/documentation/");
        String title = driver.getTitle();
        if (title.contains("Browser Automation")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
