package com.lance.core.open.util;

import java.util.UUID;

public class UUIDGenerator {

    public static String getUuid() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }

}
