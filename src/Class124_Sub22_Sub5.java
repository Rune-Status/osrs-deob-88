import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.URI;
import java.util.Date;

public class Class124_Sub22_Sub5 extends JagMap {
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array1376;
	static int anInt1381;
	static byte[][] aByteArrayArray1384;
	int anInt1383;
	int anInt1377;
	int anInt1378;
	String aString1379;
	String aString1380;
	String aString1382;

	public static void method673(final Class78 var0, final boolean var1) {
		if (null != Class92.aClass78_732) {
			try {
				Class92.aClass78_732.method324();
			} catch (final Exception var6) {
				;
			}

			Class92.aClass78_732 = null;
		}

		Class92.aClass78_732 = var0;
		Class81.method328(var1);
		Class92.aClass124_Sub14_726.pos = 0;
		Class28.aClass124_Sub22_Sub21_311 = null;
		ISAAC.buf = null;
		Class92.anInt727 = 0;

		while (true) {
			Class124_Sub22_Sub21 var2 = (Class124_Sub22_Sub21) Class92.aClass107_730.method411();
			if (var2 == null)
				while (true) {
					var2 = (Class124_Sub22_Sub21) Class92.aClass107_724.method411();
					if (var2 == null) {
						if (Class92.aByte733 != 0)
							try {
								final RSBuf var7 = new RSBuf(4);
								var7.writeByte(4);
								var7.writeByte(Class92.aByte733);
								var7.writeShort(0);
								Class92.aClass78_732.method323(var7.backing, 0, 4);
							} catch (final IOException var5) {
								try {
									Class92.aClass78_732.method324();
								} catch (final Exception var4) {
									;
								}

								++Class92.anInt721;
								Class92.aClass78_732 = null;
							}

						Class92.anInt715 = 0;
						Class92.aLong717 = Class74.method316(663533292);
						return;
					}

					Class92.aClass108_722.method415(var2);
					Class92.aClass107_728.method412(var2, var2.aLong874);
					++Class92.anInt723;
					--Class92.anInt725;
				}

			Class92.aClass107_718.method412(var2, var2.aLong874);
			++Class92.anInt719;
			--Class92.anInt716;
		}
	}

	void method674(final int var1, final String var2, final String var3, final String var4) {
		final int var5 = ++Class47.anInt470 - 1;
		anInt1383 = var5;
		anInt1377 = client.anInt2158;
		anInt1378 = var1;
		aString1379 = var2;
		aString1380 = var3;
		aString1382 = var4;
	}

