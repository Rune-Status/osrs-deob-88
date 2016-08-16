public class Class56_Sub2 extends Class56 {
	static Class124_Sub4_Sub2 aClass124_Sub4_Sub2_1078;
	public static int anInt1083;
	public static short[] aShortArray1085;
	int anInt1079 = 256;
	int anInt1080 = 1;
	long aLong1081 = Class74.method316(-979484619);
	int anInt1084;
	int anInt1082 = 0;
	long[] aLongArray1086 = new long[10];

	@Override
	void method266(final int var1) {
		for (int var2 = 0; var2 < 10; ++var2)
			aLongArray1086[var2] = 0L;

	}

	@Override
	int method265(final int var1, final int var2, final int var3) {
		final int var4 = anInt1079;
		final int var5 = anInt1080;
		anInt1079 = 300;
		anInt1080 = 1;
		aLong1081 = Class74.method316(-1687141265);
		if (0L == aLongArray1086[anInt1084]) {
			anInt1079 = var4;
			anInt1080 = var5;
		} else if (aLong1081 > aLongArray1086[anInt1084])
			anInt1079 = (int) (2560 * var1 / (aLong1081 - aLongArray1086[anInt1084]));

		if (anInt1079 < 25)
			anInt1079 = 25;

		if (anInt1079 > 256) {
			anInt1079 = 256;
			anInt1080 = (int) (var1 - ((aLong1081 - aLongArray1086[anInt1084]) / 10L));
		}

		if (anInt1080 > var1)
			anInt1080 = var1;

		aLongArray1086[anInt1084] = aLong1081;
		anInt1084 = (1 + anInt1084) % 10;
		int var6;
		if (anInt1080 > 1)
			for (var6 = 0; var6 < 10; ++var6)
				if (aLongArray1086[var6] != 0L)
					aLongArray1086[var6] += anInt1080;

		if (anInt1080 < var2)
			anInt1080 = var2;

		client.sleep(anInt1080);

		for (var6 = 0; anInt1082 < 256; anInt1082 += anInt1079)
			++var6;

		anInt1082 &= 255;
		return var6;
	}

	Class56_Sub2() {
		for (int var1 = 0; var1 < 10; ++var1)
			aLongArray1086[var1] = aLong1081;

	}

	public static boolean method607(final CacheArch var0, final CacheArch var1, final CacheArch var2,
			final Class124_Sub4_Sub3 var3) {
		Class96.aClass94_764 = var0;
		Class96.aClass94_765 = var1;
		Canvas_Sub1.aClass94_1610 = var2;
		Class77.aClass124_Sub4_Sub3_624 = var3;
		return true;
	}
}
