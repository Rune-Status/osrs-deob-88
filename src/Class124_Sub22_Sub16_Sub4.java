import java.util.Random;

public abstract class Class124_Sub22_Sub16_Sub4 extends Class124_Sub22_Sub16 {
	public static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array1921;
	static int anInt1935 = 0;
	byte[][] aByteArrayArray1922 = new byte[256][];
	public int anInt1934 = 0;
	int[] anIntArray1924;
	byte[] aByteArray1926;
	static int anInt1933 = 256;
	static int anInt1927 = -1;
	static int anInt1916 = -1;
	static int anInt1929 = -1;
	static int anInt1928 = -1;
	static int anInt1936 = 0;
	static int anInt1932 = 0;
	static int anInt1925 = 0;
	static Random aRandom1917 = new Random();
	static String[] aStringArray1937 = new String[100];
	int[] anIntArray1920;
	int[] anIntArray1931;
	int[] anIntArray1918;
	int[] anIntArray1919;
	int anInt1923;
	int anInt1930;

	void method1014(final String var1, int var2, int var3) {
		var3 -= anInt1934;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6)
			if (var1.charAt(var6) != 0) {
				char var7 = (char) (Class18.method88(var1.charAt(var6)) & 255);
				if (var7 == 60)
					var4 = var6;
				else {
					int var10;
					if ((var7 == 62) && (var4 != -1)) {
						final String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt"))
							var7 = 60;
						else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img="))
									try {
										final String var9 = var8.substring(4);
										var10 = Class124_Sub22_Sub19_Sub2.method889(var9, 10, true);
										final Class124_Sub22_Sub16_Sub2 var12 = aClass124_Sub22_Sub16_Sub2Array1921[var10];
										var12.method926(var2, (var3 + anInt1934) - var12.anInt1743);
										var2 += var12.anInt1741;
										var5 = -1;
									} catch (final Exception var16) {
										;
									}
								else
									method1026(var8);
								continue;
							}

							var7 = 62;
						}
					}

					if (var7 == 160)
						var7 = 32;

