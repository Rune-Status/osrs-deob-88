public class Class117 {
	static int anInt831;
	public int anInt842;
	String aString834;
	public static Class117 aClass117_840 = new Class117(7, 0, "", "");
	static Class117 aClass117_841 = new Class117(5, 1, "", "");
	static Class117 aClass117_833 = new Class117(3, 2, "", "");
	static Class117 aClass117_836 = new Class117(1, 3, "", "");
	static Class117 aClass117_835 = new Class117(4, 4, "", "");
	static Class117 aClass117_832 = new Class117(2, 5, "", "");
	static Class117 aClass117_837 = new Class117(0, 6, "", "");
	static Class117 aClass117_838 = new Class117(8, 7, "", "");
	public static Class117 aClass117_839;

	Class117(final int var1, final int var2, final String var3, final String var4) {
		anInt842 = var1;
		aString834 = var4;
	}

	Class117(final int var1, final int var2, final String var3, final String var4, final boolean var5,
			final Class117[] var6) {
		anInt842 = var1;
		aString834 = var4;
	}

	@Override
	public String toString() {
		return aString834;
	}

	static void method441(final int var0) {
		if (var0 == -3)
			Class124_Sub22_Sub12.method734("Connection timed out.", "Please try using a different world.", "");
		else if (var0 == -2)
			Class124_Sub22_Sub12.method734("", "Error connecting to server.", "");
		else if (var0 == -1)
			Class124_Sub22_Sub12.method734("No response from server.", "Please try using a different world.", "");
		else if (var0 == 3)
			Class124_Sub22_Sub12.method734("", "Invalid username/email or password.", "");
		else if (var0 == 4)
			Class124_Sub22_Sub12.method734("Your account has been disabled.",
					"Please check your message-centre for details.", "");
		else if (var0 == 5)
			Class124_Sub22_Sub12.method734("Your account is already logged in.", "Try again in 60 secs...", "");
		else if (var0 == 6)
			Class124_Sub22_Sub12.method734("RuneScape has been updated!", "Please reload this page.", "");
		else if (var0 == 7)
			Class124_Sub22_Sub12.method734("This world is full.", "Please use a different world.", "");
		else if (var0 == 8)
			Class124_Sub22_Sub12.method734("Unable to connect.", "Login server offline.", "");
		else if (var0 == 9)
			Class124_Sub22_Sub12.method734("Login limit exceeded.", "Too many connections from your address.", "");
		else if (var0 == 10)
			Class124_Sub22_Sub12.method734("Unable to connect.", "Bad session id.", "");
		else if (var0 == 11)
			Class124_Sub22_Sub12.method734("We suspect someone knows your password.",
					"Press \'change your password\' on front page.", "");
		else if (var0 == 12)
			Class124_Sub22_Sub12.method734("You need a members account to login to this world.",
					"Please subscribe, or use a different world.", "");
		else if (var0 == 13)
			Class124_Sub22_Sub12.method734("Could not complete login.", "Please try using a different world.", "");
		else if (var0 == 14)
			Class124_Sub22_Sub12.method734("The server is being updated.", "Please wait 1 minute and try again.", "");
		else if (var0 == 16)
			Class124_Sub22_Sub12.method734("Too many login attempts.", "Please wait a few minutes before trying again.",
					"");
		else if (var0 == 17)
			Class124_Sub22_Sub12.method734("You are standing in a members-only area.",
					"To play on this world move to a free area first", "");
		else if (var0 == 18)
			Class124_Sub22_Sub12.method734("Account locked as we suspect it has been stolen.",
					"Press \'recover a locked account\' on front page.", "");
		else if (var0 == 19)
			Class124_Sub22_Sub12.method734("This world is running a closed Beta.", "Sorry invited players only.",
					"Please use a different world.");
		else if (var0 == 20)
			Class124_Sub22_Sub12.method734("Invalid loginserver requested.", "Please try using a different world.", "");
		else if (var0 == 22)
			Class124_Sub22_Sub12.method734("Malformed login packet.", "Please try again.", "");
		else if (var0 == 23)
			Class124_Sub22_Sub12.method734("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		else if (var0 == 24)
			Class124_Sub22_Sub12.method734("Error loading your profile.", "Please contact customer support.", "");
		else if (var0 == 25)
			Class124_Sub22_Sub12.method734("Unexpected loginserver response.", "Please try using a different world.",
					"");
		else if (var0 == 26)
			Class124_Sub22_Sub12.method734("This computers address has been blocked",
					"as it was used to break our rules.", "");
		else if (var0 == 27)
			Class124_Sub22_Sub12.method734("", "Service unavailable.", "");
		else if (var0 == 31)
			Class124_Sub22_Sub12.method734("Your account must have a displayname set",
					"in order to play the game.  Please set it", "via the website, or the main game.");
		else if (var0 == 32)
			Class124_Sub22_Sub12.method734("Your attempt to log into your account was",
					"unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
		else if (var0 == 37)
			Class124_Sub22_Sub12.method734("Your account is currently inaccessible.",
					"Please try again in a few minutes.", "");
		else if (var0 == 38)
			Class124_Sub22_Sub12.method734("You need to vote to play!", "Visit runescape.com and vote,",
					"and then come back here!");
		else if (var0 == 55)
			Class124_Sub22_Sub12.method734("Sorry, but your account is not eligible to",
					"play this version of the game.  Please try", "playing the main game instead!");
		else {
			if (var0 == 56) {
				Class124_Sub22_Sub12.method734("Enter the 6-digit code generated by your", "authenticator app.", "");
				Class124_Sub5.method516(11);
				return;
			}

			if (var0 == 57) {
				Class124_Sub22_Sub12.method734("The code you entered was incorrect.", "Please try again.", "");
				Class124_Sub5.method516(11);
				return;
			}

			Class124_Sub22_Sub12.method734("Unexpected server response", "Please try using a different world.", "");
		}

		Class124_Sub5.method516(10);
	}

	static {
		aClass117_839 = new Class117(6, -1, "", "", true,
				new Class117[] { aClass117_840, aClass117_841, aClass117_833, aClass117_835, aClass117_836 });
	}
}
