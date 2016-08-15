import java.awt.Component;

public class Class8 {
	static boolean aBool77;
	static int anInt78;
	int anInt85;
	public static int anInt94;
	Class124_Sub4 aClass124_Sub4_80;
	boolean aBool83 = true;
	long aLong87 = 0L;
	int anInt93 = 0;
	long aLong82 = Class74.method316(-1423977002);
	int anInt88 = 0;
	int anInt84;
	int anInt81;
	int anInt90 = 0;
	long aLong76 = 0L;
	int anInt89 = 0;
	int anInt86 = 32;
	Class124_Sub4[] aClass124_Sub4Array92 = new Class124_Sub4[8];
	Class124_Sub4[] aClass124_Sub4Array95 = new Class124_Sub4[8];
	int[] anIntArray91;
	static Class18 aClass18_79;

	void method36(final Component var1) throws Exception {
	}

	public final synchronized void method37(final Class124_Sub4 var1) {
		aClass124_Sub4_80 = var1;
	}

	public final synchronized void method38() {
		aBool83 = true;

		try {
			method49();
		} catch (final Exception var2) {
			method44();
			aLong87 = Class74.method316(1991264972) + 2000L;
		}

	}

	final void method39(final int[] var1, final int var2) {
		int var3 = var2;
		if (aBool77)
			var3 = var2 << 1;

		Class59.method271(var1, 0, var3);
		anInt93 -= var2;
		if ((null != aClass124_Sub4_80) && (anInt93 <= 0)) {
			anInt93 += anInt94 >> 4;
			Class35.method191(aClass124_Sub4_80);
			method40(aClass124_Sub4_80, aClass124_Sub4_80.method510());
			int var11 = 0;
			int var12 = 255;

			Class124_Sub4 var7;
			int var10;
			label137: for (var10 = 7; var12 != 0; --var10) {
				int var5;
				int var13;
				if (var10 < 0) {
					var13 = var10 & 3;
					var5 = -(var10 >> 2);
				} else {
					var13 = var10;
					var5 = 0;
				}

				for (int var14 = (var12 >>> var13) & 286331153; var14 != 0; var14 >>>= 4) {
					if ((var14 & 1) != 0) {
						var12 &= ~(1 << var13);
						var7 = null;
						Class124_Sub4 var6 = aClass124_Sub4Array92[var13];

						label131: while (true)
							while (true) {
								if (null == var6)
									break label131;

								final Class124_Sub2 var4 = var6.aClass124_Sub2_962;
								if ((null != var4) && (var4.anInt925 > var5)) {
									var12 |= 1 << var13;
									var7 = var6;
									var6 = var6.aClass124_Sub4_963;
								} else {
									var6.aBool960 = true;
									final int var15 = var6.method507();
									var11 += var15;
									if (var4 != null)
										var4.anInt925 += var15;

									if (var11 >= anInt86)
										break label137;

									Class124_Sub4 var9 = var6.method505();
									if (var9 != null)
										for (final int var17 = var6.anInt961; null != var9; var9 = var6.method509())
											method40(var9, (var17 * var9.method510()) >> 8);

									final Class124_Sub4 var8 = var6.aClass124_Sub4_963;
									var6.aClass124_Sub4_963 = null;
									if (var7 == null)
										aClass124_Sub4Array92[var13] = var8;
									else
										var7.aClass124_Sub4_963 = var8;

									if (var8 == null)
										aClass124_Sub4Array95[var13] = var7;

									var6 = var8;
								}
							}
					}

					var13 += 4;
					++var5;
				}
			}

			for (var10 = 0; var10 < 8; ++var10) {
				Class124_Sub4 var16 = aClass124_Sub4Array92[var10];
				final Class124_Sub4[] var18 = aClass124_Sub4Array92;
				aClass124_Sub4Array95[var10] = null;

				for (var18[var10] = null; var16 != null; var16 = var7) {
					var7 = var16.aClass124_Sub4_963;
					var16.aClass124_Sub4_963 = null;
				}
			}
		}

		if (anInt93 < 0)
			anInt93 = 0;

		if (null != aClass124_Sub4_80)
			aClass124_Sub4_80.method511(var1, 0, var2);

		aLong82 = Class74.method316(-1276506431);
	}

