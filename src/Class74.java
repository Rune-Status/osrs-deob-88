public class Class74 implements Interface3 {
	public static Class74 aClass74_617 = new Class74(0, -1, true, false, true);
	public static Class74 aClass74_616 = new Class74(1, 0, true, true, true);
	public static Class74 aClass74_611 = new Class74(2, 1, true, true, false);
	public static Class74 aClass74_612 = new Class74(3, 2, false, false, true);
	public static Class74 aClass74_613 = new Class74(4, 3, false, false, true);
	int anInt610;
	public int anInt614;
	public boolean aBool618;
	public boolean aBool615;

	static final int method314(final int var0, final int var1, final int var2, final int var3) {
		final int var4 = (65536 - Class124_Sub22_Sub16_Sub3.anIntArray1848[(var2 * 1024) / var3]) >> 1;
		return ((var0 * (65536 - var4)) >> 16) + ((var4 * var1) >> 16);
	}

	@Override
	public int method11(final int var1) {
		return anInt610;
	}

	Class74(final int var1, final int var2, final boolean var3, final boolean var4, final boolean var5) {
		anInt610 = var1;
		anInt614 = var2;
		aBool618 = var4;
		aBool615 = var5;
	}

	public static int method315(final int var0, final byte var1) {
		final Def14 var2 = Class32.method185(var0);
		final int var5 = var2.anInt1510;
		final int var4 = var2.anInt1513;
		final int var3 = var2.anInt1511;
		final int var6 = Class91.anIntArray713[var3 - var4];
		return (Class91.anIntArray711[var5] >> var4) & var6;
	}

	public static synchronized long method316(final int var0) {
		final long var1 = System.currentTimeMillis();
		if (var1 < Class57.aLong536)
			Class57.aLong540 += Class57.aLong536 - var1;

		Class57.aLong536 = var1;
		return Class57.aLong540 + var1;
	}
}
