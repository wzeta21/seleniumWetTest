package page.ticktick;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class TaskSection {
    public Button listPlusBtn = new Button(By.xpath("//p[text()='Lists']//following-sibling::button"));

    public Label taskLabel;// = new Label(By.xpath(taskName));

    public void setTaskName(String name){
        taskLabel = new Label(By.xpath("//p[text()='"+name+"']"));
    }
}
