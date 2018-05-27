package com.souban.bdd.framework.page;

import com.souban.bdd.framework.Config;

public class UIElement {
	public String name;
	public String locator;
	public String zone;
	public int index;
	public String desc;
	private Config config = Config.getInstance();

	public UIElement(final String name, final String locator, final String zone, final String index,
			final String desc) {
		this.name = name;
		this.locator = locator;
		this.zone = zone;
		this.index = 0;// for play safe
		if (index != null && !"".equals(index.trim())) {
			try {
				this.index = Integer.parseInt(index.trim());
			} catch (NumberFormatException ex) {
			}
		}
		this.desc = desc;
	}

	public UIElement(final String name, final String locator, final String zone, final int index, final String desc) {
		this.name = name;
		this.locator = locator;
		this.zone = zone;
		this.index = index;
		this.desc = desc;
	}

	public UIElement(final String name, final String locator, final String desc) {
		this.name = name;
		this.locator = locator;
		this.desc = desc;
	}

	public UIElement(final String locator) {
		this.locator = locator;
	}

	public UIElement(final String Androidlocator, final String IOSlocator) {
		if (config.get("mobile.device.type").equals(Config.ANDROID)) {
			this.locator = Androidlocator;
		} else if (config.get("mobile.device.type").equals(Config.IOS)) {
			this.locator = IOSlocator;
		} else {
			// System.out.println("******************************************************");
			// System.out.println("mobile.device.type : " +
			// config.get("mobile.device.type"));
			// System.out.println("Config.ANDROID : " + Config.ANDROID);
			// System.out.println("******************************************************");
			throw new UnsupportedOperationException();
		}

	}

	public String description() {
		return this.name + ": {" + this.locator + (this.index > 0 ? "[" + this.index + "]" : "") + "}";
	}

	@Override
	public String toString() {
		return this.locator;
	}
}
