package ma.enset.supplierservice.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class SecurityController {
    @GetMapping("/logout")
    public String Logout(HttpServletRequest req) throws ServletException {
        req.logout();
        return "redirect:/";


    }
}
