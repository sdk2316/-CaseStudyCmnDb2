package com.cognizant.flightbooking.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.flightbooking.entity.BookFlight;

public interface BookFlightRepo extends JpaRepository<BookFlight, Integer> {

	List<BookFlight> findByEmail(String email);

	List<BookFlight> findBypnr(Integer pnr);

	@Modifying
	@Transactional
	@Query(value = "DELETE FROM BookFlight WHERE pnr = :pnr", nativeQuery = true)
	Integer deleteByPnr(@Param("pnr") Integer pnr);
	

}
