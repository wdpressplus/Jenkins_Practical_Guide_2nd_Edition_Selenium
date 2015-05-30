package jp.gihyo.jenkinsbook.page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class TopPage {
	private WebDriver driver;
	
	public TopPage(WebDriver driver) {
		this.driver = driver;
	}

    public String getFirstNameLabel() {
    	return driver.findElement(By.xpath("//label[@for='FirstName']")).getText();
    }
    
    public String getLastNameLabel() {
    	return driver.findElement(By.xpath("//label[@for='LastName']")).getText();
    }
    
    public boolean hasFirstNameInput() {
		try {
			driver.findElement(By.xpath("//input[@type='text' and @name='FirstName']"));
		} catch(NoSuchElementException e) {
			return false;
		}
		
		return true;
    }
    
    public boolean hasLastNameInput() {
		try {
			driver.findElement(By.xpath("//input[@type='text' and @name='LastName']"));
		} catch(NoSuchElementException e) {
			return false;
		}
		
		return true;
    }
    
    public boolean hasSubmit() {
		try {
			driver.findElement(By.xpath("//input[@type='submit' and @name='submit']"));
		} catch(NoSuchElementException e) {
			return false;
		}
		
		return true;
    }
    
    public void setFirstName(String firstName) {
        driver.findElement(By.xpath("//input[@type='text' and @name='FirstName']")).clear();
        driver.findElement(By.xpath("//input[@type='text' and @name='FirstName']")).sendKeys(firstName);
    }
    
    public void setLastName(String lastName) {
        driver.findElement(By.xpath("//input[@type='text' and @name='LastName']")).clear();
        driver.findElement(By.xpath("//input[@type='text' and @name='LastName']")).sendKeys(lastName);
    }

    public void submit() {
		driver.findElement(By.xpath(
				"//input[@type='submit' and @name='submit']")).submit();
	}
}
