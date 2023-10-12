package com.thc.chengojbackendjudgeservice.judge.codesandbox.impl;


import chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.thc.chengojbackendjudgeservice.judge.codesandbox.CodeSandBox;

public class ThirdPartyCodeSandBox implements CodeSandBox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
