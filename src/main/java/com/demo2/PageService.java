package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PageService implements PageRepository{
    private PageRepository pageRepository;


    @Override
    public List<Page> readAll() {
        return pageRepository.readAll();
    }


}
