package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.data.BleDevice;

public interface BleScanPresenterImp {

    void onScanStarted(boolean success);

    void onScanning(BleDevice bleDevice);

}
