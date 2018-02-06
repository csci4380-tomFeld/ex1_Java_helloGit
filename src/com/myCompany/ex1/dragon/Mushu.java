/**
 * 
 */
package com.myCompany.ex1.dragon;

import com.myCompany.ex1.village.Village;

/**
 * @author Tom
 *
 */
public class Mushu implements Dragon 
{

	/* (non-Javadoc)
	 * @see com.myCompany.ex1.dragon.Dragon#breatheFire()
	 */
	@Override
	public boolean breatheFire() 
	{
		return true;
	}

	/* (non-Javadoc)
	 * @see com.myCompany.ex1.dragon.Dragon#canFly()
	 */
	@Override
	public Boolean canFly() 
	{
		return false;
		//return new Boolean(false);
	}

	/* (non-Javadoc)
	 * @see com.myCompany.ex1.dragon.Dragon#eatVillage(com.myCompany.ex1.village.Village)
	 */
	@Override
	public boolean eatVillage(Village village) 
	{
		return false;
	}

}
