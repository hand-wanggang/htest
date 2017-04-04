/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2017-1-24 15:33:42                          ---
 * ----------------------------------------------------------------
 */
package com.hand.wanggang.jalo;

import com.hand.wanggang.constants.WanggangConstants;
import com.hand.wanggang.jalo.Borrow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustomReader}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomReader extends GenericItem
{
	/** Qualifier of the <code>CustomReader.cardid</code> attribute **/
	public static final String CARDID = "cardid";
	/** Qualifier of the <code>CustomReader.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CustomReader.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>CustomReader.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>CustomReader.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>CustomReader.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>CustomReader.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>CustomReader.availabledays</code> attribute **/
	public static final String AVAILABLEDAYS = "availabledays";
	/** Qualifier of the <code>CustomReader.borrows</code> attribute **/
	public static final String BORROWS = "borrows";
	/**
	* {@link OneToManyHandler} for handling 1:n BORROWS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Borrow> BORROWSHANDLER = new OneToManyHandler<Borrow>(
	WanggangConstants.TC.BORROW,
	false,
	"reader",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CARDID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(AVAILABLEDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomReader.getAddress requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.address</code> attribute.
	 * @return the address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.address</code> attribute. 
	 * @return the localized address
	 */
	public Map<Language,String> getAllAddress(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ADDRESS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.address</code> attribute. 
	 * @return the localized address
	 */
	public Map<Language,String> getAllAddress()
	{
		return getAllAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomReader.setAddress requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.address</code> attribute. 
	 * @param value the address
	 */
	public void setAllAddress(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.address</code> attribute. 
	 * @param value the address
	 */
	public void setAllAddress(final Map<Language,String> value)
	{
		setAllAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive()
	{
		return getAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Integer value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final int value)
	{
		setAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final int value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.availabledays</code> attribute.
	 * @return the availabledays
	 */
	public Integer getAvailabledays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AVAILABLEDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.availabledays</code> attribute.
	 * @return the availabledays
	 */
	public Integer getAvailabledays()
	{
		return getAvailabledays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.availabledays</code> attribute. 
	 * @return the availabledays
	 */
	public int getAvailabledaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAvailabledays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.availabledays</code> attribute. 
	 * @return the availabledays
	 */
	public int getAvailabledaysAsPrimitive()
	{
		return getAvailabledaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.availabledays</code> attribute. 
	 * @param value the availabledays
	 */
	public void setAvailabledays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AVAILABLEDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.availabledays</code> attribute. 
	 * @param value the availabledays
	 */
	public void setAvailabledays(final Integer value)
	{
		setAvailabledays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.availabledays</code> attribute. 
	 * @param value the availabledays
	 */
	public void setAvailabledays(final SessionContext ctx, final int value)
	{
		setAvailabledays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.availabledays</code> attribute. 
	 * @param value the availabledays
	 */
	public void setAvailabledays(final int value)
	{
		setAvailabledays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.borrows</code> attribute.
	 * @return the borrows
	 */
	public Collection<Borrow> getBorrows(final SessionContext ctx)
	{
		return BORROWSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.borrows</code> attribute.
	 * @return the borrows
	 */
	public Collection<Borrow> getBorrows()
	{
		return getBorrows( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.borrows</code> attribute. 
	 * @param value the borrows
	 */
	public void setBorrows(final SessionContext ctx, final Collection<Borrow> value)
	{
		BORROWSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.borrows</code> attribute. 
	 * @param value the borrows
	 */
	public void setBorrows(final Collection<Borrow> value)
	{
		setBorrows( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to borrows. 
	 * @param value the item to add to borrows
	 */
	public void addToBorrows(final SessionContext ctx, final Borrow value)
	{
		BORROWSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to borrows. 
	 * @param value the item to add to borrows
	 */
	public void addToBorrows(final Borrow value)
	{
		addToBorrows( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from borrows. 
	 * @param value the item to remove from borrows
	 */
	public void removeFromBorrows(final SessionContext ctx, final Borrow value)
	{
		BORROWSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from borrows. 
	 * @param value the item to remove from borrows
	 */
	public void removeFromBorrows(final Borrow value)
	{
		removeFromBorrows( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.cardid</code> attribute.
	 * @return the cardid
	 */
	public String getCardid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.cardid</code> attribute.
	 * @return the cardid
	 */
	public String getCardid()
	{
		return getCardid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.cardid</code> attribute. 
	 * @param value the cardid
	 */
	public void setCardid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.cardid</code> attribute. 
	 * @param value the cardid
	 */
	public void setCardid(final String value)
	{
		setCardid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomReader.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomReader.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
