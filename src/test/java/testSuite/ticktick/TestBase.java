package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.*;
import session.Session;

public class TestBase {
    private util.GetProperties GetProperties;
    String user = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();
    public MainPage mainPage = new MainPage();
    public LoginSection loginSection = new LoginSection();
    public MainMenu mainMenu = new MainMenu();
    public TaskSection taskSection = new TaskSection();
    public AddListPanel addListPanel = new AddListPanel();
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }
    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
