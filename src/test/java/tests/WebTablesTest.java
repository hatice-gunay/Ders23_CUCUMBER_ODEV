package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import steps.WebTablesSteps;

public class WebTablesTest extends BaseTest {
    WebTablesSteps appliedTabelSteps = new WebTablesSteps();

    @Test
    public void openTablePage() {
        pageManager.WebTablesPage.openWebTables();
    }

    @Test
    public void clickAdd() {
        pageManager.WebTablesPage.clickAddButton();
    }

    @Test
    public void fillingTable() {
        Configuration.timeout = 20000;
        pageManager.WebTablesPage.fillTable("Hatice", "Günay", "44", "hatice.turegun@gmail.com", "0", "Kalite");
    }

    @Test

    public void submitData() {
        appliedTabelSteps.clickSubmit();
    }

    @Test
    public void clickEditButton() {
        appliedTabelSteps.clickEditButton();
    }


    @Test
    public void newAge() {
        appliedTabelSteps.setNewAge();
    }

    @Test
    public void submitNewAge() {
        appliedTabelSteps.submitNewAge();
    }
}