	public static int method675(int var0) {
		var0 = (var0 & 1431655765) + ((var0 >>> 1) & 1431655765);
		var0 = ((var0 >>> 2) & 858993459) + (var0 & 858993459);
		var0 = ((var0 >>> 4) + var0) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	static void method676(final Class124_Sub6 var0, final int var1) {
		final Object[] var2 = var0.anObjectArray995;
		final int var3 = ((Integer) var2[0]).intValue();
		Somet2 var4 = client.method574(var3);
		if (null != var4) {
			int var5 = 0;
			int var6 = 0;
			int var7 = -1;
			int[] var8 = var4.anIntArray1596;
			int[] var9 = var4.anIntArray1603;
			final byte var10 = -1;
			Class2.anInt10 = 0;

			int var13;
			try {
				Class112.anIntArray818 = new int[var4.anInt1599];
				int var11 = 0;
				Class60.aStringArray544 = new String[var4.anInt1602];
				int var12 = 0;

				int var14;
				String var15;
				for (var13 = 1; var13 < var2.length; ++var13)
					if (var2[var13] instanceof Integer) {
						var14 = ((Integer) var2[var13]).intValue();
						if (var14 == -2147483647)
							var14 = var0.anInt998;

						if (var14 == -2147483646)
							var14 = var0.anInt1004;

						if (var14 == -2147483645)
							var14 = var0.aClass124_Sub17_994 != null ? var0.aClass124_Sub17_994.anInt1284 : -1;

						if (var14 == -2147483644)
							var14 = var0.anInt997;

						if (var14 == -2147483643)
							var14 = var0.aClass124_Sub17_994 != null ? var0.aClass124_Sub17_994.anInt1154 : -1;

						if (var14 == -2147483642)
							var14 = null != var0.aClass124_Sub17_1000 ? var0.aClass124_Sub17_1000.anInt1284 : -1;

						if (var14 == -2147483641)
							var14 = null != var0.aClass124_Sub17_1000 ? var0.aClass124_Sub17_1000.anInt1154 : -1;

						if (var14 == -2147483640)
							var14 = var0.anInt999;

						if (var14 == -2147483639)
							var14 = var0.anInt993;

						Class112.anIntArray818[var11++] = var14;
					} else if (var2[var13] instanceof String) {
						var15 = (String) var2[var13];
						if (var15.equals("event_opbase"))
							var15 = var0.aString1002;

						Class60.aStringArray544[var12++] = var15;
					}

				var13 = 0;
				Class2.anInt15 = var0.anInt1001;

				label3101: while (true) {
					++var13;
					if (var13 > var1)
						throw new RuntimeException();

					++var7;
					int opc = var8[var7];
					int var10001;
					int var19;
					int var21;
					int var22;
					int[] var52;
					String[] var59;
					String var71;
					byte var93;
					if (opc < 100) {
						if (opc == 0) {
							Class2.anIntArray8[var5++] = var9[var7];
							continue;
						}

						if (opc == 1) {
							var14 = var9[var7];
							Class2.anIntArray8[var5++] = Class91.anIntArray711[var14];
							continue;
						}

						if (opc == 2) {
							var14 = var9[var7];
							--var5;
							Class91.anIntArray711[var14] = Class2.anIntArray8[var5];
							Class124_Sub11.method539(var14);
							continue;
						}

						if (opc == 3) {
							Class2.aStringArray5[var6++] = var4.aStringArray1598[var7];
							continue;
						}

						if (opc == 6) {
							var7 += var9[var7];
							continue;
						}

						if (opc == 7) {
							var5 -= 2;
							if (Class2.anIntArray8[1 + var5] != Class2.anIntArray8[var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 8) {
							var5 -= 2;
							if (Class2.anIntArray8[1 + var5] == Class2.anIntArray8[var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 9) {
							var5 -= 2;
							if (Class2.anIntArray8[var5] < Class2.anIntArray8[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 10) {
							var5 -= 2;
							if (Class2.anIntArray8[var5] > Class2.anIntArray8[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 21) {
							if (Class2.anInt10 == 0)
								return;

							final Class48 var49 = Class2.aClass48Array11[--Class2.anInt10];
							var4 = var49.aClass124_Sub22_Sub18_477;
							var8 = var4.anIntArray1596;
							var9 = var4.anIntArray1603;
							var7 = var49.anInt475;
							Class112.anIntArray818 = var49.anIntArray476;
							Class60.aStringArray544 = var49.aStringArray481;
							continue;
						}

						if (opc == 25) {
							var14 = var9[var7];
							Class2.anIntArray8[var5++] = Class74.method315(var14, (byte) 0);
							continue;
						}

						if (opc == 27) {
							var14 = var9[var7];
							--var5;
							Class124_Sub15.method611(var14, Class2.anIntArray8[var5]);
							continue;
						}

						if (opc == 31) {
							var5 -= 2;
							if (Class2.anIntArray8[var5] <= Class2.anIntArray8[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 32) {
							var5 -= 2;
							if (Class2.anIntArray8[var5] >= Class2.anIntArray8[1 + var5])
								var7 += var9[var7];
							continue;
						}

						if (opc == 33) {
							Class2.anIntArray8[var5++] = Class112.anIntArray818[var9[var7]];
							continue;
						}

						if (opc == 34) {
							var10001 = var9[var7];
							--var5;
							Class112.anIntArray818[var10001] = Class2.anIntArray8[var5];
							continue;
						}

						if (opc == 35) {
							Class2.aStringArray5[var6++] = Class60.aStringArray544[var9[var7]];
							continue;
						}

						if (opc == 36) {
							var10001 = var9[var7];
							--var6;
							Class60.aStringArray544[var10001] = Class2.aStringArray5[var6];
							continue;
						}

						if (opc == 37) {
							var14 = var9[var7];
							var6 -= var14;
							var71 = Class72.method309(Class2.aStringArray5, var6, var14);
							Class2.aStringArray5[var6++] = var71;
							continue;
						}

						if (opc == 38) {
							--var5;
							continue;
						}

						if (opc == 39) {
							--var6;
							continue;
						}

						if (opc == 40) {
							var14 = var9[var7];
							final Somet2 var107 = client.method574(var14);
							var52 = new int[var107.anInt1599];
							var59 = new String[var107.anInt1602];

							for (var19 = 0; var19 < var107.anInt1597; ++var19)
								var52[var19] = Class2.anIntArray8[var19 + (var5 - var107.anInt1597)];

							for (var19 = 0; var19 < var107.anInt1601; ++var19)
								var59[var19] = Class2.aStringArray5[var19 + (var6 - var107.anInt1601)];

							var5 -= var107.anInt1597;
							var6 -= var107.anInt1601;
							final Class48 var97 = new Class48();
							var97.aClass124_Sub22_Sub18_477 = var4;
							var97.anInt475 = var7;
							var97.anIntArray476 = Class112.anIntArray818;
							var97.aStringArray481 = Class60.aStringArray544;
							Class2.aClass48Array11[++Class2.anInt10 - 1] = var97;
							var4 = var107;
							var8 = var107.anIntArray1596;
							var9 = var107.anIntArray1603;
							var7 = -1;
							Class112.anIntArray818 = var52;
							Class60.aStringArray544 = var59;
							continue;
						}

						if (opc == 42) {
							Class2.anIntArray8[var5++] = Class124_Sub6.aClass41_1006.method208(var9[var7]);
							continue;
						}

						if (opc == 43) {
							var10001 = var9[var7];
							--var5;
							Class124_Sub6.aClass41_1006.method203(var10001, Class2.anIntArray8[var5]);
							continue;
						}

						if (opc == 44) {
							var14 = var9[var7] >> 16;
							var21 = var9[var7] & '\uffff';
							--var5;
							var22 = Class2.anIntArray8[var5];
							if ((var22 >= 0) && (var22 <= 5000)) {
								Class2.anIntArray6[var14] = var22;
								var93 = -1;
								if (var21 == 105)
									var93 = 0;

								var19 = 0;

								while (true) {
									if (var19 >= var22)
										continue label3101;

									Class2.anIntArrayArray7[var14][var19] = var93;
									++var19;
								}
							}

							throw new RuntimeException();
						}

						if (opc == 45) {
							var14 = var9[var7];
							--var5;
							var21 = Class2.anIntArray8[var5];
							if ((var21 >= 0) && (var21 < Class2.anIntArray6[var14])) {
								Class2.anIntArray8[var5++] = Class2.anIntArrayArray7[var14][var21];
								continue;
							}

							throw new RuntimeException();
						}

						if (opc == 46) {
							var14 = var9[var7];
							var5 -= 2;
							var21 = Class2.anIntArray8[var5];
							if ((var21 >= 0) && (var21 < Class2.anIntArray6[var14])) {
								Class2.anIntArrayArray7[var14][var21] = Class2.anIntArray8[1 + var5];
								continue;
							}

							throw new RuntimeException();
						}

						if (opc == 47) {
							var15 = Class124_Sub6.aClass41_1006.method206(var9[var7]);
							if (var15 == null)
								var15 = "null";

							Class2.aStringArray5[var6++] = var15;
							continue;
						}

						if (opc == 48) {
							var10001 = var9[var7];
							--var6;
							Class124_Sub6.aClass41_1006.method209(var10001, Class2.aStringArray5[var6]);
							continue;
						}
					}

					boolean var55;
					if (var9[var7] == 1)
						var55 = true;
					else
						var55 = false;

					Widget wid;
					Widget var17;
					int var25;
					Widget var50;
					Widget var56;
					int var70;
					boolean var72;
					boolean var74;
					if (opc < 1000) {
						if (opc == 100) {
							var5 -= 3;
							var21 = Class2.anIntArray8[var5];
							var22 = Class2.anIntArray8[1 + var5];
							var70 = Class2.anIntArray8[2 + var5];
							if (var22 == 0)
								throw new RuntimeException();

							var56 = Class10.method55(var21);
							if (null == var56.aClass124_Sub17Array1263)
								var56.aClass124_Sub17Array1263 = new Widget[1 + var70];

							if (var56.aClass124_Sub17Array1263.length <= var70) {
								final Widget[] var90 = new Widget[var70 + 1];

								for (var25 = 0; var25 < var56.aClass124_Sub17Array1263.length; ++var25)
									var90[var25] = var56.aClass124_Sub17Array1263[var25];

								var56.aClass124_Sub17Array1263 = var90;
							}

							if ((var70 > 0) && (null == var56.aClass124_Sub17Array1263[var70 - 1]))
								throw new RuntimeException("" + (var70 - 1));

							final Widget var92 = new Widget();
							var92.anInt1191 = var22;
							var10001 = var56.anInt1284;
							var92.anInt1284 = var56.anInt1284 * 1026570341;
							var92.anInt1259 = var10001;
							var92.anInt1154 = var70;
							var92.aBool1152 = true;
							var56.aClass124_Sub17Array1263[var70] = var92;
							if (var55)
								Class129.aClass124_Sub17_888 = var92;
							else
								Class29.aClass124_Sub17_314 = var92;

							Def10.settrue(var56);
							continue;
						}

						if (opc == 101) {
							wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
							var17 = Class10.method55(wid.anInt1284);
							var17.aClass124_Sub17Array1263[wid.anInt1154] = null;
							Def10.settrue(var17);
							continue;
						}

						if (opc == 102) {
							--var5;
							wid = Class10.method55(Class2.anIntArray8[var5]);
							wid.aClass124_Sub17Array1263 = null;
							Def10.settrue(wid);
							continue;
						}

						if (opc == 200) {
							var5 -= 2;
							var21 = Class2.anIntArray8[var5];
							var22 = Class2.anIntArray8[1 + var5];
							var50 = RuntimeException_Sub1.method1010(var21, var22, 172659367);
							if ((null != var50) && (var22 != -1)) {
								Class2.anIntArray8[var5++] = 1;
								if (var55)
									Class129.aClass124_Sub17_888 = var50;
								else
									Class29.aClass124_Sub17_314 = var50;
								continue;
							}

							Class2.anIntArray8[var5++] = 0;
							continue;
						}

						if (opc == 201) {
							--var5;
							wid = Class10.method55(Class2.anIntArray8[var5]);
							if (null != wid) {
								Class2.anIntArray8[var5++] = 1;
								if (var55)
									Class129.aClass124_Sub17_888 = wid;
								else
									Class29.aClass124_Sub17_314 = wid;
							} else
								Class2.anIntArray8[var5++] = 0;
							continue;
						}
					} else {
						boolean var23;
						if (((opc < 1000) || (opc >= 1100)) && ((opc < 2000) || (opc >= 2100))) {
							String var18;
							if (((opc >= 1100) && (opc < 1200)) || ((opc >= 2100) && (opc < 2200))) {
								var22 = -1;
								if (opc >= 2000) {
									opc -= 1000;
									--var5;
									var22 = Class2.anIntArray8[var5];
									wid = Class10.method55(var22);
								} else
									wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

								if (opc == 1100) {
									var5 -= 2;
									wid.anInt1174 = Class2.anIntArray8[var5];
									if (wid.anInt1174 > (wid.anInt1176 - wid.anInt1168))
										wid.anInt1174 = wid.anInt1176 - wid.anInt1168;

									if (wid.anInt1174 < 0)
										wid.anInt1174 = 0;

									wid.anInt1175 = Class2.anIntArray8[1 + var5];
									if (wid.anInt1175 > (wid.anInt1177 - wid.anInt1169))
										wid.anInt1175 = wid.anInt1177 - wid.anInt1169;

									if (wid.anInt1175 < 0)
										wid.anInt1175 = 0;

									Def10.settrue(wid);
									continue;
								}

								if (opc == 1101) {
									--var5;
									wid.anInt1178 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1102) {
									--var5;
									wid.aBool1218 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1103) {
									--var5;
									wid.anInt1183 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1104) {
									--var5;
									wid.anInt1237 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1105) {
									--var5;
									wid.anInt1186 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1106) {
									--var5;
									wid.anInt1188 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1107) {
									--var5;
									wid.aBool1189 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1108) {
									wid.anInt1229 = 1;
									--var5;
									wid.anInt1197 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1109) {
									var5 -= 6;
									wid.anInt1200 = Class2.anIntArray8[var5];
									wid.anInt1201 = Class2.anIntArray8[1 + var5];
									wid.anInt1202 = Class2.anIntArray8[2 + var5];
									wid.anInt1203 = Class2.anIntArray8[3 + var5];
									wid.anInt1204 = Class2.anIntArray8[var5 + 4];
									wid.anInt1205 = Class2.anIntArray8[var5 + 5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1110) {
									--var5;
									var70 = Class2.anIntArray8[var5];
									if (wid.anInt1222 != var70) {
										wid.anInt1222 = var70;
										wid.anInt1273 = 0;
										wid.anInt1274 = 0;
										Def10.settrue(wid);
									}
									continue;
								}

								if (opc == 1111) {
									--var5;
									wid.aBool1208 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1112) {
									--var6;
									var18 = Class2.aStringArray5[var6];
									if (!var18.equals(wid.aString1185)) {
										wid.aString1185 = var18;
										Def10.settrue(wid);
									}
									continue;
								}

								if (opc == 1113) {
									--var5;
									wid.anInt1155 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1114) {
									var5 -= 3;
									wid.anInt1214 = Class2.anIntArray8[var5];
									wid.anInt1215 = Class2.anIntArray8[1 + var5];
									wid.anInt1213 = Class2.anIntArray8[var5 + 2];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1115) {
									--var5;
									wid.aBool1211 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1116) {
									--var5;
									wid.anInt1167 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1117) {
									--var5;
									wid.anInt1280 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1118) {
									--var5;
									wid.aBool1192 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1119) {
									--var5;
									wid.aBool1193 = Class2.anIntArray8[var5] == 1;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1120) {
									var5 -= 2;
									wid.anInt1176 = Class2.anIntArray8[var5];
									wid.anInt1177 = Class2.anIntArray8[var5 + 1];
									Def10.settrue(wid);
									if ((var22 != -1) && (wid.anInt1191 == 0))
										Somet2.method831(
												Def10.widgets[var22 >> 16], wid,
												false);
									continue;
								}

								if (opc == 1121) {
									var70 = wid.anInt1284;
									var19 = wid.anInt1154;
									client.secbuf.writeOpcode(198); // ?
									client.secbuf.writeInt(var70);
									client.secbuf.writeShort(var19);
									client.aClass124_Sub17_2042 = wid;
									Def10.settrue(wid);
									continue;
								}

								if (opc == 1122) {
									--var5;
									wid.anInt1187 = Class2.anIntArray8[var5];
									Def10.settrue(wid);
									continue;
								}
							} else if (((opc < 1200) || (opc >= 1300)) && ((opc < 2200) || (opc >= 2300))) {
								if (((opc < 1300) || (opc >= 1400)) && ((opc < 2300) || (opc >= 2400))) {
									int var26;
									int[] var51;
									String var58;
									if (((opc >= 1400) && (opc < 1500)) || ((opc >= 2400) && (opc < 2500))) {
										if (opc >= 2000) {
											opc -= 1000;
											--var5;
											wid = Class10.method55(Class2.anIntArray8[var5]);
										} else
											wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

										--var6;
										var58 = Class2.aStringArray5[var6];
										var51 = null;
										if ((var58.length() > 0) && (var58.charAt(var58.length() - 1) == 89)) {
											--var5;
											var19 = Class2.anIntArray8[var5];
											if (var19 > 0)
												for (var51 = new int[var19]; var19-- > 0; var51[var19] = Class2.anIntArray8[var5])
													--var5;

											var58 = var58.substring(0, var58.length() - 1);
										}

										Object[] var69 = new Object[var58.length() + 1];

										for (var26 = var69.length - 1; var26 >= 1; --var26)
											if (var58.charAt(var26 - 1) == 115) {
												--var6;
												var69[var26] = Class2.aStringArray5[var6];
											} else {
												--var5;
												var69[var26] = new Integer(Class2.anIntArray8[var5]);
											}

										--var5;
										var26 = Class2.anIntArray8[var5];
										if (var26 != -1)
											var69[0] = new Integer(var26);
										else
											var69 = null;

										if (opc == 1400)
											wid.anObjectArray1233 = var69;

										if (opc == 1401)
											wid.anObjectArray1194 = var69;

										if (opc == 1402)
											wid.anObjectArray1235 = var69;

										if (opc == 1403)
											wid.anObjectArray1226 = var69;

										if (opc == 1404)
											wid.anObjectArray1160 = var69;

										if (opc == 1405)
											wid.anObjectArray1256 = var69;

										if (opc == 1406)
											wid.anObjectArray1243 = var69;

										if (opc == 1407) {
											wid.anObjectArray1244 = var69;
											wid.anIntArray1281 = var51;
										}

										if (opc == 1408)
											wid.anObjectArray1250 = var69;

										if (opc == 1409)
											wid.anObjectArray1198 = var69;

										if (opc == 1410)
											wid.anObjectArray1159 = var69;

										if (opc == 1411)
											wid.anObjectArray1234 = var69;

										if (opc == 1412)
											wid.anObjectArray1238 = var69;

										if (opc == 1414) {
											wid.anObjectArray1246 = var69;
											wid.anIntArray1282 = var51;
										}

										if (opc == 1415) {
											wid.anObjectArray1248 = var69;
											wid.anIntArray1249 = var51;
										}

										if (opc == 1416)
											wid.anObjectArray1236 = var69;

										if (opc == 1417)
											wid.anObjectArray1252 = var69;

										if (opc == 1418)
											wid.anObjectArray1144 = var69;

										if (opc == 1419)
											wid.anObjectArray1254 = var69;

										if (opc == 1420)
											wid.anObjectArray1255 = var69;

										if (opc == 1421)
											wid.anObjectArray1231 = var69;

										if (opc == 1422)
											wid.anObjectArray1253 = var69;

										if (opc == 1423)
											wid.anObjectArray1258 = var69;

										if (opc == 1424)
											wid.anObjectArray1247 = var69;

										if (opc == 1425)
											wid.anObjectArray1261 = var69;

										if (opc == 1426)
											wid.anObjectArray1262 = var69;

										if (opc == 1427)
											wid.anObjectArray1184 = var69;

										wid.aBool1195 = true;
										continue;
									}

									if (opc < 1600) {
										wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
										if (opc == 1500) {
											Class2.anIntArray8[var5++] = wid.anInt1166;
											continue;
										}

										if (opc == 1501) {
											Class2.anIntArray8[var5++] = wid.anInt1223;
											continue;
										}

										if (opc == 1502) {
											Class2.anIntArray8[var5++] = wid.anInt1168;
											continue;
										}

										if (opc == 1503) {
											Class2.anIntArray8[var5++] = wid.anInt1169;
											continue;
										}

										if (opc == 1504) {
											Class2.anIntArray8[var5++] = wid.aBool1173 ? 1 : 0;
											continue;
										}

										if (opc == 1505) {
											Class2.anIntArray8[var5++] = wid.anInt1259;
											continue;
										}
									} else if (opc < 1700) {
										wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
										if (opc == 1600) {
											Class2.anIntArray8[var5++] = wid.anInt1174;
											continue;
										}

										if (opc == 1601) {
											Class2.anIntArray8[var5++] = wid.anInt1175;
											continue;
										}

										if (opc == 1602) {
											Class2.aStringArray5[var6++] = wid.aString1185;
											continue;
										}

										if (opc == 1603) {
											Class2.anIntArray8[var5++] = wid.anInt1176;
											continue;
										}

										if (opc == 1604) {
											Class2.anIntArray8[var5++] = wid.anInt1177;
											continue;
										}

										if (opc == 1605) {
											Class2.anIntArray8[var5++] = wid.anInt1205;
											continue;
										}

										if (opc == 1606) {
											Class2.anIntArray8[var5++] = wid.anInt1202;
											continue;
										}

										if (opc == 1607) {
											Class2.anIntArray8[var5++] = wid.anInt1204;
											continue;
										}

										if (opc == 1608) {
											Class2.anIntArray8[var5++] = wid.anInt1203;
											continue;
										}

										if (opc == 1609) {
											Class2.anIntArray8[var5++] = wid.anInt1183;
											continue;
										}
									} else if (opc < 1800) {
										wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
										if (opc == 1700) {
											Class2.anIntArray8[var5++] = wid.anInt1271;
											continue;
										}

										if (opc == 1701) {
											if (wid.anInt1271 != -1)
												Class2.anIntArray8[var5++] = wid.anInt1272;
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}

										if (opc == 1702) {
											Class2.anIntArray8[var5++] = wid.anInt1154;
											continue;
										}
									} else if (opc < 1900) {
										wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
										if (opc == 1800) {
											var52 = Class2.anIntArray8;
											var70 = var5++;
											var26 = Class124_Sub22_Sub19_Sub6.method963(wid);
											var19 = (var26 >> 11) & 63;
											var52[var70] = var19;
											continue;
										}

										if (opc == 1801) {
											--var5;
											var22 = Class2.anIntArray8[var5];
											--var22;
											if ((null != wid.aStringArray1225)
													&& (var22 < wid.aStringArray1225.length)
													&& (wid.aStringArray1225[var22] != null)) {
												Class2.aStringArray5[var6++] = wid.aStringArray1225[var22];
												continue;
											}

											Class2.aStringArray5[var6++] = "";
											continue;
										}

										if (opc == 1802) {
											if (null == wid.aString1224)
												Class2.aStringArray5[var6++] = "";
											else
												Class2.aStringArray5[var6++] = wid.aString1224;
											continue;
										}
									} else if (((opc >= 1900) && (opc < 2000))
											|| ((opc >= 2900) && (opc < 3000))) {
										if (opc >= 2000) {
											opc -= 1000;
											--var5;
											wid = Class10.method55(Class2.anIntArray8[var5]);
										} else
											wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

										if (opc == 1927) {
											if (Class2.anInt15 >= 10)
												throw new RuntimeException();

											if (wid.anObjectArray1184 == null)
												return;

											final Class124_Sub6 var82 = new Class124_Sub6();
											var82.aClass124_Sub17_994 = wid;
											var82.anObjectArray995 = wid.anObjectArray1184;
											var82.anInt1001 = 1 + Class2.anInt15;
											client.aClass111_2181.method424(var0);
											continue;
										}
									} else if (opc < 2600) {
										--var5;
										wid = Class10.method55(Class2.anIntArray8[var5]);
										if (opc == 2500) {
											Class2.anIntArray8[var5++] = wid.anInt1166;
											continue;
										}

										if (opc == 2501) {
											Class2.anIntArray8[var5++] = wid.anInt1223;
											continue;
										}

										if (opc == 2502) {
											Class2.anIntArray8[var5++] = wid.anInt1168;
											continue;
										}

										if (opc == 2503) {
											Class2.anIntArray8[var5++] = wid.anInt1169;
											continue;
										}

										if (opc == 2504) {
											Class2.anIntArray8[var5++] = wid.aBool1173 ? 1 : 0;
											continue;
										}

										if (opc == 2505) {
											Class2.anIntArray8[var5++] = wid.anInt1259;
											continue;
										}
									} else if (opc < 2700) {
										--var5;
										wid = Class10.method55(Class2.anIntArray8[var5]);
										if (opc == 2600) {
											Class2.anIntArray8[var5++] = wid.anInt1174;
											continue;
										}

										if (opc == 2601) {
											Class2.anIntArray8[var5++] = wid.anInt1175;
											continue;
										}

										if (opc == 2602) {
											Class2.aStringArray5[var6++] = wid.aString1185;
											continue;
										}

										if (opc == 2603) {
											Class2.anIntArray8[var5++] = wid.anInt1176;
											continue;
										}

										if (opc == 2604) {
											Class2.anIntArray8[var5++] = wid.anInt1177;
											continue;
										}

										if (opc == 2605) {
											Class2.anIntArray8[var5++] = wid.anInt1205;
											continue;
										}

										if (opc == 2606) {
											Class2.anIntArray8[var5++] = wid.anInt1202;
											continue;
										}

										if (opc == 2607) {
											Class2.anIntArray8[var5++] = wid.anInt1204;
											continue;
										}

										if (opc == 2608) {
											Class2.anIntArray8[var5++] = wid.anInt1203;
											continue;
										}

										if (opc == 2609) {
											Class2.anIntArray8[var5++] = wid.anInt1183;
											continue;
										}
									} else if (opc < 2800) {
										if (opc == 2700) {
											--var5;
											wid = Class10.method55(Class2.anIntArray8[var5]);
											Class2.anIntArray8[var5++] = wid.anInt1271;
											continue;
										}

										if (opc == 2701) {
											--var5;
											wid = Class10.method55(Class2.anIntArray8[var5]);
											if (wid.anInt1271 != -1)
												Class2.anIntArray8[var5++] = wid.anInt1272;
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}

										if (opc == 2702) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											final Class124_Sub7 var54 = (Class124_Sub7) client.aClass107_2143
													.method409(var21);
											if (var54 != null)
												Class2.anIntArray8[var5++] = 1;
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}

										if (opc == 2706) {
											Class2.anIntArray8[var5++] = client.anInt2142;
											continue;
										}
									} else if (opc < 2900) {
										--var5;
										wid = Class10.method55(Class2.anIntArray8[var5]);
										if (opc == 2800) {
											var52 = Class2.anIntArray8;
											var70 = var5++;
											var26 = Class124_Sub22_Sub19_Sub6.method963(wid);
											var19 = (var26 >> 11) & 63;
											var52[var70] = var19;
											continue;
										}

										if (opc == 2801) {
											--var5;
											var22 = Class2.anIntArray8[var5];
											--var22;
											if ((null != wid.aStringArray1225)
													&& (var22 < wid.aStringArray1225.length)
													&& (wid.aStringArray1225[var22] != null)) {
												Class2.aStringArray5[var6++] = wid.aStringArray1225[var22];
												continue;
											}

											Class2.aStringArray5[var6++] = "";
											continue;
										}

										if (opc == 2802) {
											if (null == wid.aString1224)
												Class2.aStringArray5[var6++] = "";
											else
												Class2.aStringArray5[var6++] = wid.aString1224;
											continue;
										}
									} else if (opc < 3200) {
										if (opc == 3100) {
											--var6;
											var71 = Class2.aStringArray5[var6];
											Class20.method95(0, "", var71);
											continue;
										}

										if (opc == 3101) {
											var5 -= 2;
											Class45.method226(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246,
													Class2.anIntArray8[var5], Class2.anIntArray8[var5 + 1]);
											continue;
										}

										if (opc == 3103) {
											client.secbuf.writeOpcode(180); // ?

											for (Class124_Sub7 var76 = (Class124_Sub7) client.aClass107_2143
													.method411(); var76 != null; var76 = (Class124_Sub7) client.aClass107_2143
															.method413())
												if ((var76.anInt1008 == 0) || (var76.anInt1008 == 3))
													Def4.method760(var76, true);

											if (null != client.aClass124_Sub17_2042) {
												Def10.settrue(client.aClass124_Sub17_2042);
												client.aClass124_Sub17_2042 = null;
											}
											continue;
										}

										if (opc == 3104) {
											--var6;
											var71 = Class2.aStringArray5[var6];
											var22 = 0;
											var23 = Class55.method262(var71, 10, true);
											if (var23) {
												var19 = Class124_Sub22_Sub19_Sub2.method889(var71, 10, true);
												var22 = var19;
											}

											client.secbuf.writeOpcode(37); // enter x
											client.secbuf.writeInt(var22);
											continue;
										}

										if (opc == 3105) {
											--var6;
											var71 = Class2.aStringArray5[var6];
											client.secbuf.writeOpcode(84); // enter string
											client.secbuf.writeByte(var71.length() + 1);
											client.secbuf.writestr(var71);
											continue;
										}

										if (opc == 3106) {
											--var6;
											var71 = Class2.aStringArray5[var6];
											client.secbuf.writeOpcode(181); // enter string
											client.secbuf.writeByte(var71.length() + 1);
											client.secbuf.writestr(var71);
											continue;
										}

										if (opc == 3107) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											--var6;
											var58 = Class2.aStringArray5[var6];
											var23 = false;

											for (var19 = 0; var19 < client.anInt2090; ++var19) {
												final Class124_Sub22_Sub19_Sub3_Sub2 var24 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var19]];
												if ((null != var24) && (null != var24.aString1956)
														&& var24.aString1956.equalsIgnoreCase(var58)) {
													if (var21 == 1) {
														client.secbuf.writeOpcode(177); // player op 1 (attack)
														client.secbuf
																.writeShortU(client.anIntArray2128[var19]);
														client.secbuf.writeByteN(0);
													} else if (var21 == 4) {
														client.secbuf.writeOpcode(139); // player op 2
														client.secbuf
																.writeShort(client.anIntArray2128[var19]);
														client.secbuf.writeByteN(0);
													} else if (var21 == 6) {
														client.secbuf.writeOpcode(192); // player op 3
														client.secbuf
																.method587(client.anIntArray2128[var19]);
														client.secbuf.writeByteA(0);
													} else if (var21 == 7) {
														client.secbuf.writeOpcode(153); // player op 4
														client.secbuf
																.method587(client.anIntArray2128[var19]);
														client.secbuf.writeByteN(0);
													}

													var23 = true;
													break;
												}
											}

											if (!var23)
												Class20.method95(4, "", "Unable to find " + var58);
											continue;
										}

										if (opc == 3108) {
											var5 -= 3;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[var5 + 1];
											var70 = Class2.anIntArray8[2 + var5];
											var56 = Class10.method55(var70);
											Class35.method194(var56, var21, var22);
											continue;
										}

										if (opc == 3109) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[1 + var5];
											var50 = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;
											Class35.method194(var50, var21, var22);
											continue;
										}

										if (opc == 3110) {
											--var5;
											Class7.aBool71 = Class2.anIntArray8[var5] == 1;
											continue;
										}

										if (opc == 3111) {
											Class2.anIntArray8[var5++] = Class57.aClass22_538.aBool248 ? 1 : 0;
											continue;
										}

										if (opc == 3112) {
											--var5;
											Class57.aClass22_538.aBool248 = Class2.anIntArray8[var5] == 1;
											Class62.method281();
											continue;
										}

										if (opc == 3113) {
											--var6;
											var71 = Class2.aStringArray5[var6];
											--var5;
											var74 = Class2.anIntArray8[var5] == 1;
											if (!var74) {
												Class124_Sub22_Sub19_Sub6.method965(var71, 3, "openjs");
												continue;
											}

											if (Desktop.isDesktopSupported()
													&& Desktop.getDesktop().isSupported(Action.BROWSE))
												try {
													Desktop.getDesktop().browse(new URI(var71));
													continue;
												} catch (final Exception var46) {
													;
												}

											if (Class87.aString690.startsWith("win"))
												Class124_Sub22_Sub19_Sub6.method965(var71, 0, "openjs");
											else if (Class87.aString690.startsWith("mac"))
												Class124_Sub22_Sub19_Sub6.method965(var71, 1, "openjs");
											else
												Class124_Sub22_Sub19_Sub6.method965(var71, 2, "openjs");
											continue;
										}

										if (opc == 3115) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											client.secbuf.writeOpcode(148); // ?
											client.secbuf.writeShort(var21);
											continue;
										}

										if (opc == 3116) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											var6 -= 2;
											var58 = Class2.aStringArray5[var6];
											var18 = Class2.aStringArray5[var6 + 1];
											if ((var58.length() <= 500) && (var18.length() <= 500)) {
												client.secbuf.writeOpcode(13); // ?
												client.secbuf.writeShort(
														1 + Class54.len(var58) + Class54.len(var18));
												client.secbuf.writestr(var18);
												client.secbuf.writeByteS(var21);
												client.secbuf.writestr(var58);
											}
											continue;
										}
									} else if (opc < 3300) {
										if (opc == 3200) {
											var5 -= 3;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[1 + var5];
											var70 = Class2.anIntArray8[var5 + 2];
											if ((client.anInt2239 != 0) && (var22 != 0) && (client.anInt2225 < 50)) {
												client.anIntArray2226[client.anInt2225] = var21;
												client.anIntArray2227[client.anInt2225] = var22;
												client.anIntArray2228[client.anInt2225] = var70;
												client.aClass12Array2230[client.anInt2225] = null;
												client.anIntArray2229[client.anInt2225] = 0;
												++client.anInt2225;
											}
											continue;
										}

										if (opc == 3201) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											if ((var21 == -1) && !client.aBool2221)
												Class38.method199();
											else if ((var21 != -1) && (var21 != client.anInt2220)
													&& (client.anInt2219 != 0) && !client.aBool2221)
												Class25.method159(2, Class5.aClass94_Sub1_58, var21, 0,
														client.anInt2219, false);

											client.anInt2220 = var21;
											continue;
										}

										if (opc == 3202) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											if ((client.anInt2219 != 0) && (var21 != -1)) {
												Class2.method19(Class68.aClass94_Sub1_571, var21, 0, client.anInt2219,
														false);
												client.aBool2221 = true;
											}
											continue;
										}
									} else if (opc < 3400) {
										if (opc == 3300) {
											Class2.anIntArray8[var5++] = client.anInt2158;
											continue;
										}

										Class124_Sub10 var27;
										if (opc == 3301) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[1 + var5];
											var51 = Class2.anIntArray8;
											var19 = var5++;
											var27 = (Class124_Sub10) Class124_Sub10.aClass107_1034.method409(var21);
											if (null == var27)
												var26 = -1;
											else if ((var22 >= 0) && (var22 < var27.anIntArray1030.length))
												var26 = var27.anIntArray1030[var22];
											else
												var26 = -1;

											var51[var19] = var26;
											continue;
										}

										if (opc == 3302) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[var5 + 1];
											Class2.anIntArray8[var5++] = Class61.method274(var21, var22);
											continue;
										}

										if (opc == 3303) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[var5 + 1];
											Class2.anIntArray8[var5++] = Class124_Sub10.method535(var21, var22);
											continue;
										}

										if (opc == 3304) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = Class136.method484(var21).anInt1457;
											continue;
										}

										if (opc == 3305) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = client.anIntArray2126[var21];
											continue;
										}

										if (opc == 3306) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = client.anIntArray2030[var21];
											continue;
										}

										if (opc == 3307) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = client.anIntArray2121[var21];
											continue;
										}

										if (opc == 3308) {
											var21 = Class134.anInt906;
											var22 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690 >> 7)
													+ Class9.anInt102;
											var70 = Class95.anInt762
													+ (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697 >> 7);
											Class2.anIntArray8[var5++] = var70 + (var22 << 14) + (var21 << 28);
											continue;
										}

										if (opc == 3309) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = (var21 >> 14) & 16383;
											continue;
										}

										if (opc == 3310) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = var21 >> 28;
											continue;
										}

										if (opc == 3311) {
											--var5;
											var21 = Class2.anIntArray8[var5];
											Class2.anIntArray8[var5++] = var21 & 16383;
											continue;
										}

										if (opc == 3312) {
											Class2.anIntArray8[var5++] = client.aBool1988 ? 1 : 0;
											continue;
										}

										if (opc == 3313) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5] + '\u8000';
											var22 = Class2.anIntArray8[var5 + 1];
											var51 = Class2.anIntArray8;
											var19 = var5++;
											var27 = (Class124_Sub10) Class124_Sub10.aClass107_1034.method409(var21);
											if (null == var27)
												var26 = -1;
											else if ((var22 >= 0) && (var22 < var27.anIntArray1030.length))
												var26 = var27.anIntArray1030[var22];
											else
												var26 = -1;

											var51[var19] = var26;
											continue;
										}

