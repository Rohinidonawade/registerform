package com.generic;

import java.util.Random;

public class Utilities {
   	
    	private Pojo objPojo;  	

	      //FirstName
	public static String getFirstName() {
	String strFirstName = " ";
		String strArray[] = {"Rohini","Sanjay","Rohan","Rina","Seema","Anand","Priya","Chaitali"};
		strFirstName = strArray[new Random().nextInt(strArray.length)];
		return strFirstName;		
	}
	
	      //LastName
	public static String getLastName() {
		String strLastName = " ";
		String strArray[] = {"Donawade","Patil","Salagare","Tendulkar","Hajare","Khot","Mutnale","Bhuvi"};
		strLastName = strArray[new Random().nextInt(strArray.length)];
		return strLastName;		
	}
	
	    //EmaildId
	public static String getEmailId() {
		String strLastName = " ";
		String strArray[] = {"Rohan","Paru","Abhi","Rani","Priyanka","Seema","Raju"};
		String strValue = "@gmail.com";
		strLastName = strArray[new Random().nextInt(strArray.length)];
		return strLastName.concat(strValue);		
	}

       //MobileNumber
     public String getMobileNumber(int intLeght) {
		
 		String strArray[] = {"99","98","89","73","63"};		
 		String strFirstNumber = strArray[new Random().nextInt(strArray.length)];  		
 		
		String allowChar ="0123456789";
		String randomString = " ";       
		      		
	for(int intIndex=0; intIndex<intLeght-2; intIndex++) {
			int intNum =(int) Math.floor(Math.random()*allowChar.length());
			
			randomString+=allowChar.substring(intNum,intNum+1);			
		}	 
	return strFirstNumber+(randomString).trim();    
      } 
     
          //Password
     public static String getPassword() {
  	   String strPassword="Admin@123";
		return strPassword; 
     }
  
        //random date
     public String getRandomDate() {
 		try {			
 			String strRandomDate=" ";
 			int intRandomDate = (int) (Math.random()*30);
 			if(intRandomDate==0);
 			    strRandomDate="28";
 			    strRandomDate = String.valueOf(intRandomDate).trim();
 			    return strRandomDate;				
 			}catch(Exception exception) {
 				System.out.println("Error msg==>"+ exception.getMessage());
 		return " ";
 		}
 	}
     
         //random month
     public String getRandomMonth() {
  	   String strFirstName = " ";
 		String strArray[] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Act","Nov","Dec"};
 		strFirstName = strArray[new Random().nextInt(strArray.length)];
 		return " ";
     }
     
        //random year
     public String getRandomYear() {
  	   Random  rand = new Random();
  	   int intMax = 2015;
  	   int intMin = 1916;
  	   int rand_int = rand.nextInt((intMax-intMin)+1)+intMin;
  	   System.out.println("Year is :" +rand_int);
		return " ";
  	   
     }
         
     //Gender
     public  String getGender() {
  	   String strGender;
  	   if(Math.random()>0.6) {
  	   strGender = "Male";
  	   }
  	   else if (Math.random()<0.3) {
  	   strGender = "Female";
  	   }
  	   else {
  	   strGender = "Custom";
  	   
  	   }
		return strGender;
  	   }
}

