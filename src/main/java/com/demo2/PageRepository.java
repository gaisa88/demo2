package com.demo2;

import java.util.List;

public interface PageRepository {
        void create(Page page);


        List<Page> readAll();


        Page read(int id);


}
