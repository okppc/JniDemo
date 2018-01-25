//
// Created by jyqqhw on 2018/1/25 0025.
//
#include <com_jyqqhw_jnidemo_JniUtil.h>
#include <string.h>
/*
 * Class:     com_jyqqhw_jnidemo_JniUtil
 * Method:    printJni
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_jyqqhw_jnidemo_JniUtil_printJni
  (JNIEnv *env, jobject jobj, jstring jstr){
    const char* js = (*env)->GetStringUTFChars(env, jstr, JNI_FALSE);
      char* toJava = " --- Hello From JNI!";
      strcat(js, toJava);
      return (*env)->NewStringUTF(env, js);
  };