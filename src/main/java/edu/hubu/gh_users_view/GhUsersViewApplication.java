package edu.hubu.gh_users_view;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.hubu.gh_users_view.mapper")
public class GhUsersViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhUsersViewApplication.class, args);
    }

}
