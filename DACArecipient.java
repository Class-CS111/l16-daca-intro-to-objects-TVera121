/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <add @author Tony Vera>
 *
 *	@version 1.0
 **/

//Complete UML class diagram

/* UML CLASS DIAGRAM:
-----------------------------------------
			DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrgin : String
- birthday : int
- validFromDate : int
- experationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
-----------------------------------------
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) :void
+ setCountryOfOrgin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(experationDate : int) : void
+ setSex(sex : char) : void
-----------------------------------------
+ setAll(surname : String, givenNmae : String, uscisNumber : String,
		 countryOfOrgin : String, birthday : int, validFromDate : int,
		 expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	//Write the getter for each instance variable. Remember to include documentation for each method.

	//Documentation for each method

	/**
	* Returns surname of calling object
	* 
	* @return String representing surname
	*/
	public String getSurname()
	{
		return this.surname;
	}
	/**
	* Returns given name of calling object
	* 
	* @return String representing givenName
	*/
	public String getGivenName()
	{
		return this.givenName;
	}
	/**
	* Returns USCIS Number of calling object
	* 
	* @return String representing uscisnumber
	*/
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	/**
	* Returns country of origin of calling object
	* 
	* @return String representing countryOfOrigin
	*/
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;
	}
	/**
	* Returns birthday of calling object
	* 
	* @return int representing birthday in Julian Date Number
	*/
	public int getBirthday()
	{
		return this.birthday;
	}
	/**
	* Returns Valid from date of calling object
	* 
	* @return int representing validFromDate in Julian Date Number
	*/
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	/**
	* Returns expiration date of calling object
	* 
	* @return int representing expirationDate in Julian Date Number
	*/
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	/**
	* Returns gender of calling object
	* 
	* @return char representing sex
	*/
	public char getSex()
	{
		return this.sex;
	}

	/***** MUTATORS *****/
	
	/**
	* Sets surname to parameter value of calling object
	* 
	* @param surname String representing last name
	*/
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	/**
	* Sets givenName to parameter value of calling object
	* 
	* @param surname String representing first name
	*/
	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
	/**
	* Sets uscisNumber to parameter value of calling object
	* 
	* @param uscisNumber String representing uscis number
	*/
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	/**
	* Sets countryOfOrgin to parameter value of calling object
	* 
	* @param countryOfOrigin String representing the country of orgin
	*/
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	* Sets birthday to parameter value of calling object
	* 
	* @param birthday int representing the Julian date of birth
	*/
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	/**
	* Sets validFromDate to parameter value of calling object
	* 
	* @param validFromDate int representing the Julian date of validation
	*/
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	/**
	* Sets expirationDare to parameter value of calling object
	* 
	* @param  expirationDate int representing the Julian date of experation
	*/
	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	/**
	* Sets sex to parameter value of calling object
	* 
	* @param  sex char representing the gender
	*/
	public void setSex(char sex)
	{
		this.sex = sex;
	}
	//Write the setAll method. Remember to include documentation.
	
	/**
	* Sets all parameters values of calling object 
	* @param surname String representing last name
	* @param surname String representing first name
	* @param uscisNumber String representing uscis number
	* @param countryOfOrigin String representing the country of origin
	* @param birthday int representing the Julian date of birth
	* @param validFromDate int representing the Julian date of validation
	* @param  expirationDate int representing the Julian date of experation
	* @param  sex char representing the gender
	*/

	public void setAll(String surname, String givenName, String uscisNumber, 
					   String countryOfOrigin, int birthday, int validFromDate,
					   int expirationDate, char sex)
	{
		this.setSurname(surname);
		this.setGivenName(givenName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);
	}
}