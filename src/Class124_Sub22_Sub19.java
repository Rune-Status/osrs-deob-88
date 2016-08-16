public abstract class Class124_Sub22_Sub19 extends JagMap {
	public int anInt1605 = 1000;

	void method833(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		final Class124_Sub22_Sub19_Sub7 var10 = method834(1009220469);
		if (var10 != null) {
			anInt1605 = var10.anInt1605;
			var10.method833(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	protected Class124_Sub22_Sub19_Sub7 method834(final int var1) {
		return null;
	}

	static void method835(final Class23 var0) {
		if (var0.method152() != client.aBool1988) {
			client.aBool1988 = var0.method152();
			final boolean var1 = var0.method152();
			if (var1 != Class124_Sub22_Sub21.aBool1649) {
				Class71.method308();
				Class124_Sub22_Sub21.aBool1649 = var1;
			}
		}

		Def8.aString1452 = var0.aString254;
		client.anInt2079 = var0.anInt262;
		client.anInt1984 = var0.anInt255;
		client.anInt2020 = client.anInt2080 == 0 ? '\uaa4a' : var0.anInt262 + '\u9c40';
		Class124_Sub15.anInt1106 = client.anInt2080 == 0 ? 443 : var0.anInt262 + '\uc350';
		Class124_Sub22_Sub5.anInt1381 = client.anInt2020;
	}
}
