package jp.gihyo.jenkinsbook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ResultPage {
	private WebDriver driver;
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}
	
    public String getText() {
        return driver.findElement(By.xpath("//p")).getText();
    }
}
