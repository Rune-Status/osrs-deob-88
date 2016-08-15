public class Class124_Sub4_Sub4 extends Class124_Sub4 {
	Class111 aClass111_1640 = new Class111();
	Class124_Sub4_Sub2 aClass124_Sub4_Sub2_1641 = new Class124_Sub4_Sub2();
	Class124_Sub4_Sub3 aClass124_Sub4_Sub3_1639;

	@Override
	protected void method506(final int var1) {
		aClass124_Sub4_Sub2_1641.method506(var1);

		for (Class124_Sub16 var2 = (Class124_Sub16) aClass111_1640
				.method428(); null != var2; var2 = (Class124_Sub16) aClass111_1640.method430())
			if (!aClass124_Sub4_Sub3_1639.method866(var2)) {
				int var3 = var1;

				do {
					if (var3 <= var2.anInt1143) {
						method878(var2, var3);
						var2.anInt1143 -= var3;
						break;
					}

					method878(var2, var2.anInt1143);
					var3 -= var2.anInt1143;
				} while (!aClass124_Sub4_Sub3_1639.method876(var2, (int[]) null, 0, var3));
			}

	}

	@Override
	protected Class124_Sub4 method505() {
		final Class124_Sub16 var1 = (Class124_Sub16) aClass111_1640.method428();
		return var1 == null ? null
				: (var1.aClass124_Sub4_Sub1_1140 == null ? method509() : var1.aClass124_Sub4_Sub1_1140);
	}

	@Override
	protected Class124_Sub4 method509() {
		while (true) {
			final Class124_Sub16 var1 = (Class124_Sub16) aClass111_1640.method430();
			if (var1 != null) {
				if (null == var1.aClass124_Sub4_Sub1_1140)
					continue;

				return var1.aClass124_Sub4_Sub1_1140;
			}

			return null;
		}
	}

	@Override
	protected int method507() {
		return 0;
	}

	@Override
	protected void method511(final int[] var1, final int var2, final int var3) {
		aClass124_Sub4_Sub2_1641.method511(var1, var2, var3);

		for (Class124_Sub16 var5 = (Class124_Sub16) aClass111_1640
				.method428(); var5 != null; var5 = (Class124_Sub16) aClass111_1640.method430())
			if (!aClass124_Sub4_Sub3_1639.method866(var5)) {
				int var6 = var2;
				int var4 = var3;

				do {
					if (var4 <= var5.anInt1143) {
						method879(var5, var1, var6, var4, var6 + var4);
						var5.anInt1143 -= var4;
						break;
					}

					method879(var5, var1, var6, var5.anInt1143, var4 + var6);
					var6 += var5.anInt1143;
					var4 -= var5.anInt1143;
				} while (!aClass124_Sub4_Sub3_1639.method876(var5, var1, var6, var4));
			}

	}

	void method878(final Class124_Sub16 var1, int var2) {
		if (((aClass124_Sub4_Sub3_1639.anIntArray1624[var1.anInt1136] & 4) != 0) && (var1.anInt1127 < 0)) {
			final int var3 = aClass124_Sub4_Sub3_1639.anIntArray1629[var1.anInt1136] / Class8.anInt94;
			final int var4 = ((1048575 + var3) - var1.anInt1142) / var3;
			var1.anInt1142 = (var1.anInt1142 + (var3 * var2)) & 1048575;
			if (var4 <= var2) {
				if (aClass124_Sub4_Sub3_1639.anIntArray1627[var1.anInt1136] == 0)
					var1.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var1.aClass124_Sub2_Sub1_1124,
							var1.aClass124_Sub4_Sub1_1140.method796(), var1.aClass124_Sub4_Sub1_1140.method787(),
							var1.aClass124_Sub4_Sub1_1140.method788());
				else {
					var1.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var1.aClass124_Sub2_Sub1_1124,
							var1.aClass124_Sub4_Sub1_1140.method796(), 0, var1.aClass124_Sub4_Sub1_1140.method788());
					aClass124_Sub4_Sub3_1639.method875(var1,
							var1.aClass124_Sub18_1123.aShortArray1290[var1.anInt1125] < 0);
				}

				if (var1.aClass124_Sub18_1123.aShortArray1290[var1.anInt1125] < 0)
					var1.aClass124_Sub4_Sub1_1140.method812(-1);

				var2 = var1.anInt1142 / var3;
			}
		}

		var1.aClass124_Sub4_Sub1_1140.method506(var2);
	}

	void method879(final Class124_Sub16 var1, final int[] var2, int var3, int var4, final int var5) {
		if (((aClass124_Sub4_Sub3_1639.anIntArray1624[var1.anInt1136] & 4) != 0) && (var1.anInt1127 < 0)) {
			final int var6 = aClass124_Sub4_Sub3_1639.anIntArray1629[var1.anInt1136] / Class8.anInt94;

			while (true) {
				final int var7 = ((var6 + 1048575) - var1.anInt1142) / var6;
				if (var7 > var4) {
					var1.anInt1142 += var6 * var4;
					break;
				}

				var1.aClass124_Sub4_Sub1_1140.method511(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.anInt1142 += (var6 * var7) - 1048576;
				int var9 = Class8.anInt94 / 100;
				final int var8 = 262144 / var6;
				if (var8 < var9)
					var9 = var8;

				final Class124_Sub4_Sub1 var10 = var1.aClass124_Sub4_Sub1_1140;
				if (aClass124_Sub4_Sub3_1639.anIntArray1627[var1.anInt1136] == 0)
					var1.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var1.aClass124_Sub2_Sub1_1124,
							var10.method796(), var10.method787(), var10.method788());
				else {
					var1.aClass124_Sub4_Sub1_1140 = Class124_Sub4_Sub1.method783(var1.aClass124_Sub2_Sub1_1124,
							var10.method796(), 0, var10.method788());
					aClass124_Sub4_Sub3_1639.method875(var1,
							var1.aClass124_Sub18_1123.aShortArray1290[var1.anInt1125] < 0);
					var1.aClass124_Sub4_Sub1_1140.method792(var9, var10.method787());
				}

				if (var1.aClass124_Sub18_1123.aShortArray1290[var1.anInt1125] < 0)
					var1.aClass124_Sub4_Sub1_1140.method812(-1);

				var10.method794(var9);
				var10.method511(var2, var3, var5 - var3);
				if (var10.method814())
					aClass124_Sub4_Sub2_1641.method828(var10);
			}
		}

		var1.aClass124_Sub4_Sub1_1140.method511(var2, var3, var4);
	}

	static final void method880(final int var0, final int var1, final int var2, final int var3, final int var4,
			final int var5, final int var6, final int var7, final int var8) {
		Class124_Sub11 var9 = null;

		for (Class124_Sub11 var10 = (Class124_Sub11) client.aClass111_2262
				.method428(); var10 != null; var10 = (Class124_Sub11) client.aClass111_2262.method430())
			if ((var10.anInt1048 == var0) && (var1 == var10.anInt1036) && (var10.anInt1037 == var2)
					&& (var10.anInt1035 == var3)) {
				var9 = var10;
				break;
			}

		if (null == var9) {
			var9 = new Class124_Sub11();
			var9.anInt1048 = var0;
			var9.anInt1035 = var3;
			var9.anInt1036 = var1;
			var9.anInt1037 = var2;
			Class124_Sub22_Sub19_Sub3.method891(var9);
			client.aClass111_2262.method424(var9);
		}

		var9.anInt1049 = var4;
		var9.anInt1043 = var5;
		var9.anInt1042 = var6;
		var9.anInt1044 = var7;
		var9.anInt1050 = var8;
	}

	Class124_Sub4_Sub4(final Class124_Sub4_Sub3 var1) {
		aClass124_Sub4_Sub3_1639 = var1;
	}
}
