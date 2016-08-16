public class Class56_Sub1 extends Class56 {
	long aLong1077 = System.nanoTime();

	@Override
	void method266(final int var1) {
		aLong1077 = System.nanoTime();
	}

	@Override
	int method265(final int var1, final int var2, final int var3) {
		final long var4 = 1000000L * var2;
		long var6 = aLong1077 - System.nanoTime();
		if (var6 < var4)
			var6 = var4;

		client.sleep(var6 / 1000000L);
		final long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; (var10 < 10) && ((var10 < 1) || (aLong1077 < var8)); aLong1077 += var1 * 1000000L)
			++var10;

		if (aLong1077 < var8)
			aLong1077 = var8;

		return var10;
	}
}
