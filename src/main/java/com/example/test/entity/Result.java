package com.example.test.entity;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*")
public class Result {
    private int left;
    private int right;
    private int total;

    public Result(int left, int right, int total) {
    }

    public final int getLeft(){
        return left;
    }

    public final int getRight(){
        return right;
    }

    public final int getTotal(){
        return total;
    }


}
