import java.awt.Component;

public abstract class Class66 {
	static Class94_Sub1 aClass94_Sub1_562;

	public abstract void method290(Component var1, byte var2);

	public static String method291(final CharSequence var0) {
		final int var1 = var0.length();
		final StringBuilder var4 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			final char var2 = var0.charAt(var3);
			if (((var2 < 97) || (var2 > 122)) && ((var2 < 65) || (var2 > 90)) && ((var2 < 48) || (var2 > 57))
					&& (var2 != 46) && (var2 != 45) && (var2 != 42) && (var2 != 95)) {
				if (var2 == 32)
					var4.append('\u002b');
				else {
					final byte var6 = Class18.method88(var2);
					var4.append('\u0025');
					int var5 = (var6 >> 4) & 15;
					if (var5 >= 10)
						var4.append((char) (var5 + 55));
					else
						var4.append((char) (var5 + 48));

					var5 = var6 & 15;
					if (var5 >= 10)
						var4.append((char) (var5 + 55));
					else
						var4.append((char) (var5 + 48));
				}
			} else
				var4.append(var2);
		}

		return var4.toString();
	}

	public abstract int method292(int var1);

	public abstract void method293(Component var1, byte var2);

	static final void method294() {
		int var0 = 64 + (Class22.anInt251 * 128);
		int var2 = 64 + (CSD.anInt992 * 128);
		int var1 = Class63.method285(var0, var2, Class134.anInt906) - Class64.anInt560;
		if (Class45.anInt445 < var0) {
			Class45.anInt445 += Class27.anInt305 + (((var0 - Class45.anInt445) * Class47.anInt468) / 1000);
			if (Class45.anInt445 > var0)
				Class45.anInt445 = var0;
		}

		if (Class45.anInt445 > var0) {
			Class45.anInt445 -= (((Class45.anInt445 - var0) * Class47.anInt468) / 1000) + Class27.anInt305;
			if (Class45.anInt445 < var0)
				Class45.anInt445 = var0;
		}

		if (Class2.anInt14 < var1) {
			Class2.anInt14 += (((var1 - Class2.anInt14) * Class47.anInt468) / 1000) + Class27.anInt305;
			if (Class2.anInt14 > var1)
				Class2.anInt14 = var1;
		}

		if (Class2.anInt14 > var1) {
			Class2.anInt14 -= Class27.anInt305 + ((Class47.anInt468 * (Class2.anInt14 - var1)) / 1000);
			if (Class2.anInt14 < var1)
				Class2.anInt14 = var1;
		}

		if (Class48.anInt479 < var2) {
			Class48.anInt479 += Class27.anInt305 + (((var2 - Class48.anInt479) * Class47.anInt468) / 1000);
			if (Class48.anInt479 > var2)
				Class48.anInt479 = var2;
		}

		if (Class48.anInt479 > var2) {
			Class48.anInt479 -= Class27.anInt305 + (((Class48.anInt479 - var2) * Class47.anInt468) / 1000);
			if (Class48.anInt479 < var2)
				Class48.anInt479 = var2;
		}

		var0 = (Class73.anInt608 * 128) + 64;
		var2 = 64 + (Class124_Sub11.anInt1045 * 128);
		var1 = Class63.method285(var0, var2, Class134.anInt906) - Class124_Sub11.anInt1041;
		final int var6 = var0 - Class45.anInt445;
		final int var8 = var1 - Class2.anInt14;
		final int var5 = var2 - Class48.anInt479;
		final int var7 = (int) Math.sqrt((var5 * var5) + (var6 * var6));
		int var3 = (int) (Math.atan2(var8, var7) * 325.949D) & 2047;
		final int var10 = (int) (Math.atan2(var6, var5) * -325.949D) & 2047;
		if (var3 < 128)
			var3 = 128;

		if (var3 > 383)
			var3 = 383;

		if (CSD.anInt1003 < var3) {
			CSD.anInt1003 += ((Class49.anInt482 * (var3 - CSD.anInt1003)) / 1000)
					+ Class70.anInt583;
			if (CSD.anInt1003 > var3)
				CSD.anInt1003 = var3;
		}

		if (CSD.anInt1003 > var3) {
			CSD.anInt1003 -= Class70.anInt583
					+ ((Class49.anInt482 * (CSD.anInt1003 - var3)) / 1000);
			if (CSD.anInt1003 < var3)
				CSD.anInt1003 = var3;
		}

		int var9 = var10 - Class27.anInt301;
		if (var9 > 1024)
			var9 -= 2048;

		if (var9 < -1024)
			var9 += 2048;

		if (var9 > 0) {
			Class27.anInt301 += Class70.anInt583 + ((Class49.anInt482 * var9) / 1000);
			Class27.anInt301 &= 2047;
		}

		if (var9 < 0) {
			Class27.anInt301 -= Class70.anInt583 + ((Class49.anInt482 * -var9) / 1000);
			Class27.anInt301 &= 2047;
		}

		int var4 = var10 - Class27.anInt301;
		if (var4 > 1024)
			var4 -= 2048;

		if (var4 < -1024)
			var4 += 2048;

		if (((var4 < 0) && (var9 > 0)) || ((var4 > 0) && (var9 < 0)))
			Class27.anInt301 = var10;

	}
}
