package dao;

import ccb.dao.NoticeDao;
import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.service.NoticeService;
import ccb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring.xml")
public class NoticeDaoTest {
    @Autowired
    private NoticeService noticeService;

    @Test
    public void post(){
        noticeService.post(new Notice(null,"大家好",new Date(),"网管中心"));
        noticeService.post(new Notice(null,"信都牌支付密码器加入配送系统",new Date(),"配送中心"));
        noticeService.post(new Notice(null,"大家好",new Date(),"配送中心"));
        noticeService.post(new Notice(null,"\t本系统的物品配送部分功能正式上线运行，各部门可以通过本系统进行物品需求上报！",new Date(),"网管中心"));
    }
    @Test
    public void delete(){
        noticeService.delete(new Notice(1,"这是内容",new Date(),"网管中心"));
    }

    @Test
    public void getTotal(){
        int total = noticeService.getTotal();
        System.out.println(total);
    }
    @Test
    public void getNoticesPage(){
        Page page1 = new Page();
        page1.setPageNumber(2);
        Page page = noticeService.getNoticesPage(page1);
        System.out.println();
    }

    @Test
    public void getNoticesWeek(){
        List<Notice> noticesWeek = noticeService.getNoticesWeek();
        System.out.println();
    }


}