	final void method40(final Class124_Sub4 var1, final int var2) {
		final int var3 = var2 >> 5;
		final Class124_Sub4 var4 = aClass124_Sub4Array95[var3];
		if (var4 == null)
			aClass124_Sub4Array92[var3] = var1;
		else
			var4.aClass124_Sub4_963 = var1;

		aClass124_Sub4Array95[var3] = var1;
		var1.anInt961 = var2;
	}

	final void method41(final int var1) {
		anInt93 -= var1;
		if (anInt93 < 0)
			anInt93 = 0;

		if (null != aClass124_Sub4_80)
			aClass124_Sub4_80.method506(var1);

	}

	void method42(final int var1) throws Exception {
	}

	void method43() throws Exception {
	}

	void method44() {
	}

	int method45() throws Exception {
		return anInt84;
	}

	public final synchronized void method46() {
		if (anIntArray91 != null) {
			long var1 = Class74.method316(911391600);

			try {
				if (0L != aLong87) {
					if (var1 < aLong87)
						return;

					method42(anInt84);
					aLong87 = 0L;
					aBool83 = true;
				}

				int var3 = method45();
				if ((anInt90 - var3) > anInt88)
					anInt88 = anInt90 - var3;

				int var4 = anInt81 + anInt85;
				if ((var4 + 256) > 16384)
					var4 = 16128;

				if ((256 + var4) > anInt84) {
					anInt84 += 1024;
					if (anInt84 > 16384)
						anInt84 = 16384;

					method44();
					method42(anInt84);
					var3 = 0;
					aBool83 = true;
					if ((256 + var4) > anInt84) {
						var4 = anInt84 - 256;
						anInt81 = var4 - anInt85;
					}
				}

				while (var3 < var4) {
					method39(anIntArray91, 256);
					method43();
					var3 += 256;
				}

				if (var1 > aLong76) {
					if (!aBool83) {
						if ((anInt88 == 0) && (anInt89 == 0)) {
							method44();
							aLong87 = var1 + 2000L;
							return;
						}

						anInt81 = Math.min(anInt89, anInt88);
						anInt89 = anInt88;
					} else
						aBool83 = false;

					anInt88 = 0;
					aLong76 = var1 + 2000L;
				}

				anInt90 = var3;
			} catch (final Exception var7) {
				method44();
				aLong87 = var1 + 2000L;
			}

			try {
				if (var1 > (500000L + aLong82))
					var1 = aLong82;

				while (var1 > (5000L + aLong82)) {
					method41(256);
					aLong82 += 256000 / anInt94;
				}
			} catch (final Exception var6) {
				aLong82 = var1;
			}

		}
	}

	public final void method47() {
		aBool83 = true;
	}

	public final synchronized void method48() {
		if (null != aClass18_79) {
			boolean var2 = true;

			for (int var1 = 0; var1 < 2; ++var1) {
				if (this == aClass18_79.aClass8Array159[var1])
					aClass18_79.aClass8Array159[var1] = null;

				if (aClass18_79.aClass8Array159[var1] != null)
					var2 = false;
			}

			if (var2) {
				aClass18_79.aBool160 = true;

				while (aClass18_79.aBool161)
					client.method1067(50L);

				aClass18_79 = null;
			}
		}

		method44();
		anIntArray91 = null;
	}

	void method49() throws Exception {
	}

	static final int method50(final int var0, final int var1, final int var2) {
		final int var3 = 256 - var2;
		return (((((var0 & 16711935) * var3) + (var2 * (var1 & 16711935))) & -16711936)
				+ (((var3 * (var0 & '\uff00')) + (var2 * (var1 & '\uff00'))) & 16711680)) >> 8;
	}
}
