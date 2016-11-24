package ccb.service;

import ccb.dao.GoodsDao;
import ccb.entity.Page;
import ccb.entity.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public Page getGoodsPage(Page page) {
        if(page==null){
            page=new Page();
        }
        page.setList(goodsDao.getLimit(page));
        //设置总的条数
        page.setTotalNumber(getTotal());
        page.init();
        return page;
    }

    public List getStyle1() {
        return goodsDao.getStyle1();
    }

    public List getStyle2(Style style) {
        return goodsDao.getStyle2(style);
    }

    public int getTotal() {
        return goodsDao.getTotal();
    }

    //搜索功能
    public Page search(Page page,Style style, String keyword) {
        if(page==null){
            page=new Page();
        }
        page.setList(goodsDao.getLimitByKey(page,style,keyword));
        //设置总的条数
        page.setTotalNumber(getTotalByKey(style,keyword));
        page.init();
        return page;
    }

    public int getTotalByKey(Style style, String keyword) {
        return goodsDao.getTotalByKey(style,keyword);
    }
}
