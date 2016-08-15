public class Class124_Sub22_Sub19_Sub7 extends Class124_Sub22_Sub19 {
	int anInt1853 = 0;
	int anInt1855 = 0;
	byte aByte1868 = 0;
	int anInt1876 = 0;
	public boolean aBool1861 = false;
	int[] anIntArray1854;
	int[] anIntArray1849;
	int[] anIntArray1856;
	int[] anIntArray1858;
	int[] anIntArray1859;
	int[] anIntArray1860;
	int[] anIntArray1882;
	int[] anIntArray1891;
	int[] anIntArray1863;
	byte[] aByteArray1864;
	byte[] aByteArray1865;
	short[] aShortArray1875;
	byte[] aByteArray1866;
	int[] anIntArray1870;
	int[] anIntArray1871;
	int[] anIntArray1872;
	static byte[] aByteArray1850 = new byte[1];
	int[][] anIntArrayArray1862;
	int[][] anIntArrayArray1874;
	int anInt1884;
	int anInt1877;
	int anInt1878;
	int anInt1894;
	int anInt1879;
	static int anInt1899;
	static int anInt1900;
	static int anInt1901;
	public static int anInt1905 = 0;
	static byte[] aByteArray1903 = new byte[1];
	static Class124_Sub22_Sub19_Sub7 aClass124_Sub22_Sub19_Sub7_1888 = new Class124_Sub22_Sub19_Sub7();
	static Class124_Sub22_Sub19_Sub7 aClass124_Sub22_Sub19_Sub7_1867 = new Class124_Sub22_Sub19_Sub7();
	static boolean[] aBoolArray1880 = new boolean[4096];
	static boolean[] aBoolArray1881 = new boolean[4096];
	static int[] anIntArray1857 = new int[4096];
	static int[] anIntArray1851 = new int[4096];
	static int[] anIntArray1902 = new int[4096];
	static int[] anIntArray1885 = new int[4096];
	static int[] anIntArray1886 = new int[4096];
	static int[] anIntArray1852 = new int[4096];
	static int[] anIntArray1889 = new int[1600];
	static int[][] anIntArrayArray1895 = new int[1600][512];
	static int[] anIntArray1883 = new int[12];
	static int[][] anIntArrayArray1892 = new int[12][2000];
	static int[] anIntArray1898 = new int[2000];
	static int[] anIntArray1890 = new int[2000];
	static int[] anIntArray1893 = new int[12];
	static int[] anIntArray1896 = new int[10];
	static int[] anIntArray1897 = new int[10];
	static int[] anIntArray1887 = new int[10];
	public static boolean aBool1873 = false;
	public static int anInt1869 = 0;
	public static int anInt1904 = 0;
	public static int[] anIntArray1906 = new int[1000];
	static int[] anIntArray1907;
	static int[] anIntArray1908;
	static int[] anIntArray1909;
	static int[] anIntArray1910;

	public Class124_Sub22_Sub19_Sub7(final Class124_Sub22_Sub19_Sub7[] var1, final int var2) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		anInt1853 = 0;
		anInt1855 = 0;
		anInt1876 = 0;
		aByte1868 = -1;

		Class124_Sub22_Sub19_Sub7 var3;
		int var8;
		for (var8 = 0; var8 < var2; ++var8) {
			var3 = var1[var8];
			if (var3 != null) {
				anInt1853 += var3.anInt1853;
				anInt1855 += var3.anInt1855;
				anInt1876 += var3.anInt1876;
				if (var3.aByteArray1864 != null)
					var4 = true;
				else {
					if (aByte1868 == -1)
						aByte1868 = var3.aByte1868;

					if (aByte1868 != var3.aByte1868)
						var4 = true;
				}

				var5 |= var3.aByteArray1865 != null;
				var6 |= var3.aShortArray1875 != null;
				var7 |= var3.aByteArray1866 != null;
			}
		}

		anIntArray1854 = new int[anInt1853];
		anIntArray1849 = new int[anInt1853];
		anIntArray1856 = new int[anInt1853];
		anIntArray1858 = new int[anInt1855];
		anIntArray1859 = new int[anInt1855];
		anIntArray1860 = new int[anInt1855];
		anIntArray1882 = new int[anInt1855];
		anIntArray1891 = new int[anInt1855];
		anIntArray1863 = new int[anInt1855];
		if (var4)
			aByteArray1864 = new byte[anInt1855];

		if (var5)
			aByteArray1865 = new byte[anInt1855];

		if (var6)
			aShortArray1875 = new short[anInt1855];

		if (var7)
			aByteArray1866 = new byte[anInt1855];

		if (anInt1876 > 0) {
			anIntArray1870 = new int[anInt1876];
			anIntArray1871 = new int[anInt1876];
			anIntArray1872 = new int[anInt1876];
		}

		anInt1853 = 0;
		anInt1855 = 0;
		anInt1876 = 0;

		for (var8 = 0; var8 < var2; ++var8) {
			var3 = var1[var8];
			if (var3 != null) {
				int var9;
				for (var9 = 0; var9 < var3.anInt1855; ++var9) {
					anIntArray1858[anInt1855] = var3.anIntArray1858[var9] + anInt1853;
					anIntArray1859[anInt1855] = var3.anIntArray1859[var9] + anInt1853;
					anIntArray1860[anInt1855] = var3.anIntArray1860[var9] + anInt1853;
					anIntArray1882[anInt1855] = var3.anIntArray1882[var9];
					anIntArray1891[anInt1855] = var3.anIntArray1891[var9];
					anIntArray1863[anInt1855] = var3.anIntArray1863[var9];
					if (var4)
						if (var3.aByteArray1864 != null)
							aByteArray1864[anInt1855] = var3.aByteArray1864[var9];
						else
							aByteArray1864[anInt1855] = var3.aByte1868;

					if (var5 && (var3.aByteArray1865 != null))
						aByteArray1865[anInt1855] = var3.aByteArray1865[var9];

					if (var6)
						if (var3.aShortArray1875 != null)
							aShortArray1875[anInt1855] = var3.aShortArray1875[var9];
						else
							aShortArray1875[anInt1855] = -1;

					if (var7)
						if ((var3.aByteArray1866 != null) && (var3.aByteArray1866[var9] != -1))
							aByteArray1866[anInt1855] = (byte) (var3.aByteArray1866[var9] + anInt1876);
						else
							aByteArray1866[anInt1855] = -1;

					++anInt1855;
				}

				for (var9 = 0; var9 < var3.anInt1876; ++var9) {
					anIntArray1870[anInt1876] = var3.anIntArray1870[var9] + anInt1853;
					anIntArray1871[anInt1876] = var3.anIntArray1871[var9] + anInt1853;
					anIntArray1872[anInt1876] = var3.anIntArray1872[var9] + anInt1853;
					++anInt1876;
				}

				for (var9 = 0; var9 < var3.anInt1853; ++var9) {
					anIntArray1854[anInt1853] = var3.anIntArray1854[var9];
					anIntArray1849[anInt1853] = var3.anIntArray1849[var9];
					anIntArray1856[anInt1853] = var3.anIntArray1856[var9];
					++anInt1853;
				}
			}
		}

	}

	public Class124_Sub22_Sub19_Sub7 method987(final boolean var1) {
		if (!var1 && (aByteArray1850.length < anInt1855))
			aByteArray1850 = new byte[anInt1855 + 100];

		return method988(var1, aClass124_Sub22_Sub19_Sub7_1888, aByteArray1850);
	}

	Class124_Sub22_Sub19_Sub7 method988(final boolean var1, final Class124_Sub22_Sub19_Sub7 var2, final byte[] var3) {
		var2.anInt1853 = anInt1853;
		var2.anInt1855 = anInt1855;
		var2.anInt1876 = anInt1876;
		if ((var2.anIntArray1854 == null) || (var2.anIntArray1854.length < anInt1853)) {
			var2.anIntArray1854 = new int[anInt1853 + 100];
			var2.anIntArray1849 = new int[anInt1853 + 100];
			var2.anIntArray1856 = new int[anInt1853 + 100];
		}

		int var4;
		for (var4 = 0; var4 < anInt1853; ++var4) {
			var2.anIntArray1854[var4] = anIntArray1854[var4];
			var2.anIntArray1849[var4] = anIntArray1849[var4];
			var2.anIntArray1856[var4] = anIntArray1856[var4];
		}

		if (var1)
			var2.aByteArray1865 = aByteArray1865;
		else {
			var2.aByteArray1865 = var3;
			if (aByteArray1865 == null)
				for (var4 = 0; var4 < anInt1855; ++var4)
					var2.aByteArray1865[var4] = 0;
			else
				for (var4 = 0; var4 < anInt1855; ++var4)
					var2.aByteArray1865[var4] = aByteArray1865[var4];
		}

		var2.anIntArray1858 = anIntArray1858;
		var2.anIntArray1859 = anIntArray1859;
		var2.anIntArray1860 = anIntArray1860;
		var2.anIntArray1882 = anIntArray1882;
		var2.anIntArray1891 = anIntArray1891;
		var2.anIntArray1863 = anIntArray1863;
		var2.aByteArray1864 = aByteArray1864;
		var2.aByteArray1866 = aByteArray1866;
		var2.aShortArray1875 = aShortArray1875;
		var2.aByte1868 = aByte1868;
		var2.anIntArray1870 = anIntArray1870;
		var2.anIntArray1871 = anIntArray1871;
		var2.anIntArray1872 = anIntArray1872;
		var2.anIntArrayArray1862 = anIntArrayArray1862;
		var2.anIntArrayArray1874 = anIntArrayArray1874;
		var2.aBool1861 = aBool1861;
		var2.anInt1884 = 0;
		return var2;
	}

	public void method989() {
		if (anInt1884 != 1) {
			anInt1884 = 1;
			anInt1605 = 0;
			anInt1877 = 0;
			anInt1878 = 0;

			for (int var2 = 0; var2 < anInt1853; ++var2) {
				final int var3 = anIntArray1854[var2];
				final int var1 = anIntArray1849[var2];
				final int var4 = anIntArray1856[var2];
				if (-var1 > anInt1605)
					anInt1605 = -var1;

				if (var1 > anInt1877)
					anInt1877 = var1;

				final int var5 = (var3 * var3) + (var4 * var4);
				if (var5 > anInt1878)
					anInt1878 = var5;
			}

			anInt1878 = (int) (Math.sqrt(anInt1878) + 0.99D);
			anInt1894 = (int) (Math.sqrt((anInt1878 * anInt1878) + (anInt1605 * anInt1605)) + 0.99D);
			anInt1879 = anInt1894 + (int) (Math.sqrt((anInt1878 * anInt1878) + (anInt1877 * anInt1877)) + 0.99D);
		}
	}

	void method990() {
		if (anInt1884 != 2) {
			anInt1884 = 2;
			anInt1878 = 0;

			for (int var1 = 0; var1 < anInt1853; ++var1) {
				final int var3 = anIntArray1854[var1];
				final int var2 = anIntArray1849[var1];
				final int var5 = anIntArray1856[var1];
				final int var4 = (var3 * var3) + (var5 * var5) + (var2 * var2);
				if (var4 > anInt1878)
					anInt1878 = var4;
			}

			anInt1878 = (int) (Math.sqrt(anInt1878) + 0.99D);
			anInt1894 = anInt1878;
			anInt1879 = anInt1878 + anInt1878;
		}
	}

	public int method991() {
		method989();
		return anInt1878;
	}

	public void method992(final Class124_Sub22_Sub17 var1, final int var2) {
		if (anIntArrayArray1862 != null) {
			final Class24 var3 = var1.aClass24Array1595[var2];
			final Class124_Sub12 var4 = var3.aClass124_Sub12_271;
			anInt1899 = 0;
			anInt1900 = 0;
			anInt1901 = 0;

			for (int var5 = 0; var5 < var3.anInt275; ++var5) {
				final int var6 = var3.anIntArray273[var5];
				method993(var4.anIntArray1054[var6], var4.anIntArrayArray1055[var6], var3.anIntArray269[var5],
						var3.anIntArray272[var5], var3.anIntArray276[var5]);
			}

			anInt1884 = 0;
		}
	}

	void method993(final int var1, final int[] var2, final int var3, final int var4, final int var5) {
		final int var6 = var2.length;
		int var7;
		int var12;
		int var13;
		int var15;
		if (var1 == 0) {
			var13 = 0;
			anInt1899 = 0;
			anInt1900 = 0;
			anInt1901 = 0;

			for (var12 = 0; var12 < var6; ++var12) {
				final int var11 = var2[var12];
				if (var11 < anIntArrayArray1862.length) {
					final int[] var14 = anIntArrayArray1862[var11];

					for (var7 = 0; var7 < var14.length; ++var7) {
						var15 = var14[var7];
						anInt1899 += anIntArray1854[var15];
						anInt1900 += anIntArray1849[var15];
						anInt1901 += anIntArray1856[var15];
						++var13;
					}
				}
			}

			if (var13 > 0) {
				anInt1899 = (anInt1899 / var13) + var3;
				anInt1900 = (anInt1900 / var13) + var4;
				anInt1901 = (anInt1901 / var13) + var5;
			} else {
				anInt1899 = var3;
				anInt1900 = var4;
				anInt1901 = var5;
			}

		} else {
			int[] var9;
			int var10;
			if (var1 == 1)
				for (var13 = 0; var13 < var6; ++var13) {
					var12 = var2[var13];
					if (var12 < anIntArrayArray1862.length) {
						var9 = anIntArrayArray1862[var12];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var7 = var9[var10];
							anIntArray1854[var7] += var3;
							anIntArray1849[var7] += var4;
							anIntArray1856[var7] += var5;
						}
					}
				}
			else if (var1 == 2)
				for (var13 = 0; var13 < var6; ++var13) {
					var12 = var2[var13];
					if (var12 < anIntArrayArray1862.length) {
						var9 = anIntArrayArray1862[var12];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var7 = var9[var10];
							anIntArray1854[var7] -= anInt1899;
							anIntArray1849[var7] -= anInt1900;
							anIntArray1856[var7] -= anInt1901;
							var15 = (var3 & 255) * 8;
							final int var19 = (var4 & 255) * 8;
							final int var18 = (var5 & 255) * 8;
							int var8;
							int var16;
							int var17;
							if (var18 != 0) {
								var16 = anIntArray1907[var18];
								var17 = anIntArray1908[var18];
								var8 = ((anIntArray1849[var7] * var16) + (anIntArray1854[var7] * var17)) >> 16;
								anIntArray1849[var7] = ((anIntArray1849[var7] * var17)
										- (anIntArray1854[var7] * var16)) >> 16;
								anIntArray1854[var7] = var8;
							}

							if (var15 != 0) {
								var16 = anIntArray1907[var15];
								var17 = anIntArray1908[var15];
								var8 = ((anIntArray1849[var7] * var17) - (anIntArray1856[var7] * var16)) >> 16;
								anIntArray1856[var7] = ((anIntArray1849[var7] * var16)
										+ (anIntArray1856[var7] * var17)) >> 16;
								anIntArray1849[var7] = var8;
							}

							if (var19 != 0) {
								var16 = anIntArray1907[var19];
								var17 = anIntArray1908[var19];
								var8 = ((anIntArray1856[var7] * var16) + (anIntArray1854[var7] * var17)) >> 16;
								anIntArray1856[var7] = ((anIntArray1856[var7] * var17)
										- (anIntArray1854[var7] * var16)) >> 16;
								anIntArray1854[var7] = var8;
							}

							anIntArray1854[var7] += anInt1899;
							anIntArray1849[var7] += anInt1900;
							anIntArray1856[var7] += anInt1901;
						}
					}
				}
			else if (var1 == 3)
				for (var13 = 0; var13 < var6; ++var13) {
					var12 = var2[var13];
					if (var12 < anIntArrayArray1862.length) {
						var9 = anIntArrayArray1862[var12];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var7 = var9[var10];
							anIntArray1854[var7] -= anInt1899;
							anIntArray1849[var7] -= anInt1900;
							anIntArray1856[var7] -= anInt1901;
							anIntArray1854[var7] = (anIntArray1854[var7] * var3) / 128;
							anIntArray1849[var7] = (anIntArray1849[var7] * var4) / 128;
							anIntArray1856[var7] = (anIntArray1856[var7] * var5) / 128;
							anIntArray1854[var7] += anInt1899;
							anIntArray1849[var7] += anInt1900;
							anIntArray1856[var7] += anInt1901;
						}
					}
				}
			else if (var1 == 5)
				if ((anIntArrayArray1874 != null) && (aByteArray1865 != null))
					for (var13 = 0; var13 < var6; ++var13) {
						var12 = var2[var13];
						if (var12 < anIntArrayArray1874.length) {
							var9 = anIntArrayArray1874[var12];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var7 = var9[var10];
								var15 = (aByteArray1865[var7] & 255) + (var3 * 8);
								if (var15 < 0)
									var15 = 0;
								else if (var15 > 255)
									var15 = 255;

								aByteArray1865[var7] = (byte) var15;
							}
						}
					}
		}
	}

	public void method994() {
		for (int var1 = 0; var1 < anInt1853; ++var1) {
			final int var2 = anIntArray1854[var1];
			anIntArray1854[var1] = anIntArray1856[var1];
			anIntArray1856[var1] = -var2;
		}

		anInt1884 = 0;
	}

	public void method995() {
		for (int var1 = 0; var1 < anInt1853; ++var1) {
			final int var2 = anIntArray1856[var1];
			anIntArray1856[var1] = anIntArray1854[var1];
			anIntArray1854[var1] = -var2;
		}

		anInt1884 = 0;
	}

	public void method996(final int var1) {
		final int var2 = anIntArray1907[var1];
		final int var5 = anIntArray1908[var1];

		for (int var3 = 0; var3 < anInt1853; ++var3) {
			final int var4 = ((anIntArray1849[var3] * var5) - (anIntArray1856[var3] * var2)) >> 16;
			anIntArray1856[var3] = ((anIntArray1849[var3] * var2) + (anIntArray1856[var3] * var5)) >> 16;
			anIntArray1849[var3] = var4;
		}

		anInt1884 = 0;
	}

	public void method997(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1853; ++var4) {
			anIntArray1854[var4] += var1;
			anIntArray1849[var4] += var2;
			anIntArray1856[var4] += var3;
		}

		anInt1884 = 0;
	}

	public final void method998(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		anIntArray1889[0] = -1;
		if ((anInt1884 != 2) && (anInt1884 != 1))
			method990();

		final int var9 = Class124_Sub22_Sub16_Sub3.anInt1835;
		final int var10 = Class124_Sub22_Sub16_Sub3.anInt1836;
		final int var13 = anIntArray1907[var2];
		final int var14 = anIntArray1908[var2];
		final int var15 = anIntArray1907[var3];
		final int var16 = anIntArray1908[var3];
		final int var17 = anIntArray1907[var4];
		final int var18 = anIntArray1908[var4];
		final int var19 = ((var6 * var17) + (var7 * var18)) >> 16;

		for (int var20 = 0; var20 < anInt1853; ++var20) {
			int var21 = anIntArray1854[var20];
			int var22 = anIntArray1849[var20];
			int var23 = anIntArray1856[var20];
			int var24;
			if (var3 != 0) {
				var24 = ((var22 * var15) + (var21 * var16)) >> 16;
				var22 = ((var22 * var16) - (var21 * var15)) >> 16;
				var21 = var24;
			}

			if (var2 != 0) {
				var24 = ((var23 * var13) + (var21 * var14)) >> 16;
				var23 = ((var23 * var14) - (var21 * var13)) >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = ((var22 * var18) - (var23 * var17)) >> 16;
			var23 = ((var22 * var17) + (var23 * var18)) >> 16;
			anIntArray1902[var20] = var23 - var19;
			anIntArray1857[var20] = var9 + ((var21 * Class124_Sub22_Sub16_Sub3.anInt1834) / var8);
			anIntArray1851[var20] = var10 + ((var24 * Class124_Sub22_Sub16_Sub3.anInt1834) / var8);
			if (anInt1876 > 0) {
				anIntArray1885[var20] = var21;
				anIntArray1886[var20] = var24;
				anIntArray1852[var20] = var23;
			}
		}

		try {
			method999(false, false, 0);
		} catch (final Exception var26) {
			;
		}

	}

	@Override
	void method833(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final int var7, final int var8, final int var9) {
		anIntArray1889[0] = -1;
		if (anInt1884 != 1)
			method989();

		final int var10 = ((var8 * var5) - (var6 * var4)) >> 16;
		final int var11 = ((var7 * var2) + (var10 * var3)) >> 16;
		final int var12 = (anInt1878 * var3) >> 16;
		final int var13 = var11 + var12;
		if ((var13 > 50) && (var11 < 3500)) {
			final int var14 = ((var8 * var4) + (var6 * var5)) >> 16;
			int var15 = (var14 - anInt1878) * Class124_Sub22_Sub16_Sub3.anInt1834;
			if ((var15 / var13) < Class124_Sub22_Sub16_Sub3.anInt1832) {
				int var16 = (var14 + anInt1878) * Class124_Sub22_Sub16_Sub3.anInt1834;
				if ((var16 / var13) > Class124_Sub22_Sub16_Sub3.anInt1839) {
					final int var17 = ((var7 * var3) - (var10 * var2)) >> 16;
					final int var18 = (anInt1878 * var2) >> 16;
					int var19 = (var17 + var18) * Class124_Sub22_Sub16_Sub3.anInt1834;
					if ((var19 / var13) > Class124_Sub22_Sub16_Sub3.anInt1841) {
						final int var20 = var18 + ((anInt1605 * var3) >> 16);
						int var21 = (var17 - var20) * Class124_Sub22_Sub16_Sub3.anInt1834;
						if ((var21 / var13) < Class124_Sub22_Sub16_Sub3.anInt1844) {
							final int var22 = var12 + ((anInt1605 * var2) >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if ((var11 - var22) <= 50)
								var24 = true;

							final boolean var25 = var24 || (anInt1876 > 0);
							boolean var26 = false;
							int var27;
							int var28;
							int var29;
							if ((var9 > 0) && aBool1873) {
								var27 = var11 - var12;
								if (var27 <= 50)
									var27 = 50;

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var27;
								} else {
									var16 /= var13;
									var15 /= var27;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var27;
								} else {
									var19 /= var13;
									var21 /= var27;
								}

								var28 = anInt1869 - Class124_Sub22_Sub16_Sub3.anInt1835;
								var29 = anInt1904 - Class124_Sub22_Sub16_Sub3.anInt1836;
								if ((var28 > var15) && (var28 < var16) && (var29 > var21) && (var29 < var19))
									if (aBool1861)
										anIntArray1906[anInt1905++] = var9;
									else
										var26 = true;
							}

							var27 = Class124_Sub22_Sub16_Sub3.anInt1835;
							var28 = Class124_Sub22_Sub16_Sub3.anInt1836;
							var29 = 0;
							int var30 = 0;
							if (var1 != 0) {
								var29 = anIntArray1907[var1];
								var30 = anIntArray1908[var1];
							}

							for (int var31 = 0; var31 < anInt1853; ++var31) {
								int var32 = anIntArray1854[var31];
								int var33 = anIntArray1849[var31];
								int var34 = anIntArray1856[var31];
								int var35;
								if (var1 != 0) {
									var35 = ((var34 * var29) + (var32 * var30)) >> 16;
									var34 = ((var34 * var30) - (var32 * var29)) >> 16;
									var32 = var35;
								}

								var32 += var6;
								var33 += var7;
								var34 += var8;
								var35 = ((var34 * var4) + (var32 * var5)) >> 16;
								var34 = ((var34 * var5) - (var32 * var4)) >> 16;
								var32 = var35;
								var35 = ((var33 * var3) - (var34 * var2)) >> 16;
								var34 = ((var33 * var2) + (var34 * var3)) >> 16;
								anIntArray1902[var31] = var34 - var11;
								if (var34 >= 50) {
									anIntArray1857[var31] = var27
											+ ((var32 * Class124_Sub22_Sub16_Sub3.anInt1834) / var34);
									anIntArray1851[var31] = var28
											+ ((var35 * Class124_Sub22_Sub16_Sub3.anInt1834) / var34);
								} else {
									anIntArray1857[var31] = -5000;
									var23 = true;
								}

								if (var25) {
									anIntArray1885[var31] = var32;
									anIntArray1886[var31] = var35;
									anIntArray1852[var31] = var34;
								}
							}

							try {
								method999(var23, var26, var9);
							} catch (final Exception var37) {
								;
							}

						}
					}
				}
			}
		}
	}

	final void method999(final boolean var1, boolean var2, final int var3) {
		if (anInt1879 < 1600) {
			int var11;
			for (var11 = 0; var11 < anInt1879; ++var11)
				anIntArray1889[var11] = 0;

			int var7;
			int var9;
			int var10;
			int var12;
			int var13;
			int var14;
			int var15;
			int var18;
			int var19;
			for (var11 = 0; var11 < anInt1855; ++var11)
				if (anIntArray1863[var11] != -2) {
					var12 = anIntArray1858[var11];
					var13 = anIntArray1859[var11];
					var14 = anIntArray1860[var11];
					var9 = anIntArray1857[var12];
					var10 = anIntArray1857[var13];
					var15 = anIntArray1857[var14];
					int var4;
					if (var1 && ((var9 == -5000) || (var10 == -5000) || (var15 == -5000))) {
						var4 = anIntArray1885[var12];
						var18 = anIntArray1885[var13];
						var7 = anIntArray1885[var14];
						int var6 = anIntArray1886[var12];
						var19 = anIntArray1886[var13];
						int var5 = anIntArray1886[var14];
						int var16 = anIntArray1852[var12];
						final int var17 = anIntArray1852[var13];
						int var20 = anIntArray1852[var14];
						var4 -= var18;
						var7 -= var18;
						var6 -= var19;
						var5 -= var19;
						var16 -= var17;
						var20 -= var17;
						final int var21 = (var6 * var20) - (var16 * var5);
						final int var23 = (var16 * var7) - (var4 * var20);
						final int var8 = (var4 * var5) - (var6 * var7);
						if (((var18 * var21) + (var19 * var23) + (var17 * var8)) > 0) {
							aBoolArray1881[var11] = true;
							final int var24 = ((anIntArray1902[var12] + anIntArray1902[var13] + anIntArray1902[var14])
									/ 3) + anInt1894;
							anIntArrayArray1895[var24][anIntArray1889[var24]++] = var11;
						}
					} else {
						if (var2 && method1007(anInt1869, anInt1904, anIntArray1851[var12], anIntArray1851[var13],
								anIntArray1851[var14], var9, var10, var15)) {
							anIntArray1906[anInt1905++] = var3;
							var2 = false;
						}

						if ((((var9 - var10) * (anIntArray1851[var14] - anIntArray1851[var13]))
								- ((anIntArray1851[var12] - anIntArray1851[var13]) * (var15 - var10))) > 0) {
							aBoolArray1881[var11] = false;
							if ((var9 >= 0) && (var10 >= 0) && (var15 >= 0)
									&& (var9 <= Class124_Sub22_Sub16_Sub3.anInt1837)
									&& (var10 <= Class124_Sub22_Sub16_Sub3.anInt1837)
									&& (var15 <= Class124_Sub22_Sub16_Sub3.anInt1837))
								aBoolArray1880[var11] = false;
							else
								aBoolArray1880[var11] = true;

							var4 = ((anIntArray1902[var12] + anIntArray1902[var13] + anIntArray1902[var14]) / 3)
									+ anInt1894;
							anIntArrayArray1895[var4][anIntArray1889[var4]++] = var11;
						}
					}
				}

			int[] var27;
			if (aByteArray1864 == null)
				for (var11 = anInt1879 - 1; var11 >= 0; --var11) {
					var12 = anIntArray1889[var11];
					if (var12 > 0) {
						var27 = anIntArrayArray1895[var11];

						for (var14 = 0; var14 < var12; ++var14)
							method1000(var27[var14]);
					}
				}
			else {
				for (var11 = 0; var11 < 12; ++var11) {
					anIntArray1883[var11] = 0;
					anIntArray1893[var11] = 0;
				}

				for (var11 = anInt1879 - 1; var11 >= 0; --var11) {
					var12 = anIntArray1889[var11];
					if (var12 > 0) {
						var27 = anIntArrayArray1895[var11];

						for (var14 = 0; var14 < var12; ++var14) {
							var9 = var27[var14];
							final byte var28 = aByteArray1864[var9];
							var15 = anIntArray1883[var28]++;
							anIntArrayArray1892[var28][var15] = var9;
							if (var28 < 10)
								anIntArray1893[var28] += var11;
							else if (var28 == 10)
								anIntArray1898[var15] = var11;
							else
								anIntArray1890[var15] = var11;
						}
					}
				}

				var11 = 0;
				if ((anIntArray1883[1] > 0) || (anIntArray1883[2] > 0))
					var11 = (anIntArray1893[1] + anIntArray1893[2]) / (anIntArray1883[1] + anIntArray1883[2]);

				var12 = 0;
				if ((anIntArray1883[3] > 0) || (anIntArray1883[4] > 0))
					var12 = (anIntArray1893[3] + anIntArray1893[4]) / (anIntArray1883[3] + anIntArray1883[4]);

				var13 = 0;
				if ((anIntArray1883[6] > 0) || (anIntArray1883[8] > 0))
					var13 = (anIntArray1893[6] + anIntArray1893[8]) / (anIntArray1883[6] + anIntArray1883[8]);

				var9 = 0;
				var10 = anIntArray1883[10];
				int[] var22 = anIntArrayArray1892[10];
				int[] var25 = anIntArray1898;
				if (var9 == var10) {
					var9 = 0;
					var10 = anIntArray1883[11];
					var22 = anIntArrayArray1892[11];
					var25 = anIntArray1890;
				}

				if (var9 < var10)
					var14 = var25[var9];
				else
					var14 = -1000;

				for (var18 = 0; var18 < 10; ++var18) {
					while ((var18 == 0) && (var14 > var11)) {
						method1000(var22[var9++]);
						if ((var9 == var10) && (var22 != anIntArrayArray1892[11])) {
							var9 = 0;
							var10 = anIntArray1883[11];
							var22 = anIntArrayArray1892[11];
							var25 = anIntArray1890;
						}

						if (var9 < var10)
							var14 = var25[var9];
						else
							var14 = -1000;
					}

					while ((var18 == 3) && (var14 > var12)) {
						method1000(var22[var9++]);
						if ((var9 == var10) && (var22 != anIntArrayArray1892[11])) {
							var9 = 0;
							var10 = anIntArray1883[11];
							var22 = anIntArrayArray1892[11];
							var25 = anIntArray1890;
						}

						if (var9 < var10)
							var14 = var25[var9];
						else
							var14 = -1000;
					}

					while ((var18 == 5) && (var14 > var13)) {
						method1000(var22[var9++]);
						if ((var9 == var10) && (var22 != anIntArrayArray1892[11])) {
							var9 = 0;
							var10 = anIntArray1883[11];
							var22 = anIntArrayArray1892[11];
							var25 = anIntArray1890;
						}

						if (var9 < var10)
							var14 = var25[var9];
						else
							var14 = -1000;
					}

					var7 = anIntArray1883[var18];
					final int[] var26 = anIntArrayArray1892[var18];

					for (var19 = 0; var19 < var7; ++var19)
						method1000(var26[var19]);
				}

				while (var14 != -1000) {
					method1000(var22[var9++]);
					if ((var9 == var10) && (var22 != anIntArrayArray1892[11])) {
						var9 = 0;
						var22 = anIntArrayArray1892[11];
						var10 = anIntArray1883[11];
						var25 = anIntArray1890;
					}

					if (var9 < var10)
						var14 = var25[var9];
					else
						var14 = -1000;
				}

			}
		}
	}

	final void method1000(final int var1) {
		if (aBoolArray1881[var1])
			method1001(var1);
		else {
			final int var2 = anIntArray1858[var1];
			final int var5 = anIntArray1859[var1];
			final int var3 = anIntArray1860[var1];
			Class124_Sub22_Sub16_Sub3.aBool1842 = aBoolArray1880[var1];
			if (aByteArray1865 == null)
				Class124_Sub22_Sub16_Sub3.anInt1831 = 0;
			else
				Class124_Sub22_Sub16_Sub3.anInt1831 = aByteArray1865[var1] & 255;

			if ((aShortArray1875 != null) && (aShortArray1875[var1] != -1)) {
				int var6;
				int var7;
				int var8;
				if ((aByteArray1866 != null) && (aByteArray1866[var1] != -1)) {
					final int var4 = aByteArray1866[var1] & 255;
					var6 = anIntArray1870[var4];
					var7 = anIntArray1871[var4];
					var8 = anIntArray1872[var4];
				} else {
					var6 = var2;
					var7 = var5;
					var8 = var3;
				}

				if (anIntArray1863[var1] == -1)
					Class124_Sub22_Sub16_Sub3.method985(anIntArray1851[var2], anIntArray1851[var5],
							anIntArray1851[var3], anIntArray1857[var2], anIntArray1857[var5], anIntArray1857[var3],
							anIntArray1882[var1], anIntArray1882[var1], anIntArray1882[var1], anIntArray1885[var6],
							anIntArray1885[var7], anIntArray1885[var8], anIntArray1886[var6], anIntArray1886[var7],
							anIntArray1886[var8], anIntArray1852[var6], anIntArray1852[var7], anIntArray1852[var8],
							aShortArray1875[var1]);
				else
					Class124_Sub22_Sub16_Sub3.method985(anIntArray1851[var2], anIntArray1851[var5],
							anIntArray1851[var3], anIntArray1857[var2], anIntArray1857[var5], anIntArray1857[var3],
							anIntArray1882[var1], anIntArray1891[var1], anIntArray1863[var1], anIntArray1885[var6],
							anIntArray1885[var7], anIntArray1885[var8], anIntArray1886[var6], anIntArray1886[var7],
							anIntArray1886[var8], anIntArray1852[var6], anIntArray1852[var7], anIntArray1852[var8],
							aShortArray1875[var1]);
			} else if (anIntArray1863[var1] == -1)
				Class124_Sub22_Sub16_Sub3.method978(anIntArray1851[var2], anIntArray1851[var5], anIntArray1851[var3],
						anIntArray1857[var2], anIntArray1857[var5], anIntArray1857[var3],
						anIntArray1909[anIntArray1882[var1]]);
			else
				Class124_Sub22_Sub16_Sub3.method982(anIntArray1851[var2], anIntArray1851[var5], anIntArray1851[var3],
						anIntArray1857[var2], anIntArray1857[var5], anIntArray1857[var3], anIntArray1882[var1],
						anIntArray1891[var1], anIntArray1863[var1]);

		}
	}

	final void method1001(final int var1) {
		final int var2 = Class124_Sub22_Sub16_Sub3.anInt1835;
		final int var17 = Class124_Sub22_Sub16_Sub3.anInt1836;
		int var5 = 0;
		final int var3 = anIntArray1858[var1];
		final int var7 = anIntArray1859[var1];
		final int var8 = anIntArray1860[var1];
		final int var6 = anIntArray1852[var3];
		final int var11 = anIntArray1852[var7];
		final int var12 = anIntArray1852[var8];
		if (aByteArray1865 == null)
			Class124_Sub22_Sub16_Sub3.anInt1831 = 0;
		else
			Class124_Sub22_Sub16_Sub3.anInt1831 = aByteArray1865[var1] & 255;

		int var13;
		int var14;
		int var15;
		int var16;
		if (var6 >= 50) {
			anIntArray1896[var5] = anIntArray1857[var3];
			anIntArray1897[var5] = anIntArray1851[var3];
			anIntArray1887[var5++] = anIntArray1882[var1];
		} else {
			var15 = anIntArray1885[var3];
			var14 = anIntArray1886[var3];
			var13 = anIntArray1882[var1];
			if (var12 >= 50) {
				var16 = (50 - var6) * anIntArray1910[var12 - var6];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var8] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var8] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1863[var1] - var13) * var16) >> 16);
			}

			if (var11 >= 50) {
				var16 = (50 - var6) * anIntArray1910[var11 - var6];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var7] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var7] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1891[var1] - var13) * var16) >> 16);
			}
		}

		if (var11 >= 50) {
			anIntArray1896[var5] = anIntArray1857[var7];
			anIntArray1897[var5] = anIntArray1851[var7];
			anIntArray1887[var5++] = anIntArray1891[var1];
		} else {
			var15 = anIntArray1885[var7];
			var14 = anIntArray1886[var7];
			var13 = anIntArray1891[var1];
			if (var6 >= 50) {
				var16 = (50 - var11) * anIntArray1910[var6 - var11];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var3] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var3] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1882[var1] - var13) * var16) >> 16);
			}

			if (var12 >= 50) {
				var16 = (50 - var11) * anIntArray1910[var12 - var11];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var8] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var8] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1863[var1] - var13) * var16) >> 16);
			}
		}

		if (var12 >= 50) {
			anIntArray1896[var5] = anIntArray1857[var8];
			anIntArray1897[var5] = anIntArray1851[var8];
			anIntArray1887[var5++] = anIntArray1863[var1];
		} else {
			var15 = anIntArray1885[var8];
			var14 = anIntArray1886[var8];
			var13 = anIntArray1863[var1];
			if (var11 >= 50) {
				var16 = (50 - var12) * anIntArray1910[var11 - var12];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var7] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var7] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1891[var1] - var13) * var16) >> 16);
			}

			if (var6 >= 50) {
				var16 = (50 - var12) * anIntArray1910[var6 - var12];
				anIntArray1896[var5] = var2 + (((var15 + (((anIntArray1885[var3] - var15) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1897[var5] = var17 + (((var14 + (((anIntArray1886[var3] - var14) * var16) >> 16))
						* Class124_Sub22_Sub16_Sub3.anInt1834) / 50);
				anIntArray1887[var5++] = var13 + (((anIntArray1882[var1] - var13) * var16) >> 16);
			}
		}

		var15 = anIntArray1896[0];
		var14 = anIntArray1896[1];
		var13 = anIntArray1896[2];
		var16 = anIntArray1897[0];
		final int var20 = anIntArray1897[1];
		final int var18 = anIntArray1897[2];
		Class124_Sub22_Sub16_Sub3.aBool1842 = false;
		int var4;
		int var9;
		int var10;
		int var19;
		if (var5 == 3) {
			if ((var15 < 0) || (var14 < 0) || (var13 < 0) || (var15 > Class124_Sub22_Sub16_Sub3.anInt1837)
					|| (var14 > Class124_Sub22_Sub16_Sub3.anInt1837) || (var13 > Class124_Sub22_Sub16_Sub3.anInt1837))
				Class124_Sub22_Sub16_Sub3.aBool1842 = true;

			if ((aShortArray1875 != null) && (aShortArray1875[var1] != -1)) {
				if ((aByteArray1866 != null) && (aByteArray1866[var1] != -1)) {
					var9 = aByteArray1866[var1] & 255;
					var4 = anIntArray1870[var9];
					var19 = anIntArray1871[var9];
					var10 = anIntArray1872[var9];
				} else {
					var4 = var3;
					var19 = var7;
					var10 = var8;
				}

				if (anIntArray1863[var1] == -1)
					Class124_Sub22_Sub16_Sub3.method985(var16, var20, var18, var15, var14, var13, anIntArray1882[var1],
							anIntArray1882[var1], anIntArray1882[var1], anIntArray1885[var4], anIntArray1885[var19],
							anIntArray1885[var10], anIntArray1886[var4], anIntArray1886[var19], anIntArray1886[var10],
							anIntArray1852[var4], anIntArray1852[var19], anIntArray1852[var10], aShortArray1875[var1]);
				else
					Class124_Sub22_Sub16_Sub3.method985(var16, var20, var18, var15, var14, var13, anIntArray1887[0],
							anIntArray1887[1], anIntArray1887[2], anIntArray1885[var4], anIntArray1885[var19],
							anIntArray1885[var10], anIntArray1886[var4], anIntArray1886[var19], anIntArray1886[var10],
							anIntArray1852[var4], anIntArray1852[var19], anIntArray1852[var10], aShortArray1875[var1]);
			} else if (anIntArray1863[var1] == -1)
				Class124_Sub22_Sub16_Sub3.method978(var16, var20, var18, var15, var14, var13,
						anIntArray1909[anIntArray1882[var1]]);
			else
				Class124_Sub22_Sub16_Sub3.method982(var16, var20, var18, var15, var14, var13, anIntArray1887[0],
						anIntArray1887[1], anIntArray1887[2]);
		}

		if (var5 == 4) {
			if ((var15 < 0) || (var14 < 0) || (var13 < 0) || (var15 > Class124_Sub22_Sub16_Sub3.anInt1837)
					|| (var14 > Class124_Sub22_Sub16_Sub3.anInt1837) || (var13 > Class124_Sub22_Sub16_Sub3.anInt1837)
					|| (anIntArray1896[3] < 0) || (anIntArray1896[3] > Class124_Sub22_Sub16_Sub3.anInt1837))
				Class124_Sub22_Sub16_Sub3.aBool1842 = true;

			if ((aShortArray1875 != null) && (aShortArray1875[var1] != -1)) {
				if ((aByteArray1866 != null) && (aByteArray1866[var1] != -1)) {
					var9 = aByteArray1866[var1] & 255;
					var4 = anIntArray1870[var9];
					var19 = anIntArray1871[var9];
					var10 = anIntArray1872[var9];
				} else {
					var4 = var3;
					var19 = var7;
					var10 = var8;
				}

				final short var21 = aShortArray1875[var1];
				if (anIntArray1863[var1] == -1) {
					Class124_Sub22_Sub16_Sub3.method985(var16, var20, var18, var15, var14, var13, anIntArray1882[var1],
							anIntArray1882[var1], anIntArray1882[var1], anIntArray1885[var4], anIntArray1885[var19],
							anIntArray1885[var10], anIntArray1886[var4], anIntArray1886[var19], anIntArray1886[var10],
							anIntArray1852[var4], anIntArray1852[var19], anIntArray1852[var10], var21);
					Class124_Sub22_Sub16_Sub3.method985(var16, var18, anIntArray1897[3], var15, var13,
							anIntArray1896[3], anIntArray1882[var1], anIntArray1882[var1], anIntArray1882[var1],
							anIntArray1885[var4], anIntArray1885[var19], anIntArray1885[var10], anIntArray1886[var4],
							anIntArray1886[var19], anIntArray1886[var10], anIntArray1852[var4], anIntArray1852[var19],
							anIntArray1852[var10], var21);
				} else {
					Class124_Sub22_Sub16_Sub3.method985(var16, var20, var18, var15, var14, var13, anIntArray1887[0],
							anIntArray1887[1], anIntArray1887[2], anIntArray1885[var4], anIntArray1885[var19],
							anIntArray1885[var10], anIntArray1886[var4], anIntArray1886[var19], anIntArray1886[var10],
							anIntArray1852[var4], anIntArray1852[var19], anIntArray1852[var10], var21);
					Class124_Sub22_Sub16_Sub3.method985(var16, var18, anIntArray1897[3], var15, var13,
							anIntArray1896[3], anIntArray1887[0], anIntArray1887[2], anIntArray1887[3],
							anIntArray1885[var4], anIntArray1885[var19], anIntArray1885[var10], anIntArray1886[var4],
							anIntArray1886[var19], anIntArray1886[var10], anIntArray1852[var4], anIntArray1852[var19],
							anIntArray1852[var10], var21);
				}
			} else if (anIntArray1863[var1] == -1) {
				var4 = anIntArray1909[anIntArray1882[var1]];
				Class124_Sub22_Sub16_Sub3.method978(var16, var20, var18, var15, var14, var13, var4);
				Class124_Sub22_Sub16_Sub3.method978(var16, var18, anIntArray1897[3], var15, var13, anIntArray1896[3],
						var4);
			} else {
				Class124_Sub22_Sub16_Sub3.method982(var16, var20, var18, var15, var14, var13, anIntArray1887[0],
						anIntArray1887[1], anIntArray1887[2]);
				Class124_Sub22_Sub16_Sub3.method982(var16, var18, anIntArray1897[3], var15, var13, anIntArray1896[3],
						anIntArray1887[0], anIntArray1887[2], anIntArray1887[3]);
			}
		}

	}

	public void method1002(final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < anInt1853; ++var4) {
			anIntArray1854[var4] = (anIntArray1854[var4] * var1) / 128;
			anIntArray1849[var4] = (anIntArray1849[var4] * var2) / 128;
			anIntArray1856[var4] = (anIntArray1856[var4] * var3) / 128;
		}

		anInt1884 = 0;
	}

	public void method1003() {
		for (int var1 = 0; var1 < anInt1853; ++var1) {
			anIntArray1854[var1] = -anIntArray1854[var1];
			anIntArray1856[var1] = -anIntArray1856[var1];
		}

		anInt1884 = 0;
	}

	public Class124_Sub22_Sub19_Sub7 method1004(final boolean var1) {
		if (!var1 && (aByteArray1903.length < anInt1855))
			aByteArray1903 = new byte[anInt1855 + 100];

		return method988(var1, aClass124_Sub22_Sub19_Sub7_1867, aByteArray1903);
	}

	Class124_Sub22_Sub19_Sub7() {
	}

	public void method1005(final Class124_Sub22_Sub17 var1, final int var2, final Class124_Sub22_Sub17 var3,
			final int var4, final int[] var5) {
		if (var2 != -1)
			if ((var5 != null) && (var4 != -1)) {
				final Class24 var7 = var1.aClass24Array1595[var2];
				final Class24 var12 = var3.aClass24Array1595[var4];
				final Class124_Sub12 var8 = var7.aClass124_Sub12_271;
				anInt1899 = 0;
				anInt1900 = 0;
				anInt1901 = 0;
				byte var6 = 0;
				int var13 = var6 + 1;
				int var9 = var5[var6];

				int var10;
				int var11;
				for (var10 = 0; var10 < var7.anInt275; ++var10) {
					for (var11 = var7.anIntArray273[var10]; var11 > var9; var9 = var5[var13++])
						;

					if ((var11 != var9) || (var8.anIntArray1054[var11] == 0))
						method993(var8.anIntArray1054[var11], var8.anIntArrayArray1055[var11],
								var7.anIntArray269[var10], var7.anIntArray272[var10], var7.anIntArray276[var10]);
				}

				anInt1899 = 0;
				anInt1900 = 0;
				anInt1901 = 0;
				var6 = 0;
				var13 = var6 + 1;
				var9 = var5[var6];

				for (var10 = 0; var10 < var12.anInt275; ++var10) {
					for (var11 = var12.anIntArray273[var10]; var11 > var9; var9 = var5[var13++])
						;

					if ((var11 == var9) || (var8.anIntArray1054[var11] == 0))
						method993(var8.anIntArray1054[var11], var8.anIntArrayArray1055[var11],
								var12.anIntArray269[var10], var12.anIntArray272[var10], var12.anIntArray276[var10]);
				}

				anInt1884 = 0;
			} else
				method992(var1, var2);
	}

	public final void method1006(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7) {
		anIntArray1889[0] = -1;
		if ((anInt1884 != 2) && (anInt1884 != 1))
			method990();

		final int var8 = Class124_Sub22_Sub16_Sub3.anInt1835;
		final int var9 = Class124_Sub22_Sub16_Sub3.anInt1836;
		final int var12 = anIntArray1907[var2];
		final int var13 = anIntArray1908[var2];
		final int var14 = anIntArray1907[var3];
		final int var15 = anIntArray1908[var3];
		final int var16 = anIntArray1907[var4];
		final int var17 = anIntArray1908[var4];
		final int var18 = ((var6 * var16) + (var7 * var17)) >> 16;

		for (int var19 = 0; var19 < anInt1853; ++var19) {
			int var20 = anIntArray1854[var19];
			int var21 = anIntArray1849[var19];
			int var22 = anIntArray1856[var19];
			int var23;
			if (var3 != 0) {
				var23 = ((var21 * var14) + (var20 * var15)) >> 16;
				var21 = ((var21 * var15) - (var20 * var14)) >> 16;
				var20 = var23;
			}

			if (var2 != 0) {
				var23 = ((var22 * var12) + (var20 * var13)) >> 16;
				var22 = ((var22 * var13) - (var20 * var12)) >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = ((var21 * var17) - (var22 * var16)) >> 16;
			var22 = ((var21 * var16) + (var22 * var17)) >> 16;
			anIntArray1902[var19] = var22 - var18;
			anIntArray1857[var19] = var8 + ((var20 * Class124_Sub22_Sub16_Sub3.anInt1834) / var22);
			anIntArray1851[var19] = var9 + ((var23 * Class124_Sub22_Sub16_Sub3.anInt1834) / var22);
			if (anInt1876 > 0) {
				anIntArray1885[var19] = var20;
				anIntArray1886[var19] = var23;
				anIntArray1852[var19] = var22;
			}
		}

		try {
			method999(false, false, 0);
		} catch (final Exception var25) {
			;
		}

	}

	static {
		anIntArray1907 = Class124_Sub22_Sub16_Sub3.anIntArray1847;
		anIntArray1908 = Class124_Sub22_Sub16_Sub3.anIntArray1848;
		anIntArray1909 = Class124_Sub22_Sub16_Sub3.anIntArray1845;
		anIntArray1910 = Class124_Sub22_Sub16_Sub3.anIntArray1846;
	}

	final boolean method1007(final int var1, final int var2, final int var3, final int var4, final int var5,
			final int var6, final int var7, final int var8) {
		return (var2 < var3) && (var2 < var4) && (var2 < var5) ? false
				: ((var2 > var3) && (var2 > var4) && (var2 > var5) ? false
						: ((var1 < var6) && (var1 < var7) && (var1 < var8) ? false
								: (var1 <= var6) || (var1 <= var7) || (var1 <= var8)));
	}

	public Class124_Sub22_Sub19_Sub7 method1008(final int[][] var1, final int var2, final int var3, final int var4,
			final boolean var5, final int var6) {
		method989();
		int var13 = var2 - anInt1878;
		int var9 = var2 + anInt1878;
		int var15 = var4 - anInt1878;
		int var19 = var4 + anInt1878;
		if ((var13 >= 0) && (((var9 + 128) >> 7) < var1.length) && (var15 >= 0)
				&& (((var19 + 128) >> 7) < var1[0].length)) {
			var13 >>= 7;
			var9 = (var9 + 127) >> 7;
			var15 >>= 7;
			var19 = (var19 + 127) >> 7;
			if ((var1[var13][var15] == var3) && (var1[var9][var15] == var3) && (var1[var13][var19] == var3)
					&& (var1[var9][var19] == var3))
				return this;
			else {
				Class124_Sub22_Sub19_Sub7 var14;
				if (var5) {
					var14 = new Class124_Sub22_Sub19_Sub7();
					var14.anInt1853 = anInt1853;
					var14.anInt1855 = anInt1855;
					var14.anInt1876 = anInt1876;
					var14.anIntArray1854 = anIntArray1854;
					var14.anIntArray1856 = anIntArray1856;
					var14.anIntArray1858 = anIntArray1858;
					var14.anIntArray1859 = anIntArray1859;
					var14.anIntArray1860 = anIntArray1860;
					var14.anIntArray1882 = anIntArray1882;
					var14.anIntArray1891 = anIntArray1891;
					var14.anIntArray1863 = anIntArray1863;
					var14.aByteArray1864 = aByteArray1864;
					var14.aByteArray1865 = aByteArray1865;
					var14.aByteArray1866 = aByteArray1866;
					var14.aShortArray1875 = aShortArray1875;
					var14.aByte1868 = aByte1868;
					var14.anIntArray1870 = anIntArray1870;
					var14.anIntArray1871 = anIntArray1871;
					var14.anIntArray1872 = anIntArray1872;
					var14.anIntArrayArray1862 = anIntArrayArray1862;
					var14.anIntArrayArray1874 = anIntArrayArray1874;
					var14.aBool1861 = aBool1861;
					var14.anIntArray1849 = new int[var14.anInt1853];
				} else
					var14 = this;

				int var7;
				int var8;
				int var10;
				int var11;
				int var12;
				int var16;
				int var17;
				int var18;
				int var20;
				int var21;
				if (var6 == 0)
					for (var12 = 0; var12 < var14.anInt1853; ++var12) {
						var7 = anIntArray1854[var12] + var2;
						var10 = anIntArray1856[var12] + var4;
						var21 = var7 & 127;
						var11 = var10 & 127;
						var8 = var7 >> 7;
						var16 = var10 >> 7;
						var17 = ((var1[var8][var16] * (128 - var21)) + (var1[var8 + 1][var16] * var21)) >> 7;
						var18 = ((var1[var8][var16 + 1] * (128 - var21)) + (var1[var8 + 1][var16 + 1] * var21)) >> 7;
						var20 = ((var17 * (128 - var11)) + (var18 * var11)) >> 7;
						var14.anIntArray1849[var12] = (anIntArray1849[var12] + var20) - var3;
					}
				else
					for (var12 = 0; var12 < var14.anInt1853; ++var12) {
						var7 = (-anIntArray1849[var12] << 16) / anInt1605;
						if (var7 < var6) {
							var10 = anIntArray1854[var12] + var2;
							var21 = anIntArray1856[var12] + var4;
							var11 = var10 & 127;
							var8 = var21 & 127;
							var16 = var10 >> 7;
							var17 = var21 >> 7;
							var18 = ((var1[var16][var17] * (128 - var11)) + (var1[var16 + 1][var17] * var11)) >> 7;
							var20 = ((var1[var16][var17 + 1] * (128 - var11))
									+ (var1[var16 + 1][var17 + 1] * var11)) >> 7;
							final int var22 = ((var18 * (128 - var8)) + (var20 * var8)) >> 7;
							var14.anIntArray1849[var12] = anIntArray1849[var12]
									+ (((var22 - var3) * (var6 - var7)) / var6);
						}
					}

				var14.anInt1884 = 0;
				return var14;
			}
		} else
			return this;
	}
}
