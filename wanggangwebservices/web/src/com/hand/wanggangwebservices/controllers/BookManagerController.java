package com.hand.wanggangwebservices.controllers;

import com.hand.wanggang.model.CustomReaderModel;
import com.hand.wanggangwebservices.ResultDate;
import com.hand.wanggangwebservices.dto.BookDTO;
import com.hand.wanggangwebservices.dto.BorrowInfoDTO;
import com.hand.wanggangwebservices.facades.BookManagerFacades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by deep on 2017/1/23.
 */
@Controller
@RequestMapping(value = "/book")
public class BookManagerController {

    @Autowired
    private BookManagerFacades bookManagerFacades;

    @RequestMapping(value ="/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultDate login(final String cardId,HttpSession session){
        ResultDate resultDate=new ResultDate();
        resultDate.setResult(false);
        if (cardId==null||cardId.length()<1){
            return resultDate;
        }
        CustomReaderModel readerModel=bookManagerFacades.readerLogin(cardId);
       if (readerModel!=null) {
           resultDate.setResult(true);
           saveReaderToModel(session,readerModel);
           return resultDate;
       }
       return resultDate;
    }

    @RequestMapping(value = "/getBooks",method = RequestMethod.GET)
    @ResponseBody
    public List<BookDTO> getBooks(){
        return bookManagerFacades.getBookList();
    }


    @RequestMapping(value="/getBorrowInfo/{bookNum}",method = RequestMethod.GET)
    public String getBorrowInfo(@PathVariable("bookNum") final String bookNum, Model model){
        BookDTO bookDTO=new BookDTO();
        bookDTO.setNumber(bookNum);
        BorrowInfoDTO dto=bookManagerFacades.getBorrowInfoDTO(bookDTO);
        model.addAttribute("borrowInfo",dto);
        return "borrowInfo";
    }

    @RequestMapping(value = "/getOverdueReadersInfo",method = RequestMethod.GET)
    public String getOverdueReadersInfo(Model model){
        model.addAttribute("overdueReaders",bookManagerFacades.getOverdueReaders());
        return "overReader";
    }

/*    @RequestMapping(value = "/gotoHome",method = RequestMethod.GET)
    public String gotoHome(){
        return "home";
    }*/

    private void  saveReaderToModel(HttpSession session,CustomReaderModel model){
        session.setAttribute("reader",model);
    }

    private CustomReaderModel  getNowReader(HttpSession session){
        return (CustomReaderModel) session.getAttribute("reader");
    }
}
