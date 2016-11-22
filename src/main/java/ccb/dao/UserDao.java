package ccb.dao;

import ccb.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    public User getByName(User user){
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class,user.getName());
    }
}
