import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class22 {
	static Class124_Sub22_Sub19_Sub3_Sub2 aClass124_Sub22_Sub19_Sub3_Sub2_246;
	static int anInt251;
	static int anInt253;
	int anInt250 = 1;
	LinkedHashMap aLinkedHashMap252 = new LinkedHashMap();
	boolean aBool248;
	boolean aBool249;
	static int anInt247 = 4;

	public static void method147() {
		Def1.aClass113_1371.method436();
	}

	Class22(final RSBuf var1) {
		if ((var1 != null) && (null != var1.backing)) {
			final int var3 = var1.method558();
			if ((var3 >= 0) && (var3 <= anInt247)) {
				if (var1.method558() == 1)
					aBool248 = true;

				if (var3 > 1)
					aBool249 = var1.method558() == 1;

				if (var3 > 3)
					anInt250 = var1.method558();

				if (var3 > 2) {
					final int var5 = var1.method558();

					for (int var2 = 0; var2 < var5; ++var2) {
						final int var4 = var1.method562(124818784);
						final int var6 = var1.method562(727724141);
						aLinkedHashMap252.put(Integer.valueOf(var4), Integer.valueOf(var6));
					}
				}
			} else
				method151(true);
		} else
			method151(true);

	}

	RSBuf method148() {
		final RSBuf var1 = new RSBuf(100);
		var1.writeByte(anInt247);
		var1.writeByte(aBool248 ? 1 : 0);
		var1.writeByte(aBool249 ? 1 : 0);
		var1.writeByte(anInt250);
		var1.writeByte(aLinkedHashMap252.size());
		final Iterator var2 = aLinkedHashMap252.entrySet().iterator();

		while (var2.hasNext()) {
			final Entry var3 = (Entry) var2.next();
			var1.method548(((Integer) var3.getKey()).intValue());
			var1.method548(((Integer) var3.getValue()).intValue());
		}

		return var1;
	}

	public static Somet1 method149(final Class94 var0, final Class94 var1, final String var2,
			final String var3) {
		final int var4 = var0.method376(var2);
		final int var5 = var0.method383(var4, var3);
		Somet1 var6;
		if (Def3.loaded(var0, var4, var5))
			var6 = Def5.method707(var1.decode(var4, var5));
		else
			var6 = null;

		return var6;
	}

	static int method150(final int var0) {
		final Class124_Sub22_Sub5 var1 = (Class124_Sub22_Sub5) Class47.aClass116_474.method438(var0);
		return var1 != null ? (Class47.aClass119_469.aClass124_Sub22_847 != var1.aClass124_Sub22_1304
				? ((Class124_Sub22_Sub5) var1.aClass124_Sub22_1304).anInt1383 : -1) : -1;
	}

	Class22() {
		method151(true);
	}

	void method151(final boolean var1) {
	}
}
