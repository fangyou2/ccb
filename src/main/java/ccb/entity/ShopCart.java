package ccb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/24.
 */
public class ShopCart {
    private Integer id;
    //商品数量
    private Integer number;
    //拥有者
    private User user;
    //商品信息
    private Goods goods;

    //订单状态
    private String status;

    //加入时间
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;

    public ShopCart() {
    }

    public ShopCart(Integer id, Integer number, User user, Goods goods, String status, Date date) {
        this.id = id;
        this.number = number;
        this.user = user;
        this.goods = goods;
        this.status = status;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
