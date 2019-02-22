package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.exception.BleException;

public abstract class BleReadCallback extends BleBaseCallback {

    public abstract void onReadSuccess(byte[] data);

    public abstract void onReadFailure(BleException exception);

}
