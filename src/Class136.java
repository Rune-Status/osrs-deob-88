public class Class136 {
	public static Class124_Sub22_Sub9 method484(final int var0) {
		Class124_Sub22_Sub9 var1 = (Class124_Sub22_Sub9) Class124_Sub22_Sub9.aClass113_1454.method434(var0);
		if (null == var1) {
			final byte[] var2 = Class124_Sub22_Sub9.aClass94_1456.method377(5, var0);
			var1 = new Class124_Sub22_Sub9();
			if (var2 != null)
				var1.method704(new Class124_Sub14(var2));

			Class124_Sub22_Sub9.aClass113_1454.method435(var1, var0);
			return var1;
		} else
			return var1;
	}

	public static final boolean method485() {
		final Class84 var0 = Class84.aClass84_683;
		synchronized (var0) {
			if (Class84.anInt672 == Class84.anInt684)
				return false;
			else {
				Class124_Sub13.anInt1072 = Class84.anIntArray679[Class84.anInt672];
				Class124_Sub22_Sub6.aChar1394 = Class84.aCharArray678[Class84.anInt672];
				Class84.anInt672 = (1 + Class84.anInt672) & 127;
				return true;
			}
		}
	}
}
