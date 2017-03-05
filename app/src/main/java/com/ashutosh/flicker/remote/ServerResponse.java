package com.ashutosh.flicker.remote;

/**
 * Created by Reetesh on 3/5/2017.
 */

public class ServerResponse {

    private String mInputStream;

    private Exception mException;

    private int mResponseCode;

    public String getServerResponse() {
        return mInputStream;
    }

    public void setServerResponse(String mInputStream) {
        this.mInputStream = mInputStream;
    }

    public Exception getException() {
        return mException;
    }

    public void setException(Exception mException) {
        this.mException = mException;
    }

    public int getResponseCode() {
        return mResponseCode;
    }

    public void setResponseCode(int mResponseCode) {
        this.mResponseCode = mResponseCode;
    }

}
