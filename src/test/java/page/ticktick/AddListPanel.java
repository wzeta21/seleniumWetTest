package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddListPanel {
    public TextBox taskName = new TextBox(By.id("edit-project-name"));
    public Button saveBtn = new Button(By.xpath("//button[text()='Save']"));
}
