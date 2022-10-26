package com.vukm.demo.responses;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kieuvu
 * Created on 26/10/2022.
 */

public class ResponseDTO<K, V> {
    Map<String, V> data;
    boolean status;

    public ResponseDTO() {
        this.data = new HashMap<>();
        this.status = false;
    }

    public void setData(String key, V value) {
        this.data.put(key, value);
    }

    public Map<String, V> getData() {
        return this.data;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}