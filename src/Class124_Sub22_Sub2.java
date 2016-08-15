import java.awt.Component;

public class Class124_Sub22_Sub2 extends Class124_Sub22 {
	protected static int anInt1356;
	public static Class94 aClass94_1363;
	static Class124_Sub22_Sub16_Sub1[] aClass124_Sub22_Sub16_Sub1Array1364;
	public int anInt1362 = -1;
	int[] anIntArray1355;
	public boolean aBool1361 = false;
	short[] aShortArray1353;
	short[] aShortArray1357;
	short[] aShortArray1358;
	short[] aShortArray1359;
	public static Class113 aClass113_1354 = new Class113(64);
	int[] anIntArray1360 = new int[] { -1, -1, -1, -1, -1 };

	public boolean method647() {
		if (null == anIntArray1355)
			return true;
		else {
			boolean var2 = true;

			for (int var1 = 0; var1 < anIntArray1355.length; ++var1)
				if (!Class128.aClass94_887.method366(anIntArray1355[var1], 0))
					var2 = false;

			return var2;
		}
	}

	void method648(final Class124_Sub14 var1) {
		while (true) {
			final int var2 = var1.method558();
			if (var2 == 0)
				return;

			method649(var1, var2);
		}
	}

	void method649(final Class124_Sub14 var1, final int var2) {
		if (var2 == 1)
			anInt1362 = var1.method558();
		else {
			int var3;
			int var4;
			if (var2 == 2) {
				var4 = var1.method558();
				anIntArray1355 = new int[var4];

				for (var3 = 0; var3 < var4; ++var3)
					anIntArray1355[var3] = var1.method560();
			} else if (var2 == 3)
				aBool1361 = true;
			else if (var2 == 40) {
				var4 = var1.method558();
				aShortArray1353 = new short[var4];
				aShortArray1357 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1353[var3] = (short) var1.method560();
					aShortArray1357[var3] = (short) var1.method560();
				}
			} else if (var2 == 41) {
				var4 = var1.method558();
				aShortArray1358 = new short[var4];
				aShortArray1359 = new short[var4];

				for (var3 = 0; var3 < var4; ++var3) {
					aShortArray1358[var3] = (short) var1.method560();
					aShortArray1359[var3] = (short) var1.method560();
				}
			} else if ((var2 >= 60) && (var2 < 70))
				anIntArray1360[var2 - 60] = var1.method560();
		}

	}

	public Class124_Sub22_Sub19_Sub4 method650() {
		if (anIntArray1355 == null)
			return null;
		else {
			final Class124_Sub22_Sub19_Sub4[] var1 = new Class124_Sub22_Sub19_Sub4[anIntArray1355.length];

			for (int var2 = 0; var2 < anIntArray1355.length; ++var2)
				var1[var2] = Class124_Sub22_Sub19_Sub4.method943(Class128.aClass94_887, anIntArray1355[var2], 0);

			Class124_Sub22_Sub19_Sub4 var4;
			if (var1.length == 1)
				var4 = var1[0];
			else
				var4 = new Class124_Sub22_Sub19_Sub4(var1, var1.length);

			int var3;
			if (aShortArray1353 != null)
				for (var3 = 0; var3 < aShortArray1353.length; ++var3)
					var4.method951(aShortArray1353[var3], aShortArray1357[var3]);

			if (null != aShortArray1358)
				for (var3 = 0; var3 < aShortArray1358.length; ++var3)
					var4.method939(aShortArray1358[var3], aShortArray1359[var3]);

			return var4;
		}
	}

	public boolean method651() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2)
			if ((anIntArray1360[var2] != -1) && !Class128.aClass94_887.method366(anIntArray1360[var2], 0))
				var1 = false;

		return var1;
	}

	public Class124_Sub22_Sub19_Sub4 method652() {
		final Class124_Sub22_Sub19_Sub4[] var1 = new Class124_Sub22_Sub19_Sub4[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3)
			if (anIntArray1360[var3] != -1)
				var1[var2++] = Class124_Sub22_Sub19_Sub4.method943(Class128.aClass94_887, anIntArray1360[var3], 0);

		final Class124_Sub22_Sub19_Sub4 var5 = new Class124_Sub22_Sub19_Sub4(var1, var2);
		int var4;
		if (null != aShortArray1353)
			for (var4 = 0; var4 < aShortArray1353.length; ++var4)
				var5.method951(aShortArray1353[var4], aShortArray1357[var4]);

		if (null != aShortArray1358)
			for (var4 = 0; var4 < aShortArray1358.length; ++var4)
				var5.method939(aShortArray1358[var4], aShortArray1359[var4]);

		return var5;
	}

	public static boolean method653(final Class94 var0, final int var1, final int var2) {
		final byte[] var3 = var0.method377(var1, var2);
		if (null != var3) {
			Class124_Sub22_Sub3.method661(var3);
			return true;
		} else
			return false;
	}

	static void method654(final Component var0, final Class94 var1, final Class94 var2, final boolean var3,
			final int var4) {
		if (Class4.aBool55) {
			if (var4 == 4)
				Class4.anInt43 = 4;

		} else {
			Class4.anInt43 = var4;
			Class124_Sub22_Sub16.method777();
			final byte[] var5 = var1.method378("title.jpg", "");
			Class4.aClass124_Sub22_Sub16_Sub1_40 = new Class124_Sub22_Sub16_Sub1(var5, var0);
			Class4.aClass124_Sub22_Sub16_Sub1_27 = Class4.aClass124_Sub22_Sub16_Sub1_40.method899();
			Class4.aClass124_Sub22_Sub16_Sub2_28 = Class1.method17(var2, "logo", "");
			Class4.aClass124_Sub22_Sub16_Sub2_42 = Class1.method17(var2, "titlebox", "");
			Class4.aClass124_Sub22_Sub16_Sub2_24 = Class1.method17(var2, "titlebutton", "");
			Class4.aClass124_Sub22_Sub16_Sub2Array25 = Class124_Sub11.method537(var2, "runes", "");
			Class5.aClass124_Sub22_Sub16_Sub2Array59 = Class124_Sub11.method537(var2, "title_mute", "");
			Class89.aClass124_Sub22_Sub16_Sub2_706 = Class1.method17(var2, "options_radio_buttons,0", "");
			Class4.aClass124_Sub22_Sub16_Sub2_29 = Class1.method17(var2, "options_radio_buttons,2", "");
			Class4.anIntArray46 = new int[256];

			int var6;
			for (var6 = 0; var6 < 64; ++var6)
				Class4.anIntArray46[var6] = var6 * 262144;

			for (var6 = 0; var6 < 64; ++var6)
				Class4.anIntArray46[64 + var6] = 16711680 + (var6 * 1024);

			for (var6 = 0; var6 < 64; ++var6)
				Class4.anIntArray46[var6 + 128] = 16776960 + (4 * var6);

			for (var6 = 0; var6 < 64; ++var6)
				Class4.anIntArray46[192 + var6] = 16777215;

			Class124_Sub7.anIntArray1013 = new int[256];

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub7.anIntArray1013[var6] = var6 * 1024;

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub7.anIntArray1013[64 + var6] = (var6 * 4) + '\uff00';

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub7.anIntArray1013[var6 + 128] = '\uffff' + (var6 * 262144);

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub7.anIntArray1013[var6 + 192] = 16777215;

			Class124_Sub22_Sub9.anIntArray1453 = new int[256];

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub22_Sub9.anIntArray1453[var6] = 4 * var6;

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub22_Sub9.anIntArray1453[64 + var6] = 255 + (var6 * 262144);

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub22_Sub9.anIntArray1453[128 + var6] = (1024 * var6) + 16711935;

			for (var6 = 0; var6 < 64; ++var6)
				Class124_Sub22_Sub9.anIntArray1453[var6 + 192] = 16777215;

			Class42.anIntArray427 = new int[256];
			Class124_Sub22_Sub19_Sub1.anIntArray1661 = new int['\u8000'];
			Class43.anIntArray432 = new int['\u8000'];
			Class124_Sub22_Sub15.method761((Class124_Sub22_Sub16_Sub2) null);
			Class124_Sub10.anIntArray1032 = new int['\u8000'];
			Class4.anIntArray34 = new int['\u8000'];
			if (var3) {
				Class4.aString44 = "";
				Class4.aString45 = "";
			}

			Class84.anInt673 = 0;
			Class49.aString485 = "";
			Class4.aBool37 = true;
			Class4.aBool50 = false;
			if (!Class57.aClass22_538.aBool249) {
				final Class94_Sub1 var7 = Class5.aClass94_Sub1_58;
				final int var8 = var7.method376("scape main");
				final int var9 = var7.method383(var8, "");
				Class25.method159(2, var7, var8, var9, 255, false);
			} else
				Class76.method318(2);

			Class81.method328(false);
			Class4.aBool55 = true;
			Class4.anInt22 = (Class56_Sub2.anInt1083 - client.anInt2071) / 2;
			Class4.anInt30 = 202 + Class4.anInt22;
			Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
			Class4.aClass124_Sub22_Sub16_Sub1_27.method917(382 + Class4.anInt22, 0);
			Class4.aClass124_Sub22_Sub16_Sub2_28
					.method926((382 + Class4.anInt22) - (Class4.aClass124_Sub22_Sub16_Sub2_28.anInt1738 / 2), 18);
		}
	}

	static Class124_Sub22_Sub17 method655(final int var0) {
		Class124_Sub22_Sub17 var1 = (Class124_Sub22_Sub17) Class124_Sub22_Sub13.aClass113_1541.method434(var0);
		if (null != var1)
			return var1;
		else {
			var1 = Class89.method345(Class124_Sub22_Sub13.aClass94_1530, Class124_Sub22_Sub13.aClass94_1533, var0,
					false);
			if (null != var1)
				Class124_Sub22_Sub13.aClass113_1541.method435(var1, var0);

			return var1;
		}
	}

	static final void method656() {
		final int var0 = client.aClass124_Sub14_Sub1_2026.method839(8);
		int var2;
		if (var0 < client.anInt2090)
			for (var2 = var0; var2 < client.anInt2090; ++var2)
				client.anIntArray2109[++client.anInt2108 - 1] = client.anIntArray2128[var2];

		if (var0 > client.anInt2090)
			throw new RuntimeException("");
		else {
			client.anInt2090 = 0;

			for (var2 = 0; var2 < var0; ++var2) {
				final int var1 = client.anIntArray2128[var2];
				final Class124_Sub22_Sub19_Sub3_Sub2 var3 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var1];
				final int var7 = client.aClass124_Sub14_Sub1_2026.method839(1);
				if (var7 == 0) {
					client.anIntArray2128[++client.anInt2090 - 1] = var1;
					var3.anInt1716 = client.anInt2158;
				} else {
					final int var5 = client.aClass124_Sub14_Sub1_2026.method839(2);
					if (var5 == 0) {
						client.anIntArray2128[++client.anInt2090 - 1] = var1;
						var3.anInt1716 = client.anInt2158;
						client.anIntArray2104[++client.anInt2029 - 1] = var1;
					} else {
						int var4;
						int var6;
						if (var5 == 1) {
							client.anIntArray2128[++client.anInt2090 - 1] = var1;
							var3.anInt1716 = client.anInt2158;
							var4 = client.aClass124_Sub14_Sub1_2026.method839(3);
							var3.method892(var4, false);
							var6 = client.aClass124_Sub14_Sub1_2026.method839(1);
							if (var6 == 1)
								client.anIntArray2104[++client.anInt2029 - 1] = var1;
						} else if (var5 == 2) {
							client.anIntArray2128[++client.anInt2090 - 1] = var1;
							var3.anInt1716 = client.anInt2158;
							var4 = client.aClass124_Sub14_Sub1_2026.method839(3);
							var3.method892(var4, true);
							var6 = client.aClass124_Sub14_Sub1_2026.method839(3);
							var3.method892(var6, true);
							final int var8 = client.aClass124_Sub14_Sub1_2026.method839(1);
							if (var8 == 1)
								client.anIntArray2104[++client.anInt2029 - 1] = var1;
						} else if (var5 == 3)
							client.anIntArray2109[++client.anInt2108 - 1] = var1;
					}
				}
			}

		}
	}
}
