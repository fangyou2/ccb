package ccb.service;

import ccb.dao.UserDao;
import ccb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;
    public boolean login(User user){
        if(userDao.getByName(user)!=null&&user.getPassword().equals(userDao.getByName(user).getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
