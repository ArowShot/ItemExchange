package com.github.arowshot.itemexchange.exchangerules;

import org.bukkit.inventory.ItemStack;

import com.github.arowshot.itemexchange.exchanges.Exchange;

import vg.civcraft.mc.civmodcore.inventorygui.Clickable;

public abstract class ExchangeRule {
	public abstract boolean conforms(ItemStack item);
	public abstract String getDisplayText();
	public abstract void showModifyRule(Exchange ex);
	public abstract Clickable makeModifyButton(Exchange ex);
}
