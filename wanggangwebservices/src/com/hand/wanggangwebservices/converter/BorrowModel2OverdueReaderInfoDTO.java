package com.hand.wanggangwebservices.converter;

import com.hand.wanggang.model.BorrowModel;
import com.hand.wanggangwebservices.dto.OverdueReaderInfoDTO;
import com.hand.wanggangwebservices.util.DateFormatHelper;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public class BorrowModel2OverdueReaderInfoDTO implements Converter<BorrowModel,OverdueReaderInfoDTO> {
    @Override
    public OverdueReaderInfoDTO convert(BorrowModel model) throws ConversionException {
        return convert(model,new OverdueReaderInfoDTO());
    }

    @Override
    public OverdueReaderInfoDTO convert(BorrowModel model, OverdueReaderInfoDTO overdueReaderInfoDTO) throws ConversionException {
        overdueReaderInfoDTO.setBookName(model.getBook().getName());
        overdueReaderInfoDTO.setBorrowDate(DateFormatHelper.fromatDateToTargetStyle(model.getBorrowDate()));
        overdueReaderInfoDTO.setAvailableDays(model.getReader().getAvailabledays());
        overdueReaderInfoDTO.setBookNum(model.getBook().getNumber());
        overdueReaderInfoDTO.setCardid(model.getReader().getCardid().toString());
        overdueReaderInfoDTO.setName(model.getReader().getName());
        return overdueReaderInfoDTO;
    }

    @Override
    public List<OverdueReaderInfoDTO> convertAll(Collection<? extends BorrowModel> borrowModels) throws ConversionException {

        List<OverdueReaderInfoDTO> list=new ArrayList<>();
        for (BorrowModel model:borrowModels){
            list.add(convert(model));
        }

        return list;
    }
}
