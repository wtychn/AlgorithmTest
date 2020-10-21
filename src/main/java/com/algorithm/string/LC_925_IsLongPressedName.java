package com.algorithm.string;

public class LC_925_IsLongPressedName {
    public boolean isLongPressed(String name, String typed) {
        int nameIndex = 0, typedIndex = 0;
        while (typedIndex < typed.length()) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                typedIndex++;
                nameIndex++;
            } else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) {
                typedIndex++;
            } else {
                return false;
            }
        }
        return nameIndex == name.length();
    }
}
