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
	static Class124_Sub17[] aClass124_Sub17Array12;
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
			Class124_Sub22_Sub12.method734("Please enter your username.", "If you created your account after November",
					"2010, this will be the creation email address.");
		else {
			final long var0 = Class124_Sub22_Sub19_Sub1.method888(2020603528);
			byte var2;
			if (0L == var0)
				var2 = 5;
			else {
				final String var3 = Class4.aString44;
				final Random var4 = new Random();
				final Class124_Sub14 var5 = new Class124_Sub14(128);
				final Class124_Sub14 var6 = new Class124_Sub14(128);
				final int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
				var5.method545(10);

				int var8;
				for (var8 = 0; var8 < 4; ++var8)
					var5.method548(var4.nextInt());

				var5.method548(var7[0]);
				var5.method548(var7[1]);
				var5.method561(var0);
				var5.method561(0L);

				for (var8 = 0; var8 < 4; ++var8)
					var5.method548(var4.nextInt());

				var5.method552(Class43.aBigInteger428, Class43.aBigInteger429);
				var6.method545(10);

				for (var8 = 0; var8 < 3; ++var8)
					var6.method548(var4.nextInt());

				var6.method561(var4.nextLong());
				var6.method549(var4.nextLong());
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

				var6.method568(var9, 0, 24);
				var6.method561(var4.nextLong());
				var6.method552(Class43.aBigInteger428, Class43.aBigInteger429);
				var8 = Class54.method258(var3);
				if ((var8 % 8) != 0)
					var8 += 8 - (var8 % 8);

				final Class124_Sub14 var11 = new Class124_Sub14(var8);
				var11.method550(var3);
				var11.anInt1075 = var8;
				var11.method571(var7);
				Class124_Sub14 var13 = new Class124_Sub14(var6.anInt1075 + 5 + var5.anInt1075 + var11.anInt1075);
				var13.method545(2);
				var13.method545(var5.anInt1075);
				var13.method568(var5.aByteArray1073, 0, var5.anInt1075);
				var13.method545(var6.anInt1075);
				var13.method568(var6.aByteArray1073, 0, var6.anInt1075);
				var13.method592(var11.anInt1075);
				var13.method568(var11.aByteArray1073, 0, var11.anInt1075);
				final String var14 = Class68.method301(var13.aByteArray1073);

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
					var13 = new Class124_Sub14(new byte[1000]);

					while (true) {
						final int var19 = var18.read(var13.aByteArray1073, var13.anInt1075, 1000 - var13.anInt1075);
						if (var19 == -1) {
							var17.close();
							var18.close();
							String var21 = new String(var13.aByteArray1073);
							if (var21.startsWith("OFFLINE"))
								var20 = 4;
							else if (var21.startsWith("WRONG"))
								var20 = 7;
							else if (var21.startsWith("RELOAD"))
								var20 = 3;
							else if (var21.startsWith("Not permitted for social network accounts."))
								var20 = 6;
							else {
								var13.method572(var7);

								while ((var13.anInt1075 > 0) && (var13.aByteArray1073[var13.anInt1075 - 1] == 0))
									--var13.anInt1075;

								var21 = new String(var13.aByteArray1073, 0, var13.anInt1075);
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

						var13.anInt1075 += var19;
						if (var13.anInt1075 >= 1000) {
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
				Class124_Sub22_Sub12.method734("", "Page has opened in a new window.",
						"(Please check your popup blocker.)");
				Class4.anInt43 = 6;
				break;
			case 3:
				Class124_Sub22_Sub12.method734("", "Error connecting to server.", "");
				break;
			case 4:
				Class124_Sub22_Sub12.method734("The part of the website you are trying",
						"to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				Class124_Sub22_Sub12.method734("Sorry, there was an error trying to",
						"log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				Class124_Sub22_Sub12.method734("", "Error connecting to server.", "");
				break;
			case 7:
				Class124_Sub22_Sub12.method734("You must enter a valid login to proceed. For accounts",
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
