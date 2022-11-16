package com.github.dragoni7.traits;

import java.util.Collection;

import com.github.dragoni7.main.SilentCompat;

import net.minecraft.resources.ResourceLocation;
import net.silentchaos512.gear.gear.trait.SimpleTrait;

public class ColdTrait extends SimpleTrait {
	public static final Serializer<ColdTrait> SERIALIZER = new Serializer<ColdTrait>(new ResourceLocation(SilentCompat.MODID, "cold"), ColdTrait::new);

	public ColdTrait(ResourceLocation id) {
		super(id, SERIALIZER);
	}
	
	@Override
    public Collection<String> getExtraWikiLines() {
        Collection<String> ret = super.getExtraWikiLines();
        ret.add("Chills attackers");
        return ret;
    }
}
