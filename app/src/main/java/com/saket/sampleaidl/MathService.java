package com.saket.sampleaidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

public class MathService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mStub;
    }

    IMathAidlInterface.Stub mStub = new IMathAidlInterface.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
                double aDouble, String aString) throws RemoteException {

        }

        @Override
        public int addNumbers(int num1, int num2) throws RemoteException {
            return num1 + num2;
        }

        @Override
        public int subtractNumbers(int num1, int num2) throws RemoteException {
            return num1 - num2;
        }

        @Override
        public int divideNumbers(int num1, int num2) throws RemoteException {
            return num1 / num2;
        }

        @Override
        public int multiplyNumbers(int num1, int num2) throws RemoteException {
            return num1 * num2;
        }
    };
}
