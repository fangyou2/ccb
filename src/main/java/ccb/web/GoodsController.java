package ccb.web;

import ccb.entity.*;
import ccb.service.GoodsService;
import ccb.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 分页数据
     *
     * @param page
     * @return
     */
    @RequestMapping("getGoodsPage.do")
    public @ResponseBody Page getGoodsPage(Page page, Style style,String keyword) {
        Page result=new Page();
        if(keyword==""){
            result= goodsService.getGoodsPage(page);
        }else{
            result=goodsService.search(page,style,keyword);
        }
        return result;
    }
    //大类
    @RequestMapping("getStyle1.do")
    public @ResponseBody List<Style> getStyle1() {
        return goodsService.getStyle1();
    }
    //根据大类得到小类
    @RequestMapping("getStyle2.do")
    public @ResponseBody List<Style> getStyle2(Style style) {
        return goodsService.getStyle2(style);
    }
}
