package com.bae.HelloWord.mehods;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder {
	private Map<Integer, String> items = new HashMap<Integer, String>();

	public Map<Integer, String> getItems() {
		return items;
	}

	public void setItems(Integer number, String thing) {
		this.items.put(number, thing);
	}
}
