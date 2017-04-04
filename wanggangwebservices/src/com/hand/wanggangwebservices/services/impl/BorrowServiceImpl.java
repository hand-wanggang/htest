package com.hand.wanggangwebservices.services.impl;

import com.hand.wanggang.model.BookModel;
import com.hand.wanggang.model.BorrowModel;
import com.hand.wanggangwebservices.services.BorrowService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private FlexibleSearchService flexibleSearchService;
    @Autowired
    private ModelService modelService;

    @Override
    public void create(BorrowModel model) {
        model.setBorrowDate(new Date());
        modelService.save(model);
    }

    @Override
    public void updateReturnDate(BorrowModel model, Date date) {

        BorrowModel target =getTargetModel(model);
        target.setReturnDate(date);
        modelService.save(target);
    }

    @Override
    public void changeOverdueStatue(BorrowModel model, boolean statuse) {

        BorrowModel target=getTargetModel(model);
        target.setOverdueStatue(statuse);
        modelService.save(target);
    }

    @Override
    public List<BorrowModel> getBorrowRecords(BookModel model) {

        String sql="SELECT {p:"+BorrowModel.PK+"},"
                +"{p:"+BorrowModel.BORROWDATE+"},"
                +"{p:"+BorrowModel.RETURNDATE+"},"
                +"{p:"+BorrowModel.READER+"}"
                +"FROM {"+BorrowModel._TYPECODE +" AS p}"
                +" WHERE {p:"+BorrowModel.BOOK+"} = ?bookPk";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
        System.out.println(model.getPk());
        query.addQueryParameter("bookPk",model.getPk());
        List<BorrowModel> list=flexibleSearchService.< BorrowModel> search(query).getResult();
        return  list;
    }

    private  BorrowModel getTargetModel(BorrowModel model){

        String sql="SELECT {p:" + BorrowModel.BOOK + "} ,"
                +"{p:"+BorrowModel.READER+"} ,"
                +"{p:"+ BorrowModel.BORROWDATE+"} ,"
                +"{p:"+BorrowModel.OVERDUESTATUE+"} ,"
                +"{p:"+BorrowModel.PK+"} "
                +"FROM {"+BorrowModel._TYPECODE +" AS p}"
                +" WHERE {p:"+BorrowModel.BOOK+"} = ?bookPk"
                +"AND {p:"+BorrowModel.READER+"} = ?readerPk";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
        query.addQueryParameter("bookPk",model.getBook());
        query.addQueryParameter("readerPk",model.getReader());
        List<BorrowModel> list=flexibleSearchService.<BorrowModel> search(query).getResult();
        if(list.isEmpty()){
            throw new UnknownIdentifierException("Borrow  not found!");
        }

        if (list.size()>1){
            throw new AmbiguousIdentifierException(
                    "Borrow search target is  ambiguousIdentifier");
        }

        return  list.get(0);
    }
}
