package info.unbelievable9.computer.config.original;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/22
 * Author     : Unbelievable9
 **/
@Configuration
@Import(SystemServiceConfig.class)
@ImportResource(value = "classpath:config/reference/software-config.xml")
public class ComputerConfig {
}
