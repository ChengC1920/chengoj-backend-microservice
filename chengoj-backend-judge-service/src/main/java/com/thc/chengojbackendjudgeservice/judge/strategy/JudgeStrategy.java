package com.thc.chengojbackendjudgeservice.judge.strategy;


import chengojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {

    JudgeInfo doJudge(JudgeContext judgeContext);

}
