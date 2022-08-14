package com.demo2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
//@JsonIgnoreProperties(ignoreUnknown = true)

public class Page {

    private String title;
    private String date;
    private String explanation;
    private URL hdurl;
    private URL url;
    private String service_version;
    private String media_type;

    public String getMedia_type() {
        return media_type;
    }

    public String getService_version() {
        return service_version;
    }

    public URL getUrl() {
        return url;
    }

    public URL getHdurl() {
        return hdurl;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }
}
