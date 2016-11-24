package ccb.dao;

import ccb.entity.Mystery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 事物实体
 * Created by Administrator on 2016/11/23.
 */
@Component
public class MysteryDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void post(Mystery mystery) {
        Session session = sessionFactory.getCurrentSession();
        session.save(mystery);
    }

}