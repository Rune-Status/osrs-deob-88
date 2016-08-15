public class Class72 implements Interface3 {
	static Class124_Sub17 aClass124_Sub17_598;
	public static Class72 aClass72_597 = new Class72(2, 0);
	public static Class72 aClass72_594 = new Class72(1, 1);
	public static Class72 aClass72_593 = new Class72(3, 2);
	public static Class72 aClass72_599 = new Class72(0, 3);
	public int anInt596;
	int anInt595;

	public static String method309(final CharSequence[] var0, final int var1, final int var2) {
		if (var2 == 0)
			return "";
		else if (var2 == 1) {
			final CharSequence var5 = var0[var1];
			return null == var5 ? "null" : var5.toString();
		} else {
			final int var7 = var1 + var2;
			int var3 = 0;

			for (int var6 = var1; var6 < var7; ++var6) {
				final CharSequence var10 = var0[var6];
				if (null == var10)
					var3 += 4;
				else
					var3 += var10.length();
			}

			final StringBuilder var4 = new StringBuilder(var3);

			for (int var9 = var1; var9 < var7; ++var9) {
				final CharSequence var8 = var0[var9];
				if (var8 == null)
					var4.append("null");
				else
					var4.append(var8);
			}

			return var4.toString();
		}
	}

	@Override
	public int method11(final int var1) {
		return anInt595;
	}

	Class72(final int var1, final int var2) {
		anInt596 = var1;
		anInt595 = var2;
	}

	static Class124_Sub22_Sub16_Sub1[] method310(final Class94 var0, final int var1, final int var2) {
		if (!Class124_Sub22_Sub2.method653(var0, var1, var2))
			return null;
		else {
			final Class124_Sub22_Sub16_Sub1[] var5 = new Class124_Sub22_Sub16_Sub1[Class7.anInt73];

			for (int var6 = 0; var6 < Class7.anInt73; ++var6) {
				final Class124_Sub22_Sub16_Sub1 var3 = var5[var6] = new Class124_Sub22_Sub16_Sub1();
				var3.anInt1733 = Class7.anInt67;
				var3.anInt1734 = Class49.anInt486;
				var3.anInt1731 = Class7.anIntArray68[var6];
				var3.anInt1732 = Class7.anIntArray74[var6];
				var3.anInt1729 = Class7.anIntArray69[var6];
				var3.anInt1730 = Class7.anIntArray70[var6];
				final int var4 = var3.anInt1730 * var3.anInt1729;
				final byte[] var7 = Class124_Sub22_Sub5.aByteArrayArray1384[var6];
				var3.anIntArray1735 = new int[var4];

				for (int var8 = 0; var8 < var4; ++var8)
					var3.anIntArray1735[var8] = Class7.anIntArray66[var7[var8] & 255];
			}

			Class124_Sub7.method522();
			return var5;
		}
	}

	static void method311() {
		int var2;
		if (client.anInt2012 == 0) {
			Class36.aClass21_380 = new Class21(4, 104, 104, Class27.anIntArrayArrayArray284);

			for (var2 = 0; var2 < 4; ++var2)
				client.aClass130Array2192[var2] = new Class130(104, 104);

			Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954 = new Class124_Sub22_Sub16_Sub1(512, 512);
			Class4.aString39 = "Starting game engine...";
			Class4.anInt38 = 5;
			client.anInt2012 = 20;
		} else {
			int var5;
			int var6;
			int var7;
			int var8;
			if (client.anInt2012 == 20) {
				final int[] var26 = new int[9];

				for (var5 = 0; var5 < 9; ++var5) {
					var6 = 15 + 128 + (var5 * 32);
					var7 = (var6 * 3) + 600;
					var8 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var6];
					var26[var5] = (var8 * var7) >> 16;
				}

				Class21.method134(var26, 500, 800, 512, 334);
				Class4.aString39 = "Prepared visibility map";
				Class4.anInt38 = 10;
				client.anInt2012 = 30;
			} else if (client.anInt2012 == 30) {
				Class82.aClass94_Sub1_671 = Class35.method193(0, false, true, true);
				Class45.aClass94_Sub1_450 = Class35.method193(1, false, true, true);
				Class43.aClass94_Sub1_431 = Class35.method193(2, true, false, true);
				Class9.aClass94_Sub1_100 = Class35.method193(3, false, true, true);
				Class39.aClass94_Sub1_399 = Class35.method193(4, false, true, true);
				Class125.aClass94_Sub1_883 = Class35.method193(5, true, true, true);
				Class5.aClass94_Sub1_58 = Class35.method193(6, true, true, false);
				Class66.aClass94_Sub1_562 = Class35.method193(7, false, true, true);
				Class124_Sub11.aClass94_Sub1_1047 = Class35.method193(8, false, true, true);
				Class65.aClass94_Sub1_561 = Class35.method193(9, false, true, true);
				Class124_Sub22_Sub20.aClass94_Sub1_1647 = Class35.method193(10, false, true, true);
				Class68.aClass94_Sub1_571 = Class35.method193(11, false, true, true);
				Class88.aClass94_Sub1_695 = Class35.method193(12, false, true, true);
				Class25.aClass94_Sub1_279 = Class35.method193(13, true, false, true);
				Class70.aClass94_Sub1_585 = Class35.method193(14, false, true, false);
				Class124_Sub22_Sub18.aClass94_Sub1_1604 = Class35.method193(15, false, true, true);
				Class4.aString39 = "Connecting to update server";
				Class4.anInt38 = 20;
				client.anInt2012 = 40;
			} else if (client.anInt2012 == 40) {
				final byte var28 = 0;
				var2 = var28 + ((Class82.aClass94_Sub1_671.method612() * 4) / 100);
				var2 += (Class45.aClass94_Sub1_450.method612() * 4) / 100;
				var2 += (Class43.aClass94_Sub1_431.method612() * 2) / 100;
				var2 += (Class9.aClass94_Sub1_100.method612() * 2) / 100;
				var2 += (Class39.aClass94_Sub1_399.method612() * 6) / 100;
				var2 += (Class125.aClass94_Sub1_883.method612() * 4) / 100;
				var2 += (Class5.aClass94_Sub1_58.method612() * 2) / 100;
				var2 += (Class66.aClass94_Sub1_562.method612() * 60) / 100;
				var2 += (Class124_Sub11.aClass94_Sub1_1047.method612() * 2) / 100;
				var2 += (Class65.aClass94_Sub1_561.method612() * 2) / 100;
				var2 += (Class124_Sub22_Sub20.aClass94_Sub1_1647.method612() * 2) / 100;
				var2 += (Class68.aClass94_Sub1_571.method612() * 2) / 100;
				var2 += (Class88.aClass94_Sub1_695.method612() * 2) / 100;
				var2 += (Class25.aClass94_Sub1_279.method612() * 2) / 100;
				var2 += (Class70.aClass94_Sub1_585.method612() * 2) / 100;
				var2 += (Class124_Sub22_Sub18.aClass94_Sub1_1604.method612() * 2) / 100;
				if (var2 != 100) {
					if (var2 != 0)
						Class4.aString39 = "Checking for updates - " + var2 + "%";

					Class4.anInt38 = 30;
				} else {
					Class4.aString39 = "Loaded update list";
					Class4.anInt38 = 30;
					client.anInt2012 = 45;
				}
			} else if (client.anInt2012 == 45) {
				Class88.method343(22050, !client.aBool1989, 2);
				final Class124_Sub4_Sub3 var25 = new Class124_Sub4_Sub3();
				var25.method853(9, 128);
				client.aClass8_2224 = Class124_Sub22_Sub14.method752(Class27.aClass82_303, Class124_Sub5.aCanvas990, 0,
						22050);
				client.aClass8_2224.method37(var25);
				Class56_Sub2.method607(Class124_Sub22_Sub18.aClass94_Sub1_1604, Class70.aClass94_Sub1_585,
						Class39.aClass94_Sub1_399, var25);
				Class124_Sub22_Sub19_Sub2.aClass8_1668 = Class124_Sub22_Sub14.method752(Class27.aClass82_303,
						Class124_Sub5.aCanvas990, 1, 2048);
				Class56_Sub2.aClass124_Sub4_Sub2_1078 = new Class124_Sub4_Sub2();
				Class124_Sub22_Sub19_Sub2.aClass8_1668.method37(Class56_Sub2.aClass124_Sub4_Sub2_1078);
				Class27.aClass16_302 = new Class16(22050, Class8.anInt94);
				Class4.aString39 = "Prepared sound engine";
				Class4.anInt38 = 35;
				client.anInt2012 = 50;
			} else if (client.anInt2012 == 50) {
				var2 = 0;
				if (null == Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260)
					Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260 = Class22.method149(Class124_Sub11.aClass94_Sub1_1047,
							Class25.aClass94_Sub1_279, "p11_full", "");
				else
					++var2;

				if (Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714 == null)
					Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714 = Class22.method149(Class124_Sub11.aClass94_Sub1_1047,
							Class25.aClass94_Sub1_279, "p12_full", "");
				else
					++var2;

				if (null == Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407)
					Class41.aClass124_Sub22_Sub16_Sub4_Sub1_407 = Class22.method149(Class124_Sub11.aClass94_Sub1_1047,
							Class25.aClass94_Sub1_279, "b12_full", "");
				else
					++var2;

				if (var2 < 3) {
					Class4.aString39 = "Loading fonts - " + ((100 * var2) / 3) + "%";
					Class4.anInt38 = 40;
				} else {
					Class49.aClass124_Sub15_484 = new Class124_Sub15(true);
					Class4.aString39 = "Loaded fonts";
					Class4.anInt38 = 40;
					client.anInt2012 = 60;
				}
			} else {
				Class94_Sub1 var1;
				Class94_Sub1 var27;
				if (client.anInt2012 == 60) {
					var27 = Class124_Sub22_Sub20.aClass94_Sub1_1647;
					var1 = Class124_Sub11.aClass94_Sub1_1047;
					var7 = 0;
					if (var27.method379("title.jpg", ""))
						++var7;

					if (var1.method379("logo", ""))
						++var7;

					if (var1.method379("titlebox", ""))
						++var7;

					if (var1.method379("titlebutton", ""))
						++var7;

					if (var1.method379("runes", ""))
						++var7;

					if (var1.method379("title_mute", ""))
						++var7;

					if (var1.method365("options_radio_buttons,0"))
						++var7;

					if (var1.method365("options_radio_buttons,2"))
						++var7;

					var1.method379("sl_back", "");
					var1.method379("sl_flags", "");
					var1.method379("sl_arrows", "");
					var1.method379("sl_stars", "");
					var1.method379("sl_button", "");
					var8 = Class124_Sub22_Sub14.method753();
					if (var7 < var8) {
						Class4.aString39 = "Loading title screen - " + ((100 * var7) / var8) + "%";
						Class4.anInt38 = 50;
					} else {
						Class4.aString39 = "Loaded title screen";
						Class4.anInt38 = 50;
						Class124_Sub5.method516(5);
						client.anInt2012 = 70;
					}
				} else if (client.anInt2012 == 70) {
					if (!Class43.aClass94_Sub1_431.method367()) {
						Class4.aString39 = "Loading config - " + Class43.aClass94_Sub1_431.method613() + "%";
						Class4.anInt38 = 60;
					} else {
						final Class94_Sub1 var24 = Class43.aClass94_Sub1_431;
						Class124_Sub22_Sub15.aClass94_1561 = var24;
						Class124_Sub22_Sub13.method746(Class43.aClass94_Sub1_431);
						var27 = Class43.aClass94_Sub1_431;
						var1 = Class66.aClass94_Sub1_562;
						Class124_Sub22_Sub2.aClass94_1363 = var27;
						Class128.aClass94_887 = var1;
						Applet_Sub1.anInt1980 = Class124_Sub22_Sub2.aClass94_1363.method382(3);
						Class67.method298(Class43.aClass94_Sub1_431, Class66.aClass94_Sub1_562, client.aBool1989);
						Class47.method231(Class43.aClass94_Sub1_431, Class66.aClass94_Sub1_562);
						final Class94_Sub1 var14 = Class43.aClass94_Sub1_431;
						final Class94_Sub1 var3 = Class66.aClass94_Sub1_562;
						final boolean var22 = client.aBool1988;
						final Class124_Sub22_Sub16_Sub4_Sub1 var15 = Class23.aClass124_Sub22_Sub16_Sub4_Sub1_260;
						Class124_Sub22_Sub10.aClass94_1459 = var14;
						Class124_Sub22_Sub10.aClass94_1460 = var3;
						Class124_Sub22_Sub21.aBool1649 = var22;
						RuntimeException_Sub1.anInt1914 = Class124_Sub22_Sub10.aClass94_1459.method382(10);
						Class90.aClass124_Sub22_Sub16_Sub4_Sub1_709 = var15;
						final Class94_Sub1 var17 = Class43.aClass94_Sub1_431;
						final Class94_Sub1 var11 = Class82.aClass94_Sub1_671;
						final Class94_Sub1 var16 = Class45.aClass94_Sub1_450;
						Class124_Sub22_Sub13.aClass94_1545 = var17;
						Class124_Sub22_Sub13.aClass94_1530 = var11;
						Class124_Sub22_Sub13.aClass94_1533 = var16;
						Class1.method15(Class43.aClass94_Sub1_431, Class66.aClass94_Sub1_562);
						final Class94_Sub1 var18 = Class43.aClass94_Sub1_431;
						Class124_Sub22_Sub11.aClass94_1508 = var18;
						final Class94_Sub1 var19 = Class43.aClass94_Sub1_431;
						Class124_Sub22_Sub4.aClass94_1375 = var19;
						Class124_Sub22_Sub4.anInt1372 = Class124_Sub22_Sub4.aClass94_1375.method382(16);
						final Class94_Sub1 var13 = Class9.aClass94_Sub1_100;
						final Class94_Sub1 var20 = Class66.aClass94_Sub1_562;
						final Class94_Sub1 var21 = Class124_Sub11.aClass94_Sub1_1047;
						final Class94_Sub1 var10 = Class25.aClass94_Sub1_279;
						Class124_Sub17.aClass94_1145 = var13;
						Class124_Sub7.aClass94_1014 = var20;
						Class124_Sub17.aClass94_1146 = var21;
						Class69.aClass94_581 = var10;
						Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507 = new Class124_Sub17[Class124_Sub17.aClass94_1145
								.method373()][];
						Class124_Sub17.aBoolArray1267 = new boolean[Class124_Sub17.aClass94_1145.method373()];
						final Class94_Sub1 var12 = Class43.aClass94_Sub1_431;
						Class124_Sub22_Sub9.aClass94_1456 = var12;
						Class3.method21(Class43.aClass94_Sub1_431);
						Class49.method237(Class43.aClass94_Sub1_431);
						Class124_Sub9.method532(Class43.aClass94_Sub1_431);
						Class124_Sub6.aClass41_1006 = new Class41();
						Class4.aString39 = "Loaded config";
						Class4.anInt38 = 60;
						client.anInt2012 = 80;
					}
				} else if (client.anInt2012 != 80) {
					if (client.anInt2012 == 90) {
						if (!Class65.aClass94_Sub1_561.method367()) {
							Class4.aString39 = "Loading textures - " + Class65.aClass94_Sub1_561.method613() + "%";
							Class4.anInt38 = 90;
						} else {
							final Class31 var23 = new Class31(Class65.aClass94_Sub1_561,
									Class124_Sub11.aClass94_Sub1_1047, 20, 0.8D, client.aBool1989 ? 64 : 128);
							Class124_Sub22_Sub16_Sub3.method972(var23);
							Class124_Sub22_Sub16_Sub3.method983(0.8D);
							Class4.aString39 = "Loaded textures";
							Class4.anInt38 = 90;
							client.anInt2012 = 110;
						}
					} else if (client.anInt2012 == 110) {
						Class47.aClass29_467 = new Class29();
						Class27.aClass82_303.method334(Class47.aClass29_467, 10);
						Class4.aString39 = "Loaded input handler";
						Class4.anInt38 = 94;
						client.anInt2012 = 120;
					} else if (client.anInt2012 == 120) {
						if (!Class124_Sub22_Sub20.aClass94_Sub1_1647.method379("huffman", "")) {
							Class4.aString39 = "Loading wordpack - " + 0 + "%";
							Class4.anInt38 = 96;
						} else {
							final Class63 var4 = new Class63(
									Class124_Sub22_Sub20.aClass94_Sub1_1647.method378("huffman", ""));
							Class129.aClass63_889 = var4;
							Class4.aString39 = "Loaded wordpack";
							Class4.anInt38 = 96;
							client.anInt2012 = 130;
						}
					} else if (client.anInt2012 == 130) {
						if (!Class9.aClass94_Sub1_100.method367()) {
							Class4.aString39 = "Loading interfaces - "
									+ ((Class9.aClass94_Sub1_100.method613() * 4) / 5) + "%";
							Class4.anInt38 = 100;
						} else if (!Class88.aClass94_Sub1_695.method367()) {
							Class4.aString39 = "Loading interfaces - "
									+ (80 + (Class88.aClass94_Sub1_695.method613() / 6)) + "%";
							Class4.anInt38 = 100;
						} else if (!Class25.aClass94_Sub1_279.method367()) {
							Class4.aString39 = "Loading interfaces - "
									+ (96 + (Class25.aClass94_Sub1_279.method613() / 20)) + "%";
							Class4.anInt38 = 100;
						} else {
							Class4.aString39 = "Loaded interfaces";
							Class4.anInt38 = 100;
							client.anInt2012 = 140;
						}
					} else if (client.anInt2012 == 140)
						Class124_Sub5.method516(10);
				} else {
					var2 = 0;
					Class124_Sub22_Sub16_Sub1 var9;
					if (Class47.aClass124_Sub22_Sub16_Sub1_472 == null) {
						var1 = Class124_Sub11.aClass94_Sub1_1047;
						var7 = var1.method376("compass");
						var8 = var1.method383(var7, "");
						var9 = Class124_Sub22_Sub19_Sub6.method962(var1, var7, var8);
						Class47.aClass124_Sub22_Sub16_Sub1_472 = var9;
					} else
						++var2;

					if (null == Class71.aClass124_Sub22_Sub16_Sub1_591) {
						var1 = Class124_Sub11.aClass94_Sub1_1047;
						var7 = var1.method376("mapedge");
						var8 = var1.method383(var7, "");
						var9 = Class124_Sub22_Sub19_Sub6.method962(var1, var7, var8);
						Class71.aClass124_Sub22_Sub16_Sub1_591 = var9;
					} else
						++var2;

					if (Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435 == null)
						Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435 = Class124_Sub11
								.method537(Class124_Sub11.aClass94_Sub1_1047, "mapscene", "");
					else
						++var2;

					if (null == Class98.aClass124_Sub22_Sub16_Sub1Array771)
						Class98.aClass124_Sub22_Sub16_Sub1Array771 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "mapfunction", "");
					else
						++var2;

					if (null == Class75.aClass124_Sub22_Sub16_Sub1Array619)
						Class75.aClass124_Sub22_Sub16_Sub1Array619 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "hitmarks", "");
					else
						++var2;

					if (Class9.aClass124_Sub22_Sub16_Sub1Array101 == null)
						Class9.aClass124_Sub22_Sub16_Sub1Array101 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "headicons_pk", "");
					else
						++var2;

					if (Class124_Sub22_Sub13.aClass124_Sub22_Sub16_Sub1Array1547 == null)
						Class124_Sub22_Sub13.aClass124_Sub22_Sub16_Sub1Array1547 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "headicons_prayer", "");
					else
						++var2;

					if (null == Class124_Sub22_Sub2.aClass124_Sub22_Sub16_Sub1Array1364)
						Class124_Sub22_Sub2.aClass124_Sub22_Sub16_Sub1Array1364 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "headicons_hint", "");
					else
						++var2;

					if (Class7.aClass124_Sub22_Sub16_Sub1Array72 == null)
						Class7.aClass124_Sub22_Sub16_Sub1Array72 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "mapmarker", "");
					else
						++var2;

					if (Class135.aClass124_Sub22_Sub16_Sub1Array912 == null)
						Class135.aClass124_Sub22_Sub16_Sub1Array912 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "cross", "");
					else
						++var2;

					if (Class45.aClass124_Sub22_Sub16_Sub1Array439 == null)
						Class45.aClass124_Sub22_Sub16_Sub1Array439 = Class124_Sub22_Sub11
								.method728(Class124_Sub11.aClass94_Sub1_1047, "mapdots", "");
					else
						++var2;

					if (Class124_Sub24.aClass124_Sub22_Sub16_Sub2Array1311 == null)
						Class124_Sub24.aClass124_Sub22_Sub16_Sub2Array1311 = Class124_Sub11
								.method537(Class124_Sub11.aClass94_Sub1_1047, "scrollbar", "");
					else
						++var2;

					if (Class124_Sub22_Sub5.aClass124_Sub22_Sub16_Sub2Array1376 == null)
						Class124_Sub22_Sub5.aClass124_Sub22_Sub16_Sub2Array1376 = Class124_Sub11
								.method537(Class124_Sub11.aClass94_Sub1_1047, "mod_icons", "");
					else
						++var2;

					if (var2 < 13) {
						Class4.aString39 = "Loading sprites - " + ((100 * var2) / 13) + "%";
						Class4.anInt38 = 70;
					} else {
						Class124_Sub22_Sub16_Sub4.aClass124_Sub22_Sub16_Sub2Array1921 = Class124_Sub22_Sub5.aClass124_Sub22_Sub16_Sub2Array1376;
						Class71.aClass124_Sub22_Sub16_Sub1_591.method902();
						var5 = (int) (Math.random() * 21.0D) - 10;
						var6 = (int) (Math.random() * 21.0D) - 10;
						var7 = (int) (Math.random() * 21.0D) - 10;
						var8 = (int) (Math.random() * 41.0D) - 20;

						for (final Class124_Sub22_Sub16_Sub1 element : Class98.aClass124_Sub22_Sub16_Sub1Array771)
							element.method901(var8 + var5, var6 + var8, var8 + var7);

						Class124_Sub22_Sub6.aClass124_Sub22_Sub16_Sub2Array1435[0].method928(var8 + var5, var6 + var8,
								var7 + var8);
						Class4.aString39 = "Loaded sprites";
						Class4.anInt38 = 70;
						client.anInt2012 = 90;
					}
				}
			}
		}
	}

	static final void method312(final Class124_Sub22_Sub19_Sub3 var0) {
		var0.anInt1675 = var0.anInt1719;
		if (var0.anInt1721 == 0)
			var0.anInt1725 = 0;
		else {
			if ((var0.anInt1699 != -1) && (var0.anInt1673 == 0)) {
				final Class124_Sub22_Sub13 var3 = Class124_Sub22_Sub14.method750(var0.anInt1699);
				if ((var0.anInt1726 > 0) && (var3.anInt1544 == 0)) {
					++var0.anInt1725;
					return;
				}

				if ((var0.anInt1726 <= 0) && (var3.anInt1540 == 0)) {
					++var0.anInt1725;
					return;
				}
			}

			final int var5 = var0.anInt1690;
			final int var1 = var0.anInt1697;
			final int var4 = (128 * var0.anIntArray1722[var0.anInt1721 - 1]) + (var0.anInt1674 * 64);
			final int var2 = (var0.anIntArray1723[var0.anInt1721 - 1] * 128) + (var0.anInt1674 * 64);
			if (((var4 - var5) <= 256) && ((var4 - var5) >= -256) && ((var2 - var1) <= 256)
					&& ((var2 - var1) >= -256)) {
				if (var5 < var4) {
					if (var1 < var2)
						var0.anInt1718 = 1280;
					else if (var1 > var2)
						var0.anInt1718 = 1792;
					else
						var0.anInt1718 = 1536;
				} else if (var5 > var4) {
					if (var1 < var2)
						var0.anInt1718 = 768;
					else if (var1 > var2)
						var0.anInt1718 = 256;
					else
						var0.anInt1718 = 512;
				} else if (var1 < var2)
					var0.anInt1718 = 1024;
				else if (var1 > var2)
					var0.anInt1718 = 0;

				int var7 = (var0.anInt1718 - var0.anInt1672) & 2047;
				if (var7 > 1024)
					var7 -= 2048;

				int var8 = var0.anInt1679;
				if ((var7 >= -256) && (var7 <= 256))
					var8 = var0.anInt1712;
				else if ((var7 >= 256) && (var7 < 768))
					var8 = var0.anInt1681;
				else if ((var7 >= -768) && (var7 <= -256))
					var8 = var0.anInt1680;

				if (var8 == -1)
					var8 = var0.anInt1712;

				var0.anInt1675 = var8;
				int var9 = 4;
				boolean var6 = true;
				if (var0 instanceof Class124_Sub22_Sub19_Sub3_Sub1)
					var6 = ((Class124_Sub22_Sub19_Sub3_Sub1) var0).aClass124_Sub22_Sub1_1941.aBool1347;

				if (var6) {
					if ((var0.anInt1672 != var0.anInt1718) && (var0.anInt1694 == -1) && (var0.anInt1724 != 0))
						var9 = 2;

					if (var0.anInt1721 > 2)
						var9 = 6;

					if (var0.anInt1721 > 3)
						var9 = 8;

					if ((var0.anInt1725 > 0) && (var0.anInt1721 > 1)) {
						var9 = 8;
						--var0.anInt1725;
					}
				} else {
					if (var0.anInt1721 > 1)
						var9 = 6;

					if (var0.anInt1721 > 2)
						var9 = 8;

					if ((var0.anInt1725 > 0) && (var0.anInt1721 > 1)) {
						var9 = 8;
						--var0.anInt1725;
					}
				}

				if (var0.aBoolArray1701[var0.anInt1721 - 1])
					var9 <<= 1;

				if ((var9 >= 8) && (var0.anInt1712 == var0.anInt1675) && (var0.anInt1682 != -1))
					var0.anInt1675 = var0.anInt1682;

				if (var5 < var4) {
					var0.anInt1690 += var9;
					if (var0.anInt1690 > var4)
						var0.anInt1690 = var4;
				} else if (var5 > var4) {
					var0.anInt1690 -= var9;
					if (var0.anInt1690 < var4)
						var0.anInt1690 = var4;
				}

				if (var1 < var2) {
					var0.anInt1697 += var9;
					if (var0.anInt1697 > var2)
						var0.anInt1697 = var2;
				} else if (var1 > var2) {
					var0.anInt1697 -= var9;
					if (var0.anInt1697 < var2)
						var0.anInt1697 = var2;
				}

				if ((var0.anInt1690 == var4) && (var0.anInt1697 == var2)) {
					--var0.anInt1721;
					if (var0.anInt1726 > 0)
						--var0.anInt1726;
				}

			} else {
				var0.anInt1690 = var4;
				var0.anInt1697 = var2;
			}
		}
	}
}
