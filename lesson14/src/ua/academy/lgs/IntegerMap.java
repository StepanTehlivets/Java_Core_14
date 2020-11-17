package ua.academy.lgs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerMap {

	Map <Integer, List<Integer>> map = new HashMap<>();
	public IntegerMap(){
	}
	

	public Map<Integer, List<Integer>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, List<Integer>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegerMap other = (IntegerMap) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IntegerMap [map=" + map + "]";
	}
	
}
