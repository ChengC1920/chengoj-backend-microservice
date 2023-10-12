package com.thc.chengojbackendjudgeservice.judge;

import chengojbackendmodel.model.codesandbox.JudgeInfo;
import chengojbackendmodel.model.entity.QuestionSubmit;
import com.thc.chengojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.thc.chengojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.thc.chengojbackendjudgeservice.judge.strategy.JudgeContext;
import com.thc.chengojbackendjudgeservice.judge.strategy.JudgeStrategy;
import org.springframework.stereotype.Component;

@Component
public class JudgeManager {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
