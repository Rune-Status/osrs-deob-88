import java.io.DataInputStream;
import java.net.URL;

public final class Class28 {
	public static Class124_Sub22_Sub21 aClass124_Sub22_Sub21_311;
	boolean aBool307 = true;
	int anInt313;
	int anInt310;
	int anInt308;
	int anInt309;
	int anInt306;
	int anInt312;

	Class28(final int var1, final int var2, final int var3, final int var4, final int var5, final int var6,
			final boolean var7) {
		anInt313 = var1;
		anInt310 = var2;
		anInt308 = var3;
		anInt309 = var4;
		anInt306 = var5;
		anInt312 = var6;
		aBool307 = var7;
	}

	public static void method166(final String var0, final Throwable var1) {
		try {
			String var2 = "";
			if (var1 != null) {
				var1.printStackTrace();
				var2 = Class18.method86(var1);
			}

			if (null != var0) {
				if (null != var1)
					var2 = var2 + " | ";

				var2 = var2 + var0;
			}

			System.out.println("Error: " + var2);
			var2 = var2.replace('\u003a', '\u002e');
			var2 = var2.replace('\u0040', '\u005f');
			var2 = var2.replace('\u0026', '\u005f');
			var2 = var2.replace('\u0023', '\u005f');
			if (null == RuntimeException_Sub1.anApplet1915)
				return;

			/*final URL var3 = new URL(RuntimeException_Sub1.anApplet1915.getCodeBase(),
					"clienterror.ws?c=" + Class105.anInt804 + "&u=" + RuntimeException_Sub1.aString1911 + "&v1="
							+ Class101.aString788 + "&v2=" + Class82.aString670 + "&e=" + var2);
			final DataInputStream var4 = new DataInputStream(var3.openStream());
			var4.read();
			var4.close();*/
		} catch (final Exception var5) {
			var5.printStackTrace();
			;
		}

	}

	public static boolean method167(final int var0) {
		return ((var0 >> 28) & 1) != 0;
	}

	public static void method168() {
		Def14.aClass113_1509.method436();
	}
}