					if (var4 == -1) {
						if ((aByteArray1926 != null) && (var5 != -1))
							var2 += aByteArray1926[(var5 << 8) + var7];

						final int var14 = anIntArray1918[var7];
						var10 = anIntArray1919[var7];
						if (var7 != 32) {
							if (anInt1933 == 256) {
								if (anInt1928 != -1)
									method1030(aByteArrayArray1922[var7], var2 + anIntArray1920[var7] + 1,
											var3 + anIntArray1931[var7] + 1, var14, var10, anInt1928);

								method1038(aByteArrayArray1922[var7], var2 + anIntArray1920[var7],
										var3 + anIntArray1931[var7], var14, var10, anInt1932);
							} else {
								if (anInt1928 != -1)
									method1032(aByteArrayArray1922[var7], var2 + anIntArray1920[var7] + 1,
											var3 + anIntArray1931[var7] + 1, var14, var10, anInt1928, anInt1933);

								method1029(aByteArrayArray1922[var7], var2 + anIntArray1920[var7],
										var3 + anIntArray1931[var7], var14, var10, anInt1932, anInt1933);
							}
						} else if (anInt1925 > 0) {
							anInt1935 += anInt1925;
							var2 += anInt1935 >> 8;
							anInt1935 &= 255;
						}

						final int var15 = anIntArray1924[var7];
						if (anInt1927 != -1)
							method776(var2, var3 + (int) (anInt1934 * 0.7D), var15, anInt1927);

						if (anInt1916 != -1)
							method776(var2, var3 + anInt1934 + 1, var15, anInt1916);

						var2 += var15;
						var5 = var7;
					}
				}
			}

	}

	Class124_Sub22_Sub16_Sub4(final byte[] var1) {
		method1015(var1);
	}

	void method1015(final byte[] var1) {
		anIntArray1924 = new int[256];
		int var5;
		if (var1.length == 257) {
			for (var5 = 0; var5 < anIntArray1924.length; ++var5)
				anIntArray1924[var5] = var1[var5] & 255;

			anInt1934 = var1[256] & 255;
		} else {
			var5 = 0;

			for (int var6 = 0; var6 < 256; ++var6)
				anIntArray1924[var6] = var1[var5++] & 255;

			final int[] var8 = new int[256];
			final int[] var2 = new int[256];

			int var7;
			for (var7 = 0; var7 < 256; ++var7)
				var8[var7] = var1[var5++] & 255;

			for (var7 = 0; var7 < 256; ++var7)
				var2[var7] = var1[var5++] & 255;

			final byte[][] var11 = new byte[256][];

			int var12;
			for (int var3 = 0; var3 < 256; ++var3) {
				var11[var3] = new byte[var8[var3]];
				byte var4 = 0;

				for (var12 = 0; var12 < var11[var3].length; ++var12) {
					var4 += var1[var5++];
					var11[var3][var12] = var4;
				}
			}

			final byte[][] var10 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var10[var13] = new byte[var8[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var10[var13].length; ++var9) {
					var14 += var1[var5++];
					var10[var13][var9] = var14;
				}
			}

			aByteArray1926 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13)
				if ((var13 != 32) && (var13 != 160))
					for (var12 = 0; var12 < 256; ++var12)
						if ((var12 != 32) && (var12 != 160))
							aByteArray1926[(var13 << 8) + var12] = (byte) method1016(var11, var10, var2, anIntArray1924,
									var8, var13, var12);

			anInt1934 = var2[32] + var8[32];
		}

	}

	static int method1016(final byte[][] var0, final byte[][] var1, final int[] var2, final int[] var3,
			final int[] var4, final int var5, final int var6) {
		final int var7 = var2[var5];
		final int var13 = var7 + var4[var5];
		final int var8 = var2[var6];
		final int var9 = var8 + var4[var6];
		int var10 = var7;
		if (var8 > var7)
			var10 = var8;

		int var14 = var13;
		if (var9 < var13)
			var14 = var9;

		int var15 = var3[var5];
		if (var3[var6] < var15)
			var15 = var3[var6];

		final byte[] var16 = var1[var5];
		final byte[] var12 = var0[var6];
		int var11 = var10 - var7;
		int var18 = var10 - var8;

		for (int var17 = var10; var17 < var14; ++var17) {
			final int var19 = var16[var11++] + var12[var18++];
			if (var19 < var15)
				var15 = var19;
		}

		return -var15;
	}

	int method1017(char var1) {
		if (var1 == 160)
			var1 = 32;

		return anIntArray1924[Class18.method88(var1) & 255];
	}

	public int method1018(final String var1) {
		if (var1 == null)
			return 0;
		else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == 60)
					var2 = var5;
				else {
					if ((var6 == 62) && (var2 != -1)) {
						final String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt"))
							var6 = 60;
						else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img="))
									try {
										final String var8 = var7.substring(4);
										final int var9 = Class124_Sub22_Sub19_Sub2.method889(var8, 10, true);
										var4 += aClass124_Sub22_Sub16_Sub2Array1921[var9].anInt1741;
										var3 = -1;
									} catch (final Exception var12) {
										;
									}
								continue;
							}

							var6 = 62;
						}
					}

					if (var6 == 160)
						var6 = 32;

					if (var2 == -1) {
						var4 += anIntArray1924[(char) (Class18.method88(var6) & 255)];
						if ((aByteArray1926 != null) && (var3 != -1))
							var4 += aByteArray1926[(var3 << 8) + var6];

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method1019(final String var1, final int var2) {
		final int var3 = method1039(var1, new int[] { var2 }, aStringArray1937);
		int var5 = 0;

		for (int var6 = 0; var6 < var3; ++var6) {
			final int var4 = method1018(aStringArray1937[var6]);
			if (var4 > var5)
				var5 = var4;
		}

		return var5;
	}

	public void method1020(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1025(var4, var5);
			method1014(var1, var2, var3);
		}
	}

	public void method1021(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1025(var4, var5);
			method1014(var1, var2 - (method1018(var1) / 2), var3);
		}
	}

	public void method1022(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1025(var4, var5);
			final int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8)
				var7[var8] = (int) (Math.sin((var8 / 2.0D) + (var6 / 5.0D)) * 5.0D);

			method1023(var1, var2 - (method1018(var1) / 2), var3, (int[]) null, var7);
		}
	}

	void method1023(final String var1, int var2, int var3, final int[] var4, final int[] var5) {
		var3 -= anInt1934;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9)
			if (var1.charAt(var9) != 0) {
				char var10 = (char) (Class18.method88(var1.charAt(var9)) & 255);
				if (var10 == 60)
					var6 = var9;
				else {
					int var12;
					int var13;
					int var15;
					if ((var10 == 62) && (var6 != -1)) {
						final String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt"))
							var10 = 60;
						else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img="))
									try {
										if (var4 != null)
											var12 = var4[var8];
										else
											var12 = 0;

										if (var5 != null)
											var13 = var5[var8];
										else
											var13 = 0;

										++var8;
										final String var14 = var11.substring(4);
										var15 = Class124_Sub22_Sub19_Sub2.method889(var14, 10, true);
										final Class124_Sub22_Sub16_Sub2 var17 = aClass124_Sub22_Sub16_Sub2Array1921[var15];
										var17.method926(var2 + var12, ((var3 + anInt1934) - var17.anInt1743) + var13);
										var2 += var17.anInt1741;
										var7 = -1;
									} catch (final Exception var21) {
										;
									}
								else
									method1026(var11);
								continue;
							}

							var10 = 62;
						}
					}

					if (var10 == 160)
						var10 = 32;

					if (var6 == -1) {
						if ((aByteArray1926 != null) && (var7 != -1))
							var2 += aByteArray1926[(var7 << 8) + var10];

						final int var19 = anIntArray1918[var10];
						var12 = anIntArray1919[var10];
						if (var4 != null)
							var13 = var4[var8];
						else
							var13 = 0;

						if (var5 != null)
							var15 = var5[var8];
						else
							var15 = 0;

						++var8;
						if (var10 != 32) {
							if (anInt1933 == 256) {
								if (anInt1928 != -1)
									method1030(aByteArrayArray1922[var10], var2 + anIntArray1920[var10] + 1 + var13,
											var3 + anIntArray1931[var10] + 1 + var15, var19, var12, anInt1928);

								method1038(aByteArrayArray1922[var10], var2 + anIntArray1920[var10] + var13,
										var3 + anIntArray1931[var10] + var15, var19, var12, anInt1932);
							} else {
								if (anInt1928 != -1)
									method1032(aByteArrayArray1922[var10], var2 + anIntArray1920[var10] + 1 + var13,
											var3 + anIntArray1931[var10] + 1 + var15, var19, var12, anInt1928,
											anInt1933);

								method1029(aByteArrayArray1922[var10], var2 + anIntArray1920[var10] + var13,
										var3 + anIntArray1931[var10] + var15, var19, var12, anInt1932, anInt1933);
							}
						} else if (anInt1925 > 0) {
							anInt1935 += anInt1925;
							var2 += anInt1935 >> 8;
							anInt1935 &= 255;
						}

						final int var20 = anIntArray1924[var10];
						if (anInt1927 != -1)
							method776(var2, var3 + (int) (anInt1934 * 0.7D), var20, anInt1927);

						if (anInt1916 != -1)
							method776(var2, var3 + anInt1934, var20, anInt1916);

						var2 += var20;
						var7 = var10;
					}
				}
			}

	}

	public void method1024(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1025(var4, var5);
			aRandom1917.setSeed(var6);
			anInt1933 = 192 + (aRandom1917.nextInt() & 31);
			final int[] var7 = new int[var1.length()];
			int var9 = 0;

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = var9;
				if ((aRandom1917.nextInt() & 3) == 0)
					++var9;
			}

			method1023(var1, var2, var3, var7, (int[]) null);
		}
	}

	void method1025(final int var1, final int var2) {
		anInt1927 = -1;
		anInt1916 = -1;
		anInt1929 = var2;
		anInt1928 = var2;
		anInt1936 = var1;
		anInt1932 = var1;
		anInt1933 = 256;
		anInt1925 = 0;
		anInt1935 = 0;
	}

	void method1026(final String var1) {
		try {
			if (var1.startsWith("col="))
				anInt1932 = Class124_Sub22_Sub19_Sub3_Sub1.method1043(var1.substring(4), 16);
			else if (var1.equals("/col"))
				anInt1932 = anInt1936;
			else if (var1.startsWith("str="))
				anInt1927 = Class124_Sub22_Sub19_Sub3_Sub1.method1043(var1.substring(4), 16);
			else if (var1.equals("str"))
				anInt1927 = 8388608;
			else if (var1.equals("/str"))
				anInt1927 = -1;
			else if (var1.startsWith("u="))
				anInt1916 = Class124_Sub22_Sub19_Sub3_Sub1.method1043(var1.substring(2), 16);
			else if (var1.equals("u"))
				anInt1916 = 0;
			else if (var1.equals("/u"))
				anInt1916 = -1;
			else if (var1.startsWith("shad="))
				anInt1928 = Class124_Sub22_Sub19_Sub3_Sub1.method1043(var1.substring(5), 16);
			else if (var1.equals("shad"))
				anInt1928 = 0;
			else if (var1.equals("/shad"))
				anInt1928 = anInt1929;
			else if (var1.equals("br"))
				method1025(anInt1936, anInt1929);
		} catch (final Exception var3) {
			;
		}

	}

	public int method1027(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8, int var9, int var10) {
		if (var1 == null)
			return 0;
		else {
			method1025(var6, var7);
			if (var10 == 0)
				var10 = anInt1934;

			int[] var14 = new int[] { var4 };
			if ((var5 < (anInt1923 + anInt1930 + var10)) && (var5 < (var10 + var10)))
				var14 = null;

			final int var12 = method1039(var1, var14, aStringArray1937);
			if ((var9 == 3) && (var12 == 1))
				var9 = 1;

			int var11;
			int var13;
			if (var9 == 0)
				var13 = var3 + anInt1923;
			else if (var9 == 1)
				var13 = var3 + anInt1923 + ((var5 - anInt1923 - anInt1930 - ((var12 - 1) * var10)) / 2);
			else if (var9 == 2)
				var13 = (var3 + var5) - anInt1930 - ((var12 - 1) * var10);
			else {
				var11 = (var5 - anInt1923 - anInt1930 - ((var12 - 1) * var10)) / (var12 + 1);
				if (var11 < 0)
					var11 = 0;

				var13 = var3 + anInt1923 + var11;
				var10 += var11;
			}

			for (var11 = 0; var11 < var12; ++var11) {
				if (var8 == 0)
					method1014(aStringArray1937[var11], var2, var13);
				else if (var8 == 1)
					method1014(aStringArray1937[var11], var2 + ((var4 - method1018(aStringArray1937[var11])) / 2),
							var13);
				else if (var8 == 2)
					method1014(aStringArray1937[var11], (var2 + var4) - method1018(aStringArray1937[var11]), var13);
				else if (var11 == (var12 - 1))
					method1014(aStringArray1937[var11], var2, var13);
				else {
					method1036(aStringArray1937[var11], var4);
					method1014(aStringArray1937[var11], var2, var13);
					anInt1925 = 0;
				}

				var13 += var10;
			}

			return var12;
		}
	}

	public void method1028(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		if (var1 != null) {
			method1025(var4, var5);
			double var9 = 7.0D - (var7 / 8.0D);
			if (var9 < 0.0D)
				var9 = 0.0D;

			final int[] var8 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11)
				var8[var11] = (int) (Math.sin((var11 / 1.5D) + (var6 / 1.0D)) * var9);

			method1023(var1, var2 - (method1018(var1) / 2), var3, (int[]) null, var8);
		}
	}

	abstract void method1029(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	static void method1030(final byte[] var0, int var1, int var2, int var3, int var4, final int var5) {
		int var6 = var1 + (var2 * anInt1565);
		int var10 = anInt1565 - var3;
		int var8 = 0;
		int var9 = 0;
		int var7;
		if (var2 < anInt1564) {
			var7 = anInt1564 - var2;
			var4 -= var7;
			var2 = anInt1564;
			var9 += var7 * var3;
			var6 += var7 * anInt1565;
		}

		if ((var2 + var4) > anInt1568)
			var4 -= (var2 + var4) - anInt1568;

		if (var1 < anInt1569) {
			var7 = anInt1569 - var1;
			var3 -= var7;
			var1 = anInt1569;
			var9 += var7;
			var6 += var7;
			var8 += var7;
			var10 += var7;
		}

		if ((var1 + var3) > anInt1567) {
			var7 = (var1 + var3) - anInt1567;
			var3 -= var7;
			var8 += var7;
			var10 += var7;
		}

		if ((var3 > 0) && (var4 > 0))
			method1040(anIntArray1570, var0, var5, var9, var6, var3, var4, var10, var8);
	}

	static void method1032(final byte[] var0, int var1, int var2, int var3, int var4, final int var5, final int var6) {
		int var7 = var1 + (var2 * anInt1565);
		int var11 = anInt1565 - var3;
		int var9 = 0;
		int var10 = 0;
		int var8;
		if (var2 < anInt1564) {
			var8 = anInt1564 - var2;
			var4 -= var8;
			var2 = anInt1564;
			var10 += var8 * var3;
			var7 += var8 * anInt1565;
		}

		if ((var2 + var4) > anInt1568)
			var4 -= (var2 + var4) - anInt1568;

		if (var1 < anInt1569) {
			var8 = anInt1569 - var1;
			var3 -= var8;
			var1 = anInt1569;
			var10 += var8;
			var7 += var8;
			var9 += var8;
			var11 += var8;
		}

		if ((var1 + var3) > anInt1567) {
			var8 = (var1 + var3) - anInt1567;
			var3 -= var8;
			var9 += var8;
			var11 += var8;
		}

		if ((var3 > 0) && (var4 > 0))
			method1033(anIntArray1570, var0, var5, var10, var7, var3, var4, var11, var9, var6);
	}

	static void method1033(final int[] var0, final byte[] var1, int var2, int var3, int var4, final int var5,
			final int var6, final int var7, final int var8, int var9) {
		var2 = ((((var2 & 16711935) * var9) & -16711936) + (((var2 & '\uff00') * var9) & 16711680)) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11)
				if (var1[var3++] != 0) {
					final int var12 = var0[var4];
					var0[var4++] = (((((var12 & 16711935) * var9) & -16711936)
							+ (((var12 & '\uff00') * var9) & 16711680)) >> 8) + var2;
				} else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	public int method1034(final String var1, final int var2) {
		return method1039(var1, new int[] { var2 }, aStringArray1937);
	}

	public void method1035(final String var1, final int var2, final int var3, final int var4, final int var5) {
		if (var1 != null) {
			method1025(var4, var5);
			method1014(var1, var2 - method1018(var1), var3);
		}
	}

	void method1036(final String var1, final int var2) {
		int var3 = 0;
		boolean var5 = false;

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			final char var6 = var1.charAt(var4);
			if (var6 == 60)
				var5 = true;
			else if (var6 == 62)
				var5 = false;
			else if (!var5 && (var6 == 32))
				++var3;
		}

		if (var3 > 0)
			anInt1925 = ((var2 - method1018(var1)) << 8) / var3;

	}

	public void method1037(final String var1, final int var2, final int var3, final int var4, final int var5,
			final int var6) {
		if (var1 != null) {
			method1025(var4, var5);
			final int[] var9 = new int[var1.length()];
			final int[] var8 = new int[var1.length()];

			for (int var7 = 0; var7 < var1.length(); ++var7) {
				var9[var7] = (int) (Math.sin((var7 / 5.0D) + (var6 / 5.0D)) * 5.0D);
				var8[var7] = (int) (Math.sin((var7 / 3.0D) + (var6 / 5.0D)) * 5.0D);
			}

			method1023(var1, var2 - (method1018(var1) / 2), var3, var9, var8);
		}
	}

	abstract void method1038(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	int method1039(final String var1, final int[] var2, final String[] var3) {
		if (var1 == null)
			return 0;
		else {
			int var4 = 0;
			int var5 = 0;
			final StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			final int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == 60)
					var10 = var14;
				else {
					if ((var15 == 62) && (var10 != -1)) {
						final String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('\u003c');
						var6.append(var16);
						var6.append('\u003e');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += method1017('\u003c');
							if ((aByteArray1926 != null) && (var11 != -1))
								var4 += aByteArray1926[(var11 << 8) + 60];

							var11 = 60;
						} else if (var16.equals("gt")) {
							var4 += method1017('\u003e');
							if ((aByteArray1926 != null) && (var11 != -1))
								var4 += aByteArray1926[(var11 << 8) + 62];

							var11 = 62;
						} else if (var16.startsWith("img="))
							try {
								final String var17 = var16.substring(4);
								final int var18 = Class124_Sub22_Sub19_Sub2.method889(var17, 10, true);
								var4 += aClass124_Sub22_Sub16_Sub2Array1921[var18].anInt1741;
								var11 = 0;
							} catch (final Exception var22) {
								;
							}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += method1017(var15);
							if ((aByteArray1926 != null) && (var11 != -1))
								var4 += aByteArray1926[(var11 << 8) + var15];

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if ((var2 != null) && (var4 > var2[var12 < var2.length ? var12 : var2.length - 1])
								&& (var7 >= 0)) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == 45) {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			final String var21 = var6.toString();
			if (var21.length() > var5)
				var3[var12++] = var21.substring(var5, var21.length());

			return var12;
		}
	}

	static void method1040(final int[] var0, final byte[] var1, final int var2, int var3, int var4, int var5,
			final int var6, final int var7, final int var8) {
		final int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6; var11 < 0; ++var11) {
			int var10;
			for (var10 = var9; var10 < 0; ++var10) {
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;
			}

			for (var10 = var5; var10 < 0; ++var10)
				if (var1[var3++] != 0)
					var0[var4++] = var2;
				else
					++var4;

			var4 += var7;
			var3 += var8;
		}

	}

	Class124_Sub22_Sub16_Sub4(final byte[] var1, final int[] var2, final int[] var3, final int[] var4, final int[] var5,
			final int[] var6, final byte[][] var7) {
		anIntArray1920 = var2;
		anIntArray1931 = var3;
		anIntArray1918 = var4;
		anIntArray1919 = var5;
		method1015(var1);
		aByteArrayArray1922 = var7;
		int var10 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var8 = 0; var8 < 256; ++var8) {
			if ((anIntArray1931[var8] < var10) && (anIntArray1919[var8] != 0))
				var10 = anIntArray1931[var8];

			if ((anIntArray1931[var8] + anIntArray1919[var8]) > var9)
				var9 = anIntArray1931[var8] + anIntArray1919[var8];
		}

		anInt1923 = anInt1934 - var10;
		anInt1930 = var9 - anInt1934;
	}
}
