package info.unbelievable9.computer.config;

import info.unbelievable9.computer.Software;
import info.unbelievable9.computer.SystemService;
import info.unbelievable9.computer.bean.FileExplorer;
import info.unbelievable9.computer.bean.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Configuration
public class ComputerConfig {

    @Bean(name = "fileExplorer")
    public Software software() {
        return new FileExplorer();
    }

    @Bean(name = "fileService")
    public SystemService systemService(Software software) {
        return new FileService(software);
    }
}
