package kr.co.jdscheduler.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userKey;

    @Column(length = 20, nullable = false)
    private String userId;

    @Column(length = 20, nullable = false)
    private String userPw;

    @Column(length = 20, nullable = false)
    private String userNm;

    @Column(length = 20, nullable = false)
    private String userNickName;

    @Column(length = 8, nullable = false)
    private String userRrn;

    @Column(length = 11, nullable = false)
    private String userPhoneNum;

    @Builder
    public Posts(String userId, String userPw, String userNm, String userNickName, String userRrn, String userPhoneNum){
        this.userId = userId;
        this.userPw = userPw;
        this.userNm = userNm;
        this.userNickName = userNickName;
        this.userRrn = userRrn;
        this.userPhoneNum = userPhoneNum;
    }
}
