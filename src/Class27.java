public final class Class27 {
	static int[] anIntArray287;
	static byte[][][] aByteArrayArrayArray288;
	static byte[][][] aByteArrayArrayArray289;
	static int[] anIntArray291;
	static int[] anIntArray292;
	static byte[][][] aByteArrayArrayArray293;
	static int anInt301;
	static Class16 aClass16_302;
	public static Class82 aClass82_303;
	static int[][][] anIntArrayArrayArray304;
	static int anInt305;
	static int[][][] anIntArrayArrayArray284 = new int[4][105][105];
	static byte[][][] aByteArrayArrayArray285 = new byte[4][104][104];
	static int anInt290 = 99;
	static int[] anIntArray294 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray286 = new int[] { 16, 32, 64, 128 };
	static int[] anIntArray295 = new int[] { 1, 0, -1, 0 };
	static int[] anIntArray296 = new int[] { 0, -1, 0, 1 };
	static int[] anIntArray297 = new int[] { 1, -1, -1, 1 };
	static int[] anIntArray298 = new int[] { -1, -1, 1, 1 };
	static int anInt299 = (int) (Math.random() * 17.0D) - 8;
	static int anInt300 = (int) (Math.random() * 33.0D) - 16;

	static final void method163() {
		Class21.aBool192 = false;
		client.aBool1989 = false;
	}

	static final void method164(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = var1; var4 <= (var3 + var1); ++var4)
			for (int var5 = var0; var5 <= (var2 + var0); ++var5)
				if ((var5 >= 0) && (var5 < 104) && (var4 >= 0) && (var4 < 104)) {
					aByteArrayArrayArray289[0][var5][var4] = 127;
					if ((var0 == var5) && (var5 > 0))
						anIntArrayArrayArray284[0][var5][var4] = anIntArrayArrayArray284[0][var5 - 1][var4];

					if (((var2 + var0) == var5) && (var5 < 103))
						anIntArrayArrayArray284[0][var5][var4] = anIntArrayArrayArray284[0][var5 + 1][var4];

					if ((var4 == var1) && (var4 > 0))
						anIntArrayArrayArray284[0][var5][var4] = anIntArrayArrayArray284[0][var5][var4 - 1];

					if ((var4 == (var3 + var1)) && (var4 < 103))
						anIntArrayArrayArray284[0][var5][var4] = anIntArrayArrayArray284[0][var5][var4 + 1];
				}

	}

	static final void method165(final Widget[] var0, final int var1, final int var2, final int var3,
			final int var4, final int var5, final int var6, final int var7, final int var8) {
		Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
		Class124_Sub22_Sub16_Sub3.method970();

		for (final Widget element : var0) {
			final Widget var11 = element;
			if ((null != var11) && ((var11.anInt1259 == var1)
					|| ((var1 == -1412584499) && (client.aClass124_Sub17_2155 == var11)))) {
				int var18;
				if (var8 == -1) {
					client.anIntArray2190[client.anInt2185] = var11.anInt1166 + var6;
					client.anIntArray2223[client.anInt2185] = var11.anInt1223 + var7;
					client.anIntArray2209[client.anInt2185] = var11.anInt1168;
					client.anIntArray2222[client.anInt2185] = var11.anInt1169;
					var18 = ++client.anInt2185 - 1;
				} else
					var18 = var8;

				var11.anInt1239 = var18;
				var11.anInt1283 = client.anInt2158;
				if (!var11.aBool1152 || !Def4.method762(var11)) {
					int var10;
					if (var11.anInt1157 > 0) {
						var10 = var11.anInt1157;
						if (var10 == 324) {
							if (client.anInt2257 == -1) {
								client.anInt2257 = var11.anInt1186;
								client.anInt2258 = var11.anInt1187 * -1;
							}

							if (client.aClass100_2250.aBool779)
								var11.anInt1186 = client.anInt2257;
							else
								var11.anInt1186 = client.anInt2258 * -1;
						} else if (var10 == 325) {
							if (client.anInt2257 == -1) {
								client.anInt2257 = var11.anInt1186;
								client.anInt2258 = var11.anInt1187 * -1;
							}

							if (client.aClass100_2250.aBool779)
								var11.anInt1186 = client.anInt2258 * -1;
							else
								var11.anInt1186 = client.anInt2257;
						} else if (var10 == 327) {
							var11.anInt1202 = 150;
							var11.anInt1203 = (int) (Math.sin(client.anInt2158 / 40.0D) * 256.0D) & 2047;
							var11.anInt1229 = 5;
							var11.anInt1197 = 0;
						} else if (var10 == 328) {
							var11.anInt1202 = 150;
							var11.anInt1203 = (int) (Math.sin(client.anInt2158 / 40.0D) * 256.0D) & 2047;
							var11.anInt1229 = 5;
							var11.anInt1197 = 1;
						}
					}

					var10 = var6 + var11.anInt1166;
					int var12 = var11.anInt1223 + var7;
					int var39 = var11.anInt1183;
					int var24;
					int var25;
					if (client.aClass124_Sub17_2155 == var11) {
						if ((var1 != -1412584499) && !var11.aBool1153) {
							Class2.aClass124_Sub17Array12 = var0;
							Class48.anInt478 = var6;
							Class87.anInt691 = var7;
							continue;
						}

						if (client.aBool2233 && client.aBool2160) {
							var24 = Class81.anInt652;
							var25 = Class81.anInt653;
							var24 -= client.anInt2157;
							var25 -= client.anInt2145;
							if (var24 < client.anInt2161)
								var24 = client.anInt2161;

							if ((var11.anInt1168 + var24) > (client.anInt2161 + client.aClass124_Sub17_2199.anInt1168))
								var24 = (client.aClass124_Sub17_2199.anInt1168 + client.anInt2161) - var11.anInt1168;

							if (var25 < client.anInt2162)
								var25 = client.anInt2162;

							if ((var25 + var11.anInt1169) > (client.aClass124_Sub17_2199.anInt1169 + client.anInt2162))
								var25 = (client.aClass124_Sub17_2199.anInt1169 + client.anInt2162) - var11.anInt1169;

							var10 = var24;
							var12 = var25;
						}

						if (!var11.aBool1153)
							var39 = 128;
					}

					int var9;
					int var13;
					int var15;
					int var19;
					int var30;
					int var31;
					if (var11.anInt1191 == 2) {
						var24 = var2;
						var25 = var3;
						var30 = var4;
						var31 = var5;
					} else if (var11.anInt1191 == 9) {
						var19 = var10;
						var9 = var12;
						var13 = var10 + var11.anInt1168;
						var15 = var11.anInt1169 + var12;
						if (var13 < var10) {
							var19 = var13;
							var13 = var10;
						}

						if (var15 < var12) {
							var9 = var15;
							var15 = var12;
						}

						++var13;
						++var15;
						var24 = var19 > var2 ? var19 : var2;
						var25 = var9 > var3 ? var9 : var3;
						var30 = var13 < var4 ? var13 : var4;
						var31 = var15 < var5 ? var15 : var5;
					} else {
						var19 = var11.anInt1168 + var10;
						var9 = var11.anInt1169 + var12;
						var24 = var10 > var2 ? var10 : var2;
						var25 = var12 > var3 ? var12 : var3;
						var30 = var19 < var4 ? var19 : var4;
						var31 = var9 < var5 ? var9 : var5;
					}

					if (!var11.aBool1152 || ((var24 < var30) && (var25 < var31))) {
						if (var11.anInt1157 != 0) {
							if (var11.anInt1157 == 1336) {
								if (client.aBool2000) {
									var12 += 15;
									Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714.method1035(
											"Fps:" + Applet_Sub1.anInt1970, var11.anInt1168 + var10, var12, 16776960,
											-1);
									var12 += 15;
									final Runtime var53 = Runtime.getRuntime();
									var9 = (int) ((var53.totalMemory() - var53.freeMemory()) / 1024L);
									var13 = 16776960;
									if ((var9 > '\u8000') && client.aBool1989)
										var13 = 16711680;

									if ((var9 > 65536) && !client.aBool1989)
										var13 = 16711680;

									Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714.method1035("Mem:" + var9 + "k",
											var10 + var11.anInt1168, var12, var13, -1);
									var12 += 15;
								}
								continue;
							}

							if (var11.anInt1157 == 1337) {
								client.anInt2172 = var10;
								client.anInt2132 = var12;
								Def19.method697(var10, var12, var11.anInt1168, var11.anInt1169);
								client.aBoolArray2061[var11.anInt1239] = true;
								Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
								continue;
							}

							if (var11.anInt1157 == 1338) {
								Class1.method14(var11, var10, var12, var18);
								Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
								continue;
							}

							if (var11.anInt1157 == 1339) {
								Class124_Sub22_Sub19_Sub6.method967(var11, var10, var12);
								Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
								continue;
							}
						}

						if (var11.anInt1191 == 0) {
							if (!var11.aBool1152 && Def4.method762(var11)
									&& (Class31.aClass124_Sub17_335 != var11))
								continue;

							if (!var11.aBool1152) {
								if (var11.anInt1175 > (var11.anInt1177 - var11.anInt1169))
									var11.anInt1175 = var11.anInt1177 - var11.anInt1169;

								if (var11.anInt1175 < 0)
									var11.anInt1175 = 0;
							}

							method165(var0, var11.anInt1284, var24, var25, var30, var31, var10 - var11.anInt1174,
									var12 - var11.anInt1175, var18);
							if (var11.aClass124_Sub17Array1263 != null)
								method165(var11.aClass124_Sub17Array1263, var11.anInt1284, var24, var25, var30, var31,
										var10 - var11.anInt1174, var12 - var11.anInt1175, var18);

							final Class124_Sub7 var38 = (Class124_Sub7) client.aClass107_2143
									.method409(var11.anInt1284);
							if (var38 != null)
								Def6.method692(var38.anInt1012, var24, var25, var30, var31, var10, var12,
										var18);

							Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
							Class124_Sub22_Sub16_Sub3.method970();
						}

						if (client.aBool2196 || client.aBoolArray2189[var18] || (client.anInt1990 > 1)) {
							if ((var11.anInt1191 == 0) && !var11.aBool1152 && (var11.anInt1177 > var11.anInt1169))
								Class26.method162(var11.anInt1168 + var10, var12, var11.anInt1175, var11.anInt1169,
										var11.anInt1177);

							if (var11.anInt1191 != 1) {
								int var21;
								int var22;
								int var23;
								int var28;
								int var29;
								if (var11.anInt1191 == 2) {
									var19 = 0;

									for (var9 = 0; var9 < var11.anInt1165; ++var9)
										for (var13 = 0; var13 < var11.anInt1257; ++var13) {
											var15 = var10 + (var13 * (var11.anInt1217 + 32));
											var28 = ((var11.anInt1180 + 32) * var9) + var12;
											if (var19 < 20) {
												var15 += var11.anIntArray1219[var19];
												var28 += var11.anIntArray1220[var19];
											}

											if (var11.anIntArray1269[var19] <= 0) {
												if ((null != var11.anIntArray1221) && (var19 < 20)) {
													final Class124_Sub22_Sub16_Sub1 var54 = var11.method626(var19);
													if (var54 != null)
														var54.method907(var15, var28);
													else if (Widget.aBool1151)
														Class124_Sub22_Sub10.method723(var11);
												}
											} else {
												var23 = var11.anIntArray1269[var19] - 1;
												if ((((var15 + 32) > var2) && (var15 < var4) && ((32 + var28) > var3)
														&& (var28 < var5))
														|| ((var11 == Class32.aClass124_Sub17_343)
																&& (var19 == client.anInt2093))) {
													Class124_Sub22_Sub16_Sub1 var27;
													if ((client.anInt2135 == 1) && (var19 == Class87.anInt692)
															&& (Class38.anInt398 == var11.anInt1284))
														var27 = Class124_Sub22_Sub19_Sub6.method964(var23,
																var11.anIntArray1270[var19], 2, 0, 2, false);
													else
														var27 = Class124_Sub22_Sub19_Sub6.method964(var23,
																var11.anIntArray1270[var19], 1, 3153952, 2, false);

													if (var27 != null) {
														if ((Class32.aClass124_Sub17_343 == var11)
																&& (var19 == client.anInt2093)) {
															var21 = Class81.anInt652 - client.anInt2094;
															var22 = Class81.anInt653 - client.anInt2095;
															if ((var21 < 5) && (var21 > -5))
																var21 = 0;

															if ((var22 < 5) && (var22 > -5))
																var22 = 0;

															if (client.anInt2133 < 5) {
																var21 = 0;
																var22 = 0;
															}

															var27.method903(var15 + var21, var28 + var22, 128);
															if (var1 != -1) {
																final Widget var26 = var0[var1 & '\uffff'];
																if (((var28 + var22) < Class124_Sub22_Sub16.anInt1564)
																		&& (var26.anInt1175 > 0)) {
																	var29 = (client.anInt2111
																			* (Class124_Sub22_Sub16.anInt1564 - var28
																					- var22))
																			/ 3;
																	if (var29 > (client.anInt2111 * 10))
																		var29 = client.anInt2111 * 10;

																	if (var29 > var26.anInt1175)
																		var29 = var26.anInt1175;

																	var26.anInt1175 -= var29;
																	client.anInt2095 += var29;
																	Class124_Sub22_Sub10.method723(var26);
																}

																if (((var28 + var22
																		+ 32) > Class124_Sub22_Sub16.anInt1568)
																		&& (var26.anInt1175 < (var26.anInt1177
																				- var26.anInt1169))) {
																	var29 = (((32 + var22 + var28)
																			- Class124_Sub22_Sub16.anInt1568)
																			* client.anInt2111) / 3;
																	if (var29 > (client.anInt2111 * 10))
																		var29 = client.anInt2111 * 10;

																	if (var29 > (var26.anInt1177 - var26.anInt1169
																			- var26.anInt1175))
																		var29 = var26.anInt1177 - var26.anInt1169
																				- var26.anInt1175;

																	var26.anInt1175 += var29;
																	client.anInt2095 -= var29;
																	Class124_Sub22_Sub10.method723(var26);
																}
															}
														} else if ((Class72.aClass124_Sub17_598 == var11)
																&& (var19 == client.anInt2092))
															var27.method903(var15, var28, 128);
														else
															var27.method907(var15, var28);
													} else
														Class124_Sub22_Sub10.method723(var11);
												}
											}

											++var19;
										}
								} else if (var11.anInt1191 == 3) {
									if (Class1.method13(var11)) {
										var19 = var11.anInt1179;
										if ((Class31.aClass124_Sub17_335 == var11) && (var11.anInt1181 != 0))
											var19 = var11.anInt1181;
									} else {
										var19 = var11.anInt1178;
										if ((Class31.aClass124_Sub17_335 == var11) && (var11.anInt1242 != 0))
											var19 = var11.anInt1242;
									}

									if (var39 == 0) {
										if (var11.aBool1218)
											Class124_Sub22_Sub16.method768(var10, var12, var11.anInt1168,
													var11.anInt1169, var19);
										else
											Class124_Sub22_Sub16.method769(var10, var12, var11.anInt1168,
													var11.anInt1169, var19);
									} else if (var11.aBool1218)
										Class124_Sub22_Sub16.method767(var10, var12, var11.anInt1168, var11.anInt1169,
												var19, 256 - (var39 & 255));
									else
										Class124_Sub22_Sub16.method770(var10, var12, var11.anInt1168, var11.anInt1169,
												var19, 256 - (var39 & 255));
								} else {
									Somet1 var51;
									if (var11.anInt1191 == 4) {
										var51 = var11.method631();
										if (null == var51) {
											if (Widget.aBool1151)
												Class124_Sub22_Sub10.method723(var11);
										} else {
											String var44 = var11.aString1185;
											if (Class1.method13(var11)) {
												var9 = var11.anInt1179;
												if ((Class31.aClass124_Sub17_335 == var11) && (var11.anInt1181 != 0))
													var9 = var11.anInt1181;

												if (var11.aString1212.length() > 0)
													var44 = var11.aString1212;
											} else {
												var9 = var11.anInt1178;
												if ((Class31.aClass124_Sub17_335 == var11) && (var11.anInt1242 != 0))
													var9 = var11.anInt1242;
											}

											if (var11.aBool1152 && (var11.anInt1271 != -1)) {
												final Class124_Sub22_Sub10 var50 = Class124_Sub22_Sub10
														.method724(var11.anInt1271);
												var44 = var50.aString1472;
												if (var44 == null)
													var44 = "null";

												if (((var50.anInt1480 == 1) || (var11.anInt1272 != 1))
														&& (var11.anInt1272 != -1))
													var44 = Class124_Sub4_Sub3.method874(16748608) + var44 + "</col>"
															+ " " + '\u0078' + Class18.method87(var11.anInt1272);
											}

											if (client.aClass124_Sub17_2042 == var11) {
												var44 = "Please wait...";
												var9 = var11.anInt1178;
											}

											if (!var11.aBool1152)
												var44 = Def14.method726(var44, var11);

											var51.method1027(var44, var10, var12, var11.anInt1168, var11.anInt1169,
													var9, var11.aBool1211 ? 0 : -1, var11.anInt1214, var11.anInt1215,
													var11.anInt1213);
										}
									} else if (var11.anInt1191 == 5) {
										Class124_Sub22_Sub16_Sub1 var52;
										if (!var11.aBool1152) {
											var52 = var11.method625(Class1.method13(var11));
											if (null != var52)
												var52.method907(var10, var12);
											else if (Widget.aBool1151)
												Class124_Sub22_Sub10.method723(var11);
										} else {
											if (var11.anInt1271 != -1)
												var52 = Class124_Sub22_Sub19_Sub6.method964(var11.anInt1271,
														var11.anInt1272, var11.anInt1167, var11.anInt1280,
														var11.anInt1209, false);
											else
												var52 = var11.method625(false);

											if (var52 == null) {
												if (Widget.aBool1151)
													Class124_Sub22_Sub10.method723(var11);
											} else {
												var9 = var52.anInt1733;
												var13 = var52.anInt1734;
												if (!var11.aBool1189) {
													var15 = (var11.anInt1168 * 4096) / var9;
													if (var11.anInt1188 != 0)
														var52.method919((var11.anInt1168 / 2) + var10,
																var12 + (var11.anInt1169 / 2), var11.anInt1188, var15);
													else if (var39 != 0)
														var52.method921(var10, var12, var11.anInt1168, var11.anInt1169,
																256 - (var39 & 255));
													else if ((var9 == var11.anInt1168) && (var13 == var11.anInt1169))
														var52.method907(var10, var12);
													else
														var52.method908(var10, var12, var11.anInt1168, var11.anInt1169);
												} else {
													Class124_Sub22_Sub16.method778(var10, var12,
															var10 + var11.anInt1168, var12 + var11.anInt1169);
													var15 = (var11.anInt1168 + (var9 - 1)) / var9;
													var28 = ((var13 - 1) + var11.anInt1169) / var13;

													for (var21 = 0; var21 < var15; ++var21)
														for (var22 = 0; var22 < var28; ++var22)
															if (var11.anInt1188 != 0)
																var52.method919((var9 / 2) + (var9 * var21) + var10,
																		(var13 / 2) + (var13 * var22) + var12,
																		var11.anInt1188, 4096);
															else if (var39 != 0)
																var52.method903((var21 * var9) + var10,
																		(var13 * var22) + var12, 256 - (var39 & 255));
															else
																var52.method907(var10 + (var9 * var21),
																		(var22 * var13) + var12);

													Class124_Sub22_Sub16.method764(var2, var3, var4, var5);
												}
											}
										}
									} else {
										Class124_Sub22_Sub10 var20;
										if (var11.anInt1191 == 6) {
											final boolean var46 = Class1.method13(var11);
											if (var46)
												var9 = var11.anInt1199;
											else
												var9 = var11.anInt1222;

											Class124_Sub22_Sub19_Sub7 var43 = null;
											var15 = 0;
											if (var11.anInt1271 != -1) {
												var20 = Class124_Sub22_Sub10.method724(var11.anInt1271);
												if (var20 != null) {
													var20 = var20.method717(var11.anInt1272);
													var43 = var20.method720(1);
													if (null != var43) {
														var43.method989();
														var15 = var43.anInt1605 / 2;
													} else
														Class124_Sub22_Sub10.method723(var11);
												}
											} else if (var11.anInt1229 == 5) {
												if (var11.anInt1197 == 0)
													var43 = client.aClass100_2250.method399((Def12) null,
															-1, (Def12) null, -1);
												else
													var43 = Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246
															.method834(1009220469);
											} else if (var9 == -1) {
												var43 = var11.method627((Def12) null, -1, var46,
														Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943);
												if ((null == var43) && Widget.aBool1151)
													Class124_Sub22_Sub10.method723(var11);
											} else {
												final Def12 var47 = Def15.method750(var9);
												var43 = var11.method627(var47, var11.anInt1273, var46,
														Class22.aClass124_Sub22_Sub19_Sub3_Sub2_246.aClass100_1943);
												if ((null == var43) && Widget.aBool1151)
													Class124_Sub22_Sub10.method723(var11);
											}

											Class124_Sub22_Sub16_Sub3.method971(var10 + (var11.anInt1168 / 2),
													var12 + (var11.anInt1169 / 2));
											var28 = (var11.anInt1205
													* Class124_Sub22_Sub16_Sub3.anIntArray1847[var11.anInt1202]) >> 16;
											var21 = (Class124_Sub22_Sub16_Sub3.anIntArray1848[var11.anInt1202]
													* var11.anInt1205) >> 16;
											if (null != var43)
												if (!var11.aBool1152)
													var43.method1006(0, var11.anInt1203, 0, var11.anInt1202, 0, var28,
															var21);
												else {
													var43.method989();
													if (var11.aBool1208)
														var43.method998(0, var11.anInt1203, var11.anInt1204,
																var11.anInt1202, var11.anInt1200,
																var11.anInt1201 + var28 + var15,
																var11.anInt1201 + var21, var11.anInt1205);
													else
														var43.method1006(0, var11.anInt1203, var11.anInt1204,
																var11.anInt1202, var11.anInt1200,
																var11.anInt1201 + var28 + var15,
																var11.anInt1201 + var21);
												}

											Class124_Sub22_Sub16_Sub3.method986();
										} else {
											if (var11.anInt1191 == 7) {
												var51 = var11.method631();
												if (var51 == null) {
													if (Widget.aBool1151)
														Class124_Sub22_Sub10.method723(var11);
													continue;
												}

												var9 = 0;

												for (var13 = 0; var13 < var11.anInt1165; ++var13)
													for (var15 = 0; var15 < var11.anInt1257; ++var15) {
														if (var11.anIntArray1269[var9] > 0) {
															var20 = Class124_Sub22_Sub10
																	.method724(var11.anIntArray1269[var9] - 1);
															String var40;
															if ((var20.anInt1480 != 1)
																	&& (var11.anIntArray1270[var9] == 1))
																var40 = Class124_Sub4_Sub3.method874(16748608)
																		+ var20.aString1472 + "</col>";
															else
																var40 = Class124_Sub4_Sub3.method874(16748608)
																		+ var20.aString1472 + "</col>" + " " + '\u0078'
																		+ Class18.method87(var11.anIntArray1270[var9]);

															var22 = ((115 + var11.anInt1217) * var15) + var10;
															var23 = ((var11.anInt1180 + 12) * var13) + var12;
															if (var11.anInt1214 == 0)
																var51.method1020(var40, var22, var23, var11.anInt1178,
																		var11.aBool1211 ? 0 : -1);
															else if (var11.anInt1214 == 1)
																var51.method1021(var40, var22 + (var11.anInt1168 / 2),
																		var23, var11.anInt1178,
																		var11.aBool1211 ? 0 : -1);
															else
																var51.method1035(var40, (var22 + var11.anInt1168) - 1,
																		var23, var11.anInt1178,
																		var11.aBool1211 ? 0 : -1);
														}

														++var9;
													}
											}

											int var17;
											if ((var11.anInt1191 == 8) && (Class124_Sub6.aClass124_Sub17_1005 == var11)
													&& (client.anInt2134 == client.anInt2041)) {
												var19 = 0;
												var9 = 0;
												final Somet1 var16 = Class91.aClass124_Sub22_Sub16_Sub4_Sub1_714;
												String var32 = var11.aString1185;

												String var45;
												for (var32 = Def14.method726(var32, var11); var32
														.length() > 0; var9 += 1 + var16.anInt1934) {
													var21 = var32.indexOf("<br>");
													if (var21 != -1) {
														var45 = var32.substring(0, var21);
														var32 = var32.substring(4 + var21);
													} else {
														var45 = var32;
														var32 = "";
													}

													var22 = var16.method1018(var45);
													if (var22 > var19)
														var19 = var22;
												}

												var19 += 6;
												var9 += 7;
												var21 = (var11.anInt1168 + var10) - 5 - var19;
												var22 = var11.anInt1169 + var12 + 5;
												if (var21 < (var10 + 5))
													var21 = 5 + var10;

												if ((var21 + var19) > var4)
													var21 = var4 - var19;

												if ((var22 + var9) > var5)
													var22 = var5 - var9;

												Class124_Sub22_Sub16.method768(var21, var22, var19, var9, 16777120);
												Class124_Sub22_Sub16.method769(var21, var22, var19, var9, 0);
												var32 = var11.aString1185;
												var23 = var16.anInt1934 + var22 + 2;

												for (var32 = Def14.method726(var32, var11); var32
														.length() > 0; var23 += 1 + var16.anInt1934) {
													var17 = var32.indexOf("<br>");
													if (var17 != -1) {
														var45 = var32.substring(0, var17);
														var32 = var32.substring(4 + var17);
													} else {
														var45 = var32;
														var32 = "";
													}

													var16.method1020(var45, var21 + 3, var23, 0, -1);
												}
											}

											if (var11.anInt1191 == 9)
												if (var11.anInt1237 == 1) {
													if (var11.aBool1182) {
														var19 = var10;
														var9 = var12 + var11.anInt1169;
														var13 = var11.anInt1168 + var10;
														var15 = var12;
													} else {
														var19 = var10;
														var9 = var12;
														var13 = var10 + var11.anInt1168;
														var15 = var11.anInt1169 + var12;
													}

													Class124_Sub22_Sub16.method774(var19, var9, var13, var15,
															var11.anInt1178);
												} else {
													var19 = var11.anInt1168 >= 0 ? var11.anInt1168 : -var11.anInt1168;
													var9 = var11.anInt1169 >= 0 ? var11.anInt1169 : -var11.anInt1169;
													var13 = var19;
													if (var19 < var9)
														var13 = var9;

													if (var13 != 0) {
														var15 = (var11.anInt1168 << 16) / var13;
														var28 = (var11.anInt1169 << 16) / var13;
														if (var28 <= var15)
															var15 = -var15;
														else
															var28 = -var28;

														var21 = (var28 * var11.anInt1237) >> 17;
														var22 = (1 + (var11.anInt1237 * var28)) >> 17;
														var23 = (var15 * var11.anInt1237) >> 17;
														var17 = (1 + (var15 * var11.anInt1237)) >> 17;
														final int var36 = var21 + var10;
														var29 = var10 - var22;
														final int var37 = (var10 + var11.anInt1168) - var22;
														final int var41 = var11.anInt1168 + var10 + var21;
														final int var33 = var23 + var12;
														final int var34 = var12 - var17;
														final int var35 = (var12 + var11.anInt1169) - var17;
														final int var42 = var23 + var11.anInt1169 + var12;
														Class124_Sub22_Sub16_Sub3.method975(var36, var29, var37);
														Class124_Sub22_Sub16_Sub3.method978(var33, var34, var35, var36,
																var29, var37, var11.anInt1178);
														Class124_Sub22_Sub16_Sub3.method975(var36, var37, var41);
														Class124_Sub22_Sub16_Sub3.method978(var33, var35, var42, var36,
																var37, var41, var11.anInt1178);
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
		}

	}
}
