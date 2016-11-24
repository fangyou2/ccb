package service;

import ccb.entity.Mystery;
import ccb.service.MysteryService;
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
    public void post(){
        mysteryService.post(new Mystery(1,"1m","1s",2));
        mysteryService.post(new Mystery(1,"2m","2s",3));
        mysteryService.post(new Mystery(2,"3m","3s",4));
    }
}
