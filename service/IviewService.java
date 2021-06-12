package com.example.demo.service;


import com.example.demo.utils.StringUtils;
import com.example.demo.utils.XmlUtils;

import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import org.springframework.stereotype.Service;

@Service
public class IviewService {
    private static final String url="http://192.168.3.41/xmlservice/entry";
    private static final String viewadmin="admin";
    private static final String viewpasswd="Avaya123";

    HttpClient httpClient;
    private void createConnection() {
        httpClient=new HttpClient();
       Credentials credentials = new UsernamePasswordCredentials(viewadmin, viewpasswd);
        httpClient.getState().setCredentials(AuthScope.ANY,credentials);
    }

    public String sendRequest(Object object){

        String responseBodyAsString=null;
        try{
            createConnection();
            String xmlReqest= XmlUtils.beanToXml(object);
            System.out.println(xmlReqest);

            StringRequestEntity stringRequestEntity = new StringRequestEntity(xmlReqest);

            PostMethod postMethod = new PostMethod(url);
            postMethod.setRequestEntity(stringRequestEntity);

            httpClient.executeMethod(postMethod);
            responseBodyAsString = postMethod.getResponseBodyAsString();
            System.out.println(responseBodyAsString);



        }catch (Exception e){
            e.printStackTrace();
        }
        return responseBodyAsString;
    }
}
