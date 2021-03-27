package kr.co.jdscheduler.login.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor
public class LoginResponseDto {
    private final String userId;
    private final String userPw;
    private final String userNm;
    private final String userNickName;
    private final String userRrn;
    private final String userPhoneNum;

    @GetMapping("/login/dto")
    public LoginResponseDto loginResponseDto(
            @RequestParam("userId") String userId,@RequestParam("userPw") String userPw,
            @RequestParam("userNm") String userNm,@RequestParam("userNickName") String userNickName,
            @RequestParam("userRrn") String userRrn,@RequestParam("userPhoneNum") String userPhoneNum

    ){
        return new LoginResponseDto(userId,userPw,userNm,userNickName,userRrn,userPhoneNum);
    }
}
