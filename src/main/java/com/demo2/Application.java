package com.demo2;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        String word = "jed9pnQ2SYkcTMNura6JBrzXeabGTyHhtfbGZckc";
        Page page = restTemplate.getForObject("https://api.nasa.gov/planetary/apod?api_key={word}", Page.class, word);
        System.out.println(page);
        System.out.println("Title:    " + page.getTitle());
        System.out.println("date:    " + page.getDate());
        System.out.println("explanation:    " + page.getExplanation());
        System.out.println("hdurl:    " + page.getHdurl());
        System.out.println("url:    " + page.getUrl());
        System.out.println("service_version:    " + page.getService_version());
        System.out.println("media_type:    " + page.getMedia_type());
    }

}
