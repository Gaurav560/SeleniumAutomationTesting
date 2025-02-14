package assignment;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/documentation/");
        String title = driver.getTitle();
        if (title.contains("Browser Automation")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
