package com.daishuai.rule;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.*;

/**
 * @author admin
 * @version 1.0.0
 * @description 判断是否为7的倍数
 * @createTime 2023-02-25 21:59:05
 */
@Slf4j
@Rule(name = "buzzRule")
public class BuzzRule {

    @Condition
    public boolean isBuzz(@Fact("number") Integer number) {
        return number % 7 == 0;
    }

    @Action
    public void printBuzz() {
        log.info("buzz");
    }

    @Priority
    public int getPriority() {
        return 2;
    }
}
