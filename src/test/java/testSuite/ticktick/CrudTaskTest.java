package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrudTaskTest extends TestBase{
    @Test
    public void verifyCRUDTask(){
        // login:
        mainPage.loginH.click();
        loginSection.login(user, password);
        boolean resp = mainMenu.userImg.isControlDisplayed();
        Assertions.assertTrue(resp, "ERROR! the login was faield");
    }
}
