package com.daishuai;

import com.daishuai.model.CheckRuleModel;
import com.daishuai.rule.BuzzRule;
import com.daishuai.rule.FizzBuzzRule;
import com.daishuai.rule.FizzRule;
import com.daishuai.rule.NonFizzBuzzRule;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;

import java.io.FileReader;

/**
 * @author admin
 * @version 1.0.0
 * @description 启动类
 * @createTime 2023-02-25 21:44:37
 */
public class EasyRuleApplication {

    public static void main(String[] args) throws Exception {
        // 创建规则引擎
        RulesEngineParameters parameters = new RulesEngineParameters()
                .skipOnFirstAppliedRule(true);
        RulesEngine rulesEngine = new DefaultRulesEngine(parameters);
        // 创建规则
        Rules rules = new Rules();
        rules.register(new FizzRule());
        rules.register(new BuzzRule());
        rules.register(new FizzBuzzRule(new FizzRule(), new BuzzRule()));
        rules.register(new NonFizzBuzzRule());

        CheckRuleModel model = new CheckRuleModel();

        MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
        rules = ruleFactory.createRules(new FileReader("D:\\IdeaProjects\\rule-engine\\easy-rules\\src\\main\\resources\\rule\\fizz-buzz.yml"));
        // 触发规则
        Facts facts = new Facts();
        for (int i = 1; i <= 1; i++) {
            facts.put("number", i);
            facts.put("result", model);
            rulesEngine.fire(rules, facts);
        }
        System.out.println(model.getName());
    }
}
