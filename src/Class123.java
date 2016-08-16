import java.util.Iterator;

public class Class123 implements Iterator {
	Node2 aClass124_Sub22_873 = null;
	Class119 aClass119_872;
	Node2 aClass124_Sub22_871;

	Class123(final Class119 var1) {
		aClass119_872 = var1;
		aClass124_Sub22_871 = aClass119_872.aClass124_Sub22_847.aClass124_Sub22_1303;
		aClass124_Sub22_873 = null;
	}

	@Override
	public boolean hasNext() {
		return aClass124_Sub22_871 != aClass119_872.aClass124_Sub22_847;
	}

	@Override
	public void remove() {
		if (aClass124_Sub22_873 == null)
			throw new IllegalStateException();
		else {
			aClass124_Sub22_873.method637();
			aClass124_Sub22_873 = null;
		}
	}

	@Override
	public Object next() {
		Node2 var1 = aClass124_Sub22_871;
		if (var1 == aClass119_872.aClass124_Sub22_847) {
			var1 = null;
			aClass124_Sub22_871 = null;
		} else
			aClass124_Sub22_871 = var1.aClass124_Sub22_1303;

		aClass124_Sub22_873 = var1;
		return var1;
	}
}
