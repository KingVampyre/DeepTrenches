package github.KingVampyre.DeepTrenches.common.entity.ai.mob;

import com.google.common.collect.Maps;
import net.minecraft.util.Identifier;

import java.util.Map;

public class LightState {

    private static final Map<Identifier, LightState> VALUES = Maps.newHashMap();

    public static LightState create(String name) {
        var state = new LightState(name);
        var id = new Identifier(name);

        VALUES.put(id, state);

        return state;
    }

    public static LightState from(String id) {
        return VALUES.get(new Identifier(id));
    }

    private final String name;

    protected LightState(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
