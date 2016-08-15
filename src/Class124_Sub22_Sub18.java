import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

import netscape.javascript.JSObject;

public class Class124_Sub22_Sub18 extends Class124_Sub22 {
	int[] anIntArray1596;
	int anInt1597;
	String[] aStringArray1598;
	int anInt1599;
	int anInt1601;
	int anInt1602;
	int[] anIntArray1603;
	static Class94_Sub1 aClass94_Sub1_1604;
	static Class113 aClass113_1600 = new Class113(128);

	static void method831(final Class124_Sub17[] var0, final Class124_Sub17 var1, final boolean var2) {
		final int var5 = var1.anInt1176 != 0 ? var1.anInt1176 : var1.anInt1168;
		final int var4 = var1.anInt1177 != 0 ? var1.anInt1177 : var1.anInt1169;
		Class78.method325(var0, var1.anInt1284, var5, var4, var2);
		if (var1.aClass124_Sub17Array1263 != null)
			Class78.method325(var1.aClass124_Sub17Array1263, var1.anInt1284, var5, var4, var2);

		final Class124_Sub7 var3 = (Class124_Sub7) client.aClass107_2143.method409(var1.anInt1284);
		if (null != var3)
			Class122.method449(var3.anInt1012, var5, var4, var2);

		if (var1.anInt1157 == 1337)
			;

	}

