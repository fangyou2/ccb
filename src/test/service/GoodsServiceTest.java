package service;

import ccb.entity.Page;
import ccb.entity.Style;
import ccb.service.GoodsService;
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
public class GoodsServiceTest {
    @Autowired
    private GoodsService goodsService;

    @Test
    public void getTotal(){
        int total = goodsService.getTotal();
        System.out.println(total);
    }
    @Test
    public void getNoticesPage(){
        Page page1 = new Page();
        page1.setPageNumber(2);
        Page page = goodsService.getGoodsPage(page1);
        System.out.println();
    }
    @Test
    public void getStyle1(){
        List type = goodsService.getStyle1();
        System.out.println();
    }

    @Test
    public void getStyle2(){
        List style2 = goodsService.getStyle2(new Style(2, null, null));
        System.out.println();
    }


}
