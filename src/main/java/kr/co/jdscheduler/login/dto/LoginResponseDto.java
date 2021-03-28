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

}
