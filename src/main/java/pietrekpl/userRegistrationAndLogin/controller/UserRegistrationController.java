package pietrekpl.userRegistrationAndLogin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pietrekpl.userRegistrationAndLogin.dto.UserRegistrationDto;
import pietrekpl.userRegistrationAndLogin.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String registrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user")UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:registration?success";
    }


}
