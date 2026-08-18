package com.edwardp20.libihatelogs;
/**
 * LogHeader
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
public class LogHeader {
    public static String autoHeader(int headlev) {
        String returnHead = "";
        switch(headlev) {//1-error,2-info,3-fatal4-warning
            case 1:
                returnHead = "[Log][Error]";
                break;
            case 2:
                returnHead = "[Log][Info]";
                break;
            case 3:
                returnHead = "[Log][Fatalerror]";
                break;
            case 4:
                returnHead = "[Log][Warning]";
                break;
            case 5:
                returnHead = "[Log][Internal]";
            case 6:
                returnHead = "[Log][Note]";
            default:
                System.out.println("[Log][Internal]Bad call : Number Wrong");
        }
        return returnHead;
    }
}