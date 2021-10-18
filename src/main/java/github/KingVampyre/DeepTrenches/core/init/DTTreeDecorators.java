package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerTreeDecoratorType;
import github.KingVampyre.DeepTrenches.core.world.gen.treedecorator.AqueanStaspNestTreeDecorator;
import github.KingVampyre.DeepTrenches.core.world.gen.treedecorator.FuchsitraStaspNestTreeDecorator;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import static net.minecraft.util.registry.Registry.TREE_DECORATOR_TYPE;

public class DTTreeDecorators {

    public static final TreeDecoratorType<AqueanStaspNestTreeDecorator> AQUEAN_TREE_STASP_NEST;
    public static final TreeDecoratorType<FuchsitraStaspNestTreeDecorator> FUCHSITRA_TREE_STASP_NEST;

    static {
        AQUEAN_TREE_STASP_NEST = InvokerTreeDecoratorType.create(AqueanStaspNestTreeDecorator.CODEC);
        FUCHSITRA_TREE_STASP_NEST = InvokerTreeDecoratorType.create(FuchsitraStaspNestTreeDecorator.CODEC);
    }

    public static void initialize() {
        Registry.register(TREE_DECORATOR_TYPE, "deep_trenches:aquean_tree_stasp_nest", AQUEAN_TREE_STASP_NEST);
        Registry.register(TREE_DECORATOR_TYPE, "deep_trenches:fuchsitra_tree_stasp_nest", FUCHSITRA_TREE_STASP_NEST);
    }

}
