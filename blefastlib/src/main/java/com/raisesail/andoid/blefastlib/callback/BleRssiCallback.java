package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.exception.BleException;

public abstract class BleRssiCallback extends BleBaseCallback{

    public abstract void onRssiFailure(BleException exception);

    public abstract void onRssiSuccess(int rssi);

}