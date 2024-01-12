package ru.synergy;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создадим стандартный HTTP клиент
        CloseableHttpClient httpClient = HttpClients.createDefault();
/*
        //GET запрос к www.cbr.ru/
        HttpGet request = new HttpGet("https://www.cbr.ru/scripts/XML_dynamic.asp" +
                "?date_req1=28/09/2023&date_req2=29/09/2023&VAL_NM_RQ=R01235");
        try {
            HttpResponse response = httpClient.execute(request);
            InputStream inputStream = response.getEntity().getContent();
            System.out.println(response.getStatusLine());
            // в случае статуса ответа 200 выведем тело ответа
            if (response.getStatusLine().getStatusCode() == 200) {
                Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        //GET запрос к Swagger REST Countries
//        HttpGet request = new HttpGet("https://restcountries.com/v3.1/all");
        HttpGet request = new HttpGet("https://restcountries.com/v3.1/name/deutschland");
        try {
            HttpResponse response = httpClient.execute(request);
            InputStream inputStream = response.getEntity().getContent();
            System.out.println(response.getStatusLine());
            // в случае статуса ответа 200 выведем тело ответа
            if (response.getStatusLine().getStatusCode() == 200) {
                Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/*
        //GET запрос к Swagger Petstore
        HttpGet request = new HttpGet("https://petstore.swagger.io/v2/pet/1088");
        try {
            HttpResponse response = httpClient.execute(request);
            InputStream inputStream = response.getEntity().getContent();
            System.out.println(response.getStatusLine());
            // в случае статуса ответа 200 выведем тело ответа
            if (response.getStatusLine().getStatusCode() == 200) {
                Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/

        //POST запрос к Swagger Petstore
/*
        HttpPost requestPost = new HttpPost("https://petstore.swagger.io/v2/pet");
        try {
            //Формируем данные для отправки на сервер в формате JSON
            StringEntity stringEntity = new StringEntity("{\n" +
                    "  \"id\": 1089,\n" +
                    "  \"category\": {\n" +
                    "    \"id\": 1089,\n" +
                    "    \"name\": \"dog\"\n" +
                    "  },\n" +
                    "  \"name\": \"bobik2\",\n" +
                    "  \"photoUrls\": [\n" +
                    "    \"string\"\n" +
                    "  ],\n" +
                    "  \"tags\": [\n" +
                    "    {\n" +
                    "      \"id\": 1089,\n" +
                    "      \"name\": \"bolonka2\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"status\": \"available\"\n" +
                    "}");
            requestPost.setEntity(stringEntity);
            requestPost.setHeader("Accept", "application/json");
            requestPost.setHeader("Content-type", "application/json");
            HttpResponse response = httpClient.execute(requestPost);
            InputStream inputStream = response.getEntity().getContent();
            System.out.println(response.getStatusLine());
            // в случае статуса ответа 200 выведем тело ответа
            if (response.getStatusLine().getStatusCode() == 200) {
                Scanner scanner = new Scanner(inputStream);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
 */


    }
}