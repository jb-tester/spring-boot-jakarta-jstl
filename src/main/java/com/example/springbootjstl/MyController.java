package com.example.springbootjstl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "hello world!");
        model.addAttribute("mypath", "${pageContext.request.contextPath}/styles");
        return "home";
    }


    @RequestMapping("/mapping2")
    public String mapping2(ModelMap model) {
        model.addAttribute("mapping2_attr1", "mapping2_attr1");
        return "view2";
    }





    @RequestMapping(value = "/mapping1", method = RequestMethod.GET)
    public String mapping1(Model model) {
        model.addAttribute("userName", "Vasya");
        return "/view1";
    }

    @ModelAttribute("userMessage")
    public MyMessage createFormBean() {
        return new MyMessage();
    }

    @RequestMapping(value = "/mapping1", method= RequestMethod.POST)
    public String submitMessage(MyMessage myMessage, BindingResult result,
                                SessionStatus sessionStatus,
                                RedirectAttributes redirectAttrs) {

        if (result.hasErrors()) {
            return "/view1";
        }
        String message = myMessage.getMessageFromUser();
        sessionStatus.setComplete();
        redirectAttrs.addFlashAttribute("message", message);

        return "redirect:/mapping1";
    }

}
