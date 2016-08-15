public class Class124_Sub22_Sub21 extends Class124_Sub22 {
	public int anInt1648;
	public static boolean aBool1649;
	public byte aByte1650;
	public Class94_Sub1 aClass94_Sub1_1651;

	static final void method882(final int var0, final int var1, final int var2, final int var3, final int var4) {
		if ((var0 != Class124_Sub13.anInt1071) || (var1 != Class124_Sub22_Sub19_Sub6.anInt1824)
				|| ((client.anInt2006 != var2) && client.aBool1989)) {
			Class124_Sub13.anInt1071 = var0;
			Class124_Sub22_Sub19_Sub6.anInt1824 = var1;
			client.anInt2006 = var2;
			if (!client.aBool1989)
				client.anInt2006 = 0;

			Class124_Sub5.method516(25);
			Class124_Sub7.method523("Loading - please wait.", true);
			int var9 = Class9.anInt102;
			int var5 = Class95.anInt762;
			Class9.anInt102 = (var0 - 6) * 8;
			Class95.anInt762 = (var1 - 6) * 8;
			final int var10 = Class9.anInt102 - var9;
			final int var6 = Class95.anInt762 - var5;
			var9 = Class9.anInt102;
			var5 = Class95.anInt762;

			int var11;
			int var17;
			for (var17 = 0; var17 < '\u8000'; ++var17) {
				final Class124_Sub22_Sub19_Sub3_Sub1 var18 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var17];
				if (null != var18) {
					for (var11 = 0; var11 < 10; ++var11) {
						var18.anIntArray1722[var11] -= var10;
						var18.anIntArray1723[var11] -= var6;
					}

					var18.anInt1690 -= 128 * var10;
					var18.anInt1697 -= var6 * 128;
				}
			}

			for (var17 = 0; var17 < 2048; ++var17) {
				final Class124_Sub22_Sub19_Sub3_Sub2 var24 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var17];
				if (null != var24) {
					for (var11 = 0; var11 < 10; ++var11) {
						var24.anIntArray1722[var11] -= var10;
						var24.anIntArray1723[var11] -= var6;
					}

					var24.anInt1690 -= 128 * var10;
					var24.anInt1697 -= var6 * 128;
				}
			}

			Class134.anInt906 = var2;
			Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method893(var3, var4, false);
			byte var23 = 0;
			byte var12 = 104;
			byte var22 = 1;
			if (var10 < 0) {
				var23 = 103;
				var12 = -1;
				var22 = -1;
			}

			byte var14 = 0;
			byte var19 = 104;
			byte var20 = 1;
			if (var6 < 0) {
				var14 = 103;
				var19 = -1;
				var20 = -1;
			}

			for (int var15 = var23; var15 != var12; var15 += var22)
				for (int var13 = var14; var19 != var13; var13 += var20) {
					final int var21 = var10 + var15;
					final int var7 = var13 + var6;

					for (int var8 = 0; var8 < 4; ++var8)
						if ((var21 >= 0) && (var7 >= 0) && (var21 < 104) && (var7 < 104))
							client.aClass111ArrayArrayArray2073[var8][var15][var13] = client.aClass111ArrayArrayArray2073[var8][var21][var7];
						else
							client.aClass111ArrayArrayArray2073[var8][var15][var13] = null;
				}

			for (Class124_Sub11 var16 = (Class124_Sub11) client.aClass111_2262
					.method428(); null != var16; var16 = (Class124_Sub11) client.aClass111_2262.method430()) {
				var16.anInt1036 -= var10;
				var16.anInt1037 -= var6;
				if ((var16.anInt1036 < 0) || (var16.anInt1037 < 0) || (var16.anInt1036 >= 104)
						|| (var16.anInt1037 >= 104))
					var16.method450();
			}

			if (client.anInt2194 != 0) {
				client.anInt2194 -= var10;
				client.anInt2217 -= var6;
			}

			client.anInt2225 = 0;
			client.aBool2231 = false;
			client.anInt2211 = -1;
			client.aClass111_2118.method431();
			client.aClass111_2117.method431();
		}
	}

	static final void method883() {
		for (Class124_Sub22_Sub19_Sub1 var0 = (Class124_Sub22_Sub19_Sub1) client.aClass111_2118
				.method428(); null != var0; var0 = (Class124_Sub22_Sub19_Sub1) client.aClass111_2118.method430())
			if ((var0.anInt1654 == Class134.anInt906) && !var0.aBool1657) {
				if (client.anInt2158 >= var0.anInt1653) {
					var0.method884(client.anInt2111, (byte) -51);
					if (var0.aBool1657)
						var0.method450();
					else
						Class36.aClass21_380.method144(var0.anInt1654, var0.anInt1655, var0.anInt1663, var0.anInt1656,
								60, var0, 0, -1, false);
				}
			} else
				var0.method450();

	}
}
