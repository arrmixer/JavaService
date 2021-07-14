package com.sportsdemo.com.sports.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
    private String groupName;

    public Group() {
    }

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
