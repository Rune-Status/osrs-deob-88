public final class Class30 {
	int anInt320;
	int anInt321;
	int anInt322;
	int anInt323;
	int anInt324;
	public Class124_Sub22_Sub19 aClass124_Sub22_Sub19_325;
	public Class124_Sub22_Sub19 aClass124_Sub22_Sub19_328;
	public int anInt326 = 0;
	int anInt327 = 0;

	static final int method172(final int var0, final int var1) {
		int var2 = (Class42.method216(var0 + '\ub135', 91923 + var1, 4) - 128)
				+ ((Class42.method216(10294 + var0, '\u93bd' + var1, 2) - 128) >> 1)
				+ ((Class42.method216(var0, var1, 1) - 128) >> 2);
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10)
			var2 = 10;
		else if (var2 > 60)
			var2 = 60;

		return var2;
	}

	public static int method173() {
		return Class84.anInt685;
	}

	static final void method174() {
		if (null != Class73.out) {
			Class73.out.method324();
			Class73.out = null;
		}

		Def9.method639();
		Class36.aClass21_380.method98();

		for (int var0 = 0; var0 < 4; ++var0)
			client.aClass130Array2192[var0].method463();

		System.gc();
		Class76.method318(2);
		client.anInt2220 = -1;
		client.aBool2221 = false;
		Class124_Sub7.method527();
		client.method516(10);
	}

	public static boolean method175() {
		final Class124_Sub24 var0 = (Class124_Sub24) Class114.aClass110_824.method421();
		return null != var0;
	}
}
