package com.kob.botrunningsystem.service.impl.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bot {
    Integer userId;
    String botCode;
    String input;

    public Bot(Integer userId, String botCode, String input) {
        this.userId = userId;
        this.botCode = botCode;
        this.input = input;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getBotCode() {
        return botCode;
    }

    public String getInput() {
        return input;
    }
}
