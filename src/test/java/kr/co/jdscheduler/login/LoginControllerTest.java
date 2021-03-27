package kr.co.jdscheduler.login;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = LoginController.class)
public class LoginControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void login_success() throws Exception{
        String login = "success";

        mvc.perform(get("/login"))
                .andExpect(status().isOk())
                .andExpect(content().string(login));
    }

    @Test
    public void login_dto() throws Exception{
        String userId = "maso";
        String userPw = "0418";
        String userNm = "최신영";
        String userNickName = "소지";
        String userPhoneNum = "01063418208";
        String userRrn = "931021-1";

        mvc.perform(get("/login/dto")
                        .param("userId",userId)
                        .param("userPw",userPw)
                        .param("userNm",userNm)
                        .param("userNickName",userNickName)
                        .param("userRrn",userRrn)
                        .param("userPhoneNum",userPhoneNum))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.userId",is(userId)))
                    .andExpect(jsonPath("$.userPw",is(userPw)))
                    .andExpect(jsonPath("$.userNm",is(userNm)))
                    .andExpect(jsonPath("$.userNickName",is(userNickName)))
                    .andExpect(jsonPath("$.userRrn",is(userRrn)))
                    .andExpect(jsonPath("$.userPhoneNum",is(userPhoneNum)));

    }
}
