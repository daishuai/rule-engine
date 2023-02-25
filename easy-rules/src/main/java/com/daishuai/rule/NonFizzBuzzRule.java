package com.daishuai.rule;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.*;

/**
 * @author admin
 * @version 1.0.0
 * @description 既不是5的倍数也不是7的倍数
 * @createTime 2023-02-25 22:05:55
 */
@Slf4j
@Rule
public class NonFizzBuzzRule {

    @Condition
    public boolean isNonFizzBuzz(@Fact("number") Integer number) {
        return number % 5 != 0 && number % 7 != 0;
    }

    @Action
    public void printInput(@Fact("number") Integer number) {
        log.info(String.valueOf(number));
    }

    @Priority
    public int getPriority() {
        return 3;
    }
}
