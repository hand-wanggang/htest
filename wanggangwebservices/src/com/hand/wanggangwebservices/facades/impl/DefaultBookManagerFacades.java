package com.hand.wanggangwebservices.facades.impl;

import com.hand.wanggang.model.BookModel;
import com.hand.wanggang.model.CustomReaderModel;
import com.hand.wanggangwebservices.converter.BookModel2BookDTO;
import com.hand.wanggangwebservices.converter.BorrowModel2BorrowDTO;
import com.hand.wanggangwebservices.dto.BookDTO;
import com.hand.wanggangwebservices.dto.BorrowInfoDTO;
import com.hand.wanggangwebservices.dto.OverdueReaderInfoDTO;
import com.hand.wanggangwebservices.facades.BookManagerFacades;
import com.hand.wanggangwebservices.services.BookService;
import com.hand.wanggangwebservices.services.BorrowService;
import com.hand.wanggangwebservices.services.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public class DefaultBookManagerFacades implements BookManagerFacades {


    @Autowired
    private BookService bookService;
    @Autowired
    private BorrowService borrowService;
    @Autowired
    private ReaderService readerService;
    @Autowired
    private BookModel2BookDTO bookModel2BookDTO;
    @Autowired
    private BorrowModel2BorrowDTO borrowModel2BorrowDTO;


    @Override
    public List<BookDTO> getBookList() {

        return bookModel2BookDTO.convertAll(bookService.getBooks());

    }

    @Override
    public List<OverdueReaderInfoDTO> getOverdueReaders() {

        return readerService.getOverdueReaders();

    }


    @Override
    public BorrowInfoDTO getBorrowInfoDTO(BookDTO bookDTO) {
        BorrowInfoDTO borrowInfoDTO=new BorrowInfoDTO();
        BookModel bookModel=bookService.findBookByNum(bookDTO.getNumber());
        borrowInfoDTO.setAuthorName(bookModel.getAuthor());
        borrowInfoDTO.setBookName(bookModel.getName());
        borrowInfoDTO.setBorrowRecords(
                borrowModel2BorrowDTO.convertAll(borrowService.getBorrowRecords(bookModel))
        );
        return borrowInfoDTO;
    }

    @Override
    public CustomReaderModel readerLogin(String cardId) {

        CustomReaderModel readerModel=readerService.getReaderByCardId(cardId);
        return readerModel;
    }

}
