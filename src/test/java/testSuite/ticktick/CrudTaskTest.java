package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class CrudTaskTest extends TestBase{
    @Test
    public void verifyCRUDTask(){
        // login:
        mainPage.loginH.click();
        loginSection.login(user, password);
        boolean resp = mainMenu.userImg.isControlDisplayed();
        Assertions.assertTrue(resp, "ERROR! the login was faield");

        //create task
        String taskName = "ZetaTask" + new Date().getTime();
        taskSection.listPlusBtn.click();
        addListPanel.taskName.setText(taskName);
        addListPanel.saveBtn.click();
        taskSection.setTaskName(taskName);
        boolean resp1 = taskSection.taskLabel.isControlDisplayed();
        Assertions.assertTrue(resp1, "ERROR!, there is no task");
    }
}
