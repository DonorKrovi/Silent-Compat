package com.github.dragoni7.silentcompat.trait;

import java.util.Collection;

import com.github.dragoni7.silentcompat.SilentCompat;

import net.minecraft.resources.ResourceLocation;
import net.silentchaos512.gear.gear.trait.SimpleTrait;

public class JoltHitTrait extends SimpleTrait {
	
	public static final Serializer<JoltHitTrait> SERIALIZER = new Serializer<JoltHitTrait>(new ResourceLocation(SilentCompat.MODID, "jolt_hit"), JoltHitTrait::new);
	
	public JoltHitTrait(ResourceLocation id) {
		super(id, SERIALIZER);
	}
	
	@Override
    public Collection<String> getExtraWikiLines() {
        Collection<String> ret = super.getExtraWikiLines();
        ret.add("Attacks have a chance to jolt the target, making it take extra damage and bounce damage to a nearby entity");
        return ret;
    }
}
