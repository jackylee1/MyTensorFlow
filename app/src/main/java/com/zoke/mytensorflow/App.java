package com.zoke.mytensorflow;

import android.app.Application;

import org.xutils.x;

/**
 * Created by wulijie on 2018/7/6.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }
}
