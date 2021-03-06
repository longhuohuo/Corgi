package com.dyingbleed.corgi.web.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 李震 on 2018/5/24.
 */
public class ExecuteLog {

    private Long id;

    private String batchTaskName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date executeTime;

    public ExecuteLog() { super(); }

    public ExecuteLog(Long id, String batchTaskName, Date executeTime) {
        super();

        this.id = id;
        this.batchTaskName = batchTaskName;
        this.executeTime = executeTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchTaskName() {
        return batchTaskName;
    }

    public void setBatchTaskName(String batchTaskName) {
        this.batchTaskName = batchTaskName;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }
}
