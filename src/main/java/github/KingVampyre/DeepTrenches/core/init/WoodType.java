package github.KingVampyre.DeepTrenches.core.init;

public enum WoodType {
	ALMOND,
    ANAMEATA,
    AQUEAN,
    BARSHROOKLE,
    BLACK_BIRCH,
    CHERRY,
    COOK_PINE,
    CROLOOD,
    DARK_CROLOOD,
    EBONY,
    FUCHSITRA,
    FUNERANITE,
    GHOSHROOM,
    PELTOGYNE,
    PIN_CHERRY,
    PLUM,
    PURFUNGA,
    SPROOM,
    STORTREEAN,
    STROOMEAN,
    SUNRISE_FUNGUS,
    TEAK,
    THUNDERCLOUD_PLUM
	;

	public static WoodType getType(String name) {
		
		for (WoodType type : WoodType.values())
			if (type.getName().equals(name))
				return type;
		
		return null;
    }
    
	public String getName() {
		return this.name().toLowerCase();
	}

}
