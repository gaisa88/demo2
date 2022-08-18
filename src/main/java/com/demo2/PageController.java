package com.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PageController {
    private final PageService pageService; // объявлем клиентский сервис
    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @RequestMapping("/pages") // объявляем rest запрос для получения списка сущностей
    public Iterable<Page> getPage() { // получаем иттерированный список
        List<Page> pageList = pageService.readAll(); // объявлем переменную лист объектов, которые получаем сервиса прочитав данные из таблицы
        return pageList; // возвращаем лист сущностей
    }

}
