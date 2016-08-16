import java.awt.Canvas;

public final class Class124_Sub5 extends Node {
	Class28 aClass28_970;
	boolean aBool971;
	Class44 aClass44_972;
	Class36 aClass36_973;
	Class33 aClass33_974;
	Class38 aClass38_975;
	int anInt976;
	int anInt979;
	Class124_Sub5 aClass124_Sub5_980;
	Class30 aClass30_981;
	boolean aBool982;
	int anInt984;
	int anInt985;
	int anInt986;
	int anInt987;
	boolean aBool988;
	protected static int anInt989;
	public static Canvas aCanvas990;
	Class46[] aClass46Array977 = new Class46[5];
	int[] anIntArray978 = new int[5];
	int anInt968 = 0;
	int anInt966;
	int anInt969;
	int anInt967;
	int anInt983;

	public static void method512(final int var0, final int var1) {
		if (var0 != -1)
			if (Widget.widgetLoaded[var0]) {
				Widget.aClass94_1145.method374(var0);
				if (Class124_Sub22_Sub10.widgets[var0] != null) {
					boolean var3 = true;

					for (int var2 = 0; var2 < Class124_Sub22_Sub10.widgets[var0].length; ++var2)
						if (null != Class124_Sub22_Sub10.widgets[var0][var2])
							if (Class124_Sub22_Sub10.widgets[var0][var2].anInt1191 != 2)
								Class124_Sub22_Sub10.widgets[var0][var2] = null;
							else
								var3 = false;

					if (var3)
						Class124_Sub22_Sub10.widgets[var0] = null;

					Widget.widgetLoaded[var0] = false;
				}
			}
	}

	static int method513(final int var0, final byte var1) {
		final Class124_Sub22_Sub5 var2 = (Class124_Sub22_Sub5) Class47.aClass116_474.method438(var0);
		return var2 != null ? (Class47.aClass119_469.aClass124_Sub22_847 == var2.aClass124_Sub22_1303 ? -1
				: ((Class124_Sub22_Sub5) var2.aClass124_Sub22_1303).anInt1383) : -1;
	}

	static final int method514(final Class117 var0) {
		if (var0 == null)
			return 12;
		else
			switch (var0.anInt842) {
			case 2:
				return 20;
			default:
				return 12;
			}
	}

	Class124_Sub5(final int var1, final int var2, final int var3) {
		anInt966 = var1 * -2104385625;
		anInt969 = var1;
		anInt967 = var2;
		anInt983 = var3;
	}

	static final void method515(final boolean var0) {
		client.aBool2043 = var0;
		int var1;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var12;
		if (!client.aBool2043) {
			var2 = client.aClass124_Sub14_Sub1_2026.method544();
			var4 = client.aClass124_Sub14_Sub1_2026.method544();
			var5 = (client.anInt2027 - client.aClass124_Sub14_Sub1_2026.pos) / 16;
			Class124_Sub22_Sub10.anIntArrayArray1466 = new int[var5][4];

			for (var7 = 0; var7 < var5; ++var7)
				for (var8 = 0; var8 < 4; ++var8)
					Class124_Sub22_Sub10.anIntArrayArray1466[var7][var8] = client.aClass124_Sub14_Sub1_2026
							.readInt2(-562334951);

			var7 = client.aClass124_Sub14_Sub1_2026.readByteU();
			var8 = client.aClass124_Sub14_Sub1_2026.readShortU();
			var6 = client.aClass124_Sub14_Sub1_2026.method583();
			Class124_Sub22_Sub19_Sub6.anIntArray1822 = new int[var5];
			Class10.anIntArray104 = new int[var5];
			Def9.anIntArray1335 = new int[var5];
			Class124_Sub18.aByteArrayArray1294 = new byte[var5][];
			Class124_Sub22_Sub19_Sub3_Sub1.aByteArrayArray1939 = new byte[var5][];
			boolean var3 = false;
			if ((((var4 / 8) == 48) || ((var4 / 8) == 49)) && ((var6 / 8) == 48))
				var3 = true;

			if (((var4 / 8) == 48) && ((var6 / 8) == 148))
				var3 = true;

			var5 = 0;

			for (var12 = (var4 - 6) / 8; var12 <= ((var4 + 6) / 8); ++var12)
				for (var1 = (var6 - 6) / 8; var1 <= ((var6 + 6) / 8); ++var1) {
					var9 = (var12 << 8) + var1;
					if (!var3 || ((var1 != 49) && (var1 != 149) && (var1 != 147) && (var12 != 50)
							&& ((var12 != 49) || (var1 != 47)))) {
						Class124_Sub22_Sub19_Sub6.anIntArray1822[var5] = var9;
						Class10.anIntArray104[var5] = Class125.aClass94_Sub1_883.method376("m" + var12 + "_" + var1);
						Def9.anIntArray1335[var5] = Class125.aClass94_Sub1_883
								.method376("l" + var12 + "_" + var1);
						++var5;
					}
				}

			Class124_Sub22_Sub21.method882(var4, var6, var7, var2, var8);
		} else {
			client.aClass124_Sub14_Sub1_2026.method842();

			for (var2 = 0; var2 < 4; ++var2)
				for (var4 = 0; var4 < 13; ++var4)
					for (var5 = 0; var5 < 13; ++var5) {
						var7 = client.aClass124_Sub14_Sub1_2026.method839(1);
						if (var7 == 1)
							client.anIntArrayArrayArray1994[var2][var4][var5] = client.aClass124_Sub14_Sub1_2026
									.method839(26);
						else
							client.anIntArrayArrayArray1994[var2][var4][var5] = -1;
					}

			client.aClass124_Sub14_Sub1_2026.method840();
			var2 = (client.anInt2027 - client.aClass124_Sub14_Sub1_2026.pos) / 16;
			Class124_Sub22_Sub10.anIntArrayArray1466 = new int[var2][4];

			for (var4 = 0; var4 < var2; ++var4)
				for (var5 = 0; var5 < 4; ++var5)
					Class124_Sub22_Sub10.anIntArrayArray1466[var4][var5] = client.aClass124_Sub14_Sub1_2026.method590();

			var4 = client.aClass124_Sub14_Sub1_2026.method583();
			var5 = client.aClass124_Sub14_Sub1_2026.readShortU();
			var7 = client.aClass124_Sub14_Sub1_2026.readByteU();
			var8 = client.aClass124_Sub14_Sub1_2026.method583();
			var6 = client.aClass124_Sub14_Sub1_2026.readShortU();
			Class124_Sub22_Sub19_Sub6.anIntArray1822 = new int[var2];
			Class10.anIntArray104 = new int[var2];
			Def9.anIntArray1335 = new int[var2];
			Class124_Sub18.aByteArrayArray1294 = new byte[var2][];
			Class124_Sub22_Sub19_Sub3_Sub1.aByteArrayArray1939 = new byte[var2][];
			var2 = 0;

			for (int var16 = 0; var16 < 4; ++var16)
				for (var12 = 0; var12 < 13; ++var12)
					for (var1 = 0; var1 < 13; ++var1) {
						var9 = client.anIntArrayArrayArray1994[var16][var12][var1];
						if (var9 != -1) {
							final int var14 = (var9 >> 14) & 1023;
							final int var15 = (var9 >> 3) & 2047;
							int var13 = ((var14 / 8) << 8) + (var15 / 8);

							int var10;
							for (var10 = 0; var10 < var2; ++var10)
								if (Class124_Sub22_Sub19_Sub6.anIntArray1822[var10] == var13) {
									var13 = -1;
									break;
								}

							if (var13 != -1) {
								Class124_Sub22_Sub19_Sub6.anIntArray1822[var2] = var13;
								var10 = (var13 >> 8) & 255;
								final int var11 = var13 & 255;
								Class10.anIntArray104[var2] = Class125.aClass94_Sub1_883
										.method376("m" + var10 + "_" + var11);
								Def9.anIntArray1335[var2] = Class125.aClass94_Sub1_883
										.method376("l" + var10 + "_" + var11);
								++var2;
							}
						}
					}

			Class124_Sub22_Sub21.method882(var4, var6, var7, var8, var5);
		}

	}

