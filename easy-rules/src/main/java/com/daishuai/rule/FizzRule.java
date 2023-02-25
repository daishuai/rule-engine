package com.daishuai.rule;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.*;

/**
 * @author admin
 * @version 1.0.0
 * @description TODO
 * @createTime 2023-02-25 21:56:30
 */
@Slf4j
@Rule(name = "fizzRule")
public class FizzRule {

    @Condition
    public boolean isFizz(@Fact("number") Integer number) {
        // 判断是否为5的倍数
        return number % 5 == 0;
    }

    @Action
    public void printFizz() {
        log.info("fizz");
    }

    @Priority
    public int getPriority() {
        return 1;
    }
}
