#!/bin/bash
cd lib/build/libs/
auto=0
for jarName in *.jar;do
    echo "$jarName will be signed , do you want to continue? (y/n/e/a)"
    read want
    if [ "$auto" = 1 ];then
        jarsigner -verbose -storetype pkcs12 -keystore ../../../libihatelogs.p12 -signedjar "$jarName" "$jarName" libihatelogs -tsa http://timestamp.sectigo.com
        continue
    fi
    case "$want" in
        y)
            jarsigner -verbose -storetype pkcs12 -keystore ../../../libihatelogs.p12 -signedjar "$jarName" "$jarName" libihatelogs -tsa http://timestamp.sectigo.com
            ;;
        n)
            continue
            ;;
        e)
            exit
            ;;
        a)
            echo "auto mode open"
            auto=1
            jarsigner -verbose -storetype pkcs12 -keystore ../../../libihatelogs.p12 -signedjar "$jarName" "$jarName" libihatelogs -tsa http://timestamp.sectigo.com
            continue
            ;;
        *)
            echo "input error"
            continue
            ;;
    esac
done
