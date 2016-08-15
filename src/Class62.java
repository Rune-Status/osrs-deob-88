import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URI;

public class Class62 {
	static GarbageCollectorMXBean aGarbageCollectorMXBean548;
	static int anInt547 = 0;
	static int anInt552 = 0;
	static int anInt549 = 0;
	static byte[][] aByteArrayArray550 = new byte[1000][];
	static byte[][] aByteArrayArray551 = new byte[250][];
	static byte[][] aByteArrayArray553 = new byte[50][];

	public static void method275() {
		Class124_Sub22_Sub6.aClass113_1410.method436();
		Class124_Sub22_Sub6.aClass113_1389.method436();
		Class124_Sub22_Sub6.aClass113_1428.method436();
		Class124_Sub22_Sub6.aClass113_1391.method436();
	}

	static void method276() {
		client.aLong1995 = -1L;
		client.anInt1998 = -1;
		Class47.aClass29_467.anInt315 = 0;
		Class88.aBool702 = true;
		client.aBool2212 = true;
		client.aLong2208 = -1L;
		Class114.aClass110_824 = new Class110();
		client.aClass124_Sub14_Sub1_2024.anInt1075 = 0;
		client.aClass124_Sub14_Sub1_2026.anInt1075 = 0;
		client.anInt2028 = -1;
		client.anInt2017 = 1;
		client.anInt2032 = -1;
		client.anInt2086 = -1;
		client.anInt2193 = 0;
		client.anInt2001 = 0;
		client.anInt2034 = 0;
		client.anInt2171 = 0;
		client.anInt2124 = 0;
		client.aBool2240 = false;
		Class81.anInt648 = 0;
		Class47.aMap471.clear();
		Class47.aClass116_474.method440();
		Class47.aClass119_469.method443();
		Class47.anInt470 = 0;
		client.anInt2135 = 0;
		client.aBool2137 = false;
		client.anInt2225 = 0;
		client.anInt2046 = (int) (Math.random() * 100.0D) - 50;
		client.anInt2048 = (int) (Math.random() * 110.0D) - 55;
		client.anInt2050 = (int) (Math.random() * 80.0D) - 40;
		client.anInt2053 = (int) (Math.random() * 120.0D) - 60;
		client.anInt2055 = (int) (Math.random() * 30.0D) - 20;
		client.anInt2255 = ((int) (Math.random() * 20.0D) - 10) & 2047;
		client.anInt2218 = 0;
		client.anInt2211 = -1;
		client.anInt2194 = 0;
		client.anInt2217 = 0;
		client.aClass34_2011 = Class34.aClass34_368;
		client.anInt2090 = 0;
		client.anInt2022 = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var0] = null;
			client.aClass124_Sub14Array2256[var0] = null;
		}

		for (var0 = 0; var0 < '\u8000'; ++var0)
			client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var0] = null;

		Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[2047] = new Class124_Sub22_Sub19_Sub3_Sub2();
		client.anInt2114 = -1;
		client.aClass111_2117.method431();
		client.aClass111_2118.method431();

		for (var0 = 0; var0 < 4; ++var0)
			for (int var1 = 0; var1 < 104; ++var1)
				for (int var3 = 0; var3 < 104; ++var3)
					client.aClass111ArrayArrayArray2073[var0][var1][var3] = null;

		client.aClass111_2262 = new Class111();
		client.anInt2215 = 0;
		client.anInt2056 = 0;
		client.anInt2252 = 0;

		for (var0 = 0; var0 < Class124_Sub22_Sub4.anInt1372; ++var0) {
			final Class124_Sub22_Sub4 var4 = Class124_Sub22_Sub6.method690(var0);
			if (var4 != null) {
				Class91.anIntArray712[var0] = 0;
				Class91.anIntArray711[var0] = 0;
			}
		}

		Class124_Sub6.aClass41_1006.method202();
		client.anInt2150 = -1;
		if (client.anInt2142 != -1)
			Class124_Sub5.method512(client.anInt2142, 236366084);

		for (Class124_Sub7 var2 = (Class124_Sub7) client.aClass107_2143
				.method411(); null != var2; var2 = (Class124_Sub7) client.aClass107_2143.method413())
			Class124_Sub22_Sub15.method760(var2, true);

		client.anInt2142 = -1;
		client.aClass107_2143 = new Class107(8);
		client.aClass124_Sub17_2042 = null;
		client.aBool2240 = false;
		client.anInt2124 = 0;
		client.aClass100_2250.method394((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			client.aStringArray2166[var0] = null;
			client.aBoolArray2112[var0] = false;
		}

		Class49.method241();
		client.aBool1993 = true;

		for (var0 = 0; var0 < 100; ++var0)
			client.aBoolArray2061[var0] = true;

		Class124_Sub22_Sub8.method698();
		client.aString2120 = null;
		Class103.anInt794 = 0;
		Class124_Sub14_Sub1.aClass124_Sub9Array1609 = null;

		for (var0 = 0; var0 < 8; ++var0)
			client.aClass125Array2259[var0] = new Class125();

		Class37.aClass134_389 = null;
	}

	static synchronized byte[] method277(final int var0, final byte var1) {
		byte[] var2;
		if ((var0 == 100) && (anInt547 > 0)) {
			var2 = aByteArrayArray550[--anInt547];
			aByteArrayArray550[anInt547] = null;
			return var2;
		} else if ((var0 == 5000) && (anInt552 > 0)) {
			var2 = aByteArrayArray551[--anInt552];
			aByteArrayArray551[anInt552] = null;
			return var2;
		} else if ((var0 == 30000) && (anInt549 > 0)) {
			var2 = aByteArrayArray553[--anInt549];
			aByteArrayArray553[anInt549] = null;
			return var2;
		} else
			return new byte[var0];
	}

	public static Class53 method278(final int var0, final short var1) {
		final Class53[] var2 = new Class53[] { Class53.aClass53_493, Class53.aClass53_492, Class53.aClass53_494 };
		final Class53[] var3 = var2;

		for (final Class53 var5 : var3) {
			if (var0 == var5.anInt491)
				return var5;
		}

		return null;
	}

	static void method279(final Applet_Sub1 var0) {
		if (Class4.aBool50)
			Class124_Sub22_Sub19_Sub5.method957(var0);
		else {
			if (((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4)))
					&& (Class81.anInt658 >= ((765 + Class4.anInt22) - 50)) && (Class81.anInt655 >= 453)) {
				Class57.aClass22_538.aBool249 = !Class57.aClass22_538.aBool249;
				method281();
				if (!Class57.aClass22_538.aBool249)
					Class20.method96(Class5.aClass94_Sub1_58, "scape main", "", 255, false);
				else
					Class38.method199();
			}

			if (client.anInt1992 != 5) {
				++Class4.anInt36;
				if ((client.anInt1992 == 10) || (client.anInt1992 == 11)) {
					int var1;
					if (client.anInt2058 == 0) {
						if ((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4))) {
							var1 = Class4.anInt22 + 5;
							final short var2 = 463;
							final byte var3 = 100;
							final byte var4 = 35;
							if ((Class81.anInt658 >= var1) && (Class81.anInt658 <= (var3 + var1))
									&& (Class81.anInt655 >= var2) && (Class81.anInt655 <= (var4 + var2))) {
								if (Class96.method387())
									Class4.aBool50 = true;

								return;
							}
						}

						if ((null != Class124_Sub22_Sub9.aClass45_1455) && Class96.method387())
							Class4.aBool50 = true;
					}

					var1 = Class81.anInt650;
					final int var13 = Class81.anInt658;
					final int var14 = Class81.anInt655;
					if (!Class7.aBool71 && (var1 == 4))
						var1 = 1;

					short var5;
					String var6;
					int var15;
					if (Class4.anInt43 == 0) {
						var15 = (Class4.anInt30 + 180) - 80;
						var5 = 291;
						if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (var15 + 75)) && (var14 >= (var5 - 20))
								&& (var14 <= (var5 + 20)))
							label578: {
								var6 = Class5.method28("secure", true)
										+ "m=account-creation/g=oldscape/create_account_funnel.ws";
								if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE))
									try {
										Desktop.getDesktop().browse(new URI(var6));
										break label578;
									} catch (final Exception var11) {
										;
									}

								if (Class87.aString690.startsWith("win"))
									Class124_Sub22_Sub19_Sub6.method965(var6, 0, "openjs");
								else if (Class87.aString690.startsWith("mac"))
									Class124_Sub22_Sub19_Sub6.method965(var6, 1, "openjs");
								else
									Class124_Sub22_Sub19_Sub6.method965(var6, 2, "openjs");
							}

						var15 = 80 + 180 + Class4.anInt30;
						if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15)) && (var14 >= (var5 - 20))
								&& (var14 <= (20 + var5)))
							if ((client.anInt1984 & 4) != 0) {
								if ((client.anInt1984 & 1024) != 0) {
									Class4.aString41 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Class4.aString32 = "Players can attack each other almost everywhere";
									Class4.aString47 = "and the Protect Item prayer won\'t work.";
								} else {
									Class4.aString41 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Class4.aString32 = "Players can attack each other";
									Class4.aString47 = "almost everywhere.";
								}

								Class4.anInt43 = 1;
								Class4.anInt33 = 0;
							} else if ((client.anInt1984 & 1024) != 0) {
								Class4.aString41 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Class4.aString32 = "The Protect Item prayer will";
								Class4.aString47 = "not work on this world.";
								Class4.anInt43 = 1;
								Class4.anInt33 = 0;
							} else {
								Class4.aString41 = "";
								Class4.aString32 = "Enter your username/email & password.";
								Class4.aString47 = "";
								Class4.anInt43 = 2;
								Class4.anInt33 = 0;
							}
					} else if (Class4.anInt43 != 1) {
						short var16;
						if (Class4.anInt43 == 2) {
							var16 = 231;
							var15 = var16 + 30;
							if ((var1 == 1) && (var14 >= (var15 - 15)) && (var14 < var15))
								Class4.anInt33 = 0;

							var15 += 15;
							if ((var1 == 1) && (var14 >= (var15 - 15)) && (var14 < var15))
								Class4.anInt33 = 1;

							var15 += 15;
							var16 = 361;
							if ((var1 == 1) && (var14 >= (var16 - 15)) && (var14 < var16)) {
								Class124_Sub22_Sub12.method734("Please enter your username.",
										"If you created your account after November",
										"2010, this will be the creation email address.");
								Class4.anInt43 = 5;
								return;
							}

							int var17 = (Class4.anInt30 + 180) - 80;
							final short var8 = 321;
							if ((var1 == 1) && (var13 >= (var17 - 75)) && (var13 <= (var17 + 75))
									&& (var14 >= (var8 - 20)) && (var14 <= (var8 + 20))) {
								Class4.aString44 = Class4.aString44.trim();
								if (Class4.aString44.length() == 0) {
									Class124_Sub22_Sub12.method734("", "Please enter your username/email address.", "");
									return;
								}

								if (Class4.aString45.length() == 0) {
									Class124_Sub22_Sub12.method734("", "Please enter your password.", "");
									return;
								}

								Class124_Sub22_Sub12.method734("", "Connecting to server...", "");
								Class4.aClass72_48 = Class57.aClass22_538.aLinkedHashMap252
										.containsKey(Integer.valueOf(Class47.method232(Class4.aString44)))
												? Class72.aClass72_597 : Class72.aClass72_593;
								Class124_Sub5.method516(20);
								return;
							}

							var17 = Class4.anInt30 + 180 + 80;
							if ((var1 == 1) && (var13 >= (var17 - 75)) && (var13 <= (75 + var17))
									&& (var14 >= (var8 - 20)) && (var14 <= (20 + var8))) {
								Class4.anInt43 = 0;
								Class4.aString44 = "";
								Class4.aString45 = "";
								Class84.anInt673 = 0;
								Class49.aString485 = "";
								Class4.aBool37 = true;
							}

							while (true) {
								while (Class136.method485()) {
									boolean var9 = false;

									for (int var10 = 0; var10 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var10)
										if (Class124_Sub22_Sub6.aChar1394 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var10)) {
											var9 = true;
											break;
										}

									if (Class124_Sub13.anInt1072 == 13) {
										Class4.anInt43 = 0;
										Class4.aString44 = "";
										Class4.aString45 = "";
										Class84.anInt673 = 0;
										Class49.aString485 = "";
										Class4.aBool37 = true;
									} else if (Class4.anInt33 == 0) {
										if ((Class124_Sub13.anInt1072 == 85) && (Class4.aString44.length() > 0))
											Class4.aString44 = Class4.aString44.substring(0,
													Class4.aString44.length() - 1);

										if ((Class124_Sub13.anInt1072 == 84) || (Class124_Sub13.anInt1072 == 80))
											Class4.anInt33 = 1;

										if (var9 && (Class4.aString44.length() < 320))
											Class4.aString44 = Class4.aString44 + Class124_Sub22_Sub6.aChar1394;
									} else if (Class4.anInt33 == 1) {
										if ((Class124_Sub13.anInt1072 == 85) && (Class4.aString45.length() > 0))
											Class4.aString45 = Class4.aString45.substring(0,
													Class4.aString45.length() - 1);

										if ((Class124_Sub13.anInt1072 == 84) || (Class124_Sub13.anInt1072 == 80))
											Class4.anInt33 = 0;

										if (Class124_Sub13.anInt1072 == 84) {
											Class4.aString44 = Class4.aString44.trim();
											if (Class4.aString44.length() == 0) {
												Class124_Sub22_Sub12.method734("",
														"Please enter your username/email address.", "");
												return;
											}

											if (Class4.aString45.length() == 0) {
												Class124_Sub22_Sub12.method734("", "Please enter your password.", "");
												return;
											}

											Class124_Sub22_Sub12.method734("", "Connecting to server...", "");
											Class4.aClass72_48 = Class57.aClass22_538.aLinkedHashMap252
													.containsKey(Integer.valueOf(Class47.method232(Class4.aString44)))
															? Class72.aClass72_597 : Class72.aClass72_593;
											Class124_Sub5.method516(20);
											return;
										}

										if (var9 && (Class4.aString45.length() < 20))
											Class4.aString45 = Class4.aString45 + Class124_Sub22_Sub6.aChar1394;
									}
								}

								return;
							}
						} else {
							boolean var18;
							int var19;
							if (Class4.anInt43 == 4) {
								var15 = (180 + Class4.anInt30) - 80;
								var5 = 321;
								if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (var15 + 75))
										&& (var14 >= (var5 - 20)) && (var14 <= (var5 + 20))) {
									Class49.aString485.trim();
									if (Class49.aString485.length() != 6) {
										Class124_Sub22_Sub12.method734("", "Please enter a 6-digin PIN.", "");
										return;
									}

									Class84.anInt673 = Integer.parseInt(Class49.aString485);
									Class49.aString485 = "";
									Class4.aClass72_48 = Class4.aBool37 ? Class72.aClass72_594 : Class72.aClass72_599;
									Class124_Sub22_Sub12.method734("", "Connecting to server...", "");
									Class124_Sub5.method516(20);
									return;
								}

								if ((var1 == 1) && (var13 >= ((Class4.anInt30 + 180) - 9))
										&& (var13 <= (130 + Class4.anInt30 + 180)) && (var14 >= 263) && (var14 <= 296))
									Class4.aBool37 = !Class4.aBool37;

								if ((var1 == 1) && (var13 >= ((180 + Class4.anInt30) - 34))
										&& (var13 <= (180 + Class4.anInt30 + 34)) && (var14 >= 351) && (var14 <= 363))
									label593: {
										var6 = Class5.method28("secure", true)
												+ "m=totp-authenticator/disableTOTPRequest";
										if (Desktop.isDesktopSupported()
												&& Desktop.getDesktop().isSupported(Action.BROWSE))
											try {
												Desktop.getDesktop().browse(new URI(var6));
												break label593;
											} catch (final Exception var12) {
												;
											}

										if (Class87.aString690.startsWith("win"))
											Class124_Sub22_Sub19_Sub6.method965(var6, 0, "openjs");
										else if (Class87.aString690.startsWith("mac"))
											Class124_Sub22_Sub19_Sub6.method965(var6, 1, "openjs");
										else
											Class124_Sub22_Sub19_Sub6.method965(var6, 2, "openjs");
									}

								var15 = 80 + 180 + Class4.anInt30;
								if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (var15 + 75))
										&& (var14 >= (var5 - 20)) && (var14 <= (var5 + 20))) {
									Class4.anInt43 = 0;
									Class4.aString44 = "";
									Class4.aString45 = "";
									Class84.anInt673 = 0;
									Class49.aString485 = "";
								}

								while (Class136.method485()) {
									var18 = false;

									for (var19 = 0; var19 < "1234567890".length(); ++var19)
										if (Class124_Sub22_Sub6.aChar1394 == "1234567890".charAt(var19)) {
											var18 = true;
											break;
										}

									if (Class124_Sub13.anInt1072 == 13) {
										Class4.anInt43 = 0;
										Class4.aString44 = "";
										Class4.aString45 = "";
										Class84.anInt673 = 0;
										Class49.aString485 = "";
									} else {
										if ((Class124_Sub13.anInt1072 == 85) && (Class49.aString485.length() > 0))
											Class49.aString485 = Class49.aString485.substring(0,
													Class49.aString485.length() - 1);

										if (Class124_Sub13.anInt1072 == 84) {
											Class49.aString485.trim();
											if (Class49.aString485.length() != 6) {
												Class124_Sub22_Sub12.method734("", "Please enter a 6-digin PIN.", "");
												return;
											}

											Class84.anInt673 = Integer.parseInt(Class49.aString485);
											Class49.aString485 = "";
											Class4.aClass72_48 = Class4.aBool37 ? Class72.aClass72_594
													: Class72.aClass72_599;
											Class124_Sub22_Sub12.method734("", "Connecting to server...", "");
											Class124_Sub5.method516(20);
											return;
										}

										if (var18 && (Class49.aString485.length() < 6))
											Class49.aString485 = Class49.aString485 + Class124_Sub22_Sub6.aChar1394;
									}
								}
							} else if (Class4.anInt43 == 5) {
								var15 = (Class4.anInt30 + 180) - 80;
								var5 = 321;
								if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15))
										&& (var14 >= (var5 - 20)) && (var14 <= (var5 + 20))) {
									Class2.method18();
									return;
								}

								var15 = 80 + 180 + Class4.anInt30;
								if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (var15 + 75))
										&& (var14 >= (var5 - 20)) && (var14 <= (var5 + 20))) {
									Class4.aString41 = "";
									Class4.aString32 = "Enter your username/email & password.";
									Class4.aString47 = "";
									Class4.anInt43 = 2;
									Class4.anInt33 = 0;
									Class4.aString45 = "";
								}

								while (Class136.method485()) {
									var18 = false;

									for (var19 = 0; var19 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
											.length(); ++var19)
										if (Class124_Sub22_Sub6.aChar1394 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
												.charAt(var19)) {
											var18 = true;
											break;
										}

									if (Class124_Sub13.anInt1072 == 13) {
										Class4.aString41 = "";
										Class4.aString32 = "Enter your username/email & password.";
										Class4.aString47 = "";
										Class4.anInt43 = 2;
										Class4.anInt33 = 0;
										Class4.aString45 = "";
									} else {
										if ((Class124_Sub13.anInt1072 == 85) && (Class4.aString44.length() > 0))
											Class4.aString44 = Class4.aString44.substring(0,
													Class4.aString44.length() - 1);

										if (Class124_Sub13.anInt1072 == 84) {
											Class2.method18();
											return;
										}

										if (var18 && (Class4.aString44.length() < 320))
											Class4.aString44 = Class4.aString44 + Class124_Sub22_Sub6.aChar1394;
									}
								}
							} else if (Class4.anInt43 == 6)
								while (true) {
									do
										if (!Class136.method485()) {
											var16 = 321;
											if ((var1 == 1) && (var14 >= (var16 - 20)) && (var14 <= (20 + var16))) {
												Class4.aString41 = "";
												Class4.aString32 = "Enter your username/email & password.";
												Class4.aString47 = "";
												Class4.anInt43 = 2;
												Class4.anInt33 = 0;
												Class4.aString45 = "";
											}

											return;
										}
									while ((Class124_Sub13.anInt1072 != 84) && (Class124_Sub13.anInt1072 != 13));

									Class4.aString41 = "";
									Class4.aString32 = "Enter your username/email & password.";
									Class4.aString47 = "";
									Class4.anInt43 = 2;
									Class4.anInt33 = 0;
									Class4.aString45 = "";
								}
						}
					} else {
						while (Class136.method485())
							if (Class124_Sub13.anInt1072 == 84) {
								Class4.aString41 = "";
								Class4.aString32 = "Enter your username/email & password.";
								Class4.aString47 = "";
								Class4.anInt43 = 2;
								Class4.anInt33 = 0;
							} else if (Class124_Sub13.anInt1072 == 13)
								Class4.anInt43 = 0;

						var15 = (180 + Class4.anInt30) - 80;
						var5 = 321;
						if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15)) && (var14 >= (var5 - 20))
								&& (var14 <= (var5 + 20))) {
							Class4.aString41 = "";
							Class4.aString32 = "Enter your username/email & password.";
							Class4.aString47 = "";
							Class4.anInt43 = 2;
							Class4.anInt33 = 0;
						}

						var15 = 80 + 180 + Class4.anInt30;
						if ((var1 == 1) && (var13 >= (var15 - 75)) && (var13 <= (75 + var15)) && (var14 >= (var5 - 20))
								&& (var14 <= (var5 + 20)))
							Class4.anInt43 = 0;
					}

				}
			}
		}
	}

	static Class22 method280() {
		Class127 var0 = null;
		Class22 var1 = new Class22();

		try {
			var0 = Class124_Sub22_Sub19_Sub5.method960("", client.aClass88_1987.aString700, false);
			final byte[] var2 = new byte[(int) var0.method460()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.method459(var2, var3, var2.length - var3);
				if (var4 == -1)
					throw new IOException();
			}

			var1 = new Class22(new Class124_Sub14(var2));
		} catch (final Exception var6) {
			;
		}

		try {
			if (var0 != null)
				var0.method461();
		} catch (final Exception var5) {
			;
		}

		return var1;
	}

	static void method281() {
		Class127 var0 = null;

		try {
			var0 = Class124_Sub22_Sub19_Sub5.method960("", client.aClass88_1987.aString700, true);
			final Class124_Sub14 var1 = Class57.aClass22_538.method148();
			var0.method458(var1.aByteArray1073, 0, var1.anInt1075);
		} catch (final Exception var3) {
			;
		}

		try {
			if (null != var0)
				var0.method461();
		} catch (final Exception var2) {
			;
		}

	}
}