	static final void method832() {
		if (client.anInt2001 > 1)
			--client.anInt2001;

		if (client.anInt2034 > 0)
			--client.anInt2034;

		if (client.aBool2115) {
			client.aBool2115 = false;
			Class10.method60();
		} else {
			if (!client.aBool2240) {
				client.aStringArray2129[0] = "Cancel";
				client.aStringArray2130[0] = "";
				client.anIntArray2127[0] = 1006;
				client.anInt2124 = 1;
			}

			int var0;
			int var2;
			int var4;
			int var5;
			int var6;
			int var7;
			int var9;
			int var10;
			int var11;
			Class124_Sub17 var13;
			Class124_Sub17 var14;
			int var33;
			int var35;
			long var38;
			int var41;
			int var43;
			Class124_Sub17 var70;
			boolean var76;
			Class124_Sub6 var91;
			int var107;
			for (var0 = 0; var0 < 100; ++var0) {
				boolean var1;
				if (null == Class73.aClass78_609)
					var1 = false;
				else
					label2501: {
						String var3;
						try {
							var2 = Class73.aClass78_609.method322();
							if (var2 == 0) {
								var1 = false;
								break label2501;
							}

							if (client.anInt2028 == -1) {
								Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.aByteArray1073, 0, 1);
								client.aClass124_Sub14_Sub1_2026.anInt1075 = 0;
								client.anInt2028 = client.aClass124_Sub14_Sub1_2026.method838();
								client.anInt2027 = Class102.anIntArray789[client.anInt2028];
								--var2;
							}

							if (client.anInt2027 == -1) {
								if (var2 <= 0) {
									var1 = false;
									break label2501;
								}

								Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.aByteArray1073, 0, 1);
								client.anInt2027 = client.aClass124_Sub14_Sub1_2026.aByteArray1073[0] & 255;
								--var2;
							}

							if (client.anInt2027 == -2) {
								if (var2 <= 1) {
									var1 = false;
									break label2501;
								}

								Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.aByteArray1073, 0, 2);
								client.aClass124_Sub14_Sub1_2026.anInt1075 = 0;
								client.anInt2027 = client.aClass124_Sub14_Sub1_2026.method560();
								var2 -= 2;
							}

							if (var2 < client.anInt2027) {
								var1 = false;
								break label2501;
							}

							client.aClass124_Sub14_Sub1_2026.anInt1075 = 0;
							Class73.aClass78_609.method320(client.aClass124_Sub14_Sub1_2026.aByteArray1073, 0,
									client.anInt2027);
							client.anInt2193 = 0;
							client.anInt2086 = client.anInt2032;
							client.anInt2032 = client.anInt2017 * -1;
							client.anInt2017 = client.anInt2028 * -1;
							if (client.anInt2028 == 63) {
								Class124_Sub22_Sub7.anInt1440 = client.aClass124_Sub14_Sub1_2026.method602();
								Class124_Sub22_Sub7.anInt1439 = client.aClass124_Sub14_Sub1_2026.method602();

								while (client.aClass124_Sub14_Sub1_2026.anInt1075 < client.anInt2027) {
									client.anInt2028 = client.aClass124_Sub14_Sub1_2026.method558();
									Class124_Sub22_Sub19_Sub6.method966();
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							boolean var67;
							if (client.anInt2028 == 41) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								final byte var75 = client.aClass124_Sub14_Sub1_2026.method559();
								var67 = false;
								if (var75 == -128)
									var67 = true;

								if (var67) {
									if (Class103.anInt794 == 0) {
										client.anInt2028 = -1;
										var1 = true;
										break label2501;
									}

									var76 = false;

									for (var7 = 0; (var7 < Class103.anInt794)
											&& (!Class124_Sub14_Sub1.aClass124_Sub9Array1609[var7].aString1029
													.equals(var3)
													|| (Class124_Sub14_Sub1.aClass124_Sub9Array1609[var7].anInt1027 != var4)); ++var7)
										;

									if (var7 < Class103.anInt794) {
										while (var7 < (Class103.anInt794 - 1)) {
											Class124_Sub14_Sub1.aClass124_Sub9Array1609[var7] = Class124_Sub14_Sub1.aClass124_Sub9Array1609[1
													+ var7];
											++var7;
										}

										--Class103.anInt794;
										Class124_Sub14_Sub1.aClass124_Sub9Array1609[Class103.anInt794] = null;
									}
								} else {
									client.aClass124_Sub14_Sub1_2026.method597();
									final Class124_Sub9 var74 = new Class124_Sub9();
									var74.aString1029 = var3;
									var74.aString1026 = Class34.method186(var74.aString1029, Class49.aClass117_488);
									var74.anInt1027 = var4;
									var74.aByte1028 = var75;

									for (var9 = Class103.anInt794 - 1; var9 >= 0; --var9) {
										var10 = Class124_Sub14_Sub1.aClass124_Sub9Array1609[var9].aString1026
												.compareTo(var74.aString1026);
										if (var10 == 0) {
											Class124_Sub14_Sub1.aClass124_Sub9Array1609[var9].anInt1027 = var4;
											Class124_Sub14_Sub1.aClass124_Sub9Array1609[var9].aByte1028 = var75;
											if (var3.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
												Class9.aByte97 = var75;

											client.anInt2176 = client.anInt2067;
											client.anInt2028 = -1;
											var1 = true;
											break label2501;
										}

										if (var10 < 0)
											break;
									}

									if (Class103.anInt794 >= Class124_Sub14_Sub1.aClass124_Sub9Array1609.length) {
										client.anInt2028 = -1;
										var1 = true;
										break label2501;
									}

									for (var10 = Class103.anInt794 - 1; var10 > var9; --var10)
										Class124_Sub14_Sub1.aClass124_Sub9Array1609[var10
												+ 1] = Class124_Sub14_Sub1.aClass124_Sub9Array1609[var10];

									if (Class103.anInt794 == 0)
										Class124_Sub14_Sub1.aClass124_Sub9Array1609 = new Class124_Sub9[100];

									Class124_Sub14_Sub1.aClass124_Sub9Array1609[var9 + 1] = var74;
									++Class103.anInt794;
									if (var3.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
										Class9.aByte97 = var75;
								}

								client.anInt2176 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							Class124_Sub17 var84;
							if (client.anInt2028 == 230) {
								var11 = client.aClass124_Sub14_Sub1_2026.method590();
								var84 = Class10.method55(var11);

								for (var5 = 0; var5 < var84.anIntArray1269.length; ++var5) {
									var84.anIntArray1269[var5] = -1;
									var84.anIntArray1269[var5] = 0;
								}

								Class124_Sub22_Sub10.method723(var84);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 146) {
								Class124_Sub17.method630();
								client.anInt2147 = client.aClass124_Sub14_Sub1_2026.method558();
								client.anInt2179 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							String var12;
							if (client.anInt2028 == 6) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								var12 = Class124_Sub22_Sub16_Sub4.method1031(Class124_Sub22_Sub19_Sub1
										.method886(RuntimeException_Sub1.method1013(client.aClass124_Sub14_Sub1_2026)));
								Class20.method95(6, var3, var12);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 52) {
								client.anInt2218 = client.aClass124_Sub14_Sub1_2026.method558();
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 65) {
								final Class23 var64 = new Class23();
								var64.aString254 = client.aClass124_Sub14_Sub1_2026.method597();
								var64.anInt262 = client.aClass124_Sub14_Sub1_2026.method560();
								var4 = client.aClass124_Sub14_Sub1_2026.method562(-902248709);
								var64.anInt255 = var4;
								Class124_Sub5.method516(45);
								Class73.aClass78_609.method324();
								Class73.aClass78_609 = null;
								Class124_Sub22_Sub19.method835(var64);
								client.anInt2028 = -1;
								var1 = false;
								break label2501;
							}

							if (client.anInt2028 == 31) {
								for (var11 = 0; var11 < Class91.anIntArray711.length; ++var11)
									if (Class91.anIntArray712[var11] != Class91.anIntArray711[var11]) {
										Class91.anIntArray711[var11] = Class91.anIntArray712[var11];
										Class124_Sub11.method539(var11);
										client.anIntArray2246[(++client.anInt2169 - 1) & 31] = var11;
									}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 58) {
								client.anInt2194 = client.aClass124_Sub14_Sub1_2026.method558();
								if (client.anInt2194 == 255)
									client.anInt2194 = 0;

								client.anInt2217 = client.aClass124_Sub14_Sub1_2026.method558();
								if (client.anInt2217 == 255)
									client.anInt2217 = 0;

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 142) {
								Class124_Sub17.method630();
								var11 = client.aClass124_Sub14_Sub1_2026.method562(1520126972);
								var4 = client.aClass124_Sub14_Sub1_2026.method594();
								var5 = client.aClass124_Sub14_Sub1_2026.method602();
								client.anIntArray2121[var5] = var11;
								client.anIntArray2126[var5] = var4;
								client.anIntArray2030[var5] = 1;

								for (var6 = 0; var6 < 98; ++var6)
									if (var11 >= Class89.anIntArray705[var6])
										client.anIntArray2030[var5] = 2 + var6;

								client.anIntArray2072[(++client.anInt2173 - 1) & 31] = var5;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 199) {
								var11 = client.aClass124_Sub14_Sub1_2026.method558();
								var4 = client.aClass124_Sub14_Sub1_2026.method558();
								var5 = client.aClass124_Sub14_Sub1_2026.method558();
								var6 = client.aClass124_Sub14_Sub1_2026.method558();
								client.aBoolArray2232[var11] = true;
								client.anIntArray2123[var11] = var4;
								client.anIntArray2054[var11] = var5;
								client.anIntArray2235[var11] = var6;
								client.anIntArray2236[var11] = 0;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 50) {
								var11 = client.aClass124_Sub14_Sub1_2026.method593();
								var4 = client.aClass124_Sub14_Sub1_2026.method595();
								var5 = client.aClass124_Sub14_Sub1_2026.method593();
								var13 = Class10.method55(var4);
								if ((var11 != var13.anInt1216) || (var13.anInt1163 != var5) || (var13.anInt1158 != 0)
										|| (var13.anInt1148 != 0)) {
									var13.anInt1216 = var11;
									var13.anInt1163 = var5;
									var13.anInt1158 = 0;
									var13.anInt1148 = 0;
									Class124_Sub22_Sub10.method723(var13);
									Class64.method286(var13);
									if (var13.anInt1191 == 0)
										method831(Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var4 >> 16], var13,
												false);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 138) {
								client.anInt2171 = client.aClass124_Sub14_Sub1_2026.method558();
								if (client.anInt2171 == 1)
									client.anInt2003 = client.aClass124_Sub14_Sub1_2026.method560();

								if ((client.anInt2171 >= 2) && (client.anInt2171 <= 6)) {
									if (client.anInt2171 == 2) {
										client.anInt2008 = 64;
										client.anInt2009 = 64;
									}

									if (client.anInt2171 == 3) {
										client.anInt2008 = 0;
										client.anInt2009 = 64;
									}

									if (client.anInt2171 == 4) {
										client.anInt2008 = 128;
										client.anInt2009 = 64;
									}

									if (client.anInt2171 == 5) {
										client.anInt2008 = 64;
										client.anInt2009 = 0;
									}

									if (client.anInt2171 == 6) {
										client.anInt2008 = 64;
										client.anInt2009 = 128;
									}

									client.anInt2171 = 2;
									client.anInt2186 = client.aClass124_Sub14_Sub1_2026.method560();
									client.anInt2144 = client.aClass124_Sub14_Sub1_2026.method560();
									client.anInt2191 = client.aClass124_Sub14_Sub1_2026.method558();
								}

								if (client.anInt2171 == 10)
									client.anInt2004 = client.aClass124_Sub14_Sub1_2026.method560();

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 2) {
								client.anInt2066 = client.aClass124_Sub14_Sub1_2026.method558();
								client.anInt2201 = client.aClass124_Sub14_Sub1_2026.method558();
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 161) {
								var11 = client.aClass124_Sub14_Sub1_2026.method589();
								var12 = client.aClass124_Sub14_Sub1_2026.method597();
								var14 = Class10.method55(var11);
								if (!var12.equals(var14.aString1185)) {
									var14.aString1185 = var12;
									Class124_Sub22_Sub10.method723(var14);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 186) {
								var11 = client.aClass124_Sub14_Sub1_2026.method590();
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								var5 = client.aClass124_Sub14_Sub1_2026.method560();
								var6 = client.aClass124_Sub14_Sub1_2026.method583();
								var70 = Class10.method55(var11);
								if ((var70.anInt1202 != var5) || (var70.anInt1203 != var6)
										|| (var4 != var70.anInt1205)) {
									var70.anInt1202 = var5;
									var70.anInt1203 = var6;
									var70.anInt1205 = var4;
									Class124_Sub22_Sub10.method723(var70);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 177) {
								Class124_Sub5.method515(true);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							long var15;
							if (client.anInt2028 == 18) {
								var11 = client.aClass124_Sub14_Sub1_2026.method560();
								if (var11 == '\uffff')
									var11 = -1;

								var4 = client.aClass124_Sub14_Sub1_2026.method590();
								var5 = client.aClass124_Sub14_Sub1_2026.method590();
								var6 = client.aClass124_Sub14_Sub1_2026.method583();
								if (var6 == '\uffff')
									var6 = -1;

								for (var7 = var11; var7 <= var6; ++var7) {
									var15 = var7 + ((long) var4 << 32);
									final Class124 var90 = client.aClass107_2184.method409(var15);
									if (var90 != null)
										var90.method450();

									client.aClass107_2184.method412(new Class124_Sub21(var5), var15);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							boolean var65;
							String var83;
							if (client.anInt2028 == 201) {
								var11 = client.aClass124_Sub14_Sub1_2026.method596((byte) -18);
								var65 = client.aClass124_Sub14_Sub1_2026.method558() == 1;
								var83 = "";
								var67 = false;
								if (var65) {
									var83 = client.aClass124_Sub14_Sub1_2026.method597();
									if (Class1.method12(var83))
										var67 = true;
								}

								final String var72 = client.aClass124_Sub14_Sub1_2026.method597();
								if (!var67)
									Class20.method95(var11, var83, var72);

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 206) {
								var11 = client.aClass124_Sub14_Sub1_2026.method584();
								var4 = client.aClass124_Sub14_Sub1_2026.method590();
								var14 = Class10.method55(var4);
								if ((var11 != var14.anInt1222) || (var11 == -1)) {
									var14.anInt1222 = var11;
									var14.anInt1273 = 0;
									var14.anInt1274 = 0;
									Class124_Sub22_Sub10.method723(var14);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							long var20;
							long var22;
							if (client.anInt2028 == 60) {
								var11 = client.aClass124_Sub14_Sub1_2026.method562(1465196928);
								var4 = client.aClass124_Sub14_Sub1_2026.method562(167904836);
								if ((null == Class62.aGarbageCollectorMXBean548)
										|| !Class62.aGarbageCollectorMXBean548.isValid())
									try {
										final Iterator var93 = ManagementFactory.getGarbageCollectorMXBeans()
												.iterator();

										while (var93.hasNext()) {
											final GarbageCollectorMXBean var88 = (GarbageCollectorMXBean) var93.next();
											if (var88.isValid()) {
												Class62.aGarbageCollectorMXBean548 = var88;
												client.aLong2261 = -1L;
												client.aLong2260 = -1L;
											}
										}
									} catch (final Throwable var59) {
										;
									}

								final long var18 = Class74.method316(1582820196);
								var7 = -1;
								if (null != Class62.aGarbageCollectorMXBean548) {
									var15 = Class62.aGarbageCollectorMXBean548.getCollectionTime();
									if (-1L != client.aLong2260) {
										var20 = var15 - client.aLong2260;
										var22 = var18 - client.aLong2261;
										if (var22 != 0L)
											var7 = (int) ((100L * var20) / var22);
									}

									client.aLong2260 = var15;
									client.aLong2261 = var18;
								}

								client.aClass124_Sub14_Sub1_2024.method837(133);
								client.aClass124_Sub14_Sub1_2024.method586(var11);
								client.aClass124_Sub14_Sub1_2024.method586(var4);
								client.aClass124_Sub14_Sub1_2024.method578(var7);
								client.aClass124_Sub14_Sub1_2024.method578(Applet_Sub1.anInt1970);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 254) {
								var11 = client.aClass124_Sub14_Sub1_2026.method558();
								var4 = client.aClass124_Sub14_Sub1_2026.method594();
								var5 = client.aClass124_Sub14_Sub1_2026.method604();
								Class134.anInt906 = var5 >> 1;
								Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.method893(var4, var11, (var5 & 1) == 1);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 170) {
								Class124_Sub22_Sub7.anInt1440 = client.aClass124_Sub14_Sub1_2026.method558();
								Class124_Sub22_Sub7.anInt1439 = client.aClass124_Sub14_Sub1_2026.method604();
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 83) {
								client.aClass124_Sub14_Sub1_2026.anInt1075 += 28;
								if (client.aClass124_Sub14_Sub1_2026.method567()) {
									final Class124_Sub14_Sub1 var63 = client.aClass124_Sub14_Sub1_2026;
									var4 = client.aClass124_Sub14_Sub1_2026.anInt1075 - 28;
									if (Class73.aClass132_600 != null)
										try {
											Class73.aClass132_600.method474(0L);
											Class73.aClass132_600.method475(var63.aByteArray1073, var4, 24);
										} catch (final Exception var57) {
											;
										}
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 67) {
								Class124_Sub22_Sub19_Sub5.method959(false);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							String var79;
							if (client.anInt2028 == 185) {
								while (client.aClass124_Sub14_Sub1_2026.anInt1075 < client.anInt2027) {
									var11 = client.aClass124_Sub14_Sub1_2026.method558();
									var65 = (var11 & 1) == 1;
									var83 = client.aClass124_Sub14_Sub1_2026.method597();
									var79 = client.aClass124_Sub14_Sub1_2026.method597();
									client.aClass124_Sub14_Sub1_2026.method597();

									for (var7 = 0; var7 < client.anInt2252; ++var7) {
										final Class35 var96 = client.aClass35Array1986[var7];
										if (var65) {
											if (var79.equals(var96.aString372)) {
												var96.aString372 = var83;
												var96.aString373 = var79;
												var14 = null;
												break;
											}
										} else if (var83.equals(var96.aString372)) {
											var96.aString372 = var83;
											var96.aString373 = var79;
											var14 = null;
											break;
										}
									}
								}

								client.anInt2175 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							long var27;
							boolean var105;
							if (client.anInt2028 == 47) {
								client.anInt2176 = client.anInt2067;
								if (client.anInt2027 == 0) {
									client.aString2120 = null;
									client.aString2210 = null;
									Class103.anInt794 = 0;
									Class124_Sub14_Sub1.aClass124_Sub9Array1609 = null;
									client.anInt2028 = -1;
									var1 = true;
								} else {
									client.aString2210 = client.aClass124_Sub14_Sub1_2026.method597();
									final long var25 = client.aClass124_Sub14_Sub1_2026.method563();
									var27 = var25;
									if ((var25 > 0L) && (var25 < 6582952005840035281L)) {
										if ((var25 % 37L) == 0L)
											var83 = null;
										else {
											var9 = 0;

											for (long var29 = var25; var29 != 0L; var29 /= 37L)
												++var9;

											final StringBuilder var100 = new StringBuilder(var9);

											while (0L != var27) {
												var22 = var27;
												var27 /= 37L;
												var100.append(Class85.aCharArray688[(int) (var22 - (37L * var27))]);
											}

											var83 = var100.reverse().toString();
										}
									} else
										var83 = null;

									client.aString2120 = var83;
									Class124_Sub22_Sub19_Sub1.aByte1665 = client.aClass124_Sub14_Sub1_2026.method559();
									var9 = client.aClass124_Sub14_Sub1_2026.method558();
									if (var9 == 255) {
										client.anInt2028 = -1;
										var1 = true;
									} else {
										Class103.anInt794 = var9;
										final Class124_Sub9[] var106 = new Class124_Sub9[100];

										for (var33 = 0; var33 < Class103.anInt794; ++var33) {
											var106[var33] = new Class124_Sub9();
											var106[var33].aString1029 = client.aClass124_Sub14_Sub1_2026.method597();
											var106[var33].aString1026 = Class34.method186(var106[var33].aString1029,
													Class49.aClass117_488);
											var106[var33].anInt1027 = client.aClass124_Sub14_Sub1_2026.method560();
											var106[var33].aByte1028 = client.aClass124_Sub14_Sub1_2026.method559();
											client.aClass124_Sub14_Sub1_2026.method597();
											if (var106[var33].aString1029
													.equals(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aString1956))
												Class9.aByte97 = var106[var33].aByte1028;
										}

										var105 = false;
										var107 = Class103.anInt794;

										while (var107 > 0) {
											var105 = true;
											--var107;

											for (var35 = 0; var35 < var107; ++var35)
												if (var106[var35].aString1026
														.compareTo(var106[1 + var35].aString1026) > 0) {
													final Class124_Sub9 var101 = var106[var35];
													var106[var35] = var106[1 + var35];
													var106[1 + var35] = var101;
													var105 = false;
												}

											if (var105)
												break;
										}

										Class124_Sub14_Sub1.aClass124_Sub9Array1609 = var106;
										client.anInt2028 = -1;
										var1 = true;
									}
								}
								break label2501;
							}

							if (client.anInt2028 == 125) {
								for (var11 = 0; var11 < Class124_Sub22_Sub4.anInt1372; ++var11) {
									final Class124_Sub22_Sub4 var87 = Class124_Sub22_Sub6.method690(var11);
									if (var87 != null) {
										Class91.anIntArray712[var11] = 0;
										Class91.anIntArray711[var11] = 0;
									}
								}

								Class124_Sub17.method630();
								client.anInt2169 += 32;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 180) {
								var11 = client.aClass124_Sub14_Sub1_2026.method590();
								var84 = Class10.method55(var11);
								var84.anInt1229 = 3;
								var84.anInt1197 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943
										.method401();
								Class124_Sub22_Sub10.method723(var84);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							boolean var86;
							if (client.anInt2028 == 167) {
								var86 = client.aClass124_Sub14_Sub1_2026.method558() == 1;
								if (var86) {
									Class124_Sub7.aLong1011 = Class74.method316(1420216945)
											- client.aClass124_Sub14_Sub1_2026.method563();
									Class37.aClass134_389 = new Class134(client.aClass124_Sub14_Sub1_2026, true);
								} else
									Class37.aClass134_389 = null;

								client.anInt2178 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 255) {
								var11 = client.aClass124_Sub14_Sub1_2026.method590();
								Class78.aClass79_632 = Class27.aClass82_303.method333(var11);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 195) {
								var11 = client.aClass124_Sub14_Sub1_2026.method558();
								var12 = client.aClass124_Sub14_Sub1_2026.method597();
								var5 = client.aClass124_Sub14_Sub1_2026.method558();
								if ((var11 >= 1) && (var11 <= 8)) {
									if (var12.equalsIgnoreCase("null"))
										var12 = null;

									client.aStringArray2166[var11 - 1] = var12;
									client.aBoolArray2112[var11 - 1] = var5 == 0;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							Class124_Sub7 var78;
							if (client.anInt2028 == 7) {
								var11 = client.anInt2027 + client.aClass124_Sub14_Sub1_2026.anInt1075;
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								var5 = client.aClass124_Sub14_Sub1_2026.method560();
								if (client.anInt2142 != var4) {
									client.anInt2142 = var4;
									Class122.method449(client.anInt2142, Class56_Sub2.anInt1083, Class81.anInt662,
											false);
									Class32.method183(client.anInt2142);
									Class3.method20(client.anInt2142);

									for (var6 = 0; var6 < 100; ++var6)
										client.aBoolArray2061[var6] = true;
								}

								Class124_Sub7 var104;
								for (; var5-- > 0; var104.aBool1009 = true) {
									var6 = client.aClass124_Sub14_Sub1_2026.method562(1809020370);
									var7 = client.aClass124_Sub14_Sub1_2026.method560();
									var9 = client.aClass124_Sub14_Sub1_2026.method558();
									var104 = (Class124_Sub7) client.aClass107_2143.method409(var6);
									if ((null != var104) && (var7 != var104.anInt1012)) {
										Class124_Sub22_Sub15.method760(var104, true);
										var104 = null;
									}

									if (var104 == null)
										var104 = Class49.method240(var6, var7, var9);
								}

								for (var78 = (Class124_Sub7) client.aClass107_2143
										.method411(); null != var78; var78 = (Class124_Sub7) client.aClass107_2143
												.method413())
									if (var78.aBool1009)
										var78.aBool1009 = false;
									else
										Class124_Sub22_Sub15.method760(var78, true);

								client.aClass107_2184 = new Class107(512);

								while (client.aClass124_Sub14_Sub1_2026.anInt1075 < var11) {
									var6 = client.aClass124_Sub14_Sub1_2026.method562(-1661786170);
									var7 = client.aClass124_Sub14_Sub1_2026.method560();
									var9 = client.aClass124_Sub14_Sub1_2026.method560();
									var10 = client.aClass124_Sub14_Sub1_2026.method562(999441199);

									for (var33 = var7; var33 <= var9; ++var33) {
										final long var36 = var33 + ((long) var6 << 32);
										client.aClass107_2184.method412(new Class124_Sub21(var10), var36);
									}
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 59) {
								client.aBool2231 = true;
								Class73.anInt608 = client.aClass124_Sub14_Sub1_2026.method558();
								Class124_Sub11.anInt1045 = client.aClass124_Sub14_Sub1_2026.method558();
								Class124_Sub11.anInt1041 = client.aClass124_Sub14_Sub1_2026.method560();
								Class70.anInt583 = client.aClass124_Sub14_Sub1_2026.method558();
								Class49.anInt482 = client.aClass124_Sub14_Sub1_2026.method558();
								if (Class49.anInt482 >= 100) {
									var11 = 64 + (Class73.anInt608 * 128);
									var4 = (Class124_Sub11.anInt1045 * 128) + 64;
									var5 = Class63.method285(var11, var4, Class134.anInt906) - Class124_Sub11.anInt1041;
									var6 = var11 - Class45.anInt445;
									var7 = var5 - Class2.anInt14;
									var9 = var4 - Class48.anInt479;
									var10 = (int) Math.sqrt((var6 * var6) + (var9 * var9));
									Class124_Sub6.anInt1003 = (int) (Math.atan2(var7, var10) * 325.949D) & 2047;
									Class27.anInt301 = (int) (Math.atan2(var6, var9) * -325.949D) & 2047;
									if (Class124_Sub6.anInt1003 < 128)
										Class124_Sub6.anInt1003 = 128;

									if (Class124_Sub6.anInt1003 > 383)
										Class124_Sub6.anInt1003 = 383;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 132) {
								Class124_Sub17.method630();
								client.anInt2148 = client.aClass124_Sub14_Sub1_2026.method546();
								client.anInt2179 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 61) {
								var11 = client.aClass124_Sub14_Sub1_2026.method589();
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								var14 = Class10.method55(var11);
								if ((var14.anInt1229 != 1) || (var14.anInt1197 != var4)) {
									var14.anInt1229 = 1;
									var14.anInt1197 = var4;
									Class124_Sub22_Sub10.method723(var14);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 194) {
								var11 = client.aClass124_Sub14_Sub1_2026.method544();
								if (var11 == '\uffff')
									var11 = -1;

								if ((var11 == -1) && !client.aBool2221)
									Class38.method199();
								else if ((var11 != -1) && (client.anInt2220 != var11) && (client.anInt2219 != 0)
										&& !client.aBool2221)
									Class25.method159(2, Class5.aClass94_Sub1_58, var11, 0, client.anInt2219, false);

								client.anInt2220 = var11;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 99) {
								var11 = client.aClass124_Sub14_Sub1_2026.method557();
								var4 = client.aClass124_Sub14_Sub1_2026.method544();
								if (var4 == '\uffff')
									var4 = -1;

								if ((client.anInt2219 != 0) && (var4 != -1)) {
									Class2.method19(Class68.aClass94_Sub1_571, var4, 0, client.anInt2219, false);
									client.aBool2221 = true;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 242) {
								var11 = client.aClass124_Sub14_Sub1_2026.method589();
								var4 = client.aClass124_Sub14_Sub1_2026.method604();
								var5 = client.aClass124_Sub14_Sub1_2026.method582();
								var78 = (Class124_Sub7) client.aClass107_2143.method409(var11);
								if (null != var78)
									Class124_Sub22_Sub15.method760(var78, var5 != var78.anInt1012);

								Class49.method240(var11, var5, var4);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 198) {
								var11 = client.aClass124_Sub14_Sub1_2026.method558();
								if (client.aClass124_Sub14_Sub1_2026.method558() == 0) {
									client.aClass125Array2259[var11] = new Class125();
									client.aClass124_Sub14_Sub1_2026.anInt1075 += 18;
								} else {
									--client.aClass124_Sub14_Sub1_2026.anInt1075;
									client.aClass125Array2259[var11] = new Class125(client.aClass124_Sub14_Sub1_2026,
											false);
								}

								client.anInt2177 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 124) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								final Object[] var81 = new Object[var3.length() + 1];

								for (var5 = var3.length() - 1; var5 >= 0; --var5)
									if (var3.charAt(var5) == 115)
										var81[var5 + 1] = client.aClass124_Sub14_Sub1_2026.method597();
									else
										var81[1 + var5] = new Integer(
												client.aClass124_Sub14_Sub1_2026.method562(-816368087));

								var81[0] = new Integer(client.aClass124_Sub14_Sub1_2026.method562(1703341761));
								var91 = new Class124_Sub6();
								var91.anObjectArray995 = var81;
								Class124_Sub22_Sub19_Sub3_Sub2.method1048(var91);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 54) {
								client.anInt2001 = client.aClass124_Sub14_Sub1_2026.method582() * 30;
								client.anInt2179 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 12) {
								var11 = client.aClass124_Sub14_Sub1_2026.method562(190203725);
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								if (var11 < -70000)
									var4 += '\u8000';

								if (var11 >= 0)
									var14 = Class10.method55(var11);
								else
									var14 = null;

								Class124_Sub22_Sub19_Sub5.method955(var4);
								var6 = client.aClass124_Sub14_Sub1_2026.method560();

								for (var7 = 0; var7 < var6; ++var7) {
									var9 = client.aClass124_Sub14_Sub1_2026.method594();
									if (var9 == 255)
										var9 = client.aClass124_Sub14_Sub1_2026.method590();

									var10 = client.aClass124_Sub14_Sub1_2026.method560();
									if ((null != var14) && (var7 < var14.anIntArray1269.length)) {
										var14.anIntArray1269[var7] = var10;
										var14.anIntArray1270[var7] = var9;
									}

									Class43.method218(var4, var7, var10 - 1, var9);
								}

								if (null != var14)
									Class124_Sub22_Sub10.method723(var14);

								Class124_Sub17.method630();
								client.anIntArray2170[(++client.anInt2060 - 1) & 31] = var4 & 32767;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 44) {
								var11 = client.aClass124_Sub14_Sub1_2026.method583();
								var4 = client.aClass124_Sub14_Sub1_2026.method589();
								var5 = (var11 >> 10) & 31;
								var6 = (var11 >> 5) & 31;
								var7 = var11 & 31;
								var9 = (var5 << 19) + (var6 << 11) + (var7 << 3);
								final Class124_Sub17 var103 = Class10.method55(var4);
								if (var103.anInt1178 != var9) {
									var103.anInt1178 = var9;
									Class124_Sub22_Sub10.method723(var103);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 153) {
								Class124_Sub22_Sub7.anInt1440 = client.aClass124_Sub14_Sub1_2026.method558();
								Class124_Sub22_Sub7.anInt1439 = client.aClass124_Sub14_Sub1_2026.method558();

								for (var11 = Class124_Sub22_Sub7.anInt1439; var11 < (8
										+ Class124_Sub22_Sub7.anInt1439); ++var11)
									for (var4 = Class124_Sub22_Sub7.anInt1440; var4 < (Class124_Sub22_Sub7.anInt1440
											+ 8); ++var4)
										if (null != client.aClass111ArrayArrayArray2073[Class134.anInt906][var11][var4]) {
											client.aClass111ArrayArrayArray2073[Class134.anInt906][var11][var4] = null;
											Class48.method233(var11, var4);
										}

								for (Class124_Sub11 var62 = (Class124_Sub11) client.aClass111_2262
										.method428(); null != var62; var62 = (Class124_Sub11) client.aClass111_2262
												.method430())
									if ((var62.anInt1036 >= Class124_Sub22_Sub7.anInt1439)
											&& (var62.anInt1036 < (Class124_Sub22_Sub7.anInt1439 + 8))
											&& (var62.anInt1037 >= Class124_Sub22_Sub7.anInt1440)
											&& (var62.anInt1037 < (8 + Class124_Sub22_Sub7.anInt1440))
											&& (var62.anInt1048 == Class134.anInt906))
										var62.anInt1050 = 0;

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 98) {
								var11 = client.aClass124_Sub14_Sub1_2026.method544();
								client.anInt2142 = var11;
								Class122.method449(client.anInt2142, Class56_Sub2.anInt1083, Class81.anInt662, false);
								Class32.method183(var11);
								Class3.method20(client.anInt2142);

								for (var4 = 0; var4 < 100; ++var4)
									client.aBoolArray2061[var4] = true;

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 28) {
								Class97.method390(client.aClass124_Sub14_Sub1_2026);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 82) {
								var11 = client.aClass124_Sub14_Sub1_2026.method562(-734325398);
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								if (var11 < -70000)
									var4 += '\u8000';

								if (var11 >= 0)
									var14 = Class10.method55(var11);
								else
									var14 = null;

								for (; client.aClass124_Sub14_Sub1_2026.anInt1075 < client.anInt2027; Class43
										.method218(var4, var6, var7 - 1, var9)) {
									var6 = client.aClass124_Sub14_Sub1_2026.method596((byte) -75);
									var7 = client.aClass124_Sub14_Sub1_2026.method560();
									var9 = 0;
									if (var7 != 0) {
										var9 = client.aClass124_Sub14_Sub1_2026.method558();
										if (var9 == 255)
											var9 = client.aClass124_Sub14_Sub1_2026.method562(1341173650);
									}

									if ((null != var14) && (var6 >= 0) && (var6 < var14.anIntArray1269.length)) {
										var14.anIntArray1269[var6] = var7;
										var14.anIntArray1270[var6] = var9;
									}
								}

								if (var14 != null)
									Class124_Sub22_Sub10.method723(var14);

								Class124_Sub17.method630();
								client.anIntArray2170[(++client.anInt2060 - 1) & 31] = var4 & 32767;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 30) {
								var11 = client.aClass124_Sub14_Sub1_2026.method595();
								var65 = client.aClass124_Sub14_Sub1_2026.method558() == 1;
								var14 = Class10.method55(var11);
								if (var14.aBool1173 != var65) {
									var14.aBool1173 = var65;
									Class124_Sub22_Sub10.method723(var14);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 0) {
								var11 = client.aClass124_Sub14_Sub1_2026.method582();
								var4 = client.aClass124_Sub14_Sub1_2026.method560();
								var5 = client.aClass124_Sub14_Sub1_2026.method562(-415552865);
								var13 = Class10.method55(var5);
								var13.anInt1207 = var4 + (var11 << 16);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 14) {
								Class124_Sub22_Sub19_Sub5.method959(true);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 157) {
								var11 = client.aClass124_Sub14_Sub1_2026.method589();
								var4 = client.aClass124_Sub14_Sub1_2026.method544();
								Class91.anIntArray712[var4] = var11;
								if (Class91.anIntArray711[var4] != var11) {
									Class91.anIntArray711[var4] = var11;
									Class124_Sub11.method539(var4);
								}

								client.anIntArray2246[(++client.anInt2169 - 1) & 31] = var4;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 115) {
								client.aBool2231 = false;

								for (var11 = 0; var11 < 5; ++var11)
									client.aBoolArray2232[var11] = false;

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 190) {
								Class30.method174();
								client.anInt2028 = -1;
								var1 = false;
								break label2501;
							}

							if (client.anInt2028 == 107) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								client.aString1991 = var3;

								try {
									var12 = Class80.aclient645.getParameter(Class122.aClass122_870.aString857);
									var83 = Class80.aclient645.getParameter(Class122.aClass122_867.aString857);
									var79 = var12 + "settings=" + var3 + "; version=1; path=/; domain=" + var83;
									if (var3.length() == 0)
										var79 = var79 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
									else
										var79 = var79 + "; Expires="
												+ Class31.method181(Class74.method316(975676565) + 94608000000L)
												+ "; Max-Age=" + 94608000L;

									final client var71 = Class80.aclient645;
									final String var95 = "document.cookie=\"" + var79 + "\"";
									JSObject.getWindow(var71).eval(var95);
								} catch (final Throwable var56) {
									;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 29) {
								var11 = client.aClass124_Sub14_Sub1_2026.method560();
								var4 = client.aClass124_Sub14_Sub1_2026.method558();
								var5 = client.aClass124_Sub14_Sub1_2026.method560();
								if ((client.anInt2239 != 0) && (var4 != 0) && (client.anInt2225 < 50)) {
									client.anIntArray2226[client.anInt2225] = var11;
									client.anIntArray2227[client.anInt2225] = var4;
									client.anIntArray2228[client.anInt2225] = var5;
									client.aClass12Array2230[client.anInt2225] = null;
									client.anIntArray2229[client.anInt2225] = 0;
									++client.anInt2225;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 88) {
								var11 = client.aClass124_Sub14_Sub1_2026.method562(1334986033);
								final Class124_Sub7 var80 = (Class124_Sub7) client.aClass107_2143.method409(var11);
								if (null != var80)
									Class124_Sub22_Sub15.method760(var80, true);

								if (null != client.aClass124_Sub17_2042) {
									Class124_Sub22_Sub10.method723(client.aClass124_Sub17_2042);
									client.aClass124_Sub17_2042 = null;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 229) {
								var11 = client.aClass124_Sub14_Sub1_2026.method544();
								final Class124_Sub10 var77 = (Class124_Sub10) Class124_Sub10.aClass107_1034
										.method409(var11);
								if (null != var77)
									var77.method450();

								client.anIntArray2170[(++client.anInt2060 - 1) & 31] = var11 & 32767;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 80) {
								for (var11 = 0; var11 < client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100.length; ++var11)
									if (null != client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11])
										client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11].anInt1699 = -1;

								for (var11 = 0; var11 < client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254.length; ++var11)
									if (client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var11] != null)
										client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var11].anInt1699 = -1;

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 223) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								var38 = client.aClass124_Sub14_Sub1_2026.method563();
								var27 = client.aClass124_Sub14_Sub1_2026.method560();
								var15 = client.aClass124_Sub14_Sub1_2026.method557();
								final Class74[] var17 = new Class74[] { Class74.aClass74_612, Class74.aClass74_613,
										Class74.aClass74_617, Class74.aClass74_616, Class74.aClass74_611 };
								final Class74 var99 = (Class74) Class23.method158(var17,
										client.aClass124_Sub14_Sub1_2026.method558());
								var22 = (var27 << 32) + var15;
								boolean var109 = false;

								for (var41 = 0; var41 < 100; ++var41)
									if (client.aLongArray2203[var41] == var22) {
										var109 = true;
										break;
									}

								if (var99.aBool615 && Class1.method12(var3))
									var109 = true;

								if (!var109 && (client.anInt2099 == 0)) {
									client.aLongArray2203[client.anInt2204] = var22;
									client.anInt2204 = (1 + client.anInt2204) % 100;
									final String var42 = Class124_Sub22_Sub16_Sub4
											.method1031(Class124_Sub22_Sub19_Sub1.method886(RuntimeException_Sub1
													.method1013(client.aClass124_Sub14_Sub1_2026)));
									if (var99.anInt614 != -1)
										Class49.method238(9, Class99.method391(var99.anInt614) + var3, var42,
												Class61.method273(var38));
									else
										Class49.method238(9, var3, var42, Class61.method273(var38));
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 116) {
								client.aBool2231 = true;
								Class22.anInt251 = client.aClass124_Sub14_Sub1_2026.method558();
								Class124_Sub6.anInt992 = client.aClass124_Sub14_Sub1_2026.method558();
								Class64.anInt560 = client.aClass124_Sub14_Sub1_2026.method560();
								Class27.anInt305 = client.aClass124_Sub14_Sub1_2026.method558();
								Class47.anInt468 = client.aClass124_Sub14_Sub1_2026.method558();
								if (Class47.anInt468 >= 100) {
									Class45.anInt445 = 64 + (Class22.anInt251 * 128);
									Class48.anInt479 = 64 + (Class124_Sub6.anInt992 * 128);
									Class2.anInt14 = Class63.method285(Class45.anInt445, Class48.anInt479,
											Class134.anInt906) - Class64.anInt560;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 166) {
								var11 = client.aClass124_Sub14_Sub1_2026.method595();
								var4 = client.aClass124_Sub14_Sub1_2026.method589();
								final Class124_Sub7 var85 = (Class124_Sub7) client.aClass107_2143.method409(var11);
								var78 = (Class124_Sub7) client.aClass107_2143.method409(var4);
								if (var78 != null)
									Class124_Sub22_Sub15.method760(var78,
											(null == var85) || (var78.anInt1012 != var85.anInt1012));

								if (null != var85) {
									var85.method450();
									client.aClass107_2143.method412(var85, var4);
								}

								var70 = Class10.method55(var11);
								if (var70 != null)
									Class124_Sub22_Sub10.method723(var70);

								var70 = Class10.method55(var4);
								if (null != var70) {
									Class124_Sub22_Sub10.method723(var70);
									method831(
											Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var70.anInt1284 >>> 16],
											var70, true);
								}

								if (client.anInt2142 != -1)
									Class3.method23(client.anInt2142, 1);

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 102) {
								if (client.anInt2142 != -1)
									Class3.method23(client.anInt2142, 0);

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 112) {
								client.anInt2215 = 1;
								client.anInt2175 = client.anInt2067;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 173) {
								Class124_Sub5.method515(false);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 39) {
								Class32.aClass53_337 = Class62.method278(client.aClass124_Sub14_Sub1_2026.method558(),
										(short) 128);
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 51) {
								while (client.aClass124_Sub14_Sub1_2026.anInt1075 < client.anInt2027) {
									var86 = client.aClass124_Sub14_Sub1_2026.method558() == 1;
									var12 = client.aClass124_Sub14_Sub1_2026.method597();
									var83 = client.aClass124_Sub14_Sub1_2026.method597();
									var6 = client.aClass124_Sub14_Sub1_2026.method560();
									var7 = client.aClass124_Sub14_Sub1_2026.method558();
									var9 = client.aClass124_Sub14_Sub1_2026.method558();
									final boolean var73 = (var9 & 2) != 0;
									var105 = (var9 & 1) != 0;
									if (var6 > 0) {
										client.aClass124_Sub14_Sub1_2026.method597();
										client.aClass124_Sub14_Sub1_2026.method558();
										client.aClass124_Sub14_Sub1_2026.method562(1008612400);
									}

									client.aClass124_Sub14_Sub1_2026.method597();

									for (var43 = 0; var43 < client.anInt2056; ++var43) {
										final Class32 var44 = client.aClass32Array2098[var43];
										if (!var86) {
											if (var12.equals(var44.aString344)) {
												if (var44.anInt339 != var6) {
													boolean var108 = true;

													for (Class121_Sub1 var45 = (Class121_Sub1) client.aClass106_2253
															.method406(); var45 != null; var45 = (Class121_Sub1) client.aClass106_2253
																	.method407())
														if (var45.aString914.equals(var12))
															if ((var6 != 0) && (var45.aShort915 == 0)) {
																var45.method447();
																var108 = false;
															} else if ((var6 == 0) && (var45.aShort915 != 0)) {
																var45.method447();
																var108 = false;
															}

													if (var108)
														client.aClass106_2253.method408(new Class121_Sub1(var12, var6));

													var44.anInt339 = var6;
												}

												var44.aString338 = var83;
												var44.anInt340 = var7;
												var44.aBool341 = var73;
												var44.aBool342 = var105;
												var12 = null;
												break;
											}
										} else if (var83.equals(var44.aString344)) {
											var44.aString344 = var12;
											var44.aString338 = var83;
											var12 = null;
											break;
										}
									}

									if ((null != var12) && (client.anInt2056 < 400)) {
										final Class32 var31 = new Class32();
										client.aClass32Array2098[client.anInt2056] = var31;
										var31.aString344 = var12;
										var31.aString338 = var83;
										var31.anInt339 = var6;
										var31.anInt340 = var7;
										var31.aBool341 = var73;
										var31.aBool342 = var105;
										++client.anInt2056;
									}
								}

								client.anInt2215 = 2;
								client.anInt2175 = client.anInt2067;
								var86 = false;
								var4 = client.anInt2056;

								while (var4 > 0) {
									var86 = true;
									--var4;

									for (var5 = 0; var5 < var4; ++var5) {
										var67 = false;
										final Class32 var69 = client.aClass32Array2098[var5];
										final Class32 var94 = client.aClass32Array2098[1 + var5];
										if ((var69.anInt339 != client.anInt2079)
												&& (var94.anInt339 == client.anInt2079))
											var67 = true;

										if (!var67 && (var69.anInt339 == 0) && (var94.anInt339 != 0))
											var67 = true;

										if (!var67 && !var69.aBool341 && var94.aBool341)
											var67 = true;

										if (!var67 && !var69.aBool342 && var94.aBool342)
											var67 = true;

										if (var67) {
											final Class32 var102 = client.aClass32Array2098[var5];
											client.aClass32Array2098[var5] = client.aClass32Array2098[1 + var5];
											client.aClass32Array2098[1 + var5] = var102;
											var86 = false;
										}
									}

									if (var86)
										break;
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 187) {
								var11 = client.aClass124_Sub14_Sub1_2026.method583();
								final byte var68 = client.aClass124_Sub14_Sub1_2026.method579();
								Class91.anIntArray712[var11] = var68;
								if (Class91.anIntArray711[var11] != var68) {
									Class91.anIntArray711[var11] = var68;
									Class124_Sub11.method539(var11);
								}

								client.anIntArray2246[(++client.anInt2169 - 1) & 31] = var11;
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if ((client.anInt2028 == 118) || (client.anInt2028 == 162) || (client.anInt2028 == 205)
									|| (client.anInt2028 == 131) || (client.anInt2028 == 183)
									|| (client.anInt2028 == 36) || (client.anInt2028 == 240) || (client.anInt2028 == 48)
									|| (client.anInt2028 == 56) || (client.anInt2028 == 234)) {
								Class124_Sub22_Sub19_Sub6.method966();
								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 207) {
								var11 = client.aClass124_Sub14_Sub1_2026.method562(-543913852);
								var4 = client.aClass124_Sub14_Sub1_2026.method544();
								var14 = Class10.method55(var11);
								if ((var14.anInt1229 != 2) || (var4 != var14.anInt1197)) {
									var14.anInt1229 = 2;
									var14.anInt1197 = var4;
									Class124_Sub22_Sub10.method723(var14);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 40) {
								var11 = client.aClass124_Sub14_Sub1_2026.method582();
								if (var11 == '\uffff')
									var11 = -1;

								var4 = client.aClass124_Sub14_Sub1_2026.method590();
								var5 = client.aClass124_Sub14_Sub1_2026.method595();
								var13 = Class10.method55(var4);
								Class124_Sub22_Sub10 var8;
								if (!var13.aBool1152) {
									if (var11 == -1) {
										var13.anInt1229 = 0;
										client.anInt2028 = -1;
										var1 = true;
										break label2501;
									}

									var8 = Class124_Sub22_Sub10.method724(var11);
									var13.anInt1229 = 4;
									var13.anInt1197 = var11;
									var13.anInt1202 = var8.anInt1500;
									var13.anInt1203 = var8.anInt1474;
									var13.anInt1205 = (var8.anInt1470 * 100) / var5;
									Class124_Sub22_Sub10.method723(var13);
								} else {
									var13.anInt1271 = var11;
									var13.anInt1272 = var5;
									var8 = Class124_Sub22_Sub10.method724(var11);
									var13.anInt1202 = var8.anInt1500;
									var13.anInt1203 = var8.anInt1474;
									var13.anInt1204 = var8.anInt1473;
									var13.anInt1200 = var8.anInt1477;
									var13.anInt1201 = var8.anInt1475;
									var13.anInt1205 = var8.anInt1470;
									if (var8.anInt1480 == 1)
										var13.anInt1209 = 1;
									else
										var13.anInt1209 = 2;

									if (var13.anInt1206 > 0)
										var13.anInt1205 = (var13.anInt1205 * 32) / var13.anInt1206;
									else if (var13.anInt1257 > 0)
										var13.anInt1205 = (var13.anInt1205 * 32) / var13.anInt1257;

									Class124_Sub22_Sub10.method723(var13);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 90) {
								client.anInt2108 = 0;
								client.anInt2029 = 0;
								Class124_Sub6.method521();
								Class124_Sub22_Sub2.method656();

								Class124_Sub22_Sub19_Sub3_Sub2 var82;
								for (; client.aClass124_Sub14_Sub1_2026.method843(client.anInt2027) >= 11; var82
										.method893(
												Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] + var33,
												var9 + Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0],
												var7 == 1)) {
									var11 = client.aClass124_Sub14_Sub1_2026.method839(11);
									if (var11 == 2047)
										break;

									var65 = false;
									if (client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11] == null) {
										client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11] = new Class124_Sub22_Sub19_Sub3_Sub2();
										if (null != client.aClass124_Sub14Array2256[var11])
											client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11]
													.method1044(client.aClass124_Sub14Array2256[var11]);

										var65 = true;
									}

									client.anIntArray2128[++client.anInt2090 - 1] = var11;
									var82 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var11];
									var82.anInt1716 = client.anInt2158;
									var6 = client.aClass124_Sub14_Sub1_2026.method839(1);
									if (var6 == 1)
										client.anIntArray2104[++client.anInt2029 - 1] = var11;

									var7 = client.aClass124_Sub14_Sub1_2026.method839(1);
									var9 = client.aClass124_Sub14_Sub1_2026.method839(5);
									if (var9 > 15)
										var9 -= 32;

									var10 = client.anIntArray2168[client.aClass124_Sub14_Sub1_2026.method839(3)];
									if (var65) {
										var82.anInt1672 = var10 * 1301162841;
										var82.anInt1718 = var10;
									}

									var33 = client.aClass124_Sub14_Sub1_2026.method839(5);
									if (var33 > 15)
										var33 -= 32;
								}

								client.aClass124_Sub14_Sub1_2026.method840();

								for (var11 = 0; var11 < client.anInt2029; ++var11) {
									var4 = client.anIntArray2104[var11];
									var82 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4];
									var6 = client.aClass124_Sub14_Sub1_2026.method558();
									if ((var6 & 4) != 0)
										var6 += client.aClass124_Sub14_Sub1_2026.method558() << 8;

									Class35.method192(var4, var82, var6);
								}

								for (var11 = 0; var11 < client.anInt2108; ++var11) {
									var4 = client.anIntArray2109[var11];
									if (client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4].anInt1716 != client.anInt2158)
										client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var4] = null;
								}

								if (client.aClass124_Sub14_Sub1_2026.anInt1075 != client.anInt2027)
									throw new RuntimeException(
											client.aClass124_Sub14_Sub1_2026.anInt1075 + "," + client.anInt2027);

								for (var11 = 0; var11 < client.anInt2090; ++var11)
									if (client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[client.anIntArray2128[var11]] == null)
										throw new RuntimeException(var11 + "," + client.anInt2090);

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 81) {
								var3 = client.aClass124_Sub14_Sub1_2026.method597();
								var38 = client.aClass124_Sub14_Sub1_2026.method560();
								var27 = client.aClass124_Sub14_Sub1_2026.method557();
								final Class74[] var24 = new Class74[] { Class74.aClass74_612, Class74.aClass74_613,
										Class74.aClass74_617, Class74.aClass74_616, Class74.aClass74_611 };
								final Class74 var32 = (Class74) Class23.method158(var24,
										client.aClass124_Sub14_Sub1_2026.method558());
								var20 = var27 + (var38 << 32);
								boolean var34 = false;

								for (var35 = 0; var35 < 100; ++var35)
									if (var20 == client.aLongArray2203[var35]) {
										var34 = true;
										break;
									}

								if (Class1.method12(var3))
									var34 = true;

								if (!var34 && (client.anInt2099 == 0)) {
									client.aLongArray2203[client.anInt2204] = var20;
									client.anInt2204 = (1 + client.anInt2204) % 100;
									final String var46 = Class124_Sub22_Sub16_Sub4
											.method1031(Class124_Sub22_Sub19_Sub1.method886(RuntimeException_Sub1
													.method1013(client.aClass124_Sub14_Sub1_2026)));
									byte var40;
									if (var32.aBool618)
										var40 = 7;
									else
										var40 = 3;

									if (var32.anInt614 != -1)
										Class20.method95(var40, Class99.method391(var32.anInt614) + var3, var46);
									else
										Class20.method95(var40, var3, var46);
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							if (client.anInt2028 == 24) {
								var11 = client.aClass124_Sub14_Sub1_2026.method590();
								var4 = client.aClass124_Sub14_Sub1_2026.method582();
								var14 = Class10.method55(var11);
								if ((var14 != null) && (var14.anInt1191 == 0)) {
									if (var4 > (var14.anInt1177 - var14.anInt1169))
										var4 = var14.anInt1177 - var14.anInt1169;

									if (var4 < 0)
										var4 = 0;

									if (var4 != var14.anInt1175) {
										var14.anInt1175 = var4;
										Class124_Sub22_Sub10.method723(var14);
									}
								}

								client.anInt2028 = -1;
								var1 = true;
								break label2501;
							}

							Class28.method166("" + client.anInt2028 + "," + client.anInt2032 + "," + client.anInt2086
									+ "," + client.anInt2027, (Throwable) null);
							Class30.method174();
						} catch (final IOException var60) {
							Class10.method60();
						} catch (final Exception var61) {
							var3 = "" + client.anInt2028 + "," + client.anInt2032 + "," + client.anInt2086 + ","
									+ client.anInt2027 + ","
									+ (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0] + Class9.anInt102)
									+ ","
									+ (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0] + Class95.anInt762)
									+ ",";

							for (var4 = 0; (var4 < client.anInt2027) && (var4 < 50); ++var4)
								var3 = var3 + client.aClass124_Sub14_Sub1_2026.aByteArray1073[var4] + ",";

							Class28.method166(var3, var61);
							Class30.method174();
						}

						var1 = true;
					}

				if (!var1)
					break;
			}

			if (client.anInt1992 == 30) {
				while (Class30.method175()) {
					client.aClass124_Sub14_Sub1_2024.method837(162);
					client.aClass124_Sub14_Sub1_2024.method545(0);
					var0 = client.aClass124_Sub14_Sub1_2024.anInt1075;
					Class124_Sub22_Sub3.method667(client.aClass124_Sub14_Sub1_2024);
					client.aClass124_Sub14_Sub1_2024.method555(client.aClass124_Sub14_Sub1_2024.anInt1075 - var0);
				}

				final Object var48 = Class47.aClass29_467.anObject319;
				int var98;
				synchronized (var48) {
					if (!client.aBool2174)
						Class47.aClass29_467.anInt315 = 0;
					else if ((Class81.anInt650 != 0) || (Class47.aClass29_467.anInt315 >= 40)) {
						client.aClass124_Sub14_Sub1_2024.method837(206);
						client.aClass124_Sub14_Sub1_2024.method545(0);
						var98 = client.aClass124_Sub14_Sub1_2024.anInt1075;
						var2 = 0;

						for (var11 = 0; (var11 < Class47.aClass29_467.anInt315)
								&& ((client.aClass124_Sub14_Sub1_2024.anInt1075 - var98) < 240); ++var11) {
							++var2;
							var4 = Class47.aClass29_467.anIntArray318[var11];
							if (var4 < 0)
								var4 = 0;
							else if (var4 > 502)
								var4 = 502;

							var5 = Class47.aClass29_467.anIntArray316[var11];
							if (var5 < 0)
								var5 = 0;
							else if (var5 > 764)
								var5 = 764;

							var6 = var5 + (var4 * 765);
							if ((Class47.aClass29_467.anIntArray318[var11] == -1)
									&& (Class47.aClass29_467.anIntArray316[var11] == -1)) {
								var5 = -1;
								var4 = -1;
								var6 = 524287;
							}

							if ((client.anInt1996 == var5) && (client.anInt1997 == var4)) {
								if (client.anInt1998 < 2047)
									++client.anInt1998;
							} else {
								var7 = var5 - client.anInt1996;
								client.anInt1996 = var5;
								var9 = var4 - client.anInt1997;
								client.anInt1997 = var4;
								if ((client.anInt1998 < 8) && (var7 >= -32) && (var7 <= 31) && (var9 >= -32)
										&& (var9 <= 31)) {
									var7 += 32;
									var9 += 32;
									client.aClass124_Sub14_Sub1_2024
											.method592((client.anInt1998 << 12) + (var7 << 6) + var9);
									client.anInt1998 = 0;
								} else if (client.anInt1998 < 8) {
									client.aClass124_Sub14_Sub1_2024
											.method547((client.anInt1998 << 19) + 8388608 + var6);
									client.anInt1998 = 0;
								} else {
									client.aClass124_Sub14_Sub1_2024
											.method548(-1073741824 + (client.anInt1998 << 19) + var6);
									client.anInt1998 = 0;
								}
							}
						}

						client.aClass124_Sub14_Sub1_2024.method555(client.aClass124_Sub14_Sub1_2024.anInt1075 - var98);
						if (var2 >= Class47.aClass29_467.anInt315)
							Class47.aClass29_467.anInt315 = 0;
						else {
							Class47.aClass29_467.anInt315 -= var2;

							for (var11 = 0; var11 < Class47.aClass29_467.anInt315; ++var11) {
								Class47.aClass29_467.anIntArray316[var11] = Class47.aClass29_467.anIntArray316[var11
										+ var2];
								Class47.aClass29_467.anIntArray318[var11] = Class47.aClass29_467.anIntArray318[var2
										+ var11];
							}
						}
					}
				}

				if ((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4))
						|| (Class81.anInt650 == 2)) {
					long var50 = (Class81.aLong660 - client.aLong1995) / 50L;
					if (var50 > 4095L)
						var50 = 4095L;

					client.aLong1995 = Class81.aLong660;
					var2 = Class81.anInt655;
					if (var2 < 0)
						var2 = 0;
					else if (var2 > Class81.anInt662)
						var2 = Class81.anInt662;

					var11 = Class81.anInt658;
					if (var11 < 0)
						var11 = 0;
					else if (var11 > Class56_Sub2.anInt1083)
						var11 = Class56_Sub2.anInt1083;

					var4 = (int) var50;
					client.aClass124_Sub14_Sub1_2024.method837(32);
					client.aClass124_Sub14_Sub1_2024.method592((Class81.anInt650 == 2 ? 1 : 0) + (var4 << 1));
					client.aClass124_Sub14_Sub1_2024.method592(var11);
					client.aClass124_Sub14_Sub1_2024.method592(var2);
				}

				if (Class84.anInt681 > 0) {
					client.aClass124_Sub14_Sub1_2024.method837(156);
					client.aClass124_Sub14_Sub1_2024.method592(0);
					var0 = client.aClass124_Sub14_Sub1_2024.anInt1075;
					final long var52 = Class74.method316(-183826630);

					for (var11 = 0; var11 < Class84.anInt681; ++var11) {
						var38 = var52 - client.aLong2208;
						if (var38 > 16777215L)
							var38 = 16777215L;

						client.aLong2208 = var52;
						client.aClass124_Sub14_Sub1_2024.method576(Class84.anIntArray687[var11]);
						client.aClass124_Sub14_Sub1_2024.method547((int) var38);
					}

					client.aClass124_Sub14_Sub1_2024.method554(client.aClass124_Sub14_Sub1_2024.anInt1075 - var0);
				}

				if (client.anInt2101 > 0)
					--client.anInt2101;

				if (Class84.aBoolArray676[96] || Class84.aBoolArray676[97] || Class84.aBoolArray676[98]
						|| Class84.aBoolArray676[99])
					client.aBool2044 = true;

				if (client.aBool2044 && (client.anInt2101 <= 0)) {
					client.anInt2101 = 20;
					client.aBool2044 = false;
					client.aClass124_Sub14_Sub1_2024.method837(238);
					client.aClass124_Sub14_Sub1_2024.method581(client.anInt2255);
					client.aClass124_Sub14_Sub1_2024.method587(client.anInt2076);
				}

				if (Class88.aBool702 && !client.aBool2212) {
					client.aBool2212 = true;
					client.aClass124_Sub14_Sub1_2024.method837(93);
					client.aClass124_Sub14_Sub1_2024.method545(1);
				}

				if (!Class88.aBool702 && client.aBool2212) {
					client.aBool2212 = false;
					client.aClass124_Sub14_Sub1_2024.method837(93);
					client.aClass124_Sub14_Sub1_2024.method545(0);
				}

				int var110;
				if (client.aBool1989 && (Class134.anInt906 != client.anInt2006))
					Class124_Sub22_Sub21.method882(Class124_Sub13.anInt1071, Class124_Sub22_Sub19_Sub6.anInt1824,
							Class134.anInt906, Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1722[0],
							Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anIntArray1723[0]);
				else if (Class134.anInt906 != client.anInt2211) {
					client.anInt2211 = Class134.anInt906;
					var0 = Class134.anInt906;
					final int[] var54 = Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954.anIntArray1735;
					var2 = var54.length;

					for (var11 = 0; var11 < var2; ++var11)
						var54[var11] = 0;

					for (var11 = 1; var11 < 103; ++var11) {
						var4 = 24628 + (2048 * (103 - var11));

						for (var5 = 1; var5 < 103; ++var5) {
							if ((Class27.aByteArrayArrayArray285[var0][var5][var11] & 24) == 0)
								Class36.aClass21_380.method142(var54, var4, 512, var0, var5, var11);

							if ((var0 < 3) && ((Class27.aByteArrayArrayArray285[var0 + 1][var5][var11] & 8) != 0))
								Class36.aClass21_380.method142(var54, var4, 512, 1 + var0, var5, var11);

							var4 += 4;
						}
					}

					var11 = (((238 + (int) (Math.random() * 20.0D)) - 10) << 16)
							+ (((238 + (int) (Math.random() * 20.0D)) - 10) << 8)
							+ ((238 + (int) (Math.random() * 20.0D)) - 10);
					var4 = ((238 + (int) (Math.random() * 20.0D)) - 10) << 16;
					Class124_Sub22_Sub19_Sub3_Sub2.aClass124_Sub22_Sub16_Sub1_1954.method900();

					for (var5 = 1; var5 < 103; ++var5)
						for (var6 = 1; var6 < 103; ++var6) {
							if ((Class27.aByteArrayArrayArray285[var0][var6][var5] & 24) == 0)
								Class29.method170(var0, var6, var5, var11, var4);

							if ((var0 < 3) && ((Class27.aByteArrayArrayArray285[1 + var0][var6][var5] & 8) != 0))
								Class29.method170(var0 + 1, var6, var5, var11, var4);
						}

					client.anInt2065 = 0;

					for (var5 = 0; var5 < 104; ++var5)
						for (var6 = 0; var6 < 104; ++var6) {
							var7 = Class36.aClass21_380.method126(Class134.anInt906, var5, var6);
							if (var7 != 0) {
								var7 = (var7 >> 14) & 32767;
								var9 = Class124_Sub22_Sub12.method736(var7).anInt1390;
								if (var9 >= 0) {
									var10 = var5;
									var33 = var6;
									if ((var9 != 22) && (var9 != 29) && (var9 != 34) && (var9 != 36) && (var9 != 46)
											&& (var9 != 47) && (var9 != 48)) {
										final int[][] var111 = client.aClass130Array2192[Class134.anInt906].anIntArrayArray894;

										for (var110 = 0; var110 < 10; ++var110) {
											var41 = (int) (Math.random() * 4.0D);
											if ((var41 == 0) && (var10 > 0) && (var10 > (var5 - 3))
													&& ((var111[var10 - 1][var33] & 19136776) == 0))
												--var10;

											if ((var41 == 1) && (var10 < 103) && (var10 < (3 + var5))
													&& ((var111[var10 + 1][var33] & 19136896) == 0))
												++var10;

											if ((var41 == 2) && (var33 > 0) && (var33 > (var6 - 3))
													&& ((var111[var10][var33 - 1] & 19136770) == 0))
												--var33;

											if ((var41 == 3) && (var33 < 103) && (var33 < (3 + var6))
													&& ((var111[var10][1 + var33] & 19136800) == 0))
												++var33;
										}
									}

									client.aClass124_Sub22_Sub16_Sub1Array2244[client.anInt2065] = Class98.aClass124_Sub22_Sub16_Sub1Array771[var9];
									client.anIntArray2213[client.anInt2065] = var10;
									client.anIntArray2214[client.anInt2065] = var33;
									++client.anInt2065;
								}
							}
						}

					Class64.aClass9_558.method54();
				}

				if (client.anInt1992 == 30) {
					Class50.method243();

					for (var0 = 0; var0 < client.anInt2225; ++var0) {
						--client.anIntArray2228[var0];
						if (client.anIntArray2228[var0] >= -10) {
							Class12 var115 = client.aClass12Array2230[var0];
							if (null == var115) {
								var115 = Class12.method68(Class39.aClass94_Sub1_399, client.anIntArray2226[var0], 0);
								if (var115 == null)
									continue;

								client.anIntArray2228[var0] += var115.method71();
								client.aClass12Array2230[var0] = var115;
							}

							if (client.anIntArray2228[var0] < 0) {
								if (client.anIntArray2229[var0] != 0) {
									var11 = (client.anIntArray2229[var0] & 255) * 128;
									var4 = (client.anIntArray2229[var0] >> 16) & 255;
									var5 = (64 + (var4 * 128)) - Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690;
									if (var5 < 0)
										var5 = -var5;

									var6 = (client.anIntArray2229[var0] >> 8) & 255;
									var7 = (64 + (128 * var6)) - Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697;
									if (var7 < 0)
										var7 = -var7;

									var9 = (var7 + var5) - 128;
									if (var9 > var11) {
										client.anIntArray2228[var0] = -100;
										continue;
									}

									if (var9 < 0)
										var9 = 0;

									var2 = ((var11 - var9) * client.anInt2206) / var11;
								} else
									var2 = client.anInt2239;

								if (var2 > 0) {
									final Class124_Sub2_Sub1 var66 = var115.method69().method821(Class27.aClass16_302);
									final Class124_Sub4_Sub1 var89 = Class124_Sub4_Sub1.method782(var66, 100, var2);
									var89.method812(client.anIntArray2227[var0] - 1);
									Class56_Sub2.aClass124_Sub4_Sub2_1078.method828(var89);
								}

								client.anIntArray2228[var0] = -100;
							}
						} else {
							--client.anInt2225;

							for (var98 = var0; var98 < client.anInt2225; ++var98) {
								client.anIntArray2226[var98] = client.anIntArray2226[1 + var98];
								client.aClass12Array2230[var98] = client.aClass12Array2230[var98 + 1];
								client.anIntArray2227[var98] = client.anIntArray2227[var98 + 1];
								client.anIntArray2228[var98] = client.anIntArray2228[var98 + 1];
								client.anIntArray2229[var98] = client.anIntArray2229[var98 + 1];
							}

							--var0;
						}
					}

					if (client.aBool2221 && !Class29.method169()) {
						if ((client.anInt2219 != 0) && (client.anInt2220 != -1))
							Class2.method19(Class5.aClass94_Sub1_58, client.anInt2220, 0, client.anInt2219, false);

						client.aBool2221 = false;
					}

					++client.anInt2193;
					if (client.anInt2193 > 750)
						Class10.method60();
					else {
						Class124_Sub22_Sub19_Sub3_Sub2 var47;
						for (var0 = -1; var0 < client.anInt2090; ++var0) {
							if (var0 == -1)
								var98 = 2047;
							else
								var98 = client.anIntArray2128[var0];

							var47 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var98];
							if (null != var47)
								Class53.method257(var47);
						}

						Class124_Sub14.method606((byte) -63);

						for (var0 = -1; var0 < client.anInt2090; ++var0) {
							if (var0 == -1)
								var98 = 2047;
							else
								var98 = client.anIntArray2128[var0];

							var47 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var98];
							if ((var47 != null) && (var47.anInt1685 > 0)) {
								--var47.anInt1685;
								if (var47.anInt1685 == 0)
									var47.aString1683 = null;
							}
						}

						for (var0 = 0; var0 < client.anInt2022; ++var0) {
							var98 = client.anIntArray2023[var0];
							final Class124_Sub22_Sub19_Sub3_Sub1 var112 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var98];
							if ((var112 != null) && (var112.anInt1685 > 0)) {
								--var112.anInt1685;
								if (var112.anInt1685 == 0)
									var112.aString1683 = null;
							}
						}

						++client.anInt2111;
						if (client.anInt2141 != 0) {
							client.anInt2089 += 20;
							if (client.anInt2089 >= 400)
								client.anInt2141 = 0;
						}

						if (Class72.aClass124_Sub17_598 != null) {
							++client.anInt2010;
							if (client.anInt2010 >= 15) {
								Class124_Sub22_Sub10.method723(Class72.aClass124_Sub17_598);
								Class72.aClass124_Sub17_598 = null;
							}
						}

						final Class124_Sub17 var114 = Class31.aClass124_Sub17_335;
						final Class124_Sub17 var116 = Class124_Sub6.aClass124_Sub17_1005;
						Class31.aClass124_Sub17_335 = null;
						Class124_Sub6.aClass124_Sub17_1005 = null;
						client.aClass124_Sub17_2159 = null;
						client.aBool2163 = false;
						client.aBool2160 = false;
						client.anInt2205 = 0;

						while (Class136.method485() && (client.anInt2205 < 128))
							if ((client.anInt2149 >= 2) && Class84.aBoolArray676[82]
									&& (Class124_Sub13.anInt1072 == 66)) {
								final String var113 = Class86.method340();
								client.aClipboard2002.setContents(new StringSelection(var113), (ClipboardOwner) null);
							} else {
								client.anIntArray2241[client.anInt2205] = Class124_Sub13.anInt1072;
								client.anIntArray2059[client.anInt2205] = Class124_Sub22_Sub6.aChar1394;
								++client.anInt2205;
							}

						var2 = client.anInt2142;
						var11 = Class56_Sub2.anInt1083;
						var4 = Class81.anInt662;
						if (Class89.method346(var2))
							Class42.method214(Class124_Sub22_Sub10.aClass124_Sub17ArrayArray1507[var2], -1, 0, 0, var11,
									var4, 0, 0);

						++client.anInt2067;

						while (true) {
							do {
								var91 = (Class124_Sub6) client.aClass111_2182.method427();
								if (var91 == null)
									while (true) {
										do {
											var91 = (Class124_Sub6) client.aClass111_2139.method427();
											if (null == var91)
												while (true) {
													do {
														var91 = (Class124_Sub6) client.aClass111_2181.method427();
														if (null == var91) {
															Class83.method337();
															if (client.aClass124_Sub17_2155 != null)
																Class20.method94();

															if (null != Class32.aClass124_Sub17_343) {
																Class124_Sub22_Sub10
																		.method723(Class32.aClass124_Sub17_343);
																++client.anInt2133;
																if (Class81.anInt651 == 0) {
																	if (client.aBool1985) {
																		if ((Class32.aClass124_Sub17_343 == Class124_Sub22_Sub1.aClass124_Sub17_1352)
																				&& (client.anInt2075 != client.anInt2093)) {
																			var14 = Class32.aClass124_Sub17_343;
																			byte var92 = 0;
																			if ((client.anInt2036 == 1)
																					&& (var14.anInt1157 == 206))
																				var92 = 1;

																			if (var14.anIntArray1269[client.anInt2075] <= 0)
																				var92 = 0;

																			var9 = Class124_Sub22_Sub19_Sub6
																					.method963(var14);
																			var76 = ((var9 >> 29) & 1) != 0;
																			if (var76) {
																				var10 = client.anInt2093;
																				var33 = client.anInt2075;
																				var14.anIntArray1269[var33] = var14.anIntArray1269[var10];
																				var14.anIntArray1270[var33] = var14.anIntArray1270[var10];
																				var14.anIntArray1269[var10] = -1;
																				var14.anIntArray1270[var10] = 0;
																			} else if (var92 == 1) {
																				var10 = client.anInt2093;
																				var33 = client.anInt2075;

																				while (var33 != var10)
																					if (var10 > var33) {
																						var14.method624(var10 - 1,
																								var10);
																						--var10;
																					} else if (var10 < var33) {
																						var14.method624(1 + var10,
																								var10);
																						++var10;
																					}
																			} else
																				var14.method624(client.anInt2075,
																						client.anInt2093);

																			client.aClass124_Sub14_Sub1_2024
																					.method837(212);
																			client.aClass124_Sub14_Sub1_2024
																					.method587(client.anInt2093);
																			client.aClass124_Sub14_Sub1_2024
																					.method592(client.anInt2075);
																			client.aClass124_Sub14_Sub1_2024.method586(
																					Class32.aClass124_Sub17_343.anInt1284);
																			client.aClass124_Sub14_Sub1_2024
																					.method545(var92);
																		}
																	} else if (((client.anInt2122 == 1)
																			|| Class53.method256(client.anInt2124 - 1))
																			&& (client.anInt2124 > 2))
																		Class124_Sub22_Sub12.method737(client.anInt2094,
																				client.anInt2095);
																	else if (client.anInt2124 > 0)
																		Class124_Sub13.method541(client.anInt2094,
																				client.anInt2095);

																	client.anInt2010 = 10;
																	Class81.anInt650 = 0;
																	Class32.aClass124_Sub17_343 = null;
																} else if ((client.anInt2133 >= 5)
																		&& ((Class81.anInt652 > (client.anInt2094 + 5))
																				|| (Class81.anInt652 < (client.anInt2094
																						- 5))
																				|| (Class81.anInt653 > (5
																						+ client.anInt2095))
																				|| (Class81.anInt653 < (client.anInt2095
																						- 5))))
																	client.aBool1985 = true;
															}

															if (Class21.anInt214 != -1) {
																var5 = Class21.anInt214;
																var6 = Class21.anInt222;
																client.aClass124_Sub14_Sub1_2024.method837(28);
																client.aClass124_Sub14_Sub1_2024.method545(5);
																client.aClass124_Sub14_Sub1_2024
																		.method581(var6 + Class95.anInt762);
																client.aClass124_Sub14_Sub1_2024
																		.method587(var5 + Class9.anInt102);
																client.aClass124_Sub14_Sub1_2024
																		.method578(Class84.aBoolArray676[82]
																				? (Class84.aBoolArray676[81] ? 2 : 1)
																				: 0);
																Class21.anInt214 = -1;
																client.anInt2087 = Class81.anInt658;
																client.anInt2088 = Class81.anInt655;
																client.anInt2141 = 1;
																client.anInt2089 = 0;
																client.anInt2194 = var5;
																client.anInt2217 = var6;
															}

															if (Class31.aClass124_Sub17_335 != var114) {
																if (null != var114)
																	Class124_Sub22_Sub10.method723(var114);

																if (Class31.aClass124_Sub17_335 != null)
																	Class124_Sub22_Sub10
																			.method723(Class31.aClass124_Sub17_335);
															}

															if ((var116 != Class124_Sub6.aClass124_Sub17_1005)
																	&& (client.anInt2134 == client.anInt2041)) {
																if (var116 != null)
																	Class124_Sub22_Sub10.method723(var116);

																if (null != Class124_Sub6.aClass124_Sub17_1005)
																	Class124_Sub22_Sub10.method723(
																			Class124_Sub6.aClass124_Sub17_1005);
															}

															if (null != Class124_Sub6.aClass124_Sub17_1005) {
																if (client.anInt2041 < client.anInt2134) {
																	++client.anInt2041;
																	if (client.anInt2041 == client.anInt2134)
																		Class124_Sub22_Sub10.method723(
																				Class124_Sub6.aClass124_Sub17_1005);
																}
															} else if (client.anInt2041 > 0)
																--client.anInt2041;

															var5 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690
																	+ client.anInt2046;
															var6 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697
																	+ client.anInt2048;
															if (((Class124_Sub11.anInt1046 - var5) < -500)
																	|| ((Class124_Sub11.anInt1046 - var5) > 500)
																	|| ((Class87.anInt689 - var6) < -500)
																	|| ((Class87.anInt689 - var6) > 500)) {
																Class124_Sub11.anInt1046 = var5;
																Class87.anInt689 = var6;
															}

															if (var5 != Class124_Sub11.anInt1046)
																Class124_Sub11.anInt1046 += (var5
																		- Class124_Sub11.anInt1046) / 16;

															if (var6 != Class87.anInt689)
																Class87.anInt689 += (var6 - Class87.anInt689) / 16;

															if ((Class81.anInt651 == 4) && Class7.aBool71) {
																var7 = Class81.anInt653 - client.anInt2070;
																client.anInt2068 = var7 * 2;
																client.anInt2070 = (var7 != -1) && (var7 != 1)
																		? (client.anInt2070 + Class81.anInt653) / 2
																		: Class81.anInt653;
																var9 = client.anInt2069 - Class81.anInt652;
																client.anInt2197 = var9 * 2;
																client.anInt2069 = (var9 != -1) && (var9 != 1)
																		? (Class81.anInt652 + client.anInt2069) / 2
																		: Class81.anInt652;
															} else {
																if (Class84.aBoolArray676[96])
																	client.anInt2197 += (-24 - client.anInt2197) / 2;
																else if (Class84.aBoolArray676[97])
																	client.anInt2197 += (24 - client.anInt2197) / 2;
																else
																	client.anInt2197 /= 2;

																if (Class84.aBoolArray676[98])
																	client.anInt2068 += (12 - client.anInt2068) / 2;
																else if (Class84.aBoolArray676[99])
																	client.anInt2068 += (-12 - client.anInt2068) / 2;
																else
																	client.anInt2068 /= 2;

																client.anInt2070 = Class81.anInt653;
																client.anInt2069 = Class81.anInt652;
															}

															client.anInt2255 = ((client.anInt2197 / 2)
																	+ client.anInt2255) & 2047;
															client.anInt2076 += client.anInt2068 / 2;
															if (client.anInt2076 < 128)
																client.anInt2076 = 128;

															if (client.anInt2076 > 383)
																client.anInt2076 = 383;

															var7 = Class124_Sub11.anInt1046 >> 7;
															var9 = Class87.anInt689 >> 7;
															var10 = Class63.method285(Class124_Sub11.anInt1046,
																	Class87.anInt689, Class134.anInt906);
															var33 = 0;
															if ((var7 > 3) && (var9 > 3) && (var7 < 100)
																	&& (var9 < 100))
																for (var43 = var7 - 4; var43 <= (var7 + 4); ++var43)
																	for (var107 = var9
																			- 4; var107 <= (var9 + 4); ++var107) {
																		var35 = Class134.anInt906;
																		if ((var35 < 3)
																				&& ((Class27.aByteArrayArrayArray285[1][var43][var107]
																						& 2) == 2))
																			++var35;

																		var110 = var10
																				- Class27.anIntArrayArrayArray284[var35][var43][var107];
																		if (var110 > var33)
																			var33 = var110;
																	}

															var43 = var33 * 192;
															if (var43 > 98048)
																var43 = 98048;

															if (var43 < '\u8000')
																var43 = '\u8000';

															if (var43 > client.anInt2187)
																client.anInt2187 += (var43 - client.anInt2187) / 24;
															else if (var43 < client.anInt2187)
																client.anInt2187 += (var43 - client.anInt2187) / 80;

															if (client.aBool2231)
																Class66.method294();

															for (var5 = 0; var5 < 5; ++var5)
																++client.anIntArray2236[var5];

															Class124_Sub6.aClass41_1006.method205();
															var5 = ++Class81.anInt648 - 1;
															var7 = Class30.method173();
															if ((var5 > 15000) && (var7 > 15000)) {
																client.anInt2034 = 250;
																Class81.anInt648 = 14500;
																client.aClass124_Sub14_Sub1_2024.method837(187);
															}

															++client.anInt2052;
															if (client.anInt2052 > 500) {
																client.anInt2052 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1)
																	client.anInt2046 += client.anInt2047;

																if ((var9 & 2) == 2)
																	client.anInt2048 += client.anInt2049;

																if ((var9 & 4) == 4)
																	client.anInt2050 += client.anInt2051;
															}

															if (client.anInt2046 < -50)
																client.anInt2047 = 2;

															if (client.anInt2046 > 50)
																client.anInt2047 = -2;

															if (client.anInt2048 < -55)
																client.anInt2049 = 2;

															if (client.anInt2048 > 55)
																client.anInt2049 = -2;

															if (client.anInt2050 < -40)
																client.anInt2051 = 1;

															if (client.anInt2050 > 40)
																client.anInt2051 = -1;

															++client.anInt2057;
															if (client.anInt2057 > 500) {
																client.anInt2057 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1)
																	client.anInt2053 += client.anInt2164;

																if ((var9 & 2) == 2)
																	client.anInt2055 += client.anInt2207;
															}

															if (client.anInt2053 < -60)
																client.anInt2164 = 2;

															if (client.anInt2053 > 60)
																client.anInt2164 = -2;

															if (client.anInt2055 < -20)
																client.anInt2207 = 1;

															if (client.anInt2055 > 10)
																client.anInt2207 = -1;

															for (Class121_Sub1 var97 = (Class121_Sub1) client.aClass106_2253
																	.method406(); var97 != null; var97 = (Class121_Sub1) client.aClass106_2253
																			.method407())
																if (var97.anInt916 < ((Class74.method316(301202106)
																		/ 1000L) - 5L)) {
																	if (var97.aShort915 > 0)
																		Class20.method95(5, "",
																				var97.aString914 + " has logged in.");

																	if (var97.aShort915 == 0)
																		Class20.method95(5, "",
																				var97.aString914 + " has logged out.");

																	var97.method447();
																}

															++client.anInt2025;
															if (client.anInt2025 > 50)
																client.aClass124_Sub14_Sub1_2024.method837(250);

															try {
																if ((null != Class73.aClass78_609)
																		&& (client.aClass124_Sub14_Sub1_2024.anInt1075 > 0)) {
																	Class73.aClass78_609.method323(
																			client.aClass124_Sub14_Sub1_2024.aByteArray1073,
																			0,
																			client.aClass124_Sub14_Sub1_2024.anInt1075);
																	client.aClass124_Sub14_Sub1_2024.anInt1075 = 0;
																	client.anInt2025 = 0;
																}
															} catch (final IOException var55) {
																Class10.method60();
															}

															return;
														}

														var13 = var91.aClass124_Sub17_994;
														if (var13.anInt1154 < 0)
															break;

														var70 = Class10.method55(var13.anInt1259);
													} while ((var70 == null) || (var70.aClass124_Sub17Array1263 == null)
															|| (var13.anInt1154 >= var70.aClass124_Sub17Array1263.length)
															|| (var13 != var70.aClass124_Sub17Array1263[var13.anInt1154]));

													Class124_Sub22_Sub19_Sub3_Sub2.method1048(var91);
												}

											var13 = var91.aClass124_Sub17_994;
											if (var13.anInt1154 < 0)
												break;

											var70 = Class10.method55(var13.anInt1259);
										} while ((var70 == null) || (var70.aClass124_Sub17Array1263 == null)
												|| (var13.anInt1154 >= var70.aClass124_Sub17Array1263.length)
												|| (var13 != var70.aClass124_Sub17Array1263[var13.anInt1154]));

										Class124_Sub22_Sub19_Sub3_Sub2.method1048(var91);
									}

								var13 = var91.aClass124_Sub17_994;
								if (var13.anInt1154 < 0)
									break;

								var70 = Class10.method55(var13.anInt1259);
							} while ((null == var70) || (null == var70.aClass124_Sub17Array1263)
									|| (var13.anInt1154 >= var70.aClass124_Sub17Array1263.length)
									|| (var13 != var70.aClass124_Sub17Array1263[var13.anInt1154]));

							Class124_Sub22_Sub19_Sub3_Sub2.method1048(var91);
						}
					}
				}
			}
		}
	}
}
