package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

public class LoginTest {

    //input: zhangsan
    //output: bad request

    //input: 13867450987
    //output: bad request


    //input: zhangsan 13867450987
    //output: login success

    @Test
    public void should_get_badrequest_when_given_username_only() throws Exception {
        //given
        String username = "zhangsan";
        String phone = "";
        Login login = new Login();
        ResponseEntity<String> except = new ResponseEntity<String>("bad request", BAD_REQUEST);

        //when
        ResponseEntity<String> responseEntity = login.save(username, phone);
        //then
        Assert.assertEquals(except, responseEntity);
    }

    @Test
    public void should_get_badrequest_when_given_phone_only() throws Exception {
        //given
        String username = "";
        String phone = "13456723476";
        Login login = new Login();
        ResponseEntity<String> except = new ResponseEntity<String>("bad request", BAD_REQUEST);

        //when
        ResponseEntity<String> responseEntity = login.save(username, phone);
        //then
        Assert.assertEquals(except, responseEntity);
    }

    @Test
    public void should_get_ok_when_given_username_and_phone() throws Exception {
        //given
        String username = "zhangsan";
        String phone = "13456723476";
        Login login = new Login();
        ResponseEntity<String> except = new ResponseEntity<String>("login success", OK);

        //when
        ResponseEntity<String> responseEntity = login.save(username, phone);
        //then
        Assert.assertEquals(except, responseEntity);
    }
}
