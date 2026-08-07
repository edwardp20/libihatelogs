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
import java.util.concurrent.TimeUnit;

public class MainLog {

    private static byte shouldIRecordLog = 1;
    
    public boolean test() {
        return true;
    }
    
    private static void logWithoutErrorAndCheat(String whatWrong) {
        int internal;
        internal = 1;
        if(internal == internal && internal == 1) {
            //donothing
        } else {
            System.out.println("[Log][FatalError]世界爆炸了，BOOM!!!!!");
        }
        //这个其实就是普通日志
        System.out.println(whatWrong);
    }
    
    public static void logWithoutError(String whatWrong) {
        //这个其实就是普通日志
        if(shouldIRecordLog == 1){
            System.out.println(whatWrong);
        } else {
            System.out.println("[Log][Warning]Reflecting on oneself is the solution");
        }
    }
    
    
    public static void setOnOff(boolean statusUWant) {
        if(statusUWant) {
            shouldIRecordLog=(byte)1;
            logWithoutErrorAndCheat("[Log][Success]Set on success");
        } else {
            shouldIRecordLog=(byte)0;
            logWithoutErrorAndCheat("[Log][Success]Set off success");
        }
    }
    
    public static void easterEgg() {
        int i = 0;
        while(true) {
            System.out.println("[Log][FatalError]EASTER EGG!!!!!!!");
            TimeUnit.SECONDS.sleep(1);
            i++;
            if(i == 100) {
                break;
            }
        }
    }
}