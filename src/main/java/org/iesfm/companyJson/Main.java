package org.iesfm.companyJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Company company = mapper.readValue(new File(Main.class.getResource("/company.json").toURI()), Company.class);
            logger.info(company.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
