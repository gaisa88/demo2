package com.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
@SpringBootApplication
public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key=jed9pnQ2SYkcTMNura6JBrzXeabGTyHhtfbGZckc", Page.class);
        System.out.println("Title:    " + page.getTitle());
        System.out.println("date:    " + page.getDate());
        System.out.println("explanation:    " + page.getExplanation());
        System.out.println("hdurl:    " + page.getHdurl());
        System.out.println("url:    " + page.getUrl());
        System.out.println("service_version:    " + page.getService_version());
        System.out.println("media_type:    " + page.getMedia_type());
    }

}
