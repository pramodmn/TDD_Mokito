package com.rkcpinfo.interfaces;

import com.rkcpinfo.data.Portion;
import com.rkcpinfo.exceptions.NotEnoughException;

public interface IContainer {
	
	public boolean getPortion(Portion portion) throws NotEnoughException;
	public int getCurrentVolume();
	public int getTotalVolume();
	public void refillContainer();

}
