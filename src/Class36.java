public final class Class36 {
	int anInt376;
	public Class124_Sub22_Sub19 aClass124_Sub22_Sub19_377;
	int anInt378;
	static Class21 aClass21_380;
	int anInt381;
	int anInt382;
	public Class124_Sub22_Sub19 aClass124_Sub22_Sub19_383;
	int anInt384;
	int anInt386;
	int anInt387;
	public int anInt385 = 0;
	int anInt379 = 0;

	static int method195(final Class23 var0, final Class23 var1, final int var2, final boolean var3) {
		if (var2 == 1) {
			int var5 = var0.anInt261;
			int var4 = var1.anInt261;
			if (!var3) {
				if (var5 == -1)
					var5 = 2001;

				if (var4 == -1)
					var4 = 2001;
			}

			return var5 - var4;
		} else
			return var2 == 2 ? var0.anInt264 - var1.anInt264
					: (var2 == 3
							? (var0.aString263.equals("-") ? (var1.aString263.equals("-") ? 0 : (var3 ? -1 : 1))
									: (var1.aString263.equals("-") ? (var3 ? 1 : -1)
											: var0.aString263.compareTo(var1.aString263)))
							: (var2 == 4 ? (var0.method155() ? (var1.method155() ? 0 : 1) : (var1.method155() ? -1 : 0))
									: (var2 == 5
											? (var0.method153() ? (var1.method153() ? 0 : 1)
													: (var1.method153() ? -1 : 0))
											: (var2 == 6
													? (var0.method154() ? (var1.method154() ? 0 : 1)
															: (var1.method154() ? -1 : 0))
													: (var2 == 7
															? (var0.method152() ? (var1.method152() ? 0 : 1)
																	: (var1.method152() ? -1 : 0))
															: var0.anInt262 - var1.anInt262)))));
	}

	static final void method196() {
		final int var0 = Class117.anInt831;
		final int var10 = Class60.anInt541;
		final int var3 = Class124_Sub11.anInt1051;
		final int var4 = Class22.anInt253;
		final int var5 = 6116423;
		Class124_Sub22_Sub16.method768(var0, var10, var3, var4, var5);
		Class124_Sub22_Sub16.method768(var0 + 1, 1 + var10, var3 - 2, 16, 0);
		Class124_Sub22_Sub16.method769(var0 + 1, 18 + var10, var3 - 2, var4 - 19, 0);
		Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407.method1020("Choose Option", var0 + 3, 14 + var10, var5, -1);
		final int var11 = Class81.anInt652;
		final int var6 = Class81.anInt653;

		for (int var1 = 0; var1 < client.anInt2124; ++var1) {
			final int var8 = (15 * (client.anInt2124 - 1 - var1)) + var10 + 31;
			int var9 = 16777215;
			if ((var11 > var0) && (var11 < (var3 + var0)) && (var6 > (var8 - 13)) && (var6 < (3 + var8)))
				var9 = 16776960;

			final Somet1 var7 = Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407;
			String var2;
			if (client.aStringArray2130[var1].length() > 0)
				var2 = client.aStringArray2129[var1] + " " + client.aStringArray2130[var1];
			else
				var2 = client.aStringArray2129[var1];

			var7.method1020(var2, 3 + var0, var8, var9, 0);
		}

		Class47.method230(Class117.anInt831, Class60.anInt541, Class124_Sub11.anInt1051, Class22.anInt253);
	}
}
