package com.vukm.demo.responses;

import lombok.Data;

import java.util.List;

/**
 * @author kieuvu
 * Created on 26/10/2022.
 */

@Data
public class ResponseDTO <T>{
    T data;
    boolean status;
}