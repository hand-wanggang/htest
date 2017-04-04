package com.hand.wanggangwebservices.services;

import com.hand.wanggang.model.BookModel;
import com.hand.wanggang.model.BorrowModel;

import java.util.Date;
import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public interface BorrowService {

    void create(BorrowModel model);
    void updateReturnDate(BorrowModel model,Date date);
    void changeOverdueStatue(BorrowModel model,boolean statuse);
    List<BorrowModel> getBorrowRecords(BookModel model);

}
