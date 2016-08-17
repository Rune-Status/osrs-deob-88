import java.awt.Graphics;
import java.util.zip.Inflater;

public class Class64 {
	public static Class9 aClass9_558;
	static int[] anIntArray559;
	static int anInt560;
	Inflater anInflater557;

	Class64(final int var1, final int var2, final int var3) {
	}

	static void method286(final Widget var0) {
		final Widget var1 = var0.anInt1259 == -1 ? null : Class10.getwidget(var0.anInt1259);
		int var2;
		int var3;
		if (null == var1) {
			var3 = Class56_Sub2.anInt1083;
			var2 = Class81.anInt662;
		} else {
			var3 = var1.anInt1168;
			var2 = var1.anInt1169;
		}

		Class25.method161(var0, var3, var2, false);
		Class43.method221(var0, var3, var2);
	}

	static void method287(final Somet1 var0, final Somet1 var1,
			final Somet1 var2, final boolean var3) {
		if (var3) {
			Class4.anInt22 = (Class56_Sub2.anInt1083 - client.anInt2071) / 2;
			Class4.anInt30 = 202 + Class4.anInt22;
		}

		int var5;
		int var7;
		int var32;
		int var34;
		byte var36;
		if (Class4.aBool50) {
			if (null == Class45.aClass124_Sub22_Sub16_Sub1Array448)
				Class45.aClass124_Sub22_Sub16_Sub1Array448 = Def14
						.method728(Class124_Sub11.aClass94_Sub1_1047, "sl_back", "");

			if (Class4.aClass124_Sub22_Sub16_Sub2Array51 == null)
				Class4.aClass124_Sub22_Sub16_Sub2Array51 = Class124_Sub11.method537(Class124_Sub11.aClass94_Sub1_1047,
						"sl_flags", "");

			if (null == Class78.aClass124_Sub22_Sub16_Sub2Array635)
				Class78.aClass124_Sub22_Sub16_Sub2Array635 = Class124_Sub11.method537(Class124_Sub11.aClass94_Sub1_1047,
						"sl_arrows", "");

			if (null == Class10.aClass124_Sub22_Sub16_Sub2Array109)
				Class10.aClass124_Sub22_Sub16_Sub2Array109 = Class124_Sub11.method537(Class124_Sub11.aClass94_Sub1_1047,
						"sl_stars", "");

			Class124_Sub22_Sub16.method768(Class4.anInt22, 23, 765, 480, 0);
			Class124_Sub22_Sub16.method779(Class4.anInt22, 0, 125, 23, 12425273, 9135624);
			Class124_Sub22_Sub16.method779(125 + Class4.anInt22, 0, 640, 23, 5197647, 2697513);
			var0.method1021("Select a world", Class4.anInt22 + 62, 15, 0, -1);
			if (Class10.aClass124_Sub22_Sub16_Sub2Array109 != null) {
				Class10.aClass124_Sub22_Sub16_Sub2Array109[1].method926(140 + Class4.anInt22, 1);
				var1.method1020("Members only world", 152 + Class4.anInt22, 10, 16777215, -1);
				Class10.aClass124_Sub22_Sub16_Sub2Array109[0].method926(Class4.anInt22 + 140, 12);
				var1.method1020("Free world", 152 + Class4.anInt22, 21, 16777215, -1);
			}

			if (Class78.aClass124_Sub22_Sub16_Sub2Array635 != null) {
				var32 = 280 + Class4.anInt22;
				if ((Class23.anIntArray259[0] == 0) && (Class23.anIntArray266[0] == 0))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[2].method926(var32, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[0].method926(var32, 4);

				if ((Class23.anIntArray259[0] == 0) && (Class23.anIntArray266[0] == 1))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[3].method926(var32 + 15, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[1].method926(15 + var32, 4);

				var0.method1020("World", 32 + var32, 17, 16777215, -1);
				var5 = Class4.anInt22 + 390;
				if ((Class23.anIntArray259[0] == 1) && (Class23.anIntArray266[0] == 0))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[2].method926(var5, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[0].method926(var5, 4);

				if ((Class23.anIntArray259[0] == 1) && (Class23.anIntArray266[0] == 1))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[3].method926(15 + var5, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[1].method926(var5 + 15, 4);

				var0.method1020("Players", 32 + var5, 17, 16777215, -1);
				var34 = Class4.anInt22 + 500;
				if ((Class23.anIntArray259[0] == 2) && (Class23.anIntArray266[0] == 0))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[2].method926(var34, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[0].method926(var34, 4);

				if ((Class23.anIntArray259[0] == 2) && (Class23.anIntArray266[0] == 1))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[3].method926(15 + var34, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[1].method926(15 + var34, 4);

				var0.method1020("Location", 32 + var34, 17, 16777215, -1);
				var7 = 610 + Class4.anInt22;
				if ((Class23.anIntArray259[0] == 3) && (Class23.anIntArray266[0] == 0))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[2].method926(var7, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[0].method926(var7, 4);

				if ((Class23.anIntArray259[0] == 3) && (Class23.anIntArray266[0] == 1))
					Class78.aClass124_Sub22_Sub16_Sub2Array635[3].method926(var7 + 15, 4);
				else
					Class78.aClass124_Sub22_Sub16_Sub2Array635[1].method926(15 + var7, 4);

				var0.method1020("Type", var7 + 32, 17, 16777215, -1);
			}

			Class124_Sub22_Sub16.method768(708 + Class4.anInt22, 4, 50, 16, 0);
			var1.method1021("Cancel", 25 + 708 + Class4.anInt22, 16, 16777215, -1);
			var32 = 0;
			var5 = 33554432;
			var34 = client.anInt1984 & var5;

			for (var7 = 0; var7 < Class23.anInt257; ++var7) {
				final Class23 var8 = Class23.aClass23Array256[var7];
				if ((var34 == (var8.anInt255 & var5)) || ((var8.anInt255 & var5) == 0))
					++var32;
			}

			Class4.anInt52 = -1;
			if (Class45.aClass124_Sub22_Sub16_Sub1Array448 != null) {
				var36 = 88;
				final byte var38 = 19;
				int var39 = 765 / (var36 + 1);
				int var11 = 480 / (1 + var38);

				int var12;
				int var13;
				do {
					var12 = var11;
					var13 = var39;
					if (((var39 - 1) * var11) >= var32)
						--var39;

					if ((var39 * (var11 - 1)) >= var32)
						--var11;

					if ((var39 * (var11 - 1)) >= var32)
						--var11;
				} while ((var11 != var12) || (var13 != var39));

				var12 = (765 - (var39 * var36)) / (1 + var39);
				if (var12 > 5)
					var12 = 5;

				var13 = (480 - (var11 * var38)) / (1 + var11);
				if (var13 > 5)
					var13 = 5;

				final int var14 = (765 - (var39 * var36) - (var12 * (var39 - 1))) / 2;
				final int var15 = (480 - (var38 * var11) - (var13 * (var11 - 1))) / 2;
				int var16 = var15 + 23;
				int var17 = Class4.anInt22 + var14;
				int var18 = 0;
				boolean var19 = false;

				int var20;
				for (var20 = 0; var20 < Class23.anInt257; ++var20) {
					final Class23 var21 = Class23.aClass23Array256[var20];
					if ((var34 == (var21.anInt255 & var5)) || ((var21.anInt255 & var5) == 0)) {
						boolean var22 = true;
						String var23 = Integer.toString(var21.anInt261);
						if (var21.anInt261 == -1) {
							var23 = "OFF";
							var22 = false;
						} else if (var21.anInt261 > 1980) {
							var23 = "FULL";
							var22 = false;
						}

						byte var24;
						if (var21.method154()) {
							if (var21.method152())
								var24 = 3;
							else
								var24 = 2;
						} else if (var21.method152())
							var24 = 1;
						else
							var24 = 0;

						if ((Class81.anInt652 >= var17) && (Class81.anInt653 >= var16)
								&& (Class81.anInt652 < (var36 + var17)) && (Class81.anInt653 < (var38 + var16))
								&& var22) {
							Class4.anInt52 = var20;
							Class45.aClass124_Sub22_Sub16_Sub1Array448[var24].method916(var17, var16, 128, 16777215);
							var19 = true;
						} else
							Class45.aClass124_Sub22_Sub16_Sub1Array448[var24].method917(var17, var16);

						if (null != Class4.aClass124_Sub22_Sub16_Sub2Array51)
							Class4.aClass124_Sub22_Sub16_Sub2Array51[(var21.method152() ? 8 : 0) + var21.anInt264]
									.method926(29 + var17, var16);

						var0.method1021(Integer.toString(var21.anInt262), 15 + var17, var16 + (var38 / 2) + 5, 0, -1);
						var1.method1021(var23, 60 + var17, 5 + var16 + (var38 / 2), 268435455, -1);
						var16 += var13 + var38;
						++var18;
						if (var18 >= var11) {
							var16 = 23 + var15;
							var17 += var36 + var12;
							var18 = 0;
						}
					}
				}

				if (var19) {
					var20 = var1.method1018(Class23.aClass23Array256[Class4.anInt52].aString263) + 6;
					final int var25 = 8 + var1.anInt1934;
					Class124_Sub22_Sub16.method768(Class81.anInt652 - (var20 / 2), 5 + Class81.anInt653 + 20, var20,
							var25, 16777120);
					Class124_Sub22_Sub16.method769(Class81.anInt652 - (var20 / 2), Class81.anInt653 + 20 + 5, var20,
							var25, 0);
					var1.method1021(Class23.aClass23Array256[Class4.anInt52].aString263, Class81.anInt652,
							var1.anInt1934 + Class81.anInt653 + 20 + 5 + 4, 0, -1);
				}
			}

			try {
				final Graphics var40 = Class124_Sub5.aCanvas990.getGraphics();
				aClass9_558.method52(var40, 0, 0, (byte) 7);
			} catch (final Exception var29) {
				Class124_Sub5.aCanvas990.repaint();
			}

		} else {
			if (var3) {
				Class4.aClass124_Sub22_Sub16_Sub1_40.method917(Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub1_27.method917(382 + Class4.anInt22, 0);
				Class4.aClass124_Sub22_Sub16_Sub2_28
						.method926((Class4.anInt22 + 382) - (Class4.aClass124_Sub22_Sub16_Sub2_28.anInt1738 / 2), 18);
			}

			if ((client.anInt1992 == 0) || (client.anInt1992 == 5)) {
				final byte var4 = 20;
				var0.method1021("RuneScape is loading - please wait...", Class4.anInt30 + 180, 245 - var4, 16777215,
						-1);
				var5 = 253 - var4;
				Class124_Sub22_Sub16.method769((Class4.anInt30 + 180) - 152, var5, 304, 34, 9179409);
				Class124_Sub22_Sub16.method769((180 + Class4.anInt30) - 151, var5 + 1, 302, 32, 0);
				Class124_Sub22_Sub16.method768((180 + Class4.anInt30) - 150, var5 + 2, Class4.anInt38 * 3, 30, 9179409);
				Class124_Sub22_Sub16.method768(((Class4.anInt30 + 180) - 150) + (Class4.anInt38 * 3), 2 + var5,
						300 - (Class4.anInt38 * 3), 30, 0);
				var0.method1021(Class4.aString39, 180 + Class4.anInt30, 276 - var4, 16777215, -1);
			}

			String var27;
			short var31;
			short var33;
			if (client.anInt1992 == 20) {
				Class4.aClass124_Sub22_Sub16_Sub2_42.method926(
						(180 + Class4.anInt30) - (Class4.aClass124_Sub22_Sub16_Sub2_42.anInt1738 / 2),
						271 - (Class4.aClass124_Sub22_Sub16_Sub2_42.anInt1736 / 2));
				var31 = 211;
				var0.method1021(Class4.aString41, 180 + Class4.anInt30, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.method1021(Class4.aString32, Class4.anInt30 + 180, var32, 16776960, 0);
				var32 += 15;
				var0.method1021(Class4.aString47, 180 + Class4.anInt30, var32, 16776960, 0);
				var32 += 15;
				var32 += 10;
				if (Class4.anInt43 != 4) {
					var0.method1020("Login: ", (Class4.anInt30 + 180) - 110, var32, 16777215, 0);
					var33 = 200;

					for (var27 = Class4.aString44; var0.method1018(var27) > var33; var27 = var27.substring(0,
							var27.length() - 1))
						;

					var0.method1020(Class124_Sub22_Sub16_Sub4.method1031(var27), (Class4.anInt30 + 180) - 70, var32,
							16777215, 0);
					var32 += 15;
					var0.method1020("Password: " + Class76.method317(Class4.aString45), (Class4.anInt30 + 180) - 108,
							var32, 16777215, 0);
					var32 += 15;
				}
			}

			if ((client.anInt1992 == 10) || (client.anInt1992 == 11)) {
				Class4.aClass124_Sub22_Sub16_Sub2_42.method926(Class4.anInt30, 171);
				short var6;
				if (Class4.anInt43 == 0) {
					var31 = 251;
					var0.method1021("Welcome to RuneScape", 180 + Class4.anInt30, var31, 16776960, 0);
					var32 = var31 + 30;
					var5 = (Class4.anInt30 + 180) - 80;
					var6 = 291;
					Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var5 - 73, var6 - 20);
					var0.method1027("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var5 = 180 + Class4.anInt30 + 80;
					Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var5 - 73, var6 - 20);
					var0.method1027("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class4.anInt43 == 1) {
					var0.method1021("Warning!", Class4.anInt30 + 180, 211, 16776960, 0);
					var31 = 236;
					var0.method1021(Class4.aString41, Class4.anInt30 + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.method1021(Class4.aString32, Class4.anInt30 + 180, var32, 16777215, 0);
					var32 += 15;
					var0.method1021(Class4.aString47, Class4.anInt30 + 180, var32, 16777215, 0);
					var32 += 15;
					var5 = (Class4.anInt30 + 180) - 80;
					var6 = 321;
					Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var5 - 73, var6 - 20);
					var0.method1021("Continue", var5, var6 + 5, 16777215, 0);
					var5 = 80 + 180 + Class4.anInt30;
					Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var5 - 73, var6 - 20);
					var0.method1021("Cancel", var5, var6 + 5, 16777215, 0);
				} else {
					short var9;
					if (Class4.anInt43 == 2) {
						var31 = 211;
						var0.method1021(Class4.aString41, Class4.anInt30 + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.method1021(Class4.aString32, 180 + Class4.anInt30, var32, 16776960, 0);
						var32 += 15;
						var0.method1021(Class4.aString47, Class4.anInt30 + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 10;
						var0.method1020("Login: ", (180 + Class4.anInt30) - 110, var32, 16777215, 0);
						var33 = 200;

						for (var27 = Class4.aString44; var0.method1018(var27) > var33; var27 = var27.substring(1))
							;

						var0.method1020(
								Class124_Sub22_Sub16_Sub4.method1031(var27)
										+ ((Class4.anInt33 == 0) & ((client.anInt2158 % 40) < 20)
												? Class124_Sub4_Sub3.method874(16776960) + "|" : ""),
								(180 + Class4.anInt30) - 70, var32, 16777215, 0);
						var32 += 15;
						var0.method1020(
								"Password: " + Class76.method317(Class4.aString45)
										+ ((Class4.anInt33 == 1) & ((client.anInt2158 % 40) < 20)
												? Class124_Sub4_Sub3.method874(16776960) + "|" : ""),
								(Class4.anInt30 + 180) - 108, var32, 16777215, 0);
						var32 += 15;
						var7 = (Class4.anInt30 + 180) - 80;
						var9 = 321;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var7 - 73, var9 - 20);
						var0.method1021("Login", var7, 5 + var9, 16777215, 0);
						var7 = Class4.anInt30 + 180 + 80;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var7 - 73, var9 - 20);
						var0.method1021("Cancel", var7, 5 + var9, 16777215, 0);
						var31 = 357;
						var1.method1021("Forgotten your password? <col=ffffff>Click here.", Class4.anInt30 + 180, var31,
								16776960, 0);
					} else if (Class4.anInt43 == 4) {
						var0.method1021("Authenticator", 180 + Class4.anInt30, 211, 16776960, 0);
						var31 = 236;
						var0.method1021(Class4.aString41, Class4.anInt30 + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.method1021(Class4.aString32, Class4.anInt30 + 180, var32, 16777215, 0);
						var32 += 15;
						var0.method1021(Class4.aString47, 180 + Class4.anInt30, var32, 16777215, 0);
						var32 += 15;
						var0.method1020("PIN: " + Class76.method317(Class49.aString485)
								+ ((client.anInt2158 % 40) < 20 ? Class124_Sub4_Sub3.method874(16776960) + "|" : ""),
								(180 + Class4.anInt30) - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.method1020("Trust this computer", (180 + Class4.anInt30) - 9, var32, 16776960, 0);
						var32 += 15;
						var0.method1020("for 30 days: ", (Class4.anInt30 + 180) - 9, var32, 16776960, 0);
						var5 = ((Class4.anInt30 + 180) - 9) + var0.method1018("for 30 days: ") + 15;
						var34 = var32 - var0.anInt1934;
						Class124_Sub22_Sub16_Sub2 var26;
						if (Class4.aBool37)
							var26 = Class4.aClass124_Sub22_Sub16_Sub2_29;
						else
							var26 = Class89.aClass124_Sub22_Sub16_Sub2_706;

						var26.method926(var5, var34);
						var32 += 15;
						int var37 = (180 + Class4.anInt30) - 80;
						final short var10 = 321;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var37 - 73, var10 - 20);
						var0.method1021("Continue", var37, 5 + var10, 16777215, 0);
						var37 = 80 + Class4.anInt30 + 180;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var37 - 73, var10 - 20);
						var0.method1021("Cancel", var37, var10 + 5, 16777215, 0);
						var1.method1021("<u=ff>Can\'t Log In?</u>", 180 + Class4.anInt30, var10 + 36, 255, 0);
					} else if (Class4.anInt43 == 5) {
						var0.method1021("Forgotten your password?", Class4.anInt30 + 180, 201, 16776960, 0);
						var31 = 221;
						var2.method1021(Class4.aString41, 180 + Class4.anInt30, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.method1021(Class4.aString32, 180 + Class4.anInt30, var32, 16776960, 0);
						var32 += 15;
						var2.method1021(Class4.aString47, 180 + Class4.anInt30, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.method1020("Username/email: ", (180 + Class4.anInt30) - 145, var32, 16777215, 0);
						var33 = 174;

						for (var27 = Class4.aString44; var0.method1018(var27) > var33; var27 = var27.substring(1))
							;

						var0.method1020(Class124_Sub22_Sub16_Sub4.method1031(var27)
								+ ((client.anInt2158 % 40) < 20 ? Class124_Sub4_Sub3.method874(16776960) + "|" : ""),
								(180 + Class4.anInt30) - 34, var32, 16777215, 0);
						var32 += 15;
						var7 = (Class4.anInt30 + 180) - 80;
						var9 = 321;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var7 - 73, var9 - 20);
						var0.method1021("Recover", var7, 5 + var9, 16777215, 0);
						var7 = 80 + 180 + Class4.anInt30;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var7 - 73, var9 - 20);
						var0.method1021("Back", var7, 5 + var9, 16777215, 0);
					} else if (Class4.anInt43 == 6) {
						var31 = 211;
						var0.method1021(Class4.aString41, Class4.anInt30 + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.method1021(Class4.aString32, Class4.anInt30 + 180, var32, 16776960, 0);
						var32 += 15;
						var0.method1021(Class4.aString47, Class4.anInt30 + 180, var32, 16776960, 0);
						var32 += 15;
						var5 = Class4.anInt30 + 180;
						var6 = 321;
						Class4.aClass124_Sub22_Sub16_Sub2_24.method926(var5 - 73, var6 - 20);
						var0.method1021("Back", var5, var6 + 5, 16777215, 0);
					}
				}
			}

			if (Class4.anInt36 > 0) {
				Def12.method747(Class4.anInt36);
				Class4.anInt36 = 0;
			}

			Def4.method759();
			Class5.aClass124_Sub22_Sub16_Sub2Array59[Class57.aClass22_538.aBool249 ? 1 : 0]
					.method926((765 + Class4.anInt22) - 40, 463);
			if ((client.anInt1992 > 5) && (client.anInt2058 == 0))
				if (null != CacheArch.aClass124_Sub22_Sub16_Sub2_759) {
					var32 = Class4.anInt22 + 5;
					var33 = 463;
					final byte var35 = 100;
					var36 = 35;
					CacheArch.aClass124_Sub22_Sub16_Sub2_759.method926(var32, var33);
					var0.method1021("World" + " " + client.anInt2079, var32 + (var35 / 2), (var33 + (var36 / 2)) - 2,
							16777215, 0);
					if (Def5.aClass45_1455 != null)
						var1.method1021("Loading...", var32 + (var35 / 2), (var36 / 2) + var33 + 12, 16777215, 0);
					else
						var1.method1021("Click to switch", var32 + (var35 / 2), 12 + var33 + (var36 / 2), 16777215, 0);
				} else
					CacheArch.aClass124_Sub22_Sub16_Sub2_759 = Class1.method17(Class124_Sub11.aClass94_Sub1_1047,
							"sl_button", "");

			try {
				final Graphics var28 = Class124_Sub5.aCanvas990.getGraphics();
				aClass9_558.method52(var28, 0, 0, (byte) 7);
			} catch (final Exception var30) {
				Class124_Sub5.aCanvas990.repaint();
			}

		}
	}

	public void method288(final RSBuf var1, final byte[] var2) {
		if ((var1.backing[var1.pos] == 31) && (var1.backing[var1.pos + 1] == -117)) {
			if (null == anInflater557)
				anInflater557 = new Inflater(true);

			try {
				anInflater557.setInput(var1.backing, var1.pos + 10,
						var1.backing.length - (var1.pos + 10 + 8));
				anInflater557.inflate(var2);
			} catch (final Exception var4) {
				anInflater557.reset();
				throw new RuntimeException("");
			}

			anInflater557.reset();
		} else
			throw new RuntimeException("");
	}

	public Class64() {
		this(-1, 1000000, 1000000);
	}
}
