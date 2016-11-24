package ccb.entity;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Style {
    private Integer id;
    private String name;
    private Style style;

    public Style() {

    }

    public Style(Integer id, String name, Style style) {
        this.id = id;
        this.name = name;
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}
