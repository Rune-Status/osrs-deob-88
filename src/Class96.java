import java.net.URL;

public class Class96 {
	static Class94 aClass94_764;
	static Class94 aClass94_765;
	public static int anInt766;
	public static Class94 aClass94_767;
	static int anInt768;
	public static Class124_Sub20 aClass124_Sub20_769;
	public static int anInt770 = 0;

	static boolean method387() {
		try {
			if (Class124_Sub22_Sub9.aClass45_1455 == null)
				Class124_Sub22_Sub9.aClass45_1455 = new Class45(Class27.aClass82_303, new URL(Class48.aString480));
			else {
				final byte[] var0 = Class124_Sub22_Sub9.aClass45_1455.method224((byte) 39);
				if (var0 != null) {
					final Class124_Sub14 var1 = new Class124_Sub14(var0);
					Class23.anInt257 = var1.method560();
					Class23.aClass23Array256 = new Class23[Class23.anInt257];

					Class23 var3;
					for (int var2 = 0; var2 < Class23.anInt257; var3.anInt265 = var2++) {
						var3 = Class23.aClass23Array256[var2] = new Class23();
						var3.anInt262 = var1.method560();
						var3.anInt255 = var1.method562(-1044953950);
						var3.aString254 = var1.method597();
						var3.aString263 = var1.method597();
						var3.anInt264 = var1.method558();
						var3.anInt261 = var1.method546();
					}

					Class40.method200(Class23.aClass23Array256, 0, Class23.aClass23Array256.length - 1,
							Class23.anIntArray259, Class23.anIntArray266);
					Class124_Sub22_Sub9.aClass45_1455 = null;
					return true;
				}
			}
		} catch (final Exception var4) {
			var4.printStackTrace();
			Class124_Sub22_Sub9.aClass45_1455 = null;
		}

		return false;
	}

	static Class method388(final String var0) throws ClassNotFoundException {
		return !var0.equals("B") ? (var0.equals("I") ? Integer.TYPE
				: (var0.equals("S") ? Short.TYPE
						: (var0.equals("J") ? Long.TYPE
								: (var0.equals("Z") ? Boolean.TYPE
										: (var0.equals("F") ? Float.TYPE
												: (var0.equals("D") ? Double.TYPE : (var0.equals("C") ? Character.TYPE
														: (var0.equals("void") ? Void.TYPE : Class.forName(var0)))))))))
				: Byte.TYPE;
	}
}