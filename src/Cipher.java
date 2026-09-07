public class Cipher {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
            'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public String encrypt(String line, int key) {
        char[] charArray = line.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (Character.toLowerCase(charArray[i]) == ALPHABET[j]) {
                    charArray[i] = encryptChar(key, charArray[i], j);
                    break;
                }
            }
        }

        return new String(charArray);
    }

    private static char encryptChar(int key, char character, int index) {
        char encryptedChar = ALPHABET[(index + key)  % ALPHABET.length];

        if (Character.isUpperCase(character)) {
            encryptedChar = Character.toUpperCase(encryptedChar);
        }

        return encryptedChar;
    }

    public String decrypt(String encryptedText, int key) {
        return null;
    }
}