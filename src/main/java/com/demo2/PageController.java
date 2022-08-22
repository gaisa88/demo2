package com.demo2;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PageController {
    private final PageService pageService; // объявлем клиентский сервис
    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @RequestMapping("/pages") // объявляем rest запрос для получения списка сущностей
    @ResponseBody
    public List<Page> readAll(@RequestBody Page page){
        List<Page> pageList = pageService.readAll();
        return pageList;
    }

}
