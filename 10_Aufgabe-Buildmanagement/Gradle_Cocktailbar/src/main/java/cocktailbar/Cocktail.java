package cocktailbar;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cocktail extends Getraenk {

	private HashMap<Zutat, Double> rezept;
	

	public Cocktail(String name, HashMap<Zutat, Double> rezept) {
		super(name);
		this.rezept = rezept;
	}


	@Override
	public String getAnleitung() {
        StringBuilder sb = new StringBuilder("Rezept: ");
        boolean first = true;
        for (Map.Entry<Zutat, Double> eintrag : rezept.entrySet()) {
            if (!first) sb.append(", ");
            sb.append(String.format("%.1fcl %s", eintrag.getValue(), eintrag.getKey().getName()));
            first = false;
        }
        sb.append(".");
        return sb.toString();
	}
	
	 public HashMap<Zutat, Double> getRezept() {
	        return rezept;
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
		
		Cocktail anderer = (Cocktail) obj;
		return Objects.equals(name.toLowerCase(), anderer.name.toLowerCase());
	}

}
