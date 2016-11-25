package ccb.service;

import ccb.dao.MysteryDao;
import ccb.entity.Mystery;
import ccb.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/24.
 */
@Component
public class MysteryService {
    @Autowired
    private MysteryDao mysteryDao;

    /**
     * 添加事物
     *
     * @param mystery
     */
    public void post(Mystery mystery) {
        mysteryDao.post(mystery);
    }

    /**
     * 分页查询事物
     *
     * @param page
     * @return
     */
    public Page getLimit(Page page) {
        int count = mysteryDao.getCount();
        page.setTotalNumber(count);
        page.init();
        List<Mystery> mysterys = mysteryDao.getLimit(page);
        page.setList(mysterys);
        return page;
    }
}
