package info.unbelievable9.learning_group.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/24
 * Author     : Unbelievable9
 **/
@Configuration
public class DataSource {

    @Bean
    @Profile("dev")
    public Datasource embeddedDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:data.sql")
                .build();
    }
}