package com.kob.matchingsystem.service.impl.utils;

import lombok.Data;

@Data
public class Player {
    private Integer userId;
    private Integer rating;
    private Integer botId;
    private Integer waitingTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getBotId() {
        return botId;
    }

    public void setBotId(Integer botId) {
        this.botId = botId;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Player(Integer userId, Integer rating, Integer botId, Integer waitingTime) {
        this.userId = userId;
        this.rating = rating;
        this.botId = botId;
        this.waitingTime = waitingTime;
    }
}
