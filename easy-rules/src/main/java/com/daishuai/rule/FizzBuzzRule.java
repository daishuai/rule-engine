package com.daishuai.rule;

import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.support.composite.UnitRuleGroup;

/**
 * @author admin
 * @version 1.0.0
 * @description 判断是否既是5的倍数又是7的倍数
 * @createTime 2023-02-25 22:01:40
 */
@Slf4j
@Rule
public class FizzBuzzRule extends UnitRuleGroup {

    public FizzBuzzRule(Object ... rules) {
        for (Object rule : rules) {
            addRule(rule);
        }
    }

    @Override
    public void execute(Facts facts) throws Exception {
        log.info("fizzbuzz");
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
