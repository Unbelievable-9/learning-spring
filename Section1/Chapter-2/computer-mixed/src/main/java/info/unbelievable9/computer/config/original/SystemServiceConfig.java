package info.unbelievable9.computer.config.original;

import info.unbelievable9.computer.Software;
import info.unbelievable9.computer.SystemService;
import info.unbelievable9.computer.bean.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Configuration
public class SystemServiceConfig {

    @Bean
    public SystemService fileService(Software xyplorer) {
        return new FileService(xyplorer);
    }
}
