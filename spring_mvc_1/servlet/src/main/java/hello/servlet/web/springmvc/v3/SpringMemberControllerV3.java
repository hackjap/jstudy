package hello.servlet.web.springmvc.v3;


import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")

public class SpringMemberControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

//    @RequestMapping(value = "/new-form",method = RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm() {
//        return new ModelAndView("new-form");
        return "new-form";
    }

    @PostMapping("/save")
//    public ModelAndView save(HttpServletRequest request, HttpServletResponse response)
    public String save(@RequestParam("username")String username,
                             @RequestParam("age")int age,
                             Model model)
     {
/*        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
         ModelAndView mv = new ModelAndView("save-result");
         mv.addObject("member",member);*/
        Member member = new Member(username, age);
        memberRepository.save(member);
         model.addAttribute("member", member);
         return "save-result";
    }


    @GetMapping
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();

        model.addAttribute("members,members");
        return "members";
      /*  ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("members", members);

        return modelAndView;*/
    }
}
