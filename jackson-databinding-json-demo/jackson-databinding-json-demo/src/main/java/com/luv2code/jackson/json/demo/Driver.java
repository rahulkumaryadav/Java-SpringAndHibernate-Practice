package com.luv2code.jackson.json.demo;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            // create object mapper
            ObjectMapper objectMapper=new ObjectMapper();

            //read json file and map/convert to java POJO
            //data/sample-lite.json

            Student theStudent=objectMapper.readValue(new File("E:\\WorkingProject\\Java-SpringAndHibernate-Practice\\jackson-databinding-json-demo\\jackson-databinding-json-demo\\data\\sample-full.json"),Student.class);

            //print first name and last name
            System.out.println("First Name "+theStudent.getFirstName());
            System.out.println("Last Name "+theStudent.getLastName());
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