	static void method516(final int var0) {
		if (client.anInt1992 != var0) {
			if (client.anInt1992 == 0) {
				Class46.anImage456 = null;
				Class41.aFont406 = null;
				Class4.aFontMetrics53 = null;
			}

			if ((var0 == 20) || (var0 == 40) || (var0 == 45)) {
				client.anInt2016 = 0;
				client.anInt1999 = 0;
				client.anInt2018 = 0;
			}

			if ((var0 != 20) && (var0 != 40) && (Class124_Sub22_Sub19_Sub1.aClass78_1662 != null)) {
				Class124_Sub22_Sub19_Sub1.aClass78_1662.method324();
				Class124_Sub22_Sub19_Sub1.aClass78_1662 = null;
			}

			if (client.anInt1992 == 25) {
				client.anInt2113 = 0;
				client.anInt2037 = 0;
				client.anInt2038 = 1;
				client.anInt2039 = 0;
				client.anInt2040 = 1;
			}

			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20)
					Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
							Class124_Sub11.aClass94_Sub1_1047, true, client.anInt1992 == 11 ? 4 : 0);
				else if (var0 == 11)
					Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
							Class124_Sub11.aClass94_Sub1_1047, false, 4);
				else if (Class4.aBool55) {
					Class4.aClass124_Sub22_Sub16_Sub2_42 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_24 = null;
					Class4.aClass124_Sub22_Sub16_Sub2Array25 = null;
					Class4.aClass124_Sub22_Sub16_Sub1_40 = null;
					Class4.aClass124_Sub22_Sub16_Sub1_27 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_28 = null;
					Class5.aClass124_Sub22_Sub16_Sub2Array59 = null;
					Class89.aClass124_Sub22_Sub16_Sub2_706 = null;
					Class4.aClass124_Sub22_Sub16_Sub2_29 = null;
					Class45.aClass124_Sub22_Sub16_Sub1Array448 = null;
					Class4.aClass124_Sub22_Sub16_Sub2Array51 = null;
					Class78.aClass124_Sub22_Sub16_Sub2Array635 = null;
					Class10.aClass124_Sub22_Sub16_Sub2Array109 = null;
					Class94.aClass124_Sub22_Sub16_Sub2_759 = null;
					Class4.anIntArray46 = null;
					Class124_Sub7.anIntArray1013 = null;
					Def5.anIntArray1453 = null;
					Class42.anIntArray427 = null;
					Class124_Sub22_Sub19_Sub1.anIntArray1661 = null;
					Class43.anIntArray432 = null;
					Class124_Sub10.anIntArray1032 = null;
					Class4.anIntArray34 = null;
					Class76.method318(2);
					Class81.method328(true);
					Class4.aBool55 = false;
				}
			} else
				Def3.method654(aCanvas990, Class124_Sub22_Sub20.aClass94_Sub1_1647,
						Class124_Sub11.aClass94_Sub1_1047, true, 0);

			client.anInt1992 = var0;
		}
	}

	static final String[] method517(final String[] var0) {
		final String[] var1 = new String[5];

		for (int var2 = 0; var2 < 5; ++var2) {
			var1[var2] = var2 + ": ";
			if ((null != var0) && (null != var0[var2]))
				var1[var2] = var1[var2] + var0[var2];
		}

		return var1;
	}
}
