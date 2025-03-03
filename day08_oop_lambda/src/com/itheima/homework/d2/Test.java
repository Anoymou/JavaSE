package com.itheima.homework.d2;

public class Test {
    public static void main(String[] args) {
        // 使用匿名内部类实现INFO级别的日志记录器infoLogger
        Logger infoLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println("[INFO]"+message);
            }
        };
        // 使用Lambda表达式实现WARNING级别的日志记录器warningLogger
        Logger warningLogger = message -> System.out.println("[WARNING]"+message);
        // 使用Lambda表达式实现ERROR级别的日志记录器errorLogger
        Logger errorLogger = message -> System.out.println("[ERROR]"+message);
        // 记录日志
        infoLogger.log("这是一条info级别的日志.");
        warningLogger.log("这是一条warning级别的日志.");
        errorLogger.log("这是一条error级别的日志.");
    }
}
