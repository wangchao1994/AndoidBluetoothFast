package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.data.BleDevice;

public abstract class BleScanAndConnectCallback extends BleGattCallback implements BleScanPresenterImp {

    public abstract void onScanFinished(BleDevice scanResult);

    public void onLeScan(BleDevice bleDevice) {
    }

}
