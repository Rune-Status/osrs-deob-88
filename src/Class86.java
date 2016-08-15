import java.util.Iterator;

public class Class86 {
	static String method340() {
		String var0 = "";

		Class124_Sub22_Sub5 var2;
		for (final Iterator var1 = Class47.aClass116_474.iterator(); var1
				.hasNext(); var0 = var0 + var2.aString1379 + '\u003a' + var2.aString1382 + '\n')
			var2 = (Class124_Sub22_Sub5) var1.next();

		return var0;
	}

	static void method341(final int var0, final int var1) {
		final long var2 = (var0 << 16) + var1;
		final Class124_Sub22_Sub21 var4 = (Class124_Sub22_Sub21) Class92.aClass107_728.method409(var2);
		if (null != var4)
			Class92.aClass108_722.method415(var4);
	}

	static final int method342(final int var0, int var1) {
		if (var0 != -2) {
			if (var0 != -1) {
				var1 = ((var0 & 127) * var1) / 128;
				if (var1 < 2)
					var1 = 2;
				else if (var1 > 126)
					var1 = 126;

				return (var0 & '\uff80') + var1;
			} else {
				if (var1 < 2)
					var1 = 2;
				else if (var1 > 126)
					var1 = 126;

				return var1;
			}
		} else
			return 12345678;
	}
}
