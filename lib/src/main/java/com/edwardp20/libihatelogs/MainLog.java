package com.edwardp20.libihatelogs;
/**
 * MainLog -
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
import com.edwardp20.libihatelogs.whenerror.Error;

public class MainLog {
    public boolean test() {
        return true;
    }
    public static void logWithoutError(String whatWrong) {
        //这个其实就是普通日志
        System.out.println("[Log][Info]" + whatWrong);
    }

    /*public static void setOnOff(boolean statusUWant) {
        if(statusUWant) {
            shouldIRecordLog=(byte)1;
            logWithoutErrorAndCheat("[Log][Success]Set on success");
        } else {
            shouldIRecordLog=(byte)0;
            logWithoutErrorAndCheat("[Log][Success]Set off success");
        }
    }*/
    
    public static void easterEgg() {
        System.out.println("[Log][FatalError]EASTER EGG!!!!!!!");
    }

    //半成品，不要用！
    public static autoLog(String whatWrong,String level) {//fatal->致命,error ...
        if(level.equals("fatal")) {
            Error.logWithinFatalError(whatWrong);
        }
    }
}