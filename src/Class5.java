public class Class5 {
	static Class94_Sub1 aClass94_Sub1_58;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array59;
	Class124_Sub22_Sub5[] aClass124_Sub22_Sub5Array57 = new Class124_Sub22_Sub5[100];
	int anInt56;

	Class124_Sub22_Sub5 method25(final int var1) {
		return (var1 >= 0) && (var1 < anInt56) ? aClass124_Sub22_Sub5Array57[var1] : null;
	}

	int method26() {
		return anInt56;
	}

	Class124_Sub22_Sub5 method27(final int var1, final String var2, final String var3, final String var4) {
		Class124_Sub22_Sub5 var5 = aClass124_Sub22_Sub5Array57[99];

		for (int var6 = anInt56; var6 > 0; --var6)
			if (var6 != 100)
				aClass124_Sub22_Sub5Array57[var6] = aClass124_Sub22_Sub5Array57[var6 - 1];

		if (var5 == null)
			var5 = new Class124_Sub22_Sub5(var1, var2, var4, var3);
		else {
			var5.method450();
			var5.method637();
			var5.method674(var1, var2, var4, var3);
		}

		aClass124_Sub22_Sub5Array57[0] = var5;
		if (anInt56 < 100)
			++anInt56;

		return var5;
	}

	static String method28(String var0, final boolean var1) {
		final String var3 = var1 ? "https://" : "http://";
		if (client.anInt2080 == 1)
			var0 = var0 + "-wtrc";
		else if (client.anInt2080 == 2)
			var0 = var0 + "-wtqa";
		else if (client.anInt2080 == 3)
			var0 = var0 + "-wtwip";
		else if (client.anInt2080 == 5)
			var0 = var0 + "-wti";
		else if (client.anInt2080 == 4)
			var0 = "local";

		String var2 = "";
		if (null != client.aString1991)
			var2 = "/p=" + client.aString1991;

		final String var4 = "runescape.com";
		return var3 + var0 + "." + var4 + "/l=" + client.anInt2058 + "/a=" + Class61.anInt546 + var2 + "/";
	}
}
