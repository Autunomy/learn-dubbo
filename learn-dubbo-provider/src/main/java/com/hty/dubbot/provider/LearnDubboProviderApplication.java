package com.hty.dubbot.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration // 开启dubbo的自动配置
public class LearnDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnDubboProviderApplication.class, args);
	}

}
