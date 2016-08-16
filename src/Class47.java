import java.util.HashMap;
import java.util.Map;

public class Class47 {
	static Class29 aClass29_467;
	static int anInt468;
	static Class124_Sub22_Sub16_Sub1 aClass124_Sub22_Sub16_Sub1_472;
	static Class66 aClass66_473;
	static Map aMap471 = new HashMap();
	static Class116 aClass116_474 = new Class116(1024);
	static Class119 aClass119_469 = new Class119();
	static int anInt470 = 0;

	static final void method230(final int var0, final int var1, final int var2, final int var3) {
		for (int var4 = 0; var4 < client.anInt2185; ++var4)
			if (((client.anIntArray2190[var4] + client.anIntArray2209[var4]) > var0)
					&& (client.anIntArray2190[var4] < (var0 + var2))
					&& ((client.anIntArray2223[var4] + client.anIntArray2222[var4]) > var1)
					&& (client.anIntArray2223[var4] < (var1 + var3)))
				client.aBoolArray2188[var4] = true;

	}

	public static void method231(final CacheArch var0, final CacheArch var1) {
		Def9.aClass94_1328 = var0;
		Class80.aClass94_646 = var1;
	}

	public static int method232(final CharSequence var0) {
		final int var1 = var0.length();
		int var3 = 0;

		for (int var2 = 0; var2 < var1; ++var2)
			var3 = ((var3 << 5) - var3) + var0.charAt(var2);

		return var3;
	}
}
