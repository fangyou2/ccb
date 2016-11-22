package ccb.web;

import ccb.entity.User;
import ccb.service.UserService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/11/22.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录功能
     * @param user
     * @param httpSession
     * @return boolean
     */
    @RequestMapping("login.do")
    public @ResponseBody boolean login(User user,HttpSession httpSession){
        boolean result=false;
        if(user!=null){
            result = userService.login(user);
            //登录成功，将用户信息放在session中
            if(result){
                httpSession.setAttribute("login",user);
            }
        }
        return result;
    }
    @RequestMapping("getName.do")
    public @ResponseBody String getName(User user,HttpSession httpSession){
        String result;
        Object login = httpSession.getAttribute("login");
        if(login==null){
            result="false";
        }else{
            result=((User)login).getName();
        }
        return result;
    }

    @RequestMapping("logout.do")
    public @ResponseBody void logout(HttpSession httpSession){
        httpSession.removeAttribute("login");
    }
}
