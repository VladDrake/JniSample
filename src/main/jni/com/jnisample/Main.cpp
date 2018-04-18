//
// Created by VladDrake on 25.08.2017.
//

#include "Main.h"

jstring JNICALL Java_com_jnisample_Main_sayHello(JNIEnv *env, jclass jobj) {
    return env->NewStringUTF("Hello World!");
}
