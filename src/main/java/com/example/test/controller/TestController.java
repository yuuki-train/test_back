package com.example.test.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins ="*")
public class TestController {

    @RequestMapping(value ="/plus", method = {RequestMethod.POST})
    @ResponseBody
    public String plus(@RequestParam Map<String, String> requestParams){

        String result;

        try{
            String strLeft = requestParams.get("leftNumber");
            String strRight = requestParams.get("rightNumber");

            int left = Integer.parseInt(strLeft);
            int right =Integer.parseInt(strRight);
            int total= left + right;
            result = Integer.toString(total);

        }catch(NumberFormatException e1){
            result = "error";
        }
        String response =  "[{ \"result\": " + result + "}]";
        System.out.println(response);
        return response;
    }

}

