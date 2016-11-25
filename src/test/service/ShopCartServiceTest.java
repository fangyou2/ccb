package service;

import ccb.entity.*;
import ccb.service.GoodsService;
import ccb.service.ShopCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring.xml")
public class ShopCartServiceTest {
    @Autowired
    private ShopCartService shopCartService;

    @Test
    public void get(){
        List list = shopCartService.get(new User("admin", null, null));
        System.out.println();
    }

    @Test
    public void post(){
        Goods goods = new Goods();
        goods.setId(1);
        shopCartService.post(new ShopCart(null,20,new User("admin",null,null),goods,"未提交",null));
    }
    @Test
    public void put(){
        shopCartService.put(new ShopCart(2,100,null,null,"",null));
    }
    @Test
    public void delete(){
        shopCartService.delete(new ShopCart(1,null,null,null,null,null));
    }

    @Test
    public void putStatus(){
        shopCartService.putStatus(new User("admin",null,null));
    }
}
