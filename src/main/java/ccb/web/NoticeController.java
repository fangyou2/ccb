package ccb.web;

import ccb.entity.Notice;
import ccb.entity.Page;
import ccb.entity.User;
import ccb.service.NoticeService;
import ccb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Controller
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    /**
     * 分页数据
     * @param page
     * @return
     */
    @RequestMapping("getNoticesPage.do")
    public @ResponseBody Page getNoticesPage(Page page){
        return noticeService.getNoticesPage(page);
    }

    /**
     * 删除
     * 需要page的页码
     * @param notice
     */
    @RequestMapping("deleteNotice.do")
    public @ResponseBody Page deleteNotice(Page page,Notice notice){
        noticeService.delete(notice);
        return getNoticesPage(page);
    }

    /**
     * 添加
     * @param notice
     */
    @RequestMapping("postNotice.do")
    public @ResponseBody void postNotice(Page page,Notice notice,HttpSession httpSession){
        notice.setAuthor(((User)httpSession.getAttribute("login")).getRole());
        notice.setDate(new Date());
        noticeService.post(notice);
    }

    @RequestMapping("getNoticesWeek.do")
    public @ResponseBody List<Notice> getNoticesWeek(){
        return noticeService.getNoticesWeek();
    }
}
