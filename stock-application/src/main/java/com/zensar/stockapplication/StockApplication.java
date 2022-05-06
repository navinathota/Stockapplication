package com.zensar.stockapplication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.zensar.stockapplication.entity.Stock;

@SpringBootApplication
@ComponentScan(basePackages="com.zensar")
public class StockApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
		
		
		Stock stock = new Stock();
		stock.getName();
		stock.getStockId();
		stock.setStockId(10L);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
