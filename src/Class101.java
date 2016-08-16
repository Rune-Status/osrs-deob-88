public class Class101 {
	public static String aString788;

	static final void method402(final Widget var0, final int var1, final int var2) {
		if (var0.anInt1156 == 1)
			Class3.method22(var0.aString1268, "", 24, 0, 0, var0.anInt1284);

		int var5;
		int var6;
		String var9;
		if ((var0.anInt1156 == 2) && !client.aBool2137) {
			var5 = Class124_Sub22_Sub19_Sub6.method963(var0);
			var6 = (var5 >> 11) & 63;
			if (var6 == 0)
				var9 = null;
			else if ((null != var0.aString1230) && (var0.aString1230.trim().length() != 0))
				var9 = var0.aString1230;
			else
				var9 = null;

			if (null != var9)
				Class3.method22(var9, Class124_Sub4_Sub3.method874('\uff00') + var0.aString1240, 25, 0, -1,
						var0.anInt1284);
		}

		if (var0.anInt1156 == 3)
			Class3.method22("Close", "", 26, 0, 0, var0.anInt1284);

		if (var0.anInt1156 == 4)
			Class3.method22(var0.aString1268, "", 28, 0, 0, var0.anInt1284);

		if (var0.anInt1156 == 5)
			Class3.method22(var0.aString1268, "", 29, 0, 0, var0.anInt1284);

		if ((var0.anInt1156 == 6) && (client.aClass124_Sub17_2042 == null))
			Class3.method22(var0.aString1268, "", 30, 0, -1, var0.anInt1284);

		int var4;
		int var7;
		if (var0.anInt1191 == 2) {
			var4 = 0;

			for (var6 = 0; var6 < var0.anInt1169; ++var6)
				for (var5 = 0; var5 < var0.anInt1168; ++var5) {
					var7 = (32 + var0.anInt1217) * var5;
					int var12 = var6 * (var0.anInt1180 + 32);
					if (var4 < 20) {
						var7 += var0.anIntArray1219[var4];
						var12 += var0.anIntArray1220[var4];
					}

					if ((var1 >= var7) && (var2 >= var12) && (var1 < (var7 + 32)) && (var2 < (32 + var12))) {
						client.anInt2075 = var4;
						Def9.aClass124_Sub17_1352 = var0;
						if (var0.anIntArray1269[var4] > 0) {
							final Def10 var14 = Def10
									.method724(var0.anIntArray1269[var4] - 1);
							if ((client.anInt2135 == 1)
									&& Class29.method171(Class124_Sub22_Sub19_Sub6.method963(var0))) {
								if ((var0.anInt1284 != Class38.anInt398) || (Class87.anInt692 != var4))
									Class3.method22("Use",
											client.aString2136 + " " + "->" + " "
													+ Class124_Sub4_Sub3.method874(16748608) + var14.aString1472,
											31, var14.anInt1464, var4, var0.anInt1284);
							} else if (client.aBool2137
									&& Class29.method171(Class124_Sub22_Sub19_Sub6.method963(var0))) {
								if ((Class9_Sub1.anInt922 & 16) == 16)
									Class3.method22(client.aString1983,
											client.aString2035 + " " + "->" + " "
													+ Class124_Sub4_Sub3.method874(16748608) + var14.aString1472,
											32, var14.anInt1464, var4, var0.anInt1284);
							} else {
								String[] var8 = var14.aStringArray1488;
								if (client.aBool2153)
									var8 = Class124_Sub5.method517(var8);

								int var3;
								byte var13;
								if (Class29.method171(Class124_Sub22_Sub19_Sub6.method963(var0)))
									for (var3 = 4; var3 >= 3; --var3)
										if ((null != var8) && (var8[var3] != null)) {
											if (var3 == 3)
												var13 = 36;
											else
												var13 = 37;

											Class3.method22(var8[var3],
													Class124_Sub4_Sub3.method874(16748608) + var14.aString1472, var13,
													var14.anInt1464, var4, var0.anInt1284);
										} else if (var3 == 4)
											Class3.method22("Drop",
													Class124_Sub4_Sub3.method874(16748608) + var14.aString1472, 37,
													var14.anInt1464, var4, var0.anInt1284);

								if (Canvas_Sub1.method845(Class124_Sub22_Sub19_Sub6.method963(var0)))
									Class3.method22("Use", Class124_Sub4_Sub3.method874(16748608) + var14.aString1472,
											38, var14.anInt1464, var4, var0.anInt1284);

								if (Class29.method171(Class124_Sub22_Sub19_Sub6.method963(var0)) && (var8 != null))
									for (var3 = 2; var3 >= 0; --var3)
										if (null != var8[var3]) {
											var13 = 0;
											if (var3 == 0)
												var13 = 33;

											if (var3 == 1)
												var13 = 34;

											if (var3 == 2)
												var13 = 35;

											Class3.method22(var8[var3],
													Class124_Sub4_Sub3.method874(16748608) + var14.aString1472, var13,
													var14.anInt1464, var4, var0.anInt1284);
										}

								var8 = var0.aStringArray1172;
								if (client.aBool2153)
									var8 = Class124_Sub5.method517(var8);

								if (null != var8)
									for (var3 = 4; var3 >= 0; --var3)
										if (var8[var3] != null) {
											var13 = 0;
											if (var3 == 0)
												var13 = 39;

											if (var3 == 1)
												var13 = 40;

											if (var3 == 2)
												var13 = 41;

											if (var3 == 3)
												var13 = 42;

											if (var3 == 4)
												var13 = 43;

											Class3.method22(var8[var3],
													Class124_Sub4_Sub3.method874(16748608) + var14.aString1472, var13,
													var14.anInt1464, var4, var0.anInt1284);
										}

								Class3.method22("Examine", Class124_Sub4_Sub3.method874(16748608) + var14.aString1472,
										1005, var14.anInt1464, var4, var0.anInt1284);
							}
						}
					}

					++var4;
				}
		}

		if (var0.aBool1152)
			if (client.aBool2137) {
				if (Class37.method198(Class124_Sub22_Sub19_Sub6.method963(var0)) && ((Class9_Sub1.anInt922 & 32) == 32))
					Class3.method22(client.aString1983, client.aString2035 + " " + "->" + " " + var0.aString1224, 58, 0,
							var0.anInt1154, var0.anInt1284);
			} else {
				for (var4 = 9; var4 >= 5; --var4) {
					var7 = Class124_Sub22_Sub19_Sub6.method963(var0);
					final boolean var18 = ((var7 >> (1 + var4)) & 1) != 0;
					String var10;
					if (!var18 && (var0.anObjectArray1198 == null))
						var10 = null;
					else if ((null != var0.aStringArray1225) && (var0.aStringArray1225.length > var4)
							&& (var0.aStringArray1225[var4] != null)
							&& (var0.aStringArray1225[var4].trim().length() != 0))
						var10 = var0.aStringArray1225[var4];
					else
						var10 = null;

					if (null != var10)
						Class3.method22(var10, var0.aString1224, 1007, var4 + 1, var0.anInt1154, var0.anInt1284);
				}

				var5 = Class124_Sub22_Sub19_Sub6.method963(var0);
				var6 = (var5 >> 11) & 63;
				if (var6 == 0)
					var9 = null;
				else if ((null != var0.aString1230) && (var0.aString1230.trim().length() != 0))
					var9 = var0.aString1230;
				else
					var9 = null;

				if (null != var9)
					Class3.method22(var9, var0.aString1224, 25, 0, var0.anInt1154, var0.anInt1284);

				for (var5 = 4; var5 >= 0; --var5) {
					final int var15 = Class124_Sub22_Sub19_Sub6.method963(var0);
					final boolean var19 = ((var15 >> (1 + var5)) & 1) != 0;
					String var17;
					if (!var19 && (var0.anObjectArray1198 == null))
						var17 = null;
					else if ((null != var0.aStringArray1225) && (var0.aStringArray1225.length > var5)
							&& (null != var0.aStringArray1225[var5])
							&& (var0.aStringArray1225[var5].trim().length() != 0))
						var17 = var0.aStringArray1225[var5];
					else
						var17 = null;

					if (null != var17)
						Class3.method22(var17, var0.aString1224, 57, var5 + 1, var0.anInt1154, var0.anInt1284);
				}

				if (Class104.method405(Class124_Sub22_Sub19_Sub6.method963(var0)))
					Class3.method22("Continue", "", 30, 0, var0.anInt1154, var0.anInt1284);
			}

	}
}
