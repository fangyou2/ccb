package ccb.dao;

import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class NoticeDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List getLimit(Page page){
        Session session = sessionFactory.getCurrentSession();
        //逆序
        Query query = session.createQuery("from Notice n order by n.id desc");
        query.setFirstResult(page.getCurrentNumber()).setMaxResults(page.getPageNumber());
        return query.list();
    }

    public void post(Notice notice) {
        Session session = sessionFactory.getCurrentSession();
        session.save(notice);
    }
    public void delete(Notice notice) {
        Session session = sessionFactory.getCurrentSession();
        notice = session.get(Notice.class, notice.getId());
        session.delete(notice);
    }

    public int getTotal() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Notice").list().size();
    }

    public List<Notice> getByTime() {
        Session session = sessionFactory.getCurrentSession();
        return session.createSQLQuery("select * from notice n where n.date>date_sub(now(), interval '7' day)").addEntity(Notice.class).list();
    }
}
