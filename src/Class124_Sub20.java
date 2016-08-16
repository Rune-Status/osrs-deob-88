public class Class124_Sub20 extends Node {
	byte[] aByteArray1300;
	Class107 aClass107_1301;

	static Class124_Sub20 method634(final Class94 var0, final int var1, final int var2) {
		final byte[] var3 = var0.decode(var1, var2);
		return var3 == null ? null : new Class124_Sub20(new RSBuf(var3));
	}

	Class124_Sub20(final RSBuf var1) {
		var1.pos = var1.backing.length - 3;
		final int var3 = var1.method558();
		final int var4 = var1.method560();
		int var5 = 14 + (var3 * 10);
		var1.pos = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var24 = 0;
		int var9 = 0;
		int var19 = 0;
		int var11 = 0;
		int var26 = 0;

		int var2;
		int var13;
		int var14;
		for (var13 = 0; var13 < var3; ++var13) {
			var14 = -1;

			while (true) {
				var2 = var1.method558();
				if (var2 != var14)
					++var5;

				var14 = var2 & 15;
				if (var2 == 7)
					break;

				if (var2 == 23)
					++var6;
				else if (var14 == 0)
					++var8;
				else if (var14 == 1)
					++var24;
				else if (var14 == 2)
					++var7;
				else if (var14 == 3)
					++var9;
				else if (var14 == 4)
					++var19;
				else if (var14 == 5)
					++var11;
				else {
					if (var14 != 6)
						throw new RuntimeException();

					++var26;
				}
			}
		}

		var5 += 5 * var6;
		var5 += 2 * (var8 + var24 + var7 + var9 + var11);
		var5 += var19 + var26;
		var13 = var1.pos;
		var14 = var3 + var6 + var7 + var8 + var24 + var9 + var19 + var11 + var26;

		for (var2 = 0; var2 < var14; ++var2)
			var1.method570();

		var5 += var1.pos - var13;
		var2 = var1.pos;
		int var28 = 0;
		int var29 = 0;
		int var30 = 0;
		int var37 = 0;
		int var31 = 0;
		int var32 = 0;
		int var33 = 0;
		int var12 = 0;
		int var41 = 0;
		int var18 = 0;
		int var35 = 0;
		int var43 = 0;
		int var10 = 0;

		int var36;
		for (var36 = 0; var36 < var7; ++var36) {
			var10 = (var10 + var1.method558()) & 127;
			if ((var10 != 0) && (var10 != 32)) {
				if (var10 == 1)
					++var28;
				else if (var10 == 33)
					++var29;
				else if (var10 == 7)
					++var30;
				else if (var10 == 39)
					++var37;
				else if (var10 == 10)
					++var31;
				else if (var10 == 42)
					++var32;
				else if (var10 == 99)
					++var33;
				else if (var10 == 98)
					++var12;
				else if (var10 == 101)
					++var41;
				else if (var10 == 100)
					++var18;
				else if ((var10 != 64) && (var10 != 65) && (var10 != 120) && (var10 != 121) && (var10 != 123))
					++var43;
				else
					++var35;
			} else
				++var26;
		}

		var36 = 0;
		int var22 = var1.pos;
		var1.pos += var35;
		int var45 = var1.pos;
		var1.pos += var11;
		int var46 = var1.pos;
		var1.pos += var19;
		int var47 = var1.pos;
		var1.pos += var9;
		int var48 = var1.pos;
		var1.pos += var28;
		int var50 = var1.pos;
		var1.pos += var30;
		int var42 = var1.pos;
		var1.pos += var31;
		int var39 = var1.pos;
		var1.pos += var8 + var24 + var11;
		int var51 = var1.pos;
		var1.pos += var8;
		int var52 = var1.pos;
		var1.pos += var43;
		int var53 = var1.pos;
		var1.pos += var24;
		int var54 = var1.pos;
		var1.pos += var29;
		int var34 = var1.pos;
		var1.pos += var37;
		int var44 = var1.pos;
		var1.pos += var32;
		int var55 = var1.pos;
		var1.pos += var26;
		int var49 = var1.pos;
		var1.pos += var9;
		int var66 = var1.pos;
		var1.pos += var33;
		int var23 = var1.pos;
		var1.pos += var12;
		int var56 = var1.pos;
		var1.pos += var41;
		int var57 = var1.pos;
		var1.pos += var18;
		int var58 = var1.pos;
		var1.pos += var6 * 3;
		aByteArray1300 = new byte[var5];
		final RSBuf var20 = new RSBuf(aByteArray1300);
		var20.method548(1297377380);
		var20.method548(6);
		var20.writeShort(var3 > 1 ? 1 : 0);
		var20.writeShort(var3);
		var20.writeShort(var4);
		var1.pos = var13;
		int var25 = 0;
		int var21 = 0;
		int var63 = 0;
		int var59 = 0;
		int var60 = 0;
		int var61 = 0;
		int var62 = 0;
		final int[] var16 = new int[128];
		var10 = 0;

		label352: for (int var38 = 0; var38 < var3; ++var38) {
			var20.method548(1297379947);
			var20.pos += 4;
			final int var64 = var20.pos;
			int var15 = -1;

			while (true)
				while (true) {
					final int var40 = var1.method570();
					var20.method599(var40);
					final int var65 = var1.backing[var36++] & 255;
					final boolean var27 = var65 != var15;
					var15 = var65 & 15;
					if (var65 == 7) {
						if (var27)
							var20.writeByte(255);

						var20.writeByte(47);
						var20.writeByte(0);
						var20.method553(var20.pos - var64);
						continue label352;
					}

					if (var65 == 23) {
						if (var27)
							var20.writeByte(255);

						var20.writeByte(81);
						var20.writeByte(3);
						var20.writeByte(var1.backing[var58++]);
						var20.writeByte(var1.backing[var58++]);
						var20.writeByte(var1.backing[var58++]);
					} else {
						var25 ^= var65 >> 4;
						if (var15 == 0) {
							if (var27)
								var20.writeByte(144 + var25);

							var21 += var1.backing[var39++];
							var63 += var1.backing[var51++];
							var20.writeByte(var21 & 127);
							var20.writeByte(var63 & 127);
						} else if (var15 == 1) {
							if (var27)
								var20.writeByte(128 + var25);

							var21 += var1.backing[var39++];
							var59 += var1.backing[var53++];
							var20.writeByte(var21 & 127);
							var20.writeByte(var59 & 127);
						} else if (var15 == 2) {
							if (var27)
								var20.writeByte(176 + var25);

							var10 = (var10 + var1.backing[var2++]) & 127;
							var20.writeByte(var10);
							byte var17;
							if ((var10 != 0) && (var10 != 32)) {
								if (var10 == 1)
									var17 = var1.backing[var48++];
								else if (var10 == 33)
									var17 = var1.backing[var54++];
								else if (var10 == 7)
									var17 = var1.backing[var50++];
								else if (var10 == 39)
									var17 = var1.backing[var34++];
								else if (var10 == 10)
									var17 = var1.backing[var42++];
								else if (var10 == 42)
									var17 = var1.backing[var44++];
								else if (var10 == 99)
									var17 = var1.backing[var66++];
								else if (var10 == 98)
									var17 = var1.backing[var23++];
								else if (var10 == 101)
									var17 = var1.backing[var56++];
								else if (var10 == 100)
									var17 = var1.backing[var57++];
								else if ((var10 != 64) && (var10 != 65) && (var10 != 120) && (var10 != 121)
										&& (var10 != 123))
									var17 = var1.backing[var52++];
								else
									var17 = var1.backing[var22++];
							} else
								var17 = var1.backing[var55++];

							final int var67 = var17 + var16[var10];
							var16[var10] = var67;
							var20.writeByte(var67 & 127);
						} else if (var15 == 3) {
							if (var27)
								var20.writeByte(224 + var25);

							var60 += var1.backing[var49++];
							var60 += var1.backing[var47++] << 7;
							var20.writeByte(var60 & 127);
							var20.writeByte((var60 >> 7) & 127);
						} else if (var15 == 4) {
							if (var27)
								var20.writeByte(208 + var25);

							var61 += var1.backing[var46++];
							var20.writeByte(var61 & 127);
						} else if (var15 == 5) {
							if (var27)
								var20.writeByte(160 + var25);

							var21 += var1.backing[var39++];
							var62 += var1.backing[var45++];
							var20.writeByte(var21 & 127);
							var20.writeByte(var62 & 127);
						} else {
							if (var15 != 6)
								throw new RuntimeException();

							if (var27)
								var20.writeByte(192 + var25);

							var20.writeByte(var1.backing[var55++]);
						}
					}
				}
		}

	}

	void method635() {
		aClass107_1301 = null;
	}

	void method636() {
		if (aClass107_1301 == null) {
			aClass107_1301 = new Class107(16);
			final int[] var3 = new int[16];
			final int[] var7 = new int[16];
			var7[9] = 128;
			var3[9] = 128;
			final Class93 var4 = new Class93(aByteArray1300);
			final int var13 = var4.method350();

			int var5;
			for (var5 = 0; var5 < var13; ++var5) {
				var4.method351(var5);
				var4.method352(var5);
				var4.method362(var5);
			}

			label86: do
				while (true) {
					var5 = var4.method361();
					final int var11 = var4.anIntArray739[var5];

					while (var4.anIntArray739[var5] == var11) {
						var4.method351(var5);
						final int var1 = var4.method353(var5);
						if (var1 == 1) {
							var4.method359();
							var4.method362(var5);
							continue label86;
						}

						final int var9 = var1 & 240;
						int var2;
						int var12;
						int var14;
						if (var9 == 176) {
							var14 = var1 & 15;
							var2 = (var1 >> 8) & 127;
							var12 = (var1 >> 16) & 127;
							if (var2 == 0)
								var3[var14] = (var3[var14] & -2080769) + (var12 << 14);

							if (var2 == 32)
								var3[var14] = (var3[var14] & -16257) + (var12 << 7);
						}

						if (var9 == 192) {
							var14 = var1 & 15;
							var2 = (var1 >> 8) & 127;
							var7[var14] = var3[var14] + var2;
						}

						if (var9 == 144) {
							var14 = var1 & 15;
							var2 = (var1 >> 8) & 127;
							var12 = (var1 >> 16) & 127;
							if (var12 > 0) {
								final int var10 = var7[var14];
								Class124_Sub23 var6 = (Class124_Sub23) aClass107_1301.method409(var10);
								if (var6 == null) {
									var6 = new Class124_Sub23(new byte[128]);
									aClass107_1301.method412(var6, var10);
								}

								var6.aByteArray1305[var2] = 1;
							}
						}

						var4.method352(var5);
						var4.method362(var5);
					}
				}
			while (!var4.method356());

		}
	}
}
