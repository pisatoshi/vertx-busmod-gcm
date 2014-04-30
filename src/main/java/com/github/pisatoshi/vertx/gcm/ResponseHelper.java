package com.github.pisatoshi.vertx.gcm;

import org.vertx.java.core.json.JsonObject;

import java.util.HashMap;
import java.util.Random;

public class ResponseHelper {
    private HashMap<String, JsonObject> response;
    private Random random;
    private long multicastId;
    private int backoff;

    public ResponseHelper( int backoff ) {
        response = new HashMap<String, JsonObject>();
        multicastId = 0;
        random = new Random();
        this.backoff = backoff;
    }

    public int getBackoff() {
        return backoff;
    }

    public void setBackoff( int backoff ) {
        this.backoff = backoff;
    }

    public HashMap<String, JsonObject> getResponse() {
        return response;
    }

    public void setResponse( HashMap<String, JsonObject> response ) {
        this.response = response;
    }

    public long getMulticastId() {
        return multicastId;
    }

    public void setMulticastId( long multicastId ) {
        this.multicastId = multicastId;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom( Random random ) {
        this.random = random;
    }
}
