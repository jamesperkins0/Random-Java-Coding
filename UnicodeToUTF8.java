public class UnicodeToUTF8 {
	public static void main(String[] args) {
		char c = 'f';
		int utf8 = 0;

		System.out.println(Integer.toBinaryString(c));

		utf8 = (0 == (c & 0xFF80) ? c
				: (0 == (c & 0xF800) ? ((((c >> 6) & 0x001F) << 8 | 0xC000))

				| (c & 0x003F) | 0x0080
						: (

						(c >> 12 & 0x0F | 0xE0) << 16 | (((c >> 6) & 0x003F) << 8 | 0x8000))
								| (c & 0x003F) | 0x0080));

		System.out.println(Integer.toBinaryString(utf8));

	}
}