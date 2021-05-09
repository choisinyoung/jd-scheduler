package kr.co.jdscheduler.login.domain.posts;

import kr.co.jdscheduler.domain.posts.Posts;
import kr.co.jdscheduler.domain.posts.PostsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PostsReporsitoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void loginH2Test(){
        String userId = "maso0418";
        String userPw = "0418";
        String userNm = "최신영";
        String userNickName = "소지";
        String userPhoneNum = "01063418208";
        String userRrn = "931021-1";

        postsRepository.save(Posts.builder()
                                .userId(userId)
                                .userPw(userPw)
                                .userNm(userNm)
                                .userNickName(userNickName)
                                .userRrn(userRrn)
                                .userPhoneNum(userPhoneNum)
                                .build()
                            );
        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        assertThat(posts.getUserId()).isEqualTo(userId);
        assertThat(posts.getUserPw()).isEqualTo(userPw);
        assertThat(posts.getUserNm()).isEqualTo(userNm);
        assertThat(posts.getUserNickName()).isEqualTo(userNickName);
        assertThat(posts.getUserRrn()).isEqualTo(userRrn);
        assertThat(posts.getUserPhoneNum()).isEqualTo(userPhoneNum);
    }
}
