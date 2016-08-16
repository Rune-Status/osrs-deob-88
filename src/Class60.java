import java.io.File;
import java.util.Hashtable;

public class Class60 {
	static int anInt541;
	static File aFile542;
	static String[] aStringArray544;
	static boolean aBool545 = false;
	static Hashtable aHashtable543 = new Hashtable(16);

	public static Def8 method272(final int var0) {
		Def8 var1 = (Def8) Def8.aClass113_1443.forId(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var2 = Def8.aClass94_1444.decode(8, var0);
			var1 = new Def8();
			if (null != var2)
				var1.method699(new RSBuf(var2));

			Def8.aClass113_1443.map(var1, var0);
			return var1;
		}
	}
}
