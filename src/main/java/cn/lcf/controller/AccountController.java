package cn.lcf.controller;

import cn.lcf.domain.Account;
import cn.lcf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户表现层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String finAll(Model model){
        System.out.println("表现层，查询所有账户信息。。。。。。");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (account.getName().length()!= 0 && request.getParameter("name") != null && account.getMoney() != null) {
            accountService.saveAccount(account);
           response.sendRedirect(request.getContextPath()+"/account/findAll");
        } else {
            return "fase";
        }
       return "list";
    }

    @RequestMapping("/delete")
    public String delete(Model model, Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
       if (id != null){
          accountService.delAccount(id);
           model.addAttribute("删除成功！");
           response.sendRedirect(request.getContextPath()+"/account/findAll");
       }else {
           return "fase";
       }
        return null;
    }
}
