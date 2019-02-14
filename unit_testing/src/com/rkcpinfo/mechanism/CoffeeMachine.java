package com.rkcpinfo.mechanism;

import com.rkcpinfo.data.Portion;
import com.rkcpinfo.exceptions.NotEnoughException;
import com.rkcpinfo.interfaces.ICoffeeMachine;
import com.rkcpinfo.interfaces.IContainer;

public class CoffeeMachine implements ICoffeeMachine {

	private IContainer coffeeContainer;
	private IContainer waterContainer;

	public CoffeeMachine(IContainer cContainer, IContainer wContainer) {
		coffeeContainer = cContainer;
		waterContainer = wContainer;
	}

	@Override
	public boolean makeCoffee(Portion portion) throws NotEnoughException {
		
		boolean isEnoughCoffee = coffeeContainer.getPortion(portion);
		boolean isEnoughWater = waterContainer.getPortion(portion);
		
		if (isEnoughCoffee && isEnoughWater) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public IContainer getWaterContainer() {
		return waterContainer;
	}

	@Override
	public IContainer getCoffeeContainer() {
		return coffeeContainer;
	}

}
