public final class Class52 {
	static Class54 aClass54_490 = new Class54();

	public static int method248(final byte[] var0, int var1, final byte[] var2, final int var3, final int var4) {
		final Class54 var5 = aClass54_490;
		synchronized (var5) {
			aClass54_490.aByteArray501 = var2;
			aClass54_490.anInt502 = var4;
			aClass54_490.aByteArray527 = var0;
			aClass54_490.anInt505 = 0;
			aClass54_490.anInt506 = var1;
			aClass54_490.anInt495 = 0;
			aClass54_490.anInt510 = 0;
			aClass54_490.anInt503 = 0;
			aClass54_490.anInt500 = 0;
			method250(aClass54_490);
			var1 -= aClass54_490.anInt506;
			aClass54_490.aByteArray501 = null;
			aClass54_490.aByteArray527 = null;
			return var1;
		}
	}

	static byte method249(final Class54 var0) {
		return (byte) method252(1, var0);
	}

	static void method250(final Class54 var0) {
		int var11 = 0;
		int[] var18 = null;
		int[] var19 = null;
		int[] var20 = null;
		var0.anInt512 = 1;
		if (Class54.anIntArray534 == null)
			Class54.anIntArray534 = new int[var0.anInt512 * 100000];

		boolean var22 = true;

		while (true) {
			while (var22) {
				byte var6 = method251(var0);
				if (var6 == 23)
					return;

				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method251(var0);
				var6 = method249(var0);
				if (var6 != 0)
					;

				var0.anInt513 = 0;
				var6 = method251(var0);
				var0.anInt513 = (var0.anInt513 << 8) | (var6 & 255);
				var6 = method251(var0);
				var0.anInt513 = (var0.anInt513 << 8) | (var6 & 255);
				var6 = method251(var0);
				var0.anInt513 = (var0.anInt513 << 8) | (var6 & 255);

				int var36;
				for (var36 = 0; var36 < 16; ++var36) {
					var6 = method249(var0);
					if (var6 == 1)
						var0.aBoolArray522[var36] = true;
					else
						var0.aBoolArray522[var36] = false;
				}

				for (var36 = 0; var36 < 256; ++var36)
					var0.aBoolArray521[var36] = false;

				int var55;
				for (var36 = 0; var36 < 16; ++var36)
					if (var0.aBoolArray522[var36])
						for (var55 = 0; var55 < 16; ++var55) {
							var6 = method249(var0);
							if (var6 == 1)
								var0.aBoolArray521[(var36 * 16) + var55] = true;
						}

				method254(var0);
				final int var40 = var0.anInt525 + 2;
				final int var41 = method252(3, var0);
				final int var54 = method252(15, var0);

				for (var36 = 0; var36 < var54; ++var36) {
					var55 = 0;

					while (true) {
						var6 = method249(var0);
						if (var6 == 0) {
							var0.aByteArray511[var36] = (byte) var55;
							break;
						}

						++var55;
					}
				}

				final byte[] var26 = new byte[6];

				byte var24;
				for (var24 = 0; var24 < var41; var26[var24] = var24++)
					;

				for (var36 = 0; var36 < var54; ++var36) {
					var24 = var0.aByteArray511[var36];

					byte var30;
					for (var30 = var26[var24]; var24 > 0; --var24)
						var26[var24] = var26[var24 - 1];

					var26[0] = var30;
					var0.aByteArray526[var36] = var30;
				}

				int var38;
				for (var38 = 0; var38 < var41; ++var38) {
					int var48 = method252(5, var0);

					for (var36 = 0; var36 < var40; ++var36)
						while (true) {
							var6 = method249(var0);
							if (var6 == 0) {
								var0.aByteArrayArray533[var38][var36] = (byte) var48;
								break;
							}

							var6 = method249(var0);
							if (var6 == 0)
								++var48;
							else
								--var48;
						}
				}

				for (var38 = 0; var38 < var41; ++var38) {
					byte var28 = 32;
					byte var31 = 0;

					for (var36 = 0; var36 < var40; ++var36) {
						if (var0.aByteArrayArray533[var38][var36] > var31)
							var31 = var0.aByteArrayArray533[var38][var36];

						if (var0.aByteArrayArray533[var38][var36] < var28)
							var28 = var0.aByteArrayArray533[var38][var36];
					}

					method253(var0.anIntArrayArray529[var38], var0.anIntArrayArray530[var38],
							var0.anIntArrayArray528[var38], var0.aByteArrayArray533[var38], var28, var31, var40);
					var0.anIntArray532[var38] = var28;
				}

				final int var42 = var0.anInt525 + 1;
				int var43 = -1;
				byte var37 = 0;

				for (var36 = 0; var36 <= 255; ++var36)
					var0.anIntArray516[var36] = 0;

				int var52 = 4095;

				int var23;
				int var56;
				for (var23 = 15; var23 >= 0; --var23) {
					for (var56 = 15; var56 >= 0; --var56) {
						var0.aByteArray515[var52] = (byte) ((var23 * 16) + var56);
						--var52;
					}

					var0.anIntArray498[var23] = var52 + 1;
				}

				int var53 = 0;
				byte var50;
				if (var37 == 0) {
					++var43;
					var37 = 50;
					var50 = var0.aByteArray526[var43];
					var11 = var0.anIntArray532[var50];
					var18 = var0.anIntArrayArray529[var50];
					var20 = var0.anIntArrayArray528[var50];
					var19 = var0.anIntArrayArray530[var50];
				}

				int var39 = var37 - 1;
				int var45 = var11;

				byte var49;
				int var51;
				for (var51 = method252(var11, var0); var51 > var18[var45]; var51 = (var51 << 1) | var49) {
					++var45;
					var49 = method249(var0);
				}

				int var44 = var20[var51 - var19[var45]];

				while (true) {
					while (var44 != var42)
						if ((var44 != 0) && (var44 != 1)) {
							int var32 = var44 - 1;
							int var33;
							if (var32 < 16) {
								var33 = var0.anIntArray498[0];

								for (var6 = var0.aByteArray515[var33 + var32]; var32 > 3; var32 -= 4) {
									final int var34 = var33 + var32;
									var0.aByteArray515[var34] = var0.aByteArray515[var34 - 1];
									var0.aByteArray515[var34 - 1] = var0.aByteArray515[var34 - 2];
									var0.aByteArray515[var34 - 2] = var0.aByteArray515[var34 - 3];
									var0.aByteArray515[var34 - 3] = var0.aByteArray515[var34 - 4];
								}

								while (var32 > 0) {
									var0.aByteArray515[var33 + var32] = var0.aByteArray515[(var33 + var32) - 1];
									--var32;
								}

								var0.aByteArray515[var33] = var6;
							} else {
								int var9 = var32 / 16;
								final int var35 = var32 % 16;
								var33 = var0.anIntArray498[var9] + var35;

								for (var6 = var0.aByteArray515[var33]; var33 > var0.anIntArray498[var9]; --var33)
									var0.aByteArray515[var33] = var0.aByteArray515[var33 - 1];

								++var0.anIntArray498[var9];

								while (var9 > 0) {
									--var0.anIntArray498[var9];
									var0.aByteArray515[var0.anIntArray498[var9]] = var0.aByteArray515[(var0.anIntArray498[var9
											- 1] + 16) - 1];
									--var9;
								}

								--var0.anIntArray498[0];
								var0.aByteArray515[var0.anIntArray498[0]] = var6;
								if (var0.anIntArray498[0] == 0) {
									var52 = 4095;

									for (var23 = 15; var23 >= 0; --var23) {
										for (var56 = 15; var56 >= 0; --var56) {
											var0.aByteArray515[var52] = var0.aByteArray515[var0.anIntArray498[var23]
													+ var56];
											--var52;
										}

										var0.anIntArray498[var23] = var52 + 1;
									}
								}
							}

							++var0.anIntArray516[var0.aByteArray523[var6 & 255] & 255];
							Class54.anIntArray534[var53] = var0.aByteArray523[var6 & 255] & 255;
							++var53;
							if (var39 == 0) {
								++var43;
								var39 = 50;
								var50 = var0.aByteArray526[var43];
								var11 = var0.anIntArray532[var50];
								var18 = var0.anIntArrayArray529[var50];
								var20 = var0.anIntArrayArray528[var50];
								var19 = var0.anIntArrayArray530[var50];
							}

							--var39;
							var45 = var11;

							for (var51 = method252(var11, var0); var51 > var18[var45]; var51 = (var51 << 1) | var49) {
								++var45;
								var49 = method249(var0);
							}

							var44 = var20[var51 - var19[var45]];
						} else {
							int var46 = -1;
							int var47 = 1;

							do {
								if (var44 == 0)
									var46 += var47;
								else if (var44 == 1)
									var46 += 2 * var47;

								var47 *= 2;
								if (var39 == 0) {
									++var43;
									var39 = 50;
									var50 = var0.aByteArray526[var43];
									var11 = var0.anIntArray532[var50];
									var18 = var0.anIntArrayArray529[var50];
									var20 = var0.anIntArrayArray528[var50];
									var19 = var0.anIntArrayArray530[var50];
								}

								--var39;
								var45 = var11;

								for (var51 = method252(var11, var0); var51 > var18[var45]; var51 = (var51 << 1)
										| var49) {
									++var45;
									var49 = method249(var0);
								}

								var44 = var20[var51 - var19[var45]];
							} while ((var44 == 0) || (var44 == 1));

							++var46;
							var6 = var0.aByteArray523[var0.aByteArray515[var0.anIntArray498[0]] & 255];

							for (var0.anIntArray516[var6 & 255] += var46; var46 > 0; --var46) {
								Class54.anIntArray534[var53] = var6 & 255;
								++var53;
							}
						}

					var0.anInt509 = 0;
					var0.aByte508 = 0;
					var0.anIntArray518[0] = 0;

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray518[var36] = var0.anIntArray516[var36 - 1];

					for (var36 = 1; var36 <= 256; ++var36)
						var0.anIntArray518[var36] += var0.anIntArray518[var36 - 1];

					for (var36 = 0; var36 < var53; ++var36) {
						var6 = (byte) (Class54.anIntArray534[var36] & 255);
						Class54.anIntArray534[var0.anIntArray518[var6 & 255]] |= var36 << 8;
						++var0.anIntArray518[var6 & 255];
					}

					var0.anInt514 = Class54.anIntArray534[var0.anInt513] >> 8;
					var0.anInt517 = 0;
					var0.anInt514 = Class54.anIntArray534[var0.anInt514];
					var0.anInt507 = (byte) (var0.anInt514 & 255);
					var0.anInt514 >>= 8;
					++var0.anInt517;
					var0.anInt524 = var53;
					method255(var0);
					if ((var0.anInt517 == (var0.anInt524 + 1)) && (var0.anInt509 == 0)) {
						var22 = true;
						break;
					}

					var22 = false;
					break;
				}
			}

			return;
		}
	}

