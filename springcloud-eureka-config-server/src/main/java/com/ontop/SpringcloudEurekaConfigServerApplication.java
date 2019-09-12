package com.ontop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudEurekaConfigServerApplication {

	/*
	 * {application}/{profile}[/{label}]
		如 localhost:8888/config-client/dev，
		即访问 config-client-dev.properties，
		其中 {application} 就是 最后一道横线前面的 config-client，
		{profile} 是最后一道横线后面到点，即 dev，
		{label} 指的是资源库的分支，不填则为默认分支，刚创建的资源库，默认分支是 master
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaConfigServerApplication.class, args);
	}

}
