package ccb.web;

import ccb.entity.Mystery;
import ccb.entity.Page;
import ccb.service.MysteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/24.
 */
@Controller
public class MysteryController {
    @Autowired
    private MysteryService mysteryService;

    @RequestMapping("postMystery.do")
    public String postMystery( Mystery  mystery, Model model){
        String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());
        mystery.setMystery_declarationTime(str);
        mysteryService.post(mystery);
        return "index.html";
    }

    @RequestMapping("getMysterys.do")
    public @ResponseBody Page getMysterys(Page page, Model model){
        return mysteryService.getLimit(page);
    }
}
