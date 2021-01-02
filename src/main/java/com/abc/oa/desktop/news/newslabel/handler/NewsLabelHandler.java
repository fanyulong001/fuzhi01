package com.abc.oa.desktop.news.newslabel.handler;
import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;
import com.abc.oa.desktop.news.newslabel.service.INewsLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
//在Spring MVC 中使用 @RequestMapping 来映射请求，也就是通过它来指定控制器可以处理哪些URL请求，相当于Servlet中在web.xml中配置
@RequestMapping("/desktop/news")

public class NewsLabelHandler {
    @Autowired
    private INewsLabelService service;

    @RequestMapping("/queryNewsLabel.do")
    public String queryNewsLabel(@RequestParam(defaultValue = "1") int pageno, Model model){  //页面默认值
        System.out.println("查询栏目信息!!!");
        Page<NewsLabel> page = service.findCurrentPage(pageno); //查询当前界面放入page对象里
        //page类放在vo里，因为是个值对象，负责在把Java代码中的数据传递到jsp页面上

        for (NewsLabel nl:page.getDatas()){
            System.out.println(nl);
        }
        model.addAttribute("page",page);
        return "/html/news/栏目管理.jsp";
    }
}
