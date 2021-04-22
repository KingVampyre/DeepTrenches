package github.KingVampyre.DeepTrenches.core.init;

import com.google.common.collect.Sets;
import net.minecraft.util.SignType;

import java.util.Set;
import java.util.stream.Stream;

public class SignTypes {

	private static final Set<SignType> VALUES = Sets.newHashSet();

	public static final SignType ALMOND = register("almond");
	public static final SignType ANAMEATA = register("anameata");
	public static final SignType ANGELS_TRUMPET = register("angels_trumpet");
	public static final SignType AQUEAN = register("aquean");
	public static final SignType BARSHROOKLE = register("barshrookle");
	public static final SignType BLACK_BIRCH = register("black_birch");
	public static final SignType BLUE_MAHOE = register("blue_mahoe");
	public static final SignType BLUE_SPRUCE = register("blue_spruce");
	public static final SignType BOTTLEBRUSH = register("bottlebrush");
	public static final SignType BROMYA = register("bromya");
	public static final SignType BUBBLETREE = register("bubbletree");
	public static final SignType CALCEARB = register("calcearb");
	public static final SignType CHERRY = register("cherry");
	public static final SignType CHOTORN = register("chotorn");
	public static final SignType COOK_PINE = register("cook_pine");
	public static final SignType CROLOOD = register("crolood");
	public static final SignType DARK_CROLOOD = register("dark_crolood");
	public static final SignType DARK_FUCHSITRA = register("dark_fuchsitra");
	public static final SignType DARK_RED_ELM = register("dark_red_elm");
	public static final SignType DEAD_WART_TREE = register("dead_wart_tree");
	public static final SignType DRIGYUS = register("drigyus");
	public static final SignType EBONY = register("ebony");
	public static final SignType ENDERHEART = register("enderheart");
	public static final SignType FLALM = register("flalm");
	public static final SignType FRUCE = register("fruce");
	public static final SignType FUNERANITE = register("funeranite");
	public static final SignType FUCHSITRA = register("fuchsitra");
	public static final SignType FUGMOS = register("fugmos");
	public static final SignType GHOSHROOM = register("ghoshroom");
	public static final SignType GIANT_VIOLET = register("giant_violet");
	public static final SignType GUAIACUM = register("guiaiacum");
	public static final SignType JOSHUA = register("joshua");
	public static final SignType KLINKII_PINE = register("klinkii");
	public static final SignType MELALEUCA = register("melaleuca");
	public static final SignType MURKANTUAN = register("murkantuan");
	public static final SignType NORFOLK_PINE = register("norfolk_pine");
	public static final SignType OBSCRUS = register("obscrus");
	public static final SignType ORHPRIS = register("orhpris");
	public static final SignType PELTOGYNE = register("peltogyne");
	public static final SignType PIN_CHERRY = register("pin_cherry");
	public static final SignType PLUM = register("plum");
	public static final SignType PURFUNGA = register("purfunga");
	public static final SignType RARK = register("rark");
	public static final SignType RED_ELM = register("red_elm");
	public static final SignType RHADI = register("rhadi");
	public static final SignType SANGUART = register("sanguart");
	public static final SignType SCARLET_THIORCEN = register("scarlet_thiorcen");
	public static final SignType SEQUOIA = register("sequoia");
	public static final SignType SPROOM = register("sproom");
	public static final SignType STORTREEAN = register("stortreean");
	public static final SignType STROOMEAN = register("stroomean");
	public static final SignType SUNRISE_FUNGUS = register("sunrise_fungus");
	public static final SignType TARK = register("tark");
	public static final SignType TEAK = register("teak");
	public static final SignType THUNDERCLOUD_PLUM = register("thundercloud_plum");
	public static final SignType VYNHERT = register("vynhert");
	public static final SignType WART_TREE = register("wart_tree");
	public static final SignType WENGE = register("wenge");
	public static final SignType YEW = register("yew");

	public static boolean contains(SignType signType) {
		return VALUES.contains(signType);
	}

	private static SignType register(String name) {
		SignType signType = new SignType(name);

		VALUES.add(signType);
		return signType;
	}

	public static Stream<SignType> steam() {
		return VALUES.stream();
	}

}
