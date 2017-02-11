import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public final class Class9_Sub1 extends Class9 implements ImageProducer, ImageObserver {
	static int anInt922;
	ColorModel aColorModel924;
	ImageConsumer anImageConsumer923;

	@Override
	public void startProduction(final ImageConsumer var1) {
		addConsumer(var1);
	}

	@Override
	final void method51(final int var1, final int var2, final Component var3, final int var4) {
		anInt96 = var1;
		anInt99 = var2;
		anIntArray103 = new int[(var2 * var1) + 1];
		aColorModel924 = new DirectColorModel(32, 16711680, '\uff00', 255);
		anImage98 = var3.createImage(this);
		method491();
		var3.prepareImage(anImage98, this);
		method491();
		var3.prepareImage(anImage98, this);
		method491();
		var3.prepareImage(anImage98, this);
		method54();
	}

	@Override
	public final void method52(final Graphics var1, final int var2, final int var3, final byte var4) {
		method491();
		var1.drawImage(anImage98, var2, var3, this);
	}

	@Override
	public final void method53(final Graphics var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		method492(var2, var3, var4, var5);
		final Shape var7 = var1.getClip();
		var1.clipRect(var2, var3, var4, var5);
		var1.drawImage(anImage98, 0, 0, this);
		var1.setClip(var7);
	}

	@Override
	public synchronized void addConsumer(final ImageConsumer var1) {
		anImageConsumer923 = var1;
		var1.setDimensions(anInt96, anInt99);
		var1.setProperties((Hashtable) null);
		var1.setColorModel(aColorModel924);
		var1.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer(final ImageConsumer var1) {
		return anImageConsumer923 == var1;
	}

	synchronized void method491() {
		if (anImageConsumer923 != null) {
			anImageConsumer923.setPixels(0, 0, anInt96, anInt99, aColorModel924, anIntArray103, 0, anInt96);
			anImageConsumer923.imageComplete(2);
		}
	}

	synchronized void method492(final int var1, final int var2, final int var3, final int var4) {
		if (null != anImageConsumer923) {
			anImageConsumer923.setPixels(var1, var2, var3, var4, aColorModel924, anIntArray103, (anInt96 * var2) + var1,
					anInt96);
			anImageConsumer923.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(final Image var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		return true;
	}

	@Override
	public void requestTopDownLeftRightResend(final ImageConsumer var1) {
	}

	@Override
	public synchronized void removeConsumer(final ImageConsumer var1) {
		if (var1 == anImageConsumer923)
			anImageConsumer923 = null;

	}

	public static Object method493(final byte[] var0, final boolean var1) {
		if (var0 == null)
			return null;
		else {
			if ((var0.length > 136) && !Class55.aBool535)
				try {
					final Class55_Sub1 var2 = new Class55_Sub1();
					var2.method261(var0, (byte) -11);
					return var2;
				} catch (final Throwable var3) {
					Class55.aBool535 = true;
				}

			return var0;
		}
	}

	static final void render() {
		Class46.push250(false);
		client.anInt2037 = 0;
		boolean objdecoded = true;

		int var6;
		for (var6 = 0; var6 < Class124_Sub18.xteaMdata.length; ++var6) {
			if ((Class10.xteaM[var6] != -1) && (null == Class124_Sub18.xteaMdata[var6])) {
				Class124_Sub18.xteaMdata[var6] = Class125.aClass94_Sub1_883
						.decode(Class10.xteaM[var6], 0);
				if (Class124_Sub18.xteaMdata[var6] == null) {
					objdecoded = false;
					++client.anInt2037;
				}
			}

			if ((Def9.xteaL[var6] != -1)
					&& (null == Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[var6])) {
				Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[var6] = Class125.aClass94_Sub1_883.decode(
						Def9.xteaL[var6], 0, Def10.anIntArrayArray1466[var6]);
				if (Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[var6] == null) {
					objdecoded = false;
					++client.anInt2037;
				}
			}
		}

		if (!objdecoded)
			client.anInt2113 = 1;
		else {
			client.anInt2039 = 0;
			objdecoded = true;

			int var7;
			int var9;
			for (var6 = 0; var6 < Class124_Sub18.xteaMdata.length; ++var6) {
				final byte[] var14 = Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[var6];
				if (null != var14) {
					var7 = ((Class124_Sub22_Sub19_Sub6.anIntArray1822[var6] >> 8) * 64) - Class9.anInt102;
					var9 = (64 * (Class124_Sub22_Sub19_Sub6.anIntArray1822[var6] & 255)) - Class95.anInt762;
					if (client.create) {
						var7 = 10;
						var9 = 10;
					}

					objdecoded &= Def5.objdecode(var14, var7, var9);
				}
			}

			if (!objdecoded)
				client.anInt2113 = 2;
			else {
				if (client.anInt2113 != 0)
					InvIdk.method523("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

				Def15.method751();
				Def9.method639();
				Def15.method751();
				Class36.aClass21_380.method98();
				Def15.method751();
				System.gc();

				for (var6 = 0; var6 < 4; ++var6)
					client.aClass130Array2192[var6].method463();

				int var13;
				for (var6 = 0; var6 < 4; ++var6)
					for (var13 = 0; var13 < 104; ++var13)
						for (var7 = 0; var7 < 104; ++var7)
							Class27.aByteArrayArrayArray285[var6][var13][var7] = 0;

				Def15.method751();
				Def1.method664(523078311);
				var6 = Class124_Sub18.xteaMdata.length;
				InvIdk.method527();
				Class46.push250(true);
				int var2;
				int h;
				int var5;
				int var8;
				int x;
				int z;
				int var21;
				if (!client.create) {
					byte[] var19;
					for (var13 = 0; var13 < var6; ++var13) {
						var7 = (64 * (Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] >> 8)) - Class9.anInt102;
						var9 = ((Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] & 255) * 64) - Class95.anInt762;
						var19 = Class124_Sub18.xteaMdata[var13];
						if (var19 != null) {
							Def15.method751();
							var21 = (Class124_Sub13.anInt1071 * 8) - 48;
							var2 = (Class124_Sub22_Sub19_Sub6.anInt1824 * 8) - 48;
							final Class130[] var22 = client.aClass130Array2192;

							for (var5 = 0; var5 < 4; ++var5)
								for (h = 0; h < 64; ++h)
									for (x = 0; x < 64; ++x)
										if (((h + var7) > 0) && ((var7 + h) < 103) && ((var9 + x) > 0)
												&& ((x + var9) < 103))
											var22[var5].anIntArrayArray894[var7 + h][var9 + x] &= -16777217;

							final RSBuf var25 = new RSBuf(var19);

							for (h = 0; h < 4; ++h)
								for (x = 0; x < 64; ++x)
									for (z = 0; z < 64; ++z)
										Class45.tilecli(var25, h, x + var7, z + var9, var21, var2, 0);
						}
					}

					for (var13 = 0; var13 < var6; ++var13) {
						var7 = (64 * (Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] >> 8)) - Class9.anInt102;
						var9 = (64 * (Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] & 255)) - Class95.anInt762;
						var19 = Class124_Sub18.xteaMdata[var13];
						if ((var19 == null) && (Class124_Sub22_Sub19_Sub6.anInt1824 < 800)) {
							Def15.method751();
							Class27.method164(var7, var9, 64, 64);
						}
					}

					Class46.push250(true);

					for (var13 = 0; var13 < var6; ++var13) {
						final byte[] var23 = Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[var13];
						if (null != var23) {
							var9 = (64 * (Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] >> 8)) - Class9.anInt102;
							var8 = ((Class124_Sub22_Sub19_Sub6.anIntArray1822[var13] & 255) * 64) - Class95.anInt762;
							Def15.method751();
							Def1.method668(var23, var9, var8, Class36.aClass21_380,
									client.aClass130Array2192);
						}
					}
				}

				int var4;
				if (client.create) {
					for (var13 = 0; var13 < 4; ++var13) {
						Def15.method751();

						for (var7 = 0; var7 < 13; ++var7)
							for (var9 = 0; var9 < 13; ++var9) {
								boolean var41 = false;
								var21 = client.anIntArrayArrayArray1994[var13][var7][var9];
								if (var21 != -1) {
									var2 = (var21 >> 24) & 3;
									var4 = (var21 >> 1) & 3;
									var5 = (var21 >> 14) & 1023;
									h = (var21 >> 3) & 2047;
									x = (h / 8) + ((var5 / 8) << 8);

									for (z = 0; z < Class124_Sub22_Sub19_Sub6.anIntArray1822.length; ++z)
										if ((x == Class124_Sub22_Sub19_Sub6.anIntArray1822[z])
												&& (Class124_Sub18.xteaMdata[z] != null)) {
											Class7.method35(Class124_Sub18.xteaMdata[z], var13, var7 * 8,
													8 * var9, var2, 8 * (var5 & 7), 8 * (h & 7), var4,
													client.aClass130Array2192);
											var41 = true;
											break;
										}
								}

								if (!var41) {
									var2 = var13;
									var4 = 8 * var7;
									var5 = var9 * 8;

									for (h = 0; h < 8; ++h)
										for (x = 0; x < 8; ++x)
											Class27.anIntArrayArrayArray284[var2][h + var4][var5 + x] = 0;

									if (var4 > 0)
										for (h = 1; h < 8; ++h)
											Class27.anIntArrayArrayArray284[var2][var4][h
													+ var5] = Class27.anIntArrayArrayArray284[var2][var4 - 1][var5
															+ h];

									if (var5 > 0)
										for (h = 1; h < 8; ++h)
											Class27.anIntArrayArrayArray284[var2][h
													+ var4][var5] = Class27.anIntArrayArrayArray284[var2][h
															+ var4][var5 - 1];

									if ((var4 > 0) && (Class27.anIntArrayArrayArray284[var2][var4 - 1][var5] != 0))
										Class27.anIntArrayArrayArray284[var2][var4][var5] = Class27.anIntArrayArrayArray284[var2][var4
												- 1][var5];
									else if ((var5 > 0) && (Class27.anIntArrayArrayArray284[var2][var4][var5 - 1] != 0))
										Class27.anIntArrayArrayArray284[var2][var4][var5] = Class27.anIntArrayArrayArray284[var2][var4][var5
												- 1];
									else if ((var4 > 0) && (var5 > 0)
											&& (Class27.anIntArrayArrayArray284[var2][var4 - 1][var5 - 1] != 0))
										Class27.anIntArrayArrayArray284[var2][var4][var5] = Class27.anIntArrayArrayArray284[var2][var4
												- 1][var5 - 1];
								}
							}
					}

					for (var13 = 0; var13 < 13; ++var13)
						for (var7 = 0; var7 < 13; ++var7) {
							var9 = client.anIntArrayArrayArray1994[0][var13][var7];
							if (var9 == -1)
								Class27.method164(var13 * 8, 8 * var7, 8, 8);
						}

					Class46.push250(true);

					for (var13 = 0; var13 < 4; ++var13) {
						Def15.method751();

						for (var7 = 0; var7 < 13; ++var7)
							label453: for (var9 = 0; var9 < 13; ++var9) {
								var8 = client.anIntArrayArrayArray1994[var13][var7][var9];
								if (var8 != -1) {
									var21 = (var8 >> 24) & 3;
									var2 = (var8 >> 1) & 3;
									var4 = (var8 >> 14) & 1023;
									var5 = (var8 >> 3) & 2047;
									h = ((var4 / 8) << 8) + (var5 / 8);

									for (x = 0; x < Class124_Sub22_Sub19_Sub6.anIntArray1822.length; ++x)
										if ((h == Class124_Sub22_Sub19_Sub6.anIntArray1822[x])
												&& (null != Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[x])) {
											final byte[] var30 = Class124_Sub22_Sub19_Sub3_Sub1.xteaLdata[x];
											final int var18 = var7 * 8;
											final int var31 = var9 * 8;
											final int var1 = (var4 & 7) * 8;
											final int var32 = (var5 & 7) * 8;
											final Class21 var33 = Class36.aClass21_380;
											final Class130[] var34 = client.aClass130Array2192;
											final RSBuf var16 = new RSBuf(var30);
											int var28 = -1;

											while (true) {
												final int var17 = var16.getsmart((byte) -21);
												if (var17 == 0)
													continue label453;

												var28 += var17;
												int var10 = 0;

												while (true) {
													final int var24 = var16.getsmart((byte) -26);
													if (var24 == 0)
														break;

													var10 += var24 - 1;
													final int var20 = var10 & 63;
													final int var0 = (var10 >> 6) & 63;
													final int var37 = var10 >> 12;
													final int var26 = var16.readByteU();
													final int var27 = var26 >> 2;
													final int var35 = var26 & 3;
													if ((var21 == var37) && (var0 >= var1) && (var0 < (var1 + 8))
															&& (var20 >= var32) && (var20 < (8 + var32))) {
														final Def6 var29 = Def13
																.method736(var28);
														final int var38 = var18 + Class124_Sub22_Sub19_Sub6.method961(
																var0 & 7, var20 & 7, var2, var29.anInt1401,
																var29.anInt1432, var35);
														final int var36 = var31 + Class78.method326(var0 & 7, var20 & 7,
																var2, var29.anInt1401, var29.anInt1432, var35);
														if ((var38 > 0) && (var36 > 0) && (var38 < 103)
																&& (var36 < 103)) {
															int var39 = var13;
															if ((Class27.aByteArrayArrayArray285[1][var38][var36]
																	& 2) == 2)
																var39 = var13 - 1;

															Class130 var40 = null;
															if (var39 >= 0)
																var40 = var34[var39];

															Class124_Sub9.method534(var13, var38, var36, var28,
																	(var2 + var35) & 3, var27, var33, var40);
														}
													}
												}
											}
										}
								}
							}
					}
				}

				Class46.push250(true);
				Def9.method639();
				Def15.method751();
				Class43.method222(Class36.aClass21_380, client.aClass130Array2192);
				Class46.push250(true);
				var13 = Class27.anInt290;
				if (var13 > Class134.anInt906)
					var13 = Class134.anInt906;

				if (var13 < (Class134.anInt906 - 1))
					var13 = Class134.anInt906 - 1;

				if (client.aBool1989)
					Class36.aClass21_380.method99(Class27.anInt290);
				else
					Class36.aClass21_380.method99(0);

				for (var7 = 0; var7 < 104; ++var7)
					for (var9 = 0; var9 < 104; ++var9)
						Class48.method233(var7, var9);

				Def15.method751();

				for (Class124_Sub11 var42 = (Class124_Sub11) client.aClass111_2262
						.method428(); null != var42; var42 = (Class124_Sub11) client.aClass111_2262.method430())
					if (var42.anInt1050 == -1) {
						var42.anInt1044 = 0;
						Class124_Sub22_Sub19_Sub3.method891(var42);
					} else
						var42.method450();

				Def6.aClass113_1389.map();
				if (null != Class69.aFrame578) {
					client.secbuf.writeOpcode(103);
					client.secbuf.writeInt(1057001181);
				}

				if (!client.create) {
					var7 = (Class124_Sub13.anInt1071 - 6) / 8;
					var9 = (6 + Class124_Sub13.anInt1071) / 8;
					var8 = (Class124_Sub22_Sub19_Sub6.anInt1824 - 6) / 8;
					var21 = (6 + Class124_Sub22_Sub19_Sub6.anInt1824) / 8;

					for (var2 = var7 - 1; var2 <= (var9 + 1); ++var2)
						for (var4 = var8 - 1; var4 <= (var21 + 1); ++var4)
							if ((var2 < var7) || (var2 > var9) || (var4 < var8) || (var4 > var21)) {
								Class125.aClass94_Sub1_883.method384("m" + var2 + "_" + var4);
								Class125.aClass94_Sub1_883.method384("l" + var2 + "_" + var4);
							}
				}

				client.forstep(30);
				Def15.method751();
				CSD.method520();
				client.secbuf.writeOpcode(104);
				Class42.method215();
			}
		}
	}
}
