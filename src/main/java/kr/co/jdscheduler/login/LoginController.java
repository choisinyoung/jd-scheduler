package kr.co.jdscheduler.login;

import kr.co.jdscheduler.login.dto.LoginResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "success";
    }

    @GetMapping("/login/dto")
    public LoginResponseDto loginResponseDto(
            @RequestParam("userId") String userId,@RequestParam("userPw") String userPw,
            @RequestParam("userNm") String userNm,@RequestParam("userNickName") String userNickName,
            @RequestParam("userRrn") String userRrn,@RequestParam("userPhoneNum") String userPhoneNum

    ){
        return new LoginResponseDto(userId,userPw,userNm,userNickName,userRrn,userPhoneNum);
    }
}

