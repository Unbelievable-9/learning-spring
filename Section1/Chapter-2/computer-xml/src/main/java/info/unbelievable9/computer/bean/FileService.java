package info.unbelievable9.computer.bean;

import info.unbelievable9.computer.SystemService;
import info.unbelievable9.computer.Software;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
public class FileService implements SystemService {

    private Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    @Override
    public void operation() {
        software.start();
    }
}
