package day45_Abstraction_Continiue_Interface.TaskBrowser;

public interface SearchContext {

    //Abstract methods:
    void findElement(String locator);
    void findElements(String locator);

    //2. Create a child interface of SearchContext named WebDriver
    //Abstract methods (return-type is void):
    //get(String url);
    //close();
    //quit();
    //getTitle();


}
