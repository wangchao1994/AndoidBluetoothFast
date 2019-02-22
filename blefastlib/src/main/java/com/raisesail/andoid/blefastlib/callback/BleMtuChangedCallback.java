package com.raisesail.andoid.blefastlib.callback;


import com.raisesail.andoid.blefastlib.exception.BleException;

public abstract class BleMtuChangedCallback extends BleBaseCallback {

    public abstract void onSetMTUFailure(BleException exception);

    public abstract void onMtuChanged(int mtu);

}
