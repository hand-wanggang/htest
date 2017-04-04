package com.hand.wanggangwebservices.converter;

import com.hand.wanggang.model.BookModel;
import com.hand.wanggangwebservices.dto.BookDTO;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Created by deep on 2017/1/23.
 */
public class BookModel2BookDTO  implements Converter<BookModel,BookDTO> {

    @Override
    public BookDTO convert(BookModel model) throws ConversionException {
        return convert(model,new BookDTO());
    }

    @Override
    public BookDTO convert(BookModel model, BookDTO bookDTO) throws ConversionException {
        bookDTO.setNumber(model.getNumber());
        bookDTO.setName(model.getName());
        bookDTO.setStatus(model.isStatus());
        bookDTO.setPublisher(model.getPublisher());
        bookDTO.setAuthor(model.getAuthor());
        bookDTO.setPk(model.getPk().getLong());
        return bookDTO;
    }

    @Override
    public List<BookDTO> convertAll(Collection<? extends BookModel> bookModels) throws ConversionException {
        List<BookDTO> bookDTOS=new ArrayList<>();
        for (BookModel model:bookModels){
            bookDTOS.add(convert(model));
        }
        return bookDTOS;
    }
}
