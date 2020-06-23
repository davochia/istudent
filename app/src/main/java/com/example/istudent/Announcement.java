package com.example.istudent;

public class Announcement {

    private String announcement;
    private String tagName;
    private String body;

    public Announcement(String announcement, String tagName, String body) {
        this.announcement = announcement;
        this.tagName = tagName;
        this.body = body;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
