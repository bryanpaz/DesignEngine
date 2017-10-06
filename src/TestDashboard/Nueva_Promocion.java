package TestDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nueva_Promocion extends Entrar_Empresa {
  @Test(testName="Test Promoción",description="Test de Nueva Promoción",priority=5)
  public void Test_Promocion() {
	  try {
		  String btn = "//DIV[@class='glyphicon glyphicon-plus frenzyTitleColorText frenzyCircleButton clickCursor ng-scope']";
			String btnpromo = "(//DIV[@class='bariolBold optionSubMenu clickCursor'])[1]";

			// Dentro de promo
			String tpromo = "(//INPUT[@type='text'])[1]";
			String dpromo = "(//TEXTAREA[@type='text'])[1]";
			String url = "(//INPUT[@type='text'])[2]";
			String fpub = "(//INPUT[@type='date'])[1]";
			String ff = "(//INPUT[@type='date'])[2]";
			String hpub = "(//INPUT[@type='time'])[1]";
			String hf = "(//INPUT[@type='time'])[2]";
			String tyc = "(//TEXTAREA[@type='text'])[2]";
			String crear = "//DIV[@class='frenzyButton']";

			WebDriverWait wait = new WebDriverWait(driver,30);
			
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btn)));
			  driver.findElement(By.xpath(btn)).click();
			  
			Thread.sleep(1000);
			driver.findElement(By.xpath(btnpromo)).click();
			
			//Promo
			Thread.sleep(2000);
			driver.findElement(By.xpath(tpromo)).click();
			driver.findElement(By.xpath(tpromo)).sendKeys("TestPromo1");
			
			driver.findElement(By.xpath(dpromo)).click();
			driver.findElement(By.xpath(dpromo)).sendKeys("Descripción de la promoción de prueba");
			
			driver.findElement(By.xpath(url)).click();
			driver.findElement(By.xpath(url)).sendKeys("https://www.bryanpaz.com");
			
			driver.findElement(By.xpath(fpub)).click();
			driver.findElement(By.xpath(fpub)).sendKeys("28092017");
			
			driver.findElement(By.xpath(ff)).click();
			driver.findElement(By.xpath(ff)).sendKeys("28102017");
			
			driver.findElement(By.xpath(hpub)).click();
			driver.findElement(By.xpath(hpub)).sendKeys("1000");
			
			driver.findElement(By.xpath(hf)).click();
			driver.findElement(By.xpath(hf)).sendKeys("1000");
			
			driver.findElement(By.xpath(tyc)).click();
			driver.findElement(By.xpath(tyc)).sendKeys("Descripción del test correspondiente.");
			
			driver.findElement(By.xpath(crear)).click();
	  }catch (Exception e) {
		  e.printStackTrace();
		  Assert.fail("hoverServices method failed in ServicesFrenzy " + e.getMessage());
	  }
  }
}
