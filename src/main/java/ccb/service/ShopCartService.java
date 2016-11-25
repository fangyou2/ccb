package ccb.service;

import ccb.dao.GoodsDao;
import ccb.dao.ShopCartDao;
import ccb.entity.Page;
import ccb.entity.ShopCart;
import ccb.entity.Style;
import ccb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class ShopCartService {
    @Autowired
    private ShopCartDao shopCartDao;

    public List get(User user){
        return shopCartDao.get(user);
    }

    public void delete(ShopCart shopCart){
        shopCartDao.delete(shopCart);
    }

    public void put(ShopCart shopCart){
        shopCartDao.put(shopCart);
    }

    public void post(ShopCart shopCart){
        shopCartDao.post(shopCart);
    }

    public void putStatus(User user) {
        shopCartDao.putStatus(user);
    }
}
