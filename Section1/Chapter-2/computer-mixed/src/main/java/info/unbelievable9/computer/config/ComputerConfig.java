package info.unbelievable9.computer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Configuration
@Import(FileServiceConfig.class)
@ImportResource("classpath:config/software-config.xml")
public class ComputerConfig {
}
