package com.lxw.videoworld.domain;

import java.io.Serializable;

/**
 * Created by lxw9047 on 2017/4/20.
 */
public class Source implements Serializable{
    private String id;
    private String category;
    private String type;
    private String title;
    private String date;
    private String status;
    private long time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", category=" + category +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", status=" + status +
                ", time=" + time +
                '}';
    }
}
