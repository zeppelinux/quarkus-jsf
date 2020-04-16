package com.github.zeppelinux.quarkusjsf.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
public class ListController {

    private final static Logger logger = LoggerFactory.getLogger(ListController.class);

    public List<String> callMe(){
        logger.info("just got called!");
        return Arrays.asList("one", "two", "three");
    }
}
