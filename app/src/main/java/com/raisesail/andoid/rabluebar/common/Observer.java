package com.raisesail.andoid.rabluebar.common;


import com.clj.fastble.data.BleDevice;

public interface Observer {
    void disConnected(BleDevice bleDevice);
}
