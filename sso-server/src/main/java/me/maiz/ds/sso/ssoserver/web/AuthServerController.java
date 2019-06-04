package me.maiz.ds.sso.ssoserver.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
@Slf4j
public class AuthServerController {
    @GetMapping("/user/me")
    @ResponseBody
    public Principal user(Principal principal) {
        log.info("principal : {}",principal);
        return principal;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

}
