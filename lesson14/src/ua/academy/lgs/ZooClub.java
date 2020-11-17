package ua.academy.lgs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
	Map<Person, List<Animal>> map = new HashMap<>();
	
	
	public ZooClub() {
		
	}


	public Map<Person, List<Animal>> getMap() {
		return map;
	}


	public void setMap(Map<Person, List<Animal>> map) {
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
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}
	
	
}
