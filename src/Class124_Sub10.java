public class Class124_Sub10 extends Node {
	static int[] anIntArray1032;
	static int anInt1033;
	static Class107 aClass107_1034 = new Class107(32);
	int[] anIntArray1030 = new int[] { -1 };
	int[] anIntArray1031 = new int[] { 0 };

	static int method535(final int var0, final int var1) {
		final Class124_Sub10 var2 = (Class124_Sub10) aClass107_1034.method409(var0);
		if (null == var2)
			return 0;
		else if (var1 == -1)
			return 0;
		else {
			int var4 = 0;

			for (int var3 = 0; var3 < var2.anIntArray1031.length; ++var3)
				if (var2.anIntArray1030[var3] == var1)
					var4 += var2.anIntArray1031[var3];

			return var4;
		}
	}

	static final void method536(final int var0) {
		if (Class89.loadwidget(var0))
			Class51.method245(Class124_Sub22_Sub10.widgets[var0], -1);
	}
}
