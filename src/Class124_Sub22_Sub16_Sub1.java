import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public final class Class124_Sub22_Sub16_Sub1 extends Class124_Sub22_Sub16 {
	public int[] anIntArray1735;
	public int anInt1733;
	public int anInt1729;
	public int anInt1734;
	public int anInt1730;
	int anInt1732;
	int anInt1731;

	public Class124_Sub22_Sub16_Sub1(final int var1, final int var2) {
		anIntArray1735 = new int[var1 * var2];
		anInt1729 = anInt1733 = var1;
		anInt1730 = anInt1734 = var2;
		anInt1732 = 0;
		anInt1731 = 0;
	}

	public Class124_Sub22_Sub16_Sub1(final byte[] var1, final Component var2) {
		try {
			final Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			final MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			anInt1729 = var3.getWidth(var2);
			anInt1730 = var3.getHeight(var2);
			anInt1733 = anInt1729;
			anInt1734 = anInt1730;
			anInt1731 = 0;
			anInt1732 = 0;
			anIntArray1735 = new int[anInt1729 * anInt1730];
			final PixelGrabber var5 = new PixelGrabber(var3, 0, 0, anInt1729, anInt1730, anIntArray1735, 0, anInt1729);
			var5.grabPixels();
		} catch (final InterruptedException var6) {
			;
		}

	}

	public void method898(final int var1) {
		if ((anInt1729 != anInt1733) || (anInt1730 != anInt1734)) {
			int var3 = var1;
			if (var1 > anInt1731)
				var3 = anInt1731;

			int var4 = var1;
			if ((var1 + anInt1731 + anInt1729) > anInt1733)
				var4 = anInt1733 - anInt1731 - anInt1729;

			int var5 = var1;
			if (var1 > anInt1732)
				var5 = anInt1732;

			int var6 = var1;
			if ((var1 + anInt1732 + anInt1730) > anInt1734)
				var6 = anInt1734 - anInt1732 - anInt1730;

			final int var7 = anInt1729 + var3 + var4;
			final int var8 = anInt1730 + var5 + var6;
			final int[] var9 = new int[var7 * var8];

			for (int var10 = 0; var10 < anInt1730; ++var10)
				for (int var2 = 0; var2 < anInt1729; ++var2)
					var9[((var10 + var5) * var7) + var2 + var3] = anIntArray1735[(var10 * anInt1729) + var2];

			anIntArray1735 = var9;
			anInt1729 = var7;
			anInt1730 = var8;
			anInt1731 -= var3;
			anInt1732 -= var5;
		}
	}

	public Class124_Sub22_Sub16_Sub1 method899() {
		final Class124_Sub22_Sub16_Sub1 var1 = new Class124_Sub22_Sub16_Sub1(anInt1729, anInt1730);
		var1.anInt1733 = anInt1733;
		var1.anInt1734 = anInt1734;
		var1.anInt1731 = anInt1733 - anInt1729 - anInt1731;
		var1.anInt1732 = anInt1732;

		for (int var3 = 0; var3 < anInt1730; ++var3)
			for (int var2 = 0; var2 < anInt1729; ++var2)
				var1.anIntArray1735[(var3 * anInt1729) + var2] = anIntArray1735[((var3 * anInt1729) + anInt1729) - 1
						- var2];

		return var1;
	}

	public void method900() {
		method780(anIntArray1735, anInt1729, anInt1730);
	}

	public void method901(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anIntArray1735.length; ++var4) {
			final int var5 = anIntArray1735[var4];
			if (var5 != 0) {
				int var6 = (var5 >> 16) & 255;
				var6 += var1;
				if (var6 < 1)
					var6 = 1;
				else if (var6 > 255)
					var6 = 255;

				int var7 = (var5 >> 8) & 255;
				var7 += var2;
				if (var7 < 1)
					var7 = 1;
				else if (var7 > 255)
					var7 = 255;

				int var8 = var5 & 255;
				var8 += var3;
				if (var8 < 1)
					var8 = 1;
				else if (var8 > 255)
					var8 = 255;

				anIntArray1735[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}

	}

	public void method902() {
		if ((anInt1729 != anInt1733) || (anInt1730 != anInt1734)) {
			final int[] var1 = new int[anInt1733 * anInt1734];

			for (int var2 = 0; var2 < anInt1730; ++var2)
				for (int var3 = 0; var3 < anInt1729; ++var3)
					var1[((var2 + anInt1732) * anInt1733) + var3 + anInt1731] = anIntArray1735[(var2 * anInt1729)
							+ var3];

			anIntArray1735 = var1;
			anInt1729 = anInt1733;
			anInt1730 = anInt1734;
			anInt1731 = 0;
			anInt1732 = 0;
		}
	}

	public void method903(int var1, int var2, final int var3) {
		var1 += anInt1731;
		var2 += anInt1732;
		int var6 = var1 + (var2 * anInt1565);
		int var9 = 0;
		int var7 = anInt1730;
		int var8 = anInt1729;
		int var4 = anInt1565 - var8;
		int var10 = 0;
		int var5;
		if (var2 < anInt1564) {
			var5 = anInt1564 - var2;
			var7 -= var5;
			var2 = anInt1564;
			var9 += var5 * var8;
			var6 += var5 * anInt1565;
		}

		if ((var2 + var7) > anInt1568)
			var7 -= (var2 + var7) - anInt1568;

		if (var1 < anInt1569) {
			var5 = anInt1569 - var1;
			var8 -= var5;
			var1 = anInt1569;
			var9 += var5;
			var6 += var5;
			var10 += var5;
			var4 += var5;
		}

		if ((var1 + var8) > anInt1567) {
			var5 = (var1 + var8) - anInt1567;
			var8 -= var5;
			var10 += var5;
			var4 += var5;
		}

		if ((var8 > 0) && (var7 > 0))
			method911(anIntArray1570, anIntArray1735, 0, var9, var6, var8, var7, var4, var10, var3);
	}

	public void method904() {
		final int[] var1 = new int[anInt1729 * anInt1730];
		int var3 = 0;

		for (int var2 = 0; var2 < anInt1730; ++var2)
			for (int var4 = anInt1729 - 1; var4 >= 0; --var4)
				var1[var3++] = anIntArray1735[var4 + (var2 * anInt1729)];

		anIntArray1735 = var1;
		anInt1731 = anInt1733 - anInt1729 - anInt1731;
	}

	public void method905() {
		final int[] var1 = new int[anInt1729 * anInt1730];
		int var4 = 0;

		for (int var2 = anInt1730 - 1; var2 >= 0; --var2)
			for (int var3 = 0; var3 < anInt1729; ++var3)
				var1[var4++] = anIntArray1735[var3 + (var2 * anInt1729)];

		anIntArray1735 = var1;
		anInt1732 = anInt1734 - anInt1730 - anInt1732;
	}

	public void method906(final int var1) {
		for (int var2 = anInt1730 - 1; var2 > 0; --var2) {
			final int var4 = var2 * anInt1729;

			for (int var3 = anInt1729 - 1; var3 > 0; --var3)
				if ((anIntArray1735[var3 + var4] == 0) && (anIntArray1735[(var3 + var4) - 1 - anInt1729] != 0))
					anIntArray1735[var3 + var4] = var1;
		}

	}

	public void method907(int var1, int var2) {
		var1 += anInt1731;
		var2 += anInt1732;
		int var4 = var1 + (var2 * anInt1565);
		int var8 = 0;
		int var3 = anInt1730;
		int var7 = anInt1729;
		int var9 = anInt1565 - var7;
		int var5 = 0;
		int var6;
		if (var2 < anInt1564) {
			var6 = anInt1564 - var2;
			var3 -= var6;
			var2 = anInt1564;
			var8 += var6 * var7;
			var4 += var6 * anInt1565;
		}

		if ((var2 + var3) > anInt1568)
			var3 -= (var2 + var3) - anInt1568;

		if (var1 < anInt1569) {
			var6 = anInt1569 - var1;
			var7 -= var6;
			var1 = anInt1569;
			var8 += var6;
			var4 += var6;
			var5 += var6;
			var9 += var6;
		}

		if ((var1 + var7) > anInt1567) {
			var6 = (var1 + var7) - anInt1567;
			var7 -= var6;
			var5 += var6;
			var9 += var6;
		}

		if ((var7 > 0) && (var3 > 0))
			method912(anIntArray1570, anIntArray1735, 0, var8, var4, var7, var3, var9, var5);
	}

	public void method908(int var1, int var2, int var3, int var4) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var7 = anInt1729;
			final int var8 = anInt1730;
			int var9 = 0;
			int var14 = 0;
			final int var10 = anInt1733;
			final int var5 = anInt1734;
			final int var11 = (var10 << 16) / var3;
			final int var6 = (var5 << 16) / var4;
			int var12;
			if (anInt1731 > 0) {
				var12 = (((anInt1731 << 16) + var11) - 1) / var11;
				var1 += var12;
				var9 += (var12 * var11) - (anInt1731 << 16);
			}

			if (anInt1732 > 0) {
				var12 = (((anInt1732 << 16) + var6) - 1) / var6;
				var2 += var12;
				var14 += (var12 * var6) - (anInt1732 << 16);
			}

			if (var7 < var10)
				var3 = ((((var7 << 16) - var9) + var11) - 1) / var11;

			if (var8 < var5)
				var4 = ((((var8 << 16) - var14) + var6) - 1) / var6;

			var12 = var1 + (var2 * anInt1565);
			int var15 = anInt1565 - var3;
			if ((var2 + var4) > anInt1568)
				var4 -= (var2 + var4) - anInt1568;

			int var13;
			if (var2 < anInt1564) {
				var13 = anInt1564 - var2;
				var4 -= var13;
				var12 += var13 * anInt1565;
				var14 += var6 * var13;
			}

			if ((var1 + var3) > anInt1567) {
				var13 = (var1 + var3) - anInt1567;
				var3 -= var13;
				var15 += var13;
			}

			if (var1 < anInt1569) {
				var13 = anInt1569 - var1;
				var3 -= var13;
				var12 += var13;
				var9 += var11 * var13;
				var15 += var13;
			}

			method922(anIntArray1570, anIntArray1735, 0, var9, var14, var12, var15, var3, var4, var11, var6, var7);
		}
	}

	static void method909(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9, int var10) {
		final int var11 = 256 - var9;
		int var13 = ((var10 & 16711935) * var11) & -16711936;
		int var12 = ((var10 & '\uff00') * var11) & 16711680;
		var10 = (var13 | var12) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var13 = ((var2 & 16711935) * var9) & -16711936;
					var12 = ((var2 & '\uff00') * var9) & 16711680;
					var0[var4++] = ((var13 | var12) >>> 8) + var10;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	static void method910(final int[] var0, final int[] var1, int var2, int var3, final int var4, final int var5,
			final int var6, final int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = (var3 + var4) - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++])
				;

			var3 += var6;
			var2 += var7;
		}

	}

	static void method911(final int[] var0, final int[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, final int var9) {
		final int var10 = 256 - var9;

		for (int var12 = -var6; var12 < 0; ++var12) {
			for (int var13 = -var5; var13 < 0; ++var13) {
				var2 = var1[var3++];
				if (var2 != 0) {
					final int var11 = var0[var4];
					var0[var4++] = (((((var2 & 16711935) * var9) + ((var11 & 16711935) * var10)) & -16711936)
							+ ((((var2 & '\uff00') * var9) + ((var11 & '\uff00') * var10)) & 16711680)) >> 8;
				} else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	Class124_Sub22_Sub16_Sub1() {
	}

	static void method912(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			int var10;
			for (var10 = var9; var10 < 0; ++var10) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;

				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var10 = var5; var10 < 0; ++var10) {
				var2 = var1[var3++];
				if (var2 != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method913(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int[] var9, final int[] var10) {
		try {
			final int var11 = -var3 / 2;
			final int var12 = -var4 / 2;
			int var13 = (int) (Math.sin(var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(var7 / 326.11D) * 65536.0D);
			var13 = (var13 * var8) >> 8;
			var14 = (var14 * var8) >> 8;
			int var15 = (var5 << 16) + (var12 * var13) + (var11 * var14);
			int var16 = (var6 << 16) + ((var12 * var14) - (var11 * var13));
			int var17 = var1 + (var2 * anInt1565);

			for (var2 = 0; var2 < var4; ++var2) {
				final int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + (var14 * var18);
				int var21 = var16 - (var13 * var18);

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					anIntArray1570[var19++] = anIntArray1735[(var20 >> 16) + ((var21 >> 16) * anInt1729)];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += anInt1565;
			}
		} catch (final Exception var23) {
			;
		}

	}

	public void method914(int var1, int var2, final int var3, final int var4, final int var5, final int var6,
			final double var7, final int var9) {
		try {
			final int var10 = -var3 / 2;
			final int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = (var12 * var9) >> 8;
			var13 = (var13 * var9) >> 8;
			int var14 = (var5 << 16) + (var11 * var12) + (var10 * var13);
			int var15 = (var6 << 16) + ((var11 * var13) - (var10 * var12));
			int var16 = var1 + (var2 * anInt1565);

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					final int var20 = anIntArray1735[(var18 >> 16) + ((var19 >> 16) * anInt1729)];
					if (var20 != 0)
						anIntArray1570[var17++] = var20;
					else
						++var17;

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += anInt1565;
			}
		} catch (final Exception var22) {
			;
		}

	}

	void method915(int var1, int var2, final int var3, final int var4, final int var5, final int var6) {
		if (var6 != 0) {
			var1 -= anInt1731 << 4;
			var2 -= anInt1732 << 4;
			final double var10 = (var5 & '\uffff') * 9.587379924285257E-5D;
			final int var15 = (int) Math.floor((Math.sin(var10) * var6) + 0.5D);
			final int var14 = (int) Math.floor((Math.cos(var10) * var6) + 0.5D);
			final int var16 = (-var1 * var14) + (-var2 * var15);
			final int var17 = (-(-var1) * var15) + (-var2 * var14);
			final int var24 = (((anInt1729 << 4) - var1) * var14) + (-var2 * var15);
			final int var20 = (-((anInt1729 << 4) - var1) * var15) + (-var2 * var14);
			final int var21 = (-var1 * var14) + (((anInt1730 << 4) - var2) * var15);
			final int var22 = (-(-var1) * var15) + (((anInt1730 << 4) - var2) * var14);
			final int var18 = (((anInt1729 << 4) - var1) * var14) + (((anInt1730 << 4) - var2) * var15);
			final int var23 = (-((anInt1729 << 4) - var1) * var15) + (((anInt1730 << 4) - var2) * var14);
			int var19;
			int var25;
			if (var16 < var24) {
				var19 = var16;
				var25 = var24;
			} else {
				var19 = var24;
				var25 = var16;
			}

			if (var21 < var19)
				var19 = var21;

			if (var18 < var19)
				var19 = var18;

			if (var21 > var25)
				var25 = var21;

			if (var18 > var25)
				var25 = var18;

			int var7;
			int var32;
			if (var17 < var20) {
				var7 = var17;
				var32 = var20;
			} else {
				var7 = var20;
				var32 = var17;
			}

			if (var22 < var7)
				var7 = var22;

			if (var23 < var7)
				var7 = var23;

			if (var22 > var32)
				var32 = var22;

			if (var23 > var32)
				var32 = var23;

			var19 >>= 12;
			var25 = (var25 + 4095) >> 12;
			var7 >>= 12;
			var32 = (var32 + 4095) >> 12;
			var19 += var3;
			var25 += var3;
			var7 += var4;
			var32 += var4;
			var19 >>= 4;
			var25 = (var25 + 15) >> 4;
			var7 >>= 4;
			var32 = (var32 + 15) >> 4;
			if (var19 < anInt1569)
				var19 = anInt1569;

			if (var25 > anInt1567)
				var25 = anInt1567;

			if (var7 < anInt1564)
				var7 = anInt1564;

			if (var32 > anInt1568)
				var32 = anInt1568;

			var25 = var19 - var25;
			if (var25 < 0) {
				var32 = var7 - var32;
				if (var32 < 0) {
					int var34 = (var7 * anInt1565) + var19;
					final double var35 = 1.6777216E7D / var6;
					final int var31 = (int) Math.floor((Math.sin(var10) * var35) + 0.5D);
					final int var9 = (int) Math.floor((Math.cos(var10) * var35) + 0.5D);
					final int var30 = ((var19 << 4) + 8) - var3;
					final int var38 = ((var7 << 4) + 8) - var4;
					int var26 = (var1 << 8) - ((var38 * var31) >> 4);
					int var29 = (var2 << 8) + ((var38 * var9) >> 4);
					int var8;
					int var12;
					int var13;
					int var27;
					int var28;
					int var33;
					int var37;
					if (var9 == 0) {
						if (var31 == 0)
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26;
								var12 = var29;
								var28 = var25;
								if ((var26 >= 0) && (var29 >= 0) && ((var26 - (anInt1729 << 12)) < 0)
										&& ((var29 - (anInt1730 << 12)) < 0))
									for (; var28 < 0; ++var28) {
										var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
										if (var13 != 0)
											anIntArray1570[var33++] = var13;
										else
											++var33;
									}

								++var37;
							}
						else if (var31 < 0)
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26;
								var12 = var29 + ((var30 * var31) >> 4);
								var28 = var25;
								if ((var26 >= 0) && ((var26 - (anInt1729 << 12)) < 0)) {
									if ((var27 = var12 - (anInt1730 << 12)) >= 0) {
										var27 = (var31 - var27) / var31;
										var28 = var25 + var27;
										var12 += var31 * var27;
										var33 = var34 + var27;
									}

									if ((var27 = (var12 - var31) / var31) > var28)
										var28 = var27;

									while (var28 < 0) {
										var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
										if (var13 != 0)
											anIntArray1570[var33++] = var13;
										else
											++var33;

										var12 += var31;
										++var28;
									}
								}

								++var37;
								var26 -= var31;
							}
						else
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26;
								var12 = var29 + ((var30 * var31) >> 4);
								var28 = var25;
								if ((var26 >= 0) && ((var26 - (anInt1729 << 12)) < 0)) {
									if (var12 < 0) {
										var27 = (var31 - 1 - var12) / var31;
										var28 = var25 + var27;
										var12 += var31 * var27;
										var33 = var34 + var27;
									}

									if ((var27 = ((1 + var12) - (anInt1730 << 12) - var31) / var31) > var28)
										var28 = var27;

									while (var28 < 0) {
										var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
										if (var13 != 0)
											anIntArray1570[var33++] = var13;
										else
											++var33;

										var12 += var31;
										++var28;
									}
								}

								++var37;
								var26 -= var31;
							}
					} else if (var9 < 0) {
						if (var31 == 0)
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26 + ((var30 * var9) >> 4);
								var12 = var29;
								var28 = var25;
								if ((var29 >= 0) && ((var29 - (anInt1730 << 12)) < 0)) {
									if ((var27 = var8 - (anInt1729 << 12)) >= 0) {
										var27 = (var9 - var27) / var9;
										var28 = var25 + var27;
										var8 += var9 * var27;
										var33 = var34 + var27;
									}

									if ((var27 = (var8 - var9) / var9) > var28)
										var28 = var27;

									while (var28 < 0) {
										var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
										if (var13 != 0)
											anIntArray1570[var33++] = var13;
										else
											++var33;

										var8 += var9;
										++var28;
									}
								}

								++var37;
								var29 += var9;
							}
						else if (var31 < 0)
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26 + ((var30 * var9) >> 4);
								var12 = var29 + ((var30 * var31) >> 4);
								var28 = var25;
								if ((var27 = var8 - (anInt1729 << 12)) >= 0) {
									var27 = (var9 - var27) / var9;
									var28 = var25 + var27;
									var8 += var9 * var27;
									var12 += var31 * var27;
									var33 = var34 + var27;
								}

								if ((var27 = (var8 - var9) / var9) > var28)
									var28 = var27;

								if ((var27 = var12 - (anInt1730 << 12)) >= 0) {
									var27 = (var31 - var27) / var31;
									var28 += var27;
									var8 += var9 * var27;
									var12 += var31 * var27;
									var33 += var27;
								}

								if ((var27 = (var12 - var31) / var31) > var28)
									var28 = var27;

								while (var28 < 0) {
									var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
									if (var13 != 0)
										anIntArray1570[var33++] = var13;
									else
										++var33;

									var8 += var9;
									var12 += var31;
									++var28;
								}

								++var37;
								var26 -= var31;
								var29 += var9;
							}
						else
							for (var37 = var32; var37 < 0; var34 += anInt1565) {
								var33 = var34;
								var8 = var26 + ((var30 * var9) >> 4);
								var12 = var29 + ((var30 * var31) >> 4);
								var28 = var25;
								if ((var27 = var8 - (anInt1729 << 12)) >= 0) {
									var27 = (var9 - var27) / var9;
									var28 = var25 + var27;
									var8 += var9 * var27;
									var12 += var31 * var27;
									var33 = var34 + var27;
								}

								if ((var27 = (var8 - var9) / var9) > var28)
									var28 = var27;

								if (var12 < 0) {
									var27 = (var31 - 1 - var12) / var31;
									var28 += var27;
									var8 += var9 * var27;
									var12 += var31 * var27;
									var33 += var27;
								}

								if ((var27 = ((1 + var12) - (anInt1730 << 12) - var31) / var31) > var28)
									var28 = var27;

								while (var28 < 0) {
									var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
									if (var13 != 0)
										anIntArray1570[var33++] = var13;
									else
										++var33;

									var8 += var9;
									var12 += var31;
									++var28;
								}

								++var37;
								var26 -= var31;
								var29 += var9;
							}
					} else if (var31 == 0)
						for (var37 = var32; var37 < 0; var34 += anInt1565) {
							var33 = var34;
							var8 = var26 + ((var30 * var9) >> 4);
							var12 = var29;
							var28 = var25;
							if ((var29 >= 0) && ((var29 - (anInt1730 << 12)) < 0)) {
								if (var8 < 0) {
									var27 = (var9 - 1 - var8) / var9;
									var28 = var25 + var27;
									var8 += var9 * var27;
									var33 = var34 + var27;
								}

								if ((var27 = ((1 + var8) - (anInt1729 << 12) - var9) / var9) > var28)
									var28 = var27;

								while (var28 < 0) {
									var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
									if (var13 != 0)
										anIntArray1570[var33++] = var13;
									else
										++var33;

									var8 += var9;
									++var28;
								}
							}

							++var37;
							var29 += var9;
						}
					else if (var31 < 0)
						for (var37 = var32; var37 < 0; var34 += anInt1565) {
							var33 = var34;
							var8 = var26 + ((var30 * var9) >> 4);
							var12 = var29 + ((var30 * var31) >> 4);
							var28 = var25;
							if (var8 < 0) {
								var27 = (var9 - 1 - var8) / var9;
								var28 = var25 + var27;
								var8 += var9 * var27;
								var12 += var31 * var27;
								var33 = var34 + var27;
							}

							if ((var27 = ((1 + var8) - (anInt1729 << 12) - var9) / var9) > var28)
								var28 = var27;

							if ((var27 = var12 - (anInt1730 << 12)) >= 0) {
								var27 = (var31 - var27) / var31;
								var28 += var27;
								var8 += var9 * var27;
								var12 += var31 * var27;
								var33 += var27;
							}

							if ((var27 = (var12 - var31) / var31) > var28)
								var28 = var27;

							while (var28 < 0) {
								var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
								if (var13 != 0)
									anIntArray1570[var33++] = var13;
								else
									++var33;

								var8 += var9;
								var12 += var31;
								++var28;
							}

							++var37;
							var26 -= var31;
							var29 += var9;
						}
					else
						for (var37 = var32; var37 < 0; var34 += anInt1565) {
							var33 = var34;
							var8 = var26 + ((var30 * var9) >> 4);
							var12 = var29 + ((var30 * var31) >> 4);
							var28 = var25;
							if (var8 < 0) {
								var27 = (var9 - 1 - var8) / var9;
								var28 = var25 + var27;
								var8 += var9 * var27;
								var12 += var31 * var27;
								var33 = var34 + var27;
							}

							if ((var27 = ((1 + var8) - (anInt1729 << 12) - var9) / var9) > var28)
								var28 = var27;

							if (var12 < 0) {
								var27 = (var31 - 1 - var12) / var31;
								var28 += var27;
								var8 += var9 * var27;
								var12 += var31 * var27;
								var33 += var27;
							}

							if ((var27 = ((1 + var12) - (anInt1730 << 12) - var31) / var31) > var28)
								var28 = var27;

							while (var28 < 0) {
								var13 = anIntArray1735[((var12 >> 12) * anInt1729) + (var8 >> 12)];
								if (var13 != 0)
									anIntArray1570[var33++] = var13;
								else
									++var33;

								var8 += var9;
								var12 += var31;
								++var28;
							}

							++var37;
							var26 -= var31;
							var29 += var9;
						}

				}
			}
		}
	}

	public void method916(int var1, int var2, final int var3, final int var4) {
		var1 += anInt1731;
		var2 += anInt1732;
		int var8 = var1 + (var2 * anInt1565);
		int var9 = 0;
		int var10 = anInt1730;
		int var6 = anInt1729;
		int var11 = anInt1565 - var6;
		int var7 = 0;
		int var5;
		if (var2 < anInt1564) {
			var5 = anInt1564 - var2;
			var10 -= var5;
			var2 = anInt1564;
			var9 += var5 * var6;
			var8 += var5 * anInt1565;
		}

		if ((var2 + var10) > anInt1568)
			var10 -= (var2 + var10) - anInt1568;

		if (var1 < anInt1569) {
			var5 = anInt1569 - var1;
			var6 -= var5;
			var1 = anInt1569;
			var9 += var5;
			var8 += var5;
			var7 += var5;
			var11 += var5;
		}

		if ((var1 + var6) > anInt1567) {
			var5 = (var1 + var6) - anInt1567;
			var6 -= var5;
			var7 += var5;
			var11 += var5;
		}

		if ((var6 > 0) && (var10 > 0))
			method909(anIntArray1570, anIntArray1735, 0, var9, var8, var6, var10, var11, var7, var3, var4);
	}

	public void method917(int var1, int var2) {
		var1 += anInt1731;
		var2 += anInt1732;
		int var8 = var1 + (var2 * anInt1565);
		int var4 = 0;
		int var5 = anInt1730;
		int var6 = anInt1729;
		int var7 = anInt1565 - var6;
		int var9 = 0;
		int var3;
		if (var2 < anInt1564) {
			var3 = anInt1564 - var2;
			var5 -= var3;
			var2 = anInt1564;
			var4 += var3 * var6;
			var8 += var3 * anInt1565;
		}

		if ((var2 + var5) > anInt1568)
			var5 -= (var2 + var5) - anInt1568;

		if (var1 < anInt1569) {
			var3 = anInt1569 - var1;
			var6 -= var3;
			var1 = anInt1569;
			var4 += var3;
			var8 += var3;
			var9 += var3;
			var7 += var3;
		}

		if ((var1 + var6) > anInt1567) {
			var3 = (var1 + var6) - anInt1567;
			var6 -= var3;
			var9 += var3;
			var7 += var3;
		}

		if ((var6 > 0) && (var5 > 0))
			method910(anIntArray1570, anIntArray1735, var4, var8, var6, var5, var7, var9);
	}

	public void method918(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int[] var7, final int[] var8) {
		final int var17 = var2 < 0 ? -var2 : 0;
		final int var10 = (var2 + anInt1730) <= var6 ? anInt1730 : var6 - var2;
		final int var11 = var1 < 0 ? -var1 : 0;
		if ((var1 + anInt1729) <= var5) {
		} else {
		}

		int var9 = var3 + var1 + var11 + ((var4 + var2 + var17) * anInt1565);
		int var13 = var2 + var17;

		for (int var18 = var17; var18 < var10; ++var18) {
			final int var14 = var7[var13];
			final int var15 = var8[var13++];
			int var12 = var9;
			int var20;
			if (var1 < var14) {
				var20 = var14 - var1;
				var12 = var9 + (var20 - var11);
			} else
				var20 = var11;

			int var16;
			if ((var1 + anInt1729) <= (var14 + var15))
				var16 = anInt1729;
			else
				var16 = (var14 + var15) - var1;

			for (int var19 = var20; var19 < var16; ++var19) {
				final int var21 = anIntArray1735[var19 + (var18 * anInt1729)];
				if (var21 != 0)
					anIntArray1570[var12++] = var21;
				else
					++var12;
			}

			var9 += anInt1565;
		}

	}

	public void method919(final int var1, final int var2, final int var3, final int var4) {
		method915(anInt1733 << 3, anInt1734 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	static void method920(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11, final int var12) {
		final int var13 = 256 - var12;
		final int var18 = var3;

		for (int var14 = -var8; var14 < 0; ++var14) {
			final int var16 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					final int var17 = var0[var5];
					var0[var5++] = (((((var2 & 16711935) * var12) + ((var17 & 16711935) * var13)) & -16711936)
							+ ((((var2 & '\uff00') * var12) + ((var17 & '\uff00') * var13)) & 16711680)) >> 8;
				} else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var18;
			var5 += var6;
		}

	}

	public void method921(int var1, int var2, int var3, int var4, final int var5) {
		if ((var3 > 0) && (var4 > 0)) {
			final int var15 = anInt1729;
			final int var9 = anInt1730;
			int var10 = 0;
			int var11 = 0;
			final int var7 = anInt1733;
			final int var12 = anInt1734;
			final int var8 = (var7 << 16) / var3;
			final int var13 = (var12 << 16) / var4;
			int var14;
			if (anInt1731 > 0) {
				var14 = (((anInt1731 << 16) + var8) - 1) / var8;
				var1 += var14;
				var10 += (var14 * var8) - (anInt1731 << 16);
			}

			if (anInt1732 > 0) {
				var14 = (((anInt1732 << 16) + var13) - 1) / var13;
				var2 += var14;
				var11 += (var14 * var13) - (anInt1732 << 16);
			}

			if (var15 < var7)
				var3 = ((((var15 << 16) - var10) + var8) - 1) / var8;

			if (var9 < var12)
				var4 = ((((var9 << 16) - var11) + var13) - 1) / var13;

			var14 = var1 + (var2 * anInt1565);
			int var16 = anInt1565 - var3;
			if ((var2 + var4) > anInt1568)
				var4 -= (var2 + var4) - anInt1568;

			int var6;
			if (var2 < anInt1564) {
				var6 = anInt1564 - var2;
				var4 -= var6;
				var14 += var6 * anInt1565;
				var11 += var13 * var6;
			}

			if ((var1 + var3) > anInt1567) {
				var6 = (var1 + var3) - anInt1567;
				var3 -= var6;
				var16 += var6;
			}

			if (var1 < anInt1569) {
				var6 = anInt1569 - var1;
				var3 -= var6;
				var14 += var6;
				var10 += var8 * var6;
				var16 += var6;
			}

			method920(anIntArray1570, anIntArray1735, 0, var10, var11, var14, var16, var3, var4, var8, var13, var15,
					var5);
		}
	}

	static void method922(final int[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			final int var7, final int var8, final int var9, final int var10, final int var11) {
		final int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			final int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0)
					var0[var5++] = var2;
				else
					++var5;

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	public Class124_Sub22_Sub16_Sub1 method923() {
		final Class124_Sub22_Sub16_Sub1 var1 = new Class124_Sub22_Sub16_Sub1(anInt1733, anInt1734);

		for (int var2 = 0; var2 < anInt1730; ++var2)
			for (int var3 = 0; var3 < anInt1729; ++var3)
				var1.anIntArray1735[((var2 + anInt1732) * anInt1733) + var3
						+ anInt1731] = anIntArray1735[(var2 * anInt1729) + var3];

		return var1;
	}

	public void method924(final int var1) {
		final int[] var2 = new int[anInt1729 * anInt1730];
		int var3 = 0;

		for (int var4 = 0; var4 < anInt1730; ++var4)
			for (int var5 = 0; var5 < anInt1729; ++var5) {
				int var6 = anIntArray1735[var3];
				if (var6 == 0)
					if ((var5 > 0) && (anIntArray1735[var3 - 1] != 0))
						var6 = var1;
					else if ((var4 > 0) && (anIntArray1735[var3 - anInt1729] != 0))
						var6 = var1;
					else if ((var5 < (anInt1729 - 1)) && (anIntArray1735[var3 + 1] != 0))
						var6 = var1;
					else if ((var4 < (anInt1730 - 1)) && (anIntArray1735[var3 + anInt1729] != 0))
						var6 = var1;

				var2[var3++] = var6;
			}

		anIntArray1735 = var2;
	}
}
