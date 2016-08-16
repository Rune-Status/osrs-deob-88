public class Class122 {
	static Class122 aClass122_868 = new Class122("10", "10");
	static Class122 aClass122_856 = new Class122("11", "11");
	static Class122 aClass122_858 = new Class122("5", "5");
	static Class122 aClass122_855 = new Class122("3", "3");
	static Class122 aClass122_859 = new Class122("4", "4");
	static Class122 aClass122_860 = new Class122("7", "7");
	static Class122 aClass122_861 = new Class122("8", "8");
	static Class122 aClass122_862 = new Class122("14", "14");
	static Class122 aClass122_863 = new Class122("2", "2");
	static Class122 aClass122_864 = new Class122("13", "13");
	static Class122 aClass122_865 = new Class122("9", "9");
	static Class122 aClass122_866 = new Class122("6", "6");
	public static Class122 aClass122_870 = new Class122("12", "12");
	public static Class122 aClass122_867 = new Class122("1", "1");
	static Class122 aClass122_869 = new Class122("15", "15");
	public String aString857;

	static final int method448(final Widget var0, final int var1) {
		if ((var0.anIntArrayArray1278 != null) && (var1 < var0.anIntArrayArray1278.length))
			try {
				final int[] var2 = var0.anIntArrayArray1278[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					final int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0)
						return var3;

					if (var6 == 1)
						var7 = client.anIntArray2126[var2[var4++]];

					if (var6 == 2)
						var7 = client.anIntArray2030[var2[var4++]];

					if (var6 == 3)
						var7 = client.anIntArray2121[var2[var4++]];

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class10.method55(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class124_Sub22_Sub10.method724(var11).aBool1478 || client.aBool1988))
							for (var12 = 0; var12 < var10.anIntArray1269.length; ++var12)
								if ((var11 + 1) == var10.anIntArray1269[var12])
									var7 += var10.anIntArray1270[var12];
					}

					if (var6 == 5)
						var7 = Class91.anIntArray711[var2[var4++]];

					if (var6 == 6)
						var7 = Class89.anIntArray705[client.anIntArray2030[var2[var4++]] - 1];

					if (var6 == 7)
						var7 = (Class91.anIntArray711[var2[var4++]] * 100) / '\ub71b';

					if (var6 == 8)
						var7 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1946;

					if (var6 == 9)
						for (var9 = 0; var9 < 25; ++var9)
							if (Class89.aBoolArray707[var9])
								var7 += client.anIntArray2030[var9];

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = Class10.method55(var9);
						var11 = var2[var4++];
						if ((var11 != -1) && (!Class124_Sub22_Sub10.method724(var11).aBool1478 || client.aBool1988))
							for (var12 = 0; var12 < var10.anIntArray1269.length; ++var12)
								if (var10.anIntArray1269[var12] == (1 + var11)) {
									var7 = 999999999;
									break;
								}
					}

					if (var6 == 11)
						var7 = client.anInt2147;

					if (var6 == 12)
						var7 = client.anInt2148;

					if (var6 == 13) {
						var9 = Class91.anIntArray711[var2[var4++]];
						final int var13 = var2[var4++];
						var7 = (var9 & (1 << var13)) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Class74.method315(var9, (byte) 0);
					}

					if (var6 == 15)
						var8 = 1;

					if (var6 == 16)
						var8 = 2;

					if (var6 == 17)
						var8 = 3;

					if (var6 == 18)
						var7 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7) + Class9.anInt102;

					if (var6 == 19)
						var7 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7) + Class95.anInt762;

					if (var6 == 20)
						var7 = var2[var4++];

					if (var8 == 0) {
						if (var5 == 0)
							var3 += var7;

						if (var5 == 1)
							var3 -= var7;

						if ((var5 == 2) && (var7 != 0))
							var3 /= var7;

						if (var5 == 3)
							var3 *= var7;

						var5 = 0;
					} else
						var5 = var8;
				}
			} catch (final Exception var14) {
				return -1;
			}
		else
			return -2;
	}

	static final void method449(final int var0, final int var1, final int var2, final boolean var3) {
		if (Class89.loadwidget(var0))
			Class78.method325(Class124_Sub22_Sub10.widgets[var0], -1, var1, var2, var3);
	}

	Class122(final String var1, final String var2) {
		aString857 = var2;
	}
}
