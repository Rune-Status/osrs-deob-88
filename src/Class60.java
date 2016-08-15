import java.io.File;
import java.util.Hashtable;

public class Class60 {
	static int anInt541;
	static File aFile542;
	static String[] aStringArray544;
	static boolean aBool545 = false;
	static Hashtable aHashtable543 = new Hashtable(16);

	public static Class124_Sub22_Sub8 method272(final int var0) {
		Class124_Sub22_Sub8 var1 = (Class124_Sub22_Sub8) Class124_Sub22_Sub8.aClass113_1443.method434(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Class124_Sub22_Sub8.aClass94_1444.method377(8, var0);
			var1 = new Class124_Sub22_Sub8();
			if (null != var2)
				var1.method699(new Class124_Sub14(var2));

			Class124_Sub22_Sub8.aClass113_1443.method435(var1, var0);
			return var1;
		}
	}
}
