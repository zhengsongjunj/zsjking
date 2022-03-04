package com.zking.zsjking.sample.database;

import com.zking.zsjking.sample.ConnectImpl;

public class MySQL implements ConnectImpl {
    private String ip;
    private Integer port;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void connect(){
        System.out.println(this.ip + ":" + this.port);
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
