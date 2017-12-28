package info.unbelievable9.learning_group.test;

import info.unbelievable9.learning_group.config.DataSourceConfig;
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

import static org.junit.Assert.*;

/**
 * Copyright 2017 (C) Yunjian-VC
 * Created on : 2017/12/27
 * Author     : Unbelievable9
 **/
public class DataSourceConfigTest {

    /* ------ Annotation Config ------ */

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class devDataSourceJavaConfigTest {

        @Autowired
        DataSource dataSource;

        @Test
        public void shouldUseEmbeddedDatabase() {
            assertNotNull(dataSource);

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            List<String> result = jdbcTemplate.query("SELECT id, name FROM Lessons", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet resultSet, int i) throws SQLException {
                    return resultSet.getLong("id") + ":" + resultSet.getString("name");
                }
            });

            assertEquals(2, result.size());
            assertEquals("2:数学", result.get(1));
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("prod")
    public static class prodDataSourceJavaConfigTest {

        @Autowired
        DataSource dataSource;

        @Test
        public void shouldUseEmbeddedDatabase() {
            assertNull(dataSource);
        }
    }

    /* ------ XML Config ------ */

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("dev")
    public static class devDataSourceXMLConfigTest {

        @Autowired
        DataSource dataSource;

        @Test
        public void shouldUseEmbeddedDatabase() {
            assertNotNull(dataSource);

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            List<String> result = jdbcTemplate.query("SELECT * FROM Lessons", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet resultSet, int i) throws SQLException {
                    return resultSet.getLong("id") + ":" + resultSet.getString("name");
                }
            });

            assertEquals(2, result.size());
            assertEquals("2:数学", result.get(1));
        }
    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("prod")
    public static class prodDataSourceXMLConfigTest {

        @Autowired(required = false)
        DataSource dataSource;

        @Test
        public void shouldUseEmbeddedDatabase() {
            assertNull(dataSource);
        }
    }
}
