public class Somet4 extends Node {
	static byte[] aByteArray932;
	static int anInt933;
	static int anInt934;
	float[] aFloatArray944;
	static float[] aFloatArray946;
	int anInt948;
	int anInt930;
	boolean aBool947;
	static boolean aBool941 = false;
	byte[] aByteArray957;
	int anInt958;
	int anInt959;
	static int anInt953;
	static int anInt954;
	static Class6[] aClass6Array937;
	static Class11[] aClass11Array938;
	static Class14[] aClass14Array939;
	static Class13[] aClass13Array940;
	static boolean[] aBoolArray928;
	static int[] anIntArray942;
	static float[] aFloatArray949;
	static float[] aFloatArray935;
	static float[] aFloatArray943;
	static int[] anIntArray955;
	static float[] aFloatArray945;
	static float[] aFloatArray931;
	static float[] aFloatArray927;
	static int[] anIntArray956;
	int anInt936;
	int anInt952;
	int anInt929;
	int anInt926;
	boolean aBool950;
	byte[][] aByteArrayArray951;

	float[] method497(final int var1) {
		client.method495(aByteArrayArray951[var1], 0);
		client.method496();
		final int var3 = client.method502(Def10.method714(anIntArray942.length - 1));
		final boolean var21 = aBoolArray928[var3];
		final int var5 = var21 ? anInt954 : anInt953;
		boolean var8 = false;
		boolean var7 = false;
		if (var21) {
			var8 = client.method496() != 0;
			var7 = client.method496() != 0;
		}

		final int var31 = var5 >> 1;
		int var18;
		int var19;
		int var20;
		if (var21 && !var8) {
			var18 = (var5 >> 2) - (anInt953 >> 2);
			var19 = (var5 >> 2) + (anInt953 >> 2);
			var20 = anInt953 >> 1;
		} else {
			var18 = 0;
			var19 = var31;
			var20 = var5 >> 1;
		}

		int var6;
		int var23;
		int var28;
		if (var21 && !var7) {
			var6 = var5 - (var5 >> 2) - (anInt953 >> 2);
			var23 = (var5 - (var5 >> 2)) + (anInt953 >> 2);
			var28 = anInt953 >> 1;
		} else {
			var6 = var31;
			var23 = var5;
			var28 = var5 >> 1;
		}

		final Class13 var25 = aClass13Array940[anIntArray942[var3]];
		final int var26 = var25.anInt126;
		int var27 = var25.anIntArray127[var26];
		final boolean var9 = !aClass11Array938[var27].method66();
		final boolean var53 = var9;

		for (var27 = 0; var27 < var25.anInt128; ++var27) {
			final Class14 var43 = aClass14Array939[var25.anIntArray125[var27]];
			final float[] var29 = aFloatArray946;
			var43.method72(var29, var5 >> 1, var53);
		}

		int var30;
		if (!var9) {
			var27 = var25.anInt126;
			var30 = var25.anIntArray127[var27];
			aClass11Array938[var30].method64(aFloatArray946, var5 >> 1);
		}

		int var24;
		if (var9)
			for (var27 = var5 >> 1; var27 < var5; ++var27)
				aFloatArray946[var27] = 0.0F;
		else {
			var27 = var5 >> 1;
			var30 = var5 >> 2;
			var24 = var5 >> 3;
			final float[] var17 = aFloatArray946;

			int var32;
			for (var32 = 0; var32 < var27; ++var32)
				var17[var32] *= 0.5F;

			for (var32 = var27; var32 < var5; ++var32)
				var17[var32] = -var17[var5 - var32 - 1];

			final float[] var2 = var21 ? aFloatArray945 : aFloatArray949;
			final float[] var33 = var21 ? aFloatArray931 : aFloatArray935;
			final float[] var44 = var21 ? aFloatArray927 : aFloatArray943;
			final int[] var42 = var21 ? anIntArray956 : anIntArray955;

			float var4;
			float var10;
			float var13;
			float var14;
			int var34;
			for (var34 = 0; var34 < var30; ++var34) {
				var4 = var17[4 * var34] - var17[var5 - (4 * var34) - 1];
				var13 = var17[(4 * var34) + 2] - var17[var5 - (4 * var34) - 3];
				var10 = var2[2 * var34];
				var14 = var2[(2 * var34) + 1];
				var17[var5 - (4 * var34) - 1] = (var4 * var10) - (var13 * var14);
				var17[var5 - (4 * var34) - 3] = (var4 * var14) + (var13 * var10);
			}

			float var11;
			float var15;
			for (var34 = 0; var34 < var24; ++var34) {
				var4 = var17[var27 + 3 + (4 * var34)];
				var13 = var17[var27 + 1 + (4 * var34)];
				var10 = var17[(4 * var34) + 3];
				var14 = var17[(4 * var34) + 1];
				var17[var27 + 3 + (4 * var34)] = var4 + var10;
				var17[var27 + 1 + (4 * var34)] = var13 + var14;
				var11 = var2[var27 - 4 - (4 * var34)];
				var15 = var2[var27 - 3 - (4 * var34)];
				var17[(4 * var34) + 3] = ((var4 - var10) * var11) - ((var13 - var14) * var15);
				var17[(4 * var34) + 1] = ((var13 - var14) * var11) + ((var4 - var10) * var15);
			}

			var34 = Def10.method714(var5 - 1);

			int var45;
			int var46;
			int var49;
			int var50;
			for (var45 = 0; var45 < (var34 - 3); ++var45) {
				var49 = var5 >> (var45 + 2);
				var46 = 8 << var45;

				for (var50 = 0; var50 < (2 << var45); ++var50) {
					final int var47 = var5 - (var49 * 2 * var50);
					final int var51 = var5 - (var49 * ((2 * var50) + 1));

					for (int var12 = 0; var12 < (var5 >> (var45 + 4)); ++var12) {
						final int var16 = 4 * var12;
						final float var37 = var17[var47 - 1 - var16];
						final float var38 = var17[var47 - 3 - var16];
						final float var39 = var17[var51 - 1 - var16];
						final float var40 = var17[var51 - 3 - var16];
						var17[var47 - 1 - var16] = var37 + var39;
						var17[var47 - 3 - var16] = var38 + var40;
						final float var22 = var2[var12 * var46];
						final float var41 = var2[(var12 * var46) + 1];
						var17[var51 - 1 - var16] = ((var37 - var39) * var22) - ((var38 - var40) * var41);
						var17[var51 - 3 - var16] = ((var38 - var40) * var22) + ((var37 - var39) * var41);
					}
				}
			}

			for (var45 = 1; var45 < (var24 - 1); ++var45) {
				var49 = var42[var45];
				if (var45 < var49) {
					var46 = 8 * var45;
					var50 = 8 * var49;
					var11 = var17[var46 + 1];
					var17[var46 + 1] = var17[var50 + 1];
					var17[var50 + 1] = var11;
					var11 = var17[var46 + 3];
					var17[var46 + 3] = var17[var50 + 3];
					var17[var50 + 3] = var11;
					var11 = var17[var46 + 5];
					var17[var46 + 5] = var17[var50 + 5];
					var17[var50 + 5] = var11;
					var11 = var17[var46 + 7];
					var17[var46 + 7] = var17[var50 + 7];
					var17[var50 + 7] = var11;
				}
			}

			for (var45 = 0; var45 < var27; ++var45)
				var17[var45] = var17[(2 * var45) + 1];

			for (var45 = 0; var45 < var24; ++var45) {
				var17[var5 - 1 - (2 * var45)] = var17[4 * var45];
				var17[var5 - 2 - (2 * var45)] = var17[(4 * var45) + 1];
				var17[var5 - var30 - 1 - (2 * var45)] = var17[(4 * var45) + 2];
				var17[var5 - var30 - 2 - (2 * var45)] = var17[(4 * var45) + 3];
			}

			for (var45 = 0; var45 < var24; ++var45) {
				var13 = var44[2 * var45];
				var10 = var44[(2 * var45) + 1];
				var14 = var17[var27 + (2 * var45)];
				var11 = var17[var27 + (2 * var45) + 1];
				var15 = var17[var5 - 2 - (2 * var45)];
				final float var48 = var17[var5 - 1 - (2 * var45)];
				float var52 = (var10 * (var14 - var15)) + (var13 * (var11 + var48));
				var17[var27 + (2 * var45)] = (var14 + var15 + var52) * 0.5F;
				var17[var5 - 2 - (2 * var45)] = ((var14 + var15) - var52) * 0.5F;
				var52 = (var10 * (var11 + var48)) - (var13 * (var14 - var15));
				var17[var27 + (2 * var45) + 1] = ((var11 - var48) + var52) * 0.5F;
				var17[var5 - 1 - (2 * var45)] = (-var11 + var48 + var52) * 0.5F;
			}

			for (var45 = 0; var45 < var30; ++var45) {
				var17[var45] = (var17[(2 * var45) + var27] * var33[2 * var45])
						+ (var17[(2 * var45) + 1 + var27] * var33[(2 * var45) + 1]);
				var17[var27 - 1 - var45] = (var17[(2 * var45) + var27] * var33[(2 * var45) + 1])
						- (var17[(2 * var45) + 1 + var27] * var33[2 * var45]);
			}

			for (var45 = 0; var45 < var30; ++var45)
				var17[(var5 - var30) + var45] = -var17[var45];

			for (var45 = 0; var45 < var30; ++var45)
				var17[var45] = var17[var30 + var45];

			for (var45 = 0; var45 < var30; ++var45)
				var17[var30 + var45] = -var17[var30 - var45 - 1];

			for (var45 = 0; var45 < var30; ++var45)
				var17[var27 + var45] = var17[var5 - var45 - 1];

			for (var45 = var18; var45 < var19; ++var45) {
				var13 = (float) Math.sin((((var45 - var18) + 0.5D) / var20) * 0.5D * 3.141592653589793D);
				aFloatArray946[var45] *= (float) Math.sin(1.5707963267948966D * var13 * var13);
			}

			for (var45 = var6; var45 < var23; ++var45) {
				var13 = (float) Math
						.sin(((((var45 - var6) + 0.5D) / var28) * 0.5D * 3.141592653589793D) + 1.5707963267948966D);
				aFloatArray946[var45] *= (float) Math.sin(1.5707963267948966D * var13 * var13);
			}
		}

		float[] var35 = null;
		if (anInt948 > 0) {
			var30 = (anInt948 + var5) >> 2;
			var35 = new float[var30];
			int var36;
			if (!aBool947)
				for (var24 = 0; var24 < anInt930; ++var24) {
					var36 = (anInt948 >> 1) + var24;
					var35[var24] += aFloatArray944[var36];
				}

			if (!var9)
				for (var24 = var18; var24 < (var5 >> 1); ++var24) {
					var36 = (var35.length - (var5 >> 1)) + var24;
					var35[var36] += aFloatArray946[var24];
				}
		}

		final float[] var54 = aFloatArray944;
		aFloatArray944 = aFloatArray946;
		aFloatArray946 = var54;
		anInt948 = var5;
		anInt930 = var23 - (var5 >> 1);
		aBool947 = var9;
		return var35;
	}

