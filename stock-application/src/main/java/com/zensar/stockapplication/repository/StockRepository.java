package com.zensar.stockapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.stockapplication.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock,Long>{

	//List<Stock> findByNameAndPrice(String stockName, double price);
	@Query(value="select * from stock  where name=:name and price=:price",nativeQuery=true)
	List<Stock> findStockByItsNameAndPrice(@Param("name")String stockName,@Param("price") double price);
	@Query(value="select * from stock  where name=:name",nativeQuery=true)
	List<Stock> findStockByItsName(@Param("name")String stockName);

	
}
