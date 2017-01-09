package com.example.httprequestexample.net;

/**
 * Created by chenjianwei on 2016/12/11.
 */

public interface IRequestManager {

    /**
     * get请求
     * @param url
     * @param requestCallback
     */
    void get(String url, IRequestCallback requestCallback);

    /**
     * post请求
     * @param url
     * @param requestBodyJson
     * @param requestCallback
     */
    void post(String url, String requestBodyJson, IRequestCallback requestCallback);

    void put(String url, String requestBodyJson, IRequestCallback requestCallback);

    void delete(String url, String requestBodyJson, IRequestCallback requestCallback);

}
