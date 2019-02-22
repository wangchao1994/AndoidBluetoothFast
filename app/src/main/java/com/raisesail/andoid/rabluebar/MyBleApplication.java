package com.raisesail.andoid.rabluebar;

import android.app.Application;

import com.clj.fastble.BleManager;

public class MyBleApplication extends Application {
    public static MyBleApplication intance;
    @Override
    public void onCreate() {
        super.onCreate();
        intance = this;
        //初始化蓝牙配置
        BleManager.getInstance().init(this);
        BleManager.getInstance()
                .enableLog(true)
                .setReConnectCount(1, 5000)
                .setOperateTimeout(5000);
    }
    public synchronized  static  MyBleApplication getInstance(){
        return intance;

    }
}
