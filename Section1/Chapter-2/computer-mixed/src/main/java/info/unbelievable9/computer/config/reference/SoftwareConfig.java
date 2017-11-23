package info.unbelievable9.computer.config.reference;

import info.unbelievable9.computer.Software;
import info.unbelievable9.computer.bean.FileExplorer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/23
 * Author     : Unbelievable9
 **/
@Configuration
public class SoftwareConfig {

    @Bean
    public Software fileExplorer() {
        return new FileExplorer();
    }
}
