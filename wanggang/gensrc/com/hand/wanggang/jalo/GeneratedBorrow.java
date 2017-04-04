/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2017-1-24 15:33:42                          ---
 * ----------------------------------------------------------------
 */
package com.hand.wanggang.jalo;

import com.hand.wanggang.constants.WanggangConstants;
import com.hand.wanggang.jalo.Book;
import com.hand.wanggang.jalo.CustomReader;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Borrow}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBorrow extends GenericItem
{
	/** Qualifier of the <code>Borrow.borrowDate</code> attribute **/
	public static final String BORROWDATE = "borrowDate";
	/** Qualifier of the <code>Borrow.returnDate</code> attribute **/
	public static final String RETURNDATE = "returnDate";
	/** Qualifier of the <code>Borrow.overdueStatue</code> attribute **/
	public static final String OVERDUESTATUE = "overdueStatue";
	/** Qualifier of the <code>Borrow.reader</code> attribute **/
	public static final String READER = "reader";
	/** Qualifier of the <code>Borrow.book</code> attribute **/
	public static final String BOOK = "book";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n READER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBorrow> READERHANDLER = new BidirectionalOneToManyHandler<GeneratedBorrow>(
	WanggangConstants.TC.BORROW,
	false,
	"reader",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BOOK's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBorrow> BOOKHANDLER = new BidirectionalOneToManyHandler<GeneratedBorrow>(
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
		tmp.put(BORROWDATE, AttributeMode.INITIAL);
		tmp.put(RETURNDATE, AttributeMode.INITIAL);
		tmp.put(OVERDUESTATUE, AttributeMode.INITIAL);
		tmp.put(READER, AttributeMode.INITIAL);
		tmp.put(BOOK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.book</code> attribute.
	 * @return the book
	 */
	public Book getBook(final SessionContext ctx)
	{
		return (Book)getProperty( ctx, BOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.book</code> attribute.
	 * @return the book
	 */
	public Book getBook()
	{
		return getBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final SessionContext ctx, final Book value)
	{
		BOOKHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.book</code> attribute. 
	 * @param value the book
	 */
	public void setBook(final Book value)
	{
		setBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.borrowDate</code> attribute.
	 * @return the borrowDate
	 */
	public Date getBorrowDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BORROWDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.borrowDate</code> attribute.
	 * @return the borrowDate
	 */
	public Date getBorrowDate()
	{
		return getBorrowDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.borrowDate</code> attribute. 
	 * @param value the borrowDate
	 */
	public void setBorrowDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BORROWDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.borrowDate</code> attribute. 
	 * @param value the borrowDate
	 */
	public void setBorrowDate(final Date value)
	{
		setBorrowDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		READERHANDLER.newInstance(ctx, allAttributes);
		BOOKHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.overdueStatue</code> attribute.
	 * @return the overdueStatue
	 */
	public Boolean isOverdueStatue(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERDUESTATUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.overdueStatue</code> attribute.
	 * @return the overdueStatue
	 */
	public Boolean isOverdueStatue()
	{
		return isOverdueStatue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @return the overdueStatue
	 */
	public boolean isOverdueStatueAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverdueStatue( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @return the overdueStatue
	 */
	public boolean isOverdueStatueAsPrimitive()
	{
		return isOverdueStatueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @param value the overdueStatue
	 */
	public void setOverdueStatue(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERDUESTATUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @param value the overdueStatue
	 */
	public void setOverdueStatue(final Boolean value)
	{
		setOverdueStatue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @param value the overdueStatue
	 */
	public void setOverdueStatue(final SessionContext ctx, final boolean value)
	{
		setOverdueStatue( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.overdueStatue</code> attribute. 
	 * @param value the overdueStatue
	 */
	public void setOverdueStatue(final boolean value)
	{
		setOverdueStatue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.reader</code> attribute.
	 * @return the reader
	 */
	public CustomReader getReader(final SessionContext ctx)
	{
		return (CustomReader)getProperty( ctx, READER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.reader</code> attribute.
	 * @return the reader
	 */
	public CustomReader getReader()
	{
		return getReader( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final SessionContext ctx, final CustomReader value)
	{
		READERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.reader</code> attribute. 
	 * @param value the reader
	 */
	public void setReader(final CustomReader value)
	{
		setReader( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.returnDate</code> attribute.
	 * @return the returnDate
	 */
	public Date getReturnDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RETURNDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Borrow.returnDate</code> attribute.
	 * @return the returnDate
	 */
	public Date getReturnDate()
	{
		return getReturnDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.returnDate</code> attribute. 
	 * @param value the returnDate
	 */
	public void setReturnDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RETURNDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Borrow.returnDate</code> attribute. 
	 * @param value the returnDate
	 */
	public void setReturnDate(final Date value)
	{
		setReturnDate( getSession().getSessionContext(), value );
	}
	
}
