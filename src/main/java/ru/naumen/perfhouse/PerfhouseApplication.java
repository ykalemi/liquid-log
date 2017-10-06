package ru.naumen.perfhouse;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.naumen.sd40.log.parser.App;

@SpringBootApplication(scanBasePackages = { "ru.naumen" })
public class PerfhouseApplication
{
    public static void main(String[] args) throws IOException, ParseException
    {
        if (System.getProperty("Parser") != null)
        {
            App.main(args);
        }
        else
        {
            SpringApplication.run(PerfhouseApplication.class, args);
        }
    }

}
