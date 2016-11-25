package service;

import ccb.entity.Mystery;
import ccb.entity.Page;
import ccb.service.MysteryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/11/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring.xml")
public class MysteyServiceTest {
    @Autowired
    private MysteryService mysteryService;

    @Test
    public void postTest() {
        mysteryService.post(new Mystery(1, "1m", "1s", 2));
        mysteryService.post(new Mystery(1, "2m", "2s", 3));
        mysteryService.post(new Mystery(2, "3m", "3s", 4));
    }

    @Test
    public void getLimitTest() {
        Page page = new Page();
        page.setCurrentPage(1);
        page.setPageNumber(3);
        page = mysteryService.getLimit(page);
        Assert.assertNotNull(page);
        Assert.assertEquals(3,page.getList().size());
    }
}
