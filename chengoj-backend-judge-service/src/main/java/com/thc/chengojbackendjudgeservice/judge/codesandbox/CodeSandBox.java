package com.thc.chengojbackendjudgeservice.judge.codesandbox;


import chengojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import chengojbackendmodel.model.codesandbox.ExecuteCodeResponse;

public interface CodeSandBox {

     ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
