public class Class3 {
	int anInt16;
	static byte[][][] aByteArrayArrayArray17;
	int anInt18;
	String aString19;
	int anInt20;
	int anInt21;

	static void method20(final int var0) {
		if (var0 != -1)
			if (Class89.method346(var0)) {
				final Class124_Sub17[] var3 = Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0];

				for (final Class124_Sub17 var2 : var3) {
					if (null != var2.anObjectArray1232) {
						final Class124_Sub6 var1 = new Class124_Sub6();
						var1.aClass124_Sub17_994 = var2;
						var1.anObjectArray995 = var2.anObjectArray1232;
						Class124_Sub22_Sub5.method676(var1, 2000000);
					}
				}

			}
	}

	public static void method21(final Class94 var0) {
		Class124_Sub22_Sub8.aClass94_1444 = var0;
	}

	static final void method22(final String var0, final String var1, final int var2, final int var3, final int var4,
			final int var5) {
		if (!client.aBool2240)
			if (client.anInt2124 < 500) {
				client.aStringArray2129[client.anInt2124] = var0;
				client.aStringArray2130[client.anInt2124] = var1;
				client.anIntArray2127[client.anInt2124] = var2;
				client.anIntArray2140[client.anInt2124] = var3;
				client.anIntArray2125[client.anInt2124] = var4;
				client.anIntArray2063[client.anInt2124] = var5;
				++client.anInt2124;
			}
	}

	static final void method23(final int var0, final int var1) {
		if (Class89.method346(var0))
			Class35.method189(Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var0], var1);
	}
}
