package br.com.viniciusmr.spbootdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;

@SpringBootApplication
@EnableJdbcRepositories
@Import(JdbcConfiguration.class)
public class SpbootDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbootDataJdbcApplication.class, args);
	}
}
