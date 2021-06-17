package com.ilCarro.qa14.tests;

import com.ilCarro.qa14.models.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> validUser(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"fName", "sName", "fName+3@mail.ru", "Berlin12345"});
        list.add(new Object[]{"fName", "sName", "fName+4@mail.ru", "Telran234567"});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> validUserFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/tests_NewUser.csv")));
        String line = reader.readLine();
        String[] split = new String[0];
        while (line != null) {
            split = line.split(",");
        }
        list.add(new Object[]{new User().withFirstName(split[0]).withSecondName(split[1])
                .withEmail(split[2]).withPassword(split[3])});
        line = reader.readLine();
        return list.iterator();
    }

}
