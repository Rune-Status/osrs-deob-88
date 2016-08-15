public class Class50 {
	public static int method242(final CharSequence var0, final CharSequence var1, final int var2) {
		final int var3 = var0.length();
		final int var10 = var1.length();
		int var4 = 0;
		int var11 = 0;
		byte var7 = 0;
		byte var12 = 0;

		while (((var4 - var7) < var3) || ((var11 - var12) < var10)) {
			if ((var4 - var7) >= var3)
				return -1;

			if ((var11 - var12) >= var10)
				return 1;

			char var8;
			if (var7 != 0) {
				var8 = (char) var7;
			} else
				var8 = var0.charAt(var4++);

			char var9;
			if (var12 != 0) {
				var9 = (char) var12;
			} else
				var9 = var1.charAt(var11++);

			byte var5;
			if (var8 == 198)
				var5 = 69;
			else if (var8 == 230)
				var5 = 101;
			else if (var8 == 223)
				var5 = 115;
			else if (var8 == 338)
				var5 = 69;
			else if (var8 == 339)
				var5 = 101;
			else
				var5 = 0;

			var7 = var5;
			byte var6;
			if (var9 == 198)
				var6 = 69;
			else if (var9 == 230)
				var6 = 101;
			else if (var9 == 223)
				var6 = 115;
			else if (var9 != 338) {
				if (var9 == 339)
					var6 = 101;
				else
					var6 = 0;
			} else
				var6 = 69;

			var12 = var6;
			var8 = method244(var8);
			var9 = method244(var9);
			if ((var8 != var9) && (Character.toUpperCase(var8) != Character.toUpperCase(var9))) {
				var8 = Character.toLowerCase(var8);
				var9 = Character.toLowerCase(var9);
				if (var9 != var8)
					return Class124_Sub13.method543(var8) - Class124_Sub13.method543(var9);
			}
		}

		final int var18 = Math.min(var3, var10);

		char var17;
		int var19;
		for (var19 = 0; var19 < var18; ++var19) {
			char var14 = var0.charAt(var19);
			var17 = var1.charAt(var19);
			if ((var17 != var14) && (Character.toUpperCase(var14) != Character.toUpperCase(var17))) {
				var14 = Character.toLowerCase(var14);
				var17 = Character.toLowerCase(var17);
				if (var17 != var14)
					return Class124_Sub13.method543(var14) - Class124_Sub13.method543(var17);
			}
		}

		var19 = var3 - var10;
		if (var19 != 0)
			return var19;
		else {
			for (int var16 = 0; var16 < var18; ++var16) {
				var17 = var0.charAt(var16);
				final char var13 = var1.charAt(var16);
				if (var13 != var17)
					return Class124_Sub13.method543(var17) - Class124_Sub13.method543(var13);
			}

			return 0;
		}
	}

	static final void method243() {
		for (Class124_Sub11 var0 = (Class124_Sub11) client.aClass111_2262
				.method428(); var0 != null; var0 = (Class124_Sub11) client.aClass111_2262.method430()) {
			if (var0.anInt1050 > 0)
				--var0.anInt1050;

			if (var0.anInt1050 == 0) {
				if ((var0.anInt1038 < 0) || Class124_Sub22_Sub19_Sub5.method958(var0.anInt1038, var0.anInt1040)) {
					Class56.method264(var0.anInt1048, var0.anInt1035, var0.anInt1036, var0.anInt1037, var0.anInt1038,
							var0.anInt1039, var0.anInt1040);
					var0.method450();
				}
			} else {
				if (var0.anInt1044 > 0)
					--var0.anInt1044;

				if ((var0.anInt1044 == 0) && (var0.anInt1036 >= 1) && (var0.anInt1037 >= 1) && (var0.anInt1036 <= 102)
						&& (var0.anInt1037 <= 102) && ((var0.anInt1049 < 0)
								|| Class124_Sub22_Sub19_Sub5.method958(var0.anInt1049, var0.anInt1043))) {
					Class56.method264(var0.anInt1048, var0.anInt1035, var0.anInt1036, var0.anInt1037, var0.anInt1049,
							var0.anInt1042, var0.anInt1043);
					var0.anInt1044 = -1;
					if ((var0.anInt1038 == var0.anInt1049) && (var0.anInt1038 == -1))
						var0.method450();
					else if ((var0.anInt1049 == var0.anInt1038) && (var0.anInt1039 == var0.anInt1042)
							&& (var0.anInt1040 == var0.anInt1043))
						var0.method450();
				}
			}
		}

	}

	static char method244(final char var0) {
		if ((var0 >= 192) && (var0 <= 255)) {
			if ((var0 >= 192) && (var0 <= 198))
				return '\u0041';

			if (var0 == 199)
				return '\u0043';

			if ((var0 >= 200) && (var0 <= 203))
				return '\u0045';

			if ((var0 >= 204) && (var0 <= 207))
				return '\u0049';

			if ((var0 >= 210) && (var0 <= 214))
				return '\u004f';

			if ((var0 >= 217) && (var0 <= 220))
				return '\u0055';

			if (var0 == 221)
				return '\u0059';

			if (var0 == 223)
				return '\u0073';

			if ((var0 >= 224) && (var0 <= 230))
				return '\u0061';

			if (var0 == 231)
				return '\u0063';

			if ((var0 >= 232) && (var0 <= 235))
				return '\u0065';

			if ((var0 >= 236) && (var0 <= 239))
				return '\u0069';

			if ((var0 >= 242) && (var0 <= 246))
				return '\u006f';

			if ((var0 >= 249) && (var0 <= 252))
				return '\u0075';

			if ((var0 == 253) || (var0 == 255))
				return '\u0079';
		}

		if (var0 == 338)
			return '\u004f';
		else if (var0 == 339)
			return '\u006f';
		else if (var0 == 376)
			return '\u0059';
		else
			return var0;
	}
}
