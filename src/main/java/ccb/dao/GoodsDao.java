package ccb.dao;

import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.entity.Style;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class GoodsDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List getLimit(Page page){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Goods");
        query.setFirstResult(page.getCurrentNumber()).setMaxResults(page.getPageNumber());
        return query.list();
    }

    //一级选项
    public List getStyle1(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Style s where s.style is null");
        return query.list();
    }
    //根据一级选项得到二级选项
    public List getStyle2(Style style){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Style s where s.style="+style.getId());
        return query.list();
    }

//    public void post(Notice notice) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(notice);
//    }
//    public void delete(Notice notice) {
//        Session session = sessionFactory.getCurrentSession();
//        notice = session.get(Notice.class, notice.getId());
//        session.delete(notice);
//    }

    public int getTotal() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Goods").list().size();
    }
}
