package ccb.service;

import ccb.dao.NoticeDao;
import ccb.dao.UserDao;
import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Component
public class NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    public void post(Notice notice){
        noticeDao.post(notice);
    }

    public void delete(Notice notice) {
        noticeDao.delete(notice);
    }

    public Page getNoticesPage(Page page) {
        if(page==null){
            page=new Page();
        }
        List list = noticeDao.getLimit(page);
        page.setList(list);
        //设置总的条数
        page.setTotalNumber(getTotal());
        page.init();
        return page;
    }

    public int getTotal() {
        return noticeDao.getTotal();
    }

    public List<Notice> getNoticesWeek() {
        return noticeDao.getByTime();
    }
}
