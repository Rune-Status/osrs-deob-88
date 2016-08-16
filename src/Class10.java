public class Class10 {
	static int[] anIntArray104;
	static Class124_Sub22_Sub16_Sub2[] aClass124_Sub22_Sub16_Sub2Array109;
	Class107 aClass107_106 = new Class107(256);
	Class107 aClass107_108 = new Class107(256);
	CacheArch aClass94_107;
	CacheArch aClass94_105;

	public static Widget method55(final int var0) {
		try {
		final int var1 = var0 >> 16;
		final int var3 = var0 & '\uffff';
		if ((Class124_Sub22_Sub10.widgets[var1] == null)
				|| (null == Class124_Sub22_Sub10.widgets[var1][var3])) {
			final boolean var2 = Class89.loadwidget(var1);
			if (!var2)
				return null;
		}

		return Class124_Sub22_Sub10.widgets[var1][var3];
		} catch (Exception e) {
			System.err.println("bad interface");
			e.printStackTrace();
			return null;
		}
	}

	Class124_Sub2_Sub1 method56(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var6 = var4 ^ 4294967296L;
		Class124_Sub2_Sub1 var5 = (Class124_Sub2_Sub1) aClass107_108.method409(var6);
		if (var5 != null)
			return var5;
		else if ((null != var3) && (var3[0] <= 0))
			return null;
		else {
			Somet4 var8 = (Somet4) aClass107_106.method409(var6);
			if (null == var8) {
				var8 = Somet4.method499(aClass94_105, var1, var2);
				if (var8 == null)
					return null;

				aClass107_106.method412(var8, var6);
			}

			var5 = var8.method500(var3);
			if (var5 == null)
				return null;
			else {
				var8.method450();
				aClass107_108.method412(var5, var6);
				return var5;
			}
		}
	}

	public Class124_Sub2_Sub1 method57(final int var1, final int[] var2) {
		if (aClass94_107.method373() == 1)
			return method59(0, var1, var2);
		else if (aClass94_107.widgetLen(var1) == 1)
			return method59(var1, 0, var2);
		else
			throw new RuntimeException();
	}

	public Class124_Sub2_Sub1 method58(final int var1, final int[] var2) {
		if (aClass94_105.method373() != 1) {
			if (aClass94_105.widgetLen(var1) == 1)
				return method56(var1, 0, var2);
			else
				throw new RuntimeException();
		} else
			return method56(0, var1, var2);
	}

	public Class10(final CacheArch var1, final CacheArch var2) {
		aClass94_107 = var1;
		aClass94_105 = var2;
	}

	Class124_Sub2_Sub1 method59(final int var1, final int var2, final int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & '\uffff') | (var1 >>> 12));
		var4 |= var1 << 16;
		final long var7 = var4;
		Class124_Sub2_Sub1 var6 = (Class124_Sub2_Sub1) aClass107_108.method409(var7);
		if (null != var6)
			return var6;
		else if ((var3 != null) && (var3[0] <= 0))
			return null;
		else {
			final Class12 var5 = Class12.method68(aClass94_107, var1, var2);
			if (var5 == null)
				return null;
			else {
				var6 = var5.method69();
				aClass107_108.method412(var6, var7);
				if (var3 != null)
					var3[0] -= var6.aByteArray1586.length;

				return var6;
			}
		}
	}

	static final void method60() {
		if (client.anInt2034 <= 0) {
			Class124_Sub5.method516(40);
			Class124_Sub22_Sub19_Sub1.aClass78_1662 = Class73.aClass78_609;
			Class73.aClass78_609 = null;
		} else
			Class30.method174();
	}
}
