public class Class124_Sub22_Sub16_Sub3 extends Class124_Sub22_Sub16 {
	static boolean aBool1829 = false;
	static boolean aBool1840 = false;
	static int anInt1835;
	static int anInt1836;
	static int anInt1839;
	static int anInt1832;
	static int anInt1841;
	static int anInt1844;
	public static Interface2 anInterface2_1828;
	static boolean aBool1842 = false;
	static int anInt1837;
	static int anInt1838;
	static int[] anIntArray1843 = new int[1024];
	public static boolean aBool1830 = true;
	static int anInt1831 = 0;
	public static int anInt1834 = 512;
	public static int[] anIntArray1845 = new int[65536];
	static int[] anIntArray1833 = new int[512];
	static int[] anIntArray1846 = new int[2048];
	public static int[] anIntArray1847 = new int[2048];
	public static int[] anIntArray1848 = new int[2048];

	static final void method969(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface2_1828.method9(var18, 1762011734);
		int var22;
		if (var19 == null) {
			var22 = anInterface2_1828.method10(var18, -1576325342);
			method982(var0, var1, var2, var3, var4, var5, method981(var22, var6), method981(var22, var7),
					method981(var22, var8));
		} else {
			aBool1829 = anInterface2_1828.method8(var18, -2118881449);
			aBool1840 = anInterface2_1828.method7(var18, 705012017);
			var22 = var4 - var3;
			final int var41 = var1 - var0;
			final int var31 = var5 - var3;
			final int var32 = var2 - var0;
			final int var33 = var7 - var6;
			final int var36 = var8 - var6;
			int var34 = 0;
			if (var1 != var0)
				var34 = ((var4 - var3) << 14) / (var1 - var0);

			int var35 = 0;
			if (var2 != var1)
				var35 = ((var5 - var4) << 14) / (var2 - var1);

			int var40 = 0;
			if (var2 != var0)
				var40 = ((var3 - var5) << 14) / (var0 - var2);

			final int var37 = (var22 * var32) - (var31 * var41);
			if (var37 != 0) {
				final int var26 = (((var33 * var32) - (var36 * var41)) << 9) / var37;
				final int var38 = (((var36 * var22) - (var33 * var31)) << 9) / var37;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var20 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var28 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 14) / anInt1834);
				final int var21 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1834);
				int var27 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var29 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 14) / anInt1834);
				final int var39 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1834);
				int var23 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var30 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 14) / anInt1834);
				final int var24 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1834);
				int var25;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1838) {
						if (var1 > anInt1838)
							var1 = anInt1838;

						if (var2 > anInt1838)
							var2 = anInt1838;

						var6 = ((var6 << 9) - (var26 * var3)) + var26;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var40 * var0;
								var3 -= var34 * var0;
								var6 -= var38 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var35 * var1;
								var1 = 0;
							}

							var25 = var0 - anInt1836;
							var20 += var21 * var25;
							var27 += var39 * var25;
							var23 += var24 * var25;
							if (((var0 == var1) || (var40 >= var34)) && ((var0 != var1) || (var40 <= var35))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var26, var20, var27, var23, var28, var29, var30);
											var5 += var40;
											var4 += var35;
											var6 += var38;
											var0 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var26,
											var20, var27, var23, var28, var29, var30);
									var5 += var40;
									var3 += var34;
									var6 += var38;
									var0 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var26, var20, var27, var23, var28, var29, var30);
											var5 += var40;
											var4 += var35;
											var6 += var38;
											var0 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var26,
											var20, var27, var23, var28, var29, var30);
									var5 += var40;
									var3 += var34;
									var6 += var38;
									var0 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var40 * var0;
								var3 -= var34 * var0;
								var6 -= var38 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var35 * var2;
								var2 = 0;
							}

							var25 = var0 - anInt1836;
							var20 += var21 * var25;
							var27 += var39 * var25;
							var23 += var24 * var25;
							if (((var0 != var2) && (var40 < var34)) || ((var0 == var2) && (var35 > var34))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var26, var20, var27, var23, var28, var29, var30);
											var5 += var35;
											var3 += var34;
											var6 += var38;
											var0 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var26,
											var20, var27, var23, var28, var29, var30);
									var4 += var40;
									var3 += var34;
									var6 += var38;
									var0 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var26, var20, var27, var23, var28, var29, var30);
											var5 += var35;
											var3 += var34;
											var6 += var38;
											var0 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var26,
											var20, var27, var23, var28, var29, var30);
									var4 += var40;
									var3 += var34;
									var6 += var38;
									var0 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1838) {
						if (var2 > anInt1838)
							var2 = anInt1838;

						if (var0 > anInt1838)
							var0 = anInt1838;

						var7 = ((var7 << 9) - (var26 * var4)) + var26;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var34 * var1;
								var4 -= var35 * var1;
								var7 -= var38 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var40 * var2;
								var2 = 0;
							}

							var25 = var1 - anInt1836;
							var20 += var21 * var25;
							var27 += var39 * var25;
							var23 += var24 * var25;
							if (((var1 == var2) || (var34 >= var35)) && ((var1 != var2) || (var34 <= var40))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var26, var20, var27, var23, var28, var29, var30);
											var3 += var34;
											var5 += var40;
											var7 += var38;
											var1 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var26,
											var20, var27, var23, var28, var29, var30);
									var3 += var34;
									var4 += var35;
									var7 += var38;
									var1 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var26, var20, var27, var23, var28, var29, var30);
											var3 += var34;
											var5 += var40;
											var7 += var38;
											var1 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var26,
											var20, var27, var23, var28, var29, var30);
									var3 += var34;
									var4 += var35;
									var7 += var38;
									var1 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var34 * var1;
								var4 -= var35 * var1;
								var7 -= var38 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var40 * var0;
								var0 = 0;
							}

							var25 = var1 - anInt1836;
							var20 += var21 * var25;
							var27 += var39 * var25;
							var23 += var24 * var25;
							if (var34 < var35) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var26, var20, var27, var23, var28, var29, var30);
											var3 += var40;
											var4 += var35;
											var7 += var38;
											var1 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var26,
											var20, var27, var23, var28, var29, var30);
									var5 += var34;
									var4 += var35;
									var7 += var38;
									var1 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method980(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var26, var20, var27, var23, var28, var29, var30);
											var3 += var40;
											var4 += var35;
											var7 += var38;
											var1 += anInt1565;
											var20 += var21;
											var27 += var39;
											var23 += var24;
										}

									method980(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var26,
											var20, var27, var23, var28, var29, var30);
									var5 += var34;
									var4 += var35;
									var7 += var38;
									var1 += anInt1565;
									var20 += var21;
									var27 += var39;
									var23 += var24;
								}
							}
						}
					}
				} else if (var2 < anInt1838) {
					if (var0 > anInt1838)
						var0 = anInt1838;

					if (var1 > anInt1838)
						var1 = anInt1838;

					var8 = ((var8 << 9) - (var26 * var5)) + var26;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var35 * var2;
							var5 -= var40 * var2;
							var8 -= var38 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var34 * var0;
							var0 = 0;
						}

						var25 = var2 - anInt1836;
						var20 += var21 * var25;
						var27 += var39 * var25;
						var23 += var24 * var25;
						if (var35 < var40) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method980(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var26, var20, var27, var23, var28, var29, var30);
										var4 += var35;
										var3 += var34;
										var8 += var38;
										var2 += anInt1565;
										var20 += var21;
										var27 += var39;
										var23 += var24;
									}

								method980(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var26, var20,
										var27, var23, var28, var29, var30);
								var4 += var35;
								var5 += var40;
								var8 += var38;
								var2 += anInt1565;
								var20 += var21;
								var27 += var39;
								var23 += var24;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method980(anIntArray1570, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var26, var20, var27, var23, var28, var29, var30);
										var4 += var35;
										var3 += var34;
										var8 += var38;
										var2 += anInt1565;
										var20 += var21;
										var27 += var39;
										var23 += var24;
									}

								method980(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var26, var20,
										var27, var23, var28, var29, var30);
								var4 += var35;
								var5 += var40;
								var8 += var38;
								var2 += anInt1565;
								var20 += var21;
								var27 += var39;
								var23 += var24;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var35 * var2;
							var5 -= var40 * var2;
							var8 -= var38 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var34 * var1;
							var1 = 0;
						}

						var25 = var2 - anInt1836;
						var20 += var21 * var25;
						var27 += var39 * var25;
						var23 += var24 * var25;
						if (var35 < var40) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method980(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var26, var20, var27, var23, var28, var29, var30);
										var4 += var34;
										var5 += var40;
										var8 += var38;
										var2 += anInt1565;
										var20 += var21;
										var27 += var39;
										var23 += var24;
									}

								method980(anIntArray1570, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var26, var20,
										var27, var23, var28, var29, var30);
								var3 += var35;
								var5 += var40;
								var8 += var38;
								var2 += anInt1565;
								var20 += var21;
								var27 += var39;
								var23 += var24;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method980(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var26, var20, var27, var23, var28, var29, var30);
										var4 += var34;
										var5 += var40;
										var8 += var38;
										var2 += anInt1565;
										var20 += var21;
										var27 += var39;
										var23 += var24;
									}

								method980(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var26, var20,
										var27, var23, var28, var29, var30);
								var3 += var35;
								var5 += var40;
								var8 += var38;
								var2 += anInt1565;
								var20 += var21;
								var27 += var39;
								var23 += var24;
							}
						}
					}
				}
			}
		}
	}

	public static final void method970() {
		method976(anInt1569, anInt1564, anInt1567, anInt1568);
	}

	public static final void method971(final int var0, final int var1) {
		final int var2 = anIntArray1843[0];
		final int var3 = var2 / anInt1565;
		final int var4 = var2 - (var3 * anInt1565);
		anInt1835 = var0 - var4;
		anInt1836 = var1 - var3;
		anInt1839 = -anInt1835;
		anInt1832 = anInt1837 - anInt1835;
		anInt1841 = -anInt1836;
		anInt1844 = anInt1838 - anInt1836;
	}

	public static final void method972(final Interface2 var0) {
		anInterface2_1828 = var0;
	}

	static final void method973(double var0, final int var2, final int var3) {
		var0 += (Math.random() * 0.03D) - 0.015D;
		int var32 = var2 * 128;

		for (int var7 = var2; var7 < var3; ++var7) {
			final double var22 = ((var7 >> 3) / 64.0D) + 0.0078125D;
			final double var8 = ((var7 & 7) / 8.0D) + 0.0625D;

			for (int var6 = 0; var6 < 128; ++var6) {
				final double var10 = var6 / 128.0D;
				double var12 = var10;
				double var18 = var10;
				double var14 = var10;
				if (var8 != 0.0D) {
					double var16;
					if (var10 < 0.5D)
						var16 = var10 * (1.0D + var8);
					else
						var16 = (var10 + var8) - (var10 * var8);

					final double var20 = (2.0D * var10) - var16;
					double var4 = var22 + 0.3333333333333333D;
					if (var4 > 1.0D)
						--var4;

					double var26 = var22 - 0.3333333333333333D;
					if (var26 < 0.0D)
						++var26;

					if ((6.0D * var4) < 1.0D)
						var12 = var20 + ((var16 - var20) * 6.0D * var4);
					else if ((2.0D * var4) < 1.0D)
						var12 = var16;
					else if ((3.0D * var4) < 2.0D)
						var12 = var20 + ((var16 - var20) * (0.6666666666666666D - var4) * 6.0D);
					else
						var12 = var20;

					if ((6.0D * var22) < 1.0D)
						var18 = var20 + ((var16 - var20) * 6.0D * var22);
					else if ((2.0D * var22) < 1.0D)
						var18 = var16;
					else if ((3.0D * var22) < 2.0D)
						var18 = var20 + ((var16 - var20) * (0.6666666666666666D - var22) * 6.0D);
					else
						var18 = var20;

					if ((6.0D * var26) < 1.0D)
						var14 = var20 + ((var16 - var20) * 6.0D * var26);
					else if ((2.0D * var26) < 1.0D)
						var14 = var16;
					else if ((3.0D * var26) < 2.0D)
						var14 = var20 + ((var16 - var20) * (0.6666666666666666D - var26) * 6.0D);
					else
						var14 = var20;
				}

				final int var29 = (int) (var12 * 256.0D);
				final int var30 = (int) (var18 * 256.0D);
				final int var31 = (int) (var14 * 256.0D);
				int var28 = (var29 << 16) + (var30 << 8) + var31;
				var28 = method974(var28, var0);
				if (var28 == 0)
					var28 = 1;

				anIntArray1845[var32++] = var28;
			}
		}

	}

	static int method974(final int var0, final double var1) {
		double var3 = (var0 >> 16) / 256.0D;
		double var5 = ((var0 >> 8) & 255) / 256.0D;
		double var8 = (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var8 = Math.pow(var8, var1);
		final int var7 = (int) (var3 * 256.0D);
		final int var10 = (int) (var5 * 256.0D);
		final int var11 = (int) (var8 * 256.0D);
		return (var7 << 16) + (var10 << 8) + var11;
	}

	public static void method975(final int var0, final int var1, final int var2) {
		aBool1842 = (var0 < 0) || (var0 > anInt1837) || (var1 < 0) || (var1 > anInt1837) || (var2 < 0)
				|| (var2 > anInt1837);
	}

	static final void method976(final int var0, final int var1, final int var2, final int var3) {
		anInt1837 = var2 - var0;
		anInt1838 = var3 - var1;
		method986();
		if (anIntArray1843.length < anInt1838)
			anIntArray1843 = new int[Class18.method85(anInt1838)];

		int var5 = (var1 * anInt1565) + var0;

		for (int var4 = 0; var4 < anInt1838; ++var4) {
			anIntArray1843[var4] = var5;
			var5 += anInt1565;
		}

	}

	static final void method977(final int[] var0, int var1, int var2, int var3, int var4, int var5, int var6,
			int var7) {
		if (aBool1842) {
			if (var5 > anInt1837)
				var5 = anInt1837;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool1830) {
				var3 = (var5 - var4) >> 2;
				var7 <<= 2;
				if (anInt1831 == 0) {
					if (var3 > 0)
						do {
							var2 = anIntArray1845[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1845[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				} else {
					var9 = anInt1831;
					var10 = 256 - anInt1831;
					if (var3 > 0)
						do {
							var2 = anIntArray1845[var6 >> 8];
							var6 += var7;
							var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
									+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);

					var3 = (var5 - var4) & 3;
					if (var3 > 0) {
						var2 = anIntArray1845[var6 >> 8];
						var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');

						do {
							var8 = var0[var1];
							var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
									+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt1831 == 0)
					do {
						var0[var1++] = anIntArray1845[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				else {
					var9 = anInt1831;
					var10 = 256 - anInt1831;

					do {
						var2 = anIntArray1845[var6 >> 8];
						var6 += var7;
						var2 = ((((var2 & 16711935) * var10) >> 8) & 16711935)
								+ ((((var2 & '\uff00') * var10) >> 8) & '\uff00');
						var8 = var0[var1];
						var0[var1++] = var2 + ((((var8 & 16711935) * var9) >> 8) & 16711935)
								+ ((((var8 & '\uff00') * var9) >> 8) & '\uff00');
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	public static final void method978(int var0, int var1, int var2, int var3, int var4, int var5, final int var6) {
		int var7 = 0;
		if (var1 != var0)
			var7 = ((var4 - var3) << 14) / (var1 - var0);

		int var8 = 0;
		if (var2 != var1)
			var8 = ((var5 - var4) << 14) / (var2 - var1);

		int var9 = 0;
		if (var2 != var0)
			var9 = ((var3 - var5) << 14) / (var0 - var2);

		if ((var0 <= var1) && (var0 <= var2)) {
			if (var0 < anInt1838) {
				if (var1 > anInt1838)
					var1 = anInt1838;

				if (var2 > anInt1838)
					var2 = anInt1838;

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (((var0 == var1) || (var9 >= var7)) && ((var0 != var1) || (var9 <= var8))) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1843[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method984(anIntArray1570, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt1565;
								}

							method984(anIntArray1570, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt1565;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1843[var0];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method984(anIntArray1570, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt1565;
								}

							method984(anIntArray1570, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt1565;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (((var0 != var2) && (var9 < var7)) || ((var0 == var2) && (var8 > var7))) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1843[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method984(anIntArray1570, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt1565;
								}

							method984(anIntArray1570, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt1565;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1843[var0];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method984(anIntArray1570, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt1565;
								}

							method984(anIntArray1570, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt1565;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt1838) {
				if (var2 > anInt1838)
					var2 = anInt1838;

				if (var0 > anInt1838)
					var0 = anInt1838;

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (((var1 != var2) && (var7 < var8)) || ((var1 == var2) && (var7 > var9))) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1843[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method984(anIntArray1570, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt1565;
								}

							method984(anIntArray1570, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt1565;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1843[var1];

						while (true) {
							--var2;
							if (var2 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method984(anIntArray1570, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt1565;
								}

							method984(anIntArray1570, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt1565;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1843[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method984(anIntArray1570, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt1565;
								}

							method984(anIntArray1570, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt1565;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1843[var1];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var2;
									if (var2 < 0)
										return;

									method984(anIntArray1570, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt1565;
								}

							method984(anIntArray1570, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt1565;
						}
					}
				}
			}
		} else if (var2 < anInt1838) {
			if (var0 > anInt1838)
				var0 = anInt1838;

			if (var1 > anInt1838)
				var1 = anInt1838;

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1843[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method984(anIntArray1570, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt1565;
							}

						method984(anIntArray1570, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt1565;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1843[var2];

					while (true) {
						--var0;
						if (var0 < 0)
							while (true) {
								--var1;
								if (var1 < 0)
									return;

								method984(anIntArray1570, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt1565;
							}

						method984(anIntArray1570, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt1565;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1843[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method984(anIntArray1570, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt1565;
							}

						method984(anIntArray1570, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt1565;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1843[var2];

					while (true) {
						--var1;
						if (var1 < 0)
							while (true) {
								--var0;
								if (var0 < 0)
									return;

								method984(anIntArray1570, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt1565;
							}

						method984(anIntArray1570, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt1565;
					}
				}
			}
		}
	}

	static final void method979(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1842) {
			if (var6 > anInt1837)
				var6 = anInt1837;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var23 = var6 - var5;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			if (aBool1829) {
				var19 = var5 - anInt1835;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var15 = var9 / var17;
					var20 = var10 / var17;
					if (var15 < 0)
						var15 = 0;
					else if (var15 > 4032)
						var15 = 4032;
				} else {
					var15 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var17 = var11 >> 12;
				if (var17 != 0) {
					var22 = var9 / var17;
					var21 = var10 / var17;
					if (var22 < 0)
						var22 = 0;
					else if (var22 > 4032)
						var22 = 4032;
				} else {
					var22 = 0;
					var21 = 0;
				}

				var2 = (var15 << 20) + var20;
				var18 = (((var22 - var15) >> 3) << 20) + ((var21 - var20) >> 3);
				var23 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool1840) {
					if (var23 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var15 = var22;
							var20 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 12;
							if (var17 != 0) {
								var22 = var9 / var17;
								var21 = var10 / var17;
								if (var22 < 0)
									var22 = 0;
								else if (var22 > 4032)
									var22 = 4032;
							} else {
								var22 = 0;
								var21 = 0;
							}

							var2 = (var15 << 20) + var20;
							var18 = (((var22 - var15) >> 3) << 20) + ((var21 - var20) >> 3);
							var7 += var8;
							var16 = var7 >> 8;
							--var23;
						} while (var23 > 0);

					var23 = (var6 - var5) & 7;
					if (var23 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							--var23;
						} while (var23 > 0);
				} else {
					if (var23 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var15 = var22;
							var20 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 12;
							if (var17 != 0) {
								var22 = var9 / var17;
								var21 = var10 / var17;
								if (var22 < 0)
									var22 = 0;
								else if (var22 > 4032)
									var22 = 4032;
							} else {
								var22 = 0;
								var21 = 0;
							}

							var2 = (var15 << 20) + var20;
							var18 = (((var22 - var15) >> 3) << 20) + ((var21 - var20) >> 3);
							var7 += var8;
							var16 = var7 >> 8;
							--var23;
						} while (var23 > 0);

					var23 = (var6 - var5) & 7;
					if (var23 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							--var23;
						} while (var23 > 0);
				}
			} else {
				var19 = var5 - anInt1835;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var15 = var9 / var17;
					var20 = var10 / var17;
					if (var15 < 0)
						var15 = 0;
					else if (var15 > 16256)
						var15 = 16256;
				} else {
					var15 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var17 = var11 >> 14;
				if (var17 != 0) {
					var22 = var9 / var17;
					var21 = var10 / var17;
					if (var22 < 0)
						var22 = 0;
					else if (var22 > 16256)
						var22 = 16256;
				} else {
					var22 = 0;
					var21 = 0;
				}

				var2 = (var15 << 18) + var20;
				var18 = (((var22 - var15) >> 3) << 18) + ((var21 - var20) >> 3);
				var23 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool1840) {
					if (var23 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var15 = var22;
							var20 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 14;
							if (var17 != 0) {
								var22 = var9 / var17;
								var21 = var10 / var17;
								if (var22 < 0)
									var22 = 0;
								else if (var22 > 16256)
									var22 = 16256;
							} else {
								var22 = 0;
								var21 = 0;
							}

							var2 = (var15 << 18) + var20;
							var18 = (((var22 - var15) >> 3) << 18) + ((var21 - var20) >> 3);
							var7 += var8;
							var16 = var7 >> 8;
							--var23;
						} while (var23 > 0);

					var23 = (var6 - var5) & 7;
					if (var23 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var16) & -16711936)
									+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;
							var2 += var18;
							--var23;
						} while (var23 > 0);
				} else {
					if (var23 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var15 = var22;
							var20 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var17 = var11 >> 14;
							if (var17 != 0) {
								var22 = var9 / var17;
								var21 = var10 / var17;
								if (var22 < 0)
									var22 = 0;
								else if (var22 > 16256)
									var22 = 16256;
							} else {
								var22 = 0;
								var21 = 0;
							}

							var2 = (var15 << 18) + var20;
							var18 = (((var22 - var15) >> 3) << 18) + ((var21 - var20) >> 3);
							var7 += var8;
							var16 = var7 >> 8;
							--var23;
						} while (var23 > 0);

					var23 = (var6 - var5) & 7;
					if (var23 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var16) & -16711936)
										+ (((var3 & '\uff00') * var16) & 16711680)) >> 8;

							++var4;
							var2 += var18;
							--var23;
						} while (var23 > 0);
				}
			}

		}
	}

	static final void method980(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, int var10, int var11, final int var12, final int var13, final int var14) {
		if (aBool1842) {
			if (var6 > anInt1837)
				var6 = anInt1837;

			if (var5 < 0)
				var5 = 0;
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool1829) {
				var23 = var5 - anInt1835;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var16 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var16 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var15 = var9 / var22;
					var18 = var10 / var22;
				} else {
					var15 = 0;
					var18 = 0;
				}

				var2 = (var16 << 20) + var19;
				var20 = (((var15 - var16) / var17) << 20) + ((var18 - var19) / var17);
				var17 >>= 3;
				var8 <<= 3;
				var21 = var7 >> 8;
				if (aBool1840) {
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var7 += var8;
							var21 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							--var17;
						} while (var17 > 0);
				} else {
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							var7 += var8;
							var21 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							--var17;
						} while (var17 > 0);
				}
			} else {
				var23 = var5 - anInt1835;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var16 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var16 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var15 = var9 / var22;
					var18 = var10 / var22;
				} else {
					var15 = 0;
					var18 = 0;
				}

				var2 = (var16 << 18) + var19;
				var20 = (((var15 - var16) / var17) << 18) + ((var18 - var19) / var17);
				var17 >>= 3;
				var8 <<= 3;
				var21 = var7 >> 8;
				if (aBool1840) {
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							var7 += var8;
							var21 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((((var3 & 16711935) * var21) & -16711936)
									+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;
							var2 += var20;
							--var17;
						} while (var17 > 0);
				} else {
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							var7 += var8;
							var21 = var7 >> 8;
							--var17;
						} while (var17 > 0);

					var17 = (var6 - var5) & 7;
					if (var17 > 0)
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0)
								var0[var4] = ((((var3 & 16711935) * var21) & -16711936)
										+ (((var3 & '\uff00') * var21) & 16711680)) >> 8;

							++var4;
							var2 += var20;
							--var17;
						} while (var17 > 0);
				}
			}

		}
	}

	static final int method981(final int var0, int var1) {
		var1 = (var1 * (var0 & 127)) >> 7;
		if (var1 < 2)
			var1 = 2;
		else if (var1 > 126)
			var1 = 126;

		return (var0 & '\uff80') + var1;
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; ++var0)
			anIntArray1833[var0] = '\u8000' / var0;

		for (var0 = 1; var0 < 2048; ++var0)
			anIntArray1846[var0] = 65536 / var0;

		for (var0 = 0; var0 < 2048; ++var0) {
			anIntArray1847[var0] = (int) (65536.0D * Math.sin(var0 * 0.0030679615D));
			anIntArray1848[var0] = (int) (65536.0D * Math.cos(var0 * 0.0030679615D));
		}

	}

	static final void method982(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8) {
		final int var9 = var4 - var3;
		final int var16 = var1 - var0;
		final int var11 = var5 - var3;
		final int var12 = var2 - var0;
		final int var13 = var7 - var6;
		final int var17 = var8 - var6;
		int var14;
		if (var2 != var1)
			var14 = ((var5 - var4) << 14) / (var2 - var1);
		else
			var14 = 0;

		int var15;
		if (var1 != var0)
			var15 = (var9 << 14) / var16;
		else
			var15 = 0;

		int var19;
		if (var2 != var0)
			var19 = (var11 << 14) / var12;
		else
			var19 = 0;

		final int var18 = (var9 * var12) - (var11 * var16);
		if (var18 != 0) {
			final int var20 = (((var13 * var12) - (var17 * var16)) << 8) / var18;
			final int var10 = (((var17 * var9) - (var13 * var11)) << 8) / var18;
			if ((var0 <= var1) && (var0 <= var2)) {
				if (var0 < anInt1838) {
					if (var1 > anInt1838)
						var1 = anInt1838;

					if (var2 > anInt1838)
						var2 = anInt1838;

					var6 = ((var6 << 8) - (var20 * var3)) + var20;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var19 * var0;
							var3 -= var15 * var0;
							var6 -= var10 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var14 * var1;
							var1 = 0;
						}

						if (((var0 == var1) || (var19 >= var15)) && ((var0 != var1) || (var19 <= var14))) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1843[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method977(anIntArray1570, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var20);
										var5 += var19;
										var4 += var14;
										var6 += var10;
										var0 += anInt1565;
									}

								method977(anIntArray1570, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var20);
								var5 += var19;
								var3 += var15;
								var6 += var10;
								var0 += anInt1565;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray1843[var0];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method977(anIntArray1570, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var20);
										var5 += var19;
										var4 += var14;
										var6 += var10;
										var0 += anInt1565;
									}

								method977(anIntArray1570, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var20);
								var5 += var19;
								var3 += var15;
								var6 += var10;
								var0 += anInt1565;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var19 * var0;
							var3 -= var15 * var0;
							var6 -= var10 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var14 * var2;
							var2 = 0;
						}

						if (((var0 != var2) && (var19 < var15)) || ((var0 == var2) && (var14 > var15))) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1843[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method977(anIntArray1570, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var20);
										var5 += var14;
										var3 += var15;
										var6 += var10;
										var0 += anInt1565;
									}

								method977(anIntArray1570, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var20);
								var4 += var19;
								var3 += var15;
								var6 += var10;
								var0 += anInt1565;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray1843[var0];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method977(anIntArray1570, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var20);
										var5 += var14;
										var3 += var15;
										var6 += var10;
										var0 += anInt1565;
									}

								method977(anIntArray1570, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var20);
								var4 += var19;
								var3 += var15;
								var6 += var10;
								var0 += anInt1565;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt1838) {
					if (var2 > anInt1838)
						var2 = anInt1838;

					if (var0 > anInt1838)
						var0 = anInt1838;

					var7 = ((var7 << 8) - (var20 * var4)) + var20;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var15 * var1;
							var4 -= var14 * var1;
							var7 -= var10 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var19 * var2;
							var2 = 0;
						}

						if (((var1 == var2) || (var15 >= var14)) && ((var1 != var2) || (var15 <= var19))) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1843[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method977(anIntArray1570, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var20);
										var3 += var15;
										var5 += var19;
										var7 += var10;
										var1 += anInt1565;
									}

								method977(anIntArray1570, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var20);
								var3 += var15;
								var4 += var14;
								var7 += var10;
								var1 += anInt1565;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray1843[var1];

							while (true) {
								--var2;
								if (var2 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method977(anIntArray1570, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var20);
										var3 += var15;
										var5 += var19;
										var7 += var10;
										var1 += anInt1565;
									}

								method977(anIntArray1570, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var20);
								var3 += var15;
								var4 += var14;
								var7 += var10;
								var1 += anInt1565;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var15 * var1;
							var4 -= var14 * var1;
							var7 -= var10 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var19 * var0;
							var0 = 0;
						}

						if (var15 < var14) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1843[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method977(anIntArray1570, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var20);
										var3 += var19;
										var4 += var14;
										var7 += var10;
										var1 += anInt1565;
									}

								method977(anIntArray1570, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var20);
								var5 += var15;
								var4 += var14;
								var7 += var10;
								var1 += anInt1565;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray1843[var1];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var2;
										if (var2 < 0)
											return;

										method977(anIntArray1570, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var20);
										var3 += var19;
										var4 += var14;
										var7 += var10;
										var1 += anInt1565;
									}

								method977(anIntArray1570, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var20);
								var5 += var15;
								var4 += var14;
								var7 += var10;
								var1 += anInt1565;
							}
						}
					}
				}
			} else if (var2 < anInt1838) {
				if (var0 > anInt1838)
					var0 = anInt1838;

				if (var1 > anInt1838)
					var1 = anInt1838;

				var8 = ((var8 << 8) - (var20 * var5)) + var20;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var14 * var2;
						var5 -= var19 * var2;
						var8 -= var10 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var15 * var0;
						var0 = 0;
					}

					if (var14 < var19) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1843[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method977(anIntArray1570, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var20);
									var4 += var14;
									var3 += var15;
									var8 += var10;
									var2 += anInt1565;
								}

							method977(anIntArray1570, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var20);
							var4 += var14;
							var5 += var19;
							var8 += var10;
							var2 += anInt1565;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray1843[var2];

						while (true) {
							--var0;
							if (var0 < 0)
								while (true) {
									--var1;
									if (var1 < 0)
										return;

									method977(anIntArray1570, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var20);
									var4 += var14;
									var3 += var15;
									var8 += var10;
									var2 += anInt1565;
								}

							method977(anIntArray1570, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var20);
							var4 += var14;
							var5 += var19;
							var8 += var10;
							var2 += anInt1565;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var14 * var2;
						var5 -= var19 * var2;
						var8 -= var10 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var15 * var1;
						var1 = 0;
					}

					if (var14 < var19) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1843[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method977(anIntArray1570, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var20);
									var4 += var15;
									var5 += var19;
									var8 += var10;
									var2 += anInt1565;
								}

							method977(anIntArray1570, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var20);
							var3 += var14;
							var5 += var19;
							var8 += var10;
							var2 += anInt1565;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray1843[var2];

						while (true) {
							--var1;
							if (var1 < 0)
								while (true) {
									--var0;
									if (var0 < 0)
										return;

									method977(anIntArray1570, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var20);
									var4 += var15;
									var5 += var19;
									var8 += var10;
									var2 += anInt1565;
								}

							method977(anIntArray1570, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var20);
							var3 += var14;
							var5 += var19;
							var8 += var10;
							var2 += anInt1565;
						}
					}
				}
			}
		}
	}

	public static final void method983(final double var0) {
		method973(var0, 0, 512);
	}

	static final void method984(final int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool1842) {
			if (var5 > anInt1837)
				var5 = anInt1837;

			if (var4 < 0)
				var4 = 0;
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = (var5 - var4) >> 2;
			if (anInt1831 != 0) {
				if (anInt1831 == 254)
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				else {
					final int var7 = anInt1831;
					final int var8 = 256 - anInt1831;
					var2 = ((((var2 & 16711935) * var8) >> 8) & 16711935)
							+ ((((var2 & '\uff00') * var8) >> 8) & '\uff00');

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = (var5 - var4) & 3;

							while (true) {
								--var3;
								if (var3 < 0)
									return;

								var6 = var0[var1];
								var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
										+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
						var6 = var0[var1];
						var0[var1++] = var2 + ((((var6 & 16711935) * var7) >> 8) & 16711935)
								+ ((((var6 & '\uff00') * var7) >> 8) & '\uff00');
					}
				}
			} else
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = (var5 - var4) & 3;

						while (true) {
							--var3;
							if (var3 < 0)
								return;

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
		}
	}

	static final void method985(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, final int var9, int var10, int var11, final int var12, int var13, int var14, final int var15,
			int var16, int var17, final int var18) {
		final int[] var19 = anInterface2_1828.method9(var18, -1425500618);
		int var34;
		if (var19 == null) {
			var34 = anInterface2_1828.method10(var18, -1399077557);
			method982(var0, var1, var2, var3, var4, var5, method981(var34, var6), method981(var34, var7),
					method981(var34, var8));
		} else {
			aBool1829 = anInterface2_1828.method8(var18, -2118881449);
			aBool1840 = anInterface2_1828.method7(var18, -1150580171);
			var34 = var4 - var3;
			final int var28 = var1 - var0;
			final int var39 = var5 - var3;
			final int var38 = var2 - var0;
			final int var29 = var7 - var6;
			final int var30 = var8 - var6;
			int var31 = 0;
			if (var1 != var0)
				var31 = ((var4 - var3) << 14) / (var1 - var0);

			int var33 = 0;
			if (var2 != var1)
				var33 = ((var5 - var4) << 14) / (var2 - var1);

			int var36 = 0;
			if (var2 != var0)
				var36 = ((var3 - var5) << 14) / (var0 - var2);

			final int var37 = (var34 * var38) - (var39 * var28);
			if (var37 != 0) {
				final int var20 = (((var29 * var38) - (var30 * var28)) << 9) / var37;
				final int var32 = (((var30 * var34) - (var29 * var39)) << 9) / var37;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var21 = ((var11 * var12) - (var14 * var9)) << 14;
				final int var24 = (int) (((long) ((var14 * var15) - (var17 * var12)) << 3 << 14) / anInt1834);
				final int var27 = (int) (((long) ((var17 * var9) - (var11 * var15)) << 14) / anInt1834);
				int var22 = ((var10 * var12) - (var13 * var9)) << 14;
				final int var25 = (int) (((long) ((var13 * var15) - (var16 * var12)) << 3 << 14) / anInt1834);
				final int var41 = (int) (((long) ((var16 * var9) - (var10 * var15)) << 14) / anInt1834);
				int var23 = ((var13 * var11) - (var10 * var14)) << 14;
				final int var26 = (int) (((long) ((var16 * var14) - (var13 * var17)) << 3 << 14) / anInt1834);
				final int var40 = (int) (((long) ((var10 * var17) - (var16 * var11)) << 14) / anInt1834);
				int var35;
				if ((var0 <= var1) && (var0 <= var2)) {
					if (var0 < anInt1838) {
						if (var1 > anInt1838)
							var1 = anInt1838;

						if (var2 > anInt1838)
							var2 = anInt1838;

						var6 = ((var6 << 9) - (var20 * var3)) + var20;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var36 * var0;
								var3 -= var31 * var0;
								var6 -= var32 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var33 * var1;
								var1 = 0;
							}

							var35 = var0 - anInt1836;
							var21 += var27 * var35;
							var22 += var41 * var35;
							var23 += var40 * var35;
							if (((var0 == var1) || (var36 >= var31)) && ((var0 != var1) || (var36 <= var33))) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6,
													var20, var21, var22, var23, var24, var25, var26);
											var5 += var36;
											var4 += var33;
											var6 += var32;
											var0 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var20,
											var21, var22, var23, var24, var25, var26);
									var5 += var36;
									var3 += var31;
									var6 += var32;
									var0 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var1;
									if (var1 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6,
													var20, var21, var22, var23, var24, var25, var26);
											var5 += var36;
											var4 += var33;
											var6 += var32;
											var0 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var20,
											var21, var22, var23, var24, var25, var26);
									var5 += var36;
									var3 += var31;
									var6 += var32;
									var0 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var36 * var0;
								var3 -= var31 * var0;
								var6 -= var32 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var33 * var2;
								var2 = 0;
							}

							var35 = var0 - anInt1836;
							var21 += var27 * var35;
							var22 += var41 * var35;
							var23 += var40 * var35;
							if (((var0 != var2) && (var36 < var31)) || ((var0 == var2) && (var33 > var31))) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6,
													var20, var21, var22, var23, var24, var25, var26);
											var5 += var33;
											var3 += var31;
											var6 += var32;
											var0 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var20,
											var21, var22, var23, var24, var25, var26);
									var4 += var36;
									var3 += var31;
									var6 += var32;
									var0 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray1843[var0];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var1;
											if (var1 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6,
													var20, var21, var22, var23, var24, var25, var26);
											var5 += var33;
											var3 += var31;
											var6 += var32;
											var0 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var20,
											var21, var22, var23, var24, var25, var26);
									var4 += var36;
									var3 += var31;
									var6 += var32;
									var0 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt1838) {
						if (var2 > anInt1838)
							var2 = anInt1838;

						if (var0 > anInt1838)
							var0 = anInt1838;

						var7 = ((var7 << 9) - (var20 * var4)) + var20;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var31 * var1;
								var4 -= var33 * var1;
								var7 -= var32 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var36 * var2;
								var2 = 0;
							}

							var35 = var1 - anInt1836;
							var21 += var27 * var35;
							var22 += var41 * var35;
							var23 += var40 * var35;
							if (((var1 == var2) || (var31 >= var33)) && ((var1 != var2) || (var31 <= var36))) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7,
													var20, var21, var22, var23, var24, var25, var26);
											var3 += var31;
											var5 += var36;
											var7 += var32;
											var1 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var20,
											var21, var22, var23, var24, var25, var26);
									var3 += var31;
									var4 += var33;
									var7 += var32;
									var1 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var2;
									if (var2 < 0)
										while (true) {
											--var0;
											if (var0 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7,
													var20, var21, var22, var23, var24, var25, var26);
											var3 += var31;
											var5 += var36;
											var7 += var32;
											var1 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var20,
											var21, var22, var23, var24, var25, var26);
									var3 += var31;
									var4 += var33;
									var7 += var32;
									var1 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var31 * var1;
								var4 -= var33 * var1;
								var7 -= var32 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var36 * var0;
								var0 = 0;
							}

							var35 = var1 - anInt1836;
							var21 += var27 * var35;
							var22 += var41 * var35;
							var23 += var40 * var35;
							if (var31 < var33) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7,
													var20, var21, var22, var23, var24, var25, var26);
											var3 += var36;
											var4 += var33;
											var7 += var32;
											var1 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var20,
											var21, var22, var23, var24, var25, var26);
									var5 += var31;
									var4 += var33;
									var7 += var32;
									var1 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray1843[var1];

								while (true) {
									--var0;
									if (var0 < 0)
										while (true) {
											--var2;
											if (var2 < 0)
												return;

											method979(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7,
													var20, var21, var22, var23, var24, var25, var26);
											var3 += var36;
											var4 += var33;
											var7 += var32;
											var1 += anInt1565;
											var21 += var27;
											var22 += var41;
											var23 += var40;
										}

									method979(anIntArray1570, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var20,
											var21, var22, var23, var24, var25, var26);
									var5 += var31;
									var4 += var33;
									var7 += var32;
									var1 += anInt1565;
									var21 += var27;
									var22 += var41;
									var23 += var40;
								}
							}
						}
					}
				} else if (var2 < anInt1838) {
					if (var0 > anInt1838)
						var0 = anInt1838;

					if (var1 > anInt1838)
						var1 = anInt1838;

					var8 = ((var8 << 9) - (var20 * var5)) + var20;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var33 * var2;
							var5 -= var36 * var2;
							var8 -= var32 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var31 * var0;
							var0 = 0;
						}

						var35 = var2 - anInt1836;
						var21 += var27 * var35;
						var22 += var41 * var35;
						var23 += var40 * var35;
						if (var33 < var36) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method979(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8,
												var20, var21, var22, var23, var24, var25, var26);
										var4 += var33;
										var3 += var31;
										var8 += var32;
										var2 += anInt1565;
										var21 += var27;
										var22 += var41;
										var23 += var40;
									}

								method979(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var20, var21,
										var22, var23, var24, var25, var26);
								var4 += var33;
								var5 += var36;
								var8 += var32;
								var2 += anInt1565;
								var21 += var27;
								var22 += var41;
								var23 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var0;
								if (var0 < 0)
									while (true) {
										--var1;
										if (var1 < 0)
											return;

										method979(anIntArray1570, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8,
												var20, var21, var22, var23, var24, var25, var26);
										var4 += var33;
										var3 += var31;
										var8 += var32;
										var2 += anInt1565;
										var21 += var27;
										var22 += var41;
										var23 += var40;
									}

								method979(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var20, var21,
										var22, var23, var24, var25, var26);
								var4 += var33;
								var5 += var36;
								var8 += var32;
								var2 += anInt1565;
								var21 += var27;
								var22 += var41;
								var23 += var40;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var33 * var2;
							var5 -= var36 * var2;
							var8 -= var32 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var31 * var1;
							var1 = 0;
						}

						var35 = var2 - anInt1836;
						var21 += var27 * var35;
						var22 += var41 * var35;
						var23 += var40 * var35;
						if (var33 < var36) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method979(anIntArray1570, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8,
												var20, var21, var22, var23, var24, var25, var26);
										var4 += var31;
										var5 += var36;
										var8 += var32;
										var2 += anInt1565;
										var21 += var27;
										var22 += var41;
										var23 += var40;
									}

								method979(anIntArray1570, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var20, var21,
										var22, var23, var24, var25, var26);
								var3 += var33;
								var5 += var36;
								var8 += var32;
								var2 += anInt1565;
								var21 += var27;
								var22 += var41;
								var23 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray1843[var2];

							while (true) {
								--var1;
								if (var1 < 0)
									while (true) {
										--var0;
										if (var0 < 0)
											return;

										method979(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8,
												var20, var21, var22, var23, var24, var25, var26);
										var4 += var31;
										var5 += var36;
										var8 += var32;
										var2 += anInt1565;
										var21 += var27;
										var22 += var41;
										var23 += var40;
									}

								method979(anIntArray1570, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var20, var21,
										var22, var23, var24, var25, var26);
								var3 += var33;
								var5 += var36;
								var8 += var32;
								var2 += anInt1565;
								var21 += var27;
								var22 += var41;
								var23 += var40;
							}
						}
					}
				}
			}
		}
	}

	public static final void method986() {
		anInt1835 = anInt1837 / 2;
		anInt1836 = anInt1838 / 2;
		anInt1839 = -anInt1835;
		anInt1832 = anInt1837 - anInt1835;
		anInt1841 = -anInt1836;
		anInt1844 = anInt1838 - anInt1836;
	}
}
