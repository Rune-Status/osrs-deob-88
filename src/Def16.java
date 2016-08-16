public class Def16 extends JagMap {
	public static int anInt1372;
	public static CacheArch aClass94_1375;
	public int anInt1374 = 0;
	public static Class113 aClass113_1373 = new Class113(64);

	void method669(final RSBuf var1) {
		while (true) {
			final int var2 = var1.readByteU();
			if (var2 == 0)
				return;

			method670(var1, var2);
		}
	}

	void method670(final RSBuf var1, final int var2) {
		if (var2 == 5)
			anInt1374 = var1.readShortU();

	}

	public static boolean method671(final char var0) {
		return ((var0 >= 48) && (var0 <= 57)) || ((var0 >= 65) && (var0 <= 90)) || ((var0 >= 97) && (var0 <= 122));
	}

	public static boolean method672() {
		try {
			if (Class96.anInt770 == 2) {
				if (Class96.aClass124_Sub20_769 == null) {
					Class96.aClass124_Sub20_769 = Class124_Sub20.method634(Class96.aClass94_767, Class96.anInt768,
							Class105.anInt805);
					if (Class96.aClass124_Sub20_769 == null)
						return false;
				}

				if (null == ISAAC.aClass10_570)
					ISAAC.aClass10_570 = new Class10(Canvas_Sub1.aClass94_1610, Class96.aClass94_765);

				if (Class77.aClass124_Sub4_Sub3_624.method848(Class96.aClass124_Sub20_769, Class96.aClass94_764,
						ISAAC.aClass10_570, 22050)) {
					Class77.aClass124_Sub4_Sub3_624.method849();
					Class77.aClass124_Sub4_Sub3_624.method846(Class80.anInt644);
					Class77.aClass124_Sub4_Sub3_624.method850(Class96.aClass124_Sub20_769,
							Class124_Sub22_Sub19_Sub3_Sub1.aBool1938);
					Class96.anInt770 = 0;
					Class96.aClass124_Sub20_769 = null;
					ISAAC.aClass10_570 = null;
					Class96.aClass94_767 = null;
					return true;
				}
			}
		} catch (final Exception var1) {
			var1.printStackTrace();
			Class77.aClass124_Sub4_Sub3_624.method868();
			Class96.anInt770 = 0;
			Class96.aClass124_Sub20_769 = null;
			ISAAC.aClass10_570 = null;
			Class96.aClass94_767 = null;
		}

		return false;
	}
}
