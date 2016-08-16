import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class134 {
	static int anInt906;
	public List aList909;
	public static Comparator aComparator907 = new Class128();
	public static Comparator aComparator908;
	public static Comparator aComparator910;
	public static Comparator aComparator911;

	public Class134(final RSBuf var1, final boolean var2) {
		final int var4 = var1.readShortU();
		final boolean var5 = var1.readByteU() == 1;
		byte var6;
		if (var5)
			var6 = 1;
		else
			var6 = 0;

		final int var7 = var1.readShortU();
		aList909 = new ArrayList(var7);

		for (int var3 = 0; var3 < var7; ++var3)
			aList909.add(new Class120(var1, var6, var4));

	}

	public void method483(final Comparator var1, final boolean var2) {
		if (var2)
			Collections.sort(aList909, var1);
		else
			Collections.sort(aList909, Collections.reverseOrder(var1));

	}

	static {
		new Class133();
		aComparator908 = new Class131();
		aComparator910 = new Class112();
		aComparator911 = new Class126();
	}
}
