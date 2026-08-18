package com.edwardp20.libihatelogs.whenerror;
/**
 * WarningProcessor
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
import com.edwardp20.libihatelogs.LogHeader;
import com.edwardp20.libihatelogs.MainLog;

public class WarningProcessor {
    //暂时先实现这个
    
    public static void logWithinWarning(String whatWrong) {
        if(MainLog.getSwitchWarning()) {
            System.out.println(LogHeader.autoHeader(4) + whatWrong);
        } else {
            //do nothing
        }
    }

    public static void logWithinNote(String note) {
        System.out.println(LogHeader.autoHeader(6) + note);
    }
}