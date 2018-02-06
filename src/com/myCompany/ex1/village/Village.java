/**
 * 
 */
package com.myCompany.ex1.village;

/**
 * @author Tom
 *
 */
public class Village implements HasVillagers, GrowingVillage 
{
	private int numberOfVillagers;
	/* (non-Javadoc)
	 * @see com.myCompany.ex1.village.GrowingVillage#addVillagers(int)
	 */
	@Override
	public int addVillagers(int addedVillagers) 
	{
		numberOfVillagers += addedVillagers;
		return numberOfVillagers;
	}

	/* (non-Javadoc)
	 * @see com.myCompany.ex1.village.HasVillagers#countOfVillagers()
	 */
	@Override
	public int countOfVillagers() 
	{
		return numberOfVillagers;
	}

}
