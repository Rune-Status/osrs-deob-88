public class Class124_Sub6 extends Node {
	static int anInt992;
	int anInt993;
	Widget aClass124_Sub17_994;
	Object[] anObjectArray995;
	boolean aBool996;
	int anInt997;
	int anInt998;
	int anInt999;
	Widget aClass124_Sub17_1000;
	int anInt1001;
	String aString1002;
	static int anInt1003;
	int anInt1004;
	static Widget aClass124_Sub17_1005;
	static Class41 aClass41_1006;
	public static RSBuf aClass124_Sub14_1007;

	static void method518(final int var0, final byte[] var1, final Class69 var2) {
		final Class124_Sub19 var3 = new Class124_Sub19();
		var3.anInt1295 = 0;
		var3.aLong874 = var0;
		var3.aByteArray1298 = var1;
		var3.aClass69_1296 = var2;
		final Class111 var4 = Class99.aClass111_776;
		synchronized (var4) {
			Class99.aClass111_776.method424(var3);
		}

		final Object var9 = Class99.anObject774;
		synchronized (var9) {
			if (Class99.anInt773 == 0)
				Class27.aClass82_303.method334(new Class99(), 5);

			Class99.anInt773 = 600;
		}
	}

	public static int method519(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0)
				var2 *= var0;

			var0 *= var0;
		}

		if (var1 == 1)
			return var0 * var2;
		else
			return var2;
	}

	static void method520() {
		Class27.aByteArrayArrayArray293 = null;
		Class57.aByteArrayArrayArray537 = null;
		Class27.aByteArrayArrayArray288 = null;
		Class3.aByteArrayArrayArray17 = null;
		Class27.anIntArrayArrayArray304 = null;
		Class27.aByteArrayArrayArray289 = null;
		Class98.anIntArrayArray772 = null;
		Class27.anIntArray287 = null;
		Class64.anIntArray559 = null;
		Def14.anIntArray1512 = null;
		Class27.anIntArray291 = null;
		Class27.anIntArray292 = null;
	}

	static final void method521() {
		client.aClass124_Sub14_Sub1_2026.method842();
		final int var0 = client.aClass124_Sub14_Sub1_2026.method839(1);
		if (var0 != 0) {
			final int var3 = client.aClass124_Sub14_Sub1_2026.method839(2);
			if (var3 == 0)
				client.anIntArray2104[++client.anInt2029 - 1] = 2047;
			else {
				int var1;
				int var4;
				if (var3 == 1) {
					var4 = client.aClass124_Sub14_Sub1_2026.method839(3);
					Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method892(var4, false);
					var1 = client.aClass124_Sub14_Sub1_2026.method839(1);
					if (var1 == 1)
						client.anIntArray2104[++client.anInt2029 - 1] = 2047;

				} else {
					int var2;
					if (var3 == 2) {
						var4 = client.aClass124_Sub14_Sub1_2026.method839(3);
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method892(var4, true);
						var1 = client.aClass124_Sub14_Sub1_2026.method839(3);
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method892(var1, true);
						var2 = client.aClass124_Sub14_Sub1_2026.method839(1);
						if (var2 == 1)
							client.anIntArray2104[++client.anInt2029 - 1] = 2047;

					} else if (var3 == 3) {
						Class134.anInt906 = client.aClass124_Sub14_Sub1_2026.method839(2);
						var4 = client.aClass124_Sub14_Sub1_2026.method839(1);
						if (var4 == 1)
							client.anIntArray2104[++client.anInt2029 - 1] = 2047;

						var1 = client.aClass124_Sub14_Sub1_2026.method839(1);
						var2 = client.aClass124_Sub14_Sub1_2026.method839(7);
						final int var5 = client.aClass124_Sub14_Sub1_2026.method839(7);
						Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method893(var5, var2, var1 == 1);
					}
				}
			}
		}
	}
}
