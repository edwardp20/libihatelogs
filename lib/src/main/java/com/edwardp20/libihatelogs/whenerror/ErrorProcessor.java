package com.edwardp20.libihatelogs.whenerror;
/**
 * Error
 * 
 * Copyright (C) 2026 edwardp20 <zhangxixi201268@outlook.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import com.edwardp20.libihatelogs.MainLog;
import com.edwardp20.libihatelogs.whenerror.WarningProcessor;

public class ErrorProcessor {
    public static void logWithinError(String whatWrong) {
        //这是错误
        System.out.println("[Log][Error]" + whatWrong);
    }
    public static void logWithinFatalError(String whatWrong) {
        //严重错误
        System.out.println("[Log][FatalError]" + whatWrong);
    }
    //Deprecate,use WarningProcessor.logWithinWarning("whatWrong")
    //or use (not recommend)
    /*
    public static void logWithinWarning(String whatWrong) {
        //警告
        System.out.println("[Log][Warning]" + whatWrong);
    }*/

    public static void logWithinWarningDeprecate(String whatWrong) {
        WarningProcessor.logWithinWarning(whatWrong); 
    }
    //有解决方法的错误
    public static void logHaveErrorAndCanSolve(String whatWrong,String fixMethod) {//whatWrong错误信息,fixMethod解决方法
        //先打印错误
        logWithinError(whatWrong);
        //再打印解决方案
        MainLog.logWithoutError(fixMethod);
    }

    public static void logHaveFatalErrorAndCanSolve(String whatWrong,String fixMethod) {//whatWrong错误信息,fixMethod解决方法
        //先打印致命错误
        logWithinFatalError(whatWrong);
        //再打印解决方案
        MainLog.logWithoutError(fixMethod);
    }
}