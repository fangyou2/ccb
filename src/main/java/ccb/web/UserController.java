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
                user=userService.getUser(user);
                user.setPassword("");
                httpSession.setAttribute("login",user);
            }
        }
        return result;
    }
    @RequestMapping("getUser.do")
    public @ResponseBody User getUser(HttpSession httpSession){
        return (User) httpSession.getAttribute("login");
    }

    @RequestMapping("logout.do")
    public @ResponseBody void logout(HttpSession httpSession){
        httpSession.removeAttribute("login");
    }

    @RequestMapping("reset.do")
    public @ResponseBody boolean reset(String password,String newpass,HttpSession httpSession){
        boolean result=false;
        User user = (User) httpSession.getAttribute("login");
        user.setPassword(password);
        //验证密码是否正确
        if(login(user,httpSession)){
            user.setPassword(newpass);
            userService.reset(user);
            //清除session，重新登录
            httpSession.removeAttribute("login");
            result=true;
        }
        return result;
    }
}
