package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/");
        String title = driver.getTitle();
        if (title.contains("Browser Automation")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}