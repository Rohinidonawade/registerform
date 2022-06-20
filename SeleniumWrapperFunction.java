package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunction {

private Pojo objPojo;
	
	public SeleniumWrapperFunction(Pojo pojo) {
		this.objPojo = pojo;		
	}
	
	     //Text
	public boolean setText(By locator, String inpValue) {
		try {
			objPojo.getDriver().findElement(locator).sendKeys(inpValue);
			return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	    //Clickbutton, Link, dropdownclick
	public boolean click(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	        //getText
	public String getText(By locator) {
		try {
			String strGetText = objPojo.getDriver().findElement(locator).getText();			
			return strGetText;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();             
		}	
		return null;
     }
	
	      //CheckBox
	public boolean selectCheckBox(By locator) {
		try {
				WebElement checkBox= objPojo.getDriver().findElement(locator);
				System.out.println(checkBox.isSelected());		  
		        return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	  
	          //verify checkbox
	public void verifyCheckBox(By locator) {
		WebElement checkBox= objPojo.getDriver().findElement(locator);
		System.out.println(checkBox.isSelected());
        
        if(checkBox.isSelected())
      	  System.out.println("Selected");
        else
      	  System.out.println("is not selected");
	}
	
	       //Dropdown selectTable
	public boolean slectDropDown(By locator,String inpValue) {
		try {
				Select dropDown = new Select(objPojo.getDriver().findElement(locator));
				dropDown.selectByVisibleText(inpValue);
				return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	      //Mouse Hover
	public boolean checkMouseHover(By locator,String inpValue) {
		try {
				Actions action = new Actions(objPojo.getDriver());
				WebElement mouseHover = objPojo.getDriver().findElement(locator);
				action.moveToElement(mouseHover).perform();				
				return true;
		} 
		catch (Exception exception) {
             System.out.println("Error message is :" +exception.getMessage());
             exception.printStackTrace();
             return false;
		}
     }
	
	      //Slider
    //Mouse Hover
	public boolean checkSliderMovement(By locator,String inpValue) {
		try {
				Actions action = new Actions(objPojo.getDriver());
				WebElement slider = objPojo.getDriver().findElement(locator);
				action.dragAndDropBy(slider, 100, 200);			
				return true;
		} 
		catch (Exception exception) {
           System.out.println("Error message is :" +exception.getMessage());
           exception.printStackTrace();
           return false;
		}
   }
	        //Search
	public boolean searchElement(By locator,String inpValue) {
		try {
			WebElement search = objPojo.getDriver().findElement(locator);
				search.sendKeys(inpValue);
				search.click();
				return true;
		} 
		catch (Exception exception) {
           System.out.println("Error message is :" +exception.getMessage());
           exception.printStackTrace();
           return false;
		}
   }
}
