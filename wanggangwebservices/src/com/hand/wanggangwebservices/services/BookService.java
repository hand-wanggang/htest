package com.hand.wanggangwebservices.services;

import com.hand.wanggang.model.BookModel;

import java.util.List;

/**
 * Created by deep on 2017/1/22.
 */
public interface BookService {

    BookModel findBookByNum(String bookNum);
    List<BookModel> getBooks();
    void  changeBookStatuse(String bookNum,boolean bookSattuse);

}
