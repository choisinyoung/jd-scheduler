package kr.co.jdscheduler.login.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginResponseDtoTest {

    @Test
    public void lombok_Test(){
        String userId = "maso";
        String userPw = "0418";
        String userNm = "최신영";
        String userNickName = "소지";
        String userPhoneNum = "01063418208";
        String userRrn = "931021-1";

        LoginResponseDto loginResponseDto = new LoginResponseDto(
                userId,userPw,userNm,userNickName,userRrn,userPhoneNum
        );

        assertThat(loginResponseDto.getUserId()).isEqualTo(userId);
        assertThat(loginResponseDto.getUserPw()).isEqualTo(userPw);
        assertThat(loginResponseDto.getUserNm()).isEqualTo(userNm);
        assertThat(loginResponseDto.getUserNickName()).isEqualTo(userNickName);
        assertThat(loginResponseDto.getUserPhoneNum()).isEqualTo(userPhoneNum);
        assertThat(loginResponseDto.getUserRrn()).isEqualTo(userRrn);
    }
}
