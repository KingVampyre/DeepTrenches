package github.KingVampyre.DeepTrenches.core.init;

public enum WoodType {
	ALMOND,
    ANAMEATA,
    ANGELS_TRUMPET,
    AQUEAN,
    BARSHROOKLE,
    BLACK_BIRCH,
    BLUE_MAHOE,
    BLUE_SPRUCE,
    BOTTLEBRUSH,
    BROMYA,
    BUBBLETREE,
    CALCEARB,
    CHERRY,
    CHOTORN,
    COOK_PINE,
    CROLOOD,
    DARK_CROLOOD,
    DARK_FUCHSITRA,
    DARK_RED_ELM,
    DEAD_WART_TREE,
    DRIGYUS,
    EBONY,
    ENDERHEART,
    FLALM,
    FRUCE,
    FUCHSITRA,
    FUGMOS,
    FUNERANITE,
    GHOSHROOM,
    GIANT_VIOLET,
    GUAIACUM,
    JOSHUA,
    KLINKII_PINE,
    MELALEUCA,
    MURKANTUAN,
    NORFOLK_PINE,
    OBSCRUS,
    ORHPRIS,
    PELTOGYNE,
    PIN_CHERRY,
    PLUM,
    PURFUNGA,
    RARK,
    RED_ELM,
    RHADI,
    SANGUART,
    SCARLET_THIORCEN,
    SEQUOIA,
    SPROOM,
    STORTREEAN,
    STROOMEAN,
    SUNRISE_FUNGUS,
    TARK,
    TEAK,
    THUNDERCLOUD_PLUM,
    VYNHERT,
    WART_TREE,
    WENGE,
    YEW
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