	static byte method251(final Class54 var0) {
		return (byte) method252(8, var0);
	}

	static int method252(final int var0, final Class54 var1) {
		while (var1.anInt495 < var0) {
			var1.anInt510 = (var1.anInt510 << 8) | (var1.aByteArray501[var1.anInt502] & 255);
			var1.anInt495 += 8;
			++var1.anInt502;
			++var1.anInt503;
			if (var1.anInt503 == 0)
				;
		}

		final int var2 = (var1.anInt510 >> (var1.anInt495 - var0)) & ((1 << var0) - 1);
		var1.anInt495 -= var0;
		return var2;
	}

	static void method253(final int[] var0, final int[] var1, final int[] var2, final byte[] var3, final int var4,
			final int var5, final int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8)
			for (int var9 = 0; var9 < var6; ++var9)
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}

		for (var8 = 0; var8 < 23; ++var8)
			var1[var8] = 0;

		for (var8 = 0; var8 < var6; ++var8)
			++var1[var3[var8] + 1];

		for (var8 = 1; var8 < 23; ++var8)
			var1[var8] += var1[var8 - 1];

		for (var8 = 0; var8 < 23; ++var8)
			var0[var8] = 0;

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8)
			var1[var8] = ((var0[var8 - 1] + 1) << 1) - var1[var8];

	}

	static void method254(final Class54 var0) {
		var0.anInt525 = 0;

		for (int var1 = 0; var1 < 256; ++var1)
			if (var0.aBoolArray521[var1]) {
				var0.aByteArray523[var0.anInt525] = (byte) var1;
				++var0.anInt525;
			}

	}

	static void method255(final Class54 var0) {
		byte var1 = var0.aByte508;
		int var6 = var0.anInt509;
		int var2 = var0.anInt517;
		int var11 = var0.anInt507;
		final int[] var13 = Class54.anIntArray534;
		int var7 = var0.anInt514;
		final byte[] var8 = var0.aByteArray527;
		int var9 = var0.anInt505;
		int var5 = var0.anInt506;
		final int var3 = var0.anInt524 + 1;

		label116: while (true) {
			if (var6 > 0)
				while (true) {
					if (var5 == 0)
						break label116;

					if (var6 == 1) {
						if (var5 == 0) {
							var6 = 1;
							break label116;
						}

						var8[var9] = var1;
						++var9;
						--var5;
						break;
					}

					var8[var9] = var1;
					--var6;
					++var9;
					--var5;
				}

			boolean var12 = true;

			byte var10;
			while (var12) {
				var12 = false;
				if (var2 == var3) {
					var6 = 0;
					break label116;
				}

				var1 = (byte) var11;
				var7 = var13[var7];
				var10 = (byte) (var7 & 255);
				var7 >>= 8;
				++var2;
				if (var10 != var11) {
					var11 = var10;
					if (var5 == 0) {
						var6 = 1;
						break label116;
					}

					var8[var9] = var1;
					++var9;
					--var5;
					var12 = true;
				} else if (var2 == var3) {
					if (var5 == 0) {
						var6 = 1;
						break label116;
					}

					var8[var9] = var1;
					++var9;
					--var5;
					var12 = true;
				}
			}

			var6 = 2;
			var7 = var13[var7];
			var10 = (byte) (var7 & 255);
			var7 >>= 8;
			++var2;
			if (var2 != var3)
				if (var10 != var11)
					var11 = var10;
				else {
					var6 = 3;
					var7 = var13[var7];
					var10 = (byte) (var7 & 255);
					var7 >>= 8;
					++var2;
					if (var2 != var3)
						if (var10 != var11)
							var11 = var10;
						else {
							var7 = var13[var7];
							var10 = (byte) (var7 & 255);
							var7 >>= 8;
							++var2;
							var6 = (var10 & 255) + 4;
							var7 = var13[var7];
							var11 = (byte) (var7 & 255);
							var7 >>= 8;
							++var2;
						}
				}
		}

		final int var14 = var0.anInt500;
		var0.anInt500 += var5 - var5;
		if (var0.anInt500 < var14)
			;

		var0.aByte508 = var1;
		var0.anInt509 = var6;
		var0.anInt517 = var2;
		var0.anInt507 = var11;
		Class54.anIntArray534 = var13;
		var0.anInt514 = var7;
		var0.aByteArray527 = var8;
		var0.anInt505 = var9;
		var0.anInt506 = var5;
	}
}
