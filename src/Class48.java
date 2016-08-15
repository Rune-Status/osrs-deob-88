public class Class48 {
	int[] anIntArray476;
	Class124_Sub22_Sub18 aClass124_Sub22_Sub18_477;
	static int anInt478;
	static int anInt479;
	static String aString480;
	String[] aStringArray481;
	int anInt475 = -1;

	static final void method233(final int var0, final int var1) {
		final Class111 var2 = client.aClass111ArrayArrayArray2073[Class134.anInt906][var0][var1];
		if (var2 == null)
			Class36.aClass21_380.method114(Class134.anInt906, var0, var1);
		else {
			long var6 = -99999999L;
			Class124_Sub22_Sub19_Sub2 var10 = null;

			Class124_Sub22_Sub19_Sub2 var5;
			for (var5 = (Class124_Sub22_Sub19_Sub2) var2
					.method428(); null != var5; var5 = (Class124_Sub22_Sub19_Sub2) var2.method430()) {
				final Class124_Sub22_Sub10 var3 = Class124_Sub22_Sub10.method724(var5.anInt1667);
				long var8 = var3.anInt1458;
				if (var3.anInt1480 == 1)
					var8 *= 1 + var5.anInt1669;

				if (var8 > var6) {
					var6 = var8;
					var10 = var5;
				}
			}

			if (var10 == null)
				Class36.aClass21_380.method114(Class134.anInt906, var0, var1);
			else {
				var2.method425(var10);
				Class124_Sub22_Sub19_Sub2 var12 = null;
				Class124_Sub22_Sub19_Sub2 var4 = null;

				for (var5 = (Class124_Sub22_Sub19_Sub2) var2
						.method428(); null != var5; var5 = (Class124_Sub22_Sub19_Sub2) var2.method430())
					if (var10.anInt1667 != var5.anInt1667) {
						if (var12 == null)
							var12 = var5;

						if ((var5.anInt1667 != var12.anInt1667) && (null == var4))
							var4 = var5;
					}

				final int var11 = 1610612736 + (var1 << 7) + var0;
				Class36.aClass21_380.method128(Class134.anInt906, var0, var1,
						Class63.method285(64 + (128 * var0), 64 + (var1 * 128), Class134.anInt906), var10, var11, var12,
						var4);
			}
		}
	}

	static final void method234(final Class124_Sub22_Sub19_Sub3_Sub2 var0, final int var1, final int var2,
			final int var3) {
		if (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246 != var0)
			if (client.anInt2124 < 400) {
				int var4;
				String var10;
				if (var0.anInt1951 == 0) {
					final String var6 = var0.aString1956;
					var4 = var0.anInt1946;
					final int var7 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1946;
					final int var8 = var7 - var4;
					String var9;
					if (var8 < -9)
						var9 = Class124_Sub4_Sub3.method874(16711680);
					else if (var8 < -6)
						var9 = Class124_Sub4_Sub3.method874(16723968);
					else if (var8 < -3)
						var9 = Class124_Sub4_Sub3.method874(16740352);
					else if (var8 < 0)
						var9 = Class124_Sub4_Sub3.method874(16756736);
					else if (var8 > 9)
						var9 = Class124_Sub4_Sub3.method874('\uff00');
					else if (var8 > 6)
						var9 = Class124_Sub4_Sub3.method874(4259584);
					else if (var8 > 3)
						var9 = Class124_Sub4_Sub3.method874(8453888);
					else if (var8 > 0)
						var9 = Class124_Sub4_Sub3.method874(12648192);
					else
						var9 = Class124_Sub4_Sub3.method874(16776960);

					var10 = var6 + var9 + " " + " (" + "level-" + var0.anInt1946 + ")";
				} else
					var10 = var0.aString1956 + " " + " (" + "skill-" + var0.anInt1951 + ")";

				int var5;
				if (client.anInt2135 == 1)
					Class3.method22("Use",
							client.aString2136 + " " + "->" + " " + Class124_Sub4_Sub3.method874(16777215) + var10, 14,
							var1, var2, var3);
				else if (client.aBool2137) {
					if ((Class9_Sub1.anInt922 & 8) == 8)
						Class3.method22(client.aString1983,
								client.aString2035 + " " + "->" + " " + Class124_Sub4_Sub3.method874(16777215) + var10,
								15, var1, var2, var3);
				} else
					for (var5 = 7; var5 >= 0; --var5)
						if (null != client.aStringArray2166[var5]) {
							short var11 = 0;
							if (client.aStringArray2166[var5].equalsIgnoreCase("Attack")) {
								if ((client.aClass34_2011 == Class34.aClass34_370)
										|| ((client.aClass34_2011 == Class34.aClass34_368)
												&& (var0.anInt1946 > Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1946)))
									var11 = 2000;

								if ((Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1959 != 0)
										&& (var0.anInt1959 != 0))
									if (var0.anInt1959 == Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1959)
										var11 = 2000;
									else
										var11 = 0;
							} else if (client.aBoolArray2112[var5])
								var11 = 2000;

							var4 = var11 + client.anIntArray2110[var5];
							Class3.method22(client.aStringArray2166[var5],
									Class124_Sub4_Sub3.method874(16777215) + var10, var4, var1, var2, var3);
						}

				for (var5 = 0; var5 < client.anInt2124; ++var5)
					if (client.anIntArray2127[var5] == 23) {
						client.aStringArray2130[var5] = Class124_Sub4_Sub3.method874(16777215) + var10;
						break;
					}

			}
	}
}
