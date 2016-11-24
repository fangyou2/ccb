package ccb.web;

import ccb.entity.Mystery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/24.
 */
@Controller
public class MysteryController {

    @RequestMapping("postMystery.do")
    public String postMystery( Mystery  mystery, Model model){

        return null;
    }
}
