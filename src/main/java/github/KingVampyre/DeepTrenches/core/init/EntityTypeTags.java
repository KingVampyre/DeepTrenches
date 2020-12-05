package github.KingVampyre.DeepTrenches.core.init;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class EntityTypeTags {

    // Orders
    public static final Tag<EntityType<?>> PERCIFORMES = TagRegistry.entityType(new Identifier("deep_trenches:orders/perciformes"));

    public static final Tag<EntityType<?>> STOMIIFORMES = TagRegistry.entityType(new Identifier("deep_trenches:orders/stromiiformes"));

    public static final Tag<EntityType<?>> STORCEANOVESPIIFORMES = TagRegistry.entityType(new Identifier("deep_trenches:orders/storceanovespiiformes"));

    // Family
    public static final Tag<EntityType<?>> OSPHRONEMIDAE = TagRegistry.entityType(new Identifier("deep_trenches:families/osphronemidae"));

    public static final Tag<EntityType<?>> STERNOPTYCHIDAE = TagRegistry.entityType(new Identifier("deep_trenches:families/sternoptychidae"));

    public static final Tag<EntityType<?>> STOMIIDAE = TagRegistry.entityType(new Identifier("deep_trenches:families/stomiidae"));

    public static final Tag<EntityType<?>> STORCEANOVESPIIDAE = TagRegistry.entityType(new Identifier("deep_trenches:families/storceanovespiidae"));

    // Genuses
    public static final Tag<EntityType<?>> APOPLIXIOVESPA = TagRegistry.entityType(new Identifier("deep_trenches:genuses/apoplixiovespa"));

    public static final Tag<EntityType<?>> ARGYROPELECUS = TagRegistry.entityType(new Identifier("deep_trenches:genuses/argyropelecus"));

    public static final Tag<EntityType<?>> MALACOSTEUS = TagRegistry.entityType(new Identifier("deep_trenches:genuses/malacosteus"));

    public static final Tag<EntityType<?>> PACHYSTOMIAS = TagRegistry.entityType(new Identifier("deep_trenches:genuses/pachystomias"));

    public static final Tag<EntityType<?>> BETTA = TagRegistry.entityType(new Identifier("deep_trenches:genuses/betta"));

    // Species
    public static final Tag<EntityType<?>> BARBELED_LOOWSEJAWS = TagRegistry.entityType(new Identifier("deep_trenches:species/barbeled_loosejaws"));

    public static final Tag<EntityType<?>> SPENDIDENS_BETTA = TagRegistry.entityType(new Identifier("deep_trenches:species/spendidens_betta"));

    public static final Tag<EntityType<?>> TRELOSIAGNUS_BETTA = TagRegistry.entityType(new Identifier("deep_trenches:species/trelosiagnus_betta"));

    public static final Tag<EntityType<?>> BLACK_LOOWSEJAWS = TagRegistry.entityType(new Identifier("deep_trenches:species/black_loosejaw"));

    public static final Tag<EntityType<?>> LIGHT_LOOSEJAWS = TagRegistry.entityType(new Identifier("deep_trenches:species/light_loosejaw"));

    public static final Tag<EntityType<?>> PACHYSTOMIAS_MICRODON = TagRegistry.entityType(new Identifier("deep_trenches:species/pachystomias_microdon"));

    public static final Tag<EntityType<?>> STASPS = TagRegistry.entityType(new Identifier("deep_trenches:species/stasps"));


}
