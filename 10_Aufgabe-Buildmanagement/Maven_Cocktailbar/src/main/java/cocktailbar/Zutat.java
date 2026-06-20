package cocktailbar;

import java.util.Objects;

public class Zutat {

	private String name;
	private boolean istAlkoholisch;
	
	public Zutat(String name, boolean istAlkoholisch) {
		this.name = name;
		this.istAlkoholisch = istAlkoholisch;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getIstAlkoholisch() {
		return this.istAlkoholisch;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name.toLowerCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Zutat andere = (Zutat) obj;
		return istAlkoholisch == andere.istAlkoholisch && Objects.equals(name.toLowerCase(), andere.name.toLowerCase());
	}
	
}
