cmake_minimum_required(VERSION 3.7)
project(jni)

set(CMAKE_CXX_STANDARD 11)

find_package(JNI REQUIRED)
include_directories(${JNI_INCLUDE_DIRS})

set(SOURCE_FILES
        com/jnisample/Main.h
        com/jnisample/Main.cpp)

set(CMAKE_RUNTIME_OUTPUT_DIRECTORY $ENV{CMAKE_RUNTIME_OUTPUT_DIRECTORY})
set(OUTPUT_NAME $ENV{OUTPUT_NAME})
set(CMAKE_SHARED_LIBRARY_PREFIX "")


add_library(${OUTPUT_NAME} SHARED ${SOURCE_FILES})


