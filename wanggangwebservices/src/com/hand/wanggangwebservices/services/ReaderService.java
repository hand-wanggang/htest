package com.hand.wanggangwebservices.services;

import com.hand.wanggang.model.CustomReaderModel;
import com.hand.wanggangwebservices.dto.OverdueReaderInfoDTO;

import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
public interface ReaderService {

    CustomReaderModel getReaderByCardId(String cardId);
    List<OverdueReaderInfoDTO> getOverdueReaders();

}
