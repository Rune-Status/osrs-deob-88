import java.util.Iterator;

public class Class118 implements Iterator {
	Class124 aClass124_843;
	int anInt844;
	Class124 aClass124_845 = null;
	Class116 aClass116_846;

	void method442() {
		aClass124_843 = aClass116_846.aClass124Array828[0].aClass124_875;
		anInt844 = 1;
		aClass124_845 = null;
	}

	@Override
	public Object next() {
		Class124 var1;
		if (aClass124_843 != aClass116_846.aClass124Array828[anInt844 - 1]) {
			var1 = aClass124_843;
			aClass124_843 = var1.aClass124_875;
			aClass124_845 = var1;
			return var1;
		} else {
			do {
				if (anInt844 >= aClass116_846.anInt830)
					return null;

				var1 = aClass116_846.aClass124Array828[anInt844++].aClass124_875;
			} while (var1 == aClass116_846.aClass124Array828[anInt844 - 1]);

			aClass124_843 = var1.aClass124_875;
			aClass124_845 = var1;
			return var1;
		}
	}

	Class118(final Class116 var1) {
		aClass116_846 = var1;
		method442();
	}

	@Override
	public void remove() {
		aClass124_845.method450();
		aClass124_845 = null;
	}

	@Override
	public boolean hasNext() {
		if (aClass124_843 != aClass116_846.aClass124Array828[anInt844 - 1])
			return true;
		else {
			while (anInt844 < aClass116_846.anInt830) {
				if (aClass116_846.aClass124Array828[anInt844++].aClass124_875 != aClass116_846.aClass124Array828[anInt844
						- 1]) {
					aClass124_843 = aClass116_846.aClass124Array828[anInt844 - 1].aClass124_875;
					return true;
				}

				aClass124_843 = aClass116_846.aClass124Array828[anInt844 - 1];
			}

			return false;
		}
	}
}
