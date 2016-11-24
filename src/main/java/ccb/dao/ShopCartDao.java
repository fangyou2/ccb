package ccb.dao;

import ccb.entity.*;
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
public class ShopCartDao {
    @Autowired
    private SessionFactory sessionFactory;
    public List get(User user){
        Session session = sessionFactory.getCurrentSession();
        return session.createSQLQuery("select * from ShopCart s where s.user_name=:name and s.status=:status")
                .setParameter("name",user.getName())
                .setParameter("status","未提交")
                .addEntity(ShopCart.class).list();
    }
    public void post(ShopCart shopCart) {
        Session session = sessionFactory.getCurrentSession();
        session.save(shopCart);
    }
    public void delete(ShopCart shopCart) {
        Session session = sessionFactory.getCurrentSession();
        shopCart = session.get(ShopCart.class, shopCart.getId());
        session.delete(shopCart);
    }
    public void put(ShopCart shopCart) {
        Session session = sessionFactory.getCurrentSession();
        ShopCart shopCart1 = session.get(ShopCart.class, shopCart.getId());
        shopCart1.setNumber(shopCart.getNumber());
        session.update(shopCart1);
    }

    public void putStatus(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.createSQLQuery("update ShopCart s set s.status=:status where s.user_name=:user_name")
                .setParameter("status","已提交")
                .setParameter("user_name",user.getName())
                .executeUpdate();
    }
}
