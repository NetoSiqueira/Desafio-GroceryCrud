package page;

import org.openqa.selenium.By;

public class FormPage {

    public final By fieldCustomName = By.id("field-customerName");
    public final By fieldPhone = By.id("field-phone");
    public final By fieldAdress = By.id("field-addressLine1");
    public final By fieldCreditLimit = By.id("field-creditLimit");
    public final By saveBackButton = By.id("save-and-go-back-button");
    public final By AddRecord = By.linkText("Add Record");
    public final By edit = By.linkText("Edit");
    public final By more = By.xpath("//input[@class='select-row']");
    public final By botaoDeletar = By.linkText("Delete");
    public final By deletar = By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']");

}
