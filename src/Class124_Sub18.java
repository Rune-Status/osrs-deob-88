public class Class124_Sub18 extends Node {
	static byte[][] xteaMdata;
	Class124_Sub2_Sub1[] aClass124_Sub2_Sub1Array1286 = new Class124_Sub2_Sub1[128];
	short[] aShortArray1290 = new short[128];
	byte[] aByteArray1288 = new byte[128];
	byte[] aByteArray1289 = new byte[128];
	Class103[] aClass103Array1287 = new Class103[128];
	byte[] aByteArray1292 = new byte[128];
	int[] anIntArray1293 = new int[128];
	int anInt1291;

	Class124_Sub18(final byte[] var1) {
		final RSBuf var7 = new RSBuf(var1);

		int var9;
		for (var9 = 0; var7.backing[var7.pos + var9] != 0; ++var9)
			;

		final byte[] var10 = new byte[var9];

		int var12;
		for (var12 = 0; var12 < var9; ++var12)
			var10[var12] = var7.readByte();

		++var7.pos;
		++var9;
		var12 = var7.pos;
		var7.pos += var9;

		int var13;
		for (var13 = 0; var7.backing[var13 + var7.pos] != 0; ++var13)
			;

		final byte[] var16 = new byte[var13];

		int var17;
		for (var17 = 0; var17 < var13; ++var17)
			var16[var17] = var7.readByte();

		++var7.pos;
		++var13;
		var17 = var7.pos;
		var7.pos += var13;

		int var20;
		for (var20 = 0; var7.backing[var20 + var7.pos] != 0; ++var20)
			;

		final byte[] var21 = new byte[var20];

		for (int var22 = 0; var22 < var20; ++var22)
			var21[var22] = var7.readByte();

		++var7.pos;
		++var20;
		final byte[] var24 = new byte[var20];
		int var19;
		int var26;
		if (var20 > 1) {
			var24[1] = 1;
			int var25 = 1;
			var26 = 2;

			for (var19 = 2; var19 < var20; ++var19) {
				int var29 = var7.readByteU();
				if (var29 == 0)
					var25 = var26++;
				else {
					if (var29 <= var25)
						--var29;

					var25 = var29;
				}

				var24[var19] = (byte) var25;
			}
		} else
			var26 = var20;

		final Class103[] var30 = new Class103[var26];

		Class103 var31;
		for (var19 = 0; var19 < var30.length; ++var19) {
			var31 = var30[var19] = new Class103();
			int var32 = var7.readByteU();
			if (var32 > 0)
				var31.aByteArray790 = new byte[2 * var32];

			var32 = var7.readByteU();
			if (var32 > 0) {
				var31.aByteArray791 = new byte[2 + (2 * var32)];
				var31.aByteArray791[1] = 64;
			}
		}

		var19 = var7.readByteU();
		final byte[] var48 = var19 > 0 ? new byte[2 * var19] : null;
		var19 = var7.readByteU();
		final byte[] var5 = var19 > 0 ? new byte[var19 * 2] : null;

		int var37;
		for (var37 = 0; var7.backing[var7.pos + var37] != 0; ++var37)
			;

		final byte[] var38 = new byte[var37];

		int var4;
		for (var4 = 0; var4 < var37; ++var4)
			var38[var4] = var7.readByte();

		++var7.pos;
		++var37;
		var4 = 0;

		int var8;
		for (var8 = 0; var8 < 128; ++var8) {
			var4 += var7.readByteU();
			aShortArray1290[var8] = (short) var4;
		}

		var4 = 0;

		for (var8 = 0; var8 < 128; ++var8) {
			var4 += var7.readByteU();
			aShortArray1290[var8] = (short) (aShortArray1290[var8] + (var4 << 8));
		}

		var8 = 0;
		int var40 = 0;
		int var23 = 0;

		int var11;
		for (var11 = 0; var11 < 128; ++var11) {
			if (var8 == 0) {
				if (var40 < var38.length)
					var8 = var38[var40++];
				else
					var8 = -1;

				var23 = var7.packed();
			}

			aShortArray1290[var11] = (short) (aShortArray1290[var11] + (((var23 - 1) & 2) << 14));
			anIntArray1293[var11] = var23;
			--var8;
		}

		var8 = 0;
		var40 = 0;
		var11 = 0;

		int var28;
		for (var28 = 0; var28 < 128; ++var28)
			if (anIntArray1293[var28] != 0) {
				if (var8 == 0) {
					if (var40 < var10.length)
						var8 = var10[var40++];
					else
						var8 = -1;

					var11 = var7.backing[var12++] - 1;
				}

				aByteArray1292[var28] = (byte) var11;
				--var8;
			}

		var8 = 0;
		var40 = 0;
		var28 = 0;

		for (int var27 = 0; var27 < 128; ++var27)
			if (anIntArray1293[var27] != 0) {
				if (var8 == 0) {
					if (var40 < var16.length)
						var8 = var16[var40++];
					else
						var8 = -1;

					var28 = (var7.backing[var17++] + 16) << 2;
				}

				aByteArray1289[var27] = (byte) var28;
				--var8;
			}

		var8 = 0;
		var40 = 0;
		Class103 var41 = null;

		int var18;
		for (var18 = 0; var18 < 128; ++var18)
			if (anIntArray1293[var18] != 0) {
				if (var8 == 0) {
					var41 = var30[var24[var40]];
					if (var40 < var21.length)
						var8 = var21[var40++];
					else
						var8 = -1;
				}

				aClass103Array1287[var18] = var41;
				--var8;
			}

		var8 = 0;
		var40 = 0;
		var18 = 0;

		int var6;
		for (var6 = 0; var6 < 128; ++var6) {
			if (var8 == 0) {
				if (var40 < var38.length)
					var8 = var38[var40++];
				else
					var8 = -1;

				if (anIntArray1293[var6] > 0)
					var18 = var7.readByteU() + 1;
			}

			aByteArray1288[var6] = (byte) var18;
			--var8;
		}

		anInt1291 = var7.readByteU() + 1;

		Class103 var2;
		int var3;
		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (null != var2.aByteArray790)
				for (var3 = 1; var3 < var2.aByteArray790.length; var3 += 2)
					var2.aByteArray790[var3] = var7.readByte();

			if (var2.aByteArray791 != null)
				for (var3 = 3; var3 < (var2.aByteArray791.length - 2); var3 += 2)
					var2.aByteArray791[var3] = var7.readByte();
		}

		if (var48 != null)
			for (var6 = 1; var6 < var48.length; var6 += 2)
				var48[var6] = var7.readByte();

		if (var5 != null)
			for (var6 = 1; var6 < var5.length; var6 += 2)
				var5[var6] = var7.readByte();

		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (var2.aByteArray791 != null) {
				var4 = 0;

				for (var3 = 2; var3 < var2.aByteArray791.length; var3 += 2) {
					var4 = 1 + var4 + var7.readByteU();
					var2.aByteArray791[var3] = (byte) var4;
				}
			}
		}

		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (null != var2.aByteArray790) {
				var4 = 0;

				for (var3 = 2; var3 < var2.aByteArray790.length; var3 += 2) {
					var4 = var4 + 1 + var7.readByteU();
					var2.aByteArray790[var3] = (byte) var4;
				}
			}
		}

		byte var34;
		int var35;
		int var36;
		int var39;
		int var42;
		int var43;
		byte var45;
		int var49;
		if (null != var48) {
			var4 = var7.readByteU();
			var48[0] = (byte) var4;

			for (var6 = 2; var6 < var48.length; var6 += 2) {
				var4 = 1 + var4 + var7.readByteU();
				var48[var6] = (byte) var4;
			}

			var45 = var48[0];
			byte var15 = var48[1];

			for (var3 = 0; var3 < var45; ++var3)
				aByteArray1288[var3] = (byte) (((var15 * aByteArray1288[var3]) + 32) >> 6);

			for (var3 = 2; var3 < var48.length; var3 += 2) {
				var34 = var48[var3];
				final byte var14 = var48[1 + var3];
				var39 = ((var34 - var45) / 2) + ((var34 - var45) * var15);

				for (var35 = var45; var35 < var34; ++var35) {
					var42 = var34 - var45;
					var36 = var39 >>> 31;
					var43 = ((var39 + var36) / var42) - var36;
					aByteArray1288[var35] = (byte) ((32 + (aByteArray1288[var35] * var43)) >> 6);
					var39 += var14 - var15;
				}

				var45 = var34;
				var15 = var14;
			}

			for (var49 = var45; var49 < 128; ++var49)
				aByteArray1288[var49] = (byte) (((var15 * aByteArray1288[var49]) + 32) >> 6);

			var31 = null;
		}

		if (null != var5) {
			var4 = var7.readByteU();
			var5[0] = (byte) var4;

			for (var6 = 2; var6 < var5.length; var6 += 2) {
				var4 = 1 + var4 + var7.readByteU();
				var5[var6] = (byte) var4;
			}

			var45 = var5[0];
			int var47 = var5[1] << 1;

			for (var3 = 0; var3 < var45; ++var3) {
				var49 = (aByteArray1289[var3] & 255) + var47;
				if (var49 < 0)
					var49 = 0;

				if (var49 > 128)
					var49 = 128;

				aByteArray1289[var3] = (byte) var49;
			}

			int var46;
			for (var3 = 2; var3 < var5.length; var3 += 2) {
				var34 = var5[var3];
				var46 = var5[var3 + 1] << 1;
				var39 = ((var34 - var45) * var47) + ((var34 - var45) / 2);

				for (var35 = var45; var35 < var34; ++var35) {
					var42 = var34 - var45;
					var36 = var39 >>> 31;
					var43 = ((var36 + var39) / var42) - var36;
					int var33 = (aByteArray1289[var35] & 255) + var43;
					if (var33 < 0)
						var33 = 0;

					if (var33 > 128)
						var33 = 128;

					aByteArray1289[var35] = (byte) var33;
					var39 += var46 - var47;
				}

				var45 = var34;
				var47 = var46;
			}

			for (var49 = var45; var49 < 128; ++var49) {
				var46 = (aByteArray1289[var49] & 255) + var47;
				if (var46 < 0)
					var46 = 0;

				if (var46 > 128)
					var46 = 128;

				aByteArray1289[var49] = (byte) var46;
			}
		}

		for (var6 = 0; var6 < var26; ++var6)
			var30[var6].anInt792 = var7.readByteU();

		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (null != var2.aByteArray790)
				var2.anInt793 = var7.readByteU();

			if (null != var2.aByteArray791)
				var2.anInt798 = var7.readByteU();

			if (var2.anInt792 > 0)
				var2.anInt799 = var7.readByteU();
		}

		for (var6 = 0; var6 < var26; ++var6)
			var30[var6].anInt797 = var7.readByteU();

		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (var2.anInt797 > 0)
				var2.anInt796 = var7.readByteU();
		}

		for (var6 = 0; var6 < var26; ++var6) {
			var2 = var30[var6];
			if (var2.anInt796 > 0)
				var2.anInt795 = var7.readByteU();
		}

	}

	boolean method632(final Class10 var1, final byte[] var2, final int[] var3) {
		boolean var4 = true;
		int var8 = 0;
		Class124_Sub2_Sub1 var6 = null;

		for (int var7 = 0; var7 < 128; ++var7)
			if ((null == var2) || (var2[var7] != 0)) {
				int var5 = anIntArray1293[var7];
				if (var5 != 0) {
					if (var5 != var8) {
						var8 = var5--;
						if ((var5 & 1) == 0)
							var6 = var1.method57(var5 >> 2, var3);
						else
							var6 = var1.method58(var5 >> 2, var3);

						if (null == var6)
							var4 = false;
					}

					if (null != var6) {
						aClass124_Sub2_Sub1Array1286[var7] = var6;
						anIntArray1293[var7] = 0;
					}
				}
			}

		return var4;
	}

	void method633() {
		anIntArray1293 = null;
	}
}
