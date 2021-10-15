package github.KingVampyre.DeepTrenches.core.init;

import github.KingVampyre.DeepTrenches.core.mixin.InvokerTreeDecoratorType;
import github.KingVampyre.DeepTrenches.core.world.gen.treedecorator.AqueanStaspNestTreeDecorator;
import github.KingVampyre.DeepTrenches.core.world.gen.treedecorator.FuchsitraStaspNestTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class DTTreeDecorators {

    public static final TreeDecoratorType<AqueanStaspNestTreeDecorator> AQUEAN_TREE_STASP_NEST;
    public static final TreeDecoratorType<FuchsitraStaspNestTreeDecorator> FUCHSITRA_TREE_STASP_NEST;

    static {
        AQUEAN_TREE_STASP_NEST = InvokerTreeDecoratorType.create(AqueanStaspNestTreeDecorator.CODEC);
        FUCHSITRA_TREE_STASP_NEST = InvokerTreeDecoratorType.create(FuchsitraStaspNestTreeDecorator.CODEC);
    }

}
