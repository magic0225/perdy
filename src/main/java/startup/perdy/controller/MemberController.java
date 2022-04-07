package startup.perdy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import startup.perdy.domain.MemberInfo;
import startup.perdy.service.MemberInfoService;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Controller
public class MemberController {


    public MemberInfoService memberInfoService;

    @Autowired
    public MemberController(MemberInfoService memberInfoService) {
        this.memberInfoService = memberInfoService;
    }


    @GetMapping(value = "/members/new")
    public String createForm() {
        return "createMemberForm";
    }

    @PostMapping (value = "/members/new")
    public String create(MemberForm form) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemName(form.getName());
        memberInfo.setInsDate(LocalDateTime.now());
        memberInfo.setInsDate(LocalDateTime.now());

        memberInfoService.setMemInfo(memberInfo);
        return "redirect:/";
    }

//    @GetMapping(value = "/members")
//    public String list(Model model) {
//        List<> memberInfo = memberInfoService.findMembers();
//        model.addAttribute("members", memberInfo);
//        return "members/memberList";
//    }


}
