package com.hand.wanggangwebservices.services.impl;

import com.hand.wanggang.model.BookModel;
import com.hand.wanggangwebservices.services.BookService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public class BookServiceImpl  implements BookService{

    @Autowired
    private FlexibleSearchService flexibleSearchService;
    @Autowired
    private ModelService modelService;


    @Override
    public BookModel findBookByNum(String bookNum) {

        String sql="SELECT {p:" + BookModel.PK + "} ,"
                +"{p:"+BookModel.AUTHOR+"} ,"
                +"{p:"+ BookModel.NAME+"} ,"
                +"{p:"+BookModel.PUBLISHER+"} ,"
                +"{p:"+BookModel.STATUS+"} ,"
                +"{p:"+BookModel.NUMBER+"} "
                + "FROM {" + BookModel._TYPECODE + " AS p} "
                +" WHERE {p:"+BookModel.NUMBER+"} = ?number";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
        query.addQueryParameter("number",bookNum);
        List<BookModel> list=flexibleSearchService.<BookModel> search(query).getResult();

        if (list.isEmpty()){
            throw new UnknownIdentifierException("Book with number " + bookNum + "' not found!");
        }

        if (list.size()>1){
            throw new AmbiguousIdentifierException(
                    "Book number '" + bookNum + "' is not unique, " + list.size() + " books found!");
        }

        return list.get(0);
    }

    @Override
    public List<BookModel> getBooks() {
        String sql="SELECT {p:" + BookModel.PK + "} ,"
                +"{p:"+BookModel.AUTHOR+"} ,"
                +"{p:"+ BookModel.NAME+"} ,"
                +"{p:"+BookModel.PUBLISHER+"} ,"
                +"{p:"+BookModel.STATUS+"} ,"
                +"{p:"+BookModel.NUMBER+"} "
                + "FROM {" + BookModel._TYPECODE + " AS p} ";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
        List<BookModel> list=flexibleSearchService.<BookModel> search(query).getResult();
        return list;
    }

    @Override
    public void changeBookStatuse(String bookNum, boolean bookSattuse) {
        BookModel model=findBookByNum(bookNum);
        model.setStatus(bookSattuse);
        modelService.save(model);
    }
}
