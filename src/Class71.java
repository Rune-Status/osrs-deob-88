public class Class71 {
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_591;
	public String aString588;
	public int anInt589;
	public static Class71 aClass71_590 = new Class71("LIVE_88", 0);
	public static Class71 aClass71_586 = new Class71("BUILDLIVE", 3);
	public static Class71 aClass71_587 = new Class71("RC", 1);
	public static Class71 aClass71_592 = new Class71("WIP", 2);

	Class71(final String var1, final int var2) {
		aString588 = var1;
		anInt589 = var2;
	}

	static final int method306(final int var0, final int var1) {
		int var2 = (57 * var1) + var0;
		var2 ^= var2 << 13;
		final int var3 = (1376312589 + ((789221 + (15731 * var2 * var2)) * var2)) & Integer.MAX_VALUE;
		return (var3 >> 19) & 255;
	}

	static void method307(final int var0, final Class69 var1, final Class94_Sub1 var2) {
		final Class124_Sub19 var3 = new Class124_Sub19();
		var3.anInt1295 = 1;
		var3.aLong874 = var0;
		var3.aClass69_1296 = var1;
		var3.aClass94_Sub1_1297 = var2;
		final Class111 var4 = Class99.aClass111_776;
		synchronized (var4) {
			Class99.aClass111_776.method424(var3);
		}

		final Object var9 = Class99.anObject774;
		synchronized (var9) {
			if (Class99.anInt773 == 0)
				Class27.aClass82_303.method334(new Class99(), 5);

			Class99.anInt773 = 600;
		}
	}

	public static void method308() {
		Def10.aClass113_1494.map();
		Def10.aClass113_1462.map();
		Def10.aClass113_1463.map();
	}
}
