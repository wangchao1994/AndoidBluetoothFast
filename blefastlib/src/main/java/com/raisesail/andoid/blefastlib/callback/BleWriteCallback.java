package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.exception.BleException;

public abstract class BleWriteCallback extends BleBaseCallback{

    public abstract void onWriteSuccess(int current, int total, byte[] justWrite);

    public abstract void onWriteFailure(BleException exception);

}
