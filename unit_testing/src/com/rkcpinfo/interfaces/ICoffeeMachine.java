package com.rkcpinfo.interfaces;

import com.rkcpinfo.data.Portion;
import com.rkcpinfo.exceptions.NotEnoughException;

public interface ICoffeeMachine {
	
	public boolean makeCoffee(Portion portion) throws NotEnoughException;
	public IContainer getCoffeeContainer();
	public IContainer getWaterContainer();

}
