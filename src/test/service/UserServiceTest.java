package service;

import ccb.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/11/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

//    @Test
//    public void getByName(){
//        boolean login = userService.login(new User("admin1", "admin"));
//        Assert.assertTrue(login);
//    }
}