										if (opc == 3314) {
											var5 -= 2;
											var21 = '\u8000' + Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[var5 + 1];
											Class2.anIntArray8[var5++] = Class61.method274(var21, var22);
											continue;
										}

										if (opc == 3315) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5] + '\u8000';
											var22 = Class2.anIntArray8[var5 + 1];
											Class2.anIntArray8[var5++] = Class124_Sub10.method535(var21, var22);
											continue;
										}

										if (opc == 3316) {
											if (client.anInt2149 >= 2)
												Class2.anIntArray8[var5++] = client.anInt2149;
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}

										if (opc == 3317) {
											Class2.anIntArray8[var5++] = client.anInt2001;
											continue;
										}

										if (opc == 3318) {
											Class2.anIntArray8[var5++] = client.anInt2079;
											continue;
										}

										if (opc == 3321) {
											Class2.anIntArray8[var5++] = client.anInt2147;
											continue;
										}

										if (opc == 3322) {
											Class2.anIntArray8[var5++] = client.anInt2148;
											continue;
										}

										if (opc == 3323) {
											if (client.aBool2151)
												Class2.anIntArray8[var5++] = 1;
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}

										if (opc == 3324) {
											Class2.anIntArray8[var5++] = client.anInt1984;
											continue;
										}
									} else if (opc < 3500) {
										if (opc == 3400) {
											var5 -= 2;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[1 + var5];
											Def8 var53 = Class60.method272(var21);
											if (var53.aChar1445 != 115)
												;

											for (var19 = 0; var19 < var53.anInt1447; ++var19)
												if (var53.anIntArray1448[var19] == var22) {
													Class2.aStringArray5[var6++] = var53.aStringArray1450[var19];
													var53 = null;
													break;
												}

											if (null != var53)
												Class2.aStringArray5[var6++] = var53.aString1446;
											continue;
										}

										if (opc == 3408) {
											var5 -= 4;
											var21 = Class2.anIntArray8[var5];
											var22 = Class2.anIntArray8[var5 + 1];
											var70 = Class2.anIntArray8[var5 + 2];
											var19 = Class2.anIntArray8[var5 + 3];
											Def8 var73 = Class60.method272(var70);
											if ((var21 == var73.aChar1449) && (var22 == var73.aChar1445)) {
												for (var25 = 0; var25 < var73.anInt1447; ++var25)
													if (var19 == var73.anIntArray1448[var25]) {
														if (var22 == 115)
															Class2.aStringArray5[var6++] = var73.aStringArray1450[var25];
														else
															Class2.anIntArray8[var5++] = var73.anIntArray1451[var25];

														var73 = null;
														break;
													}

												if (null != var73)
													if (var22 == 115)
														Class2.aStringArray5[var6++] = var73.aString1446;
													else
														Class2.anIntArray8[var5++] = var73.anInt1442;
												continue;
											}

											if (var22 == 115)
												Class2.aStringArray5[var6++] = "null";
											else
												Class2.anIntArray8[var5++] = 0;
											continue;
										}
									} else {
										int var29;
										String var83;
										if (opc < 3700) {
											if (opc == 3600) {
												if (client.anInt2215 == 0)
													Class2.anIntArray8[var5++] = -2;
												else if (client.anInt2215 == 1)
													Class2.anIntArray8[var5++] = -1;
												else
													Class2.anIntArray8[var5++] = client.anInt2056;
												continue;
											}

											if (opc == 3601) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.anInt2215 == 2) && (var21 < client.anInt2056)) {
													Class2.aStringArray5[var6++] = client.aClass32Array2098[var21].aString344;
													Class2.aStringArray5[var6++] = client.aClass32Array2098[var21].aString338;
													continue;
												}

												Class2.aStringArray5[var6++] = "";
												Class2.aStringArray5[var6++] = "";
												continue;
											}

											if (opc == 3602) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.anInt2215 == 2) && (var21 < client.anInt2056)) {
													Class2.anIntArray8[var5++] = client.aClass32Array2098[var21].anInt339;
													continue;
												}

												Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3603) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.anInt2215 == 2) && (var21 < client.anInt2056)) {
													Class2.anIntArray8[var5++] = client.aClass32Array2098[var21].anInt340;
													continue;
												}

												Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3604) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												--var5;
												var22 = Class2.anIntArray8[var5];
												Class18.method89(var71, var22);
												continue;
											}

											if (opc == 3605) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												Class45.method225(var71);
												continue;
											}

											String var77;
											if (opc == 3606) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												if (var71 == null)
													continue;

												var58 = Class34.method186(var71, Class49.aClass117_488);
												if (null == var58)
													continue;

												var70 = 0;

												while (true) {
													if (var70 >= client.anInt2056)
														continue label3101;

													final Class32 var63 = client.aClass32Array2098[var70];
													var77 = var63.aString344;
													var83 = Class34.method186(var77, Class49.aClass117_488);
													boolean var28;
													if ((var71 != null) && (null != var77)) {
														if (!var71.startsWith("#") && !var77.startsWith("#"))
															var28 = var58.equals(var83);
														else
															var28 = var71.equals(var77);
													} else
														var28 = false;

													if (var28) {
														--client.anInt2056;

														for (var29 = var70; var29 < client.anInt2056; ++var29)
															client.aClass32Array2098[var29] = client.aClass32Array2098[var29
																	+ 1];

														client.anInt2175 = client.anInt2067;
														client.secbuf.writeOpcode(39); // ? write string
														client.secbuf
																.writeByte(Class54.len(var71));
														client.secbuf.writestr(var71);
														continue label3101;
													}

													++var70;
												}
											}

											if (opc == 3607) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												Class35.method190(var71, false);
												continue;
											}

											if (opc == 3608) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												Class23.method156(var71);
												continue;
											}

											if (opc == 3609) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												final Class74[] var61 = new Class74[] { Class74.aClass74_612,
														Class74.aClass74_613, Class74.aClass74_617,
														Class74.aClass74_616, Class74.aClass74_611 };
												final Class74[] var57 = var61;

												for (var19 = 0; var19 < var57.length; ++var19) {
													final Class74 var81 = var57[var19];
													if ((var81.anInt614 != -1)
															&& var71.startsWith(Class99.method391(var81.anInt614))) {
														var71 = var71.substring(
																6 + Integer.toString(var81.anInt614).length());
														break;
													}
												}

												Class2.anIntArray8[var5++] = Def6.method691(var71, false)
														? 1 : 0;
												continue;
											}

											String var60;
											String[] var78;
											if (opc == 3611) {
												if (null != client.aString2120) {
													var78 = Class2.aStringArray5;
													var22 = var6++;
													var60 = client.aString2120;
													var77 = Class61.method273(Class58.method269(var60));
													if (null == var77)
														var77 = "";

													var78[var22] = var77;
												} else
													Class2.aStringArray5[var6++] = "";
												continue;
											}

											if (opc == 3612) {
												if (client.aString2120 != null)
													Class2.anIntArray8[var5++] = Class103.anInt794;
												else
													Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3613) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((null != client.aString2120) && (var21 < Class103.anInt794)) {
													Class2.aStringArray5[var6++] = client.aClass124_Sub9Array1609[var21].aString1029;
													continue;
												}

												Class2.aStringArray5[var6++] = "";
												continue;
											}

											if (opc == 3614) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.aString2120 != null) && (var21 < Class103.anInt794)) {
													Class2.anIntArray8[var5++] = client.aClass124_Sub9Array1609[var21].anInt1027;
													continue;
												}

												Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3615) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((null != client.aString2120) && (var21 < Class103.anInt794)) {
													Class2.anIntArray8[var5++] = client.aClass124_Sub9Array1609[var21].aByte1028;
													continue;
												}

												Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3616) {
												Class2.anIntArray8[var5++] = Class124_Sub22_Sub19_Sub1.aByte1665;
												continue;
											}

											if (opc == 3617) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												Class49.method239(var71);
												continue;
											}

											if (opc == 3618) {
												Class2.anIntArray8[var5++] = Class9.aByte97;
												continue;
											}

											if (opc == 3619) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												Class90.method347(var71);
												continue;
											}

											if (opc == 3620) {
												client.secbuf.writeOpcode(36); // ?
												client.secbuf.writeByte(0);
												continue;
											}

											if (opc == 3621) {
												if (client.anInt2215 == 0)
													Class2.anIntArray8[var5++] = -1;
												else
													Class2.anIntArray8[var5++] = client.anInt2252;
												continue;
											}

											if (opc == 3622) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.anInt2215 != 0) && (var21 < client.anInt2252)) {
													Class2.aStringArray5[var6++] = client.aClass35Array1986[var21].aString372;
													Class2.aStringArray5[var6++] = client.aClass35Array1986[var21].aString373;
													continue;
												}

												Class2.aStringArray5[var6++] = "";
												Class2.aStringArray5[var6++] = "";
												continue;
											}

											if (opc == 3623) {
												--var6;
												var71 = Class2.aStringArray5[var6];
												if (var71.startsWith(Class99.method391(0))
														|| var71.startsWith(Class99.method391(1)))
													var71 = var71.substring(7);

												Class2.anIntArray8[var5++] = Class1.method12(var71) ? 1 : 0;
												continue;
											}

											if (opc == 3624) {
												--var5;
												var21 = Class2.anIntArray8[var5];
												if ((client.aClass124_Sub9Array1609 != null)
														&& (var21 < Class103.anInt794)
														&& client.aClass124_Sub9Array1609[var21].aString1029
																.equalsIgnoreCase(
																		Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956)) {
													Class2.anIntArray8[var5++] = 1;
													continue;
												}

												Class2.anIntArray8[var5++] = 0;
												continue;
											}

											if (opc == 3625) {
												if (client.aString2210 != null) {
													var78 = Class2.aStringArray5;
													var22 = var6++;
													var60 = client.aString2210;
													var77 = Class61.method273(Class58.method269(var60));
													if (var77 == null)
														var77 = "";

													var78[var22] = var77;
												} else
													Class2.aStringArray5[var6++] = "";
												continue;
											}
										} else {
											int var88;
											if (opc < 4000) {
												if (opc == 3903) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21]
															.method455();
													continue;
												}

												if (opc == 3904) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21].anInt878;
													continue;
												}

												if (opc == 3905) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21].anInt881;
													continue;
												}

												if (opc == 3906) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21].anInt880;
													continue;
												}

												if (opc == 3907) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21].anInt882;
													continue;
												}

												if (opc == 3908) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = client.aClass125Array2259[var21].anInt879;
													continue;
												}

												if (opc == 3910) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var22 = client.aClass125Array2259[var21].method454();
													Class2.anIntArray8[var5++] = var22 == 0 ? 1 : 0;
													continue;
												}

												if (opc == 3911) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var22 = client.aClass125Array2259[var21].method454();
													Class2.anIntArray8[var5++] = var22 == 2 ? 1 : 0;
													continue;
												}

												if (opc == 3912) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var22 = client.aClass125Array2259[var21].method454();
													Class2.anIntArray8[var5++] = var22 == 5 ? 1 : 0;
													continue;
												}

												if (opc == 3913) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var22 = client.aClass125Array2259[var21].method454();
													Class2.anIntArray8[var5++] = var22 == 1 ? 1 : 0;
													continue;
												}

												boolean var102;
												if (opc == 3914) {
													--var5;
													var102 = Class2.anIntArray8[var5] == 1;
													if (null != Class37.aClass134_389)
														Class37.aClass134_389.method483(Class134.aComparator910,
																var102);
													continue;
												}

												if (opc == 3915) {
													--var5;
													var102 = Class2.anIntArray8[var5] == 1;
													if (Class37.aClass134_389 != null)
														Class37.aClass134_389.method483(Class134.aComparator908,
																var102);
													continue;
												}

												if (opc == 3916) {
													var5 -= 2;
													var102 = Class2.anIntArray8[var5] == 1;
													var74 = Class2.anIntArray8[var5 + 1] == 1;
													if (null != Class37.aClass134_389)
														Class37.aClass134_389.method483(new Class25(var74), var102);
													continue;
												}

												if (opc == 3917) {
													--var5;
													var102 = Class2.anIntArray8[var5] == 1;
													if (Class37.aClass134_389 != null)
														Class37.aClass134_389.method483(Class134.aComparator907,
																var102);
													continue;
												}

												if (opc == 3918) {
													--var5;
													var102 = Class2.anIntArray8[var5] == 1;
													if (Class37.aClass134_389 != null)
														Class37.aClass134_389.method483(Class134.aComparator911,
																var102);
													continue;
												}

												if (opc == 3919) {
													Class2.anIntArray8[var5++] = null == Class37.aClass134_389 ? 0
															: Class37.aClass134_389.aList909.size();
													continue;
												}

												Class120 var65;
												if (opc == 3920) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.anIntArray8[var5++] = var65.anInt851;
													continue;
												}

												if (opc == 3921) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.aStringArray5[var6++] = var65.method445();
													continue;
												}

												if (opc == 3922) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.aStringArray5[var6++] = var65.method446();
													continue;
												}

												if (opc == 3923) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													final long var30 = Class74.method316(1944752452)
															- Class124_Sub7.aLong1011 - var65.aLong849;
													var26 = (int) (var30 / 3600000L);
													var25 = (int) ((var30 - 3600000 * var26) / 60000L);
													var88 = (int) ((var30 - 3600000 * var26 - var25 * '\uea60')
															/ 1000L);
													final String var32 = var26 + ":" + (var25 / 10) + (var25 % 10) + ":"
															+ (var88 / 10) + (var88 % 10);
													Class2.aStringArray5[var6++] = var32;
													continue;
												}

												if (opc == 3924) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.anIntArray8[var5++] = var65.aClass125_850.anInt880;
													continue;
												}

												if (opc == 3925) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.anIntArray8[var5++] = var65.aClass125_850.anInt881;
													continue;
												}

												if (opc == 3926) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													var65 = (Class120) Class37.aClass134_389.aList909.get(var21);
													Class2.anIntArray8[var5++] = var65.aClass125_850.anInt878;
													continue;
												}
											} else if (opc < 4100) {
												if (opc == 4000) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 + var22;
													continue;
												}

												if (opc == 4001) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 - var22;
													continue;
												}

												if (opc == 4002) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 * var22;
													continue;
												}

												if (opc == 4003) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 / var22;
													continue;
												}

												if (opc == 4004) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = (int) (Math.random() * var21);
													continue;
												}

												if (opc == 4005) {
													--var5;
													var21 = Class2.anIntArray8[var5];
													Class2.anIntArray8[var5++] = (int) (Math.random() * (var21 + 1));
													continue;
												}

												if (opc == 4006) {
													var5 -= 5;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													var70 = Class2.anIntArray8[2 + var5];
													var19 = Class2.anIntArray8[3 + var5];
													var26 = Class2.anIntArray8[4 + var5];
													Class2.anIntArray8[var5++] = var21
															+ (((var26 - var70) * (var22 - var21)) / (var19 - var70));
													continue;
												}

												if (opc == 4007) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													Class2.anIntArray8[var5++] = var21 + ((var22 * var21) / 100);
													continue;
												}

												if (opc == 4008) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													Class2.anIntArray8[var5++] = var21 | (1 << var22);
													continue;
												}

												if (opc == 4009) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													Class2.anIntArray8[var5++] = var21 & (-1 - (1 << var22));
													continue;
												}

												if (opc == 4010) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = (var21 & (1 << var22)) != 0 ? 1 : 0;
													continue;
												}

												if (opc == 4011) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 % var22;
													continue;
												}

												if (opc == 4012) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													if (var21 == 0)
														Class2.anIntArray8[var5++] = 0;
													else
														Class2.anIntArray8[var5++] = (int) Math.pow(var21, var22);
													continue;
												}

												if (opc == 4013) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													if (var21 == 0)
														Class2.anIntArray8[var5++] = 0;
													else if (var22 == 0)
														Class2.anIntArray8[var5++] = Integer.MAX_VALUE;
													else
														Class2.anIntArray8[var5++] = (int) Math.pow(var21,
																1.0D / var22);
													continue;
												}

												if (opc == 4014) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[1 + var5];
													Class2.anIntArray8[var5++] = var21 & var22;
													continue;
												}

												if (opc == 4015) {
													var5 -= 2;
													var21 = Class2.anIntArray8[var5];
													var22 = Class2.anIntArray8[var5 + 1];
													Class2.anIntArray8[var5++] = var21 | var22;
													continue;
												}
											} else {
												int var34;
												int var35;
												int var37;
												if (opc < 4200) {
													if (opc == 4100) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														Class2.aStringArray5[var6++] = var71 + var22;
														continue;
													}

													if (opc == 4101) {
														var6 -= 2;
														var71 = Class2.aStringArray5[var6];
														var58 = Class2.aStringArray5[var6 + 1];
														Class2.aStringArray5[var6++] = var71 + var58;
														continue;
													}

													if (opc == 4102) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														var59 = Class2.aStringArray5;
														var19 = var6++;
														if (var22 < 0)
															var83 = Integer.toString(var22);
														else {
															var29 = var22;
															String var33;
															if (var22 < 0)
																var33 = Integer.toString(var22, 10);
															else {
																var34 = 2;

																for (var35 = var22 / 10; var35 != 0; ++var34)
																	var35 /= 10;

																final char[] var36 = new char[var34];
																var36[0] = 43;

																for (var37 = var34 - 1; var37 > 0; --var37) {
																	final int var38 = var29;
																	var29 /= 10;
																	final int var39 = var38 - (var29 * 10);
																	if (var39 >= 10)
																		var36[var37] = (char) (87 + var39);
																	else
																		var36[var37] = (char) (48 + var39);
																}

																var33 = new String(var36);
															}

															var83 = var33;
														}

														var59[var19] = var71 + var83;
														continue;
													}

													if (opc == 4103) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														Class2.aStringArray5[var6++] = var71.toLowerCase();
														continue;
													}

													if (opc == 4104) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														final long var40 = 86400000L * (11745L + var21);
														Class2.aCalendar9.setTime(new Date(var40));
														var19 = Class2.aCalendar9.get(5);
														var26 = Class2.aCalendar9.get(2);
														var25 = Class2.aCalendar9.get(1);
														Class2.aStringArray5[var6++] = var19 + "-"
																+ Class2.aStringArray13[var26] + "-" + var25;
														continue;
													}

													if (opc == 4105) {
														var6 -= 2;
														var71 = Class2.aStringArray5[var6];
														var58 = Class2.aStringArray5[1 + var6];
														if ((Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943 != null)
																&& Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943.aBool779) {
															Class2.aStringArray5[var6++] = var58;
															continue;
														}

														Class2.aStringArray5[var6++] = var71;
														continue;
													}

													if (opc == 4106) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.aStringArray5[var6++] = Integer.toString(var21);
														continue;
													}

													if (opc == 4107) {
														var6 -= 2;
														final int[] var99 = Class2.anIntArray8;
														var22 = var5++;
														var19 = Class50.method242(Class2.aStringArray5[var6],
																Class2.aStringArray5[1 + var6], client.anInt2058);
														if (var19 > 0)
															var93 = 1;
														else if (var19 < 0)
															var93 = -1;
														else
															var93 = 0;

														var99[var22] = var93;
														continue;
													}

													byte[] var64;
													Somet1 var85;
													if (opc == 4108) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														var5 -= 2;
														var22 = Class2.anIntArray8[var5];
														var70 = Class2.anIntArray8[1 + var5];
														var64 = Class25.aClass94_Sub1_279.decode(var70, 0);
														var85 = new Somet1(var64);
														Class2.anIntArray8[var5++] = var85.method1034(var71, var22);
														continue;
													}

													if (opc == 4109) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														var5 -= 2;
														var22 = Class2.anIntArray8[var5];
														var70 = Class2.anIntArray8[var5 + 1];
														var64 = Class25.aClass94_Sub1_279.decode(var70, 0);
														var85 = new Somet1(var64);
														Class2.anIntArray8[var5++] = var85.method1019(var71, var22);
														continue;
													}

													if (opc == 4110) {
														var6 -= 2;
														var71 = Class2.aStringArray5[var6];
														var58 = Class2.aStringArray5[var6 + 1];
														--var5;
														if (Class2.anIntArray8[var5] == 1)
															Class2.aStringArray5[var6++] = var71;
														else
															Class2.aStringArray5[var6++] = var58;
														continue;
													}

													if (opc == 4111) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														Class2.aStringArray5[var6++] = Class124_Sub22_Sub16_Sub4
																.method1031(var71);
														continue;
													}

													if (opc == 4112) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														Class2.aStringArray5[var6++] = var71 + (char) var22;
														continue;
													}

													char var91;
													if (opc == 4113) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														var52 = Class2.anIntArray8;
														var70 = var5++;
														var91 = (char) var21;
														if ((var91 >= 32) && (var91 <= 126))
															var72 = true;
														else if ((var91 >= 160) && (var91 <= 255))
															var72 = true;
														else if ((var91 != 8364) && (var91 != 338) && (var91 != 8212)
																&& (var91 != 339) && (var91 != 376))
															var72 = false;
														else
															var72 = true;

														var52[var70] = var72 ? 1 : 0;
														continue;
													}

													if (opc == 4114) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Def16
																.method671((char) var21) ? 1 : 0;
														continue;
													}

													if (opc == 4115) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Class65.method289((char) var21) ? 1
																: 0;
														continue;
													}

													if (opc == 4116) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Class55.method263((char) var21) ? 1
																: 0;
														continue;
													}

													if (opc == 4117) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														if (var71 != null)
															Class2.anIntArray8[var5++] = var71.length();
														else
															Class2.anIntArray8[var5++] = 0;
														continue;
													}

													if (opc == 4118) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														var5 -= 2;
														var22 = Class2.anIntArray8[var5];
														var70 = Class2.anIntArray8[var5 + 1];
														Class2.aStringArray5[var6++] = var71.substring(var22, var70);
														continue;
													}

													if (opc == 4119) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														final StringBuilder var75 = new StringBuilder(var71.length());
														var23 = false;

														for (var19 = 0; var19 < var71.length(); ++var19) {
															var91 = var71.charAt(var19);
															if (var91 == 60)
																var23 = true;
															else if (var91 == 62)
																var23 = false;
															else if (!var23)
																var75.append(var91);
														}

														Class2.aStringArray5[var6++] = var75.toString();
														continue;
													}

													if (opc == 4120) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = var71.indexOf(var22);
														continue;
													}

													if (opc == 4121) {
														var6 -= 2;
														var71 = Class2.aStringArray5[var6];
														var58 = Class2.aStringArray5[1 + var6];
														--var5;
														var70 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = var71.indexOf(var58, var70);
														continue;
													}
												} else if (opc < 4300) {
													if (opc == 4200) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.aStringArray5[var6++] = Def10
																.method724(var21).aString1472;
														continue;
													}

													Def10 var62;
													if (opc == 4201) {
														var5 -= 2;
														var21 = Class2.anIntArray8[var5];
														var22 = Class2.anIntArray8[1 + var5];
														var62 = Def10.method724(var21);
														if ((var22 >= 1) && (var22 <= 5)
																&& (var62.aStringArray1479[var22 - 1] != null)) {
															Class2.aStringArray5[var6++] = var62.aStringArray1479[var22
																	- 1];
															continue;
														}

														Class2.aStringArray5[var6++] = "";
														continue;
													}

													if (opc == 4202) {
														var5 -= 2;
														var21 = Class2.anIntArray8[var5];
														var22 = Class2.anIntArray8[1 + var5];
														var62 = Def10.method724(var21);
														if ((var22 >= 1) && (var22 <= 5)
																&& (null != var62.aStringArray1488[var22 - 1])) {
															Class2.aStringArray5[var6++] = var62.aStringArray1488[var22
																	- 1];
															continue;
														}

														Class2.aStringArray5[var6++] = "";
														continue;
													}

													if (opc == 4203) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Def10
																.method724(var21).anInt1458;
														continue;
													}

													if (opc == 4204) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Def10
																.method724(var21).anInt1480 == 1 ? 1 : 0;
														continue;
													}

													Def10 var79;
													if (opc == 4205) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														var79 = Def10.method724(var21);
														if ((var79.anInt1495 == -1) && (var79.anInt1506 >= 0)) {
															Class2.anIntArray8[var5++] = var79.anInt1506;
															continue;
														}

														Class2.anIntArray8[var5++] = var21;
														continue;
													}

													if (opc == 4206) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														var79 = Def10.method724(var21);
														if ((var79.anInt1495 >= 0) && (var79.anInt1506 >= 0)) {
															Class2.anIntArray8[var5++] = var79.anInt1506;
															continue;
														}

														Class2.anIntArray8[var5++] = var21;
														continue;
													}

													if (opc == 4207) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Def10
																.method724(var21).aBool1478 ? 1 : 0;
														continue;
													}

													if (opc == 4210) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														var72 = var22 == 1;
														var18 = var71.toLowerCase();
														short[] var86 = new short[16];
														var25 = 0;
														var88 = 0;

														while (true) {
															if (var88 >= RuntimeException_Sub1.anInt1914) {
																Class124_Sub22_Sub19_Sub6.aShortArray1823 = var86;
																Class69.anInt580 = 0;
																Class35.anInt374 = var25;
																final String[] var100 = new String[Class35.anInt374];

																for (var29 = 0; var29 < Class35.anInt374; ++var29)
																	var100[var29] = Def10
																			.method724(var86[var29]).aString1472;

																final short[] var96 = Class124_Sub22_Sub19_Sub6.aShortArray1823;
																Def1.method662(var100, var96, 0,
																		var100.length - 1);
																break;
															}

															final Def10 var95 = Def10
																	.method724(var88);
															if ((!var72 || var95.aBool1502) && (var95.anInt1495 == -1)
																	&& (var95.aString1472.toLowerCase()
																			.indexOf(var18) != -1)) {
																if (var25 >= 250) {
																	Class35.anInt374 = -1;
																	Class124_Sub22_Sub19_Sub6.aShortArray1823 = null;
																	break;
																}

																if (var25 >= var86.length) {
																	final short[] var42 = new short[var86.length * 2];

																	for (var35 = 0; var35 < var25; ++var35)
																		var42[var35] = var86[var35];

																	var86 = var42;
																}

																var86[var25++] = (short) var88;
															}

															++var88;
														}

														Class2.anIntArray8[var5++] = Class35.anInt374;
														continue;
													}

													if (opc == 4211) {
														if ((Class124_Sub22_Sub19_Sub6.aShortArray1823 != null)
																&& (Class69.anInt580 < Class35.anInt374)) {
															Class2.anIntArray8[var5++] = Class124_Sub22_Sub19_Sub6.aShortArray1823[++Class69.anInt580
																	- 1] & '\uffff';
															continue;
														}

														Class2.anIntArray8[var5++] = -1;
														continue;
													}

													if (opc == 4212) {
														Class69.anInt580 = 0;
														continue;
													}
												} else if (opc < 5100) {
													if (opc == 5000) {
														Class2.anIntArray8[var5++] = client.anInt2066;
														continue;
													}

													if (opc == 5001) {
														var5 -= 3;
														client.anInt2066 = Class2.anIntArray8[var5];
														Class32.aClass53_337 = Class62
																.method278(Class2.anIntArray8[var5 + 1], (short) 128);
														if (Class32.aClass53_337 == null)
															Class32.aClass53_337 = Class53.aClass53_492;

														client.anInt2201 = Class2.anIntArray8[var5 + 2];
														client.secbuf.writeOpcode(68); // public / social setting
														client.secbuf.writeByte(client.anInt2066);
														client.secbuf
																.writeByte(Class32.aClass53_337.anInt491);
														client.secbuf.writeByte(client.anInt2201);
														continue;
													}

													if (opc == 5002) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														var5 -= 2;
														var22 = Class2.anIntArray8[var5];
														var70 = Class2.anIntArray8[1 + var5];
														client.secbuf.writeOpcode(219); // write string ?
														client.secbuf
																.writeByte(Class54.len(var71) + 2);
														client.secbuf.writestr(var71);
														client.secbuf.writeByte(var22 - 1);
														client.secbuf.writeByte(var70);
														continue;
													}

													if (opc == 5003) {
														var5 -= 2;
														var21 = Class2.anIntArray8[var5];
														var22 = Class2.anIntArray8[1 + var5];
														final Class5 var67 = (Class5) Class47.aMap471
																.get(Integer.valueOf(var21));
														final Class124_Sub22_Sub5 var68 = var67.method25(var22);
														if (null != var68) {
															Class2.anIntArray8[var5++] = var68.anInt1383;
															Class2.anIntArray8[var5++] = var68.anInt1377;
															Class2.aStringArray5[var6++] = var68.aString1379 != null
																	? var68.aString1379 : "";
															Class2.aStringArray5[var6++] = null != var68.aString1380
																	? var68.aString1380 : "";
															Class2.aStringArray5[var6++] = null != var68.aString1382
																	? var68.aString1382 : "";
														} else {
															Class2.anIntArray8[var5++] = -1;
															Class2.anIntArray8[var5++] = 0;
															Class2.aStringArray5[var6++] = "";
															Class2.aStringArray5[var6++] = "";
															Class2.aStringArray5[var6++] = "";
														}
														continue;
													}

													if (opc == 5004) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														final Class124_Sub22_Sub5 var80 = (Class124_Sub22_Sub5) Class47.aClass116_474
																.method438(var21);
														if (null != var80) {
															Class2.anIntArray8[var5++] = var80.anInt1378;
															Class2.anIntArray8[var5++] = var80.anInt1377;
															Class2.aStringArray5[var6++] = null != var80.aString1379
																	? var80.aString1379 : "";
															Class2.aStringArray5[var6++] = null != var80.aString1380
																	? var80.aString1380 : "";
															Class2.aStringArray5[var6++] = null != var80.aString1382
																	? var80.aString1382 : "";
														} else {
															Class2.anIntArray8[var5++] = -1;
															Class2.anIntArray8[var5++] = 0;
															Class2.aStringArray5[var6++] = "";
															Class2.aStringArray5[var6++] = "";
															Class2.aStringArray5[var6++] = "";
														}
														continue;
													}

													if (opc == 5005) {
														if (null == Class32.aClass53_337)
															Class2.anIntArray8[var5++] = -1;
														else
															Class2.anIntArray8[var5++] = Class32.aClass53_337.anInt491;
														continue;
													}

													if (opc == 5008) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														--var5;
														var22 = Class2.anIntArray8[var5];
														var18 = var71.toLowerCase();
														byte var84 = 0;
														if (var18.startsWith("yellow:")) {
															var84 = 0;
															var71 = var71.substring("yellow:".length());
														} else if (var18.startsWith("red:")) {
															var84 = 1;
															var71 = var71.substring("red:".length());
														} else if (var18.startsWith("green:")) {
															var84 = 2;
															var71 = var71.substring("green:".length());
														} else if (var18.startsWith("cyan:")) {
															var84 = 3;
															var71 = var71.substring("cyan:".length());
														} else if (var18.startsWith("purple:")) {
															var84 = 4;
															var71 = var71.substring("purple:".length());
														} else if (var18.startsWith("white:")) {
															var84 = 5;
															var71 = var71.substring("white:".length());
														} else if (var18.startsWith("flash1:")) {
															var84 = 6;
															var71 = var71.substring("flash1:".length());
														} else if (var18.startsWith("flash2:")) {
															var84 = 7;
															var71 = var71.substring("flash2:".length());
														} else if (var18.startsWith("flash3:")) {
															var84 = 8;
															var71 = var71.substring("flash3:".length());
														} else if (var18.startsWith("glow1:")) {
															var84 = 9;
															var71 = var71.substring("glow1:".length());
														} else if (var18.startsWith("glow2:")) {
															var84 = 10;
															var71 = var71.substring("glow2:".length());
														} else if (var18.startsWith("glow3:")) {
															var84 = 11;
															var71 = var71.substring("glow3:".length());
														} else if (client.anInt2058 != 0)
															if (var18.startsWith("yellow:")) {
																var84 = 0;
																var71 = var71.substring("yellow:".length());
															} else if (var18.startsWith("red:")) {
																var84 = 1;
																var71 = var71.substring("red:".length());
															} else if (var18.startsWith("green:")) {
																var84 = 2;
																var71 = var71.substring("green:".length());
															} else if (var18.startsWith("cyan:")) {
																var84 = 3;
																var71 = var71.substring("cyan:".length());
															} else if (var18.startsWith("purple:")) {
																var84 = 4;
																var71 = var71.substring("purple:".length());
															} else if (var18.startsWith("white:")) {
																var84 = 5;
																var71 = var71.substring("white:".length());
															} else if (var18.startsWith("flash1:")) {
																var84 = 6;
																var71 = var71.substring("flash1:".length());
															} else if (var18.startsWith("flash2:")) {
																var84 = 7;
																var71 = var71.substring("flash2:".length());
															} else if (var18.startsWith("flash3:")) {
																var84 = 8;
																var71 = var71.substring("flash3:".length());
															} else if (var18.startsWith("glow1:")) {
																var84 = 9;
																var71 = var71.substring("glow1:".length());
															} else if (var18.startsWith("glow2:")) {
																var84 = 10;
																var71 = var71.substring("glow2:".length());
															} else if (var18.startsWith("glow3:")) {
																var84 = 11;
																var71 = var71.substring("glow3:".length());
															}

														var18 = var71.toLowerCase();
														byte var94 = 0;
														if (var18.startsWith("wave:")) {
															var94 = 1;
															var71 = var71.substring("wave:".length());
														} else if (var18.startsWith("wave2:")) {
															var94 = 2;
															var71 = var71.substring("wave2:".length());
														} else if (var18.startsWith("shake:")) {
															var94 = 3;
															var71 = var71.substring("shake:".length());
														} else if (var18.startsWith("scroll:")) {
															var94 = 4;
															var71 = var71.substring("scroll:".length());
														} else if (var18.startsWith("slide:")) {
															var94 = 5;
															var71 = var71.substring("slide:".length());
														} else if (client.anInt2058 != 0)
															if (var18.startsWith("wave:")) {
																var94 = 1;
																var71 = var71.substring("wave:".length());
															} else if (var18.startsWith("wave2:")) {
																var94 = 2;
																var71 = var71.substring("wave2:".length());
															} else if (var18.startsWith("shake:")) {
																var94 = 3;
																var71 = var71.substring("shake:".length());
															} else if (var18.startsWith("scroll:")) {
																var94 = 4;
																var71 = var71.substring("scroll:".length());
															} else if (var18.startsWith("slide:")) {
																var94 = 5;
																var71 = var71.substring("slide:".length());
															}

														client.secbuf.writeOpcode(223); // public chat
														client.secbuf.writeByte(0);
														var25 = client.secbuf.pos;
														client.secbuf.writeByte(var22);
														client.secbuf.writeByte(var84);
														client.secbuf.writeByte(var94);
														final Outbuf var101 = client.secbuf;
														var29 = var101.pos;
														var35 = var71.length();
														final byte[] var104 = new byte[var35];

														for (var37 = 0; var37 < var35; ++var37) {
															final char var105 = var71.charAt(var37);
															if (((var105 <= 0) || (var105 >= 128))
																	&& ((var105 < 160) || (var105 > 255))) {
																if (var105 == 8364)
																	var104[var37] = -128;
																else if (var105 == 8218)
																	var104[var37] = -126;
																else if (var105 == 402)
																	var104[var37] = -125;
																else if (var105 == 8222)
																	var104[var37] = -124;
																else if (var105 == 8230)
																	var104[var37] = -123;
																else if (var105 == 8224)
																	var104[var37] = -122;
																else if (var105 == 8225)
																	var104[var37] = -121;
																else if (var105 == 710)
																	var104[var37] = -120;
																else if (var105 == 8240)
																	var104[var37] = -119;
																else if (var105 == 352)
																	var104[var37] = -118;
																else if (var105 == 8249)
																	var104[var37] = -117;
																else if (var105 == 338)
																	var104[var37] = -116;
																else if (var105 == 381)
																	var104[var37] = -114;
																else if (var105 == 8216)
																	var104[var37] = -111;
																else if (var105 == 8217)
																	var104[var37] = -110;
																else if (var105 == 8220)
																	var104[var37] = -109;
																else if (var105 == 8221)
																	var104[var37] = -108;
																else if (var105 == 8226)
																	var104[var37] = -107;
																else if (var105 == 8211)
																	var104[var37] = -106;
																else if (var105 == 8212)
																	var104[var37] = -105;
																else if (var105 == 732)
																	var104[var37] = -104;
																else if (var105 == 8482)
																	var104[var37] = -103;
																else if (var105 == 353)
																	var104[var37] = -102;
																else if (var105 == 8250)
																	var104[var37] = -101;
																else if (var105 == 339)
																	var104[var37] = -100;
																else if (var105 == 382)
																	var104[var37] = -98;
																else if (var105 == 376)
																	var104[var37] = -97;
																else
																	var104[var37] = 63;
															} else
																var104[var37] = (byte) var105;
														}

														var101.writeSmart(var104.length);
														var101.pos += Class129.aClass63_889.method284(var104, 0,
																var104.length, var101.backing, var101.pos);
														client.secbuf.endByteSize(
																client.secbuf.pos - var25);
														continue;
													}

													if (opc == 5009) {
														var6 -= 2;
														var71 = Class2.aStringArray5[var6];
														var58 = Class2.aStringArray5[1 + var6];
														client.secbuf.writeOpcode(123); // send pm
														client.secbuf.writeShort(0);
														var70 = client.secbuf.pos;
														client.secbuf.writestr(var71);
														final Outbuf var66 = client.secbuf;
														var26 = var66.pos;
														var88 = var58.length();
														final byte[] var98 = new byte[var88];

														for (var34 = 0; var34 < var88; ++var34) {
															final char var103 = var58.charAt(var34);
															if (((var103 > 0) && (var103 < 128))
																	|| ((var103 >= 160) && (var103 <= 255)))
																var98[var34] = (byte) var103;
															else if (var103 == 8364)
																var98[var34] = -128;
															else if (var103 == 8218)
																var98[var34] = -126;
															else if (var103 == 402)
																var98[var34] = -125;
															else if (var103 == 8222)
																var98[var34] = -124;
															else if (var103 == 8230)
																var98[var34] = -123;
															else if (var103 == 8224)
																var98[var34] = -122;
															else if (var103 == 8225)
																var98[var34] = -121;
															else if (var103 == 710)
																var98[var34] = -120;
															else if (var103 == 8240)
																var98[var34] = -119;
															else if (var103 == 352)
																var98[var34] = -118;
															else if (var103 == 8249)
																var98[var34] = -117;
															else if (var103 == 338)
																var98[var34] = -116;
															else if (var103 == 381)
																var98[var34] = -114;
															else if (var103 == 8216)
																var98[var34] = -111;
															else if (var103 == 8217)
																var98[var34] = -110;
															else if (var103 == 8220)
																var98[var34] = -109;
															else if (var103 == 8221)
																var98[var34] = -108;
															else if (var103 == 8226)
																var98[var34] = -107;
															else if (var103 == 8211)
																var98[var34] = -106;
															else if (var103 == 8212)
																var98[var34] = -105;
															else if (var103 == 732)
																var98[var34] = -104;
															else if (var103 == 8482)
																var98[var34] = -103;
															else if (var103 == 353)
																var98[var34] = -102;
															else if (var103 == 8250)
																var98[var34] = -101;
															else if (var103 == 339)
																var98[var34] = -100;
															else if (var103 == 382)
																var98[var34] = -98;
															else if (var103 == 376)
																var98[var34] = -97;
															else
																var98[var34] = 63;
														}

														var66.writeSmart(var98.length);
														var66.pos += Class129.aClass63_889.method284(var98, 0,
																var98.length, var66.backing, var66.pos);
														client.secbuf.endShortSize(
																client.secbuf.pos - var70);
														continue;
													}

													if (opc == 5015) {
														if ((null != Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246)
																&& (null != Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
															var71 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956;
														else
															var71 = "";

														Class2.aStringArray5[var6++] = var71;
														continue;
													}

													if (opc == 5016) {
														Class2.anIntArray8[var5++] = client.anInt2201;
														continue;
													}

													if (opc == 5017) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														var52 = Class2.anIntArray8;
														var70 = var5++;
														final Class5 var89 = (Class5) Class47.aMap471
																.get(Integer.valueOf(var21));
														if (null == var89)
															var19 = 0;
														else
															var19 = var89.method26();

														var52[var70] = var19;
														continue;
													}

													if (opc == 5018) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Class124_Sub5.method513(var21,
																(byte) 100);
														continue;
													}

													if (opc == 5019) {
														--var5;
														var21 = Class2.anIntArray8[var5];
														Class2.anIntArray8[var5++] = Class22.method150(var21);
														continue;
													}

													if (opc == 5020) {
														--var6;
														var71 = Class2.aStringArray5[var6];
														if (var71.equalsIgnoreCase("toggleroof")) {
															Class57.aClass22_538.aBool248 = !Class57.aClass22_538.aBool248;
															Class62.method281();
															if (Class57.aClass22_538.aBool248)
																Class20.method95(99, "", "Roofs are now all hidden");
															else
																Class20.method95(99, "",
																		"Roofs will only be removed selectively");
														}

														if (var71.equalsIgnoreCase("displayfps"))
															client.aBool2000 = !client.aBool2000;

														if (client.anInt2149 >= 2) {
															if (var71.equalsIgnoreCase("fpson"))
																client.aBool2000 = true;

															if (var71.equalsIgnoreCase("fpsoff"))
																client.aBool2000 = false;

															if (var71.equalsIgnoreCase("gc"))
																System.gc();

															if (var71.equalsIgnoreCase("clientdrop"))
																Class10.method60();

															if (var71.equalsIgnoreCase("errortest")
																	&& (client.anInt2080 == 2))
																throw new RuntimeException();
														}

														client.secbuf.writeOpcode(188); // command aka ::item 
														client.secbuf.writeByte(var71.length() + 1);
														client.secbuf.writestr(var71);
														continue;
													}

													if (opc == 5021) {
														--var6;
														client.aString2202 = Class2.aStringArray5[var6].toLowerCase()
																.trim();
														continue;
													}

													if (opc == 5022) {
														Class2.aStringArray5[var6++] = client.aString2202;
														continue;
													}
												}
											}
										}
									}
								} else {
									if (opc >= 2000) {
										opc -= 1000;
										--var5;
										wid = Class10.method55(Class2.anIntArray8[var5]);
									} else
										wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

									if (opc == 1300) {
										--var5;
										var22 = Class2.anIntArray8[var5] - 1;
										if ((var22 >= 0) && (var22 <= 9)) {
											--var6;
											wid.method628(var22, Class2.aStringArray5[var6]);
											continue;
										}

										--var6;
										continue;
									}

									if (opc == 1301) {
										var5 -= 2;
										var22 = Class2.anIntArray8[var5];
										var70 = Class2.anIntArray8[var5 + 1];
										wid.aClass124_Sub17_1251 = RuntimeException_Sub1.method1010(var22, var70,
												172659367);
										continue;
									}

									if (opc == 1302) {
										--var5;
										wid.aBool1153 = Class2.anIntArray8[var5] == 1;
										continue;
									}

									if (opc == 1303) {
										--var5;
										wid.anInt1227 = Class2.anIntArray8[var5];
										continue;
									}

									if (opc == 1304) {
										--var5;
										wid.anInt1228 = Class2.anIntArray8[var5];
										continue;
									}

									if (opc == 1305) {
										--var6;
										wid.aString1224 = Class2.aStringArray5[var6];
										continue;
									}

									if (opc == 1306) {
										--var6;
										wid.aString1230 = Class2.aStringArray5[var6];
										continue;
									}

									if (opc == 1307) {
										wid.aStringArray1225 = null;
										continue;
									}
								}
							} else {
								if (opc >= 2000) {
									opc -= 1000;
									--var5;
									wid = Class10.method55(Class2.anIntArray8[var5]);
								} else
									wid = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

								Def10.settrue(wid);
								if ((opc == 1200) || (opc == 1205) || (opc == 1212)) {
									var5 -= 2;
									var22 = Class2.anIntArray8[var5];
									var70 = Class2.anIntArray8[1 + var5];
									wid.anInt1271 = var22;
									wid.anInt1272 = var70;
									final Def10 var20 = Def10.method724(var22);
									wid.anInt1202 = var20.anInt1500;
									wid.anInt1203 = var20.anInt1474;
									wid.anInt1204 = var20.anInt1473;
									wid.anInt1200 = var20.anInt1477;
									wid.anInt1201 = var20.anInt1475;
									wid.anInt1205 = var20.anInt1470;
									if (opc == 1205)
										wid.anInt1209 = 0;
									else if ((opc == 1212) | (var20.anInt1480 == 1))
										wid.anInt1209 = 1;
									else
										wid.anInt1209 = 2;

									if (wid.anInt1206 > 0)
										wid.anInt1205 = (wid.anInt1205 * 32) / wid.anInt1206;
									else if (wid.anInt1257 > 0)
										wid.anInt1205 = (wid.anInt1205 * 32) / wid.anInt1257;
									continue;
								}

								if (opc == 1201) {
									wid.anInt1229 = 2;
									--var5;
									wid.anInt1197 = Class2.anIntArray8[var5];
									continue;
								}

								if (opc == 1202) {
									wid.anInt1229 = 3;
									wid.anInt1197 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943
											.method401();
									continue;
								}
							}
						} else {
							var21 = -1;
							if (opc >= 2000) {
								opc -= 1000;
								--var5;
								var21 = Class2.anIntArray8[var5];
								var17 = Class10.method55(var21);
							} else
								var17 = var55 ? Class129.aClass124_Sub17_888 : Class29.aClass124_Sub17_314;

							if (opc == 1000) {
								var5 -= 4;
								var17.anInt1216 = Class2.anIntArray8[var5];
								var17.anInt1163 = Class2.anIntArray8[var5 + 1];
								var17.anInt1158 = Class2.anIntArray8[2 + var5];
								var17.anInt1148 = Class2.anIntArray8[3 + var5];
								Def10.settrue(var17);
								Class64.method286(var17);
								if ((var21 != -1) && (var17.anInt1191 == 0))
									Somet2.method831(
											Def10.widgets[var21 >> 16], var17,
											false);
								continue;
							}

							if (opc == 1001) {
								var5 -= 4;
								var17.anInt1257 = Class2.anIntArray8[var5];
								var17.anInt1165 = Class2.anIntArray8[1 + var5];
								var17.anInt1210 = Class2.anIntArray8[2 + var5];
								var17.anInt1161 = Class2.anIntArray8[var5 + 3];
								Def10.settrue(var17);
								Class64.method286(var17);
								if ((var21 != -1) && (var17.anInt1191 == 0))
									Somet2.method831(
											Def10.widgets[var21 >> 16], var17,
											false);
								continue;
							}

							if (opc == 1003) {
								--var5;
								var23 = Class2.anIntArray8[var5] == 1;
								if (var17.aBool1173 != var23) {
									var17.aBool1173 = var23;
									Def10.settrue(var17);
								}
								continue;
							}

							if (opc == 1005) {
								--var5;
								var17.aBool1260 = Class2.anIntArray8[var5] == 1;
								continue;
							}

							if (opc == 1006) {
								--var5;
								var17.aBool1285 = Class2.anIntArray8[var5] == 1;
								continue;
							}
						}
					}

					if (opc < 5400) {
						if (opc == 5306) {
							Class2.anIntArray8[var5++] = Class34.method187();
							continue;
						}

						if (opc == 5307) {
							--var5;
							var21 = Class2.anIntArray8[var5];
							if ((var21 == 1) || (var21 == 2))
								Def13.method735(var21);
							continue;
						}

						if (opc == 5308) {
							Class2.anIntArray8[var5++] = Class57.aClass22_538.anInt250;
							continue;
						}

						if (opc == 5309) {
							--var5;
							var21 = Class2.anIntArray8[var5];
							if ((var21 == 1) || (var21 == 2)) {
								Class57.aClass22_538.anInt250 = var21;
								Class62.method281();
							}
							continue;
						}
					}

					if ((opc < 5600) && (opc == 5504)) {
						var5 -= 2;
						var21 = Class2.anIntArray8[var5];
						var22 = Class2.anIntArray8[var5 + 1];
						if (!client.aBool2231) {
							client.anInt2076 = var21;
							client.anInt2255 = var22;
						}
					} else if ((opc < 5700) && (opc == 5630))
						client.anInt2034 = 250;
					else {
						if (opc < 6300) {
							if (opc == 6200) {
								var5 -= 2;
								client.aShort2237 = (short) Class2.anIntArray8[var5];
								if (client.aShort2237 <= 0)
									client.aShort2237 = 256;

								client.aShort2031 = (short) Class2.anIntArray8[var5 + 1];
								if (client.aShort2031 <= 0)
									client.aShort2031 = 205;
								continue;
							}

							if (opc == 6201) {
								var5 -= 2;
								client.aShort2180 = (short) Class2.anIntArray8[var5];
								if (client.aShort2180 <= 0)
									client.aShort2180 = 256;

								client.aShort2091 = (short) Class2.anIntArray8[1 + var5];
								if (client.aShort2091 <= 0)
									client.aShort2091 = 320;
								continue;
							}

							if (opc == 6202) {
								var5 -= 4;
								client.aShort2251 = (short) Class2.anIntArray8[var5];
								if (client.aShort2251 <= 0)
									client.aShort2251 = 1;

								client.aShort2242 = (short) Class2.anIntArray8[1 + var5];
								if (client.aShort2242 <= 0)
									client.aShort2242 = 32767;
								else if (client.aShort2242 < client.aShort2251)
									client.aShort2242 = client.aShort2251;

								client.aShort2234 = (short) Class2.anIntArray8[2 + var5];
								if (client.aShort2234 <= 0)
									client.aShort2234 = 1;

								client.aShort2007 = (short) Class2.anIntArray8[var5 + 3];
								if (client.aShort2007 <= 0)
									client.aShort2007 = 32767;
								else if (client.aShort2007 < client.aShort2234)
									client.aShort2007 = client.aShort2234;
								continue;
							}

							if (opc == 6203) {
								if (client.aClass124_Sub17_2154 != null) {
									method677(0, 0, client.aClass124_Sub17_2154.anInt1168,
											client.aClass124_Sub17_2154.anInt1169, false);
									Class2.anIntArray8[var5++] = client.anInt2247;
									Class2.anIntArray8[var5++] = client.anInt2248;
								} else {
									Class2.anIntArray8[var5++] = -1;
									Class2.anIntArray8[var5++] = -1;
								}
								continue;
							}

							if (opc == 6204) {
								Class2.anIntArray8[var5++] = client.aShort2180;
								Class2.anIntArray8[var5++] = client.aShort2091;
								continue;
							}

							if (opc == 6205) {
								Class2.anIntArray8[var5++] = client.aShort2237;
								Class2.anIntArray8[var5++] = client.aShort2031;
								continue;
							}
						}

						if (opc < 6600) {
							if (opc == 6500) {
								Class2.anIntArray8[var5++] = Class96.method387() ? 1 : 0;
								continue;
							}

							Class23 var106;
							if (opc == 6501) {
								Class23.anInt258 = 0;
								var106 = Class63.method283();
								if (null != var106) {
									Class2.anIntArray8[var5++] = var106.anInt262;
									Class2.anIntArray8[var5++] = var106.anInt255;
									Class2.aStringArray5[var6++] = var106.aString263;
									Class2.anIntArray8[var5++] = var106.anInt264;
									Class2.anIntArray8[var5++] = var106.anInt261;
									Class2.aStringArray5[var6++] = var106.aString254;
								} else {
									Class2.anIntArray8[var5++] = -1;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
									Class2.anIntArray8[var5++] = 0;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
								}
								continue;
							}

							if (opc == 6502) {
								var106 = Class63.method283();
								if (var106 != null) {
									Class2.anIntArray8[var5++] = var106.anInt262;
									Class2.anIntArray8[var5++] = var106.anInt255;
									Class2.aStringArray5[var6++] = var106.aString263;
									Class2.anIntArray8[var5++] = var106.anInt264;
									Class2.anIntArray8[var5++] = var106.anInt261;
									Class2.aStringArray5[var6++] = var106.aString254;
								} else {
									Class2.anIntArray8[var5++] = -1;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
									Class2.anIntArray8[var5++] = 0;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
								}
								continue;
							}

							Class23 var87;
							if (opc == 6506) {
								--var5;
								var21 = Class2.anIntArray8[var5];
								var87 = null;

								for (var70 = 0; var70 < Class23.anInt257; ++var70)
									if (Class23.aClass23Array256[var70].anInt262 == var21) {
										var87 = Class23.aClass23Array256[var70];
										break;
									}

								if (null != var87) {
									Class2.anIntArray8[var5++] = var87.anInt262;
									Class2.anIntArray8[var5++] = var87.anInt255;
									Class2.aStringArray5[var6++] = var87.aString263;
									Class2.anIntArray8[var5++] = var87.anInt264;
									Class2.anIntArray8[var5++] = var87.anInt261;
									Class2.aStringArray5[var6++] = var87.aString254;
								} else {
									Class2.anIntArray8[var5++] = -1;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
									Class2.anIntArray8[var5++] = 0;
									Class2.anIntArray8[var5++] = 0;
									Class2.aStringArray5[var6++] = "";
								}
								continue;
							}

							if (opc == 6507) {
								var5 -= 4;
								var21 = Class2.anIntArray8[var5];
								var74 = Class2.anIntArray8[var5 + 1] == 1;
								var70 = Class2.anIntArray8[2 + var5];
								var72 = Class2.anIntArray8[var5 + 3] == 1;
								Class124_Sub22_Sub19_Sub5.method956(var21, var74, var70, var72);
								continue;
							}

							if (opc == 6511) {
								--var5;
								var21 = Class2.anIntArray8[var5];
								if ((var21 >= 0) && (var21 < Class23.anInt257)) {
									var87 = Class23.aClass23Array256[var21];
									Class2.anIntArray8[var5++] = var87.anInt262;
									Class2.anIntArray8[var5++] = var87.anInt255;
									Class2.aStringArray5[var6++] = var87.aString263;
									Class2.anIntArray8[var5++] = var87.anInt264;
									Class2.anIntArray8[var5++] = var87.anInt261;
									Class2.aStringArray5[var6++] = var87.aString254;
									continue;
								}

								Class2.anIntArray8[var5++] = -1;
								Class2.anIntArray8[var5++] = 0;
								Class2.aStringArray5[var6++] = "";
								Class2.anIntArray8[var5++] = 0;
								Class2.anIntArray8[var5++] = 0;
								Class2.aStringArray5[var6++] = "";
								continue;
							}
						}

						throw new IllegalStateException();
					}
				}
			} catch (final Exception var47) {
				final StringBuilder var45 = new StringBuilder(30);
				var45.append("").append(var4.aLong874).append(" ");

				for (var13 = Class2.anInt10 - 1; var13 >= 0; --var13)
					var45.append("").append(Class2.aClass48Array11[var13].aClass124_Sub22_Sub18_477.aLong874)
							.append(" ");

				var45.append("").append(var10);
				Class28.method166(var45.toString(), var47);
			}
		}
	}

	Class124_Sub22_Sub5(final int var1, final String var2, final String var3, final String var4) {
		final int var5 = ++Class47.anInt470 - 1;
		anInt1383 = var5;
		anInt1377 = client.anInt2158;
		anInt1378 = var1;
		aString1379 = var2;
		aString1380 = var3;
		aString1382 = var4;
	}

	static final void method677(int var0, int var1, int var2, int var3, final boolean var4) {
		if (var2 < 1)
			var2 = 1;

		if (var3 < 1)
			var3 = 1;

		int var5 = var3 - 334;
		if (var5 < 0)
			var5 = 0;
		else if (var5 > 100)
			var5 = 100;

		int var8 = client.aShort2237 + ((var5 * (client.aShort2031 - client.aShort2237)) / 100);
		final int var7 = (var3 * var8 * 512) / (var2 * 334);
		int var9;
		int var10;
		short var15;
		if (var7 < client.aShort2234) {
			var15 = client.aShort2234;
			var8 = (334 * var2 * var15) / (512 * var3);
			if (var8 > client.aShort2242) {
				var8 = client.aShort2242;
				var9 = (512 * var3 * var8) / (var15 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					Class124_Sub22_Sub16.method763();
					Class124_Sub22_Sub16.method768(var0, var1, var10, var3, -16777216);
					Class124_Sub22_Sub16.method768((var2 + var0) - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= 2 * var10;
			}
		} else if (var7 > client.aShort2007) {
			var15 = client.aShort2007;
			var8 = (334 * var2 * var15) / (var3 * 512);
			if (var8 < client.aShort2251) {
				var8 = client.aShort2251;
				var9 = (var2 * var15 * 334) / (var8 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					Class124_Sub22_Sub16.method763();
					Class124_Sub22_Sub16.method768(var0, var1, var2, var10, -16777216);
					Class124_Sub22_Sub16.method768(var0, (var1 + var3) - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		var9 = ((var5 * (client.aShort2091 - client.aShort2180)) / 100) + client.aShort2180;
		client.anInt2249 = ((var3 * var8 * var9) / 85504) << 1;
		if ((var2 != client.anInt2247) || (var3 != client.anInt2248)) {
			final int[] var11 = new int[9];

			for (int var6 = 0; var6 < 9; ++var6) {
				final int var14 = (var6 * 32) + 128 + 15;
				final int var12 = 600 + (var14 * 3);
				final int var13 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var14];
				var11[var6] = (var12 * var13) >> 16;
			}

			Class21.method134(var11, 500, 800, var2, var3);
		}

		client.anInt2245 = var0;
		client.anInt2238 = var1;
		client.anInt2247 = var2;
		client.anInt2248 = var3;
	}
}
