public class Class121_Sub1 extends Class121 {
	static String[] aStringArray913;
	int anInt916 = (int) (Class74.method316(790922308) / 1000L);
	String aString914;
	short aShort915;

	public static String method486(final int var0) {
		return ((var0 >> 24) & 255) + "." + ((var0 >> 16) & 255) + "." + ((var0 >> 8) & 255) + "." + (var0 & 255);
	}

	static final void method487(Def9 var0, final int var1, final int var2, final int var3) {
		if (client.anInt2124 < 400) {
			if (null != var0.anIntArray1342)
				var0 = var0.method644();

			if (var0 != null)
				if (var0.aBool1346)
					if (!var0.aBool1348 || (client.anInt2150 == var1)) {
						String var8 = var0.aString1319;
						int var9;
						if (var0.anInt1350 != 0) {
							final int var5 = var0.anInt1350;
							var9 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1946;
							final int var4 = var9 - var5;
							String var10;
							if (var4 < -9)
								var10 = Class124_Sub4_Sub3.method874(16711680);
							else if (var4 < -6)
								var10 = Class124_Sub4_Sub3.method874(16723968);
							else if (var4 < -3)
								var10 = Class124_Sub4_Sub3.method874(16740352);
							else if (var4 < 0)
								var10 = Class124_Sub4_Sub3.method874(16756736);
							else if (var4 > 9)
								var10 = Class124_Sub4_Sub3.method874('\uff00');
							else if (var4 > 6)
								var10 = Class124_Sub4_Sub3.method874(4259584);
							else if (var4 > 3)
								var10 = Class124_Sub4_Sub3.method874(8453888);
							else if (var4 > 0)
								var10 = Class124_Sub4_Sub3.method874(12648192);
							else
								var10 = Class124_Sub4_Sub3.method874(16776960);

							var8 = var8 + var10 + " " + " (" + "level-" + var0.anInt1350 + ")";
						}

						if (client.anInt2135 == 1)
							Class3.method22("Use", client.aString2136 + " " + "->" + " "
									+ Class124_Sub4_Sub3.method874(16776960) + var8, 7, var1, var2, var3);
						else if (client.aBool2137) {
							if ((Class9_Sub1.anInt922 & 2) == 2)
								Class3.method22(client.aString1983, client.aString2035 + " " + "->" + " "
										+ Class124_Sub4_Sub3.method874(16776960) + var8, 8, var1, var2, var3);
						} else {
							String[] var6 = var0.aStringArray1344;
							if (client.aBool2153)
								var6 = Class124_Sub5.method517(var6);

							int var7;
							if (var6 != null)
								for (var7 = 4; var7 >= 0; --var7)
									if ((null != var6[var7]) && !var6[var7].equalsIgnoreCase("Attack")) {
										byte var11 = 0;
										if (var7 == 0)
											var11 = 9;

										if (var7 == 1)
											var11 = 10;

										if (var7 == 2)
											var11 = 11;

										if (var7 == 3)
											var11 = 12;

										if (var7 == 4)
											var11 = 13;

										Class3.method22(var6[var7], Class124_Sub4_Sub3.method874(16776960) + var8,
												var11, var1, var2, var3);
									}

							if (null != var6)
								for (var7 = 4; var7 >= 0; --var7)
									if ((null != var6[var7]) && var6[var7].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if ((Class34.aClass34_370 == client.aClass34_2011)
												|| ((Class34.aClass34_368 == client.aClass34_2011)
														&& (var0.anInt1350 > Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1946)))
											var12 = 2000;

										var9 = 0;
										if (var7 == 0)
											var9 = var12 + 9;

										if (var7 == 1)
											var9 = 10 + var12;

										if (var7 == 2)
											var9 = var12 + 11;

										if (var7 == 3)
											var9 = 12 + var12;

										if (var7 == 4)
											var9 = 13 + var12;

										Class3.method22(var6[var7], Class124_Sub4_Sub3.method874(16776960) + var8, var9,
												var1, var2, var3);
									}

							Class3.method22("Examine", Class124_Sub4_Sub3.method874(16776960) + var8, 1003, var1, var2,
									var3);
						}

					}
		}
	}

	public static int method488(final String var0) {
		return var0.length() + 2;
	}

	Class121_Sub1(final String var1, final int var2) {
		aString914 = var1;
		aShort915 = (short) var2;
	}
}
