package com.somnam.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
//@EnableFeignClients
//@EnableDiscoveryClient
//启动服务后浏览器访问http://localhost:9999/index
@SpringBootApplication
public class SomnamWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomnamWebApplication.class, args);
	}
}
