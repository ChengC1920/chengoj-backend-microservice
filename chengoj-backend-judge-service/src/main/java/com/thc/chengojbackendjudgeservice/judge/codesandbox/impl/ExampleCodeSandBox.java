package com.thc.chengojbackendjudgeservice.judge.codesandbox.impl;


import chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import chengojbackendmodel.model.codesandbox.JudgeInfo;
import chengojbackendmodel.model.enums.JudgeInfoMessageEnum;
import chengojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import com.thc.chengojbackendjudgeservice.judge.codesandbox.CodeSandBox;

import java.util.List;

public class ExampleCodeSandBox implements CodeSandBox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getValue());
        executeCodeResponse.setJudgeInfo(judgeInfo);
        System.out.println("示例代码沙箱");
        return executeCodeResponse;
    }
}
