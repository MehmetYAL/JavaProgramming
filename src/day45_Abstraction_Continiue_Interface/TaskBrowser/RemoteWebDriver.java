package day45_Abstraction_Continiue_Interface.TaskBrowser;

public class RemoteWebDriver implements TakeScreenShot, WebDriver, JavaScriptExecuter{



    //Variables:
    //browserName (final)
    //Encapsulate all the fields
    //Add Constructor that can set the fieled
    //and displays the following message:
    //"Opening "+
    //browserName+" browser"
    //Overridden methods and their
    //implementations:
    //get(String url):
    //"Getting the "+url+" on " + browserName + " browser"
    //findElement(String locator):
    //browserName+" driver locating an element by " + locator
    //findElements(String locator):
    //browserName+" driver locating multiple elements by " + locator
    //close():
    //"Closing
    //the tab on "+browserName+" browser"
    //quit():
    //"Quitting
    //the "+browserName+" browser"
    //getTitle():
    //browserName
    //+ "driver is getting the title"
    //takeScreenShot():
    //"Taking
    //screenshot on: " + browserName + " browser"
    //executeScript(String script):
    //"Executing
    //\"" + script + "\" script on" + browserName +" browser"

    private final String browserName;

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public String toString() {
        return "Opening "+ browserName+" browser";
    }


    @Override
    public void executeScript(String script) {
        System.out.println("Executing\"" + script + "\" script on" + browserName +" browser");

    }

    @Override
    public void findElement(String locator) {
        System.out.println(browserName+" driver locating an element by " + locator);

    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName+" driver locating multiple elements by " + locator);

    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking screenshot on: " + browserName + " browser");

    }

    @Override
    public void get(String url) {
        System.out.println("Getting the "+url+" on " + browserName + " browser");

    }

    @Override
    public void close() {
        System.out.println("Closing the tab on "+browserName+" browser");

    }

    @Override
    public void quit() {
        System.out.println("Quitting the "+browserName+" browser");

    }

    @Override
    public void getTitle() {
        System.out.println(browserName + "driver is getting the title");

    }
}
