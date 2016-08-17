public final class Class83 {
	static final void method337() {
		Class124_Sub7.method524();
		if (Class32.aClass124_Sub17_343 == null)
			if (client.currentWid == null) {
				int var0 = Class81.anInt650;
				int var1;
				int var4;
				int var6;
				int var9;
				if (client.aBool2240) {
					if ((var0 != 1) && (Class7.aBool71 || (var0 != 4))) {
						var1 = Class81.anInt652;
						var4 = Class81.anInt653;
						if ((var1 < (Class117.anInt831 - 10))
								|| (var1 > (Class117.anInt831 + Class124_Sub11.anInt1051 + 10))
								|| (var4 < (Class60.anInt541 - 10))
								|| (var4 > (Class22.anInt253 + Class60.anInt541 + 10))) {
							client.aBool2240 = false;
							Class124_Sub22_Sub17.method830(Class117.anInt831, Class60.anInt541,
									Class124_Sub11.anInt1051, Class22.anInt253);
						}
					}

					if ((var0 == 1) || (!Class7.aBool71 && (var0 == 4))) {
						var1 = Class117.anInt831;
						var4 = Class60.anInt541;
						var9 = Class124_Sub11.anInt1051;
						final int var7 = Class81.anInt658;
						final int var10 = Class81.anInt655;
						var6 = -1;

						for (int var8 = 0; var8 < client.anInt2124; ++var8) {
							final int var3 = ((client.anInt2124 - 1 - var8) * 15) + 31 + var4;
							if ((var7 > var1) && (var7 < (var1 + var9)) && (var10 > (var3 - 13))
									&& (var10 < (var3 + 3)))
								var6 = var8;
						}

						if (var6 != -1)
							Class46.method228(var6);

						client.aBool2240 = false;
						Class124_Sub22_Sub17.method830(Class117.anInt831, Class60.anInt541, Class124_Sub11.anInt1051,
								Class22.anInt253);
					}
				} else {
					if (((var0 == 1) || (!Class7.aBool71 && (var0 == 4))) && (client.anInt2124 > 0)) {
						var1 = client.anIntArray2127[client.anInt2124 - 1];
						if ((var1 == 39) || (var1 == 40) || (var1 == 41) || (var1 == 42) || (var1 == 43) || (var1 == 33)
								|| (var1 == 34) || (var1 == 35) || (var1 == 36) || (var1 == 37) || (var1 == 38)
								|| (var1 == 1005))
							label247: {
								var4 = client.anIntArray2125[client.anInt2124 - 1];
								var9 = client.anIntArray2063[client.anInt2124 - 1];
								final Widget var5 = Class10.getwidget(var9);
								if (!Class28.method167(Class124_Sub22_Sub19_Sub6.method963(var5))) {
									var6 = Class124_Sub22_Sub19_Sub6.method963(var5);
									final boolean var2 = ((var6 >> 29) & 1) != 0;
									if (!var2)
										break label247;
								}

								if ((null != Class32.aClass124_Sub17_343) && !client.aBool1985
										&& (client.anInt2122 != 1) && !Class53.method256(client.anInt2124 - 1)
										&& (client.anInt2124 > 0))
									Class124_Sub13.packet(client.anInt2094, client.anInt2095);

								client.aBool1985 = false;
								client.anInt2133 = 0;
								if (null != Class32.aClass124_Sub17_343)
									Def10.settrue(Class32.aClass124_Sub17_343);

								Class32.aClass124_Sub17_343 = Class10.getwidget(var9);
								client.anInt2093 = var4;
								client.anInt2094 = Class81.anInt658;
								client.anInt2095 = Class81.anInt655;
								if (client.anInt2124 > 0)
									Class20.method93(client.anInt2124 - 1);

								Def10.settrue(Class32.aClass124_Sub17_343);
								return;
							}
					}

					if (((var0 == 1) || (!Class7.aBool71 && (var0 == 4)))
							&& (((client.anInt2122 == 1) && (client.anInt2124 > 2))
									|| Class53.method256(client.anInt2124 - 1)))
						var0 = 2;

					if (((var0 == 1) || (!Class7.aBool71 && (var0 == 4))) && (client.anInt2124 > 0))
						Class46.method228(client.anInt2124 - 1);

					if ((var0 == 2) && (client.anInt2124 > 0))
						Def13.method737(Class81.anInt658, Class81.anInt655);
				}

			}
	}
}
