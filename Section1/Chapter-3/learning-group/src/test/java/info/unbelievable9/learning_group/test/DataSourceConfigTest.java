package info.unbelievable9.learning_group;

import info.unbelievable9.learning_group.config.DataSourceConfig;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Copyright 2017 (C) Yunjian-VC
 * Created on : 2017/12/27
 * Author     : Unbelievable9
 **/
public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class devDataSourceConfigTest {

        @Autowired
        DataSource dataSource;

        @BeforeClass

        @Test
        public void shouldUseEmbeddedDatabase() {
            Assert.assertNotNull(dataSource);

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            List<String> result = jdbcTemplate.query("SELECT id, name FROM lessons", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet resultSet, int i) throws SQLException {
                    return resultSet.getLong("id") + ":" + resultSet.getString("name");
                }
            });

            Assert.assertEquals(2, result.size());
            Assert.assertEquals("2:数学", result.get(1));
        }
    }
}
