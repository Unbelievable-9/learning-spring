package info.unbelievable9.computer.bean;

import info.unbelievable9.computer.Software;
import info.unbelievable9.computer.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Component
public class FileService implements SystemService {

    private Software software;

    @Autowired(required = false)
    public FileService(Software software) {
        this.software = software;
    }

    @Override
    public void operation() {
        software.start();
    }
}
