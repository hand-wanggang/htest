package com.hand.wanggangwebservices.converter;

import com.hand.wanggang.model.BorrowModel;
import com.hand.wanggangwebservices.dto.BorrowDTO;
import com.hand.wanggangwebservices.util.DateFormatHelper;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public class BorrowModel2BorrowDTO implements Converter<BorrowModel,BorrowDTO> {

    @Override
    public BorrowDTO convert(BorrowModel model) throws ConversionException {

        return convert(model,new BorrowDTO());
    }

    @Override
    public BorrowDTO convert(BorrowModel model, BorrowDTO borrowDTO) throws ConversionException {

        borrowDTO.setOverdueStatue(model.isOverdueStatue());
        borrowDTO.setBorrowDate(
                DateFormatHelper.fromatDateToTargetStyle(model.getBorrowDate()));

        if (model.getReturnDate()!=null)
            borrowDTO.setReturnDate(
                    DateFormatHelper.fromatDateToTargetStyle(model.getReturnDate()));

        if (model.getReader()!=null){
            borrowDTO.setReaderName(model.getReader().getName());
        }

        return borrowDTO;
    }

    @Override
    public List<BorrowDTO> convertAll(Collection<? extends BorrowModel> borrowModels) throws ConversionException {
       List<BorrowDTO> list=new ArrayList<>();
       for (BorrowModel model: borrowModels){
           list.add(convert(model));
       }
        return list;
    }
}
