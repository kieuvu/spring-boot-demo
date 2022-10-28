package com.vukm.demo.responses;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kieuvu
 * Created on 26/10/2022.
 */

public class ResponseDTO<V> {
    Map<String, V> data;
    boolean status;

    public ResponseDTO() {
        this.data = new HashMap<>();
        this.status = false;
    }

    public ResponseDTO<V> setData(String key, V value) {
        this.data.put(key, value);
        return this;
    }

    public Map<String, V> getData() {
        return this.data;
    }

    public boolean getStatus() {
        return this.status;
    }

    public ResponseDTO<V> setStatus(boolean status) {
        this.status = status;
        return this;
    }
}