package com.hand.wanggangwebservices.facades;

import com.hand.wanggang.model.CustomReaderModel;
import com.hand.wanggangwebservices.dto.BookDTO;
import com.hand.wanggangwebservices.dto.BorrowInfoDTO;
import com.hand.wanggangwebservices.dto.OverdueReaderInfoDTO;

import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public interface BookManagerFacades {

    List<BookDTO> getBookList();

    List<OverdueReaderInfoDTO> getOverdueReaders();

    BorrowInfoDTO getBorrowInfoDTO(BookDTO bookDTO);

    CustomReaderModel readerLogin(String cardId);
}
