package com.mscs.code;

public class WeekdayFareStrategy implements FareStrategy {
	@Override
	public String getName() {
		return WeekdayFareStrategy.class.toGenericString();
	}

	@Override
	public double getFarePerStation() {
		return 7;
	}

}