	static Somet4 method499(final CacheArch var0, final int var1, final int var2) {
		if (!client.valid(var0)) {
			var0.valid(var1, var2);
			return null;
		} else {
			final byte[] var3 = var0.decode(var1, var2);
			return var3 == null ? null : new Somet4(var3);
		}
	}

	Somet4(final byte[] var1) {
		method504(var1);
	}

	Class124_Sub2_Sub1 method500(final int[] var1) {
		if ((var1 != null) && (var1[0] <= 0))
			return null;
		else {
			if (aByteArray957 == null) {
				anInt948 = 0;
				aFloatArray944 = new float[anInt954];
				aByteArray957 = new byte[anInt952];
				anInt958 = 0;
				anInt959 = 0;
			}

			for (; anInt959 < aByteArrayArray951.length; ++anInt959) {
				if ((var1 != null) && (var1[0] <= 0))
					return null;

				final float[] var2 = method497(anInt959);
				if (var2 != null) {
					int var3 = anInt958;
					int var4 = var2.length;
					if (var4 > (anInt952 - var3))
						var4 = anInt952 - var3;

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int) (128.0F + (var2[var5] * 128.0F));
						if ((var6 & -256) != 0)
							var6 = ~var6 >> 31;

						aByteArray957[var3++] = (byte) (var6 - 128);
					}

					if (var1 != null)
						var1[0] -= var3 - anInt958;

					anInt958 = var3;
				}
			}

			aFloatArray944 = null;
			final byte[] var7 = aByteArray957;
			aByteArray957 = null;
			return new Class124_Sub2_Sub1(anInt936, var7, anInt929, anInt926, aBool950);
		}
	}

	void method504(final byte[] var1) {
		final RSBuf var2 = new RSBuf(var1);
		anInt936 = var2.readInt2(-2045128789);
		anInt952 = var2.readInt2(1700725101);
		anInt929 = var2.readInt2(1340613910);
		anInt926 = var2.readInt2(197881789);
		if (anInt926 < 0) {
			anInt926 = ~anInt926;
			aBool950 = true;
		}

		final int var5 = var2.readInt2(-1953733625);
		aByteArrayArray951 = new byte[var5][];

		for (int var3 = 0; var3 < var5; ++var3) {
			int var6 = 0;

			int var7;
			do {
				var7 = var2.readByteU();
				var6 += var7;
			} while (var7 >= 255);

			final byte[] var4 = new byte[var6];
			var2.readReverse(var4, 0, var6);
			aByteArrayArray951[var3] = var4;
		}

	}
}
