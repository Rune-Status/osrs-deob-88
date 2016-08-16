import java.awt.Graphics;

public class Class124_Sub7 extends Node {
	int anInt1008;
	static Class79 aClass79_1010;
	static long aLong1011;
	int anInt1012;
	static int[] anIntArray1013;
	public static CacheArch aClass94_1014;
	boolean aBool1009 = false;

	static void method522() {
		Class7.anIntArray68 = null;
		Class7.anIntArray74 = null;
		Class7.anIntArray69 = null;
		Class7.anIntArray70 = null;
		Class7.anIntArray66 = null;
		Class124_Sub22_Sub5.aByteArrayArray1384 = null;
	}

	static final void method523(final String var0, final boolean var1) {
		final byte var2 = 4;
		final int var3 = 6 + var2;
		final int var4 = 6 + var2;
		final int var5 = Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714.method1019(var0, 250);
		final int var6 = Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714.method1034(var0, 250) * 13;
		Class124_Sub22_Sub16.method768(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
		Class124_Sub22_Sub16.method769(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
		Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714.method1027(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
		Class124_Sub22_Sub17.method830(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
		if (var1)
			try {
				final Graphics var7 = Class124_Sub5.aCanvas990.getGraphics();
				Class64.aClass9_558.method52(var7, 0, 0, (byte) 7);
			} catch (final Exception var8) {
				Class124_Sub5.aCanvas990.repaint();
			}
		else
			Class47.method230(var3, var4, var5, var6);

	}

	static final void method524() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < (client.anInt2124 - 1); ++var1)
				if ((client.anIntArray2127[var1] < 1000) && (client.anIntArray2127[1 + var1] > 1000)) {
					final String var3 = client.aStringArray2130[var1];
					client.aStringArray2130[var1] = client.aStringArray2130[var1 + 1];
					client.aStringArray2130[var1 + 1] = var3;
					final String var4 = client.aStringArray2129[var1];
					client.aStringArray2129[var1] = client.aStringArray2129[var1 + 1];
					client.aStringArray2129[var1 + 1] = var4;
					int var2 = client.anIntArray2127[var1];
					client.anIntArray2127[var1] = client.anIntArray2127[1 + var1];
					client.anIntArray2127[1 + var1] = var2;
					var2 = client.anIntArray2125[var1];
					client.anIntArray2125[var1] = client.anIntArray2125[var1 + 1];
					client.anIntArray2125[var1 + 1] = var2;
					var2 = client.anIntArray2063[var1];
					client.anIntArray2063[var1] = client.anIntArray2063[1 + var1];
					client.anIntArray2063[1 + var1] = var2;
					var2 = client.anIntArray2140[var1];
					client.anIntArray2140[var1] = client.anIntArray2140[1 + var1];
					client.anIntArray2140[var1 + 1] = var2;
					var0 = false;
				}
		}

	}

	static void method525(final int var0, final int var1, final int var2, final boolean var3, final int var4,
			final boolean var5) {
		if (var0 < var1) {
			final int var6 = (var1 + var0) / 2;
			int var7 = var0;
			final Class23 var8 = Class23.aClass23Array256[var6];
			Class23.aClass23Array256[var6] = Class23.aClass23Array256[var1];
			Class23.aClass23Array256[var1] = var8;

			for (int var11 = var0; var11 < var1; ++var11) {
				final Class23 var12 = Class23.aClass23Array256[var11];
				final int var9 = Class36.method195(var12, var8, var2, var3);
				int var10;
				if (var9 != 0) {
					if (var3)
						var10 = -var9;
					else
						var10 = var9;
				} else if (var4 == -1)
					var10 = 0;
				else {
					final int var13 = Class36.method195(var12, var8, var4, var5);
					if (var5)
						var10 = -var13;
					else
						var10 = var13;
				}

				if (var10 <= 0) {
					final Class23 var14 = Class23.aClass23Array256[var11];
					Class23.aClass23Array256[var11] = Class23.aClass23Array256[var7];
					Class23.aClass23Array256[var7++] = var14;
				}
			}

			Class23.aClass23Array256[var1] = Class23.aClass23Array256[var7];
			Class23.aClass23Array256[var7] = var8;
			method525(var0, var7 - 1, var2, var3, var4, var5);
			method525(1 + var7, var1, var2, var3, var4, var5);
		}

	}

	public static Def19 method526(final int var0) {
		Def19 var1 = (Def19) Def19.aClass113_1437.forId(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Def19.aClass94_1441.decode(19, var0);
			var1 = new Def19();
			if (var2 != null)
				var1.method694(new RSBuf(var2));

			Def19.aClass113_1437.map(var1, var0);
			return var1;
		}
	}

	static void method527() {
		for (Class124_Sub13 var0 = (Class124_Sub13) Class124_Sub13.aClass111_1069
				.method428(); var0 != null; var0 = (Class124_Sub13) Class124_Sub13.aClass111_1069.method430()) {
			if (null != var0.aClass124_Sub4_Sub1_1064) {
				Class56_Sub2.aClass124_Sub4_Sub2_1078.method822(var0.aClass124_Sub4_Sub1_1064);
				var0.aClass124_Sub4_Sub1_1064 = null;
			}

			if (null != var0.aClass124_Sub4_Sub1_1056) {
				Class56_Sub2.aClass124_Sub4_Sub2_1078.method822(var0.aClass124_Sub4_Sub1_1056);
				var0.aClass124_Sub4_Sub1_1056 = null;
			}
		}

		Class124_Sub13.aClass111_1069.method431();
	}

	static final void method528() {
		if (client.anInt2141 == 1)
			Class135.aClass124_Sub22_Sub16_Sub1Array912[client.anInt2089 / 100].method907(client.anInt2087 - 8,
					client.anInt2088 - 8);

		if (client.anInt2141 == 2)
			Class135.aClass124_Sub22_Sub16_Sub1Array912[(client.anInt2089 / 100) + 4].method907(client.anInt2087 - 8,
					client.anInt2088 - 8);

		client.anInt2099 = 0;
		final int var1 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7) + Class9.anInt102;
		final int var0 = Class95.anInt762 + (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7);
		if ((var1 >= 3053) && (var1 <= 3156) && (var0 >= 3056) && (var0 <= 3136))
			client.anInt2099 = 1;

		if ((var1 >= 3072) && (var1 <= 3118) && (var0 >= 9492) && (var0 <= 9535))
			client.anInt2099 = 1;

		if ((client.anInt2099 == 1) && (var1 >= 3139) && (var1 <= 3199) && (var0 >= 3008) && (var0 <= 3062))
			client.anInt2099 = 0;

	}
}
