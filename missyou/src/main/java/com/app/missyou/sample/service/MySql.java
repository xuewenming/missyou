package com.app.missyou.sample.service;

/**
 * MySQL配置类
 */
public class MySql implements IConnect{

    private String url;
    private Integer port;

    public MySql(String url, Integer port) {
        this.url = url;
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println("url: " + url + ": port: " + port);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
