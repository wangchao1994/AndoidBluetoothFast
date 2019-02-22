package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.data.BleDevice;

import java.util.List;

public abstract class BleScanCallback implements BleScanPresenterImp {

    public abstract void onScanFinished(List<BleDevice> scanResultList);

    public void onLeScan(BleDevice bleDevice) {
    }
}
