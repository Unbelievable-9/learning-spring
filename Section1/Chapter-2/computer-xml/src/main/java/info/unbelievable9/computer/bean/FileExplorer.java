package info.unbelievable9.computer.bean;

import org.springframework.stereotype.Component;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/21
 * Author     : Unbelievable9
 **/
@Component
public class FileExplorer implements Software {

    private String name = "File Explorer";
    private String version = "1.0.0";

    @Override
    public void start() {
        System.out.print(name + "(" + version + ") is Loading");
    }
}
