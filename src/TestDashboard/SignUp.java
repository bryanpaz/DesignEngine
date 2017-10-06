package TestDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp extends InitialConfigs {
  @Test(testName="SignUp",description="Registrar a un usuario ya registrado",priority=2)
  public void Test_SignUp() {
	  try {
		  String FrenzyDashboard = "http://dev-frenzy-dashboard.s3-website-us-east-1.amazonaws.com/#/menu/home";
		  //Ir a la ruta
		  driver.get(FrenzyDashboard);
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  String ButtonRegistrate = "(//P[@class='buttonMenu'][text()='REGÍSTRATE'][text()='REGÍSTRATE'])[1]";
		  String ModalRegistrate = "//DIV[@class='modal-content']";
		  String InpCorreo = "(//INPUT[@type='text'])[1]";
		  String InpNombre = "(//INPUT[@type='text'])[2]";
		  String InpApellid = "(//INPUT[@type='text'])[3]";
		  String InpPassword = "//INPUT[@type='password']";
		  String BtnCrear = "//DIV[@class='redButtonStyle']";
		  String AlertCuenta = "(//DIV[@role='dialog'])[2]";
		  String BtnSalir = "//BUTTON[@type='button'][text()='Salir']";
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ButtonRegistrate)));
		  driver.findElement(By.xpath(ButtonRegistrate)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ModalRegistrate)));
		  driver.findElement(By.xpath(InpCorreo)).sendKeys("strickergt128@gmail.com");
		  driver.findElement(By.xpath(InpNombre)).sendKeys("Dilan");
		  driver.findElement(By.xpath(InpApellid)).sendKeys("Castro");
		  driver.findElement(By.xpath(InpPassword)).sendKeys("PlayStation4");
		  driver.findElement(By.xpath(BtnCrear)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AlertCuenta)));
		  driver.findElement(By.xpath(BtnSalir)).click();
		  
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("Method fail in SignUp " + e.getMessage());
	  }
  }
}
