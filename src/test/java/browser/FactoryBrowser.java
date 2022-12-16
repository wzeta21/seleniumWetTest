package browser;

public class FactoryBrowser {
    public static IBrowser make(String browserType){
        IBrowser browser;
        switch (browserType.toLowerCase()){
            case "chrome":
                browser= new Chrome();
                break;
            case "headless":
                browser=new Headless();
                break;
            case "grid":
                browser=new Grid();
                break;
            default:
                browser= new Firefox();
                break;
        }
        return browser;
    }
}
