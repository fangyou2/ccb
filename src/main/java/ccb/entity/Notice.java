package ccb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Notice {
    private Integer id;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date date;
    private String author;

    public Notice(Integer id, String content, Date date, String author) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.author = author;
    }

    public Notice() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
