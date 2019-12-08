package com.mscs.service;

import java.time.LocalDateTime;

import com.mscs.code.FareStrategy;
import com.mscs.factory.FareStrategyFactory;
import com.mscs.model.Station;

public class FareCalculator {
	 public double getFare(Station source, Station destination, LocalDateTime localDateTime) {
	        FareStrategy fareStrategy = FareStrategyFactory.getFareStrategy(localDateTime);
	        int distance = source.distance(destination);

	        double fare = distance * fareStrategy.getFarePerStation();

	        return fare;
	    }
}
