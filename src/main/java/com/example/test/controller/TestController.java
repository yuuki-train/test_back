package com.example.test.controller;

import com.example.test.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins ="*")
public class TestController {

    @RequestMapping(value ="/getResult", method = {RequestMethod.GET})
    public String plus(@RequestParam Map<String, String> requestParams){

        /*
        try{
            /*
            String strLeft = requestParams.get("leftNumber");
            String strRight = requestParams.get("rightNumber");

            int left = Integer.parseInt(strLeft);
            int right =Integer.parseInt(strRight);
            int total= left + right;
             */

            return "[{\"left\": 1, \"right\": 1, \"total\": 2}]";

        /*
        }catch (NumberFormatException || NullPointerException e1){
            e1.printStackTrace();
            result = "error";
        }
        */
    }

    /*
    @RequestMapping(value="/getResult", method = RequestMethod.GET)
    @ResponseBody
    public String getResult(){
        int left = getLeft();
        int right = getRight();
        int total = getTotal();
        System.out.println(left);
        System.out.println(right);
        System.out.println(total);
        String strLeft = Integer.toString(left);
        String strRight = Integer.toString(right);
        String strTotal = Integer.toString(total);


        String json = "[{\"left\": " + strLeft +
                ", \"right\": " + strRight +
                ", \"total\": " + strTotal +
                "}]";
        return json;
    }

         */
}

