public final class Class42 {
	int anInt408;
	int anInt409;
	int anInt410;
	int anInt411;
	int anInt412;
	int anInt413;
	int anInt414;
	int anInt415;
	int anInt416;
	int anInt417;
	int anInt418;
	int anInt419;
	int anInt420;
	int anInt421;
	int anInt422;
	int anInt423;
	int anInt424;
	int anInt425;
	static int anInt426;
	static int[] anIntArray427;

	static final void method214(final Widget[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			final Widget var11 = var0[var8];
			if ((var11 != null)
					&& (!var11.aBool1152 || (var11.anInt1191 == 0) || var11.aBool1195
							|| (Class124_Sub22_Sub19_Sub6.method963(var11) != 0)
							|| (var11 == client.aClass124_Sub17_2199) || (var11.anInt1157 == 1338))
					&& (var11.anInt1259 == var1) && (!var11.aBool1152 || !Def4.method762(var11))) {
				final int var21 = var6 + var11.anInt1166;
				final int var9 = var11.anInt1223 + var7;
				int var10;
				int var13;
				int var16;
				int var17;
				int var18;
				int var19;
				int var22;
				int var23;
				if (var11.anInt1191 == 2) {
					var16 = var2;
					var17 = var3;
					var18 = var4;
					var19 = var5;
				} else if (var11.anInt1191 == 9) {
					var23 = var21;
					var10 = var9;
					var13 = var21 + var11.anInt1168;
					var22 = var9 + var11.anInt1169;
					if (var13 < var21) {
						var23 = var13;
						var13 = var21;
					}

					if (var22 < var9) {
						var10 = var22;
						var22 = var9;
					}

					++var13;
					++var22;
					var16 = var23 > var2 ? var23 : var2;
					var17 = var10 > var3 ? var10 : var3;
					var18 = var13 < var4 ? var13 : var4;
					var19 = var22 < var5 ? var22 : var5;
				} else {
					var23 = var21 + var11.anInt1168;
					var10 = var9 + var11.anInt1169;
					var16 = var21 > var2 ? var21 : var2;
					var17 = var9 > var3 ? var9 : var3;
					var18 = var23 < var4 ? var23 : var4;
					var19 = var10 < var5 ? var10 : var5;
				}

				if (var11 == client.aClass124_Sub17_2155) {
					client.aBool2163 = true;
					client.anInt2200 = var21;
					client.anInt2165 = var9;
				}

				if (!var11.aBool1152 || ((var16 < var18) && (var17 < var19))) {
					var23 = Class81.anInt652;
					var10 = Class81.anInt653;
					if (Class81.anInt650 != 0) {
						var23 = Class81.anInt658;
						var10 = Class81.anInt655;
					}

					if (var11.anInt1157 == 1337) {
						if (!client.aBool1993 && !client.aBool2240 && (var23 >= var16) && (var10 >= var17)
								&& (var23 < var18) && (var10 < var19))
							Class41.method201(var23, var10, var16, var17);
					} else {
						int var14;
						int var27;
						int var28;
						int var29;
						int var33;
						int var37;
						if (var11.anInt1157 == 1338) {
							if (((client.anInt2218 == 0) || (client.anInt2218 == 3))
									&& ((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4)))) {
								final Class124_Sub22_Sub20 var38 = var11.method629(true);
								if (var38 != null) {
									var22 = Class81.anInt658 - var21;
									var37 = Class81.anInt655 - var9;
									if (var38.method881(var22, var37)) {
										var22 -= var38.anInt1646 / 2;
										var37 -= var38.anInt1643 / 2;
										var33 = (client.anInt2053 + client.anInt2255) & 2047;
										var27 = Class124_Sub22_Sub16_Sub3.anIntArray1847[var33];
										var14 = Class124_Sub22_Sub16_Sub3.anIntArray1848[var33];
										var27 = (var27 * (256 + client.anInt2055)) >> 8;
										var14 = ((256 + client.anInt2055) * var14) >> 8;
										var29 = ((var37 * var27) + (var14 * var22)) >> 11;
										var28 = ((var14 * var37) - (var27 * var22)) >> 11;
										final int var30 = (var29
												+ Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690) >> 7;
										final int var26 = (Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697
												- var28) >> 7;
										client.secbuf.writeOpcode(165); // walking
										client.secbuf.writeByte(18);
										client.secbuf.writeAShort(var26 + Class95.anInt762);
										client.secbuf.method587(var30 + Class9.anInt102);
										client.secbuf.writeByteS(
												Class84.aBoolArray676[82] ? (Class84.aBoolArray676[81] ? 2 : 1) : 0);
										client.secbuf.writeByte(var22);
										client.secbuf.writeByte(var37);
										client.secbuf.writeShort(client.anInt2255);
										client.secbuf.writeByte(57);
										client.secbuf.writeByte(client.anInt2053);
										client.secbuf.writeByte(client.anInt2055);
										client.secbuf.writeByte(89); // looks same in evey rev
										client.secbuf
												.writeShort(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1690);
										client.secbuf
												.writeShort(Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.anInt1697);
										client.secbuf.writeByte(63);
										client.anInt2194 = var30;
										client.anInt2217 = var26;
									}
								}
							}
						} else {
							if (!client.aBool2240 && (var23 >= var16) && (var10 >= var17) && (var23 < var18)
									&& (var10 < var19))
								Class101.method402(var11, var23 - var21, var10 - var9);

							if (var11.anInt1191 == 0) {
								if (!var11.aBool1152 && Def4.method762(var11)
										&& (var11 != Class31.aClass124_Sub17_335))
									continue;

								method214(var0, var11.anInt1284, var16, var17, var18, var19, var21 - var11.anInt1174,
										var9 - var11.anInt1175);
								if (null != var11.aClass124_Sub17Array1263)
									method214(var11.aClass124_Sub17Array1263, var11.anInt1284, var16, var17, var18,
											var19, var21 - var11.anInt1174, var9 - var11.anInt1175);

								final Class124_Sub7 var25 = (Class124_Sub7) client.aClass107_2143
										.method409(var11.anInt1284);
								if (null != var25) {
									if ((var25.anInt1008 == 0) && (Class81.anInt652 >= var16)
											&& (Class81.anInt653 >= var17) && (Class81.anInt652 < var18)
											&& (Class81.anInt653 < var19) && !client.aBool2240 && !client.aBool2021) {
										for (Class124_Sub6 var31 = (Class124_Sub6) client.aClass111_2181
												.method428(); var31 != null; var31 = (Class124_Sub6) client.aClass111_2181
														.method430())
											if (var31.aBool996) {
												var31.method450();
												var31.aClass124_Sub17_994.aBool1276 = false;
											}

										if (Class35.anInt375 == 0) {
											client.aClass124_Sub17_2155 = null;
											client.aClass124_Sub17_2199 = null;
										}

										if (!client.aBool2240) {
											client.aStringArray2129[0] = "Cancel";
											client.aStringArray2130[0] = "";
											client.anIntArray2127[0] = 1006;
											client.anInt2124 = 1;
										}
									}

									var22 = var25.anInt1012;
									if (Class89.loadwidget(var22))
										method214(Def10.widgets[var22], -1, var16,
												var17, var18, var19, var21, var9);
								}
							}

							if (var11.aBool1152) {
								Class124_Sub6 var36;
								if (!var11.aBool1260) {
									if (var11.aBool1285 && (Class81.anInt652 >= var16) && (Class81.anInt653 >= var17)
											&& (Class81.anInt652 < var18) && (Class81.anInt653 < var19))
										for (var36 = (Class124_Sub6) client.aClass111_2181
												.method428(); null != var36; var36 = (Class124_Sub6) client.aClass111_2181
														.method430())
											if (var36.aBool996
													&& (var36.aClass124_Sub17_994.anObjectArray1252 == var36.anObjectArray995))
												var36.method450();
								} else if ((Class81.anInt652 >= var16) && (Class81.anInt653 >= var17)
										&& (Class81.anInt652 < var18) && (Class81.anInt653 < var19)) {
									for (var36 = (Class124_Sub6) client.aClass111_2181
											.method428(); var36 != null; var36 = (Class124_Sub6) client.aClass111_2181
													.method430())
										if (var36.aBool996) {
											var36.method450();
											var36.aClass124_Sub17_994.aBool1276 = false;
										}

									if (Class35.anInt375 == 0) {
										client.aClass124_Sub17_2155 = null;
										client.aClass124_Sub17_2199 = null;
									}

									if (!client.aBool2240) {
										client.aStringArray2129[0] = "Cancel";
										client.aStringArray2130[0] = "";
										client.anIntArray2127[0] = 1006;
										client.anInt2124 = 1;
									}
								}

								boolean var34;
								if ((Class81.anInt652 >= var16) && (Class81.anInt653 >= var17)
										&& (Class81.anInt652 < var18) && (Class81.anInt653 < var19))
									var34 = true;
								else
									var34 = false;

								boolean var35 = false;
								if (((Class81.anInt651 == 1) || (!Class7.aBool71 && (Class81.anInt651 == 4))) && var34)
									var35 = true;

								boolean var24 = false;
								if (((Class81.anInt650 == 1) || (!Class7.aBool71 && (Class81.anInt650 == 4)))
										&& (Class81.anInt658 >= var16) && (Class81.anInt655 >= var17)
										&& (Class81.anInt658 < var18) && (Class81.anInt655 < var19))
									var24 = true;

								if (var24)
									Class35.method194(var11, Class81.anInt658 - var21, Class81.anInt655 - var9);

								if ((null != client.aClass124_Sub17_2155) && (var11 != client.aClass124_Sub17_2155)
										&& var34) {
									var27 = Class124_Sub22_Sub19_Sub6.method963(var11);
									final boolean var12 = ((var27 >> 20) & 1) != 0;
									if (var12)
										client.aClass124_Sub17_2159 = var11;
								}

								if (var11 == client.aClass124_Sub17_2199) {
									client.aBool2160 = true;
									client.anInt2161 = var21;
									client.anInt2162 = var9;
								}

								if (var11.aBool1195) {
									Class124_Sub6 var20;
									if (var34 && (client.anInt2183 != 0) && (var11.anObjectArray1252 != null)) {
										var20 = new Class124_Sub6();
										var20.aBool996 = true;
										var20.aClass124_Sub17_994 = var11;
										var20.anInt1004 = client.anInt2183;
										var20.anObjectArray995 = var11.anObjectArray1252;
										client.aClass111_2181.method424(var20);
									}

									if ((null != client.aClass124_Sub17_2155) || (Class32.aClass124_Sub17_343 != null)
											|| client.aBool2240) {
										var24 = false;
										var35 = false;
										var34 = false;
									}

									if (!var11.aBool1277 && var24) {
										var11.aBool1277 = true;
										if (var11.anObjectArray1233 != null) {
											var20 = new Class124_Sub6();
											var20.aBool996 = true;
											var20.aClass124_Sub17_994 = var11;
											var20.anInt998 = Class81.anInt658 - var21;
											var20.anInt1004 = Class81.anInt655 - var9;
											var20.anObjectArray995 = var11.anObjectArray1233;
											client.aClass111_2181.method424(var20);
										}
									}

									if (var11.aBool1277 && var35 && (var11.anObjectArray1234 != null)) {
										var20 = new Class124_Sub6();
										var20.aBool996 = true;
										var20.aClass124_Sub17_994 = var11;
										var20.anInt998 = Class81.anInt652 - var21;
										var20.anInt1004 = Class81.anInt653 - var9;
										var20.anObjectArray995 = var11.anObjectArray1234;
										client.aClass111_2181.method424(var20);
									}

									if (var11.aBool1277 && !var35) {
										var11.aBool1277 = false;
										if (null != var11.anObjectArray1235) {
											var20 = new Class124_Sub6();
											var20.aBool996 = true;
											var20.aClass124_Sub17_994 = var11;
											var20.anInt998 = Class81.anInt652 - var21;
											var20.anInt1004 = Class81.anInt653 - var9;
											var20.anObjectArray995 = var11.anObjectArray1235;
											client.aClass111_2139.method424(var20);
										}
									}

									if (var35 && (null != var11.anObjectArray1194)) {
										var20 = new Class124_Sub6();
										var20.aBool996 = true;
										var20.aClass124_Sub17_994 = var11;
										var20.anInt998 = Class81.anInt652 - var21;
										var20.anInt1004 = Class81.anInt653 - var9;
										var20.anObjectArray995 = var11.anObjectArray1194;
										client.aClass111_2181.method424(var20);
									}

									if (!var11.aBool1276 && var34) {
										var11.aBool1276 = true;
										if (null != var11.anObjectArray1226) {
											var20 = new Class124_Sub6();
											var20.aBool996 = true;
											var20.aClass124_Sub17_994 = var11;
											var20.anInt998 = Class81.anInt652 - var21;
											var20.anInt1004 = Class81.anInt653 - var9;
											var20.anObjectArray995 = var11.anObjectArray1226;
											client.aClass111_2181.method424(var20);
										}
									}

									if (var11.aBool1276 && var34 && (null != var11.anObjectArray1238)) {
										var20 = new Class124_Sub6();
										var20.aBool996 = true;
										var20.aClass124_Sub17_994 = var11;
										var20.anInt998 = Class81.anInt652 - var21;
										var20.anInt1004 = Class81.anInt653 - var9;
										var20.anObjectArray995 = var11.anObjectArray1238;
										client.aClass111_2181.method424(var20);
									}

									if (var11.aBool1276 && !var34) {
										var11.aBool1276 = false;
										if (null != var11.anObjectArray1160) {
											var20 = new Class124_Sub6();
											var20.aBool996 = true;
											var20.aClass124_Sub17_994 = var11;
											var20.anInt998 = Class81.anInt652 - var21;
											var20.anInt1004 = Class81.anInt653 - var9;
											var20.anObjectArray995 = var11.anObjectArray1160;
											client.aClass111_2139.method424(var20);
										}
									}

									if (null != var11.anObjectArray1250) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1250;
										client.aClass111_2182.method424(var20);
									}

									Class124_Sub6 var15;
									if ((var11.anObjectArray1244 != null) && (client.anInt2169 > var11.anInt1279)) {
										if ((var11.anIntArray1281 != null)
												&& ((client.anInt2169 - var11.anInt1279) <= 32))
											label836: for (var33 = var11.anInt1279; var33 < client.anInt2169; ++var33) {
												var27 = client.anIntArray2246[var33 & 31];

												for (var14 = 0; var14 < var11.anIntArray1281.length; ++var14)
													if (var11.anIntArray1281[var14] == var27) {
														var15 = new Class124_Sub6();
														var15.aClass124_Sub17_994 = var11;
														var15.anObjectArray995 = var11.anObjectArray1244;
														client.aClass111_2181.method424(var15);
														break label836;
													}
											}
										else {
											var20 = new Class124_Sub6();
											var20.aClass124_Sub17_994 = var11;
											var20.anObjectArray995 = var11.anObjectArray1244;
											client.aClass111_2181.method424(var20);
										}

										var11.anInt1279 = client.anInt2169;
									}

									if ((var11.anObjectArray1246 != null) && (client.anInt2060 > var11.anInt1275)) {
										if ((null != var11.anIntArray1282)
												&& ((client.anInt2060 - var11.anInt1275) <= 32))
											label812: for (var33 = var11.anInt1275; var33 < client.anInt2060; ++var33) {
												var27 = client.anIntArray2170[var33 & 31];

												for (var14 = 0; var14 < var11.anIntArray1282.length; ++var14)
													if (var27 == var11.anIntArray1282[var14]) {
														var15 = new Class124_Sub6();
														var15.aClass124_Sub17_994 = var11;
														var15.anObjectArray995 = var11.anObjectArray1246;
														client.aClass111_2181.method424(var15);
														break label812;
													}
											}
										else {
											var20 = new Class124_Sub6();
											var20.aClass124_Sub17_994 = var11;
											var20.anObjectArray995 = var11.anObjectArray1246;
											client.aClass111_2181.method424(var20);
										}

										var11.anInt1275 = client.anInt2060;
									}

									if ((null != var11.anObjectArray1248) && (client.anInt2173 > var11.anInt1245)) {
										if ((null != var11.anIntArray1249)
												&& ((client.anInt2173 - var11.anInt1245) <= 32))
											label788: for (var33 = var11.anInt1245; var33 < client.anInt2173; ++var33) {
												var27 = client.anIntArray2072[var33 & 31];

												for (var14 = 0; var14 < var11.anIntArray1249.length; ++var14)
													if (var27 == var11.anIntArray1249[var14]) {
														var15 = new Class124_Sub6();
														var15.aClass124_Sub17_994 = var11;
														var15.anObjectArray995 = var11.anObjectArray1248;
														client.aClass111_2181.method424(var15);
														break label788;
													}
											}
										else {
											var20 = new Class124_Sub6();
											var20.aClass124_Sub17_994 = var11;
											var20.anObjectArray995 = var11.anObjectArray1248;
											client.aClass111_2181.method424(var20);
										}

										var11.anInt1245 = client.anInt2173;
									}

									if ((client.anInt2097 > var11.anInt1162) && (var11.anObjectArray1144 != null)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1144;
										client.aClass111_2181.method424(var20);
									}

									if ((client.anInt2175 > var11.anInt1162) && (null != var11.anObjectArray1255)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1255;
										client.aClass111_2181.method424(var20);
									}

									if ((client.anInt2176 > var11.anInt1162) && (null != var11.anObjectArray1231)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1231;
										client.aClass111_2181.method424(var20);
									}

									if ((client.anInt2177 > var11.anInt1162) && (null != var11.anObjectArray1261)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1261;
										client.aClass111_2181.method424(var20);
									}

									if ((client.anInt2178 > var11.anInt1162) && (var11.anObjectArray1262 != null)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1262;
										client.aClass111_2181.method424(var20);
									}

									if ((client.anInt2179 > var11.anInt1162) && (var11.anObjectArray1253 != null)) {
										var20 = new Class124_Sub6();
										var20.aClass124_Sub17_994 = var11;
										var20.anObjectArray995 = var11.anObjectArray1253;
										client.aClass111_2181.method424(var20);
									}

									var11.anInt1162 = client.anInt2067;
									if (var11.anObjectArray1254 != null)
										for (var33 = 0; var33 < client.anInt2205; ++var33) {
											final Class124_Sub6 var32 = new Class124_Sub6();
											var32.aClass124_Sub17_994 = var11;
											var32.anInt999 = client.anIntArray2241[var33];
											var32.anInt993 = client.anIntArray2059[var33];
											var32.anObjectArray995 = var11.anObjectArray1254;
											client.aClass111_2181.method424(var32);
										}
								}
							}

							if (!var11.aBool1152 && (null == client.aClass124_Sub17_2155)
									&& (null == Class32.aClass124_Sub17_343) && !client.aBool2240) {
								if (((var11.anInt1266 >= 0) || (var11.anInt1242 != 0)) && (Class81.anInt652 >= var16)
										&& (Class81.anInt653 >= var17) && (Class81.anInt652 < var18)
										&& (Class81.anInt653 < var19))
									if (var11.anInt1266 >= 0)
										Class31.aClass124_Sub17_335 = var0[var11.anInt1266];
									else
										Class31.aClass124_Sub17_335 = var11;

								if ((var11.anInt1191 == 8) && (Class81.anInt652 >= var16) && (Class81.anInt653 >= var17)
										&& (Class81.anInt652 < var18) && (Class81.anInt653 < var19))
									Class124_Sub6.aClass124_Sub17_1005 = var11;

								if (var11.anInt1177 > var11.anInt1169) {
									var13 = var11.anInt1168 + var21;
									var22 = var11.anInt1169;
									var37 = var11.anInt1177;
									var33 = Class81.anInt652;
									var27 = Class81.anInt653;
									if (client.aBool2156)
										client.anInt2064 = 32;
									else
										client.anInt2064 = 0;

									client.aBool2156 = false;
									if ((Class81.anInt651 == 1) || (!Class7.aBool71 && (Class81.anInt651 == 4)))
										if ((var33 >= var13) && (var33 < (var13 + 16)) && (var27 >= var9)
												&& (var27 < (var9 + 16))) {
											var11.anInt1175 -= 4;
											Def10.settrue(var11);
										} else if ((var33 >= var13) && (var33 < (var13 + 16))
												&& (var27 >= ((var22 + var9) - 16)) && (var27 < (var22 + var9))) {
											var11.anInt1175 += 4;
											Def10.settrue(var11);
										} else if ((var33 >= (var13 - client.anInt2064))
												&& (var33 < (client.anInt2064 + 16 + var13)) && (var27 >= (var9 + 16))
												&& (var27 < ((var9 + var22) - 16))) {
											var14 = ((var22 - 32) * var22) / var37;
											if (var14 < 8)
												var14 = 8;

											var29 = var27 - var9 - 16 - (var14 / 2);
											var28 = var22 - 32 - var14;
											var11.anInt1175 = ((var37 - var22) * var29) / var28;
											Def10.settrue(var11);
											client.aBool2156 = true;
										}

									if (client.anInt2183 != 0) {
										var14 = var11.anInt1168;
										if ((var33 >= (var13 - var14)) && (var27 >= var9) && (var33 < (var13 + 16))
												&& (var27 <= (var9 + var22))) {
											var11.anInt1175 += client.anInt2183 * 45;
											Def10.settrue(var11);
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	protected static final void method215() {
		Class89.aClass56_704.method266(1856060647);

		int var0;
		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1971[var0] = 0L;

		for (var0 = 0; var0 < 32; ++var0)
			Applet_Sub1.aLongArray1972[var0] = 0L;

		Class124_Sub22_Sub19_Sub3_Sub1.anInt1940 = 0;
	}

	static final int method216(final int var0, final int var1, final int var2) {
		final int var3 = var0 / var2;
		final int var6 = var0 & (var2 - 1);
		final int var4 = var1 / var2;
		final int var5 = var1 & (var2 - 1);
		final int var7 = Class124_Sub9.method533(var3, var4);
		final int var8 = Class124_Sub9.method533(1 + var3, var4);
		final int var10 = Class124_Sub9.method533(var3, 1 + var4);
		final int var9 = Class124_Sub9.method533(1 + var3, var4 + 1);
		final int var12 = Class74.method314(var7, var8, var6, var2);
		final int var11 = Class74.method314(var10, var9, var6, var2);
		return Class74.method314(var12, var11, var5, var2);
	}
}
