/********************************************
*	DEVELOPER:	Tony Vera
* COLLABORATORS: N/A
*	LAST MODIFIED:	4/14/2025
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();

    test1.setSurname("Chapeton-Lamas");
    test1.setGivenName("Nery");
	  test1.setUscisNumber("12-4-789");
	  test1.setCountryOfOrigin("Guatemala");
	  test1.setBirthday(123456);
    test1.setValidFromDate(234567);
    test1.setExpirationDate(234789);
	  test1.setSex('M');

    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: "+ test1.getSurname());
    System.out.println("Given name: "+ test1.getGivenName());
    System.out.println("USCIS Number: "+ test1.getUscisNumber());
    System.out.println("Country of Origin: "+ test1.getCountryOfOrigin());
    System.out.println("Birthday(JDN): "+ test1.getBirthday());
    System.out.println("Valid From Date(JDN): "+ test1.getValidFromDate());
    System.out.println("Expiration Date(JDN): "+ test1.getExpirationDate());
    System.out.println("Sex: "+ test1.getSex());
    
    test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');

    System.out.println("\nPerson 2");
    System.out.println("-----------------------------");
    System.out.println("Surname: "+ test2.getSurname());
    System.out.println("Given name: "+ test2.getGivenName());
    System.out.println("USCIS Number: "+ test2.getUscisNumber());
    System.out.println("Country of Origin: "+ test2.getCountryOfOrigin());
    System.out.println("Birthday(JDN): "+ test2.getBirthday());
    System.out.println("Valid From Date(JDN): "+ test2.getValidFromDate());
    System.out.println("Expiration Date(JDN): "+ test2.getExpirationDate());
    System.out.println("Sex: "+ test2.getSex());
  }
}