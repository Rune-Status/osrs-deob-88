import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Random;

public class Class2 {
	static Widget[] aClass124_Sub17Array12;
	static int anInt14;
	static int[] anIntArray6 = new int[5];
	static int[][] anIntArrayArray7 = new int[5][5000];
	static int[] anIntArray8 = new int[1000];
	static String[] aStringArray5 = new String[1000];
	static int anInt10 = 0;
	static Class48[] aClass48Array11 = new Class48[50];
	static Calendar aCalendar9 = Calendar.getInstance();
	static String[] aStringArray13 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
			"Oct", "Nov", "Dec" };
	static int anInt15 = 0;

	static void method18() {
		Class4.aString44 = Class4.aString44.trim();
		if (Class4.aString44.length() == 0)
			Def13.method734("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		else {
			final long var0 = Class124_Sub22_Sub19_Sub1.method888(2020603528);
			byte var2;
			if (0L == var0)
				var2 = 5;
			else {
				final String var3 = Class4.aString44;
				final Random var4 = new Random();
				final RSBuf var5 = new RSBuf(128);
				final RSBuf var6 = new RSBuf(128);
				final int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
				var5.writeByte(10);

				int var8;
				for (var8 = 0; var8 < 4; ++var8)
					var5.writeInt(var4.nextInt());

				var5.writeInt(var7[0]);
				var5.writeInt(var7[1]);
				var5.writeULong(var0);
				var5.writeULong(0L);

				for (var8 = 0; var8 < 4; ++var8)
					var5.writeInt(var4.nextInt());

				var5.dorsa(Class43.aBigInteger428, Class43.aBigInteger429);
				var6.writeByte(10);

				for (var8 = 0; var8 < 3; ++var8)
					var6.writeInt(var4.nextInt());

				var6.writeULong(var4.nextLong());
				var6.writeMidint(var4.nextLong());
				final byte[] var9 = new byte[24];

				try {
					Class73.aClass132_600.method474(0L);
					Class73.aClass132_600.method476(var9);

					int var10;
					for (var10 = 0; (var10 < 24) && (var9[var10] == 0); ++var10)
						;

					if (var10 >= 24)
						throw new IOException();
				} catch (final Exception var25) {
					for (int var12 = 0; var12 < 24; ++var12)
						var9[var12] = -1;
				}

				var6.writeReverse(var9, 0, 24);
				var6.writeULong(var4.nextLong());
				var6.dorsa(Class43.aBigInteger428, Class43.aBigInteger429);
				var8 = Class54.method258(var3);
				if ((var8 % 8) != 0)
					var8 += 8 - (var8 % 8);

				final RSBuf var11 = new RSBuf(var8);
				var11.writestr(var3);
				var11.pos = var8;
				var11.xtea(var7);
				RSBuf var13 = new RSBuf(var6.pos + 5 + var5.pos + var11.pos);
				var13.writeByte(2);
				var13.writeByte(var5.pos);
				var13.writeReverse(var5.backing, 0, var5.pos);
				var13.writeByte(var6.pos);
				var13.writeReverse(var6.backing, 0, var6.pos);
				var13.writeShort(var11.pos);
				var13.writeReverse(var11.backing, 0, var11.pos);
				final String var14 = Class68.method301(var13.backing);

				byte var20;
				try {
					final URL var15 = new URL(Class5.method28("services", false) + "m=accountappeal/login.ws");
					final URLConnection var16 = var15.openConnection();
					var16.setDoInput(true);
					var16.setDoOutput(true);
					var16.setConnectTimeout(5000);
					final OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
					var17.write(
							"data2=" + Class66.method291(var14) + "&dest=" + Class66.method291("passwordchoice.ws"));
					var17.flush();
					final InputStream var18 = var16.getInputStream();
					var13 = new RSBuf(new byte[1000]);

					while (true) {
						final int var19 = var18.read(var13.backing, var13.pos, 1000 - var13.pos);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var21 = new String(var13.backing);
							if (var21.startsWith("OFFLINE"))
								var20 = 4;
							else if (var21.startsWith("WRONG"))
								var20 = 7;
							else if (var21.startsWith("RELOAD"))
								var20 = 3;
							else if (var21.startsWith("Not permitted for social network accounts."))
								var20 = 6;
							else {
								var13.xtea2(var7);

								while ((var13.pos > 0) && (var13.backing[var13.pos - 1] == 0))
									--var13.pos;

								var21 = new String(var13.backing, 0, var13.pos);
								if (!Class55.method259(var21))
									var20 = 5;
								else {
									label100: {
										if (Desktop.isDesktopSupported()
												&& Desktop.getDesktop().isSupported(Action.BROWSE))
											try {
												Desktop.getDesktop().browse(new URI(var21));
												break label100;
											} catch (final Exception var23) {
												;
											}

										if (Class87.aString690.startsWith("win"))
											Class124_Sub22_Sub19_Sub6.method965(var21, 0, "openjs");
										else if (Class87.aString690.startsWith("mac"))
											Class124_Sub22_Sub19_Sub6.method965(var21, 1, "openjs");
										else
											Class124_Sub22_Sub19_Sub6.method965(var21, 2, "openjs");
									}

									var20 = 2;
								}
							}
							break;
						}

						var13.pos += var19;
						if (var13.pos >= 1000) {
							var20 = 5;
							break;
						}
					}
				} catch (final Throwable var24) {
					var24.printStackTrace();
					var20 = 5;
				}

				var2 = var20;
			}

			switch (var2) {
			case 2:
				Def13.method734("", "Page has opened in a new window.",
						"(Please check your popup blocker.)");
				Class4.anInt43 = 6;
				break;
			case 3:
				Def13.method734("", "Error connecting to server.", "");
				break;
			case 4:
				Def13.method734("The part of the website you are trying",
						"to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				Def13.method734("Sorry, there was an error trying to",
						"log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				Def13.method734("", "Error connecting to server.", "");
				break;
			case 7:
				Def13.method734("You must enter a valid login to proceed. For accounts",
						"created after 24th November 2010, please use your",
						"email address. Otherwise please use your username.");
			}

		}
	}

	public static void method19(final Class94 var0, final int var1, final int var2, final int var3,
			final boolean var4) {
		Class96.anInt770 = 1;
		Class96.aClass94_767 = var0;
		Class96.anInt768 = var1;
		Class105.anInt805 = var2;
		Class80.anInt644 = var3;
		Class124_Sub22_Sub19_Sub3_Sub1.aBool1938 = var4;
		Class96.anInt766 = 10000;
	}
}
