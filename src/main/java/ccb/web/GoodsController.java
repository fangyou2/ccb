package ccb.web;

import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.entity.User;
import ccb.service.GoodsService;
import ccb.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
     * @param page
     * @return
     */
    @RequestMapping("getGoodsPage.do")
    public @ResponseBody Page getGoodsPage(Page page){
        return goodsService.getGoodsPage(page);
    }
}
