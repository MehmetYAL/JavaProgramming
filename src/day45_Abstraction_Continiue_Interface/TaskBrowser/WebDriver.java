package day45_Abstraction_Continiue_Interface.TaskBrowser;

public interface WebDriver extends SearchContext{


    //Abstract methods (return-type is void):
    // get(String url);
    //close();
    //quit();
    //getTitle();

    void get(String url);
    void close();
    void quit();
    void getTitle();
}