package day51_Map_Enum;

public class TestEnum {
    public static void main(String[] args) {
        Browser browser=Browser.CHROME;
       // Browser browser2=Browser.EDGE;
        switch (browser){
            case CHROME:
                System.out.println("Chrome is Selected");
                break;
            case FIREFOX:
                System.out.println("Firefox is Selected");
                break;
            case OPERA:
                System.out.println("Opera is Selected");
                break;
            case EDGE:
                System.out.println("Chrome is Selected");
                break;
            default:
                System.out.println("Safari is seleceted");

        }
        System.out.println("=========================");

        Season seasons=Season.SUMMER;

    }
}
