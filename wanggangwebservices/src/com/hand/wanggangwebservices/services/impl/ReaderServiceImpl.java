package com.hand.wanggangwebservices.services.impl;

import com.hand.wanggang.model.BorrowModel;
import com.hand.wanggang.model.CustomReaderModel;
import com.hand.wanggangwebservices.converter.BorrowModel2OverdueReaderInfoDTO;
import com.hand.wanggangwebservices.dto.OverdueReaderInfoDTO;
import com.hand.wanggangwebservices.services.ReaderService;
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
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Autowired
    private ModelService modelService;

    @Autowired
    private BorrowModel2OverdueReaderInfoDTO borrowModel2OverdueReaderInfoDTO;

    @Override
    public CustomReaderModel getReaderByCardId(String cardid) {

        String sql="SELECT " +
                //"{p:"+CustomReaderModel.CARDID+"},"
                //+"{p:"+CustomReaderModel.NAME+"},"
                "{p:"+CustomReaderModel.PK+"}"
                +"FROM{"+CustomReaderModel._TYPECODE+" as p}"
                +"WHERE {p:"+CustomReaderModel.CARDID+"}= ?cardid";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);

        query.addQueryParameter("cardid",cardid);

        List<CustomReaderModel> list=flexibleSearchService.<CustomReaderModel> search(query).getResult();

        if(list.isEmpty()){
            throw new UnknownIdentifierException("CustomReaderModel  not found!");
        }

        if (list.size()>1){
            throw new AmbiguousIdentifierException("CustomReaderModel search target is  ambiguousIdentifier");
        }

        System.out.print(list.get(0).getPk());

        return  list.get(0);
    }


    @Override
    public List<OverdueReaderInfoDTO> getOverdueReaders() {

        String sql="SELECT {p:"+BorrowModel.PK+"},"
                +"{p:"+BorrowModel.BORROWDATE+"},"
                +"{p:"+BorrowModel.RETURNDATE+"},"
                +"{p:"+BorrowModel.READER+"},"
                +"{p:"+BorrowModel.BOOK+"}"
                +"FROM {"+BorrowModel._TYPECODE +" AS p}"
                +" WHERE {p:"+BorrowModel.OVERDUESTATUE+"} = ?statues";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql);
        query.addQueryParameter("statues",true);
        List<BorrowModel> list=flexibleSearchService.<BorrowModel> search(query).getResult();
        return borrowModel2OverdueReaderInfoDTO.convertAll(list);
    }
}
