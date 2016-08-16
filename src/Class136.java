public class Class136 {
	public static Def5 method484(final int var0) {
		Def5 var1 = (Def5) Def5.aClass113_1454.forId(var0);
		if (null == var1) {
			final byte[] var2 = Def5.aClass94_1456.decode(5, var0);
			var1 = new Def5();
			if (var2 != null)
				var1.method704(new RSBuf(var2));

			Def5.aClass113_1454.map(var1, var0);
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
				Def6.aChar1394 = Class84.aCharArray678[Class84.anInt672];
				Class84.anInt672 = (1 + Class84.anInt672) & 127;
				return true;
			}
		}
	}
}
