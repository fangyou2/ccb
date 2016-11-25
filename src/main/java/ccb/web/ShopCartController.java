package ccb.web;

import ccb.entity.*;
import ccb.service.GoodsService;
import ccb.service.ShopCartService;
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
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping("deleteShopCart.do")
    public @ResponseBody void deleteShopCart(ShopCart shopCart){
        shopCartService.delete(shopCart);
    }
    @RequestMapping("putShopCart.do")
    public @ResponseBody void putShopCart(ShopCart shopCart){
        shopCartService.put(shopCart);
    }
    @RequestMapping("putShopCartStatus.do")
    public @ResponseBody void putShopCartStatus(HttpSession httpSession){
        //添加人
        User user = (User)httpSession.getAttribute("login");
        shopCartService.putStatus(user);
    }
    @RequestMapping("postShopCart.do")
    public @ResponseBody void postShopCart(Integer gid,ShopCart shopCart,HttpSession httpSession){
        //添加的商品
        Goods goods = new Goods();
        goods.setId(gid);
        shopCart.setGoods(goods);

        //状态
        shopCart.setStatus("未提交");

        //添加人
        User user = (User)httpSession.getAttribute("login");
        shopCart.setUser(user);

        //时间
        shopCart.setDate(new Date());

        shopCartService.post(shopCart);
    }
    @RequestMapping("getShopCart.do")
    public @ResponseBody List getShopCart(HttpSession httpSession){
        User user = (User)httpSession.getAttribute("login");
        return shopCartService.get(user);
    }
}
