package ccb.dao;

import ccb.entity.Mystery;
import ccb.entity.Page;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.hibernate.query.Query;

import java.util.List;


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


    public List<Mystery> getLimit(Page page) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Mystery m order by m.mystery_id desc");
        query.setFirstResult(page.getCurrentNumber()).setMaxResults(page.getPageNumber());
        List<Mystery> mysterys = query.list();
        return mysterys;
    }

    public int getCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Mystery").list().size();
    }
}