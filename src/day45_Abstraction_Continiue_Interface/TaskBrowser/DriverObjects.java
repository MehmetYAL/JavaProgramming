package day45_Abstraction_Continiue_Interface.TaskBrowser;

public class DriverObjects {
    public static void main(String[] args) {

        SafariDriver driver = new SafariDriver("Safari");

        System.out.println(driver);
        driver.close();
        driver.executeScript("aa");
        driver.findElements("java");
        driver.getBrowserName();
        driver.getTitle();
        driver.takeScreenShot();
        driver.quit();
    }
}

