package com.thc.chengojbackendjudgeservice.judge.codesandbox;


import com.thc.chengojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandBox;
import com.thc.chengojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandBox;
import com.thc.chengojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandBox;

/**
 * 代码沙箱工厂，根据传入的字符串创建对应的代码沙箱实例
 */
public class CodeSandBoxFactory {

    public static CodeSandBox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }

}
