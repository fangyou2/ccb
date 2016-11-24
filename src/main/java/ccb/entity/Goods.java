package ccb.entity;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Goods {
    private Integer id;
    private String name;
    private Float price;
    //限额
    private Integer norm;
    //库存
    private Integer stock;
    //属于类型，外建
    private Style style;

    public Goods() {
    }

    public Goods(Integer id, String name, Float price, Integer norm, Integer stock, Style style) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.norm = norm;
        this.stock = stock;
        this.style = style;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNorm() {
        return norm;
    }

    public void setNorm(Integer norm) {
        this.norm = norm;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
