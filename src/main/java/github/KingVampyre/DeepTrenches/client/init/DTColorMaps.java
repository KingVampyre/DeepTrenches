package github.KingVampyre.DeepTrenches.client.init;

import github.KingVampyre.DeepTrenches.client.color.StorceanColorMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;

import static github.KingVampyre.DeepTrenches.client.init.DTTextures.*;
import static net.minecraft.resource.ResourceType.CLIENT_RESOURCES;

public class DTColorMaps {

    public static final StorceanColorMap STORCEAN_FOLIAGE;
    public static final StorceanColorMap STORCEAN_MOSOIL;
    public static final StorceanColorMap CLEAR_WATER;
    public static final StorceanColorMap STORCEAN_ABYSSOPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_CLEAR_WATER;
    public static final StorceanColorMap STORCEAN_ENDERPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_GASOPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_HADOPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_INFINIPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_VIRDIPELAGIC_WATER;
    public static final StorceanColorMap STORCEAN_WATER;

    static {
        STORCEAN_FOLIAGE = new StorceanColorMap(7559325, STORCEAN_FOLIAGE_COLORMAP);
        STORCEAN_MOSOIL = new StorceanColorMap(5867901, STORCEAN_MOSOIL_COLORMAP);
        CLEAR_WATER = new StorceanColorMap(8829625, CLEAR_WATER_COLORMAP);
        STORCEAN_ABYSSOPELAGIC_WATER = new StorceanColorMap(2440568, STORCEAN_ABYSSOPELAGIC_WATER_COLORMAP);
        STORCEAN_CLEAR_WATER = new StorceanColorMap(10266311, STORCEAN_CLEAR_WATER_COLORMAP);
        STORCEAN_ENDERPELAGIC_WATER = new StorceanColorMap(13407218, STORCEAN_ENDERPELAGIC_WATER_COLORMAP);
        STORCEAN_GASOPELAGIC_WATER = new StorceanColorMap(16760790, STORCEAN_GASOPELAGIC_WATER_COLORMAP);
        STORCEAN_HADOPELAGIC_WATER = new StorceanColorMap(2259063, STORCEAN_HADOPELAGIC_WATER_COLORMAP);
        STORCEAN_INFINIPELAGIC_WATER = new StorceanColorMap(2592129, STORCEAN_INFINIPELAGIC_WATER_COLORMAP);
        STORCEAN_VIRDIPELAGIC_WATER = new StorceanColorMap(4506748, STORCEAN_VIRDIPELAGIC_WATER_COLORMAP);
        STORCEAN_WATER = new StorceanColorMap(3420586, STORCEAN_WATER_COLORMAP);
    }

    public static void initialize() {
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_FOLIAGE);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_MOSOIL);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(CLEAR_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_ABYSSOPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_CLEAR_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_ENDERPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_GASOPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_HADOPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_INFINIPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_VIRDIPELAGIC_WATER);
        ResourceManagerHelper.get(CLIENT_RESOURCES).registerReloadListener(STORCEAN_WATER);
    }

}
