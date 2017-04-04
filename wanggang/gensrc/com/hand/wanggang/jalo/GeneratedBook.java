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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Book}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBook extends GenericItem
{
	/** Qualifier of the <code>Book.number</code> attribute **/
	public static final String NUMBER = "number";
	/** Qualifier of the <code>Book.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>Book.publisher</code> attribute **/
	public static final String PUBLISHER = "publisher";
	/** Qualifier of the <code>Book.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Book.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>Book.borrows</code> attribute **/
	public static final String BORROWS = "borrows";
	/**
	* {@link OneToManyHandler} for handling 1:n BORROWS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Borrow> BORROWSHANDLER = new OneToManyHandler<Borrow>(
	WanggangConstants.TC.BORROW,
	false,
	"book",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NUMBER, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(PUBLISHER, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.getAuthor requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,AUTHOR,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor()
	{
		return getAllAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.setAuthor requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final Map<Language,String> value)
	{
		setAllAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.borrows</code> attribute.
	 * @return the borrows
	 */
	public Collection<Borrow> getBorrows(final SessionContext ctx)
	{
		return BORROWSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.borrows</code> attribute.
	 * @return the borrows
	 */
	public Collection<Borrow> getBorrows()
	{
		return getBorrows( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.borrows</code> attribute. 
	 * @param value the borrows
	 */
	public void setBorrows(final SessionContext ctx, final Collection<Borrow> value)
	{
		BORROWSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.borrows</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.number</code> attribute.
	 * @return the number
	 */
	public String getNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.number</code> attribute.
	 * @return the number
	 */
	public String getNumber()
	{
		return getNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final String value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher
	 */
	public String getPublisher(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.getPublisher requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher
	 */
	public String getPublisher()
	{
		return getPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute. 
	 * @return the localized publisher
	 */
	public Map<Language,String> getAllPublisher(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PUBLISHER,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute. 
	 * @return the localized publisher
	 */
	public Map<Language,String> getAllPublisher()
	{
		return getAllPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBook.setPublisher requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setPublisher(final String value)
	{
		setPublisher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setAllPublisher(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher
	 */
	public void setAllPublisher(final Map<Language,String> value)
	{
		setAllPublisher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.status</code> attribute.
	 * @return the status
	 */
	public Boolean isStatus()
	{
		return isStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.status</code> attribute. 
	 * @return the status
	 */
	public boolean isStatusAsPrimitive()
	{
		return isStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final Boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final boolean value)
	{
		setStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